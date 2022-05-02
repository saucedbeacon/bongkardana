package o;

import id.dana.model.SkuAttributeModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toSkuAttributeModel", "Lid/dana/model/SkuAttributeModel;", "Lid/dana/domain/homeinfo/SkuAttribute;", "app_productionRelease"}, k = 2, mv = {1, 4, 2})
public final class safelyFillForConcurrentMap {
    @NotNull
    public static final SkuAttributeModel setMax(@NotNull GriverInnerAmcsLiteConfig griverInnerAmcsLiteConfig) {
        Intrinsics.checkNotNullParameter(griverInnerAmcsLiteConfig, "$this$toSkuAttributeModel");
        return new SkuAttributeModel(griverInnerAmcsLiteConfig.getServiceKey(), griverInnerAmcsLiteConfig.getPrepaidKey(), griverInnerAmcsLiteConfig.getPostpaidKey(), griverInnerAmcsLiteConfig.getBackgroundColor(), griverInnerAmcsLiteConfig.getTitle(), griverInnerAmcsLiteConfig.getIcon(), griverInnerAmcsLiteConfig.getButtonDescription(), griverInnerAmcsLiteConfig.getServiceName());
    }
}
