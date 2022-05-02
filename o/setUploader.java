package o;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import org.yaml.snakeyaml.DumperOptions;

public abstract class setUploader {
    protected final Map<Object, getLanguage> IsOverlapping = new IdentityHashMap<Object, getLanguage>() {
        private static final long serialVersionUID = -5576159264232131854L;

        public final getLanguage put(Object obj, getLanguage getlanguage) {
            return (getLanguage) super.put(obj, new getBizExternParams(getlanguage));
        }
    };
    private boolean equals = false;
    protected setLogAliveInterval getMax;
    protected DumperOptions.ScalarStyle getMin = null;
    protected final Map<Class<?>, setLogAliveInterval> length = new LinkedHashMap();
    protected final Map<Class<?>, setLogAliveInterval> setMax = new HashMap();
    protected DumperOptions.FlowStyle setMin = DumperOptions.FlowStyle.AUTO;
    public refreshSessionID toFloatRange;

    public final void setMax(DumperOptions.ScalarStyle scalarStyle) {
        this.getMin = scalarStyle;
    }

    public final void getMax(DumperOptions.FlowStyle flowStyle) {
        this.setMin = flowStyle;
    }

    public void setMax(refreshSessionID refreshsessionid) {
        this.toFloatRange = refreshsessionid;
        this.equals = true;
    }

    public final boolean setMin() {
        return this.equals;
    }
}
