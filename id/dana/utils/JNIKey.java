package id.dana.utils;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import o.updateActionSheetContent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H ¨\u0006\u0005"}, d2 = {"Lid/dana/utils/JNIKey;", "", "()V", "severity1", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class JNIKey {
    @NotNull
    public static final JNIKey setMax;

    @JvmStatic
    @Nullable
    public static final native String severity1();

    static {
        JNIKey jNIKey = new JNIKey();
        setMax = jNIKey;
        try {
            System.loadLibrary("ae5c9b");
        } catch (UnsatisfiedLinkError unused) {
            updateActionSheetContent.e(jNIKey.getClass().getSimpleName(), "Cannot load jni class, maybe the JNI class has been moved");
        }
    }

    private JNIKey() {
    }
}
