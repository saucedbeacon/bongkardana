package id.dana.onboarding.referral;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import id.dana.base.BaseKey;
import id.dana.richview.CurrencyTextView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.android.parcel.Parcelize;
import o.onTrimMemory;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0014J\t\u0010\u0006\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0007HÖ\u0001¨\u0006\r"}, d2 = {"Lid/dana/onboarding/referral/VerifyReferralCodeErrorKey;", "Landroid/os/Parcelable;", "Lid/dana/base/BaseKey;", "()V", "createFragment", "Landroidx/fragment/app/Fragment;", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
@Parcelize
public final class VerifyReferralCodeErrorKey extends BaseKey implements Parcelable {
    public static final Parcelable.Creator<VerifyReferralCodeErrorKey> CREATOR = new setMax();

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeInt(1);
    }

    @NotNull
    public final Fragment getMin() {
        onTrimMemory.getMin getmin = onTrimMemory.setMin;
        return new onTrimMemory();
    }

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 2})
    public static class setMax implements Parcelable.Creator<VerifyReferralCodeErrorKey> {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new VerifyReferralCodeErrorKey[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, CurrencyTextView.DEFAULT_LANGUAGE_CODE);
            if (parcel.readInt() != 0) {
                return new VerifyReferralCodeErrorKey();
            }
            return null;
        }
    }
}
