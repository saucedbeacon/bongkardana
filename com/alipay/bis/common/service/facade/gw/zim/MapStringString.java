package com.alipay.bis.common.service.facade.gw.zim;

import com.zoloz.wire.Message;
import com.zoloz.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class MapStringString extends Message {
    public static final List<EntryStringString> DEFAULT_ENTRIES = Collections.emptyList();
    public static final int TAG_ENTRIES = 1;
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public List<EntryStringString> entries;

    public MapStringString(MapStringString mapStringString) {
        super(mapStringString);
        if (mapStringString != null) {
            this.entries = copyOf(mapStringString.entries);
        }
    }

    public MapStringString() {
    }

    public final MapStringString fillTagValue(int i, Object obj) {
        if (i == 1) {
            this.entries = immutableCopyOf((List) obj);
        }
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MapStringString)) {
            return false;
        }
        return equals((List<?>) this.entries, (List<?>) ((MapStringString) obj).entries);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        List<EntryStringString> list = this.entries;
        int hashCode = list != null ? list.hashCode() : 1;
        this.hashCode = hashCode;
        return hashCode;
    }
}
