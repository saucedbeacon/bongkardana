package o;

import id.dana.nearbyme.merchantreview.model.MerchantConsultReviewModel;
import o.onDelete;

public interface VersionedParcelize {

    public interface getMax extends onDelete.getMin {
        void getMax();

        void getMax(String str);

        void getMin(String str);

        void length();

        void length(int i);

        void length(String str, String str2, boolean z);
    }

    public interface setMin extends onDelete.length {
        void onGetHomeData(toggleSoftInput togglesoftinput);

        void onGetHomeInfo(InputBridgeExtension inputBridgeExtension);

        void onShouldShowMerchant(MerchantConsultReviewModel merchantConsultReviewModel);

        void onShowMerchantReviewCheckingError();

        void onShowTooltip(boolean z);
    }
}
