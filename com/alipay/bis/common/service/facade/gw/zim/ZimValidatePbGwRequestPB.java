package com.alipay.bis.common.service.facade.gw.zim;

import com.zoloz.wire.Message;
import com.zoloz.wire.ProtoField;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;
import o.printConnMonitorLog;

public final class ZimValidatePbGwRequestPB extends Message {
    public static final printConnMonitorLog DEFAULT_ZIMDATA = printConnMonitorLog.EMPTY;
    public static final String DEFAULT_ZIMID = "";
    public static final int TAG_BIZDATA = 3;
    public static final int TAG_ZIMDATA = 2;
    public static final int TAG_ZIMID = 1;
    @ProtoField(tag = 3)
    public MapStringString bizData;
    @ProtoField(tag = 2, type = Message.Datatype.BYTES)
    public printConnMonitorLog zimData;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public String zimId;

    public ZimValidatePbGwRequestPB(ZimValidatePbGwRequestPB zimValidatePbGwRequestPB) {
        super(zimValidatePbGwRequestPB);
        if (zimValidatePbGwRequestPB != null) {
            this.zimId = zimValidatePbGwRequestPB.zimId;
            this.zimData = zimValidatePbGwRequestPB.zimData;
            this.bizData = zimValidatePbGwRequestPB.bizData;
        }
    }

    public ZimValidatePbGwRequestPB() {
    }

    public final ZimValidatePbGwRequestPB fillTagValue(int i, Object obj) {
        int max = dispatchOnCancelled.setMax(i);
        if (i != max) {
            onCanceled oncanceled = new onCanceled(i, max, 1);
            onCancelLoad.setMax(195962848, oncanceled);
            onCancelLoad.getMin(195962848, oncanceled);
        }
        if (i == 1) {
            this.zimId = (String) obj;
        } else if (i == 2) {
            this.zimData = (printConnMonitorLog) obj;
        } else if (i == 3) {
            this.bizData = (MapStringString) obj;
        }
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ZimValidatePbGwRequestPB)) {
            return false;
        }
        ZimValidatePbGwRequestPB zimValidatePbGwRequestPB = (ZimValidatePbGwRequestPB) obj;
        return equals((Object) this.zimId, (Object) zimValidatePbGwRequestPB.zimId) && equals((Object) this.zimData, (Object) zimValidatePbGwRequestPB.zimData) && equals((Object) this.bizData, (Object) zimValidatePbGwRequestPB.bizData);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        String str = this.zimId;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 37;
        printConnMonitorLog printconnmonitorlog = this.zimData;
        int hashCode2 = (hashCode + (printconnmonitorlog != null ? printconnmonitorlog.hashCode() : 0)) * 37;
        MapStringString mapStringString = this.bizData;
        if (mapStringString != null) {
            i2 = mapStringString.hashCode();
        }
        int i3 = hashCode2 + i2;
        this.hashCode = i3;
        return i3;
    }
}
