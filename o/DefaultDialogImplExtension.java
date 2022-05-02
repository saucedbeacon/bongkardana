package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\u0018\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u001a\u0010\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0004*\u00020\u0007\u001a\n\u0010\b\u001a\u00020\t*\u00020\n¨\u0006\u000b"}, d2 = {"toCdpContentModel", "Lid/dana/model/CdpContentModel;", "Lid/dana/domain/promotion/CdpContent;", "toCdpContentModelList", "", "toLinkedMerchantModels", "Lid/dana/merchantmanagement/model/LinkedMerchantModel;", "Lid/dana/domain/merchantmanagement/model/LinkedMerchantInfo;", "toUnbindConsultModel", "Lid/dana/merchantmanagement/model/UnbindConsultModel;", "Lid/dana/domain/merchantmanagement/model/UnbindConsultInfo;", "app_productionRelease"}, k = 2, mv = {1, 4, 2})
public final class DefaultDialogImplExtension {
    @NotNull
    public static final List<alert> setMax(@NotNull hasFolderPermission hasfolderpermission) {
        Intrinsics.checkNotNullParameter(hasfolderpermission, "$this$toLinkedMerchantModels");
        Iterable<decodeToPath> merchantList = hasfolderpermission.getMerchantList();
        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(merchantList, 10));
        for (decodeToPath decodetopath : merchantList) {
            arrayList.add(new alert(decodetopath.getMerchantName(), decodetopath.getMerchantLogo(), decodetopath.getMerchantPCLogo(), decodetopath.getMerchantBoundDate(), decodetopath.getMerchantId(), decodetopath.getDivisionId(), decodetopath.getClientId(), 0, 128));
        }
        return (List) arrayList;
    }
}
