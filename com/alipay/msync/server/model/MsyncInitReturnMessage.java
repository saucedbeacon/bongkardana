package com.alipay.msync.server.model;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class MsyncInitReturnMessage extends Message {
    public static final String DEFAULT_ACTION = "";
    public static final String DEFAULT_CDID = "";
    public static final Integer DEFAULT_HEARTTIMEOUT = 0;
    public static final Integer DEFAULT_KEEPLIVETIME = 0;
    public static final Integer DEFAULT_NEXTCONNECTITVL = 0;
    public static final int TAG_ACTION = 1;
    public static final int TAG_CDID = 5;
    public static final int TAG_HEARTTIMEOUT = 4;
    public static final int TAG_KEEPLIVETIME = 3;
    public static final int TAG_NEXTCONNECTITVL = 2;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public String action;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public String cdid;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public Integer heartTimeOut;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public Integer keepLiveTime;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public Integer nextConnectItvl;

    public MsyncInitReturnMessage(MsyncInitReturnMessage msyncInitReturnMessage) {
        super(msyncInitReturnMessage);
        if (msyncInitReturnMessage != null) {
            this.action = msyncInitReturnMessage.action;
            this.nextConnectItvl = msyncInitReturnMessage.nextConnectItvl;
            this.keepLiveTime = msyncInitReturnMessage.keepLiveTime;
            this.heartTimeOut = msyncInitReturnMessage.heartTimeOut;
            this.cdid = msyncInitReturnMessage.cdid;
        }
    }

    public MsyncInitReturnMessage() {
    }

    public final MsyncInitReturnMessage fillTagValue(int i, Object obj) {
        if (i == 1) {
            this.action = (String) obj;
        } else if (i == 2) {
            this.nextConnectItvl = (Integer) obj;
        } else if (i == 3) {
            this.keepLiveTime = (Integer) obj;
        } else if (i == 4) {
            this.heartTimeOut = (Integer) obj;
        } else if (i == 5) {
            this.cdid = (String) obj;
        }
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MsyncInitReturnMessage)) {
            return false;
        }
        MsyncInitReturnMessage msyncInitReturnMessage = (MsyncInitReturnMessage) obj;
        return equals((Object) this.action, (Object) msyncInitReturnMessage.action) && equals((Object) this.nextConnectItvl, (Object) msyncInitReturnMessage.nextConnectItvl) && equals((Object) this.keepLiveTime, (Object) msyncInitReturnMessage.keepLiveTime) && equals((Object) this.heartTimeOut, (Object) msyncInitReturnMessage.heartTimeOut) && equals((Object) this.cdid, (Object) msyncInitReturnMessage.cdid);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        String str = this.action;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 37;
        Integer num = this.nextConnectItvl;
        int hashCode2 = (hashCode + (num != null ? num.hashCode() : 0)) * 37;
        Integer num2 = this.keepLiveTime;
        int hashCode3 = (hashCode2 + (num2 != null ? num2.hashCode() : 0)) * 37;
        Integer num3 = this.heartTimeOut;
        int hashCode4 = (hashCode3 + (num3 != null ? num3.hashCode() : 0)) * 37;
        String str2 = this.cdid;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        int i3 = hashCode4 + i2;
        this.hashCode = i3;
        return i3;
    }
}
