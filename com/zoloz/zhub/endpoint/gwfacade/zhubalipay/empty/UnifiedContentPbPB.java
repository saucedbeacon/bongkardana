package com.zoloz.zhub.endpoint.gwfacade.zhubalipay.empty;

import com.zoloz.wire.Message;
import com.zoloz.wire.ProtoField;
import com.zoloz.zhub.endpoint.gwfacade.zhubalipay.empty.UnifiedContentPb.MetaPbPB;
import o.getOldPosition;

public final class UnifiedContentPbPB extends Message {
    public static final int TAG_BLOB = 2;
    public static final int TAG_META = 1;
    @ProtoField(tag = 2)
    public getOldPosition blob;
    @ProtoField(tag = 1)
    public MetaPbPB meta;

    public UnifiedContentPbPB(UnifiedContentPbPB unifiedContentPbPB) {
        super(unifiedContentPbPB);
        if (unifiedContentPbPB != null) {
            this.meta = unifiedContentPbPB.meta;
            this.blob = unifiedContentPbPB.blob;
        }
    }

    public UnifiedContentPbPB() {
    }

    public final UnifiedContentPbPB fillTagValue(int i, Object obj) {
        if (i == 1) {
            this.meta = (MetaPbPB) obj;
        } else if (i == 2) {
            this.blob = (getOldPosition) obj;
        }
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UnifiedContentPbPB)) {
            return false;
        }
        UnifiedContentPbPB unifiedContentPbPB = (UnifiedContentPbPB) obj;
        return equals((Object) this.meta, (Object) unifiedContentPbPB.meta) && equals((Object) this.blob, (Object) unifiedContentPbPB.blob);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        MetaPbPB metaPbPB = this.meta;
        int i2 = 0;
        int hashCode = (metaPbPB != null ? metaPbPB.hashCode() : 0) * 37;
        getOldPosition getoldposition = this.blob;
        if (getoldposition != null) {
            i2 = getoldposition.hashCode();
        }
        int i3 = hashCode + i2;
        this.hashCode = i3;
        return i3;
    }
}
