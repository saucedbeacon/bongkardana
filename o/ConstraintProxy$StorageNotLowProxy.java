package o;

import id.dana.referral.model.MyReferralConsult;
import java.util.List;
import o.onDelete;

public interface ConstraintProxy$StorageNotLowProxy {

    public interface setMax extends onDelete.length {
        void onCheckRegisteredUser(boolean z, String str);

        void onFinishCheckLatestReferralCampaign(MyReferralConsult myReferralConsult);

        void onGetContactSyncFeature(boolean z);

        void onGetDeeplinkReferralSuccess(APWebSettings aPWebSettings);

        void onGetMessageTemplateError();

        void onGetMessageTemplateSuccess(postWebMessage postwebmessage);

        void onGetReferralConsultSuccess(MyReferralConsult myReferralConsult);

        void setReferralWidgetFeatureValue(List<handlePerformanceLog> list);
    }

    public interface setMin extends onDelete.getMin {
        void getMax();

        void getMin();

        void getMin(String str);

        void length();

        void length(MyReferralConsult myReferralConsult);

        void setMax(String str);

        void setMin();

        void toFloatRange();
    }
}
