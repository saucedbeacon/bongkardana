package o;

import java.util.List;

final class Accessor implements RedDotDrawable {
    private final isRemoteCallExtension getMax;

    final class InquiryCallback implements RedDotDrawable {
        private final isRemoteCallExtension setMax;
        private final GriverFullLinkStageMonitor setMin;

        public InquiryCallback(isRemoteCallExtension isremotecallextension, GriverFullLinkStageMonitor griverFullLinkStageMonitor) {
            this.setMax = isremotecallextension;
            this.setMin = griverFullLinkStageMonitor;
        }

        public final Object apply(Object obj) {
            return this.setMax.lambda$removeRecentBankAndSyncToUserConfig$14(this.setMin, (List) obj);
        }
    }

    public Accessor(isRemoteCallExtension isremotecallextension) {
        this.getMax = isremotecallextension;
    }

    public final Object apply(Object obj) {
        return this.getMax.lambda$migrateRoomToUserConfig$18((Long[]) obj);
    }
}
