package id.dana.oauth.activity;

import android.view.View;
import id.dana.R;
import id.dana.base.BaseActivity;
import id.dana.component.buttoncomponent.DanaButtonPrimaryView;
import id.dana.tracker.TrackerKey;
import java.util.HashMap;
import kotlin.Metadata;
import o.ScreenBrightnessBridgeExtension;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;
import o.resetInternal;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0014J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\u0004H\u0016¨\u0006\b"}, d2 = {"Lid/dana/oauth/activity/BlockRegistrationActivity;", "Lid/dana/base/BaseActivity;", "()V", "configToolbar", "", "getLayout", "", "init", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class BlockRegistrationActivity extends BaseActivity {
    private HashMap getMin;

    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.getMin;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View _$_findCachedViewById(int i) {
        int max = dispatchOnCancelled.getMax(i);
        if (i != max) {
            onCanceled oncanceled = new onCanceled(i, max, 16);
            onCancelLoad.setMax(345186093, oncanceled);
            onCancelLoad.getMin(345186093, oncanceled);
        }
        if (this.getMin == null) {
            this.getMin = new HashMap();
        }
        View view = (View) this.getMin.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.getMin.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final int getLayout() {
        return R.layout.activity_block_registration;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class setMin implements View.OnClickListener {
        final /* synthetic */ BlockRegistrationActivity setMin;

        setMin(BlockRegistrationActivity blockRegistrationActivity) {
            this.setMin = blockRegistrationActivity;
        }

        public final void onClick(View view) {
            ScreenBrightnessBridgeExtension screenBrightnessBridgeExtension = ScreenBrightnessBridgeExtension.getMin;
            ScreenBrightnessBridgeExtension.getMax(false);
            this.setMin.finishAffinity();
        }
    }

    public final void init() {
        ((DanaButtonPrimaryView) _$_findCachedViewById(resetInternal.setMax.Grayscale$Algorithm)).setOnClickListener(new setMin(this));
    }

    public final void configToolbar() {
        setCenterTitle(TrackerKey.DanaBalanceRecipientTypeProperty.DANA);
        setMenuLeftButton((int) R.drawable.btn_arrow_left);
    }
}
