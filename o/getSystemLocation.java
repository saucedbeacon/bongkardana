package o;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class getSystemLocation {
    @NonNull
    public String getMax;
    @Nullable
    public String getMin;

    public getSystemLocation() {
        this.getMax = "control";
    }

    public getSystemLocation(@NonNull String str, @Nullable String str2) {
        this.getMax = str;
        this.getMin = str2;
    }
}
