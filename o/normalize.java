package o;

import com.zoloz.wire.Message;
import com.zoloz.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class normalize extends Message {
    public static final printConnMonitorLog DEFAULT_CONTENT = printConnMonitorLog.EMPTY;
    public static final List<flagRemovedAndOffsetPosition> DEFAULT_FACEINFOS = Collections.emptyList();
    public static final Integer DEFAULT_IDX = 0;
    public static final String DEFAULT_SUBTYPE = "";
    public static final String DEFAULT_TYPE = "";
    public static final String DEFAULT_VERSION = "blobElemVersion";
    public static final int TAG_CONTENT = 5;
    public static final int TAG_DOCINFO = 7;
    public static final int TAG_FACEINFOS = 6;
    public static final int TAG_IDX = 3;
    public static final int TAG_SUBTYPE = 2;
    public static final int TAG_TYPE = 1;
    public static final int TAG_VERSION = 4;
    @ProtoField(tag = 5, type = Message.Datatype.BYTES)
    public printConnMonitorLog content;
    @ProtoField(tag = 7)
    public shouldIgnore docInfo;
    @ProtoField(label = Message.Label.REPEATED, tag = 6)
    public List<flagRemovedAndOffsetPosition> faceInfos;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public Integer idx;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public String subType;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public String type;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public String version;

    public normalize(normalize normalize) {
        super(normalize);
        if (normalize != null) {
            this.type = normalize.type;
            this.subType = normalize.subType;
            this.idx = normalize.idx;
            this.version = normalize.version;
            this.content = normalize.content;
            this.faceInfos = copyOf(normalize.faceInfos);
            this.docInfo = normalize.docInfo;
        }
    }

    public normalize() {
    }

    public final normalize fillTagValue(int i, Object obj) {
        switch (i) {
            case 1:
                this.type = (String) obj;
                break;
            case 2:
                this.subType = (String) obj;
                break;
            case 3:
                this.idx = (Integer) obj;
                break;
            case 4:
                this.version = (String) obj;
                break;
            case 5:
                this.content = (printConnMonitorLog) obj;
                break;
            case 6:
                this.faceInfos = immutableCopyOf((List) obj);
                break;
            case 7:
                this.docInfo = (shouldIgnore) obj;
                break;
        }
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof normalize)) {
            return false;
        }
        normalize normalize = (normalize) obj;
        return equals((Object) this.type, (Object) normalize.type) && equals((Object) this.subType, (Object) normalize.subType) && equals((Object) this.idx, (Object) normalize.idx) && equals((Object) this.version, (Object) normalize.version) && equals((Object) this.content, (Object) normalize.content) && equals((List<?>) this.faceInfos, (List<?>) normalize.faceInfos) && equals((Object) this.docInfo, (Object) normalize.docInfo);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        String str = this.type;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 37;
        String str2 = this.subType;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 37;
        Integer num = this.idx;
        int hashCode3 = (hashCode2 + (num != null ? num.hashCode() : 0)) * 37;
        String str3 = this.version;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        printConnMonitorLog printconnmonitorlog = this.content;
        int hashCode5 = (hashCode4 + (printconnmonitorlog != null ? printconnmonitorlog.hashCode() : 0)) * 37;
        List<flagRemovedAndOffsetPosition> list = this.faceInfos;
        int hashCode6 = (hashCode5 + (list != null ? list.hashCode() : 1)) * 37;
        shouldIgnore shouldignore = this.docInfo;
        if (shouldignore != null) {
            i2 = shouldignore.hashCode();
        }
        int i3 = hashCode6 + i2;
        this.hashCode = i3;
        return i3;
    }
}
