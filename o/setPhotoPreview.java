package o;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b-\b\b\u0018\u00002\u00020\u0001B}\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\u0011J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010&\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0019J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010(\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0016J\u0010\u0010)\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0019J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0001\u0010/\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u00100J\u0013\u00101\u001a\u00020\b2\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00103\u001a\u00020\u0006HÖ\u0001J\t\u00104\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0013R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0013R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0013R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0013R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0013R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0013R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\"\u0010\u0019¨\u00065"}, d2 = {"Lid/dana/sendmoney/model/WithdrawSavedCardChannelModel;", "", "bindingId", "", "cardIndexNo", "cardNoLength", "", "disable", "", "formattedHolderName", "formattedMaskedCardNo", "instId", "instLocalName", "instName", "payMethod", "payOption", "validData", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "getBindingId", "()Ljava/lang/String;", "getCardIndexNo", "getCardNoLength", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getDisable", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getFormattedHolderName", "getFormattedMaskedCardNo", "getInstId", "getInstLocalName", "getInstName", "getPayMethod", "getPayOption", "getValidData", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lid/dana/sendmoney/model/WithdrawSavedCardChannelModel;", "equals", "other", "hashCode", "toString", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class setPhotoPreview {
    @Nullable
    private final Boolean FastBitmap$CoordinateSystem;
    @Nullable
    private final String IsOverlapping;
    @Nullable
    private final String equals;
    @Nullable
    private final Integer getMax;
    @Nullable
    private final Boolean getMin;
    @Nullable
    private final String isInside;
    @Nullable
    private final String length;
    @Nullable
    private final String setMax;
    @Nullable
    private final String setMin;
    @Nullable
    private final String toDoubleRange;
    @Nullable
    private final String toFloatRange;
    @Nullable
    private final String toIntRange;

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setPhotoPreview)) {
            return false;
        }
        setPhotoPreview setphotopreview = (setPhotoPreview) obj;
        return Intrinsics.areEqual((Object) this.setMax, (Object) setphotopreview.setMax) && Intrinsics.areEqual((Object) this.length, (Object) setphotopreview.length) && Intrinsics.areEqual((Object) this.getMax, (Object) setphotopreview.getMax) && Intrinsics.areEqual((Object) this.getMin, (Object) setphotopreview.getMin) && Intrinsics.areEqual((Object) this.setMin, (Object) setphotopreview.setMin) && Intrinsics.areEqual((Object) this.equals, (Object) setphotopreview.equals) && Intrinsics.areEqual((Object) this.isInside, (Object) setphotopreview.isInside) && Intrinsics.areEqual((Object) this.toIntRange, (Object) setphotopreview.toIntRange) && Intrinsics.areEqual((Object) this.IsOverlapping, (Object) setphotopreview.IsOverlapping) && Intrinsics.areEqual((Object) this.toFloatRange, (Object) setphotopreview.toFloatRange) && Intrinsics.areEqual((Object) this.toDoubleRange, (Object) setphotopreview.toDoubleRange) && Intrinsics.areEqual((Object) this.FastBitmap$CoordinateSystem, (Object) setphotopreview.FastBitmap$CoordinateSystem);
    }

    public final int hashCode() {
        String str = this.setMax;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.length;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Integer num = this.getMax;
        int hashCode3 = (hashCode2 + (num != null ? num.hashCode() : 0)) * 31;
        Boolean bool = this.getMin;
        int hashCode4 = (hashCode3 + (bool != null ? bool.hashCode() : 0)) * 31;
        String str3 = this.setMin;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.equals;
        int hashCode6 = (hashCode5 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.isInside;
        int hashCode7 = (hashCode6 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.toIntRange;
        int hashCode8 = (hashCode7 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.IsOverlapping;
        int hashCode9 = (hashCode8 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.toFloatRange;
        int hashCode10 = (hashCode9 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.toDoubleRange;
        int hashCode11 = (hashCode10 + (str9 != null ? str9.hashCode() : 0)) * 31;
        Boolean bool2 = this.FastBitmap$CoordinateSystem;
        if (bool2 != null) {
            i = bool2.hashCode();
        }
        return hashCode11 + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("WithdrawSavedCardChannelModel(bindingId=");
        sb.append(this.setMax);
        sb.append(", cardIndexNo=");
        sb.append(this.length);
        sb.append(", cardNoLength=");
        sb.append(this.getMax);
        sb.append(", disable=");
        sb.append(this.getMin);
        sb.append(", formattedHolderName=");
        sb.append(this.setMin);
        sb.append(", formattedMaskedCardNo=");
        sb.append(this.equals);
        sb.append(", instId=");
        sb.append(this.isInside);
        sb.append(", instLocalName=");
        sb.append(this.toIntRange);
        sb.append(", instName=");
        sb.append(this.IsOverlapping);
        sb.append(", payMethod=");
        sb.append(this.toFloatRange);
        sb.append(", payOption=");
        sb.append(this.toDoubleRange);
        sb.append(", validData=");
        sb.append(this.FastBitmap$CoordinateSystem);
        sb.append(")");
        return sb.toString();
    }

    public setPhotoPreview(@Nullable String str, @Nullable String str2, @Nullable Integer num, @Nullable Boolean bool, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable Boolean bool2) {
        this.setMax = str;
        this.length = str2;
        this.getMax = num;
        this.getMin = bool;
        this.setMin = str3;
        this.equals = str4;
        this.isInside = str5;
        this.toIntRange = str6;
        this.IsOverlapping = str7;
        this.toFloatRange = str8;
        this.toDoubleRange = str9;
        this.FastBitmap$CoordinateSystem = bool2;
    }
}
