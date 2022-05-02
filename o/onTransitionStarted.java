package o;

import android.content.res.AssetManager;
import androidx.annotation.NonNull;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.IOException;
import o.isUseOnHide;

public abstract class onTransitionStarted<T> implements isUseOnHide<T> {
    private final AssetManager getMax;
    private T getMin;
    private final String length;

    public final void getMax() {
    }

    /* access modifiers changed from: protected */
    public abstract void getMax(T t) throws IOException;

    /* access modifiers changed from: protected */
    public abstract T setMax(AssetManager assetManager, String str) throws IOException;

    public onTransitionStarted(AssetManager assetManager, String str) {
        this.getMax = assetManager;
        this.length = str;
    }

    public final void getMin(@NonNull Priority priority, @NonNull isUseOnHide.getMin<? super T> getmin) {
        try {
            T max = setMax(this.getMax, this.length);
            this.getMin = max;
            getmin.getMax(max);
        } catch (IOException e) {
            getmin.setMax(e);
        }
    }

    public final void getMin() {
        T t = this.getMin;
        if (t != null) {
            try {
                getMax(t);
            } catch (IOException unused) {
            }
        }
    }

    @NonNull
    public final DataSource length() {
        return DataSource.LOCAL;
    }
}
