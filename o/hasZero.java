package o;

import android.content.Context;
import android.text.TextUtils;
import id.dana.sendmoney.confirmation.ConfirmationType;
import id.dana.sendmoney.model.ConfirmationModel;
import id.dana.sendmoney.model.ShareActivityModel;
import id.dana.tracker.TrackerKey;
import java.io.Serializable;
import o.convertDipToPx;

public final class hasZero implements Serializable {
    private String claimLinkExpiry;
    private String danaBalanceRecipientType;
    private boolean hasComment;
    private String kycLevel;
    private int paidAmount;
    private String recipientDestinationType;
    private String recipientSource;
    private String recipientUserId;
    private int sendMoneyAmount;
    private int senderContactCount;
    private String senderPaymentMethod;
    private boolean shareToFeed;
    private String source;
    private int totalFreeTransfer;

    public hasZero(ConfirmationModel confirmationModel) {
        this.source = confirmationModel.getMin;
        this.senderPaymentMethod = confirmationModel.ICustomTabsCallback$Stub;
        this.recipientDestinationType = confirmationModel.invoke;
        this.recipientUserId = confirmationModel.ICustomTabsCallback;
        this.senderContactCount = confirmationModel.setMin;
        this.recipientSource = getDashIfEmpty(confirmationModel.getMax);
        this.sendMoneyAmount = ConfirmationModel.setMax(confirmationModel.hashCode);
        this.hasComment = confirmationModel.setMin();
        this.kycLevel = reformatKycLevel(confirmationModel.extraCallback);
        this.claimLinkExpiry = getDashIfEmpty(confirmationModel.getMin());
        this.totalFreeTransfer = confirmationModel.setMax;
        this.paidAmount = confirmationModel.length;
        this.danaBalanceRecipientType = confirmationModel.getMax() ? TrackerKey.DanaBalanceRecipientTypeProperty.DANA : TrackerKey.DanaBalanceRecipientTypeProperty.PHONE;
        this.shareToFeed = getShareToFeed(confirmationModel.receiveFile).booleanValue();
    }

    private String getDashIfEmpty(String str) {
        if (str == null) {
            str = "";
        }
        return TextUtils.isEmpty(str.trim()) ? "-" : str;
    }

    private String reformatKycLevel(String str) {
        if (str.contains("KYC") || TextUtils.isEmpty(str)) {
            return str;
        }
        char charAt = str.charAt(str.length() - 1);
        StringBuilder sb = new StringBuilder();
        sb.append("KYC");
        sb.append(charAt);
        return sb.toString();
    }

    private boolean isSendToContact() {
        return this.recipientDestinationType.equals(ConfirmationType.Destination.CONTACT);
    }

    public final convertDipToPx getSendMoneyCreateEvent(Context context) {
        convertDipToPx.length sendMoneyProperties = getSendMoneyProperties(TrackerKey.Event.SEND_MONEY_CREATE, context);
        sendMoneyProperties.setMin();
        return new convertDipToPx(sendMoneyProperties, (byte) 0);
    }

    public final convertDipToPx getSendMoneyConfirmEvent(Context context) {
        convertDipToPx.length max = getSendMoneyProperties(TrackerKey.Event.SEND_MONEY_CONFIRM, context).getMax(TrackerKey.SendMoneyProperties.PAID_AMOUNT, this.paidAmount).getMax(TrackerKey.SendMoneyProperties.NUMBER_OF_FREE_TRANSFER, this.totalFreeTransfer);
        max.setMin();
        return new convertDipToPx(max, (byte) 0);
    }

    private convertDipToPx.length getSendMoneyProperties(String str, Context context) {
        convertDipToPx.length length = new convertDipToPx.length(context);
        length.getMax = str;
        return length.setMax("Source", this.source).setMax(TrackerKey.SendMoneyProperties.SENDER_PAYMENT_METHOD, this.senderPaymentMethod).setMax(TrackerKey.SendMoneyProperties.RECIPIENT_DESTINATION_TYPE, getRecipientDestinationType()).setMax(TrackerKey.SendMoneyProperties.P2P_RECIPIENT_TYPE, getDanaBalanceRecipientType()).setMax(TrackerKey.SendMoneyProperties.RECIPIENT_USER_ID, getRecipientUserId()).getMax(TrackerKey.SendMoneyProperties.SENDER_CONTACT_COUNT, this.senderContactCount).setMax(TrackerKey.SendMoneyProperties.RECIPIENT_SOURCE, this.recipientSource).getMax(TrackerKey.SendMoneyProperties.SEND_MONEY_AMOUNT, this.sendMoneyAmount).setMin(TrackerKey.SendMoneyProperties.HAS_COMMENT, this.hasComment).setMin(TrackerKey.SendMoneyProperties.SHARE_TO_FEED, this.shareToFeed).setMax(TrackerKey.SendMoneyProperties.SEND_MONEY_CLAIM_LINK_EXPIRY, this.claimLinkExpiry).setMax("KYC Level", this.kycLevel);
    }

    private String getRecipientUserId() {
        return isSendToContact() ? this.recipientUserId : "-";
    }

    private String getDanaBalanceRecipientType() {
        return isSendToContact() ? this.danaBalanceRecipientType : TrackerKey.DanaBalanceRecipientTypeProperty.OTHER;
    }

    private String getRecipientDestinationType() {
        if (this.recipientDestinationType.equalsIgnoreCase(ConfirmationType.Destination.CONTACT)) {
            return TrackerKey.RecipientDestinationTypeProperty.DANA_BALANCE;
        }
        return this.recipientDestinationType.replace("destination_", "").toUpperCase();
    }

    private Boolean getShareToFeed(ShareActivityModel shareActivityModel) {
        if (shareActivityModel != null) {
            return Boolean.valueOf(shareActivityModel.length());
        }
        return Boolean.FALSE;
    }
}
