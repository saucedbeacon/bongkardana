package o;

import java.util.List;

public class installPackage {
    private List<parseAppInfoFromJSONString> promoCategories;
    private long totalCategory;

    public long getTotalCategory() {
        return this.totalCategory;
    }

    public void setTotalCategory(long j) {
        this.totalCategory = j;
    }

    public List<parseAppInfoFromJSONString> getPromoCategories() {
        return this.promoCategories;
    }

    public void setPromoCategories(List<parseAppInfoFromJSONString> list) {
        this.promoCategories = list;
    }
}
