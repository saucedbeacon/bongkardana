package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toSavingDetail", "Lid/dana/domain/saving/model/SavingDetail;", "Lid/dana/data/saving/repository/source/network/response/SavingDetailResult;", "data_productionRelease"}, k = 2, mv = {1, 4, 2})
public final class RVHttpRequest {
    @NotNull
    public static final setRegionExitPeriod toSavingDetail(@NotNull shortLinkOnly shortlinkonly) {
        Intrinsics.checkNotNullParameter(shortlinkonly, "$this$toSavingDetail");
        BeaconManager savingGoalView = access$802.toSavingGoalView(shortlinkonly.getSavingView());
        List<useSpdy> topUpViews = shortlinkonly.getTopUpViews();
        List<setRssiFilterImplClass> topUpViews2 = topUpViews != null ? isUseCache.toTopUpViews(topUpViews) : null;
        if (topUpViews2 == null) {
            topUpViews2 = CollectionsKt.emptyList();
        }
        return new setRegionExitPeriod(savingGoalView, topUpViews2, shortlinkonly.getHasNext());
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0016\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0001\u001a\n\u0010\u0004\u001a\u00020\u0002*\u00020\u0003¨\u0006\u0005"}, d2 = {"toSavingCategories", "", "Lid/dana/domain/saving/model/SavingCategory;", "Lid/dana/data/saving/model/SavingCategoryEntity;", "toSavingCategory", "data_productionRelease"}, k = 2, mv = {1, 4, 2})
    public final class Builder {
        @NotNull
        public static final List<setDebug> toSavingCategories(@NotNull List<access$702> list) {
            Intrinsics.checkNotNullParameter(list, "$this$toSavingCategories");
            Iterable<access$702> iterable = list;
            Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
            for (access$702 savingCategory : iterable) {
                arrayList.add(toSavingCategory(savingCategory));
            }
            return (List) arrayList;
        }

        @NotNull
        public static final setDebug toSavingCategory(@NotNull access$702 access_702) {
            Intrinsics.checkNotNullParameter(access_702, "$this$toSavingCategory");
            String categoryCode = access_702.getCategoryCode();
            if (categoryCode == null) {
                String removePrefix = StringsKt.removePrefix("saving_others", (CharSequence) "saving_");
                Locale locale = Locale.ROOT;
                Intrinsics.checkNotNullExpressionValue(locale, "Locale.ROOT");
                if (removePrefix != null) {
                    categoryCode = removePrefix.toUpperCase(locale);
                    Intrinsics.checkNotNullExpressionValue(categoryCode, "(this as java.lang.String).toUpperCase(locale)");
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
            }
            return new setDebug(categoryCode, access_702.getName(), access_702.getIconUrlDefault(), access_702.getIconUrlSelected(), access_702.getIconUrlLevel1(), access_702.getIconUrlLevel2(), access_702.getIconUrlLevel3(), access_702.getIconUrlLevel4(), access_702.getIconUrlLevel5());
        }
    }
}
