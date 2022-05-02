package o;

import android.content.Context;
import id.dana.R;
import id.dana.data.base.NetworkException;
import javax.inject.Inject;
import o.getDataType;

public final class APTakePictureOption implements getDataType.setMax {
    /* access modifiers changed from: private */
    public final getDataType.getMax getMax;
    private final AppXResourcePackageWithoutVerify getMin;
    private final getJavaScriptCanOpenWindowsAutomatically length;
    /* access modifiers changed from: private */
    public final StorageBridgeExtension setMax;
    /* access modifiers changed from: private */
    public final Context setMin;

    @Inject
    public APTakePictureOption(Context context, getDataType.getMax getmax, AppXResourcePackageWithoutVerify appXResourcePackageWithoutVerify, getJavaScriptCanOpenWindowsAutomatically getjavascriptcanopenwindowsautomatically, StorageBridgeExtension storageBridgeExtension) {
        this.setMin = context;
        this.getMax = getmax;
        this.getMin = appXResourcePackageWithoutVerify;
        this.length = getjavascriptcanopenwindowsautomatically;
        this.setMax = storageBridgeExtension;
    }

    public final void getMax() {
        this.getMax.showProgress();
        this.getMin.execute(new GriverAppVirtualHostProxy<GriverAMCSLiteAppUpdater>() {
            public final /* synthetic */ void onNext(Object obj) {
                GriverAMCSLiteAppUpdater griverAMCSLiteAppUpdater = (GriverAMCSLiteAppUpdater) obj;
                if (griverAMCSLiteAppUpdater.getCdpContents() != null) {
                    APTakePictureOption.this.getMax.onGetLeaderBoardSuccess(((internalAPI) APTakePictureOption.this.setMax.apply(griverAMCSLiteAppUpdater)).setMin);
                }
            }

            public final void onError(Throwable th) {
                String str;
                getDataType.getMax min = APTakePictureOption.this.getMax;
                Context min2 = APTakePictureOption.this.setMin;
                if (th instanceof NetworkException) {
                    str = ((NetworkException) th).getMessage();
                } else {
                    str = min2.getString(R.string.general_error_msg);
                }
                min.onError(str);
            }
        });
    }

    public final void length() {
        this.length.execute(new GriverAppVirtualHostProxy<Boolean>() {
            public final /* synthetic */ void onNext(Object obj) {
                APTakePictureOption.this.getMax.onCheckLeaderBoardFeatureSuccess(((Boolean) obj).booleanValue());
            }
        });
    }

    public final void setMin() {
        this.getMax.dismissProgress();
    }

    public final void setMax() {
        this.getMin.dispose();
        this.length.dispose();
    }
}
