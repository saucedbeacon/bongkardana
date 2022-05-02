package o;

import android.content.Context;
import javax.inject.Inject;
import javax.inject.Singleton;
import o.IpcChannelManager;
import o.IpcClientKernelUtils;
import o.IpcMessage;
import o.TitleBarRightButtonView;

@Singleton
public class isValidUrl extends setRepeatCount<getServerChannel> implements getConfigBoolean {
    private final extractAppIdFromUrl nameCheckParamMapper;
    private final decode nameCheckSecureApi;
    private final getSerializable transferSubmitRequestMapper;

    @Inject
    public isValidUrl(setIsUrgentResource setisurgentresource, appxLoadFailed appxloadfailed, onAppResume onappresume, Context context, decode decode, extractAppIdFromUrl extractappidfromurl, getSerializable getserializable) {
        super(setisurgentresource, appxloadfailed, onappresume, context);
        this.nameCheckSecureApi = decode;
        this.nameCheckParamMapper = extractappidfromurl;
        this.transferSubmitRequestMapper = getserializable;
    }

    public Class<getServerChannel> getFacadeClass() {
        return getServerChannel.class;
    }

    public TitleBarRightButtonView.AnonymousClass1<IpcMessageConstants> init(String str, String str2) {
        registerClientListener registerclientlistener = new registerClientListener();
        registerclientlistener.envInfo = generateMobileEnvInfo();
        registerclientlistener.payeeLoginId = str;
        registerclientlistener.payeeUserId = str2;
        return wrapper(new stripAnchor(registerclientlistener));
    }

    public TitleBarRightButtonView.AnonymousClass1<IpcMessageConstants> init() {
        return init((String) null, (String) null);
    }

    public TitleBarRightButtonView.AnonymousClass1<unmarshall> initPrePay(registerClientChannel registerclientchannel, String str) {
        registerclientchannel.envInfo = generateMobileEnvInfo();
        desc.setUserCity(registerclientchannel.envInfo.extendInfo, str);
        return wrapper(new getOnlineHost(registerclientchannel));
    }

    public TitleBarRightButtonView.AnonymousClass1<ShadowNodePool> confirm(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, boolean z, String str11) {
        unRegisterClientListener unregisterclientlistener = new unRegisterClientListener();
        unregisterclientlistener.envInfo = generateMobileEnvInfo();
        unregisterclientlistener.requestId = str;
        unregisterclientlistener.payAmount = str2;
        unregisterclientlistener.payCurrency = str3;
        unregisterclientlistener.payerAvatar = str4;
        unregisterclientlistener.payerNickname = str5;
        unregisterclientlistener.payeeAvatar = str6;
        unregisterclientlistener.payeeNickname = str7;
        unregisterclientlistener.payeeLoginId = str8;
        unregisterclientlistener.payeeUserId = str9;
        unregisterclientlistener.comment = str10;
        unregisterclientlistener.share = Boolean.valueOf(z);
        unregisterclientlistener.payMethod = str11;
        return wrapper(new isUrlInDomainArray(unregisterclientlistener));
    }

    public TitleBarRightButtonView.AnonymousClass1<marshall> bizInit(IpcClientKernelUtils ipcClientKernelUtils) {
        ipcClientKernelUtils.envInfo = generateMobileEnvInfo();
        return wrapper(new getAbsoluteUrlWithURLLib(ipcClientKernelUtils));
    }

    public TitleBarRightButtonView.AnonymousClass1<marshall> bizOTCInit(onServerReady onserverready) {
        onserverready.envInfo = generateMobileEnvInfo();
        return wrapper(new registerServerChannel(onserverready));
    }

    public TitleBarRightButtonView.AnonymousClass1<IpcMessageHandler> withdrawInit(getClientChannel getclientchannel) {
        getclientchannel.envInfo = generateMobileEnvInfo();
        return wrapper(new registerServerReadyListener(getclientchannel));
    }

    public TitleBarRightButtonView.AnonymousClass1<IpcMessage.AnonymousClass1> nameCheck(setAllowPduOverflow setallowpduoverflow, String str, Boolean bool) {
        IpcClientKernelUtils.AnonymousClass1 map = this.nameCheckParamMapper.map(setallowpduoverflow, str, bool);
        map.envInfo = generateMobileEnvInfo();
        useMultiplexLink ctokenWithoutKey = getAlign.getCtokenWithoutKey();
        TitleBarRightButtonView.AnonymousClass1<R> flatMap = this.nameCheckSecureApi.nameCheck(ctokenWithoutKey.toString(), map).map(IpcChannelManager.getMin).flatMap(new removeAllUpdateListeners());
        ctokenWithoutKey.clear();
        return flatMap;
    }

    public TitleBarRightButtonView.AnonymousClass1<ShadowNodePool> transferSubmit(getMimeTypeFromContentType getmimetypefromcontenttype) {
        IpcChannelManager.ClientListener clientListener = (IpcChannelManager.ClientListener) this.transferSubmitRequestMapper.apply(getmimetypefromcontenttype);
        clientListener.envInfo = generateMobileEnvInfo();
        return wrapper(new unRegisterServerReadyListener(clientListener));
    }

    public TitleBarRightButtonView.AnonymousClass1<ShadowNodePool> transferOTCSubmit(getParent getparent) {
        getparent.envInfo = generateMobileEnvInfo();
        return wrapper(new unRegisterServerChannel(getparent));
    }
}
