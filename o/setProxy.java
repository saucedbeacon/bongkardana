package o;

import id.dana.model.CurrencyAmountModel;
import id.dana.model.PayMethodModel;
import id.dana.sendmoney.model.ConfirmationModel;
import id.dana.sendmoney.model.RecipientModel;
import id.dana.sendmoney.model.VoucherModel;
import id.dana.sendmoney.model.WithdrawOTCModel;
import o.onDelete;

public interface setProxy {

    public interface length extends onDelete.getMin {
        void getMax();

        void getMax(CurrencyAmountModel currencyAmountModel, PayMethodModel payMethodModel, boolean z);

        void getMin();

        void length();

        void length(RecipientModel recipientModel, CurrencyAmountModel currencyAmountModel, PayMethodModel payMethodModel, String str, VoucherModel voucherModel);

        void length(String str);

        void setMax(RecipientModel recipientModel, CurrencyAmountModel currencyAmountModel, PayMethodModel payMethodModel, String str, VoucherModel voucherModel);

        void setMax(RecipientModel recipientModel, CurrencyAmountModel currencyAmountModel, PayMethodModel payMethodModel, String str, VoucherModel voucherModel, WithdrawOTCModel withdrawOTCModel);

        void setMin(RecipientModel recipientModel, CurrencyAmountModel currencyAmountModel, PayMethodModel payMethodModel, String str, String str2, String str3, VoucherModel voucherModel);

        void setMin(boolean z);
    }

    public interface setMax extends onDelete.length {
        void goToConfirmation(ConfirmationModel confirmationModel);

        void onAmountValid();

        void onAmountValidAndActionConfirmed();

        void onGetSendMoneyFeedConfigSuccess(String str);

        void onGetStateSendMoneyShareFeedFromLocal(String str);

        void onGetUserAvatar(String str);

        void onGetX2XVoucherSuccess(boolean z);

        void onMaximumAmountReached(String str);

        void onMinimumAmountReached(String str);
    }
}
