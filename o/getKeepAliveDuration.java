package o;

import androidx.annotation.NonNull;
import com.google.common.base.Preconditions;

public class getKeepAliveDuration {
    public final String getMax;
    public final String length;
    public final String setMax;

    public getKeepAliveDuration(@NonNull String str, @NonNull String str2, @NonNull String str3) {
        this.setMax = (String) Preconditions.checkNotNull(str);
        this.length = (String) Preconditions.checkNotNull(str2);
        this.getMax = (String) Preconditions.checkNotNull(str3);
    }
}
