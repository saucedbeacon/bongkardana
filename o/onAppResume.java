package o;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.WorkerThread;
import com.alipay.alipaysecuritysdk.apdid.face.APSecuritySdk;
import com.alipay.alipaysecuritysdk.apdid.face.Configuration;
import java.util.HashMap;
import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class onAppResume {
    private final Context context;
    private final getPerformanceTracker deviceInformationProvider;
    private final setMax listener;

    @Inject
    public onAppResume(Context context2, getPerformanceTracker getperformancetracker) {
        this.context = context2;
        this.deviceInformationProvider = getperformancetracker;
        this.listener = new setMax(context2, (byte) 0);
        init();
    }

    @WorkerThread
    public void init() {
        APSecuritySdk.getInstance(this.context).setConfiguration(Configuration.getConfiguration(Configuration.Locale.Indonesia, 0));
        HashMap hashMap = new HashMap();
        hashMap.put("tid", this.deviceInformationProvider.generateDeviceId());
        APSecuritySdk.getInstance(this.context).initToken(hashMap, this.listener);
    }

    public String getApdidToken() {
        return APSecuritySdk.getInstance(this.context).getTokenResult().apdidToken;
    }

    public String getApdid() {
        return APSecuritySdk.getInstance(this.context).getTokenResult().apdid;
    }

    public String getUmidToken() {
        return APSecuritySdk.getInstance(this.context).getTokenResult().umidToken;
    }

    public String getClientKey() {
        return APSecuritySdk.getInstance(this.context).getTokenResult().clientKey;
    }

    static class setMax implements APSecuritySdk.InitResultListener {
        private Context getMax;

        /* synthetic */ setMax(Context context, byte b) {
            this(context);
        }

        private setMax(Context context) {
            this.getMax = context;
        }

        public void onResult(APSecuritySdk.TokenResult tokenResult) {
            if (tokenResult != null && !TextUtils.isEmpty(tokenResult.apdidToken)) {
                setOnItemClickListener.length();
                setOnItemClickListener.getMin(this.getMax, tokenResult.apdidToken);
            }
        }
    }
}
