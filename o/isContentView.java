package o;

import android.annotation.TargetApi;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import com.github.mikephil.charting.data.Entry;
import id.dana.savings.activity.SavingsActivity;
import java.util.List;

public abstract class isContentView<T extends Entry> extends findDrawerWithGravity<T> implements setKeyListener<T> {
    public float ICustomTabsCallback = 2.5f;
    private int b = 85;
    public boolean extraCallbackWithResult = false;
    protected Drawable getCause;
    private int valueOf = Color.rgb(SavingsActivity.RV_BENEFIT_WIDTH, 234, 255);

    public isContentView(List<T> list, String str) {
        super(list, str);
    }

    public final int newSession() {
        return this.valueOf;
    }

    public final Drawable extraCommand() {
        return this.getCause;
    }

    @TargetApi(18)
    public final void setMin(Drawable drawable) {
        this.getCause = drawable;
    }

    public final int warmup() {
        return this.b;
    }

    public final float mayLaunchUrl() {
        return this.ICustomTabsCallback;
    }

    public final boolean newSessionWithExtras() {
        return this.extraCallbackWithResult;
    }
}
