package o;

import com.zoloz.wire.Message;
import com.zoloz.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class getOldPosition extends Message {
    public static final List<normalize> DEFAULT_BLOBELEM = Collections.emptyList();
    public static final String DEFAULT_BLOBVERSION = "blobVersion";
    public static final int TAG_BLOBELEM = 2;
    public static final int TAG_BLOBVERSION = 1;
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public List<normalize> blobElem;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public String blobVersion;

    public getOldPosition(getOldPosition getoldposition) {
        super(getoldposition);
        if (getoldposition != null) {
            this.blobVersion = getoldposition.blobVersion;
            this.blobElem = copyOf(getoldposition.blobElem);
        }
    }

    public getOldPosition() {
    }

    public final getOldPosition fillTagValue(int i, Object obj) {
        if (i == 1) {
            this.blobVersion = (String) obj;
        } else if (i == 2) {
            this.blobElem = immutableCopyOf((List) obj);
        }
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof getOldPosition)) {
            return false;
        }
        getOldPosition getoldposition = (getOldPosition) obj;
        return equals((Object) this.blobVersion, (Object) getoldposition.blobVersion) && equals((List<?>) this.blobElem, (List<?>) getoldposition.blobElem);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        String str = this.blobVersion;
        int hashCode = (str != null ? str.hashCode() : 0) * 37;
        List<normalize> list = this.blobElem;
        int hashCode2 = hashCode + (list != null ? list.hashCode() : 1);
        this.hashCode = hashCode2;
        return hashCode2;
    }
}
