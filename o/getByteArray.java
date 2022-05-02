package o;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import o.IpcChannelManager;

public class getByteArray extends setSpeed<getLayout, getMimeTypeFromContentType> {
    @Inject
    getByteArray() {
    }

    /* access modifiers changed from: protected */
    public getMimeTypeFromContentType map(getLayout getlayout) {
        if (getlayout == null) {
            return null;
        }
        getMimeTypeFromContentType getmimetypefromcontenttype = new getMimeTypeFromContentType();
        getmimetypefromcontenttype.setAmount(getlayout.getAmount());
        getmimetypefromcontenttype.setCardIndexNo(getlayout.getCardIndexNo());
        getmimetypefromcontenttype.setFundType(getlayout.getFundType());
        getmimetypefromcontenttype.setPayMethod(getlayout.getPayMethod());
        getmimetypefromcontenttype.setRemarks(getlayout.getRemarks());
        getmimetypefromcontenttype.setAcceptTimeoutValue(getlayout.getAcceptTimeoutValue());
        getmimetypefromcontenttype.setAcceptTimeoutUnit(getlayout.getAcceptTimeoutUnit());
        getmimetypefromcontenttype.setOriginInstId(getlayout.getOriginInstId());
        getmimetypefromcontenttype.setPayeeInfo(getTransferParticipant(getlayout));
        getmimetypefromcontenttype.setTransferScenario(getlayout.getTransferScenario());
        getmimetypefromcontenttype.setCouponIds(getCouponIds(getlayout));
        getmimetypefromcontenttype.setSplitBillId(getlayout.getSplitBillId());
        getmimetypefromcontenttype.setShareActivity(getlayout.isShareActivity());
        return getmimetypefromcontenttype;
    }

    private List<String> getCouponIds(getLayout getlayout) {
        ArrayList arrayList = new ArrayList();
        if (!(getlayout == null || getlayout.getCouponId() == null)) {
            arrayList.add(getlayout.getCouponId());
        }
        return arrayList;
    }

    private IpcChannelManager.ServerReadyListener getTransferParticipant(getLayout getlayout) {
        if (getlayout.getPayeeInfo() == null) {
            return null;
        }
        IpcChannelManager.ServerReadyListener serverReadyListener = new IpcChannelManager.ServerReadyListener();
        serverReadyListener.userId = getlayout.getPayeeInfo().getUserId();
        serverReadyListener.loginId = getlayout.getPayeeInfo().getLoginId();
        serverReadyListener.regId = getlayout.getPayeeInfo().getRegId();
        serverReadyListener.nickname = getlayout.getPayeeInfo().getNickname();
        serverReadyListener.contactName = getlayout.getPayeeInfo().getContactName();
        return serverReadyListener;
    }
}
