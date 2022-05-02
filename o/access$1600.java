package o;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.common.net.HttpHeaders;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class access$1600 implements access$1800 {
    private volatile Map<String, String> getMin;
    private final Map<String, List<access$1500>> setMin;

    access$1600(Map<String, List<access$1500>> map) {
        this.setMin = Collections.unmodifiableMap(map);
    }

    public final Map<String, String> getMin() {
        if (this.getMin == null) {
            synchronized (this) {
                if (this.getMin == null) {
                    HashMap hashMap = new HashMap();
                    for (Map.Entry next : this.setMin.entrySet()) {
                        String min = setMin((List) next.getValue());
                        if (!TextUtils.isEmpty(min)) {
                            hashMap.put(next.getKey(), min);
                        }
                    }
                    this.getMin = Collections.unmodifiableMap(hashMap);
                }
            }
        }
        return this.getMin;
    }

    @NonNull
    private static String setMin(@NonNull List<access$1500> list) {
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            String length2 = list.get(i).length();
            if (!TextUtils.isEmpty(length2)) {
                sb.append(length2);
                if (i != list.size() - 1) {
                    sb.append(',');
                }
            }
        }
        return sb.toString();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LazyHeaders{headers=");
        sb.append(this.setMin);
        sb.append('}');
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof access$1600) {
            return this.setMin.equals(((access$1600) obj).setMin);
        }
        return false;
    }

    public final int hashCode() {
        return this.setMin.hashCode();
    }

    static final class getMin implements access$1500 {
        @NonNull
        private final String length;

        getMin(@NonNull String str) {
            this.length = str;
        }

        public final String length() {
            return this.length;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("StringHeaderFactory{value='");
            sb.append(this.length);
            sb.append('\'');
            sb.append('}');
            return sb.toString();
        }

        public final boolean equals(Object obj) {
            if (obj instanceof getMin) {
                return this.length.equals(((getMin) obj).length);
            }
            return false;
        }

        public final int hashCode() {
            return this.length.hashCode();
        }
    }

    public static final class length {
        private static final Map<String, List<access$1500>> getMax;
        private static final String setMin;
        Map<String, List<access$1500>> getMin = getMax;
        boolean length = true;
        private boolean setMax = true;

        static {
            String property = System.getProperty("http.agent");
            if (!TextUtils.isEmpty(property)) {
                int length2 = property.length();
                StringBuilder sb = new StringBuilder(property.length());
                for (int i = 0; i < length2; i++) {
                    char charAt = property.charAt(i);
                    if ((charAt > 31 || charAt == 9) && charAt < 127) {
                        sb.append(charAt);
                    } else {
                        sb.append('?');
                    }
                }
                property = sb.toString();
            }
            setMin = property;
            HashMap hashMap = new HashMap(2);
            if (!TextUtils.isEmpty(setMin)) {
                hashMap.put(HttpHeaders.USER_AGENT, Collections.singletonList(new getMin(setMin)));
            }
            getMax = Collections.unmodifiableMap(hashMap);
        }
    }
}
