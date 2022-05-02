package id.dana.home.view;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class QrRefreshNotification extends BroadcastReceiver {
    public static final String ACTION = "qr.refresh";
    public static final String DATA = "DATA";
    public static final String STATE = "STATE";
    private final ZoomDialog setMax;

    @Retention(RetentionPolicy.SOURCE)
    public @interface StateType {
        public static final String DISMISSPROGRESS = "DISMISSPROGRESS";
        public static final String ERROR = "ERROR";
        public static final String FAILED = "FAILED";
        public static final String ONPAUSED = "ONPAUSED";
        public static final String ONSTOPPED = "ONSTOPPED";
        public static final String SHOWPROGRESS = "SHOWPROGRESS";
        public static final String SUCCESS = "SUCCESS";
    }

    public QrRefreshNotification(ZoomDialog zoomDialog) {
        this.setMax = zoomDialog;
    }

    public void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals(ACTION)) {
            String string = intent.getExtras().getString(STATE);
            char c = 65535;
            switch (string.hashCode()) {
                case -1717442921:
                    if (string.equals(StateType.DISMISSPROGRESS)) {
                        c = 5;
                        break;
                    }
                    break;
                case -1193118771:
                    if (string.equals(StateType.ONPAUSED)) {
                        c = 2;
                        break;
                    }
                    break;
                case -1149187101:
                    if (string.equals("SUCCESS")) {
                        c = 0;
                        break;
                    }
                    break;
                case 66247144:
                    if (string.equals("ERROR")) {
                        c = 6;
                        break;
                    }
                    break;
                case 399587370:
                    if (string.equals(StateType.SHOWPROGRESS)) {
                        c = 4;
                        break;
                    }
                    break;
                case 573901550:
                    if (string.equals(StateType.ONSTOPPED)) {
                        c = 3;
                        break;
                    }
                    break;
                case 2066319421:
                    if (string.equals("FAILED")) {
                        c = 1;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    this.setMax.displayQrImage(intent.getExtras().getString(DATA));
                    return;
                case 1:
                    this.setMax.finish();
                    return;
                case 2:
                    this.setMax.finish();
                    return;
                case 3:
                    this.setMax.finish();
                    return;
                case 4:
                case 5:
                    return;
                case 6:
                    this.setMax.finish();
                    return;
                default:
                    this.setMax.finish();
                    return;
            }
        }
    }
}
