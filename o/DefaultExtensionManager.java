package o;

final class DefaultExtensionManager implements RedDotManager {
    private final onException length;

    public DefaultExtensionManager(onException onexception) {
        this.length = onexception;
    }

    public final void accept(Object obj) {
        this.length.lambda$getPromoClaimBannerConfiguration$6((setNodeId) obj);
    }

    public final class ExtensionCreator implements getAdapterPosition<setExtensionCreator> {

        static final class length {
            /* access modifiers changed from: private */
            public static final ExtensionCreator setMax = new ExtensionCreator();
        }

        public final setExtensionCreator get() {
            return newInstance();
        }

        public static ExtensionCreator create() {
            return length.setMax;
        }

        public static setExtensionCreator newInstance() {
            return new setExtensionCreator();
        }
    }
}
