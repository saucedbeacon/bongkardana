package o;

final class RVNativePermissionRequestProxy implements RedDotDrawable {
    private final RVNativePermissionRequestManager length;

    public RVNativePermissionRequestProxy(RVNativePermissionRequestManager rVNativePermissionRequestManager) {
        this.length = rVNativePermissionRequestManager;
    }

    public final Object apply(Object obj) {
        return this.length.apply((loadApp) obj);
    }
}
