package o;

import android.content.Intent;
import id.dana.base.BaseActivity;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0002\b\u0003\u0018\u00010\bH\u0016J\u001a\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\f\u001a\u00020\rH\u0016R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lid/dana/challenge/FragmentChallengeControl;", "Lid/dana/challenge/ChallengeControlFacade;", "baseFragment", "Lid/dana/base/BaseFragment;", "(Lid/dana/base/BaseFragment;)V", "createIntent", "Landroid/content/Intent;", "clazz", "Ljava/lang/Class;", "start", "", "intent", "requestCode", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class internalEndTransaction implements assertNotSuspendingTransaction {
    private final FtsOptions$Order getMax;

    public internalEndTransaction(@Nullable FtsOptions$Order ftsOptions$Order) {
        this.getMax = ftsOptions$Order;
    }

    @NotNull
    public final Intent setMax(@Nullable Class<?> cls) {
        BaseActivity baseActivity;
        FtsOptions$Order ftsOptions$Order = this.getMax;
        if (ftsOptions$Order != null) {
            baseActivity = ftsOptions$Order.getMax;
        } else {
            baseActivity = null;
        }
        return new Intent(baseActivity, cls);
    }

    public final void length(@Nullable Intent intent, int i) {
        FtsOptions$Order ftsOptions$Order = this.getMax;
        if (ftsOptions$Order != null) {
            ftsOptions$Order.startActivityForResult(intent, i);
        }
    }
}
