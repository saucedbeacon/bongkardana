package com.zoloz.rpc.encryption;

import com.zoloz.wire.Message;
import com.zoloz.wire.ProtoField;
import o.printConnMonitorLog;

public final class EncryptionResponse extends Message {
    public static final printConnMonitorLog DEFAULT_CONTENT = printConnMonitorLog.EMPTY;
    public static final String DEFAULT_RETCODE = "";
    public static final int TAG_CONTENT = 1;
    public static final int TAG_RETCODE = 2;
    @ProtoField(tag = 1, type = Message.Datatype.BYTES)
    public printConnMonitorLog content;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public String retCode;

    public EncryptionResponse(EncryptionResponse encryptionResponse) {
        super(encryptionResponse);
        if (encryptionResponse != null) {
            this.content = encryptionResponse.content;
            this.retCode = encryptionResponse.retCode;
        }
    }

    public EncryptionResponse() {
    }

    public final EncryptionResponse fillTagValue(int i, Object obj) {
        if (i == 1) {
            this.content = (printConnMonitorLog) obj;
        } else if (i == 2) {
            this.retCode = (String) obj;
        }
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof EncryptionResponse)) {
            return false;
        }
        EncryptionResponse encryptionResponse = (EncryptionResponse) obj;
        return equals((Object) this.content, (Object) encryptionResponse.content) && equals((Object) this.retCode, (Object) encryptionResponse.retCode);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        printConnMonitorLog printconnmonitorlog = this.content;
        int i2 = 0;
        int hashCode = (printconnmonitorlog != null ? printconnmonitorlog.hashCode() : 0) * 37;
        String str = this.retCode;
        if (str != null) {
            i2 = str.hashCode();
        }
        int i3 = hashCode + i2;
        this.hashCode = i3;
        return i3;
    }
}
