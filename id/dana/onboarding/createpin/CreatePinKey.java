package id.dana.onboarding.createpin;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import id.dana.base.BaseKey;
import id.dana.richview.CurrencyTextView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.android.parcel.Parcelize;
import o.DeviceInfoBridgeExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\b\u0018\u0000 \"2\u00020\u00012\u00020\u0002:\u0001\"B-\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0004HÆ\u0003J9\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\b\u0010\u0013\u001a\u00020\u0014H\u0014J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0016HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0016HÖ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006#"}, d2 = {"Lid/dana/onboarding/createpin/CreatePinKey;", "Landroid/os/Parcelable;", "Lid/dana/base/BaseKey;", "phoneNumber", "", "nickname", "avatarUri", "referralCode", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAvatarUri", "()Ljava/lang/String;", "getNickname", "getPhoneNumber", "getReferralCode", "component1", "component2", "component3", "component4", "copy", "createFragment", "Landroidx/fragment/app/Fragment;", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
@Parcelize
public final class CreatePinKey extends BaseKey implements Parcelable {
    public static final Parcelable.Creator<CreatePinKey> CREATOR = new setMin();
    @NotNull
    public static final length getMin = new length((byte) 0);
    @Nullable
    private final String getMax;
    @Nullable
    private final String setMax;
    @Nullable
    private final String setMin;
    @Nullable
    private final String toFloatRange;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreatePinKey)) {
            return false;
        }
        CreatePinKey createPinKey = (CreatePinKey) obj;
        return Intrinsics.areEqual((Object) this.setMax, (Object) createPinKey.setMax) && Intrinsics.areEqual((Object) this.setMin, (Object) createPinKey.setMin) && Intrinsics.areEqual((Object) this.getMax, (Object) createPinKey.getMax) && Intrinsics.areEqual((Object) this.toFloatRange, (Object) createPinKey.toFloatRange);
    }

    public final int hashCode() {
        String str = this.setMax;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.setMin;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.getMax;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.toFloatRange;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode3 + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("CreatePinKey(phoneNumber=");
        sb.append(this.setMax);
        sb.append(", nickname=");
        sb.append(this.setMin);
        sb.append(", avatarUri=");
        sb.append(this.getMax);
        sb.append(", referralCode=");
        sb.append(this.toFloatRange);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.setMax);
        parcel.writeString(this.setMin);
        parcel.writeString(this.getMax);
        parcel.writeString(this.toFloatRange);
    }

    public CreatePinKey(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        this.setMax = str;
        this.setMin = str2;
        this.getMax = str3;
        this.toFloatRange = str4;
    }

    @NotNull
    public final Fragment getMin() {
        DeviceInfoBridgeExtension.setMax setmax = DeviceInfoBridgeExtension.setMax;
        String str = this.setMax;
        String str2 = this.setMin;
        String str3 = this.getMax;
        String str4 = this.toFloatRange;
        Bundle bundle = new Bundle();
        bundle.putString("phoneNumber", str);
        bundle.putString("nickname", str2);
        bundle.putString("avatarUri", str3);
        bundle.putString("referralCode", str4);
        DeviceInfoBridgeExtension deviceInfoBridgeExtension = new DeviceInfoBridgeExtension();
        deviceInfoBridgeExtension.setArguments(bundle);
        return deviceInfoBridgeExtension;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J*\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u0006¨\u0006\n"}, d2 = {"Lid/dana/onboarding/createpin/CreatePinKey$Companion;", "", "()V", "create", "Lid/dana/onboarding/createpin/CreatePinKey;", "phoneNumber", "", "nickname", "avatarUri", "referralCode", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class length {
        private length() {
        }

        public /* synthetic */ length(byte b) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 2})
    public static class setMin implements Parcelable.Creator<CreatePinKey> {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new CreatePinKey[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, CurrencyTextView.DEFAULT_LANGUAGE_CODE);
            return new CreatePinKey(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }
    }
}
