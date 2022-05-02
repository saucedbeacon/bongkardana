package o;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity
public final class InvokeException {
    private String alias;
    private String bankLogo;
    private String bankName;
    @NonNull
    @PrimaryKey
    private String bankNumber;
    private int count;
    private String instId;
    private String instLocalName;
    private long lastUpdated;
    private String payMethod;
    private String payOption;
    private String recipientName;
    private String senderName;

    public InvokeException() {
    }

    @Ignore
    public InvokeException(String str, String str2, String str3, String str4, long j, String str5, String str6, String str7, String str8, String str9, String str10) {
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
    }

    public final String getBankNumber() {
        return this.bankNumber;
    }

    public final void setBankNumber(String str) {
        this.bankNumber = str;
    }

    public final String getBankName() {
        return this.bankName;
    }

    public final void setBankName(String str) {
        this.bankName = str;
    }

    public final String getBankLogo() {
        return this.bankLogo;
    }

    public final void setBankLogo(String str) {
        this.bankLogo = str;
    }

    public final int getCount() {
        return this.count;
    }

    public final void setCount(int i) {
        this.count = i;
    }

    public final long getLastUpdated() {
        return this.lastUpdated;
    }

    public final void setLastUpdated(long j) {
        this.lastUpdated = j;
    }

    public final String getRecipientName() {
        return this.recipientName;
    }

    public final void setRecipientName(String str) {
        this.recipientName = str;
    }

    public final String getInstId() {
        return this.instId;
    }

    public final void setInstId(String str) {
        this.instId = str;
    }

    public final String getInstLocalName() {
        return this.instLocalName;
    }

    public final void setInstLocalName(String str) {
        this.instLocalName = str;
    }

    public final String getPayMethod() {
        return this.payMethod;
    }

    public final void setPayMethod(String str) {
        this.payMethod = str;
    }

    public final String getPayOption() {
        return this.payOption;
    }

    public final void setPayOption(String str) {
        this.payOption = str;
    }

    public final String getSenderName() {
        return this.senderName;
    }

    public final void setSenderName(String str) {
        this.senderName = str;
    }

    public final String getAlias() {
        return this.alias;
    }

    public final void setAlias(String str) {
        this.alias = getAlias(str, this.recipientName);
    }

    private String getAlias(String str, String str2) {
        return TextUtils.isEmpty(str) ? str2 : str;
    }
}
