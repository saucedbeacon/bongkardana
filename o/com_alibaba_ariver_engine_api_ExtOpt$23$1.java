package o;

final class com_alibaba_ariver_engine_api_ExtOpt$23$1 implements RedDotDrawable {
    private final needPermissionCheck length;
    private final String setMax;

    public com_alibaba_ariver_engine_api_ExtOpt$23$1(needPermissionCheck needpermissioncheck, String str) {
        this.length = needpermissioncheck;
        this.setMax = str;
    }

    public final Object apply(Object obj) {
        return this.length.lambda$defaultCategoryIfEmpty$20(this.setMax, (Throwable) obj);
    }
}
