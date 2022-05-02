package o;

import id.dana.domain.profilemenu.model.SettingModel;

final class hideOptionMenuItem implements RedDotDrawable {
    private final WorkerBridgeExtension getMin;
    private final SettingModel setMin;

    public hideOptionMenuItem(WorkerBridgeExtension workerBridgeExtension, SettingModel settingModel) {
        this.getMin = workerBridgeExtension;
        this.setMin = settingModel;
    }

    public final Object apply(Object obj) {
        return WorkerBridgeExtension.setMin(this.getMin, this.setMin, (disconnect) obj);
    }
}
