package o;

final class onWorkerErrorIntercept implements RedDotDrawable {
    private final needPermissionCheck setMin;

    public onWorkerErrorIntercept(needPermissionCheck needpermissioncheck) {
        this.setMin = needpermissioncheck;
    }

    public final Object apply(Object obj) {
        return this.setMin.lambda$getDefaultNewMerchantSubCategories$22((Throwable) obj);
    }
}
