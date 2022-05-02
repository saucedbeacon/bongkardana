package com.zoloz.zhub.endpoint.gwfacade.zhubalipay.empty;

import com.zoloz.wire.Message;
import com.zoloz.wire.ProtoField;

public final class EntryStringString extends Message {
    public static final String DEFAULT_KEY = "";
    public static final String DEFAULT_VALUE = "";
    public static final int TAG_KEY = 1;
    public static final int TAG_VALUE = 2;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public String key;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public String value;

    public EntryStringString(EntryStringString entryStringString) {
        super(entryStringString);
        if (entryStringString != null) {
            this.key = entryStringString.key;
            this.value = entryStringString.value;
        }
    }

    public EntryStringString() {
    }

    public final EntryStringString fillTagValue(int i, Object obj) {
        if (i == 1) {
            this.key = (String) obj;
        } else if (i == 2) {
            this.value = (String) obj;
        }
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof EntryStringString)) {
            return false;
        }
        EntryStringString entryStringString = (EntryStringString) obj;
        return equals((Object) this.key, (Object) entryStringString.key) && equals((Object) this.value, (Object) entryStringString.value);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        String str = this.key;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 37;
        String str2 = this.value;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        int i3 = hashCode + i2;
        this.hashCode = i3;
        return i3;
    }
}
