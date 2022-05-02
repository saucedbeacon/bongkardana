package o;

import android.content.res.AssetManager;
import android.os.ParcelFileDescriptor;
import androidx.annotation.NonNull;
import java.io.IOException;

public final class onTransitionTrigger extends onTransitionStarted<ParcelFileDescriptor> {
    /* access modifiers changed from: protected */
    public final /* synthetic */ void getMax(Object obj) throws IOException {
        ((ParcelFileDescriptor) obj).close();
    }

    public onTransitionTrigger(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    @NonNull
    public final Class<ParcelFileDescriptor> setMax() {
        return ParcelFileDescriptor.class;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ Object setMax(AssetManager assetManager, String str) throws IOException {
        return assetManager.openFd(str).getParcelFileDescriptor();
    }
}
