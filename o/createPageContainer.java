package o;

import com.alipayplus.mobile.component.domain.model.request.BaseRpcRequest;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u000e\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0002\u0010\u0007R \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000f¨\u0006\u0012"}, d2 = {"Lid/dana/data/globalnetwork/model/UniPaymentEntityRequest;", "Lcom/alipayplus/mobile/component/domain/model/request/BaseRpcRequest;", "bizNos", "", "", "linkTargetId", "resultBizType", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "getBizNos", "()Ljava/util/List;", "setBizNos", "(Ljava/util/List;)V", "getLinkTargetId", "()Ljava/lang/String;", "setLinkTargetId", "(Ljava/lang/String;)V", "getResultBizType", "setResultBizType", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class createPageContainer extends BaseRpcRequest {
    @NotNull
    private List<String> bizNos;
    @NotNull
    private String linkTargetId;
    @NotNull
    private String resultBizType;

    @NotNull
    public final List<String> getBizNos() {
        return this.bizNos;
    }

    public final void setBizNos(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.bizNos = list;
    }

    @NotNull
    public final String getLinkTargetId() {
        return this.linkTargetId;
    }

    public final void setLinkTargetId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.linkTargetId = str;
    }

    @NotNull
    public final String getResultBizType() {
        return this.resultBizType;
    }

    public final void setResultBizType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.resultBizType = str;
    }

    public createPageContainer(@NotNull List<String> list, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(list, "bizNos");
        Intrinsics.checkNotNullParameter(str, "linkTargetId");
        Intrinsics.checkNotNullParameter(str2, "resultBizType");
        this.bizNos = list;
        this.linkTargetId = str;
        this.resultBizType = str2;
    }
}
