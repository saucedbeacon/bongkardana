package id.dana.home;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.GriverManifest;
import o.GriverShouldLoadUrlExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0012\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0003H\u0016J\b\u0010\u0010\u001a\u00020\u0003H\u0016¨\u0006\u0011"}, d2 = {"id/dana/home/HomeTabActivity$getKycAmlEddModule$1", "Lid/dana/kycamledd/KycAmlEddContract$View;", "dismissProgress", "", "onCheckAmlRequired", "kycAmlEddEnabled", "", "eddConsultModel", "Lid/dana/home/model/EddConsultModel;", "onError", "errorMessage", "", "onGetHashMapSize", "hashMapSize", "", "onSubmitKycAmlEdd", "showProgress", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class HomeTabActivity$Mean$Arithmetic implements GriverShouldLoadUrlExtension.AnonymousClass1.getMax {
    final /* synthetic */ HomeTabActivity length;

    public final void dismissProgress() {
    }

    public final void getMax(int i) {
    }

    public final void onError(@Nullable String str) {
    }

    public final void setMax() {
    }

    public final void showProgress() {
    }

    HomeTabActivity$Mean$Arithmetic(HomeTabActivity homeTabActivity) {
        this.length = homeTabActivity;
    }

    public final void setMax(boolean z, @NotNull GriverManifest.AnonymousClass6 r3) {
        Intrinsics.checkNotNullParameter(r3, "eddConsultModel");
        if (!z || !r3.setMin()) {
            this.length.nextOnboardingStep();
        } else {
            HomeTabActivity.access$showKycAmlEddDialog(this.length, r3);
        }
    }
}
