package o;

import id.dana.di.modules.AddReceiverInfoModule;
import o.SystemAlarmService;
import o.b;

public final class JSONField implements getAdapterPosition<SystemAlarmService.setMin> {
    private final b.C0007b<SystemJobService> getMax;
    private final AddReceiverInfoModule setMax;

    public static SystemAlarmService.setMin setMin(AddReceiverInfoModule addReceiverInfoModule, SystemJobService systemJobService) {
        SystemAlarmService.setMin max = addReceiverInfoModule.getMax(systemJobService);
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        SystemAlarmService.setMin max = this.setMax.getMax(this.getMax.get());
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
