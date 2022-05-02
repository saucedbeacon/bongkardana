package o;

import android.app.ActivityOptions;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

public class name {
    @Nullable
    public Bundle length() {
        return null;
    }

    @NonNull
    public static name getMax(@NonNull Context context, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 16) {
            return new getMin(ActivityOptions.makeCustomAnimation(context, i, i2));
        }
        return new name();
    }

    @RequiresApi(16)
    static class getMin extends name {
        private final ActivityOptions length;

        getMin(ActivityOptions activityOptions) {
            this.length = activityOptions;
        }

        public Bundle length() {
            return this.length.toBundle();
        }
    }

    protected name() {
    }
}
