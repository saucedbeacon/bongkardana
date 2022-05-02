package o;

import kotlin.Pair;

final class IPCCallManagerImpl implements RedDotDrawable {
    public static final IPCCallManagerImpl getMin = new IPCCallManagerImpl();

    final class IPCCallProxyHandler implements RedDotDrawable {
        private final double getMin;
        private final int length;
        private final getIpcProxy setMax;
        private final double setMin;

        public IPCCallProxyHandler(getIpcProxy getipcproxy, int i, double d, double d2) {
            this.setMax = getipcproxy;
            this.length = i;
            this.setMin = d;
            this.getMin = d2;
        }

        public final Object apply(Object obj) {
            return this.setMax.lambda$getPromoAds$1(this.length, this.setMin, this.getMin, (Pair) obj);
        }
    }

    public final Object apply(Object obj) {
        return ((Local) obj).toPromoAds();
    }
}
