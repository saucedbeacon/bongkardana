package o;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.Nullable;
import com.alibaba.griver.ui.ant.utils.IconfontConstants;
import java.util.HashMap;
import java.util.Map;

public final class isIconfiedByDefault {
    public final Map<onSubmitQuery<String>, Typeface> getMax = new HashMap();
    @Nullable
    public setOrientation getMin;
    public String isInside = IconfontConstants.ICONFONT_FILE_SUFFIX;
    public final Map<String, Typeface> length = new HashMap();
    public final onSubmitQuery<String> setMax = new onSubmitQuery<>();
    public final AssetManager setMin;

    public isIconfiedByDefault(Drawable.Callback callback, @Nullable setOrientation setorientation) {
        this.getMin = setorientation;
        if (!(callback instanceof View)) {
            setTitleMargin.setMax("LottieDrawable must be inside of a view for images to work.");
            this.setMin = null;
            return;
        }
        this.setMin = ((View) callback).getContext().getAssets();
    }
}
