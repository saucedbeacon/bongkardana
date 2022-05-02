package o;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H&J'\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH&¢\u0006\u0002\u0010\nJ\u001a\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\f0\u0003H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, d2 = {"Lid/dana/domain/saving/SavingCategoryRepository;", "", "getSavingCategories", "Lio/reactivex/Observable;", "", "Lid/dana/domain/saving/model/SavingCategory;", "getSavingCategoriesByKeys", "keys", "", "", "([Ljava/lang/String;)Lio/reactivex/Observable;", "getSavingCategoriesMap", "", "domain_release"}, k = 1, mv = {1, 4, 2})
public interface toStringBuilder {
    @NotNull
    TitleBarRightButtonView.AnonymousClass1<List<setDebug>> getSavingCategories();

    @NotNull
    TitleBarRightButtonView.AnonymousClass1<List<setDebug>> getSavingCategoriesByKeys(@NotNull String[] strArr);

    @NotNull
    TitleBarRightButtonView.AnonymousClass1<Map<String, setDebug>> getSavingCategoriesMap();
}
