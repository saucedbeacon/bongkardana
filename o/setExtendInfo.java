package o;

import java.util.Objects;
import javax.inject.Inject;
import javax.inject.Singleton;
import o.TitleBarRightButtonView;
import o.b;

@Singleton
public class setExtendInfo extends setMinProgress implements onDisconnectAllDevices {
    private final setPluginPermissions mapper;
    private final setPermission userEmailAddressEntityDataFactory;

    @Inject
    public setExtendInfo(DialogLayout dialogLayout, b.AnonymousClass3 r2, BackKeyDownPoint backKeyDownPoint, setPermission setpermission, getAppLaunchParams getapplaunchparams, setPluginPermissions setpluginpermissions) {
        super(dialogLayout, r2, backKeyDownPoint, getapplaunchparams);
        this.userEmailAddressEntityDataFactory = setpermission;
        this.mapper = setpluginpermissions;
    }

    public TitleBarRightButtonView.AnonymousClass1<String> getEmailAddress() {
        useMultiplexLink ctokenWithoutKey = getAlign.getCtokenWithoutKey();
        TitleBarRightButtonView.AnonymousClass1<R> map = authenticatedRequest(createSendMoneyData().getEmailAddress(ctokenWithoutKey.toString())).map(getPermission.setMin);
        ctokenWithoutKey.clear();
        return map;
    }

    public TitleBarRightButtonView.AnonymousClass1<onGetBluetoothDevices> getEmailAddressAndVerifyResult() {
        useMultiplexLink ctokenWithoutKey = getAlign.getCtokenWithoutKey();
        TitleBarRightButtonView.AnonymousClass1<getExtModel> authenticatedRequest = authenticatedRequest(createSendMoneyData().getEmailAddress(ctokenWithoutKey.toString()));
        setPluginPermissions setpluginpermissions = this.mapper;
        Objects.requireNonNull(setpluginpermissions);
        TitleBarRightButtonView.AnonymousClass1<R> map = authenticatedRequest.map(new getExtendInfo(setpluginpermissions));
        ctokenWithoutKey.clear();
        return map;
    }

    private setRequireVersion createSendMoneyData() {
        return this.userEmailAddressEntityDataFactory.createData("network");
    }
}
