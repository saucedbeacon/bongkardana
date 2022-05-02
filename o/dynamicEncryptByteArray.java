package o;

import io.split.android.client.factory.FactoryMonitor;
import java.util.HashMap;
import java.util.Map;

public final class dynamicEncryptByteArray implements FactoryMonitor {
    private static FactoryMonitor sharedInstance;
    private Map<String, Integer> factories = new HashMap();

    public static FactoryMonitor getSharedInstance() {
        if (sharedInstance == null) {
            sharedInstance = new dynamicEncryptByteArray();
        }
        return sharedInstance;
    }

    public final synchronized int count() {
        int i;
        i = 0;
        for (Integer intValue : this.factories.values()) {
            i += intValue.intValue();
        }
        return i;
    }

    public final synchronized int count(String str) {
        Integer num = this.factories.get(str);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public final synchronized void add(String str) {
        Integer num = this.factories.get(str);
        this.factories.put(str, Integer.valueOf((num != null ? num.intValue() : 0) + 1));
    }

    public final synchronized void remove(String str) {
        Integer num = this.factories.get(str);
        int intValue = (num != null ? num.intValue() : 0) - 1;
        if (intValue > 0) {
            this.factories.put(str, Integer.valueOf(intValue));
        } else {
            this.factories.remove(str);
        }
    }
}
