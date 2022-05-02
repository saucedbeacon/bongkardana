package o;

import android.content.Context;
import id.dana.R;
import id.dana.data.base.NetworkException;
import id.dana.di.PerActivity;
import javax.inject.Inject;
import kotlin.Unit;
import o.GriverAppXResourcePackage;
import o.MainResourcePackageWithoutVerify;
import o.WorkerParameters;
import o.isVerifFailed;

@PerActivity
public final class WorkManagerInitializer implements WorkerParameters.getMax {
    /* access modifiers changed from: private */
    public final WorkerParameters.length equals;
    MainResourcePackageWithoutVerify getMax;
    isVerifFailed getMin;
    private final GriverAppXResourcePackage isInside;
    private final GriverMainResourcePackage length;
    /* access modifiers changed from: private */
    public final getSharedPreferenceForApp setMax;
    setGeolocationEnabled setMin;
    /* access modifiers changed from: private */
    public final Context toIntRange;

    @Inject
    public WorkManagerInitializer(WorkerParameters.length length2, GriverMainResourcePackage griverMainResourcePackage, GriverAppXResourcePackage griverAppXResourcePackage, getSharedPreferenceForApp getsharedpreferenceforapp, Context context) {
        this.equals = length2;
        this.length = griverMainResourcePackage;
        this.isInside = griverAppXResourcePackage;
        this.setMax = getsharedpreferenceforapp;
        this.toIntRange = context;
    }

    public final void setMin() {
        this.equals.showProgress();
        this.setMin.execute(onReceivedIcon.INSTANCE, new WorkDatabase_Impl(this), new ConstraintProxy$BatteryChargingProxy(this));
    }

    public final void length(String str) {
        this.isInside.execute(new GriverAppVirtualHostProxy<Boolean>() {
            public final void onError(Throwable th) {
                super.onError(th);
                WorkManagerInitializer.this.equals.onError("");
            }

            public final /* synthetic */ void onNext(Object obj) {
                WorkerParameters.length unused = WorkManagerInitializer.this.equals;
            }
        }, GriverAppXResourcePackage.length.forReadInterstitialPromotionBanner(str));
    }

    public final void getMax() {
        this.getMin.execute(new GriverAppVirtualHostProxy(), isVerifFailed.getMin.forSaveInterstitialBannerGapTime(System.currentTimeMillis()));
    }

    public final void length() {
        this.getMax.execute(new GriverAppVirtualHostProxy(), MainResourcePackageWithoutVerify.setMax.forSaveInterstitialBannerResetTime(Long.valueOf(System.currentTimeMillis())));
    }

    public final void setMax() {
        this.length.dispose();
        this.isInside.dispose();
        this.getMin.dispose();
        this.getMax.dispose();
    }

    static /* synthetic */ Unit getMax(WorkManagerInitializer workManagerInitializer, Throwable th) {
        String str;
        workManagerInitializer.equals.dismissProgress();
        WorkerParameters.length length2 = workManagerInitializer.equals;
        Context context = workManagerInitializer.toIntRange;
        if (th instanceof NetworkException) {
            str = ((NetworkException) th).getMessage();
        } else {
            str = context.getString(R.string.general_error_msg);
        }
        length2.onError(str);
        workManagerInitializer.equals.setMin();
        return null;
    }

    static /* synthetic */ Unit getMax(WorkManagerInitializer workManagerInitializer, Boolean bool) {
        if (bool.booleanValue()) {
            workManagerInitializer.length.execute(new GriverAppVirtualHostProxy<GriverAMCSLiteAppUpdater>() {
                public final /* synthetic */ void onNext(Object obj) {
                    WorkManagerInitializer.this.equals.dismissProgress();
                    WorkManagerInitializer.this.equals.getMin((LoadingBridgeExtension) WorkManagerInitializer.this.setMax.apply((GriverAMCSLiteAppUpdater) obj));
                }

                public final void onError(Throwable th) {
                    String str;
                    super.onError(th);
                    WorkManagerInitializer.this.equals.dismissProgress();
                    WorkerParameters.length length = WorkManagerInitializer.this.equals;
                    Context max = WorkManagerInitializer.this.toIntRange;
                    if (th instanceof NetworkException) {
                        str = ((NetworkException) th).getMessage();
                    } else {
                        str = max.getString(R.string.general_error_msg);
                    }
                    length.onError(str);
                }
            });
            return null;
        }
        workManagerInitializer.equals.setMin();
        return null;
    }
}
