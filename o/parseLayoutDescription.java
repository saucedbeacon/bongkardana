package o;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.engine.GlideException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import o.setPositiveButtonIcon;

public final class parseLayoutDescription<DataType, ResourceType, Transcode> {
    private final setPositiveButtonIcon.length<List<Throwable>> getMax;
    private final List<? extends setElevation<DataType, ResourceType>> getMin;
    private final Class<DataType> length;
    final setConstraintSet<ResourceType, Transcode> setMax;
    private final String setMin;

    public interface getMin<ResourceType> {
        @NonNull
        fireTrigger<ResourceType> length(@NonNull fireTrigger<ResourceType> firetrigger);
    }

    public parseLayoutDescription(Class<DataType> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<? extends setElevation<DataType, ResourceType>> list, setConstraintSet<ResourceType, Transcode> setconstraintset, setPositiveButtonIcon.length<List<Throwable>> length2) {
        this.length = cls;
        this.getMin = list;
        this.setMax = setconstraintset;
        this.getMax = length2;
        StringBuilder sb = new StringBuilder("Failed DecodePath{");
        sb.append(cls.getSimpleName());
        sb.append("->");
        sb.append(cls2.getSimpleName());
        sb.append("->");
        sb.append(cls3.getSimpleName());
        sb.append("}");
        this.setMin = sb.toString();
    }

    /* access modifiers changed from: package-private */
    @NonNull
    public final fireTrigger<ResourceType> setMax(setProgress<DataType> setprogress, int i, int i2, @NonNull MotionHelper motionHelper) throws GlideException {
        List<Throwable> max = this.getMax.getMax();
        if (max != null) {
            List list = max;
            try {
                return setMax(setprogress, i, i2, motionHelper, list);
            } finally {
                this.getMax.getMin(list);
            }
        } else {
            throw new NullPointerException("Argument must not be null");
        }
    }

    @NonNull
    private fireTrigger<ResourceType> setMax(setProgress<DataType> setprogress, int i, int i2, @NonNull MotionHelper motionHelper, List<Throwable> list) throws GlideException {
        int size = this.getMin.size();
        fireTrigger<ResourceType> firetrigger = null;
        for (int i3 = 0; i3 < size; i3++) {
            setElevation setelevation = (setElevation) this.getMin.get(i3);
            try {
                if (setelevation.length(setprogress.getMin(), motionHelper)) {
                    firetrigger = setelevation.getMax(setprogress.getMin(), i, i2, motionHelper);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e) {
                list.add(e);
            }
            if (firetrigger != null) {
                break;
            }
        }
        if (firetrigger != null) {
            return firetrigger;
        }
        throw new GlideException(this.setMin, (List<Throwable>) new ArrayList(list));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DecodePath{ dataClass=");
        sb.append(this.length);
        sb.append(", decoders=");
        sb.append(this.getMin);
        sb.append(", transcoder=");
        sb.append(this.setMax);
        sb.append('}');
        return sb.toString();
    }
}
