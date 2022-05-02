package o;

import androidx.annotation.NonNull;

public final class onTextContextMenuItem {
    private boolean getMin;
    private boolean length;
    private boolean setMax;
    private boolean setMin;

    public onTextContextMenuItem(boolean z, boolean z2, boolean z3, boolean z4) {
        this.setMin = z;
        this.setMax = z2;
        this.length = z3;
        this.getMin = z4;
    }

    public final boolean getMax() {
        return this.setMin;
    }

    public final boolean setMax() {
        return this.setMax;
    }

    public final boolean getMin() {
        return this.length;
    }

    public final boolean length() {
        return this.getMin;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof onTextContextMenuItem)) {
            return false;
        }
        onTextContextMenuItem ontextcontextmenuitem = (onTextContextMenuItem) obj;
        return this.setMin == ontextcontextmenuitem.setMin && this.setMax == ontextcontextmenuitem.setMax && this.length == ontextcontextmenuitem.length && this.getMin == ontextcontextmenuitem.getMin;
    }

    public final int hashCode() {
        int i = this.setMin ? 1 : 0;
        if (this.setMax) {
            i += 16;
        }
        if (this.length) {
            i += 256;
        }
        return this.getMin ? i + 4096 : i;
    }

    @NonNull
    public final String toString() {
        return String.format("[ Connected=%b Validated=%b Metered=%b NotRoaming=%b ]", new Object[]{Boolean.valueOf(this.setMin), Boolean.valueOf(this.setMax), Boolean.valueOf(this.length), Boolean.valueOf(this.getMin)});
    }
}
