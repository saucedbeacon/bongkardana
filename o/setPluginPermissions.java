package o;

public class setPluginPermissions extends setSpeed<getExtModel, onGetBluetoothDevices> {
    /* access modifiers changed from: protected */
    public onGetBluetoothDevices map(getExtModel getextmodel) {
        if (getextmodel != null) {
            return new onGetBluetoothDevices(getextmodel.getUserEmail(), getextmodel.getVerifyStatus());
        }
        return null;
    }
}
