package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004*\b\u0012\u0004\u0012\u00020\u00020\u0004¨\u0006\u0005"}, d2 = {"toBillerX2B", "Lid/dana/domain/sendmoney/model/BillerX2B;", "Lid/dana/data/sendmoney/model/BillerX2BEntity;", "toBillerX2BList", "", "data_productionRelease"}, k = 2, mv = {1, 4, 2})
public final class postMain {
    @NotNull
    public static final getExtraDataParsers toBillerX2B(@NotNull getNewDomainSuffix getnewdomainsuffix) {
        Intrinsics.checkNotNullParameter(getnewdomainsuffix, "$this$toBillerX2B");
        return new getExtraDataParsers(getnewdomainsuffix.getBillerName(), getnewdomainsuffix.getInstId(), getnewdomainsuffix.getPrefix(), getnewdomainsuffix.getClientId(), getnewdomainsuffix.getRedirectUrl(), getnewdomainsuffix.getScopes(), getnewdomainsuffix.getAgreed());
    }

    @NotNull
    public static final List<getExtraDataParsers> toBillerX2BList(@NotNull List<getNewDomainSuffix> list) {
        Intrinsics.checkNotNullParameter(list, "$this$toBillerX2BList");
        Iterable<getNewDomainSuffix> iterable = list;
        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        for (getNewDomainSuffix billerX2B : iterable) {
            arrayList.add(toBillerX2B(billerX2B));
        }
        return (List) arrayList;
    }
}
