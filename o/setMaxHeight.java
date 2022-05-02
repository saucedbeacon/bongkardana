package o;

import androidx.annotation.NonNull;
import java.io.File;
import java.io.IOException;

public final class setMaxHeight implements setElevation<File, File> {
    public final /* bridge */ /* synthetic */ boolean length(@NonNull Object obj, @NonNull MotionHelper motionHelper) throws IOException {
        return true;
    }

    public final /* synthetic */ fireTrigger getMax(@NonNull Object obj, int i, int i2, @NonNull MotionHelper motionHelper) throws IOException {
        int max = dispatchOnCancelled.setMax(i);
        if (i != max) {
            onCanceled oncanceled = new onCanceled(i, max, 1);
            onCancelLoad.setMax(-1726078367, oncanceled);
            onCancelLoad.getMin(-1726078367, oncanceled);
        }
        return new getMaxHeight((File) obj);
    }
}
