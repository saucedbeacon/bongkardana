package o;

import com.alipayplus.mobile.component.domain.model.request.BaseRpcRequest;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.RVTabBarImpl;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lid/dana/data/kycamledd/repository/source/network/request/EddInfoRequest;", "Lcom/alipayplus/mobile/component/domain/model/request/BaseRpcRequest;", "amlOrderId", "", "eddSubmitInfoDTO", "", "Lid/dana/data/kycamledd/repository/source/network/request/EddSubmitInfoDTORequest;", "(Ljava/lang/String;Ljava/util/List;)V", "getAmlOrderId", "()Ljava/lang/String;", "getEddSubmitInfoDTO", "()Ljava/util/List;", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class onBackgroundAlphaStatusChanged extends BaseRpcRequest {
    @NotNull
    private final String amlOrderId;
    @NotNull
    private final List<RVTabBarImpl.AnonymousClass3> eddSubmitInfoDTO;

    public onBackgroundAlphaStatusChanged() {
        this((String) null, (List) null, 3, (DefaultConstructorMarker) null);
    }

    @NotNull
    public final String getAmlOrderId() {
        return this.amlOrderId;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ onBackgroundAlphaStatusChanged(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? CollectionsKt.emptyList() : list);
    }

    @NotNull
    public final List<RVTabBarImpl.AnonymousClass3> getEddSubmitInfoDTO() {
        return this.eddSubmitInfoDTO;
    }

    public onBackgroundAlphaStatusChanged(@NotNull String str, @NotNull List<RVTabBarImpl.AnonymousClass3> list) {
        Intrinsics.checkNotNullParameter(str, "amlOrderId");
        Intrinsics.checkNotNullParameter(list, "eddSubmitInfoDTO");
        this.amlOrderId = str;
        this.eddSubmitInfoDTO = list;
    }
}
