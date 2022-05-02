package o;

import android.content.Context;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.platforminfo.LibraryVersionComponent;

public final class setPostOnViewCreatedAlpha implements LibraryVersionComponent.VersionExtractor {
    public static final setPostOnViewCreatedAlpha length = new setPostOnViewCreatedAlpha();

    public final String extract(Object obj) {
        return FirebaseCommonRegistrar.lambda$getComponents$1((Context) obj);
    }
}
