package o;

import androidx.annotation.NonNull;
import java.util.concurrent.TimeUnit;
import o.GriverProgressBar;
import o.TitleBarRightButtonView;

public class setH5Page {
    public GriverProgressBar.UpdateRunnable setMin;

    public interface getMax {
        void onFinish();
    }

    public final void getMax(int i, @NonNull getMax getmax) {
        this.setMin = TitleBarRightButtonView.AnonymousClass1.timer((long) i, TimeUnit.SECONDS, getSecureSignatureComp.setMin()).observeOn(hideProgress.length()).subscribe(new ITinyMenuPopupWindow(getmax));
    }
}
