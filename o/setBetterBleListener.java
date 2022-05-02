package o;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lid/dana/domain/twilio/model/RequestChallengeInfo;", "", "challengeSid", "", "timer", "", "action", "(Ljava/lang/String;ILjava/lang/String;)V", "getAction", "()Ljava/lang/String;", "getChallengeSid", "getTimer", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class setBetterBleListener {
    @NotNull
    private final String action;
    @NotNull
    private final String challengeSid;
    private final int timer;

    public setBetterBleListener() {
        this((String) null, 0, (String) null, 7, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ setBetterBleListener copy$default(setBetterBleListener setbetterblelistener, String str, int i, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = setbetterblelistener.challengeSid;
        }
        if ((i2 & 2) != 0) {
            i = setbetterblelistener.timer;
        }
        if ((i2 & 4) != 0) {
            str2 = setbetterblelistener.action;
        }
        return setbetterblelistener.copy(str, i, str2);
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
    public final setBetterBleListener copy(@NotNull String str, int i, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "challengeSid");
        Intrinsics.checkNotNullParameter(str2, "action");
        return new setBetterBleListener(str, i, str2);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setBetterBleListener)) {
            return false;
        }
        setBetterBleListener setbetterblelistener = (setBetterBleListener) obj;
        return Intrinsics.areEqual((Object) this.challengeSid, (Object) setbetterblelistener.challengeSid) && this.timer == setbetterblelistener.timer && Intrinsics.areEqual((Object) this.action, (Object) setbetterblelistener.action);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("RequestChallengeInfo(challengeSid=");
        sb.append(this.challengeSid);
        sb.append(", timer=");
        sb.append(this.timer);
        sb.append(", action=");
        sb.append(this.action);
        sb.append(")");
        return sb.toString();
    }

    public setBetterBleListener(@NotNull String str, int i, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "challengeSid");
        Intrinsics.checkNotNullParameter(str2, "action");
        this.challengeSid = str;
        this.timer = i;
        this.action = str2;
    }

    @NotNull
    public final String getChallengeSid() {
        return this.challengeSid;
    }

    public final int getTimer() {
        return this.timer;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ setBetterBleListener(String str, int i, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? "" : str2);
    }

    @NotNull
    public final String getAction() {
        return this.action;
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
