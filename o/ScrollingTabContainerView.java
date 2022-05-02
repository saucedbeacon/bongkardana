package o;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.LottieDrawable;
import java.util.HashMap;
import java.util.Map;

public class ScrollingTabContainerView {
    public boolean getMax = true;
    @Nullable
    private final LottieDrawable getMin = null;
    public final Map<String, String> length = new HashMap();
    @Nullable
    private final LottieAnimationView setMax = null;

    @VisibleForTesting
    ScrollingTabContainerView() {
    }
}
