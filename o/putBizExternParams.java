package o;

import java.util.List;
import o.InitParams;
import org.yaml.snakeyaml.DumperOptions;

public abstract class putBizExternParams<T> extends getLanguage {
    private DumperOptions.FlowStyle getMin;

    public abstract List<T> setMin();

    public putBizExternParams(getLastPage getlastpage, InitParams.AnonymousClass1 r3, DumperOptions.FlowStyle flowStyle) {
        super(getlastpage, r3, (InitParams.AnonymousClass1) null);
        if (flowStyle != null) {
            this.getMin = flowStyle;
            return;
        }
        throw new NullPointerException("Flow style must be provided.");
    }

    public final void getMax(InitParams.AnonymousClass1 r1) {
        this.getMax = r1;
    }
}
