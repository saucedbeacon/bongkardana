package id.dana.sendmoney.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import id.dana.domain.qrbarcode.DecodeQrBizType;
import id.dana.richview.CurrencyTextView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.android.parcel.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001:\u0001+BY\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\nJ\t\u0010#\u001a\u00020$HÖ\u0001J\u0006\u0010%\u001a\u00020\u0016J\u0019\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020$HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u0011\u0010\u0015\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0017R\u0011\u0010\u0018\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\u0019\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0017R\u0011\u0010\u001a\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0017R\u0011\u0010\u001b\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0017R\u0011\u0010\u001c\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0017R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\f\"\u0004\b\u001e\u0010\u000eR\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\f\"\u0004\b \u0010\u000eR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\f\"\u0004\b\"\u0010\u000e¨\u0006,"}, d2 = {"Lid/dana/sendmoney/model/QrTransferModel;", "Landroid/os/Parcelable;", "amount", "", "avatarUrl", "bizType", "comment", "mobilePhoneNumber", "nickname", "receiverId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAmount", "()Ljava/lang/String;", "setAmount", "(Ljava/lang/String;)V", "getAvatarUrl", "setAvatarUrl", "getBizType", "setBizType", "getComment", "setComment", "isFromDeeplinkMoneyWithPhoneNumber", "", "()Z", "isFromDeeplinkMoneyWithoutPhoneNumber", "isFromDeeplinkOnlyPhoneNumber", "isProfileQr", "isRequestMoney", "isRequestMoneyToBank", "getMobilePhoneNumber", "setMobilePhoneNumber", "getNickname", "setNickname", "getReceiverId", "setReceiverId", "describeContents", "", "hasAmount", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Builder", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
@Parcelize
public class QrTransferModel implements Parcelable {
    public static final Parcelable.Creator<QrTransferModel> CREATOR = new getMin();
    @Nullable
    private String IsOverlapping;
    @Nullable
    private String getMax;
    @Nullable
    private String getMin;
    @Nullable
    private String isInside;
    @Nullable
    private String length;
    @Nullable
    private String setMax;
    @Nullable
    private String setMin;

    public QrTransferModel() {
        this((byte) 0);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.getMax);
        parcel.writeString(this.setMax);
        parcel.writeString(this.setMin);
        parcel.writeString(this.length);
        parcel.writeString(this.getMin);
        parcel.writeString(this.isInside);
        parcel.writeString(this.IsOverlapping);
    }

    public QrTransferModel(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7) {
        this.getMax = str;
        this.setMax = str2;
        this.setMin = str3;
        this.length = str4;
        this.getMin = str5;
        this.isInside = str6;
        this.IsOverlapping = str7;
    }

    @Nullable
    public String getMin() {
        return this.getMax;
    }

    public void setMin(@Nullable String str) {
        this.getMax = str;
    }

    @Nullable
    public String getMax() {
        return this.setMax;
    }

    @Nullable
    public String setMax() {
        return this.setMin;
    }

    @Nullable
    public String length() {
        return this.length;
    }

    public void setMax(@Nullable String str) {
        this.getMin = str;
    }

    @Nullable
    public String setMin() {
        return this.getMin;
    }

    @Nullable
    public String toFloatRange() {
        return this.isInside;
    }

    private /* synthetic */ QrTransferModel(byte b) {
        this("", "", "", "", "", "", "");
    }

    @Nullable
    public String IsOverlapping() {
        return this.IsOverlapping;
    }

    public void getMax(@Nullable String str) {
        this.IsOverlapping = str;
    }

    public final boolean isInside() {
        CharSequence min = setMin();
        if (min == null || StringsKt.isBlank(min)) {
            CharSequence IsOverlapping2 = IsOverlapping();
            if (IsOverlapping2 == null || StringsKt.isBlank(IsOverlapping2)) {
                return true;
            }
        }
        return false;
    }

    public final boolean toIntRange() {
        CharSequence IsOverlapping2 = IsOverlapping();
        if (!(IsOverlapping2 == null || StringsKt.isBlank(IsOverlapping2))) {
            CharSequence min = getMin();
            if (!(min == null || StringsKt.isBlank(min))) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals() {
        CharSequence min = getMin();
        return !(min == null || StringsKt.isBlank(min)) && TextUtils.isDigitsOnly(getMin());
    }

    public final boolean values() {
        CharSequence IsOverlapping2 = IsOverlapping();
        if (!(IsOverlapping2 == null || StringsKt.isBlank(IsOverlapping2))) {
            CharSequence min = getMin();
            if (!(min == null || StringsKt.isBlank(min))) {
                return true;
            }
        }
        return false;
    }

    public final boolean FastBitmap$CoordinateSystem() {
        return Intrinsics.areEqual((Object) setMax(), (Object) DecodeQrBizType.USER_BANK_ACCOUNT_CODE) || Intrinsics.areEqual((Object) setMax(), (Object) DecodeQrBizType.TRANSFER_BANK_ACCOUNT_CODE);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\u0006\u001a\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004J\u0006\u0010\u000b\u001a\u00020\fJ\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lid/dana/sendmoney/model/QrTransferModel$Builder;", "", "()V", "amount", "", "avatarUrl", "bizType", "comment", "mobilePhoneNumber", "nickname", "receiverId", "build", "Lid/dana/sendmoney/model/QrTransferModel;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static class setMax {
        public String getMax = "";
        public String getMin = "";
        public String length = "";
        public String setMax = "";
        public String setMin = "";
        public String toFloatRange = "";
        public String toIntRange = "";

        @NotNull
        public final QrTransferModel getMax() {
            return new QrTransferModel(this.getMax, this.getMin, this.setMin, this.setMax, this.length, this.toIntRange, this.toFloatRange);
        }
    }

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 2})
    public static class getMin implements Parcelable.Creator<QrTransferModel> {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new QrTransferModel[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, CurrencyTextView.DEFAULT_LANGUAGE_CODE);
            return new QrTransferModel(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }
    }
}
