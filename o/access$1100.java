package o;

import androidx.annotation.NonNull;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

public final class access$1100 implements setPivotX<ByteBuffer> {
    public final /* bridge */ /* synthetic */ boolean setMax(@NonNull Object obj, @NonNull File file, @NonNull MotionHelper motionHelper) {
        return setMax((ByteBuffer) obj, file);
    }

    private static boolean setMax(@NonNull ByteBuffer byteBuffer, @NonNull File file) {
        try {
            setInsetOffsetY.length(byteBuffer, file);
            return true;
        } catch (IOException unused) {
            return false;
        }
    }
}
