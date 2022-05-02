package o;

import com.zoloz.wire.Message;
import com.zoloz.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class flagRemovedAndOffsetPosition extends Message {
    public static final Float DEFAULT_CONFIDENCE;
    public static final String DEFAULT_FEATURE = "";
    public static final String DEFAULT_FEAVERSION = "";
    public static final List<clearOldPosition> DEFAULT_POINTS = Collections.emptyList();
    public static final Float DEFAULT_QUALITY;
    public static final int TAG_CONFIDENCE = 3;
    public static final int TAG_FEATURE = 5;
    public static final int TAG_FEAVERSION = 6;
    public static final int TAG_POINTS = 2;
    public static final int TAG_QUALITY = 4;
    public static final int TAG_RECT = 1;
    @ProtoField(tag = 3, type = Message.Datatype.FLOAT)
    public Float confidence;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public String feaVersion;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public String feature;
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public List<clearOldPosition> points;
    @ProtoField(tag = 4, type = Message.Datatype.FLOAT)
    public Float quality;
    @ProtoField(tag = 1)
    public offsetPosition rect;

    static {
        Float valueOf = Float.valueOf(0.0f);
        DEFAULT_CONFIDENCE = valueOf;
        DEFAULT_QUALITY = valueOf;
    }

    public flagRemovedAndOffsetPosition(flagRemovedAndOffsetPosition flagremovedandoffsetposition) {
        super(flagremovedandoffsetposition);
        if (flagremovedandoffsetposition != null) {
            this.rect = flagremovedandoffsetposition.rect;
            this.points = copyOf(flagremovedandoffsetposition.points);
            this.confidence = flagremovedandoffsetposition.confidence;
            this.quality = flagremovedandoffsetposition.quality;
            this.feature = flagremovedandoffsetposition.feature;
            this.feaVersion = flagremovedandoffsetposition.feaVersion;
        }
    }

    public flagRemovedAndOffsetPosition() {
    }

    public final flagRemovedAndOffsetPosition fillTagValue(int i, Object obj) {
        switch (i) {
            case 1:
                this.rect = (offsetPosition) obj;
                break;
            case 2:
                this.points = immutableCopyOf((List) obj);
                break;
            case 3:
                this.confidence = (Float) obj;
                break;
            case 4:
                this.quality = (Float) obj;
                break;
            case 5:
                this.feature = (String) obj;
                break;
            case 6:
                this.feaVersion = (String) obj;
                break;
        }
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof flagRemovedAndOffsetPosition)) {
            return false;
        }
        flagRemovedAndOffsetPosition flagremovedandoffsetposition = (flagRemovedAndOffsetPosition) obj;
        return equals((Object) this.rect, (Object) flagremovedandoffsetposition.rect) && equals((List<?>) this.points, (List<?>) flagremovedandoffsetposition.points) && equals((Object) this.confidence, (Object) flagremovedandoffsetposition.confidence) && equals((Object) this.quality, (Object) flagremovedandoffsetposition.quality) && equals((Object) this.feature, (Object) flagremovedandoffsetposition.feature) && equals((Object) this.feaVersion, (Object) flagremovedandoffsetposition.feaVersion);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        offsetPosition offsetposition = this.rect;
        int i2 = 0;
        int hashCode = (offsetposition != null ? offsetposition.hashCode() : 0) * 37;
        List<clearOldPosition> list = this.points;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 1)) * 37;
        Float f = this.confidence;
        int hashCode3 = (hashCode2 + (f != null ? f.hashCode() : 0)) * 37;
        Float f2 = this.quality;
        int hashCode4 = (hashCode3 + (f2 != null ? f2.hashCode() : 0)) * 37;
        String str = this.feature;
        int hashCode5 = (hashCode4 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.feaVersion;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        int i3 = hashCode5 + i2;
        this.hashCode = i3;
        return i3;
    }
}
