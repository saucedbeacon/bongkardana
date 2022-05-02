package id.dana.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.alibaba.ariver.kernel.RVParams;
import id.dana.data.constant.BranchLinkConstant;
import id.dana.richview.CurrencyTextView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.android.parcel.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b)\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B_\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003¢\u0006\u0002\u0010\rJ\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\tHÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003Jc\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u0003HÆ\u0001J\t\u00102\u001a\u000203HÖ\u0001J\u0013\u00104\u001a\u00020\t2\b\u00105\u001a\u0004\u0018\u000106HÖ\u0003J\t\u00107\u001a\u000203HÖ\u0001J\t\u00108\u001a\u00020\u0003HÖ\u0001J\u0019\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u000203HÖ\u0001R\u001a\u0010\u0006\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\n\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011R\u0011\u0010\u0014\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0016\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\u0017\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0015R\u0011\u0010\u0018\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0015R\u0011\u0010\u0019\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0015R\u001a\u0010\b\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\u0015\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u000f\"\u0004\b\u001d\u0010\u0011R\u001a\u0010\f\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u000f\"\u0004\b\u001f\u0010\u0011R\u001a\u0010\u000b\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u000f\"\u0004\b!\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u000f\"\u0004\b#\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u000f\"\u0004\b%\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u000f\"\u0004\b'\u0010\u0011¨\u0006>"}, d2 = {"Lid/dana/model/SendMoneyHomeMenuModel;", "Landroid/os/Parcelable;", "key", "", "title", "subTitle", "action", "redirectUrl", "isPromoActive", "", "icon", "promoTitle", "promoDesc", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAction", "()Ljava/lang/String;", "setAction", "(Ljava/lang/String;)V", "getIcon", "setIcon", "isBank", "()Z", "isChat", "isExternal", "isOutlet", "isPhoneNumber", "setPromoActive", "(Z)V", "getKey", "setKey", "getPromoDesc", "setPromoDesc", "getPromoTitle", "setPromoTitle", "getRedirectUrl", "setRedirectUrl", "getSubTitle", "setSubTitle", "getTitle", "setTitle", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
@Parcelize
public final class SendMoneyHomeMenuModel implements Parcelable {
    public static final Parcelable.Creator<SendMoneyHomeMenuModel> CREATOR = new getMax();
    @NotNull
    public String IsOverlapping;
    @NotNull
    public String equals;
    @NotNull
    public String getMax;
    public boolean getMin;
    @NotNull
    public String length;
    @NotNull
    public String setMax;
    @NotNull
    public String setMin;
    @NotNull
    private String toFloatRange;
    @NotNull
    public String toIntRange;

    public SendMoneyHomeMenuModel() {
        this((byte) 0);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SendMoneyHomeMenuModel)) {
            return false;
        }
        SendMoneyHomeMenuModel sendMoneyHomeMenuModel = (SendMoneyHomeMenuModel) obj;
        return Intrinsics.areEqual((Object) this.toFloatRange, (Object) sendMoneyHomeMenuModel.toFloatRange) && Intrinsics.areEqual((Object) this.setMin, (Object) sendMoneyHomeMenuModel.setMin) && Intrinsics.areEqual((Object) this.getMax, (Object) sendMoneyHomeMenuModel.getMax) && Intrinsics.areEqual((Object) this.length, (Object) sendMoneyHomeMenuModel.length) && Intrinsics.areEqual((Object) this.setMax, (Object) sendMoneyHomeMenuModel.setMax) && this.getMin == sendMoneyHomeMenuModel.getMin && Intrinsics.areEqual((Object) this.equals, (Object) sendMoneyHomeMenuModel.equals) && Intrinsics.areEqual((Object) this.toIntRange, (Object) sendMoneyHomeMenuModel.toIntRange) && Intrinsics.areEqual((Object) this.IsOverlapping, (Object) sendMoneyHomeMenuModel.IsOverlapping);
    }

    public final int hashCode() {
        String str = this.toFloatRange;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.setMin;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.getMax;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.length;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.setMax;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        boolean z = this.getMin;
        if (z) {
            z = true;
        }
        int i2 = (hashCode5 + (z ? 1 : 0)) * 31;
        String str6 = this.equals;
        int hashCode6 = (i2 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.toIntRange;
        int hashCode7 = (hashCode6 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.IsOverlapping;
        if (str8 != null) {
            i = str8.hashCode();
        }
        return hashCode7 + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("SendMoneyHomeMenuModel(key=");
        sb.append(this.toFloatRange);
        sb.append(", title=");
        sb.append(this.setMin);
        sb.append(", subTitle=");
        sb.append(this.getMax);
        sb.append(", action=");
        sb.append(this.length);
        sb.append(", redirectUrl=");
        sb.append(this.setMax);
        sb.append(", isPromoActive=");
        sb.append(this.getMin);
        sb.append(", icon=");
        sb.append(this.equals);
        sb.append(", promoTitle=");
        sb.append(this.toIntRange);
        sb.append(", promoDesc=");
        sb.append(this.IsOverlapping);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.toFloatRange);
        parcel.writeString(this.setMin);
        parcel.writeString(this.getMax);
        parcel.writeString(this.length);
        parcel.writeString(this.setMax);
        parcel.writeInt(this.getMin ? 1 : 0);
        parcel.writeString(this.equals);
        parcel.writeString(this.toIntRange);
        parcel.writeString(this.IsOverlapping);
    }

    public SendMoneyHomeMenuModel(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, boolean z, @NotNull String str6, @NotNull String str7, @NotNull String str8) {
        Intrinsics.checkNotNullParameter(str, "key");
        Intrinsics.checkNotNullParameter(str2, "title");
        Intrinsics.checkNotNullParameter(str3, RVParams.LONG_SUB_TITLE);
        Intrinsics.checkNotNullParameter(str4, "action");
        Intrinsics.checkNotNullParameter(str5, BranchLinkConstant.OauthParams.REDIRECT_URL);
        Intrinsics.checkNotNullParameter(str6, "icon");
        Intrinsics.checkNotNullParameter(str7, "promoTitle");
        Intrinsics.checkNotNullParameter(str8, "promoDesc");
        this.toFloatRange = str;
        this.setMin = str2;
        this.getMax = str3;
        this.length = str4;
        this.setMax = str5;
        this.getMin = z;
        this.equals = str6;
        this.toIntRange = str7;
        this.IsOverlapping = str8;
    }

    public final boolean setMin() {
        return this.getMin;
    }

    public /* synthetic */ SendMoneyHomeMenuModel(byte b) {
        this("", "", "", "", "", false, "", "", "");
    }

    public final boolean getMax() {
        return Intrinsics.areEqual((Object) this.length, (Object) "bank");
    }

    public final boolean getMin() {
        return Intrinsics.areEqual((Object) this.length, (Object) "phonenumber");
    }

    public final boolean length() {
        return Intrinsics.areEqual((Object) this.length, (Object) "chat");
    }

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 2})
    public static class getMax implements Parcelable.Creator<SendMoneyHomeMenuModel> {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new SendMoneyHomeMenuModel[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, CurrencyTextView.DEFAULT_LANGUAGE_CODE);
            return new SendMoneyHomeMenuModel(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString());
        }
    }
}
