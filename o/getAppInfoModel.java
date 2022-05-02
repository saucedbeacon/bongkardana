package o;

final class getAppInfoModel implements RedDotDrawable {
    private final String getMax;

    public getAppInfoModel(String str) {
        this.getMax = str;
    }

    public final Object apply(Object obj) {
        return generateFromJSON.fromSingleBiztype(this.getMax, (String) obj);
    }
}
