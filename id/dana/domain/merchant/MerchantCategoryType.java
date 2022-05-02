package id.dana.domain.merchant;

import kotlin.Metadata;
import o.BaseAppContext;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007j\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lid/dana/domain/merchant/MerchantCategoryType;", "", "key", "", "defaultPath", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getDefaultPath", "()Ljava/lang/String;", "getKey", "MAPS", "LIST", "domain_release"}, k = 1, mv = {1, 4, 2})
public enum MerchantCategoryType {
    MAPS("merchant_category_maps_order", BaseAppContext.DEFAULT_MERCHANT_MAPS_CATEGORIES_ORDER),
    LIST("merchant_category_list_order", BaseAppContext.DEFAULT_MERCHANT_LIST_CATEGORIES_ORDER);
    
    @NotNull
    private final String defaultPath;
    @NotNull
    private final String key;

    private MerchantCategoryType(String str, String str2) {
        this.key = str;
        this.defaultPath = str2;
    }

    @NotNull
    public final String getDefaultPath() {
        return this.defaultPath;
    }

    @NotNull
    public final String getKey() {
        return this.key;
    }
}
