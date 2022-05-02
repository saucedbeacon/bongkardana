package com.alipay.bis.common.service.facade.gw.pbmodel.common;

import com.zoloz.wire.Message;
import com.zoloz.wire.ProtoField;
import o.printConnMonitorLog;

public final class ClientConfigPB extends Message {
    public static final printConnMonitorLog DEFAULT_SIGN = printConnMonitorLog.EMPTY;
    public static final int TAG_CONTENT = 1;
    public static final int TAG_SIGN = 2;
    @ProtoField(tag = 1)
    public ClientConfigContentPB content;
    @ProtoField(tag = 2, type = Message.Datatype.BYTES)
    public printConnMonitorLog sign;

    public ClientConfigPB(ClientConfigPB clientConfigPB) {
        super(clientConfigPB);
        if (clientConfigPB != null) {
            this.content = clientConfigPB.content;
            this.sign = clientConfigPB.sign;
        }
    }

    public ClientConfigPB() {
    }

    public final ClientConfigPB fillTagValue(int i, Object obj) {
        if (i == 1) {
            this.content = (ClientConfigContentPB) obj;
        } else if (i == 2) {
            this.sign = (printConnMonitorLog) obj;
        }
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ClientConfigPB)) {
            return false;
        }
        ClientConfigPB clientConfigPB = (ClientConfigPB) obj;
        return equals((Object) this.content, (Object) clientConfigPB.content) && equals((Object) this.sign, (Object) clientConfigPB.sign);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        ClientConfigContentPB clientConfigContentPB = this.content;
        int i2 = 0;
        int hashCode = (clientConfigContentPB != null ? clientConfigContentPB.hashCode() : 0) * 37;
        printConnMonitorLog printconnmonitorlog = this.sign;
        if (printconnmonitorlog != null) {
            i2 = printconnmonitorlog.hashCode();
        }
        int i3 = hashCode + i2;
        this.hashCode = i3;
        return i3;
    }
}
