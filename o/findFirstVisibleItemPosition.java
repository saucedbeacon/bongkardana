package o;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.json.JSONException;
import org.json.JSONObject;

public final class findFirstVisibleItemPosition {
    public final ConcurrentMap<String, length> getMax = new ConcurrentHashMap();
    private final List<getMin> getMin = new ArrayList();
    private final ConcurrentMap<String, length> setMax = new ConcurrentHashMap();
    private final ConcurrentMap<String, length> setMin = new ConcurrentHashMap();

    public interface getMin {
    }

    public final synchronized void getMin(getMin getmin) {
        this.getMin.add(getmin);
    }

    public final synchronized void getMin(String str, Object obj) {
        if (!this.setMin.containsKey(str)) {
            findOnePartiallyOrCompletelyInvisibleChild.isInside();
            return;
        }
        length length2 = (length) this.setMin.get(str);
        this.setMin.put(str, new length(length2.getMax, length2.length, length2.setMax, length2.getMin, obj, length2.toIntRange));
    }

    public final synchronized boolean length(String str, Object obj) {
        if (!this.setMin.containsKey(str)) {
            return false;
        }
        if (!((length) this.setMin.get(str)).setMin.equals(obj)) {
            return true;
        }
        return false;
    }

    public final synchronized Map<String, length> getMin() {
        return new HashMap(this.setMin);
    }

    public final synchronized Map<String, length> setMax() {
        return new HashMap(this.setMax);
    }

    public static class length {
        public final int getMax;
        public final Number getMin;
        public final Object length;
        public final Number setMax;
        public final Object setMin;
        final String toIntRange;

        length(int i, Object obj, Number number, Number number2, Object obj2, String str) {
            this.getMax = i;
            this.toIntRange = str;
            this.setMax = number;
            this.getMin = number2;
            if (!(number == null || number2 == null)) {
                if (!setMin(obj)) {
                    obj = Long.valueOf(Math.min(Math.max(((Number) obj).longValue(), this.setMax.longValue()), this.getMin.longValue()));
                    findOnePartiallyOrCompletelyInvisibleChild.isInside();
                }
                if (!setMin(obj2)) {
                    obj2 = Long.valueOf(Math.min(Math.max(((Number) obj2).longValue(), this.setMax.longValue()), this.getMin.longValue()));
                    StringBuilder sb = new StringBuilder("Attempt to define a tweak \"");
                    sb.append(this.toIntRange);
                    sb.append("\" with value ");
                    sb.append(obj);
                    sb.append(" out of its bounds [");
                    sb.append(this.setMax);
                    sb.append(", ");
                    sb.append(this.getMin);
                    sb.append("]Tweak \"");
                    sb.append(this.toIntRange);
                    sb.append("\" new value: ");
                    sb.append(obj2);
                    sb.append(".");
                    findOnePartiallyOrCompletelyInvisibleChild.isInside();
                }
            }
            this.length = obj;
            this.setMin = obj2;
        }

        private boolean setMin(Object obj) {
            try {
                Number number = (Number) obj;
                return (Math.min(Math.max(number.longValue(), this.setMax.longValue()), this.getMin.longValue()) == this.setMax.longValue() || Math.min(Math.max(number.longValue(), this.setMax.longValue()), this.getMin.longValue()) == this.getMin.longValue()) ? false : true;
            } catch (ClassCastException unused) {
                return true;
            }
        }

        public final String getMin() {
            String str;
            try {
                str = (String) this.length;
            } catch (ClassCastException unused) {
                str = null;
            }
            try {
                return (String) this.setMin;
            } catch (ClassCastException unused2) {
                return str;
            }
        }

        public final Number getMax() {
            int i = 0;
            Object obj = this.length;
            if (obj != null) {
                try {
                    i = (Number) obj;
                } catch (ClassCastException unused) {
                }
            }
            Object obj2 = this.setMin;
            if (obj2 == null) {
                return i;
            }
            try {
                return (Number) obj2;
            } catch (ClassCastException unused2) {
                return i;
            }
        }

        public final Boolean length() {
            Boolean bool = Boolean.FALSE;
            Object obj = this.length;
            if (obj != null) {
                try {
                    bool = (Boolean) obj;
                } catch (ClassCastException unused) {
                }
            }
            Object obj2 = this.setMin;
            if (obj2 == null) {
                return bool;
            }
            try {
                return (Boolean) obj2;
            } catch (ClassCastException unused2) {
                return bool;
            }
        }

        public static length setMax(JSONObject jSONObject) {
            Boolean bool;
            Double d;
            Number number;
            Boolean bool2;
            int i;
            Number number2;
            Object obj;
            Object obj2;
            int i2;
            try {
                String string = jSONObject.getString("name");
                String string2 = jSONObject.getString("type");
                if ("number".equals(string2)) {
                    String string3 = jSONObject.getString("encoding");
                    if ("d".equals(string3)) {
                        i2 = 2;
                        obj2 = Double.valueOf(jSONObject.getDouble("value"));
                        obj = Double.valueOf(jSONObject.getDouble("default"));
                        number2 = !jSONObject.isNull("minimum") ? Double.valueOf(jSONObject.getDouble("minimum")) : null;
                        if (!jSONObject.isNull("maximum")) {
                            d = Double.valueOf(jSONObject.getDouble("maximum"));
                            bool = obj2;
                            number = number2;
                            bool2 = obj;
                            i = 2;
                        }
                    } else if (!"l".equals(string3)) {
                        return null;
                    } else {
                        obj2 = Long.valueOf(jSONObject.getLong("value"));
                        i2 = 3;
                        obj = Long.valueOf(jSONObject.getLong("default"));
                        number2 = !jSONObject.isNull("minimum") ? Long.valueOf(jSONObject.getLong("minimum")) : null;
                        if (!jSONObject.isNull("maximum")) {
                            d = Long.valueOf(jSONObject.getLong("maximum"));
                            bool = obj2;
                            number = number2;
                            bool2 = obj;
                            i = 3;
                        }
                    }
                    d = null;
                    bool = obj2;
                    number = number2;
                    bool2 = obj;
                    i = i2;
                } else if ("boolean".equals(string2)) {
                    Boolean valueOf = Boolean.valueOf(jSONObject.getBoolean("value"));
                    bool2 = Boolean.valueOf(jSONObject.getBoolean("default"));
                    number = null;
                    d = null;
                    bool = valueOf;
                    i = 1;
                } else {
                    if ("string".equals(string2)) {
                        String string4 = jSONObject.getString("value");
                        bool2 = jSONObject.getString("default");
                        number = null;
                        d = null;
                        bool = string4;
                        i = 4;
                    }
                    return null;
                }
                return new length(i, bool2, number, d, bool, string);
            } catch (JSONException unused) {
            }
        }
    }

    findFirstVisibleItemPosition() {
    }
}
