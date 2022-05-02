package o;

final class loadGlobalResource implements RedDotDrawable {
    private final needPermissionCheck getMax;

    public loadGlobalResource(needPermissionCheck needpermissioncheck) {
        this.getMax = needpermissioncheck;
    }

    public final Object apply(Object obj) {
        return this.getMax.lambda$defaultMerchantSubcategoriesIfEmpty$6((Throwable) obj);
    }
}
