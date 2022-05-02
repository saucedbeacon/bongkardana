package o;

import com.alipayplus.mobile.component.domain.model.request.BaseRpcRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lid/dana/data/twilio/repository/source/network/request/VerifyPushDerollRequest;", "Lcom/alipayplus/mobile/component/domain/model/request/BaseRpcRequest;", "source", "", "(Ljava/lang/String;)V", "getSource", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class onInputOpen extends BaseRpcRequest {
    @Nullable
    private final String source;

    public onInputOpen() {
        this((String) null, 1, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ onInputOpen copy$default(onInputOpen oninputopen, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = oninputopen.source;
        }
        return oninputopen.copy(str);
    }

    @Nullable
    public final String component1() {
        return this.source;
    }

    @NotNull
    public final onInputOpen copy(@Nullable String str) {
        return new onInputOpen(str);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this != obj) {
            return (obj instanceof onInputOpen) && Intrinsics.areEqual((Object) this.source, (Object) ((onInputOpen) obj).source);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.source;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("VerifyPushDerollRequest(source=");
        sb.append(this.source);
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ onInputOpen(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str);
    }

    @Nullable
    public final String getSource() {
        return this.source;
    }

    public onInputOpen(@Nullable String str) {
        this.source = str;
    }
}
