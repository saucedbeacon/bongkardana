package o;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public abstract class setFitsSystemWindows<Z> extends layoutChildWithKeyline<ImageView, Z> {
    @Nullable
    private Animatable getMin;

    /* access modifiers changed from: protected */
    public abstract void setMin(@Nullable Z z);

    public setFitsSystemWindows(ImageView imageView) {
        super(imageView);
    }

    public final void getMin(@Nullable Drawable drawable) {
        super.getMin(drawable);
        setMin((Object) null);
        this.getMin = null;
        ((ImageView) this.getMax).setImageDrawable(drawable);
    }

    public final void length(@Nullable Drawable drawable) {
        super.length(drawable);
        setMin((Object) null);
        this.getMin = null;
        ((ImageView) this.getMax).setImageDrawable(drawable);
    }

    public final void getMax(@Nullable Drawable drawable) {
        super.getMax(drawable);
        Animatable animatable = this.getMin;
        if (animatable != null) {
            animatable.stop();
        }
        setMin((Object) null);
        this.getMin = null;
        ((ImageView) this.getMax).setImageDrawable(drawable);
    }

    public final void setMax() {
        Animatable animatable = this.getMin;
        if (animatable != null) {
            animatable.start();
        }
    }

    public final void getMin() {
        Animatable animatable = this.getMin;
        if (animatable != null) {
            animatable.stop();
        }
    }

    public final void getMin(@NonNull Z z) {
        setMin(z);
        if (z instanceof Animatable) {
            Animatable animatable = (Animatable) z;
            this.getMin = animatable;
            animatable.start();
            return;
        }
        this.getMin = null;
    }
}
