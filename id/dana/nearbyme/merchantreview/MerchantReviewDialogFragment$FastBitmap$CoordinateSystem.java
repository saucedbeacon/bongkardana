package id.dana.nearbyme.merchantreview;

import android.view.View;
import androidx.appcompat.widget.AppCompatButton;
import androidx.fragment.app.FragmentActivity;
import id.dana.R;
import id.dana.nearbyme.merchantreview.model.MerchantReviewDialogDismissState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.AndroidWebView;
import o.setAnimationStyle;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "id/dana/nearbyme/merchantreview/MerchantReviewDialogFragment$setupSubmitButton$1$1"}, k = 3, mv = {1, 4, 2})
final class MerchantReviewDialogFragment$FastBitmap$CoordinateSystem implements View.OnClickListener {
    final /* synthetic */ MerchantReviewDialogFragment setMax;
    final /* synthetic */ AppCompatButton setMin;

    MerchantReviewDialogFragment$FastBitmap$CoordinateSystem(AppCompatButton appCompatButton, MerchantReviewDialogFragment merchantReviewDialogFragment) {
        this.setMin = appCompatButton;
        this.setMax = merchantReviewDialogFragment;
    }

    public final void onClick(View view) {
        Unit unused = this.setMax.getMax();
        MerchantReviewDialogFragment.setMax(this.setMax);
        setAnimationStyle setanimationstyle = setAnimationStyle.setMax;
        FragmentActivity activity = this.setMax.getActivity();
        if (activity != null) {
            String string = this.setMin.getResources().getString(R.string.review_succes_toast_message);
            Intrinsics.checkNotNullExpressionValue(string, "resources.getString(R.st…iew_succes_toast_message)");
            setAnimationStyle.getMax(activity, R.drawable.ic_success, R.color.f20292131099937, string, 55, 1000, 1);
            AndroidWebView.a max = MerchantReviewDialogFragment.getMax(this.setMax);
            MerchantReviewDialogDismissState merchantReviewDialogDismissState = MerchantReviewDialogDismissState.DISMISSED_BY_SUBMIT;
            Intrinsics.checkNotNullParameter(merchantReviewDialogDismissState, "<set-?>");
            max.getMin = merchantReviewDialogDismissState;
            this.setMax.dismiss();
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.app.Activity");
    }
}
