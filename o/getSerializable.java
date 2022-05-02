package o;

import id.dana.domain.sendmoney.TransferScenario;
import o.IpcChannelManager;

public class getSerializable extends setSpeed<getMimeTypeFromContentType, IpcChannelManager.ClientListener> {
    /* access modifiers changed from: protected */
    public IpcChannelManager.ClientListener map(getMimeTypeFromContentType getmimetypefromcontenttype) {
        if (getmimetypefromcontenttype == null) {
            return null;
        }
        IpcChannelManager.ClientListener clientListener = new IpcChannelManager.ClientListener();
        clientListener.amount = getmimetypefromcontenttype.getAmount();
        clientListener.fundType = getmimetypefromcontenttype.getFundType();
        clientListener.remarks = getmimetypefromcontenttype.getRemarks();
        clientListener.payMethod = getmimetypefromcontenttype.getPayMethod();
        clientListener.payeeInfo = getTransferParticipant(getmimetypefromcontenttype);
        clientListener.requestId = getmimetypefromcontenttype.getRequestId();
        clientListener.acceptTimeoutValue = getmimetypefromcontenttype.getAcceptTimeoutValue();
        clientListener.acceptTimeoutUnit = getmimetypefromcontenttype.getAcceptTimeoutUnit();
        clientListener.instId = getmimetypefromcontenttype.getOriginInstId();
        clientListener.transferScenario = getmimetypefromcontenttype.getTransferScenario();
        clientListener.couponIds = getmimetypefromcontenttype.getCouponIds();
        if (TransferScenario.SPLIT_BILL.equals(getmimetypefromcontenttype.getTransferScenario())) {
            clientListener.splitBillId = getmimetypefromcontenttype.getSplitBillId();
        }
        clientListener.shareActivity = getmimetypefromcontenttype.isShareActivity();
        return clientListener;
    }

    private IpcChannelManager.ServerReadyListener getTransferParticipant(getMimeTypeFromContentType getmimetypefromcontenttype) {
        IpcChannelManager.ServerReadyListener serverReadyListener = new IpcChannelManager.ServerReadyListener();
        serverReadyListener.bankAccountIndexNo = getmimetypefromcontenttype.getCardIndexNo();
        if (getmimetypefromcontenttype.getPayeeInfo() != null) {
            serverReadyListener.contactName = getmimetypefromcontenttype.getPayeeInfo().contactName;
            serverReadyListener.nickname = getmimetypefromcontenttype.getPayeeInfo().nickname;
            serverReadyListener.loginId = getmimetypefromcontenttype.getPayeeInfo().loginId;
            serverReadyListener.userId = getmimetypefromcontenttype.getPayeeInfo().userId;
        }
        return serverReadyListener;
    }
}
