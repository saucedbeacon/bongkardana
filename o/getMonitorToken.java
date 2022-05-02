package o;

import java.util.Date;

public class getMonitorToken {
    protected String alias;
    protected String cardIndexNo;
    protected String formattedMaskNumber;

    /* renamed from: id  reason: collision with root package name */
    protected String f9928id;
    protected String imageUrl;
    protected String instLocalName;
    protected long lastUpdated;
    protected String name;
    protected String number;
    protected String payMethod;
    protected String payOption;
    protected String prefix;
    protected String recipientName;
    protected String senderName;
    protected int transactionCount;
    protected int type;
    private boolean visibleInQuickSend;

    /* access modifiers changed from: protected */
    public Long getCurrentTime() {
        return Long.valueOf(new Date().getTime());
    }

    public String getAlias() {
        return this.alias;
    }

    public void setAlias(String str) {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(-918436917, oncanceled);
            onCancelLoad.getMin(-918436917, oncanceled);
        }
        this.alias = str;
    }

    public String getId() {
        return this.f9928id;
    }

    public void setId(String str) {
        this.f9928id = str;
    }

    public String getImageUrl() {
        return this.imageUrl;
    }

    public void setImageUrl(String str) {
        this.imageUrl = str;
    }

    public String getInstLocalName() {
        return this.instLocalName;
    }

    public void setInstLocalName(String str) {
        this.instLocalName = str;
    }

    public long getLastUpdated() {
        return this.lastUpdated;
    }

    public void setLastUpdated(long j) {
        this.lastUpdated = j;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String str) {
        this.name = str;
    }

    public String getNumber() {
        return this.number;
    }

    public void setNumber(String str) {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(719596512, oncanceled);
            onCancelLoad.getMin(719596512, oncanceled);
        }
        this.number = str;
    }

    public String getRecipientName() {
        return this.recipientName;
    }

    public void setRecipientName(String str) {
        this.recipientName = str;
    }

    public String getSenderName() {
        return this.senderName;
    }

    public void setSenderName(String str) {
        this.senderName = str;
    }

    public int getType() {
        return this.type;
    }

    public void setType(int i) {
        this.type = i;
    }

    public String getPayMethod() {
        return this.payMethod;
    }

    public void setPayMethod(String str) {
        this.payMethod = str;
    }

    public String getPayOption() {
        return this.payOption;
    }

    public void setPayOption(String str) {
        this.payOption = str;
    }

    public String getCardIndexNo() {
        return this.cardIndexNo;
    }

    public void setCardIndexNo(String str) {
        this.cardIndexNo = str;
    }

    public String getFormattedMaskNumber() {
        return this.formattedMaskNumber;
    }

    public void setFormattedMaskNumber(String str) {
        this.formattedMaskNumber = str;
    }

    public String getPrefix() {
        return this.prefix;
    }

    public void setPrefix(String str) {
        this.prefix = str;
    }

    public int getTransactionCount() {
        return this.transactionCount;
    }

    public void setTransactionCount(int i) {
        this.transactionCount = i;
    }

    public boolean isVisibleInQuickSend() {
        return this.visibleInQuickSend;
    }

    public void setVisibleInQuickSend(boolean z) {
        this.visibleInQuickSend = z;
    }
}
