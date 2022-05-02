package o;

import com.alibaba.fastjson.JSONAware;

final class addTabItem implements RedDotDrawable {
    public static final addTabItem length = new addTabItem();

    public final Object apply(Object obj) {
        return ((JSONAware) obj).toJSONString();
    }
}
