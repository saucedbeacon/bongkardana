package o;

public final class BridgeParam implements getAdapterPosition<ResourceLoadPoint> {

    static final class setMin {
        /* access modifiers changed from: private */
        public static final BridgeParam getMax = new BridgeParam();
    }

    public final ResourceLoadPoint get() {
        return newInstance();
    }

    public static BridgeParam create() {
        return setMin.getMax;
    }

    public static ResourceLoadPoint newInstance() {
        return new ResourceLoadPoint();
    }
}
