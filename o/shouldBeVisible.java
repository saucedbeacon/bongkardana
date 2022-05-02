package o;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lid/dana/danah5/twilioverifysecurityproduct/TwilioPushVerifyEvent;", "", "factorSid", "", "challengeSid", "(Ljava/lang/String;Ljava/lang/String;)V", "getChallengeSid", "()Ljava/lang/String;", "getFactorSid", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class shouldBeVisible {
    @NotNull
    private final String challengeSid;
    @NotNull
    private final String factorSid;

    public static /* synthetic */ shouldBeVisible copy$default(shouldBeVisible shouldbevisible, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = shouldbevisible.factorSid;
        }
        if ((i & 2) != 0) {
            str2 = shouldbevisible.challengeSid;
        }
        return shouldbevisible.copy(str, str2);
    }

    @NotNull
    public final String component1() {
        return this.factorSid;
    }

    @NotNull
    public final String component2() {
        return this.challengeSid;
    }

    @NotNull
    public final shouldBeVisible copy(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "factorSid");
        Intrinsics.checkNotNullParameter(str2, "challengeSid");
        return new shouldBeVisible(str, str2);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof shouldBeVisible)) {
            return false;
        }
        shouldBeVisible shouldbevisible = (shouldBeVisible) obj;
        return Intrinsics.areEqual((Object) this.factorSid, (Object) shouldbevisible.factorSid) && Intrinsics.areEqual((Object) this.challengeSid, (Object) shouldbevisible.challengeSid);
    }

    public final int hashCode() {
        String str = this.factorSid;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.challengeSid;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("TwilioPushVerifyEvent(factorSid=");
        sb.append(this.factorSid);
        sb.append(", challengeSid=");
        sb.append(this.challengeSid);
        sb.append(")");
        return sb.toString();
    }

    public shouldBeVisible(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "factorSid");
        Intrinsics.checkNotNullParameter(str2, "challengeSid");
        this.factorSid = str;
        this.challengeSid = str2;
    }

    @NotNull
    public final String getFactorSid() {
        return this.factorSid;
    }

    @NotNull
    public final String getChallengeSid() {
        return this.challengeSid;
    }
}
