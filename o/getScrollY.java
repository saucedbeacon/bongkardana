package o;

public class getScrollY {
    private String limitCount;
    private String limitRangeType;
    private String limitType;

    public String getLimitType() {
        return this.limitType;
    }

    public void setLimitType(String str) {
        this.limitType = str;
    }

    public String getLimitCount() {
        return this.limitCount;
    }

    public void setLimitCount(String str) {
        this.limitCount = str;
    }

    public String getLimitRangeType() {
        return this.limitRangeType;
    }

    public void setLimitRangeType(String str) {
        this.limitRangeType = str;
    }

    public GriverBundleUtils toPromoLimitInfo() {
        GriverBundleUtils griverBundleUtils = new GriverBundleUtils();
        griverBundleUtils.setLimitCount(this.limitCount);
        griverBundleUtils.setLimitRangeType(this.limitRangeType);
        griverBundleUtils.setLimitType(this.limitType);
        return griverBundleUtils;
    }
}
