package o;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import androidx.annotation.NonNull;
import id.dana.data.constant.BranchLinkConstant;
import java.io.FileNotFoundException;
import java.io.IOException;

public final class calcCenters extends enableTransition<AssetFileDescriptor> {
    /* access modifiers changed from: protected */
    public final /* synthetic */ void length(Object obj) throws IOException {
        ((AssetFileDescriptor) obj).close();
    }

    public calcCenters(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    @NonNull
    public final Class<AssetFileDescriptor> setMax() {
        return AssetFileDescriptor.class;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ Object getMin(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        AssetFileDescriptor openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, BranchLinkConstant.PayloadKey.REFERRAL);
        if (openAssetFileDescriptor != null) {
            return openAssetFileDescriptor;
        }
        throw new FileNotFoundException("FileDescriptor is null for: ".concat(String.valueOf(uri)));
    }
}
