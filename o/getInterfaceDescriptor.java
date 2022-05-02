package o;

import a.a.a.b;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import kotlin.text.Typography;
import o.ICustomTabsCallback;

public class getInterfaceDescriptor {
    public static final Object getMin = new setMin((byte) 0);
    public Map setMax;

    static final class setMin {
        /* access modifiers changed from: protected */
        public final Object clone() {
            return this;
        }

        public final boolean equals(Object obj) {
            return obj == null || obj == this;
        }

        public final String toString() {
            return "null";
        }

        private setMin() {
        }

        /* synthetic */ setMin(byte b) {
            this();
        }
    }

    public getInterfaceDescriptor() {
        this.setMax = new HashMap();
    }

    public getInterfaceDescriptor(ICustomTabsCallback.Stub.Proxy proxy) {
        this();
        if (proxy.setMax() == '{') {
            while (true) {
                char max = proxy.setMax();
                if (max == 0) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("A JSONObject text must end with '}'");
                    sb.append(proxy.toString());
                    throw new b(sb.toString());
                } else if (max != '}') {
                    proxy.getMin();
                    String obj = proxy.length().toString();
                    char max2 = proxy.setMax();
                    if (max2 == '=') {
                        if (proxy.setMin() != '>') {
                            proxy.getMin();
                        }
                    } else if (max2 != ':') {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Expected a ':' after a key");
                        sb2.append(proxy.toString());
                        throw new b(sb2.toString());
                    }
                    Object length = proxy.length();
                    if (obj != null) {
                        if (length != null) {
                            getMin(length);
                            this.setMax.put(obj, length);
                        } else {
                            this.setMax.remove(obj);
                        }
                        char max3 = proxy.setMax();
                        if (max3 == ',' || max3 == ';') {
                            if (proxy.setMax() != '}') {
                                proxy.getMin();
                            } else {
                                return;
                            }
                        } else if (max3 != '}') {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("Expected a ',' or '}'");
                            sb3.append(proxy.toString());
                            throw new b(sb3.toString());
                        } else {
                            return;
                        }
                    } else {
                        throw new b("Null key.");
                    }
                } else {
                    return;
                }
            }
        } else {
            StringBuilder sb4 = new StringBuilder();
            sb4.append("A JSONObject text must begin with '{'");
            sb4.append(proxy.toString());
            throw new b(sb4.toString());
        }
    }

    public getInterfaceDescriptor(Map map) {
        this.setMax = map == null ? new HashMap() : map;
    }

    public getInterfaceDescriptor(String str) {
        this(new ICustomTabsCallback.Stub.Proxy(str));
    }

    public static String setMin(String str) {
        if (str == null || str.length() == 0) {
            return "\"\"";
        }
        int length = str.length();
        StringBuffer stringBuffer = new StringBuffer(length + 4);
        stringBuffer.append(Typography.quote);
        int i = 0;
        char c = 0;
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt == 12) {
                stringBuffer.append("\\f");
            } else if (charAt != 13) {
                if (charAt != '\"') {
                    if (charAt != '/') {
                        if (charAt != '\\') {
                            switch (charAt) {
                                case 8:
                                    stringBuffer.append("\\b");
                                    break;
                                case 9:
                                    stringBuffer.append("\\t");
                                    break;
                                case 10:
                                    stringBuffer.append("\\n");
                                    break;
                                default:
                                    if (charAt >= ' ' && ((charAt < 128 || charAt >= 160) && (charAt < 8192 || charAt >= 8448))) {
                                        stringBuffer.append(charAt);
                                        break;
                                    } else {
                                        StringBuilder sb = new StringBuilder("000");
                                        sb.append(Integer.toHexString(charAt));
                                        String obj = sb.toString();
                                        StringBuilder sb2 = new StringBuilder("\\u");
                                        sb2.append(obj.substring(obj.length() - 4));
                                        stringBuffer.append(sb2.toString());
                                        break;
                                    }
                                    break;
                            }
                        }
                    } else {
                        if (c == '<') {
                            stringBuffer.append('\\');
                        }
                        stringBuffer.append(charAt);
                    }
                }
                stringBuffer.append('\\');
                stringBuffer.append(charAt);
            } else {
                stringBuffer.append("\\r");
            }
            i++;
            c = charAt;
        }
        stringBuffer.append(Typography.quote);
        return stringBuffer.toString();
    }

    private static void getMin(Object obj) {
        if (obj == null) {
            return;
        }
        if (obj instanceof Double) {
            Double d = (Double) obj;
            if (d.isInfinite() || d.isNaN()) {
                throw new b("JSON does not allow non-finite numbers.");
            }
        } else if (obj instanceof Float) {
            Float f = (Float) obj;
            if (f.isInfinite() || f.isNaN()) {
                throw new b("JSON does not allow non-finite numbers.");
            }
        }
    }

    static String getMax(Object obj) {
        if (obj == null || obj.equals((Object) null)) {
            return "null";
        }
        if (obj instanceof Number) {
            Number number = (Number) obj;
            if (number != null) {
                getMin(number);
                String obj2 = number.toString();
                if (obj2.indexOf(46) <= 0 || obj2.indexOf(101) >= 0 || obj2.indexOf(69) >= 0) {
                    return obj2;
                }
                while (obj2.endsWith("0")) {
                    obj2 = obj2.substring(0, obj2.length() - 1);
                }
                return obj2.endsWith(".") ? obj2.substring(0, obj2.length() - 1) : obj2;
            }
            throw new b("Null pointer");
        } else if ((obj instanceof Boolean) || (obj instanceof getInterfaceDescriptor) || (obj instanceof isInside)) {
            return obj.toString();
        } else {
            if (obj instanceof Map) {
                return new getInterfaceDescriptor((Map) obj).toString();
            }
            if (obj instanceof Collection) {
                return new isInside((Collection) obj).toString();
            }
            if (obj.getClass().isArray()) {
                return new isInside(obj).toString();
            }
            return setMin(obj.toString());
        }
    }

    public final Object length(String str) {
        Object obj;
        if (str == null) {
            obj = null;
        } else {
            obj = this.setMax.get(str);
        }
        if (obj != null) {
            return obj;
        }
        StringBuilder sb = new StringBuilder("JSONObject[");
        sb.append(setMin(str));
        sb.append("] not found.");
        throw new b(sb.toString());
    }

    public String toString() {
        try {
            StringBuffer stringBuffer = new StringBuffer("{");
            for (Object next : this.setMax.keySet()) {
                if (stringBuffer.length() > 1) {
                    stringBuffer.append(',');
                }
                stringBuffer.append(setMin(next.toString()));
                stringBuffer.append(':');
                stringBuffer.append(getMax(this.setMax.get(next)));
            }
            stringBuffer.append('}');
            return stringBuffer.toString();
        } catch (Exception unused) {
            return null;
        }
    }
}
