package o;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B1\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J5\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0007\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\t\"\u0004\b\f\u0010\u000bR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010¨\u0006\u001d"}, d2 = {"Lid/dana/domain/promoquest/model/QuestTrack;", "", "questRedirectType", "", "questRedirectValue", "isRedeemResult", "", "isTrackResult", "(Ljava/lang/String;Ljava/lang/String;ZZ)V", "()Z", "setRedeemResult", "(Z)V", "setTrackResult", "getQuestRedirectType", "()Ljava/lang/String;", "setQuestRedirectType", "(Ljava/lang/String;)V", "getQuestRedirectValue", "setQuestRedirectValue", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class GriverAppInfoDBHelper {
    private boolean isRedeemResult;
    private boolean isTrackResult;
    @Nullable
    private String questRedirectType;
    @Nullable
    private String questRedirectValue;

    public GriverAppInfoDBHelper() {
        this((String) null, (String) null, false, false, 15, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ GriverAppInfoDBHelper copy$default(GriverAppInfoDBHelper griverAppInfoDBHelper, String str, String str2, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = griverAppInfoDBHelper.questRedirectType;
        }
        if ((i & 2) != 0) {
            str2 = griverAppInfoDBHelper.questRedirectValue;
        }
        if ((i & 4) != 0) {
            z = griverAppInfoDBHelper.isRedeemResult;
        }
        if ((i & 8) != 0) {
            z2 = griverAppInfoDBHelper.isTrackResult;
        }
        return griverAppInfoDBHelper.copy(str, str2, z, z2);
    }

    @Nullable
    public final String component1() {
        return this.questRedirectType;
    }

    @Nullable
    public final String component2() {
        return this.questRedirectValue;
    }

    public final boolean component3() {
        return this.isRedeemResult;
    }

    public final boolean component4() {
        return this.isTrackResult;
    }

    @NotNull
    public final GriverAppInfoDBHelper copy(@Nullable String str, @Nullable String str2, boolean z, boolean z2) {
        return new GriverAppInfoDBHelper(str, str2, z, z2);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GriverAppInfoDBHelper)) {
            return false;
        }
        GriverAppInfoDBHelper griverAppInfoDBHelper = (GriverAppInfoDBHelper) obj;
        return Intrinsics.areEqual((Object) this.questRedirectType, (Object) griverAppInfoDBHelper.questRedirectType) && Intrinsics.areEqual((Object) this.questRedirectValue, (Object) griverAppInfoDBHelper.questRedirectValue) && this.isRedeemResult == griverAppInfoDBHelper.isRedeemResult && this.isTrackResult == griverAppInfoDBHelper.isTrackResult;
    }

    public final int hashCode() {
        String str = this.questRedirectType;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.questRedirectValue;
        if (str2 != null) {
            i = str2.hashCode();
        }
        int i2 = (hashCode + i) * 31;
        boolean z = this.isRedeemResult;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i3 = (i2 + (z ? 1 : 0)) * 31;
        boolean z3 = this.isTrackResult;
        if (!z3) {
            z2 = z3;
        }
        return i3 + (z2 ? 1 : 0);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("QuestTrack(questRedirectType=");
        sb.append(this.questRedirectType);
        sb.append(", questRedirectValue=");
        sb.append(this.questRedirectValue);
        sb.append(", isRedeemResult=");
        sb.append(this.isRedeemResult);
        sb.append(", isTrackResult=");
        sb.append(this.isTrackResult);
        sb.append(")");
        return sb.toString();
    }

    public GriverAppInfoDBHelper(@Nullable String str, @Nullable String str2, boolean z, boolean z2) {
        this.questRedirectType = str;
        this.questRedirectValue = str2;
        this.isRedeemResult = z;
        this.isTrackResult = z2;
    }

    @Nullable
    public final String getQuestRedirectType() {
        return this.questRedirectType;
    }

    public final void setQuestRedirectType(@Nullable String str) {
        this.questRedirectType = str;
    }

    @Nullable
    public final String getQuestRedirectValue() {
        return this.questRedirectValue;
    }

    public final void setQuestRedirectValue(@Nullable String str) {
        this.questRedirectValue = str;
    }

    public final boolean isRedeemResult() {
        return this.isRedeemResult;
    }

    public final void setRedeemResult(boolean z) {
        this.isRedeemResult = z;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GriverAppInfoDBHelper(String str, String str2, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2);
    }

    public final boolean isTrackResult() {
        return this.isTrackResult;
    }

    public final void setTrackResult(boolean z) {
        this.isTrackResult = z;
    }
}
