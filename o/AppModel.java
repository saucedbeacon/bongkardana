package o;

import o.TitleBarRightButtonView;

public interface AppModel {
    <T> TitleBarRightButtonView.AnonymousClass1<T> getUserSpecificConfig(onFirstScanTime<T> onfirstscantime);

    TitleBarRightButtonView.AnonymousClass1<Boolean> saveUserSpecificConfig(onConnectedSuccessful onconnectedsuccessful);

    TitleBarRightButtonView.AnonymousClass1<Boolean> saveUserSpecificConfigBackendFirst(onConnectedSuccessful onconnectedsuccessful);

    TitleBarRightButtonView.AnonymousClass1<Boolean> syncInAllUserConfig();
}
