package o;

import java.util.List;

public class parseAppInfoFromJSONString {
    private List<String> categoryFilter;
    private String categoryId;
    private String categoryName;
    private List<String> categorySorting;

    public String getCategoryId() {
        return this.categoryId;
    }

    public void setCategoryId(String str) {
        this.categoryId = str;
    }

    public String getCategoryName() {
        return this.categoryName;
    }

    public void setCategoryName(String str) {
        this.categoryName = str;
    }

    public List<String> getCategorySorting() {
        return this.categorySorting;
    }

    public void setCategorySorting(List<String> list) {
        this.categorySorting = list;
    }

    public List<String> getCategoryFilter() {
        return this.categoryFilter;
    }

    public void setCategoryFilter(List<String> list) {
        this.categoryFilter = list;
    }
}
