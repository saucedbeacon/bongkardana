package o;

import android.content.res.AssetManager;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.NonNull;
import java.io.IOException;
import java.io.InputStream;

public final class isAttachedToWindow extends onTransitionStarted<InputStream> {
    /* access modifiers changed from: protected */
    public final /* synthetic */ void getMax(Object obj) throws IOException {
        ((InputStream) obj).close();
    }

    public isAttachedToWindow(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    @NonNull
    public final Class<InputStream> setMax() {
        return InputStream.class;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ Object setMax(AssetManager assetManager, String str) throws IOException {
        try {
            Object[] objArr = new Object[2];
            objArr[1] = str;
            objArr[0] = assetManager;
            return ((Class) upFrom.setMax(19 - TextUtils.indexOf("", ""), TextUtils.getCapsMode("", 0, 0), (char) (56348 - View.MeasureSpec.makeMeasureSpec(0, 0)))).getMethod("getMin", new Class[]{AssetManager.class, String.class}).invoke((Object) null, objArr);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }
}
