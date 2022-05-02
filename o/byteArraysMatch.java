package o;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b1\b\b\u0018\u00002\u00020\u0001B\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0012J\u0010\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0014J\u0010\u0010&\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0019J\u000b\u0010'\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010+\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0019J\u000b\u0010,\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u00101\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0019Jª\u0001\u00102\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u00103J\u0013\u00104\u001a\u00020\u00072\b\u00105\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00106\u001a\u00020\u0003HÖ\u0001J\t\u00107\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0017R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0017R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0017R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0017R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0017R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0017R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0017R\u0015\u0010\r\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b#\u0010\u0019R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b$\u0010\u0019¨\u00068"}, d2 = {"Lid/dana/domain/sendmoney/model/WithdrawInitChannelOption;", "", "cardNoLength", "", "channelIndex", "", "disable", "", "instId", "instLocalName", "instName", "payMethod", "payOption", "selected", "validData", "disableReason", "errorCode", "errorMsg", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCardNoLength", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getChannelIndex", "()Ljava/lang/String;", "getDisable", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getDisableReason", "getErrorCode", "getErrorMsg", "getInstId", "getInstLocalName", "getInstName", "getPayMethod", "getPayOption", "getSelected", "getValidData", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lid/dana/domain/sendmoney/model/WithdrawInitChannelOption;", "equals", "other", "hashCode", "toString", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class byteArraysMatch {
    @Nullable
    private final Integer cardNoLength;
    @Nullable
    private final String channelIndex;
    @Nullable
    private final Boolean disable;
    @Nullable
    private final String disableReason;
    @Nullable
    private final String errorCode;
    @Nullable
    private final String errorMsg;
    @Nullable
    private final String instId;
    @Nullable
    private final String instLocalName;
    @Nullable
    private final String instName;
    @Nullable
    private final String payMethod;
    @Nullable
    private final String payOption;
    @Nullable
    private final Boolean selected;
    @Nullable
    private final Boolean validData;

    public static /* synthetic */ byteArraysMatch copy$default(byteArraysMatch bytearraysmatch, Integer num, String str, Boolean bool, String str2, String str3, String str4, String str5, String str6, Boolean bool2, Boolean bool3, String str7, String str8, String str9, int i, Object obj) {
        byteArraysMatch bytearraysmatch2 = bytearraysmatch;
        int i2 = i;
        return bytearraysmatch.copy((i2 & 1) != 0 ? bytearraysmatch2.cardNoLength : num, (i2 & 2) != 0 ? bytearraysmatch2.channelIndex : str, (i2 & 4) != 0 ? bytearraysmatch2.disable : bool, (i2 & 8) != 0 ? bytearraysmatch2.instId : str2, (i2 & 16) != 0 ? bytearraysmatch2.instLocalName : str3, (i2 & 32) != 0 ? bytearraysmatch2.instName : str4, (i2 & 64) != 0 ? bytearraysmatch2.payMethod : str5, (i2 & 128) != 0 ? bytearraysmatch2.payOption : str6, (i2 & 256) != 0 ? bytearraysmatch2.selected : bool2, (i2 & 512) != 0 ? bytearraysmatch2.validData : bool3, (i2 & 1024) != 0 ? bytearraysmatch2.disableReason : str7, (i2 & 2048) != 0 ? bytearraysmatch2.errorCode : str8, (i2 & 4096) != 0 ? bytearraysmatch2.errorMsg : str9);
    }

    @Nullable
    public final Integer component1() {
        return this.cardNoLength;
    }

    @Nullable
    public final Boolean component10() {
        return this.validData;
    }

    @Nullable
    public final String component11() {
        return this.disableReason;
    }

    @Nullable
    public final String component12() {
        return this.errorCode;
    }

    @Nullable
    public final String component13() {
        return this.errorMsg;
    }

    @Nullable
    public final String component2() {
        return this.channelIndex;
    }

    @Nullable
    public final Boolean component3() {
        return this.disable;
    }

    @Nullable
    public final String component4() {
        return this.instId;
    }

    @Nullable
    public final String component5() {
        return this.instLocalName;
    }

    @Nullable
    public final String component6() {
        return this.instName;
    }

    @Nullable
    public final String component7() {
        return this.payMethod;
    }

    @Nullable
    public final String component8() {
        return this.payOption;
    }

    @Nullable
    public final Boolean component9() {
        return this.selected;
    }

    @NotNull
    public final byteArraysMatch copy(@Nullable Integer num, @Nullable String str, @Nullable Boolean bool, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable String str7, @Nullable String str8, @Nullable String str9) {
        return new byteArraysMatch(num, str, bool, str2, str3, str4, str5, str6, bool2, bool3, str7, str8, str9);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof byteArraysMatch)) {
            return false;
        }
        byteArraysMatch bytearraysmatch = (byteArraysMatch) obj;
        return Intrinsics.areEqual((Object) this.cardNoLength, (Object) bytearraysmatch.cardNoLength) && Intrinsics.areEqual((Object) this.channelIndex, (Object) bytearraysmatch.channelIndex) && Intrinsics.areEqual((Object) this.disable, (Object) bytearraysmatch.disable) && Intrinsics.areEqual((Object) this.instId, (Object) bytearraysmatch.instId) && Intrinsics.areEqual((Object) this.instLocalName, (Object) bytearraysmatch.instLocalName) && Intrinsics.areEqual((Object) this.instName, (Object) bytearraysmatch.instName) && Intrinsics.areEqual((Object) this.payMethod, (Object) bytearraysmatch.payMethod) && Intrinsics.areEqual((Object) this.payOption, (Object) bytearraysmatch.payOption) && Intrinsics.areEqual((Object) this.selected, (Object) bytearraysmatch.selected) && Intrinsics.areEqual((Object) this.validData, (Object) bytearraysmatch.validData) && Intrinsics.areEqual((Object) this.disableReason, (Object) bytearraysmatch.disableReason) && Intrinsics.areEqual((Object) this.errorCode, (Object) bytearraysmatch.errorCode) && Intrinsics.areEqual((Object) this.errorMsg, (Object) bytearraysmatch.errorMsg);
    }

    public final int hashCode() {
        Integer num = this.cardNoLength;
        int i = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        String str = this.channelIndex;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Boolean bool = this.disable;
        int hashCode3 = (hashCode2 + (bool != null ? bool.hashCode() : 0)) * 31;
        String str2 = this.instId;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.instLocalName;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.instName;
        int hashCode6 = (hashCode5 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.payMethod;
        int hashCode7 = (hashCode6 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.payOption;
        int hashCode8 = (hashCode7 + (str6 != null ? str6.hashCode() : 0)) * 31;
        Boolean bool2 = this.selected;
        int hashCode9 = (hashCode8 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        Boolean bool3 = this.validData;
        int hashCode10 = (hashCode9 + (bool3 != null ? bool3.hashCode() : 0)) * 31;
        String str7 = this.disableReason;
        int hashCode11 = (hashCode10 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.errorCode;
        int hashCode12 = (hashCode11 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.errorMsg;
        if (str9 != null) {
            i = str9.hashCode();
        }
        return hashCode12 + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("WithdrawInitChannelOption(cardNoLength=");
        sb.append(this.cardNoLength);
        sb.append(", channelIndex=");
        sb.append(this.channelIndex);
        sb.append(", disable=");
        sb.append(this.disable);
        sb.append(", instId=");
        sb.append(this.instId);
        sb.append(", instLocalName=");
        sb.append(this.instLocalName);
        sb.append(", instName=");
        sb.append(this.instName);
        sb.append(", payMethod=");
        sb.append(this.payMethod);
        sb.append(", payOption=");
        sb.append(this.payOption);
        sb.append(", selected=");
        sb.append(this.selected);
        sb.append(", validData=");
        sb.append(this.validData);
        sb.append(", disableReason=");
        sb.append(this.disableReason);
        sb.append(", errorCode=");
        sb.append(this.errorCode);
        sb.append(", errorMsg=");
        sb.append(this.errorMsg);
        sb.append(")");
        return sb.toString();
    }

    public byteArraysMatch(@Nullable Integer num, @Nullable String str, @Nullable Boolean bool, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable String str7, @Nullable String str8, @Nullable String str9) {
        this.cardNoLength = num;
        this.channelIndex = str;
        this.disable = bool;
        this.instId = str2;
        this.instLocalName = str3;
        this.instName = str4;
        this.payMethod = str5;
        this.payOption = str6;
        this.selected = bool2;
        this.validData = bool3;
        this.disableReason = str7;
        this.errorCode = str8;
        this.errorMsg = str9;
    }

    @Nullable
    public final Integer getCardNoLength() {
        return this.cardNoLength;
    }

    @Nullable
    public final String getChannelIndex() {
        return this.channelIndex;
    }

    @Nullable
    public final Boolean getDisable() {
        return this.disable;
    }

    @Nullable
    public final String getInstId() {
        return this.instId;
    }

    @Nullable
    public final String getInstLocalName() {
        return this.instLocalName;
    }

    @Nullable
    public final String getInstName() {
        return this.instName;
    }

    @Nullable
    public final String getPayMethod() {
        return this.payMethod;
    }

    @Nullable
    public final String getPayOption() {
        return this.payOption;
    }

    @Nullable
    public final Boolean getSelected() {
        return this.selected;
    }

    @Nullable
    public final Boolean getValidData() {
        return this.validData;
    }

    @Nullable
    public final String getDisableReason() {
        return this.disableReason;
    }

    @Nullable
    public final String getErrorCode() {
        return this.errorCode;
    }

    @Nullable
    public final String getErrorMsg() {
        return this.errorMsg;
    }
}
