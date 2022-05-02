package id.dana.onboarding;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import com.alibaba.ariver.kernel.ipc.IpcMessageConstants;
import id.dana.R;
import id.dana.base.Key;
import id.dana.base.KeyBaseActivity;
import id.dana.danah5.akulaku.AkuEventParamsKey;
import id.dana.onboarding.verify.VerifyNumberKey;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import o.SensorBridgeExtension;
import o.dispatchOnCancelled;
import o.getSelectionModeForAccessibility;
import o.onCancelLoad;
import o.onCanceled;
import o.parentColumn;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00162\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B\u0005¢\u0006\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tH\u0002J\b\u0010\n\u001a\u00020\u000bH\u0014J\u0018\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0014J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0005H\u0016J\b\u0010\u0014\u001a\u00020\u0012H\u0016J\b\u0010\u0015\u001a\u00020\u000bH\u0016¨\u0006\u0017"}, d2 = {"Lid/dana/onboarding/OnboardingActivity;", "Lid/dana/base/KeyBaseActivity;", "Lid/dana/onboarding/OnboardingNavigationManager;", "()V", "checkInvalidData", "Lid/dana/base/Key;", "data", "Landroid/os/Bundle;", "invalidData", "", "configToolbar", "", "createNavigationManager", "backstackDelegate", "Lcom/zhuinden/simplestack/BackstackDelegate;", "menuItemFacade", "Lid/dana/base/MenuItemFacade;", "getContainerId", "", "getInitialKey", "getLayout", "init", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class OnboardingActivity extends KeyBaseActivity<SensorBridgeExtension> {
    @NotNull
    public static final setMax Companion = new setMax((byte) 0);
    @NotNull
    public static final String DEEPLINK_RESET_PIN = "DEEPLINK_RESET_PIN";
    private HashMap setMax;

    @JvmStatic
    public static final void open(@NotNull Activity activity, @Nullable Uri uri) {
        setMax.setMin(activity, uri);
    }

    public final void _$_clearFindViewByIdCache() {
        int length;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length)))) {
            onCanceled oncanceled = new onCanceled(length, min, 32);
            onCancelLoad.setMax(1443718926, oncanceled);
            onCancelLoad.getMin(1443718926, oncanceled);
        }
        HashMap hashMap = this.setMax;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View _$_findCachedViewById(int i) {
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

    public final int getContainerId() {
        return R.id.f40932131362579;
    }

    public final int getLayout() {
        int length;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (applicationContext == null || (length = dispatchOnCancelled.length(applicationContext, 0)) == 0) {
            return R.layout.activity_onboarding;
        }
        onCanceled oncanceled = new onCanceled(0, length, 4);
        onCancelLoad.setMax(-1008417188, oncanceled);
        onCancelLoad.getMin(-1008417188, oncanceled);
        return R.layout.activity_onboarding;
    }

    public final void init() {
        int length;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (applicationContext != null && (length = dispatchOnCancelled.length(applicationContext, 0)) != 0) {
            onCanceled oncanceled = new onCanceled(0, length, 4);
            onCancelLoad.setMax(734851637, oncanceled);
            onCancelLoad.getMin(734851637, oncanceled);
        }
    }

    @NotNull
    public final Key getInitialKey() {
        boolean z;
        String str;
        boolean z2;
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, IpcMessageConstants.EXTRA_INTENT);
        Bundle extras = intent.getExtras();
        boolean z3 = true;
        boolean z4 = false;
        boolean z5 = extras == null || !getIntent().hasExtra("phoneNumber");
        if (extras == null || !extras.containsKey("FROM_LOGOUT") || !extras.getBoolean("FROM_LOGOUT")) {
            z3 = false;
        }
        if (z3) {
            VerifyNumberKey.length length = VerifyNumberKey.setMax;
            VerifyNumberKey.setMin setmin = new VerifyNumberKey.setMin();
            setmin.length = "";
            Boolean bool = Boolean.TRUE;
            setmin.getMax = bool != null ? bool.booleanValue() : false;
            setmin.setMin = "";
            Boolean bool2 = Boolean.FALSE;
            if (bool2 != null) {
                z2 = bool2.booleanValue();
            } else {
                z2 = false;
            }
            setmin.getMin = z2;
            Boolean bool3 = Boolean.TRUE;
            if (bool3 != null) {
                z4 = bool3.booleanValue();
            }
            setmin.getMin = z4;
            return new VerifyNumberKey(setmin.length, setmin.getMax, setmin.setMin, setmin.getMin);
        } else if (z5) {
            VerifyNumberKey.length length2 = VerifyNumberKey.setMax;
            VerifyNumberKey.setMin setmin2 = new VerifyNumberKey.setMin();
            setmin2.length = "";
            Boolean bool4 = Boolean.TRUE;
            setmin2.getMax = bool4 != null ? bool4.booleanValue() : false;
            setmin2.setMin = "";
            Boolean bool5 = Boolean.FALSE;
            if (bool5 != null) {
                z4 = bool5.booleanValue();
            }
            setmin2.getMin = z4;
            return new VerifyNumberKey(setmin2.length, setmin2.getMax, setmin2.setMin, setmin2.getMin);
        } else {
            VerifyNumberKey.length length3 = VerifyNumberKey.setMax;
            VerifyNumberKey.setMin setmin3 = new VerifyNumberKey.setMin();
            setmin3.length = "";
            Boolean bool6 = Boolean.TRUE;
            setmin3.getMax = bool6 != null ? bool6.booleanValue() : false;
            setmin3.setMin = "";
            Boolean bool7 = Boolean.FALSE;
            if (bool7 != null) {
                z = bool7.booleanValue();
            } else {
                z = false;
            }
            setmin3.getMin = z;
            String str2 = null;
            if (extras != null) {
                str = extras.getString("phoneNumber");
            } else {
                str = null;
            }
            setmin3.length = str;
            Boolean valueOf = extras != null ? Boolean.valueOf(extras.getBoolean("isEditablePhoneNumber")) : null;
            if (valueOf != null) {
                z4 = valueOf.booleanValue();
            }
            setmin3.getMax = z4;
            if (extras != null) {
                str2 = extras.getString("source");
            }
            setmin3.setMin = str2;
            return new VerifyNumberKey(setmin3.length, setmin3.getMax, setmin3.setMin, setmin3.getMin);
        }
    }

    /* access modifiers changed from: protected */
    @NotNull
    public final SensorBridgeExtension createNavigationManager(@NotNull getSelectionModeForAccessibility getselectionmodeforaccessibility, @NotNull parentColumn parentcolumn) {
        int max;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || 637227310 == (max = dispatchOnCancelled.getMax(applicationContext, 637227310)))) {
            onCanceled oncanceled = new onCanceled(637227310, max, 512);
            onCancelLoad.setMax(637227310, oncanceled);
            onCancelLoad.getMin(637227310, oncanceled);
        }
        Intrinsics.checkNotNullParameter(getselectionmodeforaccessibility, "backstackDelegate");
        Intrinsics.checkNotNullParameter(parentcolumn, "menuItemFacade");
        return new SensorBridgeExtension(this, getselectionmodeforaccessibility, parentcolumn);
    }

    public final void configToolbar() {
        int length;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length)))) {
            onCanceled oncanceled = new onCanceled(length, min, 32);
            onCancelLoad.setMax(350319836, oncanceled);
            onCancelLoad.getMin(350319836, oncanceled);
        }
        setToolbarImage(R.drawable.ic_dana_logo_icon_text);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0002J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007J\u001a\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0007J\u0010\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007J\u0018\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lid/dana/onboarding/OnboardingActivity$Companion;", "", "()V", "DEEPLINK_RESET_PIN", "", "EXTRA_FROM_LOGOUT", "createIntentWithFlagNewTask", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "open", "", "activity", "Landroid/app/Activity;", "uri", "Landroid/net/Uri;", "openAfterLogout", "openToResetPin", "phoneNumber", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMax {
        private setMax() {
        }

        public /* synthetic */ setMax(byte b) {
            this();
        }

        public static Intent getMin(Context context) {
            Intent flags = new Intent(context, OnboardingActivity.class).setFlags(268468224);
            Intrinsics.checkNotNullExpressionValue(flags, "Intent(context,\n        …FLAG_ACTIVITY_CLEAR_TASK)");
            return flags;
        }

        @JvmStatic
        public static void setMax(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, AkuEventParamsKey.KEY_ACTIVITY);
            Intent flags = new Intent(activity, OnboardingActivity.class).setFlags(268468224);
            Intrinsics.checkNotNullExpressionValue(flags, "Intent(context,\n        …FLAG_ACTIVITY_CLEAR_TASK)");
            activity.startActivity(flags);
        }

        @JvmStatic
        public static void setMin(@NotNull Activity activity, @Nullable Uri uri) {
            Intrinsics.checkNotNullParameter(activity, AkuEventParamsKey.KEY_ACTIVITY);
            activity.startActivity(new Intent(activity, OnboardingActivity.class).setData(uri));
        }
    }

    @JvmStatic
    public static final void openToResetPin(@NotNull Activity activity, @NotNull String str) {
        Intrinsics.checkNotNullParameter(activity, AkuEventParamsKey.KEY_ACTIVITY);
        Intrinsics.checkNotNullParameter(str, "phoneNumber");
        activity.startActivity(setMax.getMin(activity).putExtra("phoneNumber", str).putExtra("isEditablePhoneNumber", true).putExtra("source", DEEPLINK_RESET_PIN));
    }

    @JvmStatic
    public static final void open(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, AkuEventParamsKey.KEY_ACTIVITY);
        activity.startActivity(setMax.getMin(activity));
    }

    @JvmStatic
    public static final void openAfterLogout(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, AkuEventParamsKey.KEY_ACTIVITY);
        Intent min = setMax.getMin(activity);
        min.putExtra("FROM_LOGOUT", true);
        activity.startActivity(min);
    }
}
