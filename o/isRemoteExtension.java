package o;

import android.text.TextUtils;
import java.util.Comparator;

public class isRemoteExtension implements Comparator<isRemoteExtension> {
    private String alias;
    private String cardIndexNo;

    /* renamed from: id  reason: collision with root package name */
    private String f9934id;
    private String imageUrl;
    private String instLocalName;
    private long lastUpdateTime;
    private long lastUpdated;
    private String name;
    private String number;
    private String payMethod;
    private String payOption;
    private String prefix;
    private String recipientName;
    private String senderName;
    private int transactionCount;
    private int type;
    private boolean visibleInQuickSend = true;

    public String getAlias() {
        return this.alias;
    }

    public void setAlias(String str) {
        if (1 == this.type) {
            str = getAlias(str, this.recipientName);
        }
        this.alias = str;
    }

    public String getId() {
        return this.f9934id;
    }

    public void setId(String str) {
        this.f9934id = str;
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

    public long getLastUpdateTime() {
        return this.lastUpdateTime;
    }

    public void setLastUpdateTime(long j) {
        this.lastUpdateTime = j;
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

    public int getType() {
        return this.type;
    }

    public void setType(int i) {
        this.type = i;
    }

    private String getAlias(String str, String str2) {
        return TextUtils.isEmpty(str) ? str2 : str;
    }

    public String getCardIndexNo() {
        return this.cardIndexNo;
    }

    public void setCardIndexNo(String str) {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(-213323643, oncanceled);
            onCancelLoad.getMin(-213323643, oncanceled);
        }
        this.cardIndexNo = str;
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

    public int compare(isRemoteExtension isremoteextension, isRemoteExtension isremoteextension2) {
        return Long.compare(isremoteextension.lastUpdated, isremoteextension2.lastUpdated);
    }
}
