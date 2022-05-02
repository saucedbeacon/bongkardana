package o;

import android.os.Bundle;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public final class rate {
    @ColorInt
    @Nullable
    public final Integer getMax;
    @ColorInt
    @Nullable
    public final Integer getMin;
    @ColorInt
    @Nullable
    public final Integer length;
    @ColorInt
    @Nullable
    public final Integer setMin;

    public static final class length {
        @ColorInt
        @Nullable
        public Integer getMax;
        @ColorInt
        @Nullable
        public Integer getMin;
        @ColorInt
        @Nullable
        public Integer length;
        @ColorInt
        @Nullable
        public Integer setMax;
    }

    public rate(@ColorInt @Nullable Integer num, @ColorInt @Nullable Integer num2, @ColorInt @Nullable Integer num3, @ColorInt @Nullable Integer num4) {
        this.setMin = num;
        this.getMax = num2;
        this.length = num3;
        this.getMin = num4;
    }

    @NonNull
    public final Bundle getMax() {
        Bundle bundle = new Bundle();
        Integer num = this.setMin;
        if (num != null) {
            bundle.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", num.intValue());
        }
        Integer num2 = this.getMax;
        if (num2 != null) {
            bundle.putInt("android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR", num2.intValue());
        }
        Integer num3 = this.length;
        if (num3 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR", num3.intValue());
        }
        Integer num4 = this.getMin;
        if (num4 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_DIVIDER_COLOR", num4.intValue());
        }
        return bundle;
    }
}
