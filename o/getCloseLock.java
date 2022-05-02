package o;

import androidx.annotation.NonNull;
import com.caverock.androidsvg.SVG;
import com.caverock.androidsvg.SVGParseException;
import java.io.IOException;
import java.io.InputStream;

public final class getCloseLock implements setElevation<InputStream, SVG> {
    public final /* bridge */ /* synthetic */ boolean length(@NonNull Object obj, @NonNull MotionHelper motionHelper) throws IOException {
        return true;
    }

    public final /* synthetic */ fireTrigger getMax(@NonNull Object obj, int i, int i2, @NonNull MotionHelper motionHelper) throws IOException {
        return getMin((InputStream) obj);
    }

    private static fireTrigger<SVG> getMin(@NonNull InputStream inputStream) throws IOException {
        try {
            return new getRoundPercent(SVG.getFromInputStream(inputStream));
        } catch (SVGParseException e) {
            throw new IOException("Cannot load SVG from stream", e);
        }
    }
}
