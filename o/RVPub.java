package o;

import android.text.TextUtils;
import com.alipay.iap.android.aplog.core.LoggerFactory;
import com.alipay.iap.android.aplog.log.behavior.BehaviourLog;
import com.alipay.iap.android.f2fpay.extension.IF2FPayLogger;
import java.util.Map;

public final class RVPub implements IF2FPayLogger {
    public final void event(String str, Map<String, String> map) {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(1501497909, oncanceled);
            onCancelLoad.getMin(1501497909, oncanceled);
        }
        if (!TextUtils.isEmpty(str)) {
            StringBuilder sb = new StringBuilder();
            sb.append("behavior_log,eventId:");
            sb.append(str);
            sb.append(",");
            if (map != null) {
                BehaviourLog behaviourLog = new BehaviourLog();
                for (Map.Entry next : map.entrySet()) {
                    if (next != null) {
                        behaviourLog.putExtParam((String) next.getKey(), (String) next.getValue());
                        sb.append((String) next.getKey());
                        sb.append(":");
                        sb.append((String) next.getValue());
                        sb.append(",");
                    }
                }
                behaviourLog.setSeedID(str);
                behaviourLog.setSourceID("sourceID");
                LoggerFactory.getLogContext().appendLog(behaviourLog);
                updateActionSheetContent.i("F2FPayLoggerImpl", sb.toString());
            }
        }
    }
}
