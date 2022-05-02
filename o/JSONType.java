package o;

import id.dana.di.modules.AddReceiverInfoModule;
import o.SystemAlarmService;

public final class JSONType implements getAdapterPosition<SystemAlarmService.getMin> {
    private final AddReceiverInfoModule setMax;

    public static SystemAlarmService.getMin getMin(AddReceiverInfoModule addReceiverInfoModule) {
        SystemAlarmService.getMin min = addReceiverInfoModule.setMin();
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        SystemAlarmService.getMin min = this.setMax.setMin();
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
