package id.dana.globalsearch.view;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.ap.zoloz.hummer.biz.HummerConstants;
import id.dana.R;
import id.dana.base.BaseActivity;
import id.dana.contract.deeplink.path.FeatureParams;
import id.dana.globalsearch.view.GlobalSearchFragment;
import id.dana.tracker.TrackerKey;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.GriverManifest;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\b"}, d2 = {"Lid/dana/globalsearch/view/GlobalSearchActivity;", "Lid/dana/base/BaseActivity;", "()V", "getLayout", "", "init", "", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class GlobalSearchActivity extends BaseActivity {
    @NotNull
    public static final getMax Companion = new getMax((byte) 0);
    private HashMap setMax;

    @JvmStatic
    public static final void openGlobalSearch(@NotNull Context context) {
        getMax.setMax(context);
    }

    @JvmStatic
    public static final void openGlobalSearchWithKeyword(@NotNull Context context, @NotNull String str) {
        getMax.setMin(context, str);
    }

    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.setMax;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View _$_findCachedViewById(int i) {
        int length;
        int min;
        int max;
        Context baseContext = getBaseContext();
        Context context = null;
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || -1387783960 == (max = dispatchOnCancelled.getMax(applicationContext, -1387783960)))) {
            onCanceled oncanceled = new onCanceled(-1387783960, max, 512);
            onCancelLoad.setMax(-1387783960, oncanceled);
            onCancelLoad.getMin(-1387783960, oncanceled);
        }
        Context baseContext2 = getBaseContext();
        if (baseContext2 != null) {
            context = baseContext2.getApplicationContext();
        }
        if (!(context == null || (length = context.fileList().length) == (min = dispatchOnCancelled.getMin(context, length)))) {
            onCanceled oncanceled2 = new onCanceled(length, min, 32);
            onCancelLoad.setMax(-1387783960, oncanceled2);
            onCancelLoad.getMin(-1387783960, oncanceled2);
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

    public final int getLayout() {
        int max = dispatchOnCancelled.getMax(0);
        if (max == 0) {
            return R.layout.activity_global_search;
        }
        onCanceled oncanceled = new onCanceled(0, max, 16);
        onCancelLoad.setMax(-47591158, oncanceled);
        onCancelLoad.getMin(-47591158, oncanceled);
        return R.layout.activity_global_search;
    }

    public final void init() {
        String stringExtra;
        overridePendingTransition(R.anim.f392130772009, R.anim.f402130772010);
        GlobalSearchFragment globalSearchFragment = (GlobalSearchFragment) getSupportFragmentManager().findFragmentById(R.id.f44592131362989);
        if (!(globalSearchFragment == null || (stringExtra = getIntent().getStringExtra("SEARCH_PARAMS")) == null)) {
            globalSearchFragment.m_().setMax((Function1<? super Boolean, Unit>) new GlobalSearchFragment.ICustomTabsCallback(globalSearchFragment, stringExtra, (String) null));
            globalSearchFragment.setMax.setKeywordUsage(TrackerKey.KeywordType.POPULAR);
            globalSearchFragment.setMax.setKeywordResult(stringExtra);
        }
        if (globalSearchFragment != null && getIntent().getBooleanExtra("IS_FROM_POPULAR_SEARCH_EXPLORE", false)) {
            globalSearchFragment.getMin = true;
            globalSearchFragment.showProgress();
        }
        if (globalSearchFragment != null) {
            GriverManifest.AnonymousClass11 r0 = globalSearchFragment.globalSearchAnalyticTracker;
            if (r0 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("globalSearchAnalyticTracker");
            }
            r0.setMin();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0018\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0007¨\u0006\n"}, d2 = {"Lid/dana/globalsearch/view/GlobalSearchActivity$Companion;", "", "()V", "openGlobalSearch", "", "context", "Landroid/content/Context;", "openGlobalSearchWithKeyword", "keyword", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMax {
        private getMax() {
        }

        public /* synthetic */ getMax(byte b) {
            this();
        }

        @JvmStatic
        public static void setMax(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
            context.startActivity(new Intent(context, GlobalSearchActivity.class));
        }

        @JvmStatic
        public static void setMin(@NotNull Context context, @NotNull String str) {
            Context applicationContext = context != null ? context.getApplicationContext() : null;
            if (applicationContext != null) {
                int length = str != null ? str.length() : 0;
                int min = dispatchOnCancelled.setMin(applicationContext, length);
                if (length != min) {
                    onCanceled oncanceled = new onCanceled(length, min, 8);
                    onCancelLoad.setMax(-733971545, oncanceled);
                    onCancelLoad.getMin(-733971545, oncanceled);
                }
            }
            Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
            Intrinsics.checkNotNullParameter(str, FeatureParams.KEYWORD);
            Intent intent = new Intent(context, GlobalSearchActivity.class);
            intent.putExtra("SEARCH_PARAMS", str);
            Unit unit = Unit.INSTANCE;
            context.startActivity(intent);
        }
    }
}
