package o;

import com.alipayplus.mobile.component.domain.model.request.BaseRpcRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, d2 = {"Lid/dana/data/merchant/repository/source/network/request/BizDestinationInquiryRequest;", "Lcom/alipayplus/mobile/component/domain/model/request/BaseRpcRequest;", "goodsId", "", "destinationParams", "Lid/dana/data/merchant/repository/source/network/request/BizDestination;", "(Ljava/lang/String;Lid/dana/data/merchant/repository/source/network/request/BizDestination;)V", "getDestinationParams", "()Lid/dana/data/merchant/repository/source/network/request/BizDestination;", "getGoodsId", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "Companion", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class sendMsgToConsoleView extends BaseRpcRequest {
    @NotNull
    public static final setMin Companion = new setMin((DefaultConstructorMarker) null);
    @NotNull
    private final e destinationParams;
    @NotNull
    private final String goodsId;

    public static /* synthetic */ sendMsgToConsoleView copy$default(sendMsgToConsoleView sendmsgtoconsoleview, String str, e eVar, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sendmsgtoconsoleview.goodsId;
        }
        if ((i & 2) != 0) {
            eVar = sendmsgtoconsoleview.destinationParams;
        }
        return sendmsgtoconsoleview.copy(str, eVar);
    }

    @NotNull
    public final String component1() {
        return this.goodsId;
    }

    @NotNull
    public final e component2() {
        return this.destinationParams;
    }

    @NotNull
    public final sendMsgToConsoleView copy(@NotNull String str, @NotNull e eVar) {
        Intrinsics.checkNotNullParameter(str, "goodsId");
        Intrinsics.checkNotNullParameter(eVar, "destinationParams");
        return new sendMsgToConsoleView(str, eVar);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sendMsgToConsoleView)) {
            return false;
        }
        sendMsgToConsoleView sendmsgtoconsoleview = (sendMsgToConsoleView) obj;
        return Intrinsics.areEqual((Object) this.goodsId, (Object) sendmsgtoconsoleview.goodsId) && Intrinsics.areEqual((Object) this.destinationParams, (Object) sendmsgtoconsoleview.destinationParams);
    }

    public final int hashCode() {
        String str = this.goodsId;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        e eVar = this.destinationParams;
        if (eVar != null) {
            i = eVar.hashCode();
        }
        return hashCode + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("BizDestinationInquiryRequest(goodsId=");
        sb.append(this.goodsId);
        sb.append(", destinationParams=");
        sb.append(this.destinationParams);
        sb.append(")");
        return sb.toString();
    }

    @NotNull
    public final String getGoodsId() {
        return this.goodsId;
    }

    @NotNull
    public final e getDestinationParams() {
        return this.destinationParams;
    }

    public sendMsgToConsoleView(@NotNull String str, @NotNull e eVar) {
        Intrinsics.checkNotNullParameter(str, "goodsId");
        Intrinsics.checkNotNullParameter(eVar, "destinationParams");
        this.goodsId = str;
        this.destinationParams = eVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lid/dana/data/merchant/repository/source/network/request/BizDestinationInquiryRequest$Companion;", "", "()V", "fromLastSuccessfulTransaction", "Lid/dana/data/merchant/repository/source/network/request/BizDestinationInquiryRequest;", "result", "Lid/dana/data/merchant/repository/source/network/response/QueryLastSuccessfulTransactionResponse;", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMin {
        private setMin() {
        }

        public /* synthetic */ setMin(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x000c, code lost:
            r0 = (o.toggleConsoleView) kotlin.collections.CollectionsKt.firstOrNull(r0);
         */
        @org.jetbrains.annotations.NotNull
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final o.sendMsgToConsoleView fromLastSuccessfulTransaction(@org.jetbrains.annotations.NotNull o.setToggleButtonVisible r6) {
            /*
                r5 = this;
                java.lang.String r0 = "result"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
                java.util.List r0 = r6.getBizIds()
                r1 = 0
                if (r0 == 0) goto L_0x0019
                java.lang.Object r0 = kotlin.collections.CollectionsKt.firstOrNull(r0)
                o.toggleConsoleView r0 = (o.toggleConsoleView) r0
                if (r0 == 0) goto L_0x0019
                java.lang.String r0 = r0.getGoodsId()
                goto L_0x001a
            L_0x0019:
                r0 = r1
            L_0x001a:
                java.lang.String r2 = ""
                if (r0 != 0) goto L_0x001f
                r0 = r2
            L_0x001f:
                java.util.List r6 = r6.getBizIds()
                if (r6 == 0) goto L_0x0032
                java.lang.Object r6 = kotlin.collections.CollectionsKt.firstOrNull(r6)
                o.toggleConsoleView r6 = (o.toggleConsoleView) r6
                if (r6 == 0) goto L_0x0032
                java.lang.String r6 = r6.getBizId()
                goto L_0x0033
            L_0x0032:
                r6 = r1
            L_0x0033:
                if (r6 != 0) goto L_0x0036
                goto L_0x0037
            L_0x0036:
                r2 = r6
            L_0x0037:
                o.sendMsgToConsoleView r6 = new o.sendMsgToConsoleView
                o.e r3 = new o.e
                r4 = 2
                r3.<init>(r2, r1, r4, r1)
                r6.<init>(r0, r3)
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: o.sendMsgToConsoleView.setMin.fromLastSuccessfulTransaction(o.setToggleButtonVisible):o.sendMsgToConsoleView");
        }
    }
}
