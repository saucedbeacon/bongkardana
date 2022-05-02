package id.dana.data.risk.riskevent;

import android.content.ComponentName;
import androidx.annotation.NonNull;
import id.dana.data.risk.riskevent.sharetextbroadcast.ShareTextBroadcastReceiver;
import javax.inject.Inject;
import javax.inject.Singleton;
import o.GriverAppVirtualHostProxy;
import o.RVDownloadRequest;
import o.addDownload;

@Singleton
public class SendRiskEventReceiver extends ShareTextBroadcastReceiver {
    private static final String LUCKYMONEY = "LUCKYMONEY";
    private final addDownload sendRiskEventEntityRepository;

    @Inject
    public SendRiskEventReceiver(addDownload adddownload) {
        this.sendRiskEventEntityRepository = adddownload;
    }

    public void doAction(RVDownloadRequest rVDownloadRequest, @NonNull ComponentName componentName, @NonNull String str, String str2) {
        if (LUCKYMONEY.equalsIgnoreCase(str2)) {
            sendRiskLuckyMoney(rVDownloadRequest, componentName, str);
        }
    }

    private void sendRiskLuckyMoney(final RVDownloadRequest rVDownloadRequest, ComponentName componentName, String str) {
        this.sendRiskEventEntityRepository.sendRiskEvent(componentName.getClassName(), str, "").subscribe(new GriverAppVirtualHostProxy<Boolean>() {
            public final void onError(Throwable th) {
                super.onError(th);
                rVDownloadRequest.onReceive(false);
            }

            public final /* synthetic */ void onNext(Object obj) {
                RVDownloadRequest rVDownloadRequest = rVDownloadRequest;
                if (rVDownloadRequest != null) {
                    rVDownloadRequest.onReceive(true);
                }
            }
        });
    }
}
