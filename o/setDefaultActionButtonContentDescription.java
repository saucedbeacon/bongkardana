package o;

import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.room.ColumnInfo;
import androidx.work.NetworkType;

public final class setDefaultActionButtonContentDescription {
    public static final setDefaultActionButtonContentDescription getMax = new setDefaultActionButtonContentDescription(new getMax());
    @ColumnInfo(name = "trigger_max_content_delay")
    public long IsOverlapping = -1;
    @ColumnInfo(name = "content_uri_triggers")
    public AlertDialogLayout equals = new AlertDialogLayout();
    @ColumnInfo(name = "requires_device_idle")
    public boolean getMin;
    @ColumnInfo(name = "trigger_content_update_delay")
    public long isInside = -1;
    @ColumnInfo(name = "required_network_type")
    public NetworkType length = NetworkType.NOT_REQUIRED;
    @ColumnInfo(name = "requires_charging")
    public boolean setMax;
    @ColumnInfo(name = "requires_battery_not_low")
    public boolean setMin;
    @ColumnInfo(name = "requires_storage_not_low")
    public boolean toFloatRange;

    public static final class getMax {
        AlertDialogLayout IsOverlapping = new AlertDialogLayout();
        public boolean getMax = false;
        public boolean getMin = false;
        long isInside = -1;
        boolean length = false;
        boolean setMax = false;
        public NetworkType setMin = NetworkType.NOT_REQUIRED;
        long toIntRange = -1;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public setDefaultActionButtonContentDescription() {
    }

    public setDefaultActionButtonContentDescription(getMax getmax) {
        this.setMax = getmax.getMin;
        this.getMin = Build.VERSION.SDK_INT >= 23 && getmax.setMax;
        this.length = getmax.setMin;
        this.setMin = getmax.getMax;
        this.toFloatRange = getmax.length;
        if (Build.VERSION.SDK_INT >= 24) {
            this.equals = getmax.IsOverlapping;
            this.isInside = getmax.toIntRange;
            this.IsOverlapping = getmax.isInside;
        }
    }

    public setDefaultActionButtonContentDescription(@NonNull setDefaultActionButtonContentDescription setdefaultactionbuttoncontentdescription) {
        this.setMax = setdefaultactionbuttoncontentdescription.setMax;
        this.getMin = setdefaultactionbuttoncontentdescription.getMin;
        this.length = setdefaultactionbuttoncontentdescription.length;
        this.setMin = setdefaultactionbuttoncontentdescription.setMin;
        this.toFloatRange = setdefaultactionbuttoncontentdescription.toFloatRange;
        this.equals = setdefaultactionbuttoncontentdescription.equals;
    }

    public final boolean length() {
        return this.setMax;
    }

    @RequiresApi(23)
    public final boolean setMin() {
        return this.getMin;
    }

    public final boolean getMin() {
        return this.setMin;
    }

    public final boolean getMax() {
        return this.toFloatRange;
    }

    @RequiresApi(24)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final boolean setMax() {
        return this.equals.setMin.size() > 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        setDefaultActionButtonContentDescription setdefaultactionbuttoncontentdescription = (setDefaultActionButtonContentDescription) obj;
        if (this.setMax == setdefaultactionbuttoncontentdescription.setMax && this.getMin == setdefaultactionbuttoncontentdescription.getMin && this.setMin == setdefaultactionbuttoncontentdescription.setMin && this.toFloatRange == setdefaultactionbuttoncontentdescription.toFloatRange && this.isInside == setdefaultactionbuttoncontentdescription.isInside && this.IsOverlapping == setdefaultactionbuttoncontentdescription.IsOverlapping && this.length == setdefaultactionbuttoncontentdescription.length) {
            return this.equals.equals(setdefaultactionbuttoncontentdescription.equals);
        }
        return false;
    }

    public final int hashCode() {
        long j = this.isInside;
        long j2 = this.IsOverlapping;
        return (((((((((((((this.length.hashCode() * 31) + (this.setMax ? 1 : 0)) * 31) + (this.getMin ? 1 : 0)) * 31) + (this.setMin ? 1 : 0)) * 31) + (this.toFloatRange ? 1 : 0)) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.equals.hashCode();
    }
}
