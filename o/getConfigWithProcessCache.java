package o;

import java.util.List;
import javax.inject.Inject;
import o.getDataFieldCount;

public class getConfigWithProcessCache extends setSpeed<marshall, getDataFieldCount> {
    private List<addExtraDataParser> addPayMethods;
    private final defaultPlatform currencyAmountResultMapper;
    private final getScreenWidth withdrawMethodViewResultMapper;

    @Inject
    getConfigWithProcessCache(getScreenWidth getscreenwidth, defaultPlatform defaultplatform) {
        this.withdrawMethodViewResultMapper = getscreenwidth;
        this.currencyAmountResultMapper = defaultplatform;
    }

    /* access modifiers changed from: protected */
    public getDataFieldCount map(marshall marshall) {
        if (marshall == null) {
            return null;
        }
        this.withdrawMethodViewResultMapper.setAddPayMethods(this.addPayMethods);
        String str = "";
        getDataFieldCount.setMin payeeUserId = new getDataFieldCount.setMin().setNeedSenderName(marshall.needSenderName).setTransferMethod(this.withdrawMethodViewResultMapper.map(marshall.transferMethodInfo)).setKyc(marshall.payerUserInfo.getKycLevel()).setPayerMaskedNickname(marshall.payerUserInfo.getMaskedNickname()).setPayerMaskedPhoneNumber(marshall.payerUserInfo.getMaskedLoginId()).setPayerUserId(marshall.payerUserInfo.getUserId()).setPayerAccountBalance(this.currencyAmountResultMapper.map(marshall.payerUserInfo.getBalanceAmount())).setPayeeMaskedNickname(marshall.payeeUserInfo != null ? marshall.payeeUserInfo.getMaskedNickname() : "-").setPayeeMaskedPhoneNumber(marshall.payeeUserInfo != null ? marshall.payeeUserInfo.getMaskedLoginId() : str).setPayeeUserId(marshall.payeeUserInfo != null ? marshall.payeeUserInfo.getUserId() : str);
        if (marshall.payeeUserInfo != null) {
            str = marshall.payeeUserInfo.getAvatar();
        }
        return payeeUserId.setPayeeAvatar(str).build();
    }

    public void setPayChannelFromAmcs(List<addExtraDataParser> list) {
        this.addPayMethods = list;
    }
}
