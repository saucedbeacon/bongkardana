package id.dana.onboarding.verify;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import id.dana.base.BaseKey;
import id.dana.onboarding.verify.VerifyNumberFragment;
import id.dana.richview.CurrencyTextView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.android.parcel.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\b\u0018\u0000 $2\u00020\u00012\u00020\u0002:\u0002#$B)\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0002\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J5\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u0006HÆ\u0001J\b\u0010\u0015\u001a\u00020\u0016H\u0014J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\u0013\u0010\u0019\u001a\u00020\u00062\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u0018HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006%"}, d2 = {"Lid/dana/onboarding/verify/VerifyNumberKey;", "Landroid/os/Parcelable;", "Lid/dana/base/BaseKey;", "phoneNumber", "", "editablePhoneNumber", "", "source", "fromLogout", "(Ljava/lang/String;ZLjava/lang/String;Z)V", "getEditablePhoneNumber", "()Z", "getFromLogout", "getPhoneNumber", "()Ljava/lang/String;", "getSource", "component1", "component2", "component3", "component4", "copy", "createFragment", "Landroidx/fragment/app/Fragment;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Builder", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
@Parcelize
public final class VerifyNumberKey extends BaseKey implements Parcelable {
    public static final Parcelable.Creator<VerifyNumberKey> CREATOR = new getMin();
    @NotNull
    public static final length setMax = new length((byte) 0);
    private final boolean IsOverlapping;
    @Nullable
    private final String getMax;
    private final boolean getMin;
    @Nullable
    private final String setMin;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\t\u001a\u00020\nJ\u0015\u0010\u000b\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\fJ\u0015\u0010\r\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\fJ\u0010\u0010\u000e\u001a\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007J\u0010\u0010\u000f\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lid/dana/onboarding/verify/VerifyNumberKey$Builder;", "", "()V", "editablePhoneNumber", "", "fromLogout", "phoneNumber", "", "source", "build", "Lid/dana/onboarding/verify/VerifyNumberKey;", "setEditablePhoneNumber", "(Ljava/lang/Boolean;)Lid/dana/onboarding/verify/VerifyNumberKey$Builder;", "setFromLogout", "setPhoneNumber", "setSource", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMin {
        public boolean getMax;
        public boolean getMin;
        public String length;
        public String setMin;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VerifyNumberKey)) {
            return false;
        }
        VerifyNumberKey verifyNumberKey = (VerifyNumberKey) obj;
        return Intrinsics.areEqual((Object) this.getMax, (Object) verifyNumberKey.getMax) && this.getMin == verifyNumberKey.getMin && Intrinsics.areEqual((Object) this.setMin, (Object) verifyNumberKey.setMin) && this.IsOverlapping == verifyNumberKey.IsOverlapping;
    }

    public final int hashCode() {
        String str = this.getMax;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        boolean z = this.getMin;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i2 = (hashCode + (z ? 1 : 0)) * 31;
        String str2 = this.setMin;
        if (str2 != null) {
            i = str2.hashCode();
        }
        int i3 = (i2 + i) * 31;
        boolean z3 = this.IsOverlapping;
        if (!z3) {
            z2 = z3;
        }
        return i3 + (z2 ? 1 : 0);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("VerifyNumberKey(phoneNumber=");
        sb.append(this.getMax);
        sb.append(", editablePhoneNumber=");
        sb.append(this.getMin);
        sb.append(", source=");
        sb.append(this.setMin);
        sb.append(", fromLogout=");
        sb.append(this.IsOverlapping);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.getMax);
        parcel.writeInt(this.getMin ? 1 : 0);
        parcel.writeString(this.setMin);
        parcel.writeInt(this.IsOverlapping ? 1 : 0);
    }

    public VerifyNumberKey(@Nullable String str, boolean z, @Nullable String str2, boolean z2) {
        this.getMax = str;
        this.getMin = z;
        this.setMin = str2;
        this.IsOverlapping = z2;
    }

    @NotNull
    public final Fragment getMin() {
        if (!TextUtils.isEmpty(this.getMax)) {
            VerifyNumberFragment.getMax getmax = VerifyNumberFragment.setMax;
            String str = this.getMax;
            boolean z = this.getMin;
            String str2 = this.setMin;
            VerifyNumberFragment verifyNumberFragment = new VerifyNumberFragment();
            Bundle bundle = new Bundle();
            bundle.putString("phoneNumber", str);
            bundle.putBoolean("isEditablePhoneNumber", z);
            bundle.putString("source", str2);
            verifyNumberFragment.setArguments(bundle);
            return verifyNumberFragment;
        } else if (this.IsOverlapping) {
            VerifyNumberFragment.getMax getmax2 = VerifyNumberFragment.setMax;
            boolean z2 = this.IsOverlapping;
            VerifyNumberFragment verifyNumberFragment2 = new VerifyNumberFragment();
            Bundle bundle2 = new Bundle();
            bundle2.putBoolean("FROM_LOGOUT", z2);
            verifyNumberFragment2.setArguments(bundle2);
            return verifyNumberFragment2;
        } else {
            VerifyNumberFragment.getMax getmax3 = VerifyNumberFragment.setMax;
            return new VerifyNumberFragment();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lid/dana/onboarding/verify/VerifyNumberKey$Companion;", "", "()V", "builder", "Lid/dana/onboarding/verify/VerifyNumberKey$Builder;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class length {
        private length() {
        }

        public /* synthetic */ length(byte b) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 2})
    public static class getMin implements Parcelable.Creator<VerifyNumberKey> {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new VerifyNumberKey[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, CurrencyTextView.DEFAULT_LANGUAGE_CODE);
            String readString = parcel.readString();
            boolean z = true;
            boolean z2 = parcel.readInt() != 0;
            String readString2 = parcel.readString();
            if (parcel.readInt() == 0) {
                z = false;
            }
            return new VerifyNumberKey(readString, z2, readString2, z);
        }
    }
}
