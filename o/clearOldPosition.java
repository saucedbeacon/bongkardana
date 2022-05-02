package o;

import com.zoloz.wire.Message;
import com.zoloz.wire.ProtoField;

public final class clearOldPosition extends Message {
    public static final Float DEFAULT_X;
    public static final Float DEFAULT_Y;
    public static final int TAG_X = 1;
    public static final int TAG_Y = 2;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public Integer x;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public Integer y;

    static {
        Float valueOf = Float.valueOf(0.0f);
        DEFAULT_X = valueOf;
        DEFAULT_Y = valueOf;
    }

    public clearOldPosition(clearOldPosition clearoldposition) {
        super(clearoldposition);
        if (clearoldposition != null) {
            this.x = clearoldposition.x;
            this.y = clearoldposition.y;
        }
    }

    public clearOldPosition() {
    }

    public final clearOldPosition fillTagValue(int i, Object obj) {
        if (i == 1) {
            this.x = (Integer) obj;
        } else if (i == 2) {
            this.y = (Integer) obj;
        }
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof clearOldPosition)) {
            return false;
        }
        clearOldPosition clearoldposition = (clearOldPosition) obj;
        return equals((Object) this.x, (Object) clearoldposition.x) && equals((Object) this.y, (Object) clearoldposition.y);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        Integer num = this.x;
        int i2 = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 37;
        Integer num2 = this.y;
        if (num2 != null) {
            i2 = num2.hashCode();
        }
        int i3 = hashCode + i2;
        this.hashCode = i3;
        return i3;
    }
}
