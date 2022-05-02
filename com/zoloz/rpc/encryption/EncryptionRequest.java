package com.zoloz.rpc.encryption;

import com.zoloz.wire.Message;
import com.zoloz.wire.ProtoField;
import o.printConnMonitorLog;

public final class EncryptionRequest extends Message {
    public static final printConnMonitorLog DEFAULT_CONTENT = printConnMonitorLog.EMPTY;
    public static final printConnMonitorLog DEFAULT_CONTENTSIG = printConnMonitorLog.EMPTY;
    public static final String DEFAULT_MID = "";
    public static final int TAG_CONTENT = 1;
    public static final int TAG_CONTENTSIG = 2;
    public static final int TAG_MID = 3;
    @ProtoField(tag = 1, type = Message.Datatype.BYTES)
    public printConnMonitorLog content;
    @ProtoField(tag = 2, type = Message.Datatype.BYTES)
    public printConnMonitorLog contentSig;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public String mid;

    public EncryptionRequest(EncryptionRequest encryptionRequest) {
        super(encryptionRequest);
        if (encryptionRequest != null) {
            this.content = encryptionRequest.content;
            this.contentSig = encryptionRequest.contentSig;
            this.mid = encryptionRequest.mid;
        }
    }

    public EncryptionRequest() {
    }

    public final EncryptionRequest fillTagValue(int i, Object obj) {
        if (i == 1) {
            this.content = (printConnMonitorLog) obj;
        } else if (i == 2) {
            this.contentSig = (printConnMonitorLog) obj;
        } else if (i == 3) {
            this.mid = (String) obj;
        }
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof EncryptionRequest)) {
            return false;
        }
        EncryptionRequest encryptionRequest = (EncryptionRequest) obj;
        return equals((Object) this.content, (Object) encryptionRequest.content) && equals((Object) this.contentSig, (Object) encryptionRequest.contentSig) && equals((Object) this.mid, (Object) encryptionRequest.mid);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        printConnMonitorLog printconnmonitorlog = this.content;
        int i2 = 0;
        int hashCode = (printconnmonitorlog != null ? printconnmonitorlog.hashCode() : 0) * 37;
        printConnMonitorLog printconnmonitorlog2 = this.contentSig;
        int hashCode2 = (hashCode + (printconnmonitorlog2 != null ? printconnmonitorlog2.hashCode() : 0)) * 37;
        String str = this.mid;
        if (str != null) {
            i2 = str.hashCode();
        }
        int i3 = hashCode2 + i2;
        this.hashCode = i3;
        return i3;
    }
}
