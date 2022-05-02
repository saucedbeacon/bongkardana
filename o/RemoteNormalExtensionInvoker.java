package o;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity
public class RemoteNormalExtensionInvoker {
    private String alias;
    private String bankLogo;
    private String bankName;
    private String bankNumber;
    @NonNull
    @PrimaryKey
    private String cardIndexNo;
    private String instId;
    private String instLocalName;
    private long lastUpdated;
    private String payMethod;
    private String payOption;
    private String prefix;
    private String recipientName;
    private String senderName;
    private int transactionCount;
    private boolean visibleInQuickSend;

    public RemoteNormalExtensionInvoker(@NonNull String str) {
        this.cardIndexNo = str;
    }

    @Ignore
    public RemoteNormalExtensionInvoker(String str, String str2, String str3, String str4, long j, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, int i, boolean z) {
        this.recipientName = str;
        this.bankName = str2;
        this.bankNumber = str3;
        this.bankLogo = str4;
        this.lastUpdated = j;
        this.alias = str5;
        this.instId = str6;
        this.instLocalName = str7;
        this.payMethod = str8;
        this.payOption = str9;
        this.senderName = str10;
        this.cardIndexNo = str11;
        this.prefix = str12;
        this.transactionCount = i;
        this.visibleInQuickSend = z;
    }

    public String getBankNumber() {
        return this.bankNumber;
    }

    public void setBankNumber(String str) {
        this.bankNumber = str;
    }

    public String getBankName() {
        return this.bankName;
    }

    public void setBankName(String str) {
        this.bankName = str;
    }

    public String getBankLogo() {
        return this.bankLogo;
    }

    public void setBankLogo(String str) {
        this.bankLogo = str;
    }

    public long getLastUpdated() {
        return this.lastUpdated;
    }

    public void setLastUpdated(long j) {
        this.lastUpdated = j;
    }

    public String getRecipientName() {
        return this.recipientName;
    }

    public void setRecipientName(String str) {
        this.recipientName = str;
    }

    public String getInstId() {
        return this.instId;
    }

    public void setInstId(String str) {
        this.instId = str;
    }

    public String getInstLocalName() {
        return this.instLocalName;
    }

    public void setInstLocalName(String str) {
        this.instLocalName = str;
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
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(1525795981, oncanceled);
            onCancelLoad.getMin(1525795981, oncanceled);
        }
        this.payOption = str;
    }

    public String getSenderName() {
        return this.senderName;
    }

    public void setSenderName(String str) {
        this.senderName = str;
    }

    public String getAlias() {
        return this.alias;
    }

    public void setAlias(String str) {
        this.alias = getAlias(str, this.recipientName);
    }

    private String getAlias(String str, String str2) {
        return TextUtils.isEmpty(str) ? str2 : str;
    }

    @NonNull
    public String getCardIndexNo() {
        return this.cardIndexNo;
    }

    public void setCardIndexNo(@NonNull String str) {
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
}
