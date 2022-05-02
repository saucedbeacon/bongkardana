package o;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import androidx.annotation.NonNull;
import id.dana.data.constant.BranchLinkConstant;
import java.io.FileNotFoundException;
import java.io.IOException;

public final class onTransitionChange extends enableTransition<ParcelFileDescriptor> {
    /* access modifiers changed from: protected */
    public final /* synthetic */ void length(Object obj) throws IOException {
        ((ParcelFileDescriptor) obj).close();
    }

    public onTransitionChange(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    @NonNull
    public final Class<ParcelFileDescriptor> setMax() {
        return ParcelFileDescriptor.class;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ Object getMin(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        AssetFileDescriptor openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, BranchLinkConstant.PayloadKey.REFERRAL);
        if (openAssetFileDescriptor != null) {
            return openAssetFileDescriptor.getParcelFileDescriptor();
        }
        throw new FileNotFoundException("FileDescriptor is null for: ".concat(String.valueOf(uri)));
    }
}
