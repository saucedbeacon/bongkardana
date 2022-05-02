package o;

import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0002H\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lid/dana/data/nearbyme/mapper/DanaDealsVoucherOrderMapper;", "Lid/dana/data/base/BaseMapper;", "Lid/dana/domain/nearbyme/model/DanaDealsOrderRequest;", "Lid/dana/data/nearbyme/repository/source/network/request/ProductOrderRequest;", "systemUtils", "Lid/dana/data/nearbyme/util/SystemUtils;", "(Lid/dana/data/nearbyme/util/SystemUtils;)V", "generateUniqueRequestId", "", "requestId", "map", "oldItem", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class removeProxy extends setSpeed<getAndroidIdEncrypt, getPluginId> {
    private final node systemUtils;

    @Inject
    public removeProxy(@NotNull node node) {
        Intrinsics.checkNotNullParameter(node, "systemUtils");
        this.systemUtils = node;
    }

    /* access modifiers changed from: protected */
    @NotNull
    public final getPluginId map(@NotNull getAndroidIdEncrypt getandroididencrypt) {
        Intrinsics.checkNotNullParameter(getandroididencrypt, "oldItem");
        return new getPluginId(getandroididencrypt.getProductCode(), getandroididencrypt.getGoodsId(), getandroididencrypt.getAggregatorGoodsId(), generateUniqueRequestId(getandroididencrypt.getRequestId()), "", getandroididencrypt.getSecondaryBizParam(), new onWorkerReady(getandroididencrypt.getPrice().getAmount(), getandroididencrypt.getPrice().getCurrency(), getandroididencrypt.getPrice().getCurrencyCode()), getandroididencrypt.getBizType());
    }

    private final String generateUniqueRequestId(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(this.systemUtils.currentTimeMillis());
        sb.append(this.systemUtils.nextInt());
        return sb.toString();
    }
}
