package o;

import android.content.ContentResolver;
import android.net.Uri;
import androidx.annotation.NonNull;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.FileNotFoundException;
import java.io.IOException;
import o.isUseOnHide;

public abstract class enableTransition<T> implements isUseOnHide<T> {
    private T getMax;
    private final Uri getMin;
    private final ContentResolver length;

    public final void getMax() {
    }

    /* access modifiers changed from: protected */
    public abstract T getMin(Uri uri, ContentResolver contentResolver) throws FileNotFoundException;

    /* access modifiers changed from: protected */
    public abstract void length(T t) throws IOException;

    public enableTransition(ContentResolver contentResolver, Uri uri) {
        this.length = contentResolver;
        this.getMin = uri;
    }

    public final void getMin(@NonNull Priority priority, @NonNull isUseOnHide.getMin<? super T> getmin) {
        try {
            T min = getMin(this.getMin, this.length);
            this.getMax = min;
            getmin.getMax(min);
        } catch (FileNotFoundException e) {
            getmin.setMax(e);
        }
    }

    public final void getMin() {
        T t = this.getMax;
        if (t != null) {
            try {
                length(t);
            } catch (IOException unused) {
            }
        }
    }

    @NonNull
    public final DataSource length() {
        return DataSource.LOCAL;
    }
}
