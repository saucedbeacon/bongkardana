package o;

import com.alipayplus.mobile.component.domain.model.result.BaseRpcResult;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\n¨\u0006\u001a"}, d2 = {"Lid/dana/data/globalnetwork/model/GnConsultResult;", "Lcom/alipayplus/mobile/component/domain/model/result/BaseRpcResult;", "result", "", "sdkResponseHeader", "sdkResponseData", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getResult", "()Ljava/lang/String;", "setResult", "(Ljava/lang/String;)V", "getSdkResponseData", "setSdkResponseData", "getSdkResponseHeader", "setSdkResponseHeader", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class PageContainer extends BaseRpcResult {
    @NotNull
    private String result;
    @NotNull
    private String sdkResponseData;
    @NotNull
    private String sdkResponseHeader;

    public PageContainer() {
        this((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ PageContainer copy$default(PageContainer pageContainer, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pageContainer.result;
        }
        if ((i & 2) != 0) {
            str2 = pageContainer.sdkResponseHeader;
        }
        if ((i & 4) != 0) {
            str3 = pageContainer.sdkResponseData;
        }
        return pageContainer.copy(str, str2, str3);
    }

    @NotNull
    public final String component1() {
        return this.result;
    }

    @NotNull
    public final String component2() {
        return this.sdkResponseHeader;
    }

    @NotNull
    public final String component3() {
        return this.sdkResponseData;
    }

    @NotNull
    public final PageContainer copy(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "result");
        Intrinsics.checkNotNullParameter(str2, "sdkResponseHeader");
        Intrinsics.checkNotNullParameter(str3, "sdkResponseData");
        return new PageContainer(str, str2, str3);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PageContainer)) {
            return false;
        }
        PageContainer pageContainer = (PageContainer) obj;
        return Intrinsics.areEqual((Object) this.result, (Object) pageContainer.result) && Intrinsics.areEqual((Object) this.sdkResponseHeader, (Object) pageContainer.sdkResponseHeader) && Intrinsics.areEqual((Object) this.sdkResponseData, (Object) pageContainer.sdkResponseData);
    }

    public final int hashCode() {
        String str = this.result;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.sdkResponseHeader;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.sdkResponseData;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("GnConsultResult(result=");
        sb.append(this.result);
        sb.append(", sdkResponseHeader=");
        sb.append(this.sdkResponseHeader);
        sb.append(", sdkResponseData=");
        sb.append(this.sdkResponseData);
        sb.append(")");
        return sb.toString();
    }

    @NotNull
    public final String getResult() {
        return this.result;
    }

    public final void setResult(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.result = str;
    }

    @NotNull
    public final String getSdkResponseHeader() {
        return this.sdkResponseHeader;
    }

    public final void setSdkResponseHeader(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.sdkResponseHeader = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PageContainer(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
    }

    @NotNull
    public final String getSdkResponseData() {
        return this.sdkResponseData;
    }

    public final void setSdkResponseData(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.sdkResponseData = str;
    }

    public PageContainer(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "result");
        Intrinsics.checkNotNullParameter(str2, "sdkResponseHeader");
        Intrinsics.checkNotNullParameter(str3, "sdkResponseData");
        this.result = str;
        this.sdkResponseHeader = str2;
        this.sdkResponseData = str3;
    }
}
