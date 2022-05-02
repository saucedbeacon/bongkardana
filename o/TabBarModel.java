package o;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toSkuAttribute", "Lid/dana/domain/homeinfo/SkuAttribute;", "Lid/dana/data/homeinfo/model/SkuAttributeEntity;", "data_productionRelease"}, k = 2, mv = {1, 4, 2})
public final class TabBarModel {
    @NotNull
    public static final GriverInnerAmcsLiteConfig toSkuAttribute(@NotNull inflateFromResource inflatefromresource) {
        Intrinsics.checkNotNullParameter(inflatefromresource, "$this$toSkuAttribute");
        return new GriverInnerAmcsLiteConfig(inflatefromresource.getServiceKey(), inflatefromresource.getPrepaidKey(), inflatefromresource.getPostpaidKey(), inflatefromresource.getBackgroundColor(), inflatefromresource.getTitle(), inflatefromresource.getIcon(), inflatefromresource.getButtonDescription(), inflatefromresource.getServiceName(), (performRequest) null, (String) null, inflatefromresource.getLink(), (String) null, 2816, (DefaultConstructorMarker) null);
    }
}
