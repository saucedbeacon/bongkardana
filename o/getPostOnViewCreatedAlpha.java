package o;

import android.content.Context;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.platforminfo.LibraryVersionComponent;

public final class getPostOnViewCreatedAlpha implements LibraryVersionComponent.VersionExtractor {
    public static final getPostOnViewCreatedAlpha getMax = new getPostOnViewCreatedAlpha();

    public final String extract(Object obj) {
        return FirebaseCommonRegistrar.lambda$getComponents$3((Context) obj);
    }
}
