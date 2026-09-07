package com.tencent.mm.storage;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import com.tencent.mars.xlog.Log;
import com.tencent.mm.autogen.events.ReceiveMsgEvent;
import com.tencent.mm.autogen.events.SendMsgFailEvent;
import com.tencent.mm.autogen.events.SendMsgSuccessEvent;
import f35.be;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes10.dex */
public class f9 extends ms0.m1 implements Cloneable {

    /* renamed from: n2, reason: collision with root package name */
    public static final /* synthetic */ int f177527n2 = 0;

    /* renamed from: d2, reason: collision with root package name */
    public z8 f177529d2;

    /* renamed from: e2, reason: collision with root package name */
    public d9 f177530e2;

    /* renamed from: i2, reason: collision with root package name */
    public String f177534i2;

    /* renamed from: k2, reason: collision with root package name */
    public String f177536k2;

    /* renamed from: c2, reason: collision with root package name */
    public a9 f177528c2 = null;

    /* renamed from: f2, reason: collision with root package name */
    public be f177531f2 = null;

    /* renamed from: g2, reason: collision with root package name */
    public boolean f177532g2 = false;

    /* renamed from: h2, reason: collision with root package name */
    public long f177533h2 = -1;

    /* renamed from: j2, reason: collision with root package name */
    public String f177535j2 = "";

    /* renamed from: l2, reason: collision with root package name */
    public String f177537l2 = "";

    /* renamed from: m2, reason: collision with root package name */
    public int f177538m2 = 0;

    public f9() {
    }

    public static void N1(long j17) {
        aw5.a.g("msgId: " + j17 + " not in the reasonable scope", 1500000001 > j17 && -10 < j17);
    }

    public static f9 P1(f9 f9Var) {
        if (f9Var == null) {
            return null;
        }
        f9 f9Var2 = new f9();
        f9Var2.setMsgId(f9Var.getMsgId());
        f9Var2.n1(f9Var.K0());
        f9Var2.setType(super.getType());
        f9Var2.t1(f9Var.O0());
        f9Var2.j1(f9Var.F0());
        f9Var2.d1(f9Var.getCreateTime());
        f9Var2.u1(f9Var.P0());
        f9Var2.c1(super.j());
        super.i1(f9Var.E0());
        f9Var2.o1(f9Var.L0());
        f9Var2.k1(f9Var.H0());
        f9Var2.G1(f9Var.W0());
        f9Var2.l1(f9Var.F);
        f9Var2.s3(f9Var.G);
        return f9Var2;
    }

    @Override // tl.b8
    public String A0() {
        az0.ea w17;
        return (!ns0.e0.f330494a1.h() || (w17 = az0.w9.w(this.G)) == null) ? super.A0() : w17.f13224e;
    }

    @Override // tl.b8
    public void A1(int i17) {
        if (ns0.e0.f330494a1.h()) {
            Log.e("MicroMsg.MsgInfo", "[setTalkerId] not support, talkerId: %d", Integer.valueOf(i17));
        } else {
            super.A1(i17);
        }
    }

    public boolean A2() {
        return super.getType() == -2097151951;
    }

    public boolean B2() {
        return super.getType() == 1191182385;
    }

    @Override // tl.b8
    public String C0() {
        String C0 = super.C0();
        return TextUtils.isEmpty(C0) ? F0() == 1 ? (String) dl0.k1.u().c().l(2, "") : P0() : C0;
    }

    public boolean C2() {
        return super.getType() == 47;
    }

    public boolean D2() {
        return super.getType() == 486539313 && this.f177532g2 && this.f177531f2 != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // tl.b8
    public String E0() {
        String str;
        ns0.d0 d0Var = ns0.e0.f330494a1;
        String E0 = super.E0();
        d0Var.getClass();
        ((qy.j1) ((ns0.e0) u75.n0.c(ns0.e0.class))).getClass();
        if ((E0 == null || E0.length() == 0) != true) {
            return E0;
        }
        String str2 = null;
        Object obj = null;
        r11.v2 v2Var = null;
        if (nj5.w.a(this) != nj5.v.f328887g) {
            if (nj5.w.a(this) == nj5.v.f328892o) {
                ((ru.p0) ((su.h1) u75.n0.c(su.h1.class))).getClass();
                if (!(E0 == null || E0.length() == 0)) {
                    return E0;
                }
                u11.w0 L1 = K0() != 0 ? u11.p0.Jh().L1(K0()) : null;
                if (L1 == null) {
                    L1 = u11.p0.Jh().N1(P0(), getMsgId());
                }
                str2 = L1 != null ? L1.f409676b : null;
                if (str2 == null) {
                    if (E0 == null) {
                        E0 = K0() != 0 ? u11.g1.m1(K0()) : u11.g1.j1(P0(), "");
                    }
                    kotlin.jvm.internal.o.d(E0);
                    return E0;
                }
            } else {
                if (nj5.w.a(this) != nj5.v.f328891n) {
                    return E0;
                }
                ((com.tencent.mm.feature.emoji.b0) ((com.tencent.mm.feature.emoji.api.s5) u75.n0.c(com.tencent.mm.feature.emoji.api.s5.class))).getClass();
                if (!TextUtils.isEmpty(E0)) {
                    return E0;
                }
                if (getMsgId() == 0) {
                    Log.e("MicroMsg.EmojiFeatureService", "getEmoticonMd5 fail, msg is null ");
                } else {
                    ms0.q v17 = ms0.q.v(j());
                    str = (v17 == null || TextUtils.isEmpty(v17.f321847q)) ? new y4(j()).f178970d : v17.f321847q;
                }
            }
            return str2;
        }
        ((we0.c) ((q15.m) u75.n0.c(q15.m.class))).getClass();
        ((we0.w1) ((xe0.q1) u75.n0.c(xe0.q1.class))).getClass();
        List h17 = r11.o2.Qh().h(this, E0);
        if (h17 != null) {
            Iterator it = ((ArrayList) h17).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                kotlin.jvm.internal.o.f(((r11.v2) next).d(), "getFileName(...)");
                if (!jz5.i0.o(r6, ya.b.ORIGIN, false)) {
                    obj = next;
                    break;
                }
            }
            v2Var = (r11.v2) obj;
        }
        if (v2Var == null || (str = v2Var.d()) == null) {
            return E0;
        }
        return str;
    }

    public boolean E2() {
        return super.getType() == 42 || super.getType() == 66;
    }

    @Override // tl.b8
    public void F1(String str) {
        if (ns0.e0.f330494a1.h()) {
            i9 a17 = cf3.p1.f27050a.a(this);
            if (a17.f177646i == null) {
                a17.f177646i = new v8();
            }
            a17.f177646i.f178903d = str;
            cf3.q1.a(a17, this);
        }
        super.F1(str);
    }

    public boolean F2() {
        Map d17;
        return (com.tencent.mm.sdk.platformtools.t8.K0(this.G) || (d17 = com.tencent.mm.sdk.platformtools.aa.d(this.G, "msgsource", null)) == null || com.tencent.mm.sdk.platformtools.t8.K0((String) d17.get(".msgsource.watchuser"))) ? false : true;
    }

    @Override // tl.b8
    public void G1(String str) {
        if (ns0.e0.f330494a1.h()) {
            i9 a17 = cf3.p1.f27050a.a(this);
            if (a17.f177646i == null) {
                a17.f177646i = new v8();
            }
            a17.f177646i.f178904e = str;
            cf3.q1.a(a17, this);
        }
        super.G1(str);
    }

    public boolean G2() {
        return super.getType() == -2130706383 || super.getType() == -2113929167;
    }

    public boolean H2() {
        return super.getType() == 805306417;
    }

    public boolean I2() {
        int i17 = this.F;
        return ((i17 & 128) == 0 && (i17 & 768) == 0) ? false : true;
    }

    public boolean J2() {
        int type = super.getType();
        return type == 3 || type == 13 || type == 23 || type == 33 || type == 39;
    }

    public boolean K2() {
        return super.getType() == 67;
    }

    @Override // tl.b8
    public String L0() {
        String str;
        String L0 = super.L0();
        ns0.d0 d0Var = ns0.e0.f330494a1;
        d0Var.getClass();
        ((qy.j1) ((ns0.e0) u75.n0.c(ns0.e0.class))).getClass();
        if (nj5.w.a(this) == nj5.v.f328887g) {
            if (!(L0 == null || L0.length() == 0)) {
                return L0;
            }
            ((we0.w1) ((xe0.q1) u75.n0.c(xe0.q1.class))).getClass();
            ((we0.w1) ((xe0.q1) u75.n0.c(xe0.q1.class))).getClass();
            r11.v2 g17 = r11.o2.Qh().g(E0());
            str = g17 != null ? g17.g() : null;
            return !(str == null || str.length() == 0) ? str : L0;
        }
        if (!x2()) {
            return L0;
        }
        String S1 = S1();
        if (S1 == null || S1.length() == 0) {
            return L0;
        }
        ms0.q v17 = ms0.q.v(S1());
        ps0.d dVar = v17 != null ? (ps0.d) v17.y(ps0.d.class) : null;
        String str2 = dVar != null ? dVar.f358610b : null;
        if (!(str2 == null || str2.length() == 0)) {
            return S1();
        }
        f9 k17 = d0Var.k(P0(), getMsgId());
        ms0.q v18 = ms0.q.v(k17 != null ? k17.S1() : null);
        ps0.d dVar2 = v18 != null ? (ps0.d) v18.y(ps0.d.class) : null;
        str = dVar2 != null ? dVar2.f358610b : null;
        return ((str == null || str.length() == 0) || k17 == null) ? L0 : k17.S1();
    }

    public boolean L1() {
        return (O0() <= 3 || O0() == 8) && F0() == 1;
    }

    public boolean L2() {
        return super.getType() == 48;
    }

    public boolean M2() {
        return super.getType() == 486539313;
    }

    public boolean N2() {
        return super.getType() == 64;
    }

    public boolean O2() {
        return super.getType() == 10002 || super.getType() == 268445458 || P2();
    }

    public boolean P2() {
        return super.getType() == 285222674;
    }

    @Override // tl.b8
    public int Q0() {
        return ns0.e0.f330494a1.h() ? (int) ((com.tencent.mm.plugin.messenger.foundation.h2) ((ef3.x3) dl0.k1.s(ef3.x3.class))).Fh().u(P0()) : super.Q0();
    }

    public int Q1() {
        az0.ea w17;
        return (!ns0.e0.f330494a1.h() || (w17 = az0.w9.w(this.G)) == null) ? this.W : w17.f13226g;
    }

    public boolean Q2() {
        return super.getType() == 889192497 || super.getType() == 922746929;
    }

    @Override // tl.b8
    public String R0() {
        String R0 = super.R0();
        return TextUtils.isEmpty(R0) ? F0() == 1 ? P0() : (String) dl0.k1.u().c().l(2, "") : R0;
    }

    public String R1() {
        if (ns0.e0.f330494a1.h()) {
            az0.ea w17 = az0.w9.w(this.G);
            String str = w17 == null ? null : w17.f13225f;
            if (str != null) {
                return str;
            }
        }
        return this.P;
    }

    public boolean R2() {
        return super.getType() == 822083633;
    }

    public String S1() {
        return super.j();
    }

    public boolean S2() {
        String j17 = j();
        return j17 != null && j17.contains("tmpl_type_recommend_remark_sys_tip");
    }

    @Override // tl.b8
    public String T0() {
        i9 a17 = cf3.p1.f27050a.a(this);
        v8 v8Var = a17.f177646i;
        return (v8Var == null || com.tencent.mm.sdk.platformtools.t8.K0(v8Var.f178903d)) ? super.T0() : a17.f177646i.f178903d;
    }

    public long T1() {
        return super.getCreateTime();
    }

    public boolean T2() {
        return (this.F & 4) == 4;
    }

    public String U1() {
        if (F0() != 0 || com.tencent.mm.sdk.platformtools.t8.K0(j()) || !z3.S4(P0())) {
            return j();
        }
        int indexOf = j().indexOf(58);
        return (indexOf < 0 || indexOf >= j().length()) ? j() : j().substring(0, indexOf).contains("<") ? j() : j().substring(indexOf + 1).trim();
    }

    public boolean U2() {
        return super.getType() == 268445456 || super.getType() == 268445458 || super.getType() == 285222674;
    }

    public String V1() {
        int indexOf;
        if (F0() != 0 || com.tencent.mm.sdk.platformtools.t8.K0(j()) || !z3.S4(P0()) || (indexOf = j().indexOf(58)) < 0 || indexOf >= j().length() || j().substring(0, indexOf).contains("<")) {
            return null;
        }
        return j().substring(0, indexOf).trim();
    }

    public boolean V2() {
        return super.getType() == 301989937;
    }

    @Override // tl.b8
    public String W0() {
        i9 a17 = cf3.p1.f27050a.a(this);
        v8 v8Var = a17.f177646i;
        return (v8Var == null || com.tencent.mm.sdk.platformtools.t8.K0(v8Var.f178904e)) ? super.W0() : a17.f177646i.f178904e;
    }

    public String W1() {
        i9 a17 = cf3.p1.f27050a.a(this);
        return !com.tencent.mm.sdk.platformtools.t8.K0(a17.f177643f) ? a17.f177643f : this.U;
    }

    public boolean W2() {
        return super.getType() == 62;
    }

    @Override // tl.b8
    public void X0(long j17) {
        if (ns0.e0.f330494a1.h()) {
            Log.e("MicroMsg.MsgInfo", "[setBizChatId] not support, bizChatId: %d", Long.valueOf(j17));
        }
        super.X0(j17);
    }

    public String X1() {
        i9 a17 = cf3.p1.f27050a.a(this);
        return !com.tencent.mm.sdk.platformtools.t8.K0(a17.f177642e) ? a17.f177642e : this.V;
    }

    public boolean X2() {
        return super.getType() == 10000;
    }

    @Override // tl.b8
    public void Y0(String str) {
        if (ns0.e0.f330494a1.h()) {
            Log.e("MicroMsg.MsgInfo", "[setBizChatUserId] not support, bizChatUserId: %s", str);
        } else {
            super.Y0(str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007f A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String Y1() {
        /*
            r13 = this;
            ns0.d0 r0 = ns0.e0.f330494a1
            r0.getClass()
            java.lang.Class<ef3.j4> r0 = ef3.j4.class
            u75.m r0 = u75.n0.c(r0)
            ef3.j4 r0 = (ef3.j4) r0
            lz3.e r0 = (lz3.e) r0
            r0.getClass()
            java.lang.Class<kz3.e> r0 = kz3.e.class
            u75.m r0 = u75.n0.c(r0)
            kz3.e r0 = (kz3.e) r0
            pz3.b r0 = r0.ph()
            java.lang.String r1 = r13.P0()
            long r2 = r13.getMsgId()
            y55.i0 r4 = r0.f361065d
            java.lang.String r5 = "SelectRecord"
            y55.e0 r0 = pz3.a.f361062t
            java.lang.String[] r6 = r0.f452649c
            java.lang.String r7 = "msgId=? and talker=?"
            java.lang.String r0 = java.lang.String.valueOf(r2)
            java.lang.String[] r8 = new java.lang.String[]{r0, r1}
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 2
            android.database.Cursor r0 = r4.k(r5, r6, r7, r8, r9, r10, r11, r12)
            if (r0 != 0) goto L43
            goto L79
        L43:
            r1 = 0
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L6c
            r2.<init>()     // Catch: java.lang.Throwable -> L6c
        L49:
            boolean r3 = r0.moveToNext()     // Catch: java.lang.Throwable -> L6c
            if (r3 == 0) goto L5b
            pz3.a r3 = new pz3.a     // Catch: java.lang.Throwable -> L6c
            r3.<init>()     // Catch: java.lang.Throwable -> L6c
            r3.convertFrom(r0)     // Catch: java.lang.Throwable -> L6c
            r2.add(r3)     // Catch: java.lang.Throwable -> L6c
            goto L49
        L5b:
            int r3 = r2.size()     // Catch: java.lang.Throwable -> L6c
            if (r3 != 0) goto L62
            goto L76
        L62:
            java.lang.Object r2 = r2.get(r1)     // Catch: java.lang.Throwable -> L6c
            pz3.a r2 = (pz3.a) r2     // Catch: java.lang.Throwable -> L6c
            r0.close()
            goto L7a
        L6c:
            r2 = move-exception
            java.lang.String r3 = "MicroMsg.selectRecord.SelectRecordStorage"
            java.lang.String r4 = "getSelectRecordItem err"
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L82
            com.tencent.mars.xlog.Log.printErrStackTrace(r3, r2, r4, r1)     // Catch: java.lang.Throwable -> L82
        L76:
            r0.close()
        L79:
            r2 = 0
        L7a:
            if (r2 == 0) goto L7f
            java.lang.String r0 = r2.field_historyId
            goto L81
        L7f:
            java.lang.String r0 = ""
        L81:
            return r0
        L82:
            r1 = move-exception
            r0.close()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.storage.f9.Y1():java.lang.String");
    }

    public boolean Y2() {
        return super.getType() == 318767153 || B2();
    }

    public int Z1() {
        return (F0() != 1 || 3 == O0()) ? 1 : 0;
    }

    public boolean Z2() {
        int type = super.getType();
        return type == 1 || type == 11 || type == 21 || type == 31 || type == 36 || type == 1107296305;
    }

    @Override // tl.b8
    public void a1(String str) {
        if (ns0.e0.f330494a1.h()) {
            Log.e("MicroMsg.MsgInfo", "[setBizClientMsgId] not support, bizClientMsgId: %s", str);
        }
        super.a1(str);
    }

    public boolean a2() {
        return (this.F & 64) != 0;
    }

    public boolean a3() {
        return super.getType() == 10000 && (B0() & 2097152) != 0;
    }

    public boolean b2() {
        return i2() && (this.F & 16) > 0;
    }

    public boolean b3() {
        return super.getType() == 1426063409;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x018e  */
    @Override // tl.b8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c1(java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 535
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.storage.f9.c1(java.lang.String):void");
    }

    public int c2() {
        int i17 = cf3.p1.f27050a.a(this).f177645h;
        return i17 != 0 ? i17 : this.M;
    }

    public boolean c3() {
        return super.getType() == 1409286193;
    }

    public Object clone() {
        return super.clone();
    }

    @Override // tl.b8, y55.f0
    public void convertFrom(Cursor cursor) {
        super.convertFrom(cursor);
        String j17 = j();
        if (j17 != null && j17.length() > 2097152) {
            long msgId = getMsgId();
            StringBuilder sb6 = new StringBuilder(1024);
            sb6.append("Very big message: \nmsgId = ");
            sb6.append(msgId);
            sb6.append("\nmsgSvrId = ");
            sb6.append(K0());
            sb6.append("\ntype = ");
            sb6.append(super.getType());
            sb6.append("\ncreateTime = ");
            sb6.append(getCreateTime());
            sb6.append("\ntalker = ");
            sb6.append(P0());
            sb6.append("\nflag = ");
            sb6.append(B0());
            sb6.append("\ncontent.length() = ");
            sb6.append(j17.length());
            sb6.append("\ncontent = ");
            sb6.append(j17.substring(0, 256));
            Log.e("MicroMsg.MsgInfo", sb6.toString());
            setType(1);
            c1("");
            dl0.k1.e().j(new x8(this, msgId, P1(this)));
        }
        N1(getMsgId());
    }

    @Override // tl.b8, y55.f0
    public ContentValues convertTo() {
        N1(getMsgId());
        return super.convertTo();
    }

    public String d2() {
        try {
            if (this.f177529d2 == null) {
                this.f177529d2 = new z8();
                this.f177529d2.f179020a = (String) com.tencent.mm.sdk.platformtools.aa.d(j(), "sysmsg", null).get(".sysmsg.sysmsgtemplate.content_template.link_list.link2.msgcount");
            }
        } catch (Throwable unused) {
        }
        z8 z8Var = this.f177529d2;
        return z8Var != null ? z8Var.f179020a : "";
    }

    public boolean d3() {
        return super.getType() == 34;
    }

    public String e2() {
        if (!O2()) {
            return "";
        }
        if (this.f177534i2 == null) {
            k3();
        }
        return this.f177534i2;
    }

    public boolean e3() {
        return super.getType() == -1879048189;
    }

    public String f2() {
        i9 a17 = cf3.p1.f27050a.a(this);
        return !com.tencent.mm.sdk.platformtools.t8.K0(a17.f177648n) ? a17.f177648n : this.f398336x0;
    }

    public boolean f3() {
        return super.getType() == -1879048190;
    }

    public int g2() {
        return this.F & 4;
    }

    public boolean g3() {
        return super.getType() == -1879048191;
    }

    @Override // tl.b8
    public long getCreateTime() {
        Map d17;
        try {
            if (this.f177530e2 == null) {
                d9 d9Var = new d9();
                this.f177530e2 = d9Var;
                d9Var.f177442a = this.G.contains("<share_msg>");
                d9 d9Var2 = this.f177530e2;
                if (d9Var2.f177442a) {
                    String str = this.G;
                    int i17 = az0.ia.f13332a;
                    d9Var2.f177443b = (str == null || com.tencent.mm.sdk.platformtools.t8.K0(str) || (d17 = com.tencent.mm.sdk.platformtools.aa.d(str, "msgsource", null)) == null) ? -1L : com.tencent.mm.sdk.platformtools.t8.E1((String) d17.get(".msgsource.share_msg.createtime")) * 1000;
                }
            }
        } catch (Throwable unused) {
        }
        d9 d9Var3 = this.f177530e2;
        if (d9Var3 != null && d9Var3.f177442a) {
            long j17 = d9Var3.f177443b;
            if (j17 != -1) {
                return j17;
            }
        }
        return super.getCreateTime();
    }

    @Override // tl.b8
    public int getType() {
        return super.getType();
    }

    @Override // tl.b8
    public void h1(String str) {
        super.h1(str);
    }

    public int h2() {
        return (O0() < 3 || O0() > 6) ? 0 : 1;
    }

    public boolean h3() {
        return super.getType() == 50 || super.getType() == 53;
    }

    @Override // tl.b8
    public void i1(String str) {
        super.i1(str);
    }

    public boolean i2() {
        String e17 = ((com.tencent.mm.plugin.zero.a) ((q05.e) dl0.k1.s(q05.e.class))).b().e("TranslateMsgOff");
        return (com.tencent.mm.sdk.platformtools.t8.K0(e17) || com.tencent.mm.sdk.platformtools.t8.D1(e17, 0) == 0) && !com.tencent.mm.sdk.platformtools.t8.K0(W0());
    }

    public boolean i3() {
        return super.getType() == 52;
    }

    public boolean isVideo() {
        return super.getType() == 43;
    }

    @Override // tl.b8
    public String j() {
        ns0.e0.f330494a1.getClass();
        boolean z17 = true;
        if (x2()) {
            ((qy.j1) ((ns0.e0) u75.n0.c(ns0.e0.class))).getClass();
            String S1 = S1();
            if (!(S1 == null || S1.length() == 0)) {
                ms0.q v17 = ms0.q.v(S1());
                ps0.d dVar = v17 != null ? (ps0.d) v17.y(ps0.d.class) : null;
                String str = dVar != null ? dVar.f358610b : null;
                if (str != null && str.length() != 0) {
                    z17 = false;
                }
                if (!z17) {
                    StringBuilder sb6 = new StringBuilder();
                    String S12 = S1();
                    kotlin.jvm.internal.o.f(S12, "getDBContent(...)");
                    String S13 = S1();
                    kotlin.jvm.internal.o.f(S13, "getDBContent(...)");
                    String substring = S12.substring(0, jz5.n0.K(S13, '<', 0, false, 6, null));
                    kotlin.jvm.internal.o.f(substring, "substring(...)");
                    sb6.append(substring);
                    sb6.append(dVar != null ? dVar.f358610b : null);
                    return sb6.toString();
                }
            }
            return S1();
        }
        if (d3()) {
            ((qy.j1) ((ns0.e0) u75.n0.c(ns0.e0.class))).getClass();
            String S14 = S1();
            if (S14 != null && S14.length() != 0) {
                z17 = false;
            }
            if (!z17) {
                String S15 = S1();
                kotlin.jvm.internal.o.f(S15, "getDBContent(...)");
                if (jz5.n0.B(S15, "<msg>", false)) {
                    n05.b bVar = new n05.b();
                    String r17 = az0.w9.r(S1());
                    kotlin.jvm.internal.o.f(r17, "getGroupChatMsgContent(...)");
                    bVar.fromXml(r17);
                    return u11.u0.c(bVar.getFromUsername(), bVar.l(), bVar.o());
                }
            }
            return S1();
        }
        if (!isVideo()) {
            return S1();
        }
        ((qy.j1) ((ns0.e0) u75.n0.c(ns0.e0.class))).getClass();
        String S16 = S1();
        if (S16 != null && S16.length() != 0) {
            z17 = false;
        }
        if (!z17) {
            String S17 = S1();
            kotlin.jvm.internal.o.f(S17, "getDBContent(...)");
            if (jz5.n0.B(S17, "<msg>", false)) {
                m05.d dVar2 = new m05.d();
                m05.c n17 = dVar2.n();
                String S18 = S1();
                kotlin.jvm.internal.o.f(S18, "getDBContent(...)");
                n17.fromXml(S18);
                m05.c n18 = dVar2.n();
                String string = n18.getString(n18.f315141d + 17);
                m05.c n19 = dVar2.n();
                return r11.t2.a(string, n19.getInteger(n19.f315141d + 10), false);
            }
        }
        return S1();
    }

    public boolean j2() {
        return super.getType() == 10000 || super.getType() == 10002 || super.getType() == 570425393 || super.getType() == 64 || super.getType() == 603979825 || super.getType() == 889192497 || super.getType() == 922746929 || super.getType() == 268445456 || super.getType() == 268445458 || super.getType() == 285222674 || super.getType() == -1879048191 || super.getType() == 1077936177;
    }

    public boolean j3() {
        return super.getType() == 1627390001;
    }

    public boolean k2() {
        return (super.getType() & 65535) == 49 && super.getType() != 1107296305;
    }

    public b11.c k3() {
        Log.i("MicroMsg.MsgInfo", "[parseNewXmlSysMsg]");
        String j17 = j();
        if (super.getType() == 268445458 || super.getType() == 285222674) {
            j17 = f2();
        }
        b11.c cVar = null;
        Map d17 = com.tencent.mm.sdk.platformtools.aa.d(j17, "sysmsg", null);
        HashMap hashMap = b11.a.f14497a;
        if (d17 == null) {
            Log.e("MicroMsg.BaseNewXmlMsg", "values is null !!!");
        } else {
            String str = (String) d17.get(".sysmsg.$type");
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f176589a;
            if (str == null) {
                str = "";
            }
            HashMap hashMap2 = b11.a.f14497a;
            synchronized (hashMap2) {
                b11.a aVar = (b11.a) hashMap2.get(str.toLowerCase());
                if (aVar == null) {
                    Log.w("MicroMsg.BaseNewXmlMsg", "TYPE %s is unDefine", str);
                } else {
                    cVar = aVar.a(d17, this);
                }
            }
        }
        if (cVar != null) {
            Log.i("MicroMsg.MsgInfo", "BaseNewXmlMsg:%s", cVar);
            cVar.a();
            this.f177534i2 = cVar.f14504e;
        } else {
            Log.e("MicroMsg.MsgInfo", "[parseNewXmlSysMsg] null == pBaseNewXmlMsg");
        }
        return cVar;
    }

    public boolean l2() {
        return super.getType() == 503316529;
    }

    public boolean m2() {
        return super.getType() == 1048625;
    }

    public void m3(int i17) {
        if (ns0.e0.f330494a1.h()) {
            Log.e("MicroMsg.MsgInfo", "[setBizKfType] not support, bizKfType: %d", Integer.valueOf(i17));
        } else {
            this.W = i17;
            this.f398329r = true;
        }
    }

    public boolean n2() {
        return super.getType() == 1090519089;
    }

    public void n3(String str) {
        if (ns0.e0.f330494a1.h()) {
            Log.e("MicroMsg.MsgInfo", "[setBizKfWorker] not support, bizKfWorker: %s", str);
        } else {
            this.P = str;
            this.f398329r = true;
        }
    }

    @Override // tl.b8
    public void o1(String str) {
        ns0.d0 d0Var = ns0.e0.f330494a1;
        d0Var.getClass();
        ((qy.j1) ((ns0.e0) u75.n0.c(ns0.e0.class))).getClass();
        Log.i("MicroMsg.MsgFeatureService", "setReserved, businessType: " + nj5.w.a(this) + ", msgId: " + getMsgId() + ", talker: " + K0() + ", reserved:" + str);
        if (d0Var.h()) {
            if (nj5.w.a(this) != nj5.v.f328887g && x2()) {
                if (!(str == null || str.length() == 0)) {
                    ms0.q v17 = ms0.q.v(str);
                    ps0.d dVar = v17 != null ? (ps0.d) v17.y(ps0.d.class) : null;
                    String str2 = dVar != null ? dVar.f358610b : null;
                    if (!(str2 == null || str2.length() == 0)) {
                        c1(str);
                    }
                }
            }
            r1 = true;
        }
        if (r1) {
            return;
        }
        super.o1(str);
    }

    public boolean o2() {
        return super.getType() == 268435505;
    }

    public void o3(int i17) {
        if (i17 == 0 || i17 == 1) {
            l1(i17 | this.F);
        } else {
            Log.w("MicroMsg.MsgInfo", "Illgeal forwardflag !!!");
        }
    }

    public boolean p2() {
        return super.getType() == 855638065;
    }

    public void p3(String str) {
        if (ns0.e0.f330494a1.g()) {
            i9 a17 = cf3.p1.f27050a.a(this);
            a17.f177643f = str;
            cf3.q1.a(a17, this);
        }
        this.U = str;
        this.f398329r = true;
    }

    public boolean q2() {
        return super.getType() == 16777265;
    }

    public void q3(String str) {
        if (ns0.e0.f330494a1.g()) {
            i9 a17 = cf3.p1.f27050a.a(this);
            a17.f177642e = str;
            cf3.q1.a(a17, this);
        }
        this.V = str;
        this.f398329r = true;
    }

    public boolean r2() {
        return !com.tencent.mm.sdk.platformtools.t8.K0(this.G) && this.G.contains("notify@all");
    }

    public void r3() {
        l1(this.F | 512);
    }

    public boolean s2(String str) {
        Map d17;
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.G) || com.tencent.mm.sdk.platformtools.t8.K0(str) || !this.G.contains(str) || (d17 = com.tencent.mm.sdk.platformtools.aa.d(this.G, "msgsource", null)) == null) {
            return false;
        }
        String str2 = (String) d17.get(".msgsource.atuserlist");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            for (String str3 : str2.split(",")) {
                if (str3.trim().equals(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void s3(String str) {
        this.G = str;
        this.f398329r = true;
        this.f177530e2 = null;
    }

    @Override // tl.b8
    public void t1(int i17) {
        super.t1(i17);
        if (F0() == 1) {
            if ((Z2() || L2() || E2()) ? false : true) {
                if (O0() != 5) {
                    if (O0() == 2) {
                        SendMsgSuccessEvent sendMsgSuccessEvent = new SendMsgSuccessEvent();
                        sendMsgSuccessEvent.f39540g.f367984a = this;
                        sendMsgSuccessEvent.e();
                        return;
                    }
                    return;
                }
                Long valueOf = Long.valueOf(getMsgId());
                Integer valueOf2 = Integer.valueOf(super.getType());
                String P0 = P0();
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f176589a;
                Log.e("MicroMsg.MsgInfo", "set msg status fail, msgId:%d, type:%d, userName:%s %s", valueOf, valueOf2, P0, new com.tencent.mm.sdk.platformtools.z3());
                SendMsgFailEvent sendMsgFailEvent = new SendMsgFailEvent();
                sendMsgFailEvent.f39538g.f367777a = this;
                sendMsgFailEvent.e();
                return;
            }
        }
        if (F0() == 0) {
            ReceiveMsgEvent receiveMsgEvent = new ReceiveMsgEvent();
            receiveMsgEvent.f39443g.f368507a = this;
            receiveMsgEvent.e();
        }
    }

    public boolean t2() {
        return super.getType() == 285212721;
    }

    public void t3() {
        b1(0);
    }

    public boolean u2() {
        int type = super.getType();
        return type == 55 || type == 57;
    }

    public void u3(boolean z17) {
        if (z17) {
            l1(this.F | 524288);
        } else {
            l1(this.F & (-524289));
        }
    }

    public void unsetOmittedFailResend() {
        int i17 = this.F;
        if ((i17 & 32) > 0) {
            l1(i17 & (-33));
        }
    }

    @Override // tl.b8
    public long v0() {
        ns0.e0.f330494a1.h();
        return super.v0();
    }

    public boolean v2() {
        Map d17;
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.G) || (d17 = com.tencent.mm.sdk.platformtools.aa.d(this.G, "msgsource", null)) == null) {
            return false;
        }
        String str = (String) d17.get(".msgsource.notify_option.biz_serivce_tmpl_status");
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return false;
        }
        return str.trim().equals("2");
    }

    public void v3(String str) {
        Log.i("MicroMsg.MsgInfo", "[setRevokeContent] msgId=%d, revokeContent=%s", Long.valueOf(getMsgId()), str);
        if (ns0.e0.f330494a1.h()) {
            i9 a17 = cf3.p1.f27050a.a(this);
            a17.f177648n = str;
            cf3.q1.a(a17, this);
            Log.i("MicroMsg.MsgInfo", "[setRevokeContent] update processingInfo, msgId=%d", Long.valueOf(getMsgId()));
        }
        this.f398336x0 = str;
        this.f398329r = true;
    }

    @Override // tl.b8
    public String w0() {
        az0.ea w17;
        return (!ns0.e0.f330494a1.h() || (w17 = az0.w9.w(this.G)) == null || com.tencent.mm.sdk.platformtools.t8.K0(w17.f13234o)) ? super.w0() : w17.f13234o;
    }

    public boolean w2() {
        return super.getType() == 436207665;
    }

    public void w3() {
        l1(this.F | 4);
    }

    public boolean x2() {
        return super.getType() == 1107296305;
    }

    public void x3() {
        l1(this.F | 4194304);
    }

    public boolean y2() {
        String str = this.G;
        return !com.tencent.mm.sdk.platformtools.t8.K0(str) && str.contains("announcement@all");
    }

    public boolean z2() {
        return (this.f398316J & 1) > 0;
    }

    public f9(String str) {
        u1(str);
    }
}
