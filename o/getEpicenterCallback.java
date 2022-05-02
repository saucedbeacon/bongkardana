package o;

import kotlin.jvm.functions.Function1;

final class getEpicenterCallback implements Function1 {
    private final setEpicenterCallback getMin;

    public getEpicenterCallback(setEpicenterCallback setepicentercallback) {
        this.getMin = setepicentercallback;
    }

    public final Object invoke(Object obj) {
        this.getMin.getMin.dismissProgress();
        return null;
    }
}
