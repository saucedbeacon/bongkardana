package o;

import android.content.Context;
import android.text.TextUtils;
import id.dana.R;
import id.dana.data.foundation.logger.log.DanaLogConstants;
import id.dana.di.PerActivity;
import javax.inject.Inject;
import o.getDefaultVideoPoster;
import o.getTransitionProperties;

@PerActivity
public final class matchInstances implements getTransitionProperties.setMin {
    /* access modifiers changed from: private */
    public final Context getMax;
    /* access modifiers changed from: private */
    public final getTransitionProperties.setMax getMin;
    private final getDefaultVideoPoster length;

    @Inject
    public matchInstances(Context context, getDefaultVideoPoster getdefaultvideoposter, getTransitionProperties.setMax setmax) {
        this.getMax = context;
        this.length = getdefaultvideoposter;
        this.getMin = setmax;
    }

    public final void getMin(String str, String str2, String str3, boolean z) {
        if (TextUtils.isEmpty(str)) {
            this.getMin.showProgress();
        }
        getDefaultVideoPoster.getMin forParams = getDefaultVideoPoster.getMin.forParams(str, str2, str3, z);
        StringBuilder sb = new StringBuilder(DanaLogConstants.Prefix.DEEPLINK_PROFILE_QR);
        sb.append(getClass().getName());
        sb.append("generateProfileQrDeepLink Params ");
        sb.append(forParams.toString());
        updateActionSheetContent.d(DanaLogConstants.TAG.QRCODE_TAG, sb.toString());
        this.length.execute(new GriverAppVirtualHostProxy<APWebSettings>() {
            public final /* synthetic */ void onNext(Object obj) {
                APWebSettings aPWebSettings = (APWebSettings) obj;
                if (!TextUtils.isEmpty(aPWebSettings.getLink())) {
                    matchInstances.this.getMin.dismissProgress();
                    StringBuilder sb = new StringBuilder(DanaLogConstants.Prefix.DEEPLINK_PROFILE_QR);
                    sb.append(getClass().getName());
                    sb.append("onNext");
                    sb.append(aPWebSettings.getLink());
                    updateActionSheetContent.d(DanaLogConstants.TAG.QRCODE_TAG, sb.toString());
                    matchInstances.this.getMin.setMax(aPWebSettings.getLink());
                    return;
                }
                matchInstances.this.getMin.getMin();
                StringBuilder sb2 = new StringBuilder(DanaLogConstants.Prefix.DEEPLINK_PROFILE_QR);
                sb2.append(getClass().getName());
                sb2.append("Retry Deeplink");
                updateActionSheetContent.d(DanaLogConstants.TAG.QRCODE_TAG, sb2.toString());
            }

            public final void onError(Throwable th) {
                super.onError(th);
                matchInstances.this.getMin.dismissProgress();
                StringBuilder sb = new StringBuilder(DanaLogConstants.Prefix.STATIC_QRCODE_PREFIX);
                sb.append(getClass().getName());
                sb.append("onError");
                updateActionSheetContent.e(DanaLogConstants.TAG.QRCODE_TAG, sb.toString(), th);
                matchInstances.this.getMin.onError(matchInstances.this.getMax.getString(R.string.failed_generate_url));
            }
        }, forParams);
    }

    public final void setMax() {
        this.length.dispose();
    }
}
