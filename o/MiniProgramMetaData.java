package o;

import id.dana.di.modules.VerifyNumberModule;
import o.CompassSensorService;

public final class MiniProgramMetaData implements getAdapterPosition<CompassSensorService.getMin> {
    private final VerifyNumberModule length;

    private MiniProgramMetaData(VerifyNumberModule verifyNumberModule) {
        this.length = verifyNumberModule;
    }

    public static MiniProgramMetaData getMax(VerifyNumberModule verifyNumberModule) {
        return new MiniProgramMetaData(verifyNumberModule);
    }

    public final /* synthetic */ Object get() {
        CompassSensorService.getMin length2 = this.length.length();
        if (length2 != null) {
            return length2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
