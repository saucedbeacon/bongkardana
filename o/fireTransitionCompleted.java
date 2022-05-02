package o;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.engine.GlideException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import o.parseLayoutDescription;
import o.setPositiveButtonIcon;

public final class fireTransitionCompleted<Data, ResourceType, Transcode> {
    private final Class<Data> getMax;
    private final List<? extends parseLayoutDescription<Data, ResourceType, Transcode>> length;
    private final setPositiveButtonIcon.length<List<Throwable>> setMax;
    private final String setMin;

    public fireTransitionCompleted(Class<Data> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<parseLayoutDescription<Data, ResourceType, Transcode>> list, setPositiveButtonIcon.length<List<Throwable>> length2) {
        this.getMax = cls;
        this.setMax = length2;
        if (!list.isEmpty()) {
            this.length = list;
            StringBuilder sb = new StringBuilder("Failed LoadPath{");
            sb.append(cls.getSimpleName());
            sb.append("->");
            sb.append(cls2.getSimpleName());
            sb.append("->");
            sb.append(cls3.getSimpleName());
            sb.append("}");
            this.setMin = sb.toString();
            return;
        }
        throw new IllegalArgumentException("Must not be empty.");
    }

    public final fireTrigger<Transcode> length(setProgress<Data> setprogress, @NonNull MotionHelper motionHelper, int i, int i2, parseLayoutDescription.getMin<ResourceType> getmin) throws GlideException {
        List<Throwable> max = this.setMax.getMax();
        if (max != null) {
            List list = max;
            try {
                return setMax(setprogress, motionHelper, i, i2, getmin, list);
            } finally {
                this.setMax.getMin(list);
            }
        } else {
            throw new NullPointerException("Argument must not be null");
        }
    }

    private fireTrigger<Transcode> setMax(setProgress<Data> setprogress, @NonNull MotionHelper motionHelper, int i, int i2, parseLayoutDescription.getMin<ResourceType> getmin, List<Throwable> list) throws GlideException {
        int size = this.length.size();
        fireTrigger<Transcode> firetrigger = null;
        for (int i3 = 0; i3 < size; i3++) {
            parseLayoutDescription parselayoutdescription = (parseLayoutDescription) this.length.get(i3);
            try {
                firetrigger = parselayoutdescription.setMax.length(getmin.length(parselayoutdescription.setMax(setprogress, i, i2, motionHelper)), motionHelper);
            } catch (GlideException e) {
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
        StringBuilder sb = new StringBuilder("LoadPath{decodePaths=");
        sb.append(Arrays.toString(this.length.toArray()));
        sb.append('}');
        return sb.toString();
    }
}
