package id.dana.oauth.model;

import android.os.Parcel;
import android.os.Parcelable;
import id.dana.richview.CurrencyTextView;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.android.parcel.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\bO\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\b\u0018\u0000 j2\u00020\u0001:\u0001jBï\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\u0018J\u000b\u0010F\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010P\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010*J\u000b\u0010Q\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010S\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007HÆ\u0003J\u000b\u0010T\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010U\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010V\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010W\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010*J\u000b\u0010X\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jø\u0001\u0010Y\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0002\u0010ZJ\t\u0010[\u001a\u00020\\HÖ\u0001J\u0013\u0010]\u001a\u00020\f2\b\u0010^\u001a\u0004\u0018\u00010_HÖ\u0003J\u000e\u0010`\u001a\u00020\u00032\u0006\u0010a\u001a\u00020\u0003J\t\u0010b\u001a\u00020\\HÖ\u0001J\u0006\u0010c\u001a\u00020\fJ\t\u0010d\u001a\u00020\u0003HÖ\u0001J\u0019\u0010e\u001a\u00020f2\u0006\u0010g\u001a\u00020h2\u0006\u0010i\u001a\u00020\\HÖ\u0001R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001c\u0010\r\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001a\"\u0004\b\u001e\u0010\u001cR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u001a\"\u0004\b \u0010\u001cR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001a\"\u0004\b\"\u0010\u001cR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u001a\"\u0004\b$\u0010\u001cR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u001a\"\u0004\b&\u0010\u001cR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u001a\"\u0004\b(\u0010\u001cR\u001e\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0010\n\u0002\u0010-\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u001a\"\u0004\b/\u0010\u001cR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u001a\"\u0004\b1\u0010\u001cR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u001a\"\u0004\b3\u0010\u001cR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u001a\"\u0004\b5\u0010\u001cR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u0010\u001a\"\u0004\b7\u0010\u001cR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010\u001a\"\u0004\b9\u0010\u001cR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u001e\u0010\u0017\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0010\n\u0002\u0010-\u001a\u0004\b>\u0010*\"\u0004\b?\u0010,R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010\u001a\"\u0004\bA\u0010\u001cR\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010\u001a\"\u0004\bC\u0010\u001cR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010\u001a\"\u0004\bE\u0010\u001c¨\u0006k"}, d2 = {"Lid/dana/oauth/model/OauthParamsModel;", "Landroid/os/Parcelable;", "responseType", "", "clientId", "phoneNumber", "scope", "", "state", "codeChallenge", "redirectUrl", "needMobileToken", "", "bindDanaType", "acqSiteId", "merchantId", "merchantName", "netAuthId", "paySiteId", "terminalType", "signature", "mcc", "referringLink", "signContractMerchant", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "getAcqSiteId", "()Ljava/lang/String;", "setAcqSiteId", "(Ljava/lang/String;)V", "getBindDanaType", "setBindDanaType", "getClientId", "setClientId", "getCodeChallenge", "setCodeChallenge", "getMcc", "setMcc", "getMerchantId", "setMerchantId", "getMerchantName", "setMerchantName", "getNeedMobileToken", "()Ljava/lang/Boolean;", "setNeedMobileToken", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getNetAuthId", "setNetAuthId", "getPaySiteId", "setPaySiteId", "getPhoneNumber", "setPhoneNumber", "getRedirectUrl", "setRedirectUrl", "getReferringLink", "setReferringLink", "getResponseType", "setResponseType", "getScope", "()Ljava/util/List;", "setScope", "(Ljava/util/List;)V", "getSignContractMerchant", "setSignContractMerchant", "getSignature", "setSignature", "getState", "setState", "getTerminalType", "setTerminalType", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lid/dana/oauth/model/OauthParamsModel;", "describeContents", "", "equals", "other", "", "getRedirectScheme", "scheme", "hashCode", "isGoogleMerchant", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
@Parcelize
public final class OauthParamsModel implements Parcelable {
    public static final Parcelable.Creator<OauthParamsModel> CREATOR = new getMax();
    @NotNull
    public static final getMin toString = new getMin((byte) 0);
    @Nullable
    public String FastBitmap$CoordinateSystem;
    @Nullable
    private String Grayscale$Algorithm;
    @Nullable
    public String IsOverlapping;
    @Nullable
    private String Mean$Arithmetic;
    @Nullable
    public String equals;
    @Nullable
    public String getMax;
    @Nullable
    public String getMin;
    @Nullable
    public String hashCode;
    @Nullable
    private Boolean invoke;
    @Nullable
    private String invokeSuspend;
    @Nullable
    public String isInside;
    @Nullable
    public List<String> length;
    @Nullable
    public String setMax;
    @Nullable
    public String setMin;
    @Nullable
    public String toDoubleRange;
    @Nullable
    public Boolean toFloatRange;
    @Nullable
    public String toIntRange;
    @Nullable
    private String valueOf;
    @Nullable
    public String values;

    public OauthParamsModel() {
        this((String) null, (String) null, (String) null, (List) null, (String) null, (String) null, (String) null, (Boolean) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Boolean) null, 524287);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OauthParamsModel)) {
            return false;
        }
        OauthParamsModel oauthParamsModel = (OauthParamsModel) obj;
        return Intrinsics.areEqual((Object) this.getMax, (Object) oauthParamsModel.getMax) && Intrinsics.areEqual((Object) this.getMin, (Object) oauthParamsModel.getMin) && Intrinsics.areEqual((Object) this.setMax, (Object) oauthParamsModel.setMax) && Intrinsics.areEqual((Object) this.length, (Object) oauthParamsModel.length) && Intrinsics.areEqual((Object) this.setMin, (Object) oauthParamsModel.setMin) && Intrinsics.areEqual((Object) this.isInside, (Object) oauthParamsModel.isInside) && Intrinsics.areEqual((Object) this.IsOverlapping, (Object) oauthParamsModel.IsOverlapping) && Intrinsics.areEqual((Object) this.toFloatRange, (Object) oauthParamsModel.toFloatRange) && Intrinsics.areEqual((Object) this.toIntRange, (Object) oauthParamsModel.toIntRange) && Intrinsics.areEqual((Object) this.valueOf, (Object) oauthParamsModel.valueOf) && Intrinsics.areEqual((Object) this.equals, (Object) oauthParamsModel.equals) && Intrinsics.areEqual((Object) this.toDoubleRange, (Object) oauthParamsModel.toDoubleRange) && Intrinsics.areEqual((Object) this.FastBitmap$CoordinateSystem, (Object) oauthParamsModel.FastBitmap$CoordinateSystem) && Intrinsics.areEqual((Object) this.Mean$Arithmetic, (Object) oauthParamsModel.Mean$Arithmetic) && Intrinsics.areEqual((Object) this.Grayscale$Algorithm, (Object) oauthParamsModel.Grayscale$Algorithm) && Intrinsics.areEqual((Object) this.values, (Object) oauthParamsModel.values) && Intrinsics.areEqual((Object) this.invokeSuspend, (Object) oauthParamsModel.invokeSuspend) && Intrinsics.areEqual((Object) this.hashCode, (Object) oauthParamsModel.hashCode) && Intrinsics.areEqual((Object) this.invoke, (Object) oauthParamsModel.invoke);
    }

    public final int hashCode() {
        String str = this.getMax;
        int i = 0;
        int hashCode2 = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.getMin;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.setMax;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        List<String> list = this.length;
        int hashCode5 = (hashCode4 + (list != null ? list.hashCode() : 0)) * 31;
        String str4 = this.setMin;
        int hashCode6 = (hashCode5 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.isInside;
        int hashCode7 = (hashCode6 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.IsOverlapping;
        int hashCode8 = (hashCode7 + (str6 != null ? str6.hashCode() : 0)) * 31;
        Boolean bool = this.toFloatRange;
        int hashCode9 = (hashCode8 + (bool != null ? bool.hashCode() : 0)) * 31;
        String str7 = this.toIntRange;
        int hashCode10 = (hashCode9 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.valueOf;
        int hashCode11 = (hashCode10 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.equals;
        int hashCode12 = (hashCode11 + (str9 != null ? str9.hashCode() : 0)) * 31;
        String str10 = this.toDoubleRange;
        int hashCode13 = (hashCode12 + (str10 != null ? str10.hashCode() : 0)) * 31;
        String str11 = this.FastBitmap$CoordinateSystem;
        int hashCode14 = (hashCode13 + (str11 != null ? str11.hashCode() : 0)) * 31;
        String str12 = this.Mean$Arithmetic;
        int hashCode15 = (hashCode14 + (str12 != null ? str12.hashCode() : 0)) * 31;
        String str13 = this.Grayscale$Algorithm;
        int hashCode16 = (hashCode15 + (str13 != null ? str13.hashCode() : 0)) * 31;
        String str14 = this.values;
        int hashCode17 = (hashCode16 + (str14 != null ? str14.hashCode() : 0)) * 31;
        String str15 = this.invokeSuspend;
        int hashCode18 = (hashCode17 + (str15 != null ? str15.hashCode() : 0)) * 31;
        String str16 = this.hashCode;
        int hashCode19 = (hashCode18 + (str16 != null ? str16.hashCode() : 0)) * 31;
        Boolean bool2 = this.invoke;
        if (bool2 != null) {
            i = bool2.hashCode();
        }
        return hashCode19 + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("OauthParamsModel(responseType=");
        sb.append(this.getMax);
        sb.append(", clientId=");
        sb.append(this.getMin);
        sb.append(", phoneNumber=");
        sb.append(this.setMax);
        sb.append(", scope=");
        sb.append(this.length);
        sb.append(", state=");
        sb.append(this.setMin);
        sb.append(", codeChallenge=");
        sb.append(this.isInside);
        sb.append(", redirectUrl=");
        sb.append(this.IsOverlapping);
        sb.append(", needMobileToken=");
        sb.append(this.toFloatRange);
        sb.append(", bindDanaType=");
        sb.append(this.toIntRange);
        sb.append(", acqSiteId=");
        sb.append(this.valueOf);
        sb.append(", merchantId=");
        sb.append(this.equals);
        sb.append(", merchantName=");
        sb.append(this.toDoubleRange);
        sb.append(", netAuthId=");
        sb.append(this.FastBitmap$CoordinateSystem);
        sb.append(", paySiteId=");
        sb.append(this.Mean$Arithmetic);
        sb.append(", terminalType=");
        sb.append(this.Grayscale$Algorithm);
        sb.append(", signature=");
        sb.append(this.values);
        sb.append(", mcc=");
        sb.append(this.invokeSuspend);
        sb.append(", referringLink=");
        sb.append(this.hashCode);
        sb.append(", signContractMerchant=");
        sb.append(this.invoke);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.getMax);
        parcel.writeString(this.getMin);
        parcel.writeString(this.setMax);
        parcel.writeStringList(this.length);
        parcel.writeString(this.setMin);
        parcel.writeString(this.isInside);
        parcel.writeString(this.IsOverlapping);
        Boolean bool = this.toFloatRange;
        if (bool != null) {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.toIntRange);
        parcel.writeString(this.valueOf);
        parcel.writeString(this.equals);
        parcel.writeString(this.toDoubleRange);
        parcel.writeString(this.FastBitmap$CoordinateSystem);
        parcel.writeString(this.Mean$Arithmetic);
        parcel.writeString(this.Grayscale$Algorithm);
        parcel.writeString(this.values);
        parcel.writeString(this.invokeSuspend);
        parcel.writeString(this.hashCode);
        Boolean bool2 = this.invoke;
        if (bool2 != null) {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
            return;
        }
        parcel.writeInt(0);
    }

    public OauthParamsModel(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable List<String> list, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable Boolean bool, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable String str14, @Nullable String str15, @Nullable String str16, @Nullable Boolean bool2) {
        this.getMax = str;
        this.getMin = str2;
        this.setMax = str3;
        this.length = list;
        this.setMin = str4;
        this.isInside = str5;
        this.IsOverlapping = str6;
        this.toFloatRange = bool;
        this.toIntRange = str7;
        this.valueOf = str8;
        this.equals = str9;
        this.toDoubleRange = str10;
        this.FastBitmap$CoordinateSystem = str11;
        this.Mean$Arithmetic = str12;
        this.Grayscale$Algorithm = str13;
        this.values = str14;
        this.invokeSuspend = str15;
        this.hashCode = str16;
        this.invoke = bool2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ OauthParamsModel(java.lang.String r21, java.lang.String r22, java.lang.String r23, java.util.List r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, java.lang.Boolean r28, java.lang.String r29, java.lang.String r30, java.lang.String r31, java.lang.String r32, java.lang.String r33, java.lang.String r34, java.lang.String r35, java.lang.String r36, java.lang.String r37, java.lang.String r38, java.lang.Boolean r39, int r40) {
        /*
            r20 = this;
            r0 = r40
            r1 = r0 & 1
            java.lang.String r2 = ""
            if (r1 == 0) goto L_0x000a
            r1 = r2
            goto L_0x000c
        L_0x000a:
            r1 = r21
        L_0x000c:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0012
            r3 = r2
            goto L_0x0014
        L_0x0012:
            r3 = r22
        L_0x0014:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x001a
            r4 = r2
            goto L_0x001c
        L_0x001a:
            r4 = r23
        L_0x001c:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x0028
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.List r5 = (java.util.List) r5
            goto L_0x002a
        L_0x0028:
            r5 = r24
        L_0x002a:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0030
            r6 = r2
            goto L_0x0032
        L_0x0030:
            r6 = r25
        L_0x0032:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x0038
            r7 = r2
            goto L_0x003a
        L_0x0038:
            r7 = r26
        L_0x003a:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0040
            r8 = r2
            goto L_0x0042
        L_0x0040:
            r8 = r27
        L_0x0042:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x0049
            java.lang.Boolean r9 = java.lang.Boolean.FALSE
            goto L_0x004b
        L_0x0049:
            r9 = r28
        L_0x004b:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x0051
            r10 = r2
            goto L_0x0053
        L_0x0051:
            r10 = r29
        L_0x0053:
            r11 = r0 & 512(0x200, float:7.175E-43)
            if (r11 == 0) goto L_0x0059
            r11 = r2
            goto L_0x005b
        L_0x0059:
            r11 = r30
        L_0x005b:
            r12 = r0 & 1024(0x400, float:1.435E-42)
            if (r12 == 0) goto L_0x0061
            r12 = r2
            goto L_0x0063
        L_0x0061:
            r12 = r31
        L_0x0063:
            r13 = r0 & 2048(0x800, float:2.87E-42)
            if (r13 == 0) goto L_0x0069
            r13 = r2
            goto L_0x006b
        L_0x0069:
            r13 = r32
        L_0x006b:
            r14 = r0 & 4096(0x1000, float:5.74E-42)
            if (r14 == 0) goto L_0x0071
            r14 = r2
            goto L_0x0073
        L_0x0071:
            r14 = r33
        L_0x0073:
            r15 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r15 == 0) goto L_0x0079
            r15 = r2
            goto L_0x007b
        L_0x0079:
            r15 = r34
        L_0x007b:
            r16 = r2
            r2 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r2 == 0) goto L_0x0084
            r2 = r16
            goto L_0x0086
        L_0x0084:
            r2 = r35
        L_0x0086:
            r17 = 32768(0x8000, float:4.5918E-41)
            r17 = r0 & r17
            if (r17 == 0) goto L_0x0090
            r17 = r16
            goto L_0x0092
        L_0x0090:
            r17 = r36
        L_0x0092:
            r18 = 65536(0x10000, float:9.18355E-41)
            r18 = r0 & r18
            if (r18 == 0) goto L_0x009b
            r18 = r16
            goto L_0x009d
        L_0x009b:
            r18 = r37
        L_0x009d:
            r19 = 131072(0x20000, float:1.83671E-40)
            r19 = r0 & r19
            if (r19 == 0) goto L_0x00a4
            goto L_0x00a6
        L_0x00a4:
            r16 = r38
        L_0x00a6:
            r19 = 262144(0x40000, float:3.67342E-40)
            r0 = r0 & r19
            if (r0 == 0) goto L_0x00af
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            goto L_0x00b1
        L_0x00af:
            r0 = r39
        L_0x00b1:
            r21 = r20
            r22 = r1
            r23 = r3
            r24 = r4
            r25 = r5
            r26 = r6
            r27 = r7
            r28 = r8
            r29 = r9
            r30 = r10
            r31 = r11
            r32 = r12
            r33 = r13
            r34 = r14
            r35 = r15
            r36 = r2
            r37 = r17
            r38 = r18
            r39 = r16
            r40 = r0
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: id.dana.oauth.model.OauthParamsModel.<init>(java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, int):void");
    }

    @NotNull
    public final String getMax(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "scheme");
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(this.getMin);
        sb.append("://authorize");
        return sb.toString();
    }

    public final boolean getMin() {
        return Intrinsics.areEqual((Object) this.equals, (Object) "2188400000001035");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lid/dana/oauth/model/OauthParamsModel$Companion;", "", "()V", "GOOGLE_SUB_MERCHANT_ID", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMin {
        private getMin() {
        }

        public /* synthetic */ getMin(byte b) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 2})
    public static class getMax implements Parcelable.Creator<OauthParamsModel> {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new OauthParamsModel[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            Boolean bool;
            Boolean bool2;
            Intrinsics.checkNotNullParameter(parcel, CurrencyTextView.DEFAULT_LANGUAGE_CODE);
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            List createStringArrayList = parcel.createStringArrayList();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            boolean z = true;
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            } else {
                bool = null;
            }
            String readString7 = parcel.readString();
            String readString8 = parcel.readString();
            String readString9 = parcel.readString();
            String readString10 = parcel.readString();
            String readString11 = parcel.readString();
            String readString12 = parcel.readString();
            String readString13 = parcel.readString();
            String readString14 = parcel.readString();
            String readString15 = parcel.readString();
            String readString16 = parcel.readString();
            if (parcel.readInt() != 0) {
                if (parcel.readInt() == 0) {
                    z = false;
                }
                bool2 = Boolean.valueOf(z);
            } else {
                bool2 = null;
            }
            return new OauthParamsModel(readString, readString2, readString3, createStringArrayList, readString4, readString5, readString6, bool, readString7, readString8, readString9, readString10, readString11, readString12, readString13, readString14, readString15, readString16, bool2);
        }
    }
}
