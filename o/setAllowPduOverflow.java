package o;

public class setAllowPduOverflow {
    private String amountToSent;
    private String cardCredential;
    private String cardIndexNo;
    private String cardNo;
    private boolean debitSelected;
    private stopBleScan fundAmount;
    private String instId;
    private boolean isSavedAccount;
    private boolean saveCard;
    private String savedAccountHolderName;
    private String senderName;
    private String withdrawInstLocalName;
    private String withdrawPayMethod;
    private String withdrawPayOption;

    public boolean isSavedAccount() {
        return this.isSavedAccount;
    }

    public void setSavedAccount(boolean z) {
        this.isSavedAccount = z;
    }

    public String getSavedAccountHolderName() {
        return this.savedAccountHolderName;
    }

    public void setSavedAccountHolderName(String str) {
        this.savedAccountHolderName = str;
    }

    public String getCardIndexNo() {
        return this.cardIndexNo;
    }

    public void setCardIndexNo(String str) {
        this.cardIndexNo = str;
    }

    public String getCardNo() {
        return this.cardNo;
    }

    public void setCardNo(String str) {
        this.cardNo = str;
    }

    public stopBleScan getFundAmount() {
        return this.fundAmount;
    }

    public void setFundAmount(stopBleScan stopblescan) {
        this.fundAmount = stopblescan;
    }

    public String getInstId() {
        return this.instId;
    }

    public void setInstId(String str) {
        this.instId = str;
    }

    public boolean isSaveCard() {
        return this.saveCard;
    }

    public void setSaveCard(boolean z) {
        this.saveCard = z;
    }

    public String getSenderName() {
        return this.senderName;
    }

    public void setSenderName(String str) {
        this.senderName = str;
    }

    public String getWithdrawInstLocalName() {
        return this.withdrawInstLocalName;
    }

    public void setWithdrawInstLocalName(String str) {
        this.withdrawInstLocalName = str;
    }

    public String getWithdrawPayMethod() {
        return this.withdrawPayMethod;
    }

    public void setWithdrawPayMethod(String str) {
        this.withdrawPayMethod = str;
    }

    public String getWithdrawPayOption() {
        return this.withdrawPayOption;
    }

    public void setWithdrawPayOption(String str) {
        this.withdrawPayOption = str;
    }

    public boolean isDebitSelected() {
        return this.debitSelected;
    }

    public void setDebitSelected(boolean z) {
        this.debitSelected = z;
    }

    public String getAmountToSent() {
        return this.amountToSent;
    }

    public void setAmountToSent(String str) {
        this.amountToSent = str;
    }

    public String getCardCredential() {
        return this.cardCredential;
    }

    public void setCardCredential(String str) {
        this.cardCredential = str;
    }
}
