package o;

import android.content.SharedPreferences;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.AppNode;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0006H\u0002J\u0010\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\rH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/twilio/verify/data/DateAdapter;", "Lcom/twilio/verify/data/DateProvider;", "preferences", "Landroid/content/SharedPreferences;", "(Landroid/content/SharedPreferences;)V", "getCurrentTime", "", "localTime", "saveTime", "", "time", "syncTime", "date", "", "verify_release"}, k = 1, mv = {1, 1, 16})
public final class onItemRangeInserted implements RecyclerView$ItemAnimator$AdapterChanges {
    private final SharedPreferences length;

    public onItemRangeInserted(@NotNull SharedPreferences sharedPreferences) {
        Intrinsics.checkParameterIsNotNull(sharedPreferences, "preferences");
        this.length = sharedPreferences;
    }

    public final long getMin() {
        return TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()) + this.length.getLong("timeCorrection", 0);
    }

    public final void setMax(@NotNull String str) {
        Intrinsics.checkParameterIsNotNull(str, AppNode.AnonymousClass2.KEY_DATE);
        long time = onItemRangeRemoved.setMin(str).getTime();
        this.length.edit().putLong("timeCorrection", TimeUnit.MILLISECONDS.toSeconds(time) - TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis())).apply();
    }
}
