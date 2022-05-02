package o;

import java.util.List;
import javax.inject.Inject;

public class getConfigJSONArray extends setSpeed<marshall, getBeaconAdvertisementData> {
    private String acceptExpiryTimeUnit;
    private String acceptExpiryTimeValue;
    private List<addExtraDataParser> addPayMethods;
    private final defaultPlatform currencyAmountResultMapper;
    private final getScreenWidth withdrawMethodViewResultMapper;

    @Inject
    public getConfigJSONArray(defaultPlatform defaultplatform, getScreenWidth getscreenwidth) {
        this.currencyAmountResultMapper = defaultplatform;
        this.withdrawMethodViewResultMapper = getscreenwidth;
    }

    /* access modifiers changed from: protected */
    public getBeaconAdvertisementData map(marshall marshall) {
        if (marshall == null) {
            return null;
        }
        this.withdrawMethodViewResultMapper.setAddPayMethods(this.addPayMethods);
        getBeaconAdvertisementData getbeaconadvertisementdata = new getBeaconAdvertisementData();
        getbeaconadvertisementdata.setNeedSenderName(marshall.needSenderName);
        getbeaconadvertisementdata.setTransferMethod(this.withdrawMethodViewResultMapper.map(marshall.transferMethodInfo));
        getbeaconadvertisementdata.setKyc(marshall.payerUserInfo.getKycLevel());
        getbeaconadvertisementdata.setPayerMaskedNickname(marshall.payerUserInfo.getMaskedNickname());
        getbeaconadvertisementdata.setPayerMaskedPhoneNumber(marshall.payerUserInfo.getMaskedLoginId());
        getbeaconadvertisementdata.setPayerUserId(marshall.payerUserInfo.getUserId());
        getbeaconadvertisementdata.setPayerAccountBalance(this.currencyAmountResultMapper.map(marshall.payerUserInfo.getBalanceAmount()));
        getbeaconadvertisementdata.setPayeeMaskedNickname(marshall.payeeUserInfo != null ? marshall.payeeUserInfo.getMaskedNickname() : "-");
        String str = "";
        getbeaconadvertisementdata.setPayeeMaskedPhoneNumber(marshall.payeeUserInfo != null ? marshall.payeeUserInfo.getMaskedLoginId() : str);
        getbeaconadvertisementdata.setPayeeUserId(marshall.payeeUserInfo != null ? marshall.payeeUserInfo.getUserId() : str);
        if (marshall.payeeUserInfo != null) {
            str = marshall.payeeUserInfo.getAvatar();
        }
        getbeaconadvertisementdata.setPayeeAvatar(str);
        getbeaconadvertisementdata.setAcceptExpiryTimeUnit(this.acceptExpiryTimeUnit);
        getbeaconadvertisementdata.setAcceptExpiryTimeValue(this.acceptExpiryTimeValue);
        return getbeaconadvertisementdata;
    }

    public void setPayChannelFromAmcs(List<addExtraDataParser> list) {
        this.addPayMethods = list;
    }

    public void setAcceptExpiryTimeUnit(String str) {
        this.acceptExpiryTimeUnit = str;
    }

    public void setAcceptExpiryTimeValue(String str) {
        this.acceptExpiryTimeValue = str;
    }
}
