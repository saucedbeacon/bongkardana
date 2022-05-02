package o;

import android.content.Intent;
import id.dana.base.BaseActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0002\b\u0003\u0018\u00010\bH\u0016J\u001a\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\f\u001a\u00020\rH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lid/dana/challenge/ActivityChallengeControl;", "Lid/dana/challenge/ChallengeControlFacade;", "baseActivity", "Lid/dana/base/BaseActivity;", "(Lid/dana/base/BaseActivity;)V", "createIntent", "Landroid/content/Intent;", "clazz", "Ljava/lang/Class;", "start", "", "intent", "requestCode", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class unwrapOpenHelper implements assertNotSuspendingTransaction {
    private final BaseActivity getMin;

    public unwrapOpenHelper(@NotNull BaseActivity baseActivity) {
        Intrinsics.checkNotNullParameter(baseActivity, "baseActivity");
        this.getMin = baseActivity;
    }

    @NotNull
    public final Intent setMax(@Nullable Class<?> cls) {
        return new Intent(this.getMin, cls);
    }

    public final void length(@Nullable Intent intent, int i) {
        this.getMin.startActivityForResult(intent, i);
    }
}
