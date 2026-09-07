
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
