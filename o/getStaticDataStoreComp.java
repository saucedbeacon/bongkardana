package o;

import io.split.android.client.EventPropertiesProcessor;
import java.util.HashMap;
import java.util.Map;

public final class getStaticDataStoreComp implements EventPropertiesProcessor {
    private static final int MAXIMUM_EVENT_PROPERTY_BYTES = setTransparentForImageView.getInstance().getMaximumEventPropertyBytes();
    private static final int MAX_PROPS_COUNT = 300;
    private static final String VALIDATION_TAG = "track";

    public final getSafeTokenComp process(Map<String, Object> map) {
        int i = 0;
        if (map == null) {
            return new getSafeTokenComp(true, (Map<String, Object>) null, 0);
        }
        if (map.size() > 300) {
            createLoadingDialog.w("trackEvent has more than 300 properties. Some of them will be trimmed when processed");
        }
        HashMap hashMap = new HashMap(map);
        for (Map.Entry next : map.entrySet()) {
            Object value = next.getValue();
            String obj = next.getKey().toString();
            if (value != null && isInvalidValueType(value)) {
                hashMap.put(obj, (Object) null);
            }
            i += calculateEventSizeInBytes(obj, value);
            if (i > MAXIMUM_EVENT_PROPERTY_BYTES) {
                StringBuilder sb = new StringBuilder("trackThe maximum size allowed for the  properties is 32kb. Current is ");
                sb.append(obj);
                sb.append(". Event not queued");
                createLoadingDialog.w(sb.toString());
                return getSafeTokenComp.InvalidProperties();
            }
        }
        return new getSafeTokenComp(true, hashMap, i);
    }

    private boolean isInvalidValueType(Object obj) {
        return !(obj instanceof Number) && !(obj instanceof Boolean) && !(obj instanceof String);
    }

    private int calculateEventSizeInBytes(String str, Object obj) {
        return ((obj == null || obj.getClass() != String.class) ? 0 : obj.toString().getBytes().length) + str.getBytes().length;
    }
}
