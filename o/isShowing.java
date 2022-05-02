package o;

import com.alibaba.fastjson.JSONObject;
import java.util.Set;

final class isShowing implements RedDotDrawable {
    private final Set length;
    private final switchTab setMin;

    public isShowing(switchTab switchtab, Set set) {
        this.setMin = switchtab;
        this.length = set;
    }

    public final Object apply(Object obj) {
        return this.setMin.lambda$getH5OnlineConfig$1(this.length, (JSONObject) obj);
    }
}
