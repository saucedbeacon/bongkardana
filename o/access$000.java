package o;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import o.isInteractionEnabled;

public final class access$000 extends getDependencies<setPivotY, fireTrigger<?>> implements isInteractionEnabled {
    private isInteractionEnabled.setMin setMax;

    public final /* bridge */ /* synthetic */ void getMin(@NonNull Object obj, @Nullable Object obj2) {
        fireTrigger firetrigger = (fireTrigger) obj2;
        isInteractionEnabled.setMin setmin = this.setMax;
        if (setmin != null && firetrigger != null) {
            setmin.getMin(firetrigger);
        }
    }

    @Nullable
    public final /* bridge */ /* synthetic */ fireTrigger length(@NonNull setPivotY setpivoty) {
        return (fireTrigger) super.length(setpivoty);
    }

    public final /* bridge */ /* synthetic */ int setMax(@Nullable Object obj) {
        fireTrigger firetrigger = (fireTrigger) obj;
        if (firetrigger == null) {
            return super.setMax(null);
        }
        return firetrigger.setMax();
    }

    @Nullable
    public final /* synthetic */ fireTrigger setMin(@NonNull setPivotY setpivoty, @Nullable fireTrigger firetrigger) {
        return (fireTrigger) super.length(setpivoty, firetrigger);
    }

    public access$000(long j) {
        super(j);
    }

    public final void getMax(@NonNull isInteractionEnabled.setMin setmin) {
        this.setMax = setmin;
    }

    @SuppressLint({"InlinedApi"})
    public final void getMax(int i) {
        if (i >= 40) {
            getMax();
        } else if (i >= 20 || i == 15) {
            setMax(length() / 2);
        }
    }
}
