package id.dana.domain.bcaoneklik.model;

import androidx.annotation.Keep;
import id.dana.data.constant.BranchLinkConstant;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006R\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\nR\u001a\u0010\u0005\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\n¨\u0006\u000f"}, d2 = {"Lid/dana/domain/bcaoneklik/model/BcaOneKlikInterceptData;", "", "interceptSuccessUrl", "", "interceptFailedUrl", "redirectUrl", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getInterceptFailedUrl", "()Ljava/lang/String;", "setInterceptFailedUrl", "(Ljava/lang/String;)V", "getInterceptSuccessUrl", "setInterceptSuccessUrl", "getRedirectUrl", "setRedirectUrl", "domain_release"}, k = 1, mv = {1, 4, 2})
@Keep
public final class BcaOneKlikInterceptData {
    @NotNull
    private String interceptFailedUrl;
    @NotNull
    private String interceptSuccessUrl;
    @NotNull
    private String redirectUrl;

    public BcaOneKlikInterceptData(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "interceptSuccessUrl");
        Intrinsics.checkNotNullParameter(str2, "interceptFailedUrl");
        Intrinsics.checkNotNullParameter(str3, BranchLinkConstant.OauthParams.REDIRECT_URL);
        this.interceptSuccessUrl = str;
        this.interceptFailedUrl = str2;
        this.redirectUrl = str3;
    }

    @NotNull
    public final String getInterceptSuccessUrl() {
        return this.interceptSuccessUrl;
    }

    public final void setInterceptSuccessUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.interceptSuccessUrl = str;
    }

    @NotNull
    public final String getInterceptFailedUrl() {
        return this.interceptFailedUrl;
    }

    public final void setInterceptFailedUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.interceptFailedUrl = str;
    }

    @NotNull
    public final String getRedirectUrl() {
        return this.redirectUrl;
    }

    public final void setRedirectUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.redirectUrl = str;
    }
}
