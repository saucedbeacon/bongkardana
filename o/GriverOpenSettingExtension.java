package o;

import kotlin.jvm.functions.Function1;

final class GriverOpenSettingExtension implements Function1 {
    private final OpenSettingItem setMax;

    final class SettingChangeCallback implements removeStateDidChangeHandler {
        public static final SettingChangeCallback getMin = new SettingChangeCallback();

        public final void getMax() {
            OpenSettingItem.create();
        }
    }

    public GriverOpenSettingExtension(OpenSettingItem openSettingItem) {
        this.setMax = openSettingItem;
    }

    public final Object invoke(Object obj) {
        return this.setMax.onPostMessage.onGetSplashAnimationConfig(((onLoadResource) obj).getEnable(), ((onLoadResource) obj).getAnimationFile());
    }
}
