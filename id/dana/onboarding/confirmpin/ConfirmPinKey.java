package id.dana.onboarding.confirmpin;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import id.dana.base.BaseKey;
import id.dana.onboarding.confirmpin.ConfirmPinFragment;
import id.dana.richview.CurrencyTextView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.android.parcel.Parcelize;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\b\u0018\u0000 %2\u00020\u00012\u00020\u0002:\u0001%B7\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0004HÆ\u0003JE\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\b\u0010\u0016\u001a\u00020\u0017H\u0014J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0004HÖ\u0001J\u0019\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0019HÖ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006&"}, d2 = {"Lid/dana/onboarding/confirmpin/ConfirmPinKey;", "Landroid/os/Parcelable;", "Lid/dana/base/BaseKey;", "phoneNumber", "", "nickname", "avatarUri", "pin", "referralCode", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAvatarUri", "()Ljava/lang/String;", "getNickname", "getPhoneNumber", "getPin", "getReferralCode", "component1", "component2", "component3", "component4", "component5", "copy", "createFragment", "Landroidx/fragment/app/Fragment;", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
@Parcelize
public final class ConfirmPinKey extends BaseKey implements Parcelable {
    public static final Parcelable.Creator<ConfirmPinKey> CREATOR = new getMax();
    @NotNull
    public static final length setMin = new length((byte) 0);
    @Nullable
    private final String IsOverlapping;
    @Nullable
    private final String getMax;
    @Nullable
    private final String getMin;
    @Nullable
    private final String isInside;
    @Nullable
    private final String setMax;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConfirmPinKey)) {
            return false;
        }
        ConfirmPinKey confirmPinKey = (ConfirmPinKey) obj;
        return Intrinsics.areEqual((Object) this.getMax, (Object) confirmPinKey.getMax) && Intrinsics.areEqual((Object) this.setMax, (Object) confirmPinKey.setMax) && Intrinsics.areEqual((Object) this.getMin, (Object) confirmPinKey.getMin) && Intrinsics.areEqual((Object) this.IsOverlapping, (Object) confirmPinKey.IsOverlapping) && Intrinsics.areEqual((Object) this.isInside, (Object) confirmPinKey.isInside);
    }

    public final int hashCode() {
        String str = this.getMax;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.setMax;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.getMin;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.IsOverlapping;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.isInside;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return hashCode4 + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("ConfirmPinKey(phoneNumber=");
        sb.append(this.getMax);
        sb.append(", nickname=");
        sb.append(this.setMax);
        sb.append(", avatarUri=");
        sb.append(this.getMin);
        sb.append(", pin=");
        sb.append(this.IsOverlapping);
        sb.append(", referralCode=");
        sb.append(this.isInside);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int max = dispatchOnCancelled.setMax(i);
        if (i != max) {
            onCanceled oncanceled = new onCanceled(i, max, 1);
            onCancelLoad.setMax(210404194, oncanceled);
            onCancelLoad.getMin(210404194, oncanceled);
        }
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.getMax);
        parcel.writeString(this.setMax);
        parcel.writeString(this.getMin);
        parcel.writeString(this.IsOverlapping);
        parcel.writeString(this.isInside);
    }

    public ConfirmPinKey(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        this.getMax = str;
        this.setMax = str2;
        this.getMin = str3;
        this.IsOverlapping = str4;
        this.isInside = str5;
    }

    @NotNull
    public final Fragment getMin() {
        ConfirmPinFragment.setMax setmax = ConfirmPinFragment.setMin;
        String str = this.getMax;
        String str2 = this.setMax;
        String str3 = this.getMin;
        String str4 = this.IsOverlapping;
        String str5 = this.isInside;
        Bundle bundle = new Bundle();
        bundle.putString("phoneNumber", str);
        bundle.putString("nickname", str2);
        bundle.putString("avatarUri", str3);
        bundle.putString("pin", str4);
        bundle.putString("referralCode", str5);
        ConfirmPinFragment confirmPinFragment = new ConfirmPinFragment();
        confirmPinFragment.setArguments(bundle);
        return confirmPinFragment;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J2\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u0006¨\u0006\u000b"}, d2 = {"Lid/dana/onboarding/confirmpin/ConfirmPinKey$Companion;", "", "()V", "create", "Lid/dana/onboarding/confirmpin/ConfirmPinKey;", "phoneNumber", "", "nickname", "avatarUri", "pin", "referralCode", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class length {
        private length() {
        }

        public /* synthetic */ length(byte b) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 2})
    public static class getMax implements Parcelable.Creator<ConfirmPinKey> {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ConfirmPinKey[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, CurrencyTextView.DEFAULT_LANGUAGE_CODE);
            return new ConfirmPinKey(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }
    }
}
