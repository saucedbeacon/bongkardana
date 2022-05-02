package o;

import com.alibaba.fastjson.JSONObject;
import java.util.Set;

final class setTabBarBadge implements RedDotDrawable {
    private final Set getMax;
    private final switchTab length;

    public setTabBarBadge(switchTab switchtab, Set set) {
        this.length = switchtab;
        this.getMax = set;
    }

    public final Object apply(Object obj) {
        return this.length.lambda$getCommonSection$3(this.getMax, (JSONObject) obj);
    }
}
