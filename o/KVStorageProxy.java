package o;

import o.BeaconParser;
import o.IpcChannelManager;

public class KVStorageProxy extends setSpeed<getIdentifierCount, IpcClientKernelUtils> {
    public IpcClientKernelUtils map(getIdentifierCount getidentifiercount) {
        if (getidentifiercount == null) {
            return null;
        }
        IpcClientKernelUtils ipcClientKernelUtils = new IpcClientKernelUtils();
        ipcClientKernelUtils.setNeedTransferMethod(getidentifiercount.isNeedTransferMethod());
        ipcClientKernelUtils.setNeedWithdrawMethod(getidentifiercount.isNeedWithdrawMethod());
        ipcClientKernelUtils.setNeedPayMethod(getidentifiercount.isNeedPayMethod());
        ipcClientKernelUtils.setPayeeInfo(getParticipantDTO(getidentifiercount.getPayeeInfo()));
        ipcClientKernelUtils.setTransferMethod(getidentifiercount.getTransferMethod());
        return ipcClientKernelUtils;
    }

    private IpcChannelManager.ServerReadyListener getParticipantDTO(BeaconParser.BeaconLayoutException beaconLayoutException) {
        if (beaconLayoutException == null) {
            return null;
        }
        if (beaconLayoutException.getLoginId() == null && beaconLayoutException.getUserId() == null) {
            return null;
        }
        IpcChannelManager.ServerReadyListener serverReadyListener = new IpcChannelManager.ServerReadyListener();
        serverReadyListener.bankAccountIndexNo = beaconLayoutException.getBankAccountIndexNo();
        serverReadyListener.loginId = beaconLayoutException.getLoginId();
        serverReadyListener.regId = beaconLayoutException.getRegId();
        serverReadyListener.userId = beaconLayoutException.getUserId();
        return serverReadyListener;
    }
}
