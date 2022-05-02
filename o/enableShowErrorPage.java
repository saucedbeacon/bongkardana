package o;

import com.alipayplus.mobile.component.domain.model.request.BaseRpcRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lid/dana/data/globalnetwork/model/GnConsultRequest;", "Lcom/alipayplus/mobile/component/domain/model/request/BaseRpcRequest;", "sdkRequestHeader", "", "sdkRequestData", "(Ljava/lang/String;Ljava/lang/String;)V", "getSdkRequestData", "()Ljava/lang/String;", "setSdkRequestData", "(Ljava/lang/String;)V", "getSdkRequestHeader", "setSdkRequestHeader", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class enableShowErrorPage extends BaseRpcRequest {
    @Nullable
    private String sdkRequestData;
    @Nullable
    private String sdkRequestHeader;

    public enableShowErrorPage() {
        this((String) null, (String) null, 3, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ enableShowErrorPage copy$default(enableShowErrorPage enableshowerrorpage, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = enableshowerrorpage.sdkRequestHeader;
        }
        if ((i & 2) != 0) {
            str2 = enableshowerrorpage.sdkRequestData;
        }
        return enableshowerrorpage.copy(str, str2);
    }

    @Nullable
    public final String component1() {
        return this.sdkRequestHeader;
    }

    @Nullable
    public final String component2() {
        return this.sdkRequestData;
    }

    @NotNull
    public final enableShowErrorPage copy(@Nullable String str, @Nullable String str2) {
        return new enableShowErrorPage(str, str2);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof enableShowErrorPage)) {
            return false;
        }
        enableShowErrorPage enableshowerrorpage = (enableShowErrorPage) obj;
        return Intrinsics.areEqual((Object) this.sdkRequestHeader, (Object) enableshowerrorpage.sdkRequestHeader) && Intrinsics.areEqual((Object) this.sdkRequestData, (Object) enableshowerrorpage.sdkRequestData);
    }

    public final int hashCode() {
        String str = this.sdkRequestHeader;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.sdkRequestData;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("GnConsultRequest(sdkRequestHeader=");
        sb.append(this.sdkRequestHeader);
        sb.append(", sdkRequestData=");
        sb.append(this.sdkRequestData);
        sb.append(")");
        return sb.toString();
    }

    @Nullable
    public final String getSdkRequestHeader() {
        return this.sdkRequestHeader;
    }

    public final void setSdkRequestHeader(@Nullable String str) {
        this.sdkRequestHeader = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ enableShowErrorPage(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }

    @Nullable
    public final String getSdkRequestData() {
        return this.sdkRequestData;
    }

    public final void setSdkRequestData(@Nullable String str) {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(347633437, oncanceled);
            onCancelLoad.getMin(347633437, oncanceled);
        }
        this.sdkRequestData = str;
    }

    public enableShowErrorPage(@Nullable String str, @Nullable String str2) {
        this.sdkRequestHeader = str;
        this.sdkRequestData = str2;
    }
}
