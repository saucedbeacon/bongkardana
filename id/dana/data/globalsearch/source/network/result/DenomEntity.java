package id.dana.data.globalsearch.source.network.result;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"Lid/dana/data/globalsearch/source/network/result/DenomEntity;", "", "amount", "", "currency", "(Ljava/lang/String;Ljava/lang/String;)V", "getAmount", "()Ljava/lang/String;", "getCurrency", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
@Keep
public final class DenomEntity {
    @SerializedName("amount")
    @Nullable
    private final String amount;
    @SerializedName("currency")
    @Nullable
    private final String currency;

    public DenomEntity() {
        this((String) null, (String) null, 3, (DefaultConstructorMarker) null);
    }

    public DenomEntity(@Nullable String str, @Nullable String str2) {
        this.amount = str;
        this.currency = str2;
    }

    @Nullable
    public final String getAmount() {
        return this.amount;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DenomEntity(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }

    @Nullable
    public final String getCurrency() {
        return this.currency;
    }
}
