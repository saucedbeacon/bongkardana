package o;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.browser.customtabs.CustomTabsService;
import com.alibaba.ariver.kernel.ipc.IpcMessageConstants;
import com.ap.zoloz.hummer.biz.HummerConstants;
import id.dana.R;
import id.dana.di.PerActivity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.DatePickerBridgeExtension;
import o.WindowBridgeExtension;
import o.rate;
import o.title;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\n\u0010\u0012\u001a\u0004\u0018\u00010\fH\u0002J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\f0\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0006\u0010\u0015\u001a\u00020\u0016J\u0018\u0010\u0017\u001a\u00020\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0010\u001a\u00020\fJ\u0006\u0010\u001a\u001a\u00020\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\tR\u000e\u0010\n\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lid/dana/danah5/DanaCustomH5;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "customTabsClient", "Landroidx/browser/customtabs/CustomTabsClient;", "isInitialized", "", "()Z", "isInitializing", "preferredPackageName", "", "applyCustomTabEnginePriority", "", "Lid/dana/danah5/chrome/CustomTabEngine;", "url", "Landroid/net/Uri;", "findPreferredCustomTabsPackage", "getCustomTabsPackages", "getPreferredCustomTabsPackage", "initialize", "", "openUrl", "activity", "Landroid/app/Activity;", "warmUp", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
@PerActivity
public final class getCancelable {
    @NotNull
    public static final setMax Companion = new setMax((DefaultConstructorMarker) null);
    private static final String TAG = getCancelable.class.getSimpleName();
    private final Context context;
    /* access modifiers changed from: private */
    public rewind customTabsClient;
    /* access modifiers changed from: private */
    public boolean isInitializing;
    private String preferredPackageName = findPreferredCustomTabsPackage();

    @Inject
    public getCancelable(@NotNull Context context2) {
        Intrinsics.checkNotNullParameter(context2, HummerConstants.CONTEXT);
        this.context = context2;
        initialize();
    }

    public final void initialize() {
        String findPreferredCustomTabsPackage;
        if (!isInitialized() && !this.isInitializing && (findPreferredCustomTabsPackage = findPreferredCustomTabsPackage()) != null) {
            this.preferredPackageName = findPreferredCustomTabsPackage;
            this.isInitializing = true;
            if (!rewind.setMax(this.context, this.preferredPackageName, new getMax(this))) {
                this.customTabsClient = null;
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\t"}, d2 = {"id/dana/danah5/DanaCustomH5$initialize$connection$1", "Landroidx/browser/customtabs/CustomTabsServiceConnection;", "onCustomTabsServiceConnected", "", "name", "Landroid/content/ComponentName;", "client", "Landroidx/browser/customtabs/CustomTabsClient;", "onServiceDisconnected", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMax extends rateWithExtras {
        final /* synthetic */ getCancelable this$0;

        getMax(getCancelable getcancelable) {
            this.this$0 = getcancelable;
        }

        public final void onCustomTabsServiceConnected(@NotNull ComponentName componentName, @NotNull rewind rewind) {
            Intrinsics.checkNotNullParameter(componentName, "name");
            Intrinsics.checkNotNullParameter(rewind, "client");
            rewind.setMin();
            this.this$0.customTabsClient = rewind;
            this.this$0.isInitializing = false;
        }

        public final void onServiceDisconnected(@NotNull ComponentName componentName) {
            Intrinsics.checkNotNullParameter(componentName, "name");
            this.this$0.customTabsClient = null;
            this.this$0.isInitializing = false;
        }
    }

    public final boolean isInitialized() {
        return this.customTabsClient != null;
    }

    public final void warmUp() {
        rewind rewind = this.customTabsClient;
        if (rewind != null) {
            rewind.setMin();
        } else if (!this.isInitializing) {
            initialize();
        }
    }

    public final void openUrl(@Nullable Activity activity, @NotNull String str) {
        Context context2;
        Intrinsics.checkNotNullParameter(str, "url");
        if (isInitialized()) {
            warmUp();
        } else {
            LocationBridgeExtension.length(TAG, "ChromeCustomTabs has not been initialized yet. It will open any installed browser.");
        }
        rate.length length = new rate.length();
        length.getMax = Integer.valueOf(IntRange.setMax(this.context, WindowBridgeExtension.AnonymousClass1.setMax().getMin) | -16777216);
        rate rate = new rate(length.getMax, length.setMax, length.getMin, length.length);
        Intrinsics.checkNotNullExpressionValue(rate, "CustomTabColorSchemePara…or))\n            .build()");
        CustomTabsIntent.getMin getmin = new CustomTabsIntent.getMin();
        getmin.equals = rate.getMax();
        getmin.getMax = name.getMax(this.context, R.anim.f772130772049, R.anim.f802130772052).length();
        getmin.setMax.putExtra("android.support.customtabs.extra.EXIT_ANIMATION_BUNDLE", name.getMax(this.context, R.anim.f762130772048, R.anim.f812130772053).length());
        if (!getmin.setMax.hasExtra("android.support.customtabs.extra.SESSION")) {
            Bundle bundle = new Bundle();
            InspectableProperty.setMax(bundle, "android.support.customtabs.extra.SESSION", (IBinder) null);
            getmin.setMax.putExtras(bundle);
        }
        if (getmin.setMin != null) {
            getmin.setMax.putParcelableArrayListExtra("android.support.customtabs.extra.MENU_ITEMS", getmin.setMin);
        }
        if (getmin.getMin != null) {
            getmin.setMax.putParcelableArrayListExtra("android.support.customtabs.extra.TOOLBAR_ITEMS", getmin.getMin);
        }
        getmin.setMax.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", getmin.toIntRange);
        Intent intent = getmin.setMax;
        rate.length length2 = getmin.length;
        intent.putExtras(new rate(length2.getMax, length2.setMax, length2.getMin, length2.length).getMax());
        if (getmin.equals != null) {
            getmin.setMax.putExtras(getmin.equals);
        }
        if (getmin.IsOverlapping != null) {
            Bundle bundle2 = new Bundle();
            bundle2.putSparseParcelableArray("androidx.browser.customtabs.extra.COLOR_SCHEME_PARAMS", getmin.IsOverlapping);
            getmin.setMax.putExtras(bundle2);
        }
        getmin.setMax.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", getmin.toFloatRange);
        CustomTabsIntent customTabsIntent = new CustomTabsIntent(getmin.setMax, getmin.getMax);
        if (activity == null) {
            Intent intent2 = customTabsIntent.length;
            Intrinsics.checkNotNullExpressionValue(intent2, IpcMessageConstants.EXTRA_INTENT);
            intent2.setFlags(268468224);
        }
        if (this.preferredPackageName != null) {
            customTabsIntent.length.setPackage(this.preferredPackageName);
            if (activity != null) {
                context2 = activity;
            } else {
                context2 = this.context;
            }
            customTabsIntent.length.setData(Uri.parse(str));
            IntRange.setMin(context2, customTabsIntent.length, customTabsIntent.setMin);
        } else {
            Intent intent3 = new Intent("android.intent.action.VIEW");
            intent3.setData(Uri.parse(str));
            if (activity != null) {
                Context context3 = activity;
                Intrinsics.checkNotNullParameter(context3, "$this$startActivitySafely");
                Intrinsics.checkNotNullParameter(intent3, IpcMessageConstants.EXTRA_INTENT);
                if (DatePickerBridgeExtension.AnonymousClass8.length(intent3, context3)) {
                    context3.startActivity(intent3);
                }
                if (activity != null) {
                    return;
                }
            }
            Context context4 = this.context;
            Intrinsics.checkNotNullParameter(context4, "$this$startActivitySafely");
            Intrinsics.checkNotNullParameter(intent3, IpcMessageConstants.EXTRA_INTENT);
            if (DatePickerBridgeExtension.AnonymousClass8.length(intent3, context4)) {
                context4.startActivity(intent3);
            }
        }
        Unit unit = Unit.INSTANCE;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, k = 3, mv = {1, 4, 2})
    public static final class getMin<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            return ComparisonsKt.compareValues(Integer.valueOf(((title.Cdefault) t).getPriority()), Integer.valueOf(((title.Cdefault) t2).getPriority()));
        }
    }

    private final List<String> getCustomTabsPackages(Uri uri) {
        PackageManager packageManager = this.context.getPackageManager();
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(new Intent("android.intent.action.VIEW", uri), 0);
        Intrinsics.checkNotNullExpressionValue(queryIntentActivities, "pm.queryIntentActivities(activityIntent, 0)");
        Collection arrayList = new ArrayList();
        for (Object next : queryIntentActivities) {
            Intent intent = new Intent(CustomTabsService.ACTION_CUSTOM_TABS_CONNECTION).setPackage(((ResolveInfo) next).activityInfo.packageName);
            Intrinsics.checkNotNullExpressionValue(intent, "Intent(ACTION_CUSTOM_TAB…activityInfo.packageName)");
            if (packageManager.resolveService(intent, 0) != null) {
                arrayList.add(next);
            }
        }
        Iterable<ResolveInfo> iterable = (List) arrayList;
        Collection arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        for (ResolveInfo resolveInfo : iterable) {
            arrayList2.add(resolveInfo.activityInfo.packageName);
        }
        return (List) arrayList2;
    }

    private final List<title.Cdefault> applyCustomTabEnginePriority(Uri uri) {
        title.Cdefault defaultR;
        int i;
        Iterable<String> customTabsPackages = getCustomTabsPackages(uri);
        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(customTabsPackages, 10));
        for (String str : customTabsPackages) {
            arrayList.add(new title.Cdefault(str, 0, 2, (DefaultConstructorMarker) null));
        }
        title.Cdefault[] chromeApps = title.Cdefault.Companion.getChromeApps();
        Iterable<title.Cdefault> iterable = (List) arrayList;
        for (title.Cdefault defaultR2 : iterable) {
            int length = chromeApps.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    defaultR = null;
                    break;
                }
                defaultR = chromeApps[i2];
                if (Intrinsics.areEqual((Object) defaultR, (Object) defaultR2)) {
                    break;
                }
                i2++;
            }
            if (defaultR != null) {
                i = defaultR.getPriority();
            } else {
                i = 10;
            }
            defaultR2.setPriority(i);
        }
        return CollectionsKt.sortedWith(iterable, new getMin());
    }

    private final String getPreferredCustomTabsPackage(Uri uri) {
        title.Cdefault defaultR = (title.Cdefault) CollectionsKt.firstOrNull(applyCustomTabEnginePriority(uri));
        if (defaultR == null) {
            return null;
        }
        LocationBridgeExtension.setMin(TAG, "Found preferred CustomTabs package: ".concat(String.valueOf(defaultR)));
        return defaultR.getPackageName();
    }

    private final String findPreferredCustomTabsPackage() {
        Uri parse = Uri.parse("http://www.example.com/");
        Intrinsics.checkNotNullExpressionValue(parse, "Uri.parse(\"http://www.example.com/\")");
        return getPreferredCustomTabsPackage(parse);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lid/dana/danah5/DanaCustomH5$Companion;", "", "()V", "TAG", "", "kotlin.jvm.PlatformType", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMax {
        private setMax() {
        }

        public /* synthetic */ setMax(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
