package com.alipay.bis.common.service.facade.gw.pbmodel.face;

import com.zoloz.wire.Message;
import com.zoloz.wire.ProtoField;
import o.printConnMonitorLog;

public final class BisVideo extends Message {
    public static final Integer DEFAULT_BITRATE = 0;
    public static final printConnMonitorLog DEFAULT_CONTENT = printConnMonitorLog.EMPTY;
    public static final Integer DEFAULT_DURATION = 0;
    public static final String DEFAULT_FILEID = "";
    public static final Integer DEFAULT_FPS = 0;
    public static final Integer DEFAULT_HEIGHT = 0;
    public static final Integer DEFAULT_SIZE = 0;
    public static final Integer DEFAULT_WIDTH = 0;
    public static final int TAG_BITRATE = 5;
    public static final int TAG_CONTENT = 1;
    public static final int TAG_DURATION = 7;
    public static final int TAG_FILEID = 8;
    public static final int TAG_FPS = 6;
    public static final int TAG_HEIGHT = 3;
    public static final int TAG_SIZE = 4;
    public static final int TAG_WIDTH = 2;
    @ProtoField(label = Message.Label.REQUIRED, tag = 5, type = Message.Datatype.INT32)
    public Integer bitrate;
    @ProtoField(label = Message.Label.REQUIRED, tag = 1, type = Message.Datatype.BYTES)
    public printConnMonitorLog content;
    @ProtoField(label = Message.Label.REQUIRED, tag = 7, type = Message.Datatype.INT32)
    public Integer duration;
    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public String fileid;
    @ProtoField(label = Message.Label.REQUIRED, tag = 6, type = Message.Datatype.INT32)
    public Integer fps;
    @ProtoField(label = Message.Label.REQUIRED, tag = 3, type = Message.Datatype.INT32)
    public Integer height;
    @ProtoField(label = Message.Label.REQUIRED, tag = 4, type = Message.Datatype.INT32)
    public Integer size;
    @ProtoField(label = Message.Label.REQUIRED, tag = 2, type = Message.Datatype.INT32)
    public Integer width;

    public BisVideo(BisVideo bisVideo) {
        super(bisVideo);
        if (bisVideo != null) {
            this.content = bisVideo.content;
            this.width = bisVideo.width;
            this.height = bisVideo.height;
            this.size = bisVideo.size;
            this.bitrate = bisVideo.bitrate;
            this.fps = bisVideo.fps;
            this.duration = bisVideo.duration;
            this.fileid = bisVideo.fileid;
        }
    }

    public BisVideo() {
    }

    public final BisVideo fillTagValue(int i, Object obj) {
        switch (i) {
            case 1:
                this.content = (printConnMonitorLog) obj;
                break;
            case 2:
                this.width = (Integer) obj;
                break;
            case 3:
                this.height = (Integer) obj;
                break;
            case 4:
                this.size = (Integer) obj;
                break;
            case 5:
                this.bitrate = (Integer) obj;
                break;
            case 6:
                this.fps = (Integer) obj;
                break;
            case 7:
                this.duration = (Integer) obj;
                break;
            case 8:
                this.fileid = (String) obj;
                break;
        }
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BisVideo)) {
            return false;
        }
        BisVideo bisVideo = (BisVideo) obj;
        return equals((Object) this.content, (Object) bisVideo.content) && equals((Object) this.width, (Object) bisVideo.width) && equals((Object) this.height, (Object) bisVideo.height) && equals((Object) this.size, (Object) bisVideo.size) && equals((Object) this.bitrate, (Object) bisVideo.bitrate) && equals((Object) this.fps, (Object) bisVideo.fps) && equals((Object) this.duration, (Object) bisVideo.duration) && equals((Object) this.fileid, (Object) bisVideo.fileid);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        printConnMonitorLog printconnmonitorlog = this.content;
        int i2 = 0;
        int hashCode = (printconnmonitorlog != null ? printconnmonitorlog.hashCode() : 0) * 37;
        Integer num = this.width;
        int hashCode2 = (hashCode + (num != null ? num.hashCode() : 0)) * 37;
        Integer num2 = this.height;
        int hashCode3 = (hashCode2 + (num2 != null ? num2.hashCode() : 0)) * 37;
        Integer num3 = this.size;
        int hashCode4 = (hashCode3 + (num3 != null ? num3.hashCode() : 0)) * 37;
        Integer num4 = this.bitrate;
        int hashCode5 = (hashCode4 + (num4 != null ? num4.hashCode() : 0)) * 37;
        Integer num5 = this.fps;
        int hashCode6 = (hashCode5 + (num5 != null ? num5.hashCode() : 0)) * 37;
        Integer num6 = this.duration;
        int hashCode7 = (hashCode6 + (num6 != null ? num6.hashCode() : 0)) * 37;
        String str = this.fileid;
        if (str != null) {
            i2 = str.hashCode();
        }
        int i3 = hashCode7 + i2;
        this.hashCode = i3;
        return i3;
    }
}
