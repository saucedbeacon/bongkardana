package id.dana.usereducation;

import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindView;
import com.ap.zoloz.hummer.biz.HummerConstants;
import id.dana.R;
import id.dana.usereducation.model.ContentOnBoardingModel;
import kotlin.jvm.internal.Intrinsics;
import o.GyroscopeSensorService;
import o.LandScapeTinyMenuPopupWindow;
import o.setOnMenuWindowDismissListener;

public class SimpleBottomSheetOnBoardingView extends GyroscopeSensorService.SensorChangedListener {
    private ContentOnBoardingModel getMax;
    @BindView(2131363550)
    ImageView ivOnBoardingImage;
    private int setMin;
    @BindView(2131365409)
    TextView tvBodyText;
    @BindView(2131365410)
    TextView tvSubtitle;

    public final int setMax() {
        return R.layout.view_simple_bottom_sheet_on_boarding;
    }

    public final String setMin() {
        return null;
    }

    SimpleBottomSheetOnBoardingView(int i, ContentOnBoardingModel contentOnBoardingModel) {
        this.setMin = i;
        this.getMax = contentOnBoardingModel;
    }

    public final void getMin() {
        LandScapeTinyMenuPopupWindow.AnonymousClass1 r0 = new LandScapeTinyMenuPopupWindow.AnonymousClass1();
        Context context = this.equals;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException(HummerConstants.CONTEXT);
        }
        r0.getMax(context, this.ivOnBoardingImage, this.getMax.length, this.getMax.setMax, (setOnMenuWindowDismissListener.length) null);
        this.tvSubtitle.setText(this.getMax.getMin);
        this.tvBodyText.setText(this.getMax.setMin);
        ImageView imageView = this.ivOnBoardingImage;
        Context context2 = this.equals;
        if (context2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(HummerConstants.CONTEXT);
        }
        imageView.setContentDescription(String.format(context2.getString(R.string.img_intro_), new Object[]{Integer.valueOf(this.setMin)}));
        TextView textView = this.tvSubtitle;
        Context context3 = this.equals;
        if (context3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(HummerConstants.CONTEXT);
        }
        textView.setContentDescription(String.format(context3.getString(R.string.lbl_intro_title_), new Object[]{Integer.valueOf(this.setMin)}));
        TextView textView2 = this.tvBodyText;
        Context context4 = this.equals;
        if (context4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(HummerConstants.CONTEXT);
        }
        textView2.setContentDescription(String.format(context4.getString(R.string.lbl_intro_text_), new Object[]{Integer.valueOf(this.setMin)}));
    }
}
