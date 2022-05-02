package o;

import a.a.a.b;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import o.ICustomTabsCallback;

public class isInside {
    public ArrayList setMin;

    public isInside() {
        this.setMin = new ArrayList();
    }

    public isInside(ICustomTabsCallback.Stub.Proxy proxy) {
        this();
        char c;
        char max;
        char max2 = proxy.setMax();
        if (max2 == '[') {
            c = ']';
        } else if (max2 == '(') {
            c = ')';
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("A JSONArray text must start with '['");
            sb.append(proxy.toString());
            throw new b(sb.toString());
        }
        if (proxy.setMax() != ']') {
            proxy.getMin();
            while (true) {
                if (proxy.setMax() == ',') {
                    proxy.getMin();
                    this.setMin.add((Object) null);
                } else {
                    proxy.getMin();
                    this.setMin.add(proxy.length());
                }
                max = proxy.setMax();
                if (max == ')') {
                    break;
                } else if (max == ',' || max == ';') {
                    if (proxy.setMax() != ']') {
                        proxy.getMin();
                    } else {
                        return;
                    }
                } else if (max != ']') {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Expected a ',' or ']'");
                    sb2.append(proxy.toString());
                    throw new b(sb2.toString());
                }
            }
            if (c != max) {
                StringBuilder sb3 = new StringBuilder("Expected a '");
                sb3.append(Character.valueOf(c));
                sb3.append("'");
                String obj = sb3.toString();
                StringBuilder sb4 = new StringBuilder();
                sb4.append(obj);
                sb4.append(proxy.toString());
                throw new b(sb4.toString());
            }
        }
    }

    public isInside(String str) {
        this(new ICustomTabsCallback.Stub.Proxy(str));
    }

    public isInside(Collection collection) {
        this.setMin = collection == null ? new ArrayList() : new ArrayList(collection);
    }

    public isInside(Object obj) {
        this();
        if (obj.getClass().isArray()) {
            int length = Array.getLength(obj);
            for (int i = 0; i < length; i++) {
                this.setMin.add(Array.get(obj, i));
            }
            return;
        }
        throw new b("JSONArray initial value should be a string or collection or array.");
    }

    public String toString() {
        try {
            StringBuilder sb = new StringBuilder("[");
            sb.append(length(","));
            sb.append(']');
            return sb.toString();
        } catch (Exception unused) {
            return null;
        }
    }

    public final Object getMax(int i) {
        Object obj = (i < 0 || i >= this.setMin.size()) ? null : this.setMin.get(i);
        if (obj != null) {
            return obj;
        }
        StringBuilder sb = new StringBuilder("JSONArray[");
        sb.append(i);
        sb.append("] not found.");
        throw new b(sb.toString());
    }

    private String length(String str) {
        int size = this.setMin.size();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                stringBuffer.append(str);
            }
            stringBuffer.append(getInterfaceDescriptor.getMax(this.setMin.get(i)));
        }
        return stringBuffer.toString();
    }
}
