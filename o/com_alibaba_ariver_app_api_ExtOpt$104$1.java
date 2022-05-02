package o;

import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import java.net.URL;
import o.TitleBarRightButtonView;
import o.c;

final class com_alibaba_ariver_app_api_ExtOpt$104$1 implements updateProgress {
    private final NetworkRequest getMax;
    private final c.AnonymousClass1 getMin;
    private final ConnectivityManager length;
    private final URL setMax;
    private final String setMin;

    public com_alibaba_ariver_app_api_ExtOpt$104$1(c.AnonymousClass1 r1, URL url, String str, ConnectivityManager connectivityManager, NetworkRequest networkRequest) {
        this.getMin = r1;
        this.setMax = url;
        this.setMin = str;
        this.length = connectivityManager;
        this.getMax = networkRequest;
    }

    public final void subscribe(TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1.AnonymousClass1 r7) {
        this.getMin.lambda$initConnectivityManager$3(this.setMax, this.setMin, this.length, this.getMax, r7);
    }
}
