package o;

import com.alipayplus.mobile.component.domain.model.result.BaseRpcResult;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lid/dana/data/twilio/repository/source/network/result/VerifyPushRequestChallengeResult;", "Lcom/alipayplus/mobile/component/domain/model/result/BaseRpcResult;", "challengeSid", "", "timer", "", "action", "(Ljava/lang/String;ILjava/lang/String;)V", "getAction", "()Ljava/lang/String;", "getChallengeSid", "getTimer", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class setBelongsPackage extends BaseRpcResult {
    @NotNull
    private final String action;
    @NotNull
    private final String challengeSid;
    private final int timer;

    public setBelongsPackage() {
        this((String) null, 0, (String) null, 7, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ setBelongsPackage copy$default(setBelongsPackage setbelongspackage, String str, int i, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = setbelongspackage.challengeSid;
        }
        if ((i2 & 2) != 0) {
            i = setbelongspackage.timer;
        }
        if ((i2 & 4) != 0) {
            str2 = setbelongspackage.action;
        }
        return setbelongspackage.copy(str, i, str2);
    }

    @NotNull
    public final String component1() {
        return this.challengeSid;
    }

    public final int component2() {
        return this.timer;
    }

    @NotNull
    public final String component3() {
        return this.action;
    }

    @NotNull
    public final setBelongsPackage copy(@NotNull String str, int i, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "challengeSid");
        Intrinsics.checkNotNullParameter(str2, "action");
        return new setBelongsPackage(str, i, str2);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setBelongsPackage)) {
            return false;
        }
        setBelongsPackage setbelongspackage = (setBelongsPackage) obj;
        return Intrinsics.areEqual((Object) this.challengeSid, (Object) setbelongspackage.challengeSid) && this.timer == setbelongspackage.timer && Intrinsics.areEqual((Object) this.action, (Object) setbelongspackage.action);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("VerifyPushRequestChallengeResult(challengeSid=");
        sb.append(this.challengeSid);
        sb.append(", timer=");
        sb.append(this.timer);
        sb.append(", action=");
        sb.append(this.action);
        sb.append(")");
        return sb.toString();
    }

    @NotNull
    public final String getChallengeSid() {
        return this.challengeSid;
    }

    public final int getTimer() {
        return this.timer;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ setBelongsPackage(String str, int i, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? "" : str2);
    }

    @NotNull
    public final String getAction() {
        return this.action;
    }

    public setBelongsPackage(@NotNull String str, int i, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "challengeSid");
        Intrinsics.checkNotNullParameter(str2, "action");
        this.challengeSid = str;
        this.timer = i;
        this.action = str2;
    }

    public final int hashCode() {
        String str = this.challengeSid;
        int i = 0;
        int hashCode = (((str != null ? str.hashCode() : 0) * 31) + Integer.valueOf(this.timer).hashCode()) * 31;
        String str2 = this.action;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }
}
