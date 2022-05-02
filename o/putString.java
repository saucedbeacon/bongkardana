package o;

import id.dana.sendmoney.paymethod.ChangePayMethodView;
import o.IpcChannelManager;

public class putString extends setSpeed<getMatchingBeaconTypeCodeEndOffset, getParent> {
    private String requestId;

    public getParent apply(getMatchingBeaconTypeCodeEndOffset getmatchingbeacontypecodeendoffset, String str) {
        this.requestId = str;
        return (getParent) apply(getmatchingbeacontypecodeendoffset);
    }

    /* access modifiers changed from: protected */
    public getParent map(getMatchingBeaconTypeCodeEndOffset getmatchingbeacontypecodeendoffset) {
        if (getmatchingbeacontypecodeendoffset == null) {
            return null;
        }
        getParent getparent = new getParent();
        getparent.acceptTimeoutUnit = getmatchingbeacontypecodeendoffset.getAcceptTimeoutUnit();
        getparent.acceptTimeoutValue = getmatchingbeacontypecodeendoffset.getAcceptTimeoutValue();
        getparent.amount = getmatchingbeacontypecodeendoffset.getAmount();
        getparent.fundType = getmatchingbeacontypecodeendoffset.getFundType();
        getparent.instId = getmatchingbeacontypecodeendoffset.getInstId() == null ? ChangePayMethodView.OTHER_DEBIT_CARD : getmatchingbeacontypecodeendoffset.getInstId();
        getparent.payeeInfo = getTransferParticipant(getmatchingbeacontypecodeendoffset);
        getparent.payMethod = getmatchingbeacontypecodeendoffset.getPayMethod();
        getparent.payOption = getmatchingbeacontypecodeendoffset.getPayOption();
        getparent.withdrawInstId = getmatchingbeacontypecodeendoffset.getWithdrawInstId();
        getparent.withdrawInstLocalName = getmatchingbeacontypecodeendoffset.getWithdrawInstLocalName();
        getparent.withdrawInstName = getmatchingbeacontypecodeendoffset.getWithdrawInstName();
        getparent.withdrawPayMethod = getmatchingbeacontypecodeendoffset.getWithdrawPayMethod();
        getparent.withdrawPayOption = getmatchingbeacontypecodeendoffset.getWithdrawPayOption();
        getparent.requestId = this.requestId;
        getparent.shareActivity = getmatchingbeacontypecodeendoffset.isShareActivity();
        return getparent;
    }

    private IpcChannelManager.ServerReadyListener getTransferParticipant(getLayout getlayout) {
        if (getlayout.getPayeeInfo() == null) {
            return null;
        }
        IpcChannelManager.ServerReadyListener serverReadyListener = new IpcChannelManager.ServerReadyListener();
        serverReadyListener.contactName = getlayout.getPayeeInfo().getContactName();
        serverReadyListener.loginId = getlayout.getPayeeInfo().getLoginId();
        serverReadyListener.dateOfBirth = getlayout.getPayeeInfo().getDateOfBirth();
        serverReadyListener.name = getlayout.getPayeeInfo().getNickname();
        return serverReadyListener;
    }
}
