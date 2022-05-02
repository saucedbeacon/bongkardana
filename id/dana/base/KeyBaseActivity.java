package id.dana.base;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.ap.zoloz.hummer.biz.HummerConstants;
import id.dana.R;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import o.FtsOptions$Order;
import o.MultiInstanceInvalidationClient$1;
import o.ProvidedTypeConverter;
import o.dispatchOnCancelled;
import o.entityColumn;
import o.getSelectionModeForAccessibility;
import o.invalidateDrawable;
import o.isItemRemoved;
import o.onCancelLoad;
import o.onCanceled;
import o.parentColumn;
import o.performAccessibilityActionForItem;
import o.setColorFilter;
import o.viewNeedsUpdate;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000 &*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003:\u0001&B\u0005¢\u0006\u0002\u0010\u0004J\u001d\u0010\r\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH$¢\u0006\u0002\u0010\u0010J\b\u0010\u0011\u001a\u00020\u0012H&J\b\u0010\u0013\u001a\u00020\u0014H&J\u000b\u0010\u0015\u001a\u00028\u0000¢\u0006\u0002\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0012\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\u0012\u0010\u001f\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0002J\b\u0010 \u001a\u00020\u001cH\u0016J\u0012\u0010!\u001a\u00020\u001c2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\u0012\u0010$\u001a\u00020\u001c2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\n\u0010%\u001a\u0004\u0018\u00010\u0018H\u0016R\u001a\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0010\u0010\u000b\u001a\u00028\u0000X.¢\u0006\u0004\n\u0002\u0010\f¨\u0006'"}, d2 = {"Lid/dana/base/KeyBaseActivity;", "T", "Lid/dana/base/OnActivityNavigationManager;", "Lid/dana/base/BaseActivity;", "()V", "backstackDelegate", "Lcom/zhuinden/simplestack/BackstackDelegate;", "getBackstackDelegate", "()Lcom/zhuinden/simplestack/BackstackDelegate;", "setBackstackDelegate", "(Lcom/zhuinden/simplestack/BackstackDelegate;)V", "navigationManager", "Lid/dana/base/OnActivityNavigationManager;", "createNavigationManager", "menuItemFacade", "Lid/dana/base/MenuItemFacade;", "(Lcom/zhuinden/simplestack/BackstackDelegate;Lid/dana/base/MenuItemFacade;)Lid/dana/base/OnActivityNavigationManager;", "getContainerId", "", "getInitialKey", "Lid/dana/base/Key;", "getNavigationManager", "()Lid/dana/base/OnActivityNavigationManager;", "getSystemService", "", "name", "", "init", "", "savedInstanceState", "Landroid/os/Bundle;", "initBackstackDelegate", "onBackPressed", "onClickLeftMenuButton", "view", "Landroid/view/View;", "onClickRightMenuButton", "onRetainCustomNonConfigurationInstance", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public abstract class KeyBaseActivity<T extends ProvidedTypeConverter> extends BaseActivity {
    @NotNull
    public static final length Companion = new length((byte) 0);
    protected getSelectionModeForAccessibility backstackDelegate;
    private T getMax;
    private HashMap setMax;

    @SuppressLint({"WrongConstant"})
    @JvmStatic
    @NotNull
    public static final KeyBaseActivity<?> get(@NotNull Context context) {
        return length.setMin(context);
    }

    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.setMax;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        int min;
        int min2;
        int max;
        Context baseContext = getBaseContext();
        Context context = null;
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || 99600571 == (max = dispatchOnCancelled.getMax(applicationContext, 99600571)))) {
            onCanceled oncanceled = new onCanceled(99600571, max, 512);
            onCancelLoad.setMax(99600571, oncanceled);
            onCancelLoad.getMin(99600571, oncanceled);
        }
        Context baseContext2 = getBaseContext();
        Context applicationContext2 = baseContext2 != null ? baseContext2.getApplicationContext() : null;
        if (!(applicationContext2 == null || i == (min2 = dispatchOnCancelled.setMin(applicationContext2, i)))) {
            onCanceled oncanceled2 = new onCanceled(i, min2, 8);
            onCancelLoad.setMax(99600571, oncanceled2);
            onCancelLoad.getMin(99600571, oncanceled2);
        }
        Context baseContext3 = getBaseContext();
        if (baseContext3 != null) {
            context = baseContext3.getApplicationContext();
        }
        if (!(context == null || i == (min = dispatchOnCancelled.getMin(context, i)))) {
            onCanceled oncanceled3 = new onCanceled(i, min, 32);
            onCancelLoad.setMax(99600571, oncanceled3);
            onCancelLoad.getMin(99600571, oncanceled3);
        }
        if (this.setMax == null) {
            this.setMax = new HashMap();
        }
        View view = (View) this.setMax.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.setMax.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* access modifiers changed from: protected */
    @NotNull
    public abstract T createNavigationManager(@NotNull getSelectionModeForAccessibility getselectionmodeforaccessibility, @NotNull parentColumn parentcolumn);

    public abstract int getContainerId();

    @NotNull
    public abstract Key getInitialKey();

    /* access modifiers changed from: protected */
    @NotNull
    public final getSelectionModeForAccessibility getBackstackDelegate() {
        getSelectionModeForAccessibility getselectionmodeforaccessibility = this.backstackDelegate;
        if (getselectionmodeforaccessibility == null) {
            Intrinsics.throwUninitializedPropertyAccessException("backstackDelegate");
        }
        return getselectionmodeforaccessibility;
    }

    /* access modifiers changed from: protected */
    public final void setBackstackDelegate(@NotNull getSelectionModeForAccessibility getselectionmodeforaccessibility) {
        int length2;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = dispatchOnCancelled.length(applicationContext, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, length2, 4);
            onCancelLoad.setMax(-345160356, oncanceled);
            onCancelLoad.getMin(-345160356, oncanceled);
        }
        Intrinsics.checkNotNullParameter(getselectionmodeforaccessibility, "<set-?>");
        this.backstackDelegate = getselectionmodeforaccessibility;
    }

    public void init(@Nullable Bundle bundle) {
        int length2;
        int min;
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(267820650, oncanceled);
            onCancelLoad.getMin(267820650, oncanceled);
        }
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length2)))) {
            onCanceled oncanceled2 = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(-1472219902, oncanceled2);
            onCancelLoad.getMin(-1472219902, oncanceled2);
        }
        entityColumn entitycolumn = new entityColumn(getSupportFragmentManager(), getContainerId());
        getSelectionModeForAccessibility getselectionmodeforaccessibility = new getSelectionModeForAccessibility();
        getselectionmodeforaccessibility.onCreate(bundle, getLastCustomNonConfigurationInstance(), performAccessibilityActionForItem.single(getInitialKey()));
        getselectionmodeforaccessibility.registerForLifecycleCallbacks(this);
        getselectionmodeforaccessibility.setStateChanger(new getMax(this, bundle, entitycolumn));
        Unit unit = Unit.INSTANCE;
        this.backstackDelegate = getselectionmodeforaccessibility;
        if (getselectionmodeforaccessibility == null) {
            Intrinsics.throwUninitializedPropertyAccessException("backstackDelegate");
        }
        this.getMax = createNavigationManager(getselectionmodeforaccessibility, this);
        super.init(bundle);
    }

    public void onClickLeftMenuButton(@Nullable View view) {
        MultiInstanceInvalidationClient$1 multiInstanceInvalidationClient$1 = getNavigationManager().setMin;
        if (multiInstanceInvalidationClient$1 != null) {
            multiInstanceInvalidationClient$1.getMax();
            Unit unit = Unit.INSTANCE;
        }
    }

    public void onClickRightMenuButton(@Nullable View view) {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(-596572400, oncanceled);
            onCancelLoad.getMin(-596572400, oncanceled);
        }
        MultiInstanceInvalidationClient$1 multiInstanceInvalidationClient$1 = getNavigationManager().setMax;
        if (multiInstanceInvalidationClient$1 != null) {
            multiInstanceInvalidationClient$1.getMax();
            Unit unit = Unit.INSTANCE;
        }
    }

    @Nullable
    public Object onRetainCustomNonConfigurationInstance() {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(-2022106635, oncanceled);
            onCancelLoad.getMin(-2022106635, oncanceled);
        }
        getSelectionModeForAccessibility getselectionmodeforaccessibility = this.backstackDelegate;
        if (getselectionmodeforaccessibility == null) {
            Intrinsics.throwUninitializedPropertyAccessException("backstackDelegate");
        }
        return getselectionmodeforaccessibility.onRetainCustomNonConfigurationInstance();
    }

    @Nullable
    public Object getSystemService(@NotNull String str) {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(55430434, oncanceled);
            onCancelLoad.getMin(55430434, oncanceled);
        }
        Intrinsics.checkNotNullParameter(str, "name");
        if (Intrinsics.areEqual((Object) "KeyBaseActivity", (Object) str)) {
            return this;
        }
        return super.getSystemService(str);
    }

    public void onBackPressed() {
        String str;
        T t = this.getMax;
        if (t == null) {
            Intrinsics.throwUninitializedPropertyAccessException("navigationManager");
        }
        if (((BaseKey) t.getMin.getBackstack().top()) != null) {
            T t2 = this.getMax;
            if (t2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("navigationManager");
            }
            BaseKey baseKey = (BaseKey) t2.getMin.getBackstack().top();
            String str2 = null;
            if (baseKey != null) {
                str = baseKey.toString();
            } else {
                str = null;
            }
            if (!TextUtils.isEmpty(str)) {
                T t3 = this.getMax;
                if (t3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("navigationManager");
                }
                BaseKey baseKey2 = (BaseKey) t3.getMin.getBackstack().top();
                if (baseKey2 != null) {
                    str2 = baseKey2.toString();
                }
                FtsOptions$Order ftsOptions$Order = (FtsOptions$Order) getSupportFragmentManager().findFragmentByTag(str2);
                if (ftsOptions$Order != null && ftsOptions$Order.n_()) {
                    return;
                }
            }
        }
        getSelectionModeForAccessibility getselectionmodeforaccessibility = this.backstackDelegate;
        if (getselectionmodeforaccessibility == null) {
            Intrinsics.throwUninitializedPropertyAccessException("backstackDelegate");
        }
        if (!getselectionmodeforaccessibility.onBackPressed()) {
            super.onBackPressed();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\n¢\u0006\u0002\b\b¨\u0006\t"}, d2 = {"<anonymous>", "", "T", "Lid/dana/base/OnActivityNavigationManager;", "stateChange", "Lcom/zhuinden/simplestack/StateChange;", "completionCallback", "Lcom/zhuinden/simplestack/StateChanger$Callback;", "handleStateChange", "id/dana/base/KeyBaseActivity$initBackstackDelegate$1$1"}, k = 3, mv = {1, 4, 2})
    static final class getMax implements viewNeedsUpdate {
        final /* synthetic */ entityColumn getMax;
        final /* synthetic */ KeyBaseActivity getMin;
        final /* synthetic */ Bundle setMin;

        getMax(KeyBaseActivity keyBaseActivity, Bundle bundle, entityColumn entitycolumn) {
            this.getMin = keyBaseActivity;
            this.setMin = bundle;
            this.getMax = entitycolumn;
        }

        public final void handleStateChange(@NotNull isItemRemoved isitemremoved, @NotNull viewNeedsUpdate.getMax getmax) {
            Intrinsics.checkNotNullParameter(isitemremoved, "stateChange");
            Intrinsics.checkNotNullParameter(getmax, "completionCallback");
            if (Intrinsics.areEqual(isitemremoved.topNewState(), isitemremoved.topPreviousState())) {
                getmax.stateChangeComplete();
                return;
            }
            entityColumn entitycolumn = this.getMax;
            setColorFilter setcolorfilter = new setColorFilter(entitycolumn.setMax);
            if (!setcolorfilter.IsOverlapping) {
                setcolorfilter.hashCode = false;
                if (isitemremoved.getDirection() == 1) {
                    setcolorfilter.setMax = R.anim.f772130772049;
                    setcolorfilter.isInside = R.anim.f802130772052;
                    setcolorfilter.equals = R.anim.f772130772049;
                    setcolorfilter.toIntRange = R.anim.f802130772052;
                } else if (isitemremoved.getDirection() == -1) {
                    setcolorfilter.setMax = R.anim.f762130772048;
                    setcolorfilter.isInside = R.anim.f812130772053;
                    setcolorfilter.equals = R.anim.f762130772048;
                    setcolorfilter.toIntRange = R.anim.f812130772053;
                }
                performAccessibilityActionForItem<BaseKey> previousState = isitemremoved.getPreviousState();
                performAccessibilityActionForItem<BaseKey> newState = isitemremoved.getNewState();
                for (BaseKey baseKey : previousState) {
                    Fragment findFragmentByTag = entitycolumn.setMax.findFragmentByTag(baseKey.toString());
                    if (findFragmentByTag != null) {
                        if (!newState.contains(baseKey)) {
                            setcolorfilter.length(findFragmentByTag);
                        } else if (!findFragmentByTag.isDetached()) {
                            setcolorfilter.getMin(findFragmentByTag);
                        }
                    }
                }
                for (BaseKey baseKey2 : newState) {
                    Fragment findFragmentByTag2 = entitycolumn.setMax.findFragmentByTag(baseKey2.toString());
                    if (baseKey2.equals(isitemremoved.topNewState())) {
                        if (findFragmentByTag2 == null) {
                            setcolorfilter.length(entitycolumn.getMax, baseKey2.getMax(), baseKey2.toString(), 1);
                        } else if (findFragmentByTag2.isDetached()) {
                            setcolorfilter.getMin(new invalidateDrawable.length(7, findFragmentByTag2));
                        }
                    } else if (findFragmentByTag2 != null && !findFragmentByTag2.isDetached()) {
                        setcolorfilter.getMin(findFragmentByTag2);
                    }
                }
                setcolorfilter.setMax();
                getmax.stateChangeComplete();
                return;
            }
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
    }

    @NotNull
    public final T getNavigationManager() {
        T t = this.getMax;
        if (t == null) {
            Intrinsics.throwUninitializedPropertyAccessException("navigationManager");
        }
        return t;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lid/dana/base/KeyBaseActivity$Companion;", "", "()V", "TAG", "", "get", "Lid/dana/base/KeyBaseActivity;", "context", "Landroid/content/Context;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class length {
        private length() {
        }

        public /* synthetic */ length(byte b) {
            this();
        }

        @SuppressLint({"WrongConstant"})
        @JvmStatic
        @NotNull
        public static KeyBaseActivity<?> setMin(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
            Object systemService = context.getSystemService("KeyBaseActivity");
            if (systemService != null) {
                return (KeyBaseActivity) systemService;
            }
            throw new NullPointerException("null cannot be cast to non-null type id.dana.base.KeyBaseActivity<*>");
        }
    }
}
