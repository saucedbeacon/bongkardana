package id.dana.autoroute;

import android.content.Context;
import android.view.View;
import id.dana.R;
import id.dana.base.BaseActivity;
import id.dana.component.buttoncomponent.DanaButtonPrimaryView;
import id.dana.component.buttoncomponent.DanaButtonSecondaryView;
import id.dana.danah5.DanaH5;
import java.util.HashMap;
import kotlin.Metadata;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;
import o.resetInternal;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0002¨\u0006\b"}, d2 = {"Lid/dana/autoroute/BottomSheetNoAssetInfoActivity;", "Lid/dana/base/BaseActivity;", "()V", "getLayout", "", "init", "", "openNewCard", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class BottomSheetNoAssetInfoActivity extends BaseActivity {
    private HashMap getMax;

    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.getMax;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View _$_findCachedViewById(int i) {
        int max;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || 213282689 == (max = dispatchOnCancelled.getMax(applicationContext, 213282689)))) {
            onCanceled oncanceled = new onCanceled(213282689, max, 512);
            onCancelLoad.setMax(213282689, oncanceled);
            onCancelLoad.getMin(213282689, oncanceled);
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

    public final int getLayout() {
        int max = dispatchOnCancelled.getMax(0);
        if (max == 0) {
            return R.layout.activity_bottom_sheet_no_asset_info;
        }
        onCanceled oncanceled = new onCanceled(0, max, 16);
        onCancelLoad.setMax(527153685, oncanceled);
        onCancelLoad.getMin(527153685, oncanceled);
        return R.layout.activity_bottom_sheet_no_asset_info;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class getMin implements View.OnClickListener {
        final /* synthetic */ BottomSheetNoAssetInfoActivity getMin;

        getMin(BottomSheetNoAssetInfoActivity bottomSheetNoAssetInfoActivity) {
            this.getMin = bottomSheetNoAssetInfoActivity;
        }

        public final void onClick(View view) {
            DanaH5.startContainerFullUrl("https://m.dana.id/m/portal/bankcardadd?isClosable=true");
            this.getMin.finish();
        }
    }

    public final void init() {
        ((DanaButtonPrimaryView) _$_findCachedViewById(resetInternal.setMax.toDoubleRange)).setOnClickListener(new getMin(this));
        ((DanaButtonSecondaryView) _$_findCachedViewById(resetInternal.setMax.create)).setOnClickListener(new length(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class length implements View.OnClickListener {
        final /* synthetic */ BottomSheetNoAssetInfoActivity getMin;

        length(BottomSheetNoAssetInfoActivity bottomSheetNoAssetInfoActivity) {
            this.getMin = bottomSheetNoAssetInfoActivity;
        }

        public final void onClick(View view) {
            this.getMin.finish();
        }
    }
}
