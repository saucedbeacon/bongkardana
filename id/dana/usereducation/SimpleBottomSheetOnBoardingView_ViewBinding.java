package id.dana.usereducation;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import id.dana.R;
import o.drawDividersHorizontal;

public class SimpleBottomSheetOnBoardingView_ViewBinding implements Unbinder {
    private SimpleBottomSheetOnBoardingView setMin;

    @UiThread
    public SimpleBottomSheetOnBoardingView_ViewBinding(SimpleBottomSheetOnBoardingView simpleBottomSheetOnBoardingView, View view) {
        this.setMin = simpleBottomSheetOnBoardingView;
        simpleBottomSheetOnBoardingView.ivOnBoardingImage = (ImageView) drawDividersHorizontal.setMin(view, R.id.f49952131363550, "field 'ivOnBoardingImage'", ImageView.class);
        simpleBottomSheetOnBoardingView.tvSubtitle = (TextView) drawDividersHorizontal.setMin(view, R.id.f67832131365410, "field 'tvSubtitle'", TextView.class);
        simpleBottomSheetOnBoardingView.tvBodyText = (TextView) drawDividersHorizontal.setMin(view, R.id.f67822131365409, "field 'tvBodyText'", TextView.class);
    }

    @CallSuper
    public final void setMax() {
        SimpleBottomSheetOnBoardingView simpleBottomSheetOnBoardingView = this.setMin;
        if (simpleBottomSheetOnBoardingView != null) {
            this.setMin = null;
            simpleBottomSheetOnBoardingView.ivOnBoardingImage = null;
            simpleBottomSheetOnBoardingView.tvSubtitle = null;
            simpleBottomSheetOnBoardingView.tvBodyText = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
