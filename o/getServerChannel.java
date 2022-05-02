package o;

import com.alipay.mobile.framework.service.annotation.OperationType;
import com.alipay.mobile.framework.service.annotation.SignCheck;
import o.IpcChannelManager;

public interface getServerChannel {
    @OperationType("alipayplus.mobilewallet.biztransfer.init")
    @SignCheck
    marshall bizInit(IpcClientKernelUtils ipcClientKernelUtils);

    @OperationType("alipayplus.mobilewallet.biztransfer.init")
    @SignCheck
    marshall bizOTCInit(onServerReady onserverready);

    @OperationType("alipayplus.mobilewallet.biztransfer.confirm")
    @SignCheck
    ShadowNodePool confirm(unRegisterClientListener unregisterclientlistener);

    @OperationType("alipayplus.mobilewallet.biztransfer.init")
    @SignCheck
    IpcMessageConstants init(registerClientListener registerclientlistener);

    @OperationType("alipayplus.mobilewallet.biztransfer.prepay")
    @SignCheck
    unmarshall initPrePay(registerClientChannel registerclientchannel);

    @OperationType("alipayplus.mobilewallet.biztransfer.submit")
    @SignCheck
    ShadowNodePool transferOTCSubmit(getParent getparent);

    @OperationType("alipayplus.mobilewallet.biztransfer.submit")
    @SignCheck
    ShadowNodePool transferSubmit(IpcChannelManager.ClientListener clientListener);

    @OperationType("alipayplus.mobilewallet.withdraw.init")
    @SignCheck
    IpcMessageHandler withdrawInit(getClientChannel getclientchannel);
}
