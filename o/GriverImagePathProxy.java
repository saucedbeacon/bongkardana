package o;

import kotlin.jvm.functions.Function1;

final class GriverImagePathProxy implements Function1 {
    private final OpenSettingItem setMax;

    public GriverImagePathProxy(OpenSettingItem openSettingItem) {
        this.setMax = openSettingItem;
    }

    public final Object invoke(Object obj) {
        return this.setMax.onPostMessage.onGetMurotalConfig((Boolean) obj);
    }
}
