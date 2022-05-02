package o;

import id.dana.di.modules.VerifyNumberModule;

public final class setExtendedInfo implements getAdapterPosition<Boolean> {
    private final VerifyNumberModule getMax;

    private setExtendedInfo(VerifyNumberModule verifyNumberModule) {
        this.getMax = verifyNumberModule;
    }

    public static setExtendedInfo setMin(VerifyNumberModule verifyNumberModule) {
        return new setExtendedInfo(verifyNumberModule);
    }

    private static boolean length(VerifyNumberModule verifyNumberModule) {
        return verifyNumberModule.setMax();
    }

    public final /* synthetic */ Object get() {
        return Boolean.valueOf(length(this.getMax));
    }
}
