package o;

import android.content.Context;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.platforminfo.LibraryVersionComponent;

public final class isHideReplaced implements LibraryVersionComponent.VersionExtractor {
    public static final isHideReplaced length = new isHideReplaced();

    public final String extract(Object obj) {
        return FirebaseCommonRegistrar.lambda$getComponents$2((Context) obj);
    }
}
