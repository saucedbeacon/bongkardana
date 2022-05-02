package com.alipay.bis.common.service.facade.gw.pbmodel.upload;

import com.zoloz.wire.Message;
import com.zoloz.wire.ProtoField;
import o.printConnMonitorLog;

public final class BisUploadGwRequest extends Message {
    public static final printConnMonitorLog DEFAULT_BEHAVLOG = printConnMonitorLog.EMPTY;
    public static final printConnMonitorLog DEFAULT_BEHAVLOGSIG = printConnMonitorLog.EMPTY;
    public static final String DEFAULT_BISTOKEN = "";
    public static final printConnMonitorLog DEFAULT_CONTENT = printConnMonitorLog.EMPTY;
    public static final printConnMonitorLog DEFAULT_CONTENTSIG = printConnMonitorLog.EMPTY;
    public static final int TAG_BEHAVLOG = 4;
    public static final int TAG_BEHAVLOGSIG = 5;
    public static final int TAG_BISTOKEN = 1;
    public static final int TAG_CONTENT = 2;
    public static final int TAG_CONTENTSIG = 3;
    @ProtoField(tag = 4, type = Message.Datatype.BYTES)
    public printConnMonitorLog behavLog;
    @ProtoField(tag = 5, type = Message.Datatype.BYTES)
    public printConnMonitorLog behavLogSig;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public String bisToken;
    @ProtoField(tag = 2, type = Message.Datatype.BYTES)
    public printConnMonitorLog content;
    @ProtoField(tag = 3, type = Message.Datatype.BYTES)
    public printConnMonitorLog contentSig;

    public BisUploadGwRequest(BisUploadGwRequest bisUploadGwRequest) {
        super(bisUploadGwRequest);
        if (bisUploadGwRequest != null) {
            this.bisToken = bisUploadGwRequest.bisToken;
            this.content = bisUploadGwRequest.content;
            this.contentSig = bisUploadGwRequest.contentSig;
            this.behavLog = bisUploadGwRequest.behavLog;
            this.behavLogSig = bisUploadGwRequest.behavLogSig;
        }
    }

    public BisUploadGwRequest() {
    }

    public final BisUploadGwRequest fillTagValue(int i, Object obj) {
        if (i == 1) {
            this.bisToken = (String) obj;
        } else if (i == 2) {
            this.content = (printConnMonitorLog) obj;
        } else if (i == 3) {
            this.contentSig = (printConnMonitorLog) obj;
        } else if (i == 4) {
            this.behavLog = (printConnMonitorLog) obj;
        } else if (i == 5) {
            this.behavLogSig = (printConnMonitorLog) obj;
        }
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BisUploadGwRequest)) {
            return false;
        }
        BisUploadGwRequest bisUploadGwRequest = (BisUploadGwRequest) obj;
        return equals((Object) this.bisToken, (Object) bisUploadGwRequest.bisToken) && equals((Object) this.content, (Object) bisUploadGwRequest.content) && equals((Object) this.contentSig, (Object) bisUploadGwRequest.contentSig) && equals((Object) this.behavLog, (Object) bisUploadGwRequest.behavLog) && equals((Object) this.behavLogSig, (Object) bisUploadGwRequest.behavLogSig);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        String str = this.bisToken;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 37;
        printConnMonitorLog printconnmonitorlog = this.content;
        int hashCode2 = (hashCode + (printconnmonitorlog != null ? printconnmonitorlog.hashCode() : 0)) * 37;
        printConnMonitorLog printconnmonitorlog2 = this.contentSig;
        int hashCode3 = (hashCode2 + (printconnmonitorlog2 != null ? printconnmonitorlog2.hashCode() : 0)) * 37;
        printConnMonitorLog printconnmonitorlog3 = this.behavLog;
        int hashCode4 = (hashCode3 + (printconnmonitorlog3 != null ? printconnmonitorlog3.hashCode() : 0)) * 37;
        printConnMonitorLog printconnmonitorlog4 = this.behavLogSig;
        if (printconnmonitorlog4 != null) {
            i2 = printconnmonitorlog4.hashCode();
        }
        int i3 = hashCode4 + i2;
        this.hashCode = i3;
        return i3;
    }
}
