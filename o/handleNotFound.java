package o;

import java.util.Map;
import o.TitleBarRightButtonView;

final class handleNotFound implements RedDotDrawable {
    private final Map getMin;

    public handleNotFound(Map map) {
        this.getMin = map;
    }

    public final Object apply(Object obj) {
        return TitleBarRightButtonView.AnonymousClass1.fromCallable(new com_alibaba_ariver_engine_api_ExtOpt$26$1((Map) obj, this.getMin));
    }
}
