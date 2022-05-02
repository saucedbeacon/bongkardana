package o;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b1\b\b\u0018\u00002\u00020\u0001B\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0012J\u0010\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0014J\u0010\u0010&\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0019J\u000b\u0010'\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010+\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0019J\u000b\u0010,\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u00101\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0019Jª\u0001\u00102\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u00103J\u0013\u00104\u001a\u00020\u00072\b\u00105\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00106\u001a\u00020\u0003HÖ\u0001J\t\u00107\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0017R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0017R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0017R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0017R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0017R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0017R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0017R\u0015\u0010\r\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b#\u0010\u0019R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b$\u0010\u0019¨\u00068"}, d2 = {"Lid/dana/sendmoney/model/WithdrawInitChannelOptionModel;", "", "cardNoLength", "", "channelIndex", "", "disable", "", "instId", "instLocalName", "instName", "payMethod", "payOption", "selected", "validData", "disableReason", "errorCode", "errorMsg", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCardNoLength", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getChannelIndex", "()Ljava/lang/String;", "getDisable", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getDisableReason", "getErrorCode", "getErrorMsg", "getInstId", "getInstLocalName", "getInstName", "getPayMethod", "getPayOption", "getSelected", "getValidData", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lid/dana/sendmoney/model/WithdrawInitChannelOptionModel;", "equals", "other", "hashCode", "toString", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class onLoadComplete {
    @Nullable
    private final Integer IsOverlapping;
    @Nullable
    public final String equals;
    @Nullable
    public final Boolean getMax;
    @Nullable
    public final String getMin;
    @Nullable
    private final Boolean hashCode;
    @Nullable
    public final String isInside;
    @Nullable
    public final String length;
    @Nullable
    public final String setMax;
    @Nullable
    public final String setMin;
    @Nullable
    private final Boolean toDoubleRange;
    @Nullable
    public final String toFloatRange;
    @Nullable
    public final String toIntRange;
    @Nullable
    private final String toString;

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof onLoadComplete)) {
            return false;
        }
        onLoadComplete onloadcomplete = (onLoadComplete) obj;
        return Intrinsics.areEqual((Object) this.IsOverlapping, (Object) onloadcomplete.IsOverlapping) && Intrinsics.areEqual((Object) this.toString, (Object) onloadcomplete.toString) && Intrinsics.areEqual((Object) this.getMax, (Object) onloadcomplete.getMax) && Intrinsics.areEqual((Object) this.setMax, (Object) onloadcomplete.setMax) && Intrinsics.areEqual((Object) this.length, (Object) onloadcomplete.length) && Intrinsics.areEqual((Object) this.getMin, (Object) onloadcomplete.getMin) && Intrinsics.areEqual((Object) this.setMin, (Object) onloadcomplete.setMin) && Intrinsics.areEqual((Object) this.isInside, (Object) onloadcomplete.isInside) && Intrinsics.areEqual((Object) this.hashCode, (Object) onloadcomplete.hashCode) && Intrinsics.areEqual((Object) this.toDoubleRange, (Object) onloadcomplete.toDoubleRange) && Intrinsics.areEqual((Object) this.equals, (Object) onloadcomplete.equals) && Intrinsics.areEqual((Object) this.toIntRange, (Object) onloadcomplete.toIntRange) && Intrinsics.areEqual((Object) this.toFloatRange, (Object) onloadcomplete.toFloatRange);
    }

    public final int hashCode() {
        Integer num = this.IsOverlapping;
        int i = 0;
        int hashCode2 = (num != null ? num.hashCode() : 0) * 31;
        String str = this.toString;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        Boolean bool = this.getMax;
        int hashCode4 = (hashCode3 + (bool != null ? bool.hashCode() : 0)) * 31;
        String str2 = this.setMax;
        int hashCode5 = (hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.length;
        int hashCode6 = (hashCode5 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.getMin;
        int hashCode7 = (hashCode6 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.setMin;
        int hashCode8 = (hashCode7 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.isInside;
        int hashCode9 = (hashCode8 + (str6 != null ? str6.hashCode() : 0)) * 31;
        Boolean bool2 = this.hashCode;
        int hashCode10 = (hashCode9 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        Boolean bool3 = this.toDoubleRange;
        int hashCode11 = (hashCode10 + (bool3 != null ? bool3.hashCode() : 0)) * 31;
        String str7 = this.equals;
        int hashCode12 = (hashCode11 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.toIntRange;
        int hashCode13 = (hashCode12 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.toFloatRange;
        if (str9 != null) {
            i = str9.hashCode();
        }
        return hashCode13 + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("WithdrawInitChannelOptionModel(cardNoLength=");
        sb.append(this.IsOverlapping);
        sb.append(", channelIndex=");
        sb.append(this.toString);
        sb.append(", disable=");
        sb.append(this.getMax);
        sb.append(", instId=");
        sb.append(this.setMax);
        sb.append(", instLocalName=");
        sb.append(this.length);
        sb.append(", instName=");
        sb.append(this.getMin);
        sb.append(", payMethod=");
        sb.append(this.setMin);
        sb.append(", payOption=");
        sb.append(this.isInside);
        sb.append(", selected=");
        sb.append(this.hashCode);
        sb.append(", validData=");
        sb.append(this.toDoubleRange);
        sb.append(", disableReason=");
        sb.append(this.equals);
        sb.append(", errorCode=");
        sb.append(this.toIntRange);
        sb.append(", errorMsg=");
        sb.append(this.toFloatRange);
        sb.append(")");
        return sb.toString();
    }

    public onLoadComplete(@Nullable Integer num, @Nullable String str, @Nullable Boolean bool, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable String str7, @Nullable String str8, @Nullable String str9) {
        this.IsOverlapping = num;
        this.toString = str;
        this.getMax = bool;
        this.setMax = str2;
        this.length = str3;
        this.getMin = str4;
        this.setMin = str5;
        this.isInside = str6;
        this.hashCode = bool2;
        this.toDoubleRange = bool3;
        this.equals = str7;
        this.toIntRange = str8;
        this.toFloatRange = str9;
    }
}
