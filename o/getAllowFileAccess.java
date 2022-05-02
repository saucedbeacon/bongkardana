package o;

import id.dana.data.constant.BranchLinkConstant;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bR\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010¨\u0006\u0015"}, d2 = {"Lid/dana/domain/donation/model/RedirectValue;", "", "cliendId", "", "scopes", "agreed", "", "url", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "getAgreed", "()Z", "setAgreed", "(Z)V", "getCliendId", "()Ljava/lang/String;", "setCliendId", "(Ljava/lang/String;)V", "getScopes", "setScopes", "getUrl", "setUrl", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class getAllowFileAccess {
    private boolean agreed;
    @NotNull
    private String cliendId;
    @NotNull
    private String scopes;
    @NotNull
    private String url;

    public getAllowFileAccess() {
        this((String) null, (String) null, false, (String) null, 15, (DefaultConstructorMarker) null);
    }

    public getAllowFileAccess(@NotNull String str, @NotNull String str2, boolean z, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "cliendId");
        Intrinsics.checkNotNullParameter(str2, BranchLinkConstant.OauthParams.SCOPES);
        Intrinsics.checkNotNullParameter(str3, "url");
        this.cliendId = str;
        this.scopes = str2;
        this.agreed = z;
        this.url = str3;
    }

    @NotNull
    public final String getCliendId() {
        return this.cliendId;
    }

    public final void setCliendId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.cliendId = str;
    }

    @NotNull
    public final String getScopes() {
        return this.scopes;
    }

    public final void setScopes(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.scopes = str;
    }

    public final boolean getAgreed() {
        return this.agreed;
    }

    public final void setAgreed(boolean z) {
        this.agreed = z;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ getAllowFileAccess(String str, String str2, boolean z, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? "" : str3);
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    public final void setUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.url = str;
    }
}
