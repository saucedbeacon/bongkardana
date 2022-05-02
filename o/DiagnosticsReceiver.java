package o;

import id.dana.sendmoney.model.RecipientModel;
import id.dana.sendmoney.model.WithdrawOTCModel;
import o.onDelete;

public interface DiagnosticsReceiver {

    public interface getMin extends onDelete.getMin {
        void length(String str, RecipientModel recipientModel);

        void setMax(String str);

        void setMin(String str, String str2);
    }

    public interface length extends onDelete.length {
        void onInitCallback(getDataFieldCount getdatafieldcount);

        void onInitError(Throwable th);

        void onInitTransferOTCSuccess(WithdrawOTCModel withdrawOTCModel);

        void onInitTransferSuccess();

        void onLimitBelowFreeMinAmount(RecipientModel recipientModel, String str);

        void onMaximumAmountReached(String str);

        void onMinimumAmountReached(String str);

        void onRecipientIsDanaUser(String str, String str2, String str3, String str4, String str5);

        void onTransferMethodEmpty();

        void showSummaryPage(RecipientModel recipientModel);
    }
}
