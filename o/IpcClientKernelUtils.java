package o;

import com.alipayplus.mobile.component.domain.model.request.BaseRpcRequest;
import o.IpcChannelManager;

public class IpcClientKernelUtils extends BaseRpcRequest {
    private boolean needPayMethod;
    private boolean needTransferMethod;
    private boolean needWithdrawMethod;
    private IpcChannelManager.ServerReadyListener payeeInfo;
    private String transferMethod;

    public boolean isNeedTransferMethod() {
        return this.needTransferMethod;
    }

    public void setNeedTransferMethod(boolean z) {
        this.needTransferMethod = z;
    }

    public boolean isNeedWithdrawMethod() {
        return this.needWithdrawMethod;
    }

    public void setNeedWithdrawMethod(boolean z) {
        this.needWithdrawMethod = z;
    }

    public boolean isNeedPayMethod() {
        return this.needPayMethod;
    }

    public void setNeedPayMethod(boolean z) {
        this.needPayMethod = z;
    }

    public IpcChannelManager.ServerReadyListener getPayeeInfo() {
        return this.payeeInfo;
    }

    public void setPayeeInfo(IpcChannelManager.ServerReadyListener serverReadyListener) {
        this.payeeInfo = serverReadyListener;
    }

    public String getTransferMethod() {
        return this.transferMethod;
    }

    public void setTransferMethod(String str) {
        this.transferMethod = str;
    }
}
