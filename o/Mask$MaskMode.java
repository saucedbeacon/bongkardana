package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002\u001a\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004*\b\u0012\u0004\u0012\u00020\u00020\u0004¨\u0006\u0005"}, d2 = {"toGnBindingBenefit", "Lid/dana/domain/oauth/model/GnBindingBenefit;", "Lid/dana/data/config/model/BindingBenefitEntity;", "toGnBindingBenefitList", "", "data_productionRelease"}, k = 2, mv = {1, 4, 2})
public final class Mask$MaskMode {
    @NotNull
    public static final List<getAssetContent> toGnBindingBenefitList(@NotNull List<JsonReader$Token> list) {
        Intrinsics.checkNotNullParameter(list, "$this$toGnBindingBenefitList");
        Iterable<JsonReader$Token> iterable = list;
        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        for (JsonReader$Token gnBindingBenefit : iterable) {
            arrayList.add(toGnBindingBenefit(gnBindingBenefit));
        }
        return (List) arrayList;
    }

    private static final getAssetContent toGnBindingBenefit(JsonReader$Token jsonReader$Token) {
        return new getAssetContent(jsonReader$Token.getIcon(), jsonReader$Token.getName(), jsonReader$Token.getNameInBahasa());
    }
}
