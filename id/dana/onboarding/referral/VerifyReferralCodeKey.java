package id.dana.onboarding.referral;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import id.dana.base.BaseKey;
import id.dana.onboarding.referral.VerifyReferralCodeFragment;
import id.dana.richview.CurrencyTextView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.android.parcel.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0006J\t\u0010\n\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\b\u0010\r\u001a\u00020\u000eH\u0014J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001c"}, d2 = {"Lid/dana/onboarding/referral/VerifyReferralCodeKey;", "Landroid/os/Parcelable;", "Lid/dana/base/BaseKey;", "phoneNumber", "", "prizeName", "(Ljava/lang/String;Ljava/lang/String;)V", "getPhoneNumber", "()Ljava/lang/String;", "getPrizeName", "component1", "component2", "copy", "createFragment", "Landroidx/fragment/app/Fragment;", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
@Parcelize
public final class VerifyReferralCodeKey extends BaseKey implements Parcelable {
    public static final Parcelable.Creator<VerifyReferralCodeKey> CREATOR = new length();
    @Nullable
    private final String setMax;
    @NotNull
    private final String setMin;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VerifyReferralCodeKey)) {
            return false;
        }
        VerifyReferralCodeKey verifyReferralCodeKey = (VerifyReferralCodeKey) obj;
        return Intrinsics.areEqual((Object) this.setMin, (Object) verifyReferralCodeKey.setMin) && Intrinsics.areEqual((Object) this.setMax, (Object) verifyReferralCodeKey.setMax);
    }

    public final int hashCode() {
        String str = this.setMin;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.setMax;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("VerifyReferralCodeKey(phoneNumber=");
        sb.append(this.setMin);
        sb.append(", prizeName=");
        sb.append(this.setMax);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.setMin);
        parcel.writeString(this.setMax);
    }

    public VerifyReferralCodeKey(@NotNull String str, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(str, "phoneNumber");
        this.setMin = str;
        this.setMax = str2;
    }

    @NotNull
    public final Fragment getMin() {
        VerifyReferralCodeFragment.setMin setmin = VerifyReferralCodeFragment.getMin;
        String str = this.setMin;
        String str2 = this.setMax;
        Bundle bundle = new Bundle();
        bundle.putString("phoneNumber", str);
        bundle.putString("referralName", str2);
        VerifyReferralCodeFragment verifyReferralCodeFragment = new VerifyReferralCodeFragment();
        verifyReferralCodeFragment.setArguments(bundle);
        return verifyReferralCodeFragment;
    }

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 2})
    public static class length implements Parcelable.Creator<VerifyReferralCodeKey> {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new VerifyReferralCodeKey[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, CurrencyTextView.DEFAULT_LANGUAGE_CODE);
            return new VerifyReferralCodeKey(parcel.readString(), parcel.readString());
        }
    }
}
