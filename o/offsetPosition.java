package o;

import com.zoloz.wire.Message;
import com.zoloz.wire.ProtoField;

public final class offsetPosition extends Message {
    public static final Integer DEFAULT_BOTTOM = 0;
    public static final Integer DEFAULT_LEFT = 0;
    public static final Integer DEFAULT_RIGHT = 0;
    public static final Integer DEFAULT_TOP = 0;
    public static final int TAG_BOTTOM = 4;
    public static final int TAG_LEFT = 1;
    public static final int TAG_RIGHT = 3;
    public static final int TAG_TOP = 2;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public Integer bottom;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public Integer left;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public Integer right;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public Integer top;

    public offsetPosition(offsetPosition offsetposition) {
        super(offsetposition);
        if (offsetposition != null) {
            this.left = offsetposition.left;
            this.top = offsetposition.top;
            this.right = offsetposition.right;
            this.bottom = offsetposition.bottom;
        }
    }

    public offsetPosition() {
    }

    public final offsetPosition fillTagValue(int i, Object obj) {
        if (i == 1) {
            this.left = (Integer) obj;
        } else if (i == 2) {
            this.top = (Integer) obj;
        } else if (i == 3) {
            this.right = (Integer) obj;
        } else if (i == 4) {
            this.bottom = (Integer) obj;
        }
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof offsetPosition)) {
            return false;
        }
        offsetPosition offsetposition = (offsetPosition) obj;
        return equals((Object) this.left, (Object) offsetposition.left) && equals((Object) this.top, (Object) offsetposition.top) && equals((Object) this.right, (Object) offsetposition.right) && equals((Object) this.bottom, (Object) offsetposition.bottom);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        Integer num = this.left;
        int i2 = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 37;
        Integer num2 = this.top;
        int hashCode2 = (hashCode + (num2 != null ? num2.hashCode() : 0)) * 37;
        Integer num3 = this.right;
        int hashCode3 = (hashCode2 + (num3 != null ? num3.hashCode() : 0)) * 37;
        Integer num4 = this.bottom;
        if (num4 != null) {
            i2 = num4.hashCode();
        }
        int i3 = hashCode3 + i2;
        this.hashCode = i3;
        return i3;
    }
}
