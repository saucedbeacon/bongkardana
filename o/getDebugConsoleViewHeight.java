package o;

import com.alipay.iap.android.common.utils.security.RSAHelper;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.SplashEntryInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0005\u001a\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007\u001a\n\u0010\b\u001a\u00020\t*\u00020\n\u001a\n\u0010\u000b\u001a\u00020\f*\u00020\r¨\u0006\u000e"}, d2 = {"toLinkedMerchant", "Lid/dana/domain/merchantmanagement/model/LinkedMerchant;", "Lid/dana/data/merchantmanagement/model/MerchantInfoDTO;", "toLinkedMerchantInfo", "Lid/dana/domain/merchantmanagement/model/LinkedMerchantInfo;", "Lid/dana/data/merchantmanagement/repository/source/network/result/BoundMerchantResult;", "toLinkedMerchantList", "", "toUnbindConsultInfo", "Lid/dana/domain/merchantmanagement/model/UnbindConsultInfo;", "Lid/dana/data/merchantmanagement/repository/source/network/result/UnbindConsultResult;", "toUnbindMerchantRequest", "Lid/dana/data/merchantmanagement/repository/source/network/request/UnbindMerchantRequest;", "Lid/dana/domain/merchantmanagement/model/UnbindMerchantParam;", "data_productionRelease"}, k = 2, mv = {1, 4, 2})
public final class getDebugConsoleViewHeight {
    @NotNull
    public static final hasFolderPermission toLinkedMerchantInfo(@NotNull setNativeBridge setnativebridge) {
        Intrinsics.checkNotNullParameter(setnativebridge, "$this$toLinkedMerchantInfo");
        return new hasFolderPermission(toLinkedMerchantList(setnativebridge.getMerchantInfoList()), setnativebridge.getTotalPageNumber());
    }

    @NotNull
    public static final List<decodeToPath> toLinkedMerchantList(@Nullable List<getToggleButtonVisible> list) {
        if (list == null) {
            return new ArrayList<>();
        }
        Iterable<getToggleButtonVisible> iterable = list;
        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        for (getToggleButtonVisible linkedMerchant : iterable) {
            arrayList.add(toLinkedMerchant(linkedMerchant));
        }
        return (List) arrayList;
    }

    @NotNull
    public static final decodeToPath toLinkedMerchant(@NotNull getToggleButtonVisible gettogglebuttonvisible) {
        Intrinsics.checkNotNullParameter(gettogglebuttonvisible, "$this$toLinkedMerchant");
        return new decodeToPath(gettogglebuttonvisible.getMerchantName(), gettogglebuttonvisible.getMerchantLogo(), gettogglebuttonvisible.getMerchantPCLogo(), gettogglebuttonvisible.getMerchantBoundDate(), gettogglebuttonvisible.getMerchantId(), gettogglebuttonvisible.getDivisionId(), gettogglebuttonvisible.getClientId());
    }

    @NotNull
    public static final encodeToLocalId toUnbindConsultInfo(@NotNull getApplication getapplication) {
        Intrinsics.checkNotNullParameter(getapplication, "$this$toUnbindConsultInfo");
        boolean z = getapplication.success;
        SplashEntryInfo.AnonymousClass1 securityContext = getapplication.getSecurityContext();
        return new encodeToLocalId(z, securityContext != null ? securityContext.getPubKey() : null, getapplication.getSecurityId(), (String) null, (String) null, (String) null, 56, (DefaultConstructorMarker) null);
    }

    @NotNull
    public static final BaseEngineImpl toUnbindMerchantRequest(@NotNull LocalIdTool localIdTool) {
        Intrinsics.checkNotNullParameter(localIdTool, "$this$toUnbindMerchantRequest");
        String clientId = localIdTool.getClientId();
        String merchantId = localIdTool.getMerchantId();
        String divisionId = localIdTool.getDivisionId();
        String encrypt = RSAHelper.encrypt(localIdTool.getPin(), localIdTool.getPubKey());
        Intrinsics.checkNotNullExpressionValue(encrypt, "RSAHelper.encrypt(pin, pubKey)");
        return new BaseEngineImpl(clientId, merchantId, divisionId, encrypt, localIdTool.getSecurityId());
    }
}
