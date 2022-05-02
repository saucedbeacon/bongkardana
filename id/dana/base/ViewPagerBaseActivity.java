package id.dana.base;

import android.content.Context;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.FtsOptions$Order;
import o.IH5TinyPopMenu;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;
import o.onInvalidation;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\t\u001a\u00020\nJ\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u0006\u0010\r\u001a\u00020\nJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\nJ\u000f\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0002\b\u0010J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u001c\u0010\u0013\u001a\u00020\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0004J\u0010\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\nH\u0004R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u001a"}, d2 = {"Lid/dana/base/ViewPagerBaseActivity;", "Lid/dana/base/BaseActivity;", "()V", "viewPagerAdapter", "Lid/dana/utils/ViewPagerAdapter;", "getViewPagerAdapter", "()Lid/dana/utils/ViewPagerAdapter;", "setViewPagerAdapter", "(Lid/dana/utils/ViewPagerAdapter;)V", "getChildCount", "", "getCurrentFragment", "Lid/dana/base/BaseFragment;", "getCurrentPosition", "getFragment", "position", "getViewPagerAdapter$app_productionRelease", "onBackPressed", "", "registerViewPager", "viewPager", "Landroidx/viewpager/widget/ViewPager;", "fragmentPagerAdapter", "Lid/dana/base/BaseFragmentPagerStateAdapter;", "setCurrentPosition", "newPosition", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public abstract class ViewPagerBaseActivity extends BaseActivity {
    private HashMap getMax;
    @Nullable
    private IH5TinyPopMenu getMin;

    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.getMax;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        int min;
        int max;
        Context baseContext = getBaseContext();
        Context context = null;
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || -2050360022 == (max = dispatchOnCancelled.getMax(applicationContext, -2050360022)))) {
            onCanceled oncanceled = new onCanceled(-2050360022, max, 512);
            onCancelLoad.setMax(-2050360022, oncanceled);
            onCancelLoad.getMin(-2050360022, oncanceled);
        }
        Context baseContext2 = getBaseContext();
        if (baseContext2 != null) {
            context = baseContext2.getApplicationContext();
        }
        if (!(context == null || i == (min = dispatchOnCancelled.setMin(context, i)))) {
            onCanceled oncanceled2 = new onCanceled(i, min, 8);
            onCancelLoad.setMax(-2050360022, oncanceled2);
            onCancelLoad.getMin(-2050360022, oncanceled2);
        }
        if (this.getMax == null) {
            this.getMax = new HashMap();
        }
        View view = (View) this.getMax.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.getMax.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Nullable
    public final IH5TinyPopMenu getViewPagerAdapter() {
        return this.getMin;
    }

    public final void setViewPagerAdapter(@Nullable IH5TinyPopMenu iH5TinyPopMenu) {
        this.getMin = iH5TinyPopMenu;
    }

    public final void registerViewPager(@Nullable ViewPager viewPager, @Nullable onInvalidation oninvalidation) {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(244764241, oncanceled);
            onCancelLoad.getMin(244764241, oncanceled);
        }
        this.getMin = IH5TinyPopMenu.setMin(viewPager, oninvalidation);
    }

    public final int getCurrentPosition() {
        int max;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || 1409829928 == (max = dispatchOnCancelled.getMax(applicationContext, 1409829928)))) {
            onCanceled oncanceled = new onCanceled(1409829928, max, 512);
            onCancelLoad.setMax(1409829928, oncanceled);
            onCancelLoad.getMin(1409829928, oncanceled);
        }
        IH5TinyPopMenu iH5TinyPopMenu = this.getMin;
        if (iH5TinyPopMenu != null) {
            return iH5TinyPopMenu.setMin.getCurrentItem();
        }
        return 0;
    }

    public final void setCurrentPosition(int i) {
        int length;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length = dispatchOnCancelled.length(applicationContext, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, length, 4);
            onCancelLoad.setMax(1002557978, oncanceled);
            onCancelLoad.getMin(1002557978, oncanceled);
        }
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled2 = new onCanceled(0, max, 16);
            onCancelLoad.setMax(1002557978, oncanceled2);
            onCancelLoad.getMin(1002557978, oncanceled2);
        }
        IH5TinyPopMenu iH5TinyPopMenu = this.getMin;
        if (iH5TinyPopMenu != null && iH5TinyPopMenu != null) {
            iH5TinyPopMenu.setMin.setCurrentItem(i);
        }
    }

    @Nullable
    public final FtsOptions$Order getCurrentFragment() {
        IH5TinyPopMenu iH5TinyPopMenu = this.getMin;
        if (iH5TinyPopMenu != null) {
            return iH5TinyPopMenu.getMax.getMax(iH5TinyPopMenu.setMin.getCurrentItem());
        }
        return null;
    }

    @Nullable
    public final FtsOptions$Order getFragment(int i) {
        IH5TinyPopMenu iH5TinyPopMenu = this.getMin;
        if (iH5TinyPopMenu != null) {
            return iH5TinyPopMenu.getMax.getMax(i);
        }
        return null;
    }

    public final int getChildCount() {
        int max;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || 362893849 == (max = dispatchOnCancelled.getMax(applicationContext, 362893849)))) {
            onCanceled oncanceled = new onCanceled(362893849, max, 512);
            onCancelLoad.setMax(362893849, oncanceled);
            onCancelLoad.getMin(362893849, oncanceled);
        }
        IH5TinyPopMenu iH5TinyPopMenu = this.getMin;
        if (iH5TinyPopMenu != null) {
            return iH5TinyPopMenu.getMax.getCount();
        }
        return 0;
    }

    @Nullable
    public final IH5TinyPopMenu getViewPagerAdapter$app_productionRelease() {
        int length;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length)))) {
            onCanceled oncanceled = new onCanceled(length, min, 32);
            onCancelLoad.setMax(-531534547, oncanceled);
            onCancelLoad.getMin(-531534547, oncanceled);
        }
        return this.getMin;
    }

    public void onBackPressed() {
        IH5TinyPopMenu iH5TinyPopMenu = this.getMin;
        if (iH5TinyPopMenu != null) {
            Boolean valueOf = iH5TinyPopMenu != null ? Boolean.valueOf(iH5TinyPopMenu.getMax()) : null;
            Intrinsics.checkNotNull(valueOf);
            if (valueOf.booleanValue()) {
                return;
            }
        }
        super.onBackPressed();
    }
}
