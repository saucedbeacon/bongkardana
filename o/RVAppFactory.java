package o;

import com.alipayplus.mobile.component.domain.model.result.BaseRpcResult;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\t\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\t¨\u0006\u000e"}, d2 = {"Lid/dana/data/investment/repository/source/network/response/InvestmentUnitResult;", "Lcom/alipayplus/mobile/component/domain/model/result/BaseRpcResult;", "type", "", "unit", "", "unitValue", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)V", "getType", "()Ljava/lang/String;", "getUnit", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getUnitValue", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class RVAppFactory extends BaseRpcResult {
    @Nullable
    private final String type;
    @Nullable
    private final Long unit;
    @Nullable
    private final String unitValue;

    @Nullable
    public final String getType() {
        return this.type;
    }

    @Nullable
    public final Long getUnit() {
        return this.unit;
    }

    @Nullable
    public final String getUnitValue() {
        return this.unitValue;
    }

    public RVAppFactory(@Nullable String str, @Nullable Long l, @Nullable String str2) {
        this.type = str;
        this.unit = l;
        this.unitValue = str2;
    }
}
