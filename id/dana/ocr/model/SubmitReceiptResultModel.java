package id.dana.ocr.model;

import android.os.Parcel;
import android.os.Parcelable;
import id.dana.data.constant.BranchLinkConstant;
import id.dana.richview.CurrencyTextView;
import id.dana.utils.deeplink.DeepLinkConstant;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.android.parcel.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\bL\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0003¢\u0006\u0002\u0010\u0015J\t\u0010<\u001a\u00020\u0003HÆ\u0003J\t\u0010=\u001a\u00020\u0003HÆ\u0003J\t\u0010>\u001a\u00020\u0003HÆ\u0003J\t\u0010?\u001a\u00020\u0003HÆ\u0003J\t\u0010@\u001a\u00020\u0003HÆ\u0003J\t\u0010A\u001a\u00020\u0003HÆ\u0003J\t\u0010B\u001a\u00020\u0003HÆ\u0003J\t\u0010C\u001a\u00020\u0003HÆ\u0003J\t\u0010D\u001a\u00020\u0003HÆ\u0003J\t\u0010E\u001a\u00020\u0003HÆ\u0003J\t\u0010F\u001a\u00020\u0003HÆ\u0003J\t\u0010G\u001a\u00020\u0003HÆ\u0003J\t\u0010H\u001a\u00020\u0003HÆ\u0003J\t\u0010I\u001a\u00020\u0003HÆ\u0003J\t\u0010J\u001a\u00020\u0003HÆ\u0003J\t\u0010K\u001a\u00020\u0003HÆ\u0003J\t\u0010L\u001a\u00020\u0003HÆ\u0003J\t\u0010M\u001a\u00020\u0003HÆ\u0003J½\u0001\u0010N\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u0003HÆ\u0001J\t\u0010O\u001a\u00020PHÖ\u0001J\u0013\u0010Q\u001a\u00020R2\b\u0010S\u001a\u0004\u0018\u00010THÖ\u0003J\t\u0010U\u001a\u00020PHÖ\u0001J\t\u0010V\u001a\u00020\u0003HÖ\u0001J\u0019\u0010W\u001a\u00020X2\u0006\u0010Y\u001a\u00020Z2\u0006\u0010[\u001a\u00020PHÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0017\"\u0004\b\u001b\u0010\u0019R\u001a\u0010\r\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0017\"\u0004\b\u001d\u0010\u0019R\u001a\u0010\t\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0017\"\u0004\b\u001f\u0010\u0019R\u001a\u0010\u0007\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0017\"\u0004\b!\u0010\u0019R\u001a\u0010\b\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0017\"\u0004\b#\u0010\u0019R\u001a\u0010\u0005\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0017\"\u0004\b%\u0010\u0019R\u001a\u0010\f\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0017\"\u0004\b'\u0010\u0019R\u001a\u0010\u000b\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0017\"\u0004\b)\u0010\u0019R\u001a\u0010\u0006\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0017\"\u0004\b+\u0010\u0019R\u001a\u0010\n\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u0017\"\u0004\b-\u0010\u0019R\u001a\u0010\u0012\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0017\"\u0004\b/\u0010\u0019R\u001a\u0010\u0014\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u0017\"\u0004\b1\u0010\u0019R\u001a\u0010\u0013\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u0017\"\u0004\b3\u0010\u0019R\u001a\u0010\u0011\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u0017\"\u0004\b5\u0010\u0019R\u001a\u0010\u0010\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u0010\u0017\"\u0004\b7\u0010\u0019R\u001a\u0010\u000f\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010\u0017\"\u0004\b9\u0010\u0019R\u001a\u0010\u000e\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\u0017\"\u0004\b;\u0010\u0019¨\u0006\\"}, d2 = {"Lid/dana/ocr/model/SubmitReceiptResultModel;", "Landroid/os/Parcelable;", "id", "", "createdDate", "modifiedDate", "orderId", "merchantId", "merchantName", "loyaltyMerchantName", "originalMerchantName", "orderDate", "orderAmount", "imageAssetUrl", "userLoyaltyId", "receiptStatus", "receiptResultType", "receiptApprovalStatus", "pointGenerated", "reasonId", "reasonEn", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCreatedDate", "()Ljava/lang/String;", "setCreatedDate", "(Ljava/lang/String;)V", "getId", "setId", "getImageAssetUrl", "setImageAssetUrl", "getLoyaltyMerchantName", "setLoyaltyMerchantName", "getMerchantId", "setMerchantId", "getMerchantName", "setMerchantName", "getModifiedDate", "setModifiedDate", "getOrderAmount", "setOrderAmount", "getOrderDate", "setOrderDate", "getOrderId", "setOrderId", "getOriginalMerchantName", "setOriginalMerchantName", "getPointGenerated", "setPointGenerated", "getReasonEn", "setReasonEn", "getReasonId", "setReasonId", "getReceiptApprovalStatus", "setReceiptApprovalStatus", "getReceiptResultType", "setReceiptResultType", "getReceiptStatus", "setReceiptStatus", "getUserLoyaltyId", "setUserLoyaltyId", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
@Parcelize
public final class SubmitReceiptResultModel implements Parcelable {
    public static final Parcelable.Creator<SubmitReceiptResultModel> CREATOR = new Creator();
    @NotNull
    private String FastBitmap$CoordinateSystem;
    @NotNull
    private String Grayscale$Algorithm;
    @NotNull
    private String IsOverlapping;
    @NotNull
    private String equals;
    @NotNull
    private String getMax;
    @NotNull
    private String getMin;
    @NotNull
    private String hashCode;
    @NotNull
    private String invokeSuspend;
    @NotNull
    private String isInside;
    @NotNull
    private String length;
    @NotNull
    private String setMax;
    @NotNull
    private String setMin;
    @NotNull
    private String toDoubleRange;
    @NotNull
    private String toFloatRange;
    @NotNull
    private String toIntRange;
    @NotNull
    private String toString;
    @NotNull
    private String valueOf;
    @NotNull
    private String values;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubmitReceiptResultModel)) {
            return false;
        }
        SubmitReceiptResultModel submitReceiptResultModel = (SubmitReceiptResultModel) obj;
        return Intrinsics.areEqual((Object) this.setMax, (Object) submitReceiptResultModel.setMax) && Intrinsics.areEqual((Object) this.getMax, (Object) submitReceiptResultModel.getMax) && Intrinsics.areEqual((Object) this.length, (Object) submitReceiptResultModel.length) && Intrinsics.areEqual((Object) this.setMin, (Object) submitReceiptResultModel.setMin) && Intrinsics.areEqual((Object) this.getMin, (Object) submitReceiptResultModel.getMin) && Intrinsics.areEqual((Object) this.toIntRange, (Object) submitReceiptResultModel.toIntRange) && Intrinsics.areEqual((Object) this.isInside, (Object) submitReceiptResultModel.isInside) && Intrinsics.areEqual((Object) this.equals, (Object) submitReceiptResultModel.equals) && Intrinsics.areEqual((Object) this.toFloatRange, (Object) submitReceiptResultModel.toFloatRange) && Intrinsics.areEqual((Object) this.IsOverlapping, (Object) submitReceiptResultModel.IsOverlapping) && Intrinsics.areEqual((Object) this.values, (Object) submitReceiptResultModel.values) && Intrinsics.areEqual((Object) this.FastBitmap$CoordinateSystem, (Object) submitReceiptResultModel.FastBitmap$CoordinateSystem) && Intrinsics.areEqual((Object) this.toDoubleRange, (Object) submitReceiptResultModel.toDoubleRange) && Intrinsics.areEqual((Object) this.toString, (Object) submitReceiptResultModel.toString) && Intrinsics.areEqual((Object) this.hashCode, (Object) submitReceiptResultModel.hashCode) && Intrinsics.areEqual((Object) this.valueOf, (Object) submitReceiptResultModel.valueOf) && Intrinsics.areEqual((Object) this.invokeSuspend, (Object) submitReceiptResultModel.invokeSuspend) && Intrinsics.areEqual((Object) this.Grayscale$Algorithm, (Object) submitReceiptResultModel.Grayscale$Algorithm);
    }

    public final int hashCode() {
        String str = this.setMax;
        int i = 0;
        int hashCode2 = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.getMax;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.length;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.setMin;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.getMin;
        int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.toIntRange;
        int hashCode7 = (hashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.isInside;
        int hashCode8 = (hashCode7 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.equals;
        int hashCode9 = (hashCode8 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.toFloatRange;
        int hashCode10 = (hashCode9 + (str9 != null ? str9.hashCode() : 0)) * 31;
        String str10 = this.IsOverlapping;
        int hashCode11 = (hashCode10 + (str10 != null ? str10.hashCode() : 0)) * 31;
        String str11 = this.values;
        int hashCode12 = (hashCode11 + (str11 != null ? str11.hashCode() : 0)) * 31;
        String str12 = this.FastBitmap$CoordinateSystem;
        int hashCode13 = (hashCode12 + (str12 != null ? str12.hashCode() : 0)) * 31;
        String str13 = this.toDoubleRange;
        int hashCode14 = (hashCode13 + (str13 != null ? str13.hashCode() : 0)) * 31;
        String str14 = this.toString;
        int hashCode15 = (hashCode14 + (str14 != null ? str14.hashCode() : 0)) * 31;
        String str15 = this.hashCode;
        int hashCode16 = (hashCode15 + (str15 != null ? str15.hashCode() : 0)) * 31;
        String str16 = this.valueOf;
        int hashCode17 = (hashCode16 + (str16 != null ? str16.hashCode() : 0)) * 31;
        String str17 = this.invokeSuspend;
        int hashCode18 = (hashCode17 + (str17 != null ? str17.hashCode() : 0)) * 31;
        String str18 = this.Grayscale$Algorithm;
        if (str18 != null) {
            i = str18.hashCode();
        }
        return hashCode18 + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("SubmitReceiptResultModel(id=");
        sb.append(this.setMax);
        sb.append(", createdDate=");
        sb.append(this.getMax);
        sb.append(", modifiedDate=");
        sb.append(this.length);
        sb.append(", orderId=");
        sb.append(this.setMin);
        sb.append(", merchantId=");
        sb.append(this.getMin);
        sb.append(", merchantName=");
        sb.append(this.toIntRange);
        sb.append(", loyaltyMerchantName=");
        sb.append(this.isInside);
        sb.append(", originalMerchantName=");
        sb.append(this.equals);
        sb.append(", orderDate=");
        sb.append(this.toFloatRange);
        sb.append(", orderAmount=");
        sb.append(this.IsOverlapping);
        sb.append(", imageAssetUrl=");
        sb.append(this.values);
        sb.append(", userLoyaltyId=");
        sb.append(this.FastBitmap$CoordinateSystem);
        sb.append(", receiptStatus=");
        sb.append(this.toDoubleRange);
        sb.append(", receiptResultType=");
        sb.append(this.toString);
        sb.append(", receiptApprovalStatus=");
        sb.append(this.hashCode);
        sb.append(", pointGenerated=");
        sb.append(this.valueOf);
        sb.append(", reasonId=");
        sb.append(this.invokeSuspend);
        sb.append(", reasonEn=");
        sb.append(this.Grayscale$Algorithm);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.setMax);
        parcel.writeString(this.getMax);
        parcel.writeString(this.length);
        parcel.writeString(this.setMin);
        parcel.writeString(this.getMin);
        parcel.writeString(this.toIntRange);
        parcel.writeString(this.isInside);
        parcel.writeString(this.equals);
        parcel.writeString(this.toFloatRange);
        parcel.writeString(this.IsOverlapping);
        parcel.writeString(this.values);
        parcel.writeString(this.FastBitmap$CoordinateSystem);
        parcel.writeString(this.toDoubleRange);
        parcel.writeString(this.toString);
        parcel.writeString(this.hashCode);
        parcel.writeString(this.valueOf);
        parcel.writeString(this.invokeSuspend);
        parcel.writeString(this.Grayscale$Algorithm);
    }

    public SubmitReceiptResultModel(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, @NotNull String str18) {
        String str19 = str;
        String str20 = str2;
        String str21 = str3;
        String str22 = str4;
        String str23 = str5;
        String str24 = str6;
        String str25 = str7;
        String str26 = str8;
        String str27 = str9;
        String str28 = str10;
        String str29 = str11;
        String str30 = str12;
        String str31 = str13;
        String str32 = str14;
        String str33 = str16;
        Intrinsics.checkNotNullParameter(str19, "id");
        Intrinsics.checkNotNullParameter(str20, "createdDate");
        Intrinsics.checkNotNullParameter(str21, "modifiedDate");
        Intrinsics.checkNotNullParameter(str22, DeepLinkConstant.DeepLinkParams.ORDER_ID);
        Intrinsics.checkNotNullParameter(str23, "merchantId");
        Intrinsics.checkNotNullParameter(str24, BranchLinkConstant.OauthParams.MERCHANT_NAME);
        Intrinsics.checkNotNullParameter(str25, "loyaltyMerchantName");
        Intrinsics.checkNotNullParameter(str26, "originalMerchantName");
        Intrinsics.checkNotNullParameter(str27, "orderDate");
        Intrinsics.checkNotNullParameter(str28, "orderAmount");
        Intrinsics.checkNotNullParameter(str29, "imageAssetUrl");
        Intrinsics.checkNotNullParameter(str30, "userLoyaltyId");
        Intrinsics.checkNotNullParameter(str31, "receiptStatus");
        Intrinsics.checkNotNullParameter(str32, "receiptResultType");
        Intrinsics.checkNotNullParameter(str15, "receiptApprovalStatus");
        Intrinsics.checkNotNullParameter(str16, "pointGenerated");
        Intrinsics.checkNotNullParameter(str17, "reasonId");
        Intrinsics.checkNotNullParameter(str18, "reasonEn");
        this.setMax = str19;
        this.getMax = str20;
        this.length = str21;
        this.setMin = str22;
        this.getMin = str23;
        this.toIntRange = str24;
        this.isInside = str25;
        this.equals = str26;
        this.toFloatRange = str27;
        this.IsOverlapping = str28;
        this.values = str29;
        this.FastBitmap$CoordinateSystem = str30;
        this.toDoubleRange = str31;
        this.toString = str32;
        this.hashCode = str15;
        this.valueOf = str16;
        this.invokeSuspend = str17;
        this.Grayscale$Algorithm = str18;
    }

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 2})
    public static class Creator implements Parcelable.Creator<SubmitReceiptResultModel> {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new SubmitReceiptResultModel[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, CurrencyTextView.DEFAULT_LANGUAGE_CODE);
            return new SubmitReceiptResultModel(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }
    }
}
