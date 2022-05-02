package o;

import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"Lid/dana/domain/globalsearch/model/Denom;", "", "amount", "", "currency", "(Ljava/lang/String;Ljava/lang/String;)V", "getAmount", "()Ljava/lang/String;", "getCurrency", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class GriverNetworkPermissionExtension {
    @NotNull
    private final String amount;
    @NotNull
    private final String currency;

    public GriverNetworkPermissionExtension() {
        this((String) null, (String) null, 3, (DefaultConstructorMarker) null);
    }

    public GriverNetworkPermissionExtension(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "amount");
        Intrinsics.checkNotNullParameter(str2, FirebaseAnalytics.Param.CURRENCY);
        this.amount = str;
        this.currency = str2;
    }

    @NotNull
    public final String getAmount() {
        return this.amount;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GriverNetworkPermissionExtension(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }

    @NotNull
    public final String getCurrency() {
        return this.currency;
    }
}
