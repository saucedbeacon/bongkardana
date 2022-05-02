package o;

import com.zoloz.wire.Message;
import com.zoloz.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class shouldIgnore extends Message {
    public static final String DEFAULT_DOCTYPE = "";
    public static final List<saveOldPosition> DEFAULT_FIELDS = Collections.emptyList();
    public static final Integer DEFAULT_PAGENO = 0;
    public static final List<clearOldPosition> DEFAULT_REGION = Collections.emptyList();
    public static final int TAG_DOCTYPE = 1;
    public static final int TAG_FACERECT = 5;
    public static final int TAG_FIELDS = 4;
    public static final int TAG_PAGENO = 2;
    public static final int TAG_REGION = 3;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public String docType;
    @ProtoField(tag = 5)
    public offsetPosition faceRect;
    @ProtoField(label = Message.Label.REPEATED, tag = 4)
    public List<saveOldPosition> fields;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public Integer pageNo;
    @ProtoField(label = Message.Label.REPEATED, tag = 3)
    public List<clearOldPosition> region;

    public shouldIgnore(shouldIgnore shouldignore) {
        super(shouldignore);
        if (shouldignore != null) {
            this.docType = shouldignore.docType;
            this.pageNo = shouldignore.pageNo;
            this.region = copyOf(shouldignore.region);
            this.fields = copyOf(shouldignore.fields);
            this.faceRect = shouldignore.faceRect;
        }
    }

    public shouldIgnore() {
    }

    public final shouldIgnore fillTagValue(int i, Object obj) {
        if (i == 1) {
            this.docType = (String) obj;
        } else if (i == 2) {
            this.pageNo = (Integer) obj;
        } else if (i == 3) {
            this.region = immutableCopyOf((List) obj);
        } else if (i == 4) {
            this.fields = immutableCopyOf((List) obj);
        } else if (i == 5) {
            this.faceRect = (offsetPosition) obj;
        }
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof shouldIgnore)) {
            return false;
        }
        shouldIgnore shouldignore = (shouldIgnore) obj;
        return equals((Object) this.docType, (Object) shouldignore.docType) && equals((Object) this.pageNo, (Object) shouldignore.pageNo) && equals((List<?>) this.region, (List<?>) shouldignore.region) && equals((List<?>) this.fields, (List<?>) shouldignore.fields) && equals((Object) this.faceRect, (Object) shouldignore.faceRect);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        String str = this.docType;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 37;
        Integer num = this.pageNo;
        int hashCode2 = (hashCode + (num != null ? num.hashCode() : 0)) * 37;
        List<clearOldPosition> list = this.region;
        int i3 = 1;
        int hashCode3 = (hashCode2 + (list != null ? list.hashCode() : 1)) * 37;
        List<saveOldPosition> list2 = this.fields;
        if (list2 != null) {
            i3 = list2.hashCode();
        }
        int i4 = (hashCode3 + i3) * 37;
        offsetPosition offsetposition = this.faceRect;
        if (offsetposition != null) {
            i2 = offsetposition.hashCode();
        }
        int i5 = i4 + i2;
        this.hashCode = i5;
        return i5;
    }
}
