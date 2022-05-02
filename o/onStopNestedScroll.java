package o;

import android.os.Trace;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

@RequiresApi(18)
public final class onStopNestedScroll {
    public static void getMin(@NonNull String str) {
        Trace.beginSection(str);
    }

    public static void length() {
        Trace.endSection();
    }
}
