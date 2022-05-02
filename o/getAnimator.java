package o;

import android.content.Context;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.platforminfo.LibraryVersionComponent;

public final class getAnimator implements LibraryVersionComponent.VersionExtractor {
    public static final getAnimator setMin = new getAnimator();

    public final String extract(Object obj) {
        return FirebaseCommonRegistrar.lambda$getComponents$0((Context) obj);
    }
}
