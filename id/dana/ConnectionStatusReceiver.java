package id.dana;

import android.app.Activity;
import android.app.Dialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import butterknife.ButterKnife;
import com.alipay.iap.android.common.utils.NetworkUtils;
import id.dana.R;
import javax.inject.Inject;
import o.GriverAppVirtualHostProxy;
import o.GriverManifest;
import o.applyChanges;
import o.copyBackForwardList;
import o.setTopBackgroundColor;

public class ConnectionStatusReceiver extends BroadcastReceiver {
    private final copyBackForwardList getMax;
    /* access modifiers changed from: private */
    public GriverManifest.AnonymousClass20 setMin;
    public final applyChanges sslPinningRepository;

    @Inject
    public ConnectionStatusReceiver(applyChanges applychanges, copyBackForwardList copybackforwardlist) {
        this.sslPinningRepository = applychanges;
        this.getMax = copybackforwardlist;
    }

    public void onReceive(final Context context, Intent intent) {
        final boolean isNetworkAvailable = NetworkUtils.isNetworkAvailable(context);
        if (isNetworkAvailable && !this.sslPinningRepository.isSslPinningSuccess().booleanValue()) {
            this.sslPinningRepository.pinCertificates().subscribe();
        }
        this.getMax.execute(new GriverAppVirtualHostProxy<Boolean>() {
            public final /* synthetic */ void onNext(Object obj) {
                if (!((Boolean) obj).booleanValue() && ConnectionStatusReceiver.setMax(context)) {
                    if (!isNetworkAvailable) {
                        if (ConnectionStatusReceiver.this.setMin == null) {
                            GriverManifest.AnonymousClass20 unused = ConnectionStatusReceiver.this.setMin = new Dialog(context) {
                                public void onBackPressed() {
                                }

                                /* access modifiers changed from: protected */
                                public void onCreate(Bundle bundle) {
                                    super.onCreate(bundle);
                                    setContentView(R.layout.dialog_home_error);
                                    ButterKnife.getMax(this);
                                }
                            };
                            ConnectionStatusReceiver.this.setMin.setCanceledOnTouchOutside(false);
                        }
                        ConnectionStatusReceiver.this.setMin.show();
                    } else if (ConnectionStatusReceiver.this.setMin != null) {
                        ConnectionStatusReceiver.this.setMin.dismiss();
                    }
                }
            }
        });
    }

    /* access modifiers changed from: private */
    public static boolean setMax(Context context) {
        return (context instanceof Activity) && setTopBackgroundColor.getMin(context);
    }
}
