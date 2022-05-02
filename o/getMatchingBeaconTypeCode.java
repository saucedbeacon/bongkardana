package o;

import id.dana.data.constant.UrlTag;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\nHÆ\u0003JO\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010!\u001a\u00020\n2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u001a\u0010\b\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006&"}, d2 = {"Lid/dana/domain/sendmoney/model/DigitalMoney;", "", "instId", "", "eWalletPrefix", "bankName", "eWalletName", "identifier", "phoneNumber", "recentRecipient", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getBankName", "()Ljava/lang/String;", "getEWalletName", "getEWalletPrefix", "getIdentifier", "getInstId", "getPhoneNumber", "setPhoneNumber", "(Ljava/lang/String;)V", "getRecentRecipient", "()Z", "setRecentRecipient", "(Z)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class getMatchingBeaconTypeCode {
    @NotNull
    private final String bankName;
    @NotNull
    private final String eWalletName;
    @NotNull
    private final String eWalletPrefix;
    @NotNull
    private final String identifier;
    @NotNull
    private final String instId;
    @NotNull
    private String phoneNumber;
    private boolean recentRecipient;

    public static /* synthetic */ getMatchingBeaconTypeCode copy$default(getMatchingBeaconTypeCode getmatchingbeacontypecode, String str, String str2, String str3, String str4, String str5, String str6, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getmatchingbeacontypecode.instId;
        }
        if ((i & 2) != 0) {
            str2 = getmatchingbeacontypecode.eWalletPrefix;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = getmatchingbeacontypecode.bankName;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = getmatchingbeacontypecode.eWalletName;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = getmatchingbeacontypecode.identifier;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            str6 = getmatchingbeacontypecode.phoneNumber;
        }
        String str11 = str6;
        if ((i & 64) != 0) {
            z = getmatchingbeacontypecode.recentRecipient;
        }
        return getmatchingbeacontypecode.copy(str, str7, str8, str9, str10, str11, z);
    }

    @NotNull
    public final String component1() {
        return this.instId;
    }

    @NotNull
    public final String component2() {
        return this.eWalletPrefix;
    }

    @NotNull
    public final String component3() {
        return this.bankName;
    }

    @NotNull
    public final String component4() {
        return this.eWalletName;
    }

    @NotNull
    public final String component5() {
        return this.identifier;
    }

    @NotNull
    public final String component6() {
        return this.phoneNumber;
    }

    public final boolean component7() {
        return this.recentRecipient;
    }

    @NotNull
    public final getMatchingBeaconTypeCode copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, boolean z) {
        Intrinsics.checkNotNullParameter(str, UrlTag.INSTID);
        Intrinsics.checkNotNullParameter(str2, "eWalletPrefix");
        Intrinsics.checkNotNullParameter(str3, "bankName");
        Intrinsics.checkNotNullParameter(str4, "eWalletName");
        Intrinsics.checkNotNullParameter(str5, "identifier");
        Intrinsics.checkNotNullParameter(str6, "phoneNumber");
        return new getMatchingBeaconTypeCode(str, str2, str3, str4, str5, str6, z);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getMatchingBeaconTypeCode)) {
            return false;
        }
        getMatchingBeaconTypeCode getmatchingbeacontypecode = (getMatchingBeaconTypeCode) obj;
        return Intrinsics.areEqual((Object) this.instId, (Object) getmatchingbeacontypecode.instId) && Intrinsics.areEqual((Object) this.eWalletPrefix, (Object) getmatchingbeacontypecode.eWalletPrefix) && Intrinsics.areEqual((Object) this.bankName, (Object) getmatchingbeacontypecode.bankName) && Intrinsics.areEqual((Object) this.eWalletName, (Object) getmatchingbeacontypecode.eWalletName) && Intrinsics.areEqual((Object) this.identifier, (Object) getmatchingbeacontypecode.identifier) && Intrinsics.areEqual((Object) this.phoneNumber, (Object) getmatchingbeacontypecode.phoneNumber) && this.recentRecipient == getmatchingbeacontypecode.recentRecipient;
    }

    public final int hashCode() {
        String str = this.instId;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.eWalletPrefix;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.bankName;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.eWalletName;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.identifier;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.phoneNumber;
        if (str6 != null) {
            i = str6.hashCode();
        }
        int i2 = (hashCode5 + i) * 31;
        boolean z = this.recentRecipient;
        if (z) {
            z = true;
        }
        return i2 + (z ? 1 : 0);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("DigitalMoney(instId=");
        sb.append(this.instId);
        sb.append(", eWalletPrefix=");
        sb.append(this.eWalletPrefix);
        sb.append(", bankName=");
        sb.append(this.bankName);
        sb.append(", eWalletName=");
        sb.append(this.eWalletName);
        sb.append(", identifier=");
        sb.append(this.identifier);
        sb.append(", phoneNumber=");
        sb.append(this.phoneNumber);
        sb.append(", recentRecipient=");
        sb.append(this.recentRecipient);
        sb.append(")");
        return sb.toString();
    }

    public getMatchingBeaconTypeCode(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, boolean z) {
        Intrinsics.checkNotNullParameter(str, UrlTag.INSTID);
        Intrinsics.checkNotNullParameter(str2, "eWalletPrefix");
        Intrinsics.checkNotNullParameter(str3, "bankName");
        Intrinsics.checkNotNullParameter(str4, "eWalletName");
        Intrinsics.checkNotNullParameter(str5, "identifier");
        Intrinsics.checkNotNullParameter(str6, "phoneNumber");
        this.instId = str;
        this.eWalletPrefix = str2;
        this.bankName = str3;
        this.eWalletName = str4;
        this.identifier = str5;
        this.phoneNumber = str6;
        this.recentRecipient = z;
    }

    @NotNull
    public final String getInstId() {
        return this.instId;
    }

    @NotNull
    public final String getEWalletPrefix() {
        return this.eWalletPrefix;
    }

    @NotNull
    public final String getBankName() {
        return this.bankName;
    }

    @NotNull
    public final String getEWalletName() {
        return this.eWalletName;
    }

    @NotNull
    public final String getIdentifier() {
        return this.identifier;
    }

    @NotNull
    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    public final void setPhoneNumber(@NotNull String str) {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(-666511890, oncanceled);
            onCancelLoad.getMin(-666511890, oncanceled);
        }
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.phoneNumber = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ getMatchingBeaconTypeCode(String str, String str2, String str3, String str4, String str5, String str6, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, (i & 64) != 0 ? false : z);
    }

    public final boolean getRecentRecipient() {
        return this.recentRecipient;
    }

    public final void setRecentRecipient(boolean z) {
        this.recentRecipient = z;
    }
}
