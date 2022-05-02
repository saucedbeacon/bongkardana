package com.alipay.bis.common.service.facade.gw.pbmodel.face;

import com.zoloz.wire.Message;
import com.zoloz.wire.ProtoField;
import o.printConnMonitorLog;

public final class BisFaceImage extends Message {
    public static final printConnMonitorLog DEFAULT_CONTENT = printConnMonitorLog.EMPTY;
    public static final Integer DEFAULT_HEIGHT = 0;
    public static final Integer DEFAULT_QUALITY = 0;
    public static final Integer DEFAULT_RECTX = 0;
    public static final Integer DEFAULT_RECTY = 0;
    public static final Integer DEFAULT_TASKIDX = 0;
    public static final Integer DEFAULT_WIDTH = 0;
    public static final int TAG_CONTENT = 1;
    public static final int TAG_HEIGHT = 5;
    public static final int TAG_QUALITY = 6;
    public static final int TAG_RECTX = 2;
    public static final int TAG_RECTY = 3;
    public static final int TAG_TASKIDX = 7;
    public static final int TAG_WIDTH = 4;
    @ProtoField(label = Message.Label.REQUIRED, tag = 1, type = Message.Datatype.BYTES)
    public printConnMonitorLog content;
    @ProtoField(label = Message.Label.REQUIRED, tag = 5, type = Message.Datatype.INT32)
    public Integer height;
    @ProtoField(label = Message.Label.REQUIRED, tag = 6, type = Message.Datatype.INT32)
    public Integer quality;
    @ProtoField(label = Message.Label.REQUIRED, tag = 2, type = Message.Datatype.INT32)
    public Integer rectx;
    @ProtoField(label = Message.Label.REQUIRED, tag = 3, type = Message.Datatype.INT32)
    public Integer recty;
    @ProtoField(label = Message.Label.REQUIRED, tag = 7, type = Message.Datatype.INT32)
    public Integer taskidx;
    @ProtoField(label = Message.Label.REQUIRED, tag = 4, type = Message.Datatype.INT32)
    public Integer width;

    public BisFaceImage(BisFaceImage bisFaceImage) {
        super(bisFaceImage);
        if (bisFaceImage != null) {
            this.content = bisFaceImage.content;
            this.rectx = bisFaceImage.rectx;
            this.recty = bisFaceImage.recty;
            this.width = bisFaceImage.width;
            this.height = bisFaceImage.height;
            this.quality = bisFaceImage.quality;
            this.taskidx = bisFaceImage.taskidx;
        }
    }

    public BisFaceImage() {
    }

    public final BisFaceImage fillTagValue(int i, Object obj) {
        switch (i) {
            case 1:
                this.content = (printConnMonitorLog) obj;
                break;
            case 2:
                this.rectx = (Integer) obj;
                break;
            case 3:
                this.recty = (Integer) obj;
                break;
            case 4:
                this.width = (Integer) obj;
                break;
            case 5:
                this.height = (Integer) obj;
                break;
            case 6:
                this.quality = (Integer) obj;
                break;
            case 7:
                this.taskidx = (Integer) obj;
                break;
        }
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BisFaceImage)) {
            return false;
        }
        BisFaceImage bisFaceImage = (BisFaceImage) obj;
        return equals((Object) this.content, (Object) bisFaceImage.content) && equals((Object) this.rectx, (Object) bisFaceImage.rectx) && equals((Object) this.recty, (Object) bisFaceImage.recty) && equals((Object) this.width, (Object) bisFaceImage.width) && equals((Object) this.height, (Object) bisFaceImage.height) && equals((Object) this.quality, (Object) bisFaceImage.quality) && equals((Object) this.taskidx, (Object) bisFaceImage.taskidx);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        printConnMonitorLog printconnmonitorlog = this.content;
        int i2 = 0;
        int hashCode = (printconnmonitorlog != null ? printconnmonitorlog.hashCode() : 0) * 37;
        Integer num = this.rectx;
        int hashCode2 = (hashCode + (num != null ? num.hashCode() : 0)) * 37;
        Integer num2 = this.recty;
        int hashCode3 = (hashCode2 + (num2 != null ? num2.hashCode() : 0)) * 37;
        Integer num3 = this.width;
        int hashCode4 = (hashCode3 + (num3 != null ? num3.hashCode() : 0)) * 37;
        Integer num4 = this.height;
        int hashCode5 = (hashCode4 + (num4 != null ? num4.hashCode() : 0)) * 37;
        Integer num5 = this.quality;
        int hashCode6 = (hashCode5 + (num5 != null ? num5.hashCode() : 0)) * 37;
        Integer num6 = this.taskidx;
        if (num6 != null) {
            i2 = num6.hashCode();
        }
        int i3 = hashCode6 + i2;
        this.hashCode = i3;
        return i3;
    }
}
