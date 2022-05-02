package o;

import java.lang.reflect.Constructor;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;
import org.yaml.snakeyaml.error.YAMLException;
import org.yaml.snakeyaml.introspector.BeanAccess;

public class setFmt {
    private static final Logger isInside = Logger.getLogger(setFmt.class.getPackage().getName());
    protected BeanAccess IsOverlapping;
    private Class<?> equals;
    protected String[] getMax;
    public getLastPage getMin;
    public transient refreshSessionID length;
    protected Set<String> setMax;
    public final Class<? extends Object> setMin;
    private transient boolean toFloatRange;
    private Map<String, getLogConfigHost> toIntRange;

    public static Object getMax(Object obj) {
        return obj;
    }

    public setFmt(Class<? extends Object> cls, getLastPage getlastpage, Class<?> cls2) {
        this.toIntRange = Collections.emptyMap();
        this.setMax = Collections.emptySet();
        this.getMax = null;
        this.setMin = cls;
        this.getMin = getlastpage;
        this.equals = cls2;
        this.IsOverlapping = null;
    }

    public setFmt(Class<? extends Object> cls) {
        this(cls, (getLastPage) null, (Class<?>) null);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("TypeDescription for ");
        sb.append(this.setMin);
        sb.append(" (tag='");
        sb.append(this.getMin);
        sb.append("')");
        return sb.toString();
    }

    private setLogHost setMax(String str) {
        refreshSessionID refreshsessionid = this.length;
        if (refreshsessionid == null) {
            return null;
        }
        BeanAccess beanAccess = this.IsOverlapping;
        return beanAccess == null ? refreshsessionid.setMax(this.setMin, str, refreshsessionid.getMin) : refreshsessionid.setMax(this.setMin, str, beanAccess);
    }

    public final setLogHost length(String str) {
        if (!this.toFloatRange) {
            for (getLogConfigHost next : this.toIntRange.values()) {
                try {
                    next.setMax(setMax(next.length()));
                } catch (YAMLException unused) {
                }
            }
            this.toFloatRange = true;
        }
        return this.toIntRange.containsKey(str) ? this.toIntRange.get(str) : setMax(str);
    }

    public final Object setMax() {
        Class<?> cls = this.equals;
        if (cls != null) {
            try {
                Constructor<?> declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
                declaredConstructor.setAccessible(true);
                return declaredConstructor.newInstance(new Object[0]);
            } catch (Exception e) {
                isInside.fine(e.getLocalizedMessage());
                this.equals = null;
            }
        }
        return null;
    }
}
