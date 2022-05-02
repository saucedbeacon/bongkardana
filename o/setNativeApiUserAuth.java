package o;

import com.alipayplus.mobile.component.domain.model.result.BaseRpcResult;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.BLEManager;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007R\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lid/dana/data/userconsent/repository/source/model/ConsultAgreementResult;", "Lcom/alipayplus/mobile/component/domain/model/result/BaseRpcResult;", "needUserAgreement", "", "agreementInfos", "", "Lid/dana/domain/useragreement/model/AgreementInfo;", "(ZLjava/util/List;)V", "getAgreementInfos", "()Ljava/util/List;", "getNeedUserAgreement", "()Z", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class setNativeApiUserAuth extends BaseRpcResult {
    @Nullable
    private final List<BLEManager.ScanHandler> agreementInfos;
    private final boolean needUserAgreement;

    public final boolean getNeedUserAgreement() {
        return this.needUserAgreement;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ setNativeApiUserAuth(boolean z, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? CollectionsKt.emptyList() : list);
    }

    @Nullable
    public final List<BLEManager.ScanHandler> getAgreementInfos() {
        return this.agreementInfos;
    }

    public setNativeApiUserAuth(boolean z, @Nullable List<BLEManager.ScanHandler> list) {
        this.needUserAgreement = z;
        this.agreementInfos = list;
    }
}
