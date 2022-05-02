package o;

final class BizPermissionManager implements RedDotDrawable {
    public static final BizPermissionManager setMax = new BizPermissionManager();

    public final Object apply(Object obj) {
        return ((PermissionGuildePoint) obj).shortUrl;
    }
}
