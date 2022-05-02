package id.dana.globalsearch.view;

import android.content.Context;
import android.view.View;
import id.dana.R;
import id.dana.base.BaseActivity;
import id.dana.contract.deeplink.path.FeatureParams;
import id.dana.richview.globalsearch.ToolbarGlobalSearchView;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.GriverManifest;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;
import o.resetInternal;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\b"}, d2 = {"Lid/dana/globalsearch/view/SeeAllActivity;", "Lid/dana/base/BaseActivity;", "()V", "getLayout", "", "init", "", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class SeeAllActivity extends BaseActivity {
    @NotNull
    public static final setMax Companion = new setMax((byte) 0);
    @NotNull
    public static final String GLOBAL_SEARCH_CATEGORY = "GLOBAL_SEARCH_CATEGORY";
    @NotNull
    public static final String GLOBAL_SEARCH_KEYWORD = "GLOBAL_SEARCH_KEYWORD";
    public static final int REQUEST_CODE = 24;
    public static final int RESULT_CODE = 29;
    private HashMap setMax;

    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.setMax;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View _$_findCachedViewById(int i) {
        int min;
        int max = dispatchOnCancelled.setMax(i);
        if (i != max) {
            onCanceled oncanceled = new onCanceled(i, max, 1);
            onCancelLoad.setMax(-1723830849, oncanceled);
            onCancelLoad.getMin(-1723830849, oncanceled);
        }
        int max2 = dispatchOnCancelled.getMax(0);
        if (max2 != 0) {
            onCanceled oncanceled2 = new onCanceled(0, max2, 16);
            onCancelLoad.setMax(-1723830849, oncanceled2);
            onCancelLoad.getMin(-1723830849, oncanceled2);
        }
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || i == (min = dispatchOnCancelled.getMin(applicationContext, i)))) {
            onCanceled oncanceled3 = new onCanceled(i, min, 32);
            onCancelLoad.setMax(-1723830849, oncanceled3);
            onCancelLoad.getMin(-1723830849, oncanceled3);
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
        return R.layout.activity_see_all;
    }

    public final void init() {
        GriverManifest.AnonymousClass14 r0 = (GriverManifest.AnonymousClass14) getSupportFragmentManager().findFragmentById(R.id.f44612131362991);
        String stringExtra = getIntent().getStringExtra(GLOBAL_SEARCH_CATEGORY);
        String stringExtra2 = getIntent().getStringExtra(GLOBAL_SEARCH_KEYWORD);
        if (stringExtra != null && stringExtra2 != null && r0 != null) {
            Intrinsics.checkNotNullParameter(stringExtra2, FeatureParams.KEYWORD);
            Intrinsics.checkNotNullParameter(stringExtra, "category");
            r0.setMax = stringExtra2;
            r0.setMin = stringExtra;
            ToolbarGlobalSearchView toolbarGlobalSearchView = (ToolbarGlobalSearchView) r0.getMax(resetInternal.setMax.onForwardedEvent);
            if (toolbarGlobalSearchView != null) {
                toolbarGlobalSearchView.showKeyword(stringExtra2);
            }
            r0.m_().getMin(stringExtra2, stringExtra);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lid/dana/globalsearch/view/SeeAllActivity$Companion;", "", "()V", "GLOBAL_SEARCH_CATEGORY", "", "GLOBAL_SEARCH_KEYWORD", "REQUEST_CODE", "", "RESULT_CODE", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMax {
        private setMax() {
        }

        public /* synthetic */ setMax(byte b) {
            this();
        }
    }
}
