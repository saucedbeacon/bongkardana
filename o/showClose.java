package o;

import java.util.List;

final class showClose implements RedDotDrawable {
    private final List getMax;
    private final String length;
    private final onKeyboardVisible setMin;

    public showClose(onKeyboardVisible onkeyboardvisible, List list, String str) {
        this.setMin = onkeyboardvisible;
        this.getMax = list;
        this.length = str;
    }

    public final Object apply(Object obj) {
        return this.setMin.lambda$getUniPaymentResult$4(this.getMax, this.length, (String) obj);
    }
}
