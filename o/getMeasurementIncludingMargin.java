package o;

import com.google.android.gms.common.util.BiConsumer;
import com.google.firebase.remoteconfig.internal.ConfigContainer;
import com.google.firebase.remoteconfig.internal.Personalization;

public final class getMeasurementIncludingMargin implements BiConsumer {
    private final Personalization getMax;

    public getMeasurementIncludingMargin(Personalization personalization) {
        this.getMax = personalization;
    }

    public final void accept(Object obj, Object obj2) {
        this.getMax.logArmActive((String) obj, (ConfigContainer) obj2);
    }
}
