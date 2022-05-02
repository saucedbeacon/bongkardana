package o;

import com.zoloz.wire.Message;
import com.zoloz.wire.ProtoField;

public final class saveOldPosition extends Message {
    public static final String DEFAULT_FEATURE = "";
    public static final String DEFAULT_FEAVER = "";
    public static final String DEFAULT_NAME = "";
    public static final String DEFAULT_VALUE = "";
    public static final int TAG_FEATURE = 3;
    public static final int TAG_FEAVER = 4;
    public static final int TAG_NAME = 1;
    public static final int TAG_VALUE = 2;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public String feaVer;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public String feature;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public String name;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public String value;

    public saveOldPosition(saveOldPosition saveoldposition) {
        super(saveoldposition);
        if (saveoldposition != null) {
            this.name = saveoldposition.name;
            this.value = saveoldposition.value;
            this.feature = saveoldposition.feature;
            this.feaVer = saveoldposition.feaVer;
        }
    }

    public saveOldPosition() {
    }

    public final saveOldPosition fillTagValue(int i, Object obj) {
        if (i == 1) {
            this.name = (String) obj;
        } else if (i == 2) {
            this.value = (String) obj;
        } else if (i == 3) {
            this.feature = (String) obj;
        } else if (i == 4) {
            this.feaVer = (String) obj;
        }
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof saveOldPosition)) {
            return false;
        }
        saveOldPosition saveoldposition = (saveOldPosition) obj;
        return equals((Object) this.name, (Object) saveoldposition.name) && equals((Object) this.value, (Object) saveoldposition.value) && equals((Object) this.feature, (Object) saveoldposition.feature) && equals((Object) this.feaVer, (Object) saveoldposition.feaVer);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        String str = this.name;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 37;
        String str2 = this.value;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.feature;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.feaVer;
        if (str4 != null) {
            i2 = str4.hashCode();
        }
        int i3 = hashCode3 + i2;
        this.hashCode = i3;
        return i3;
    }
}
