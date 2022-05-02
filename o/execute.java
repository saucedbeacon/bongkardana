package o;

import android.location.Location;
import java.util.List;
import o.onDelete;

public interface execute {

    public interface getMin extends onDelete.getMin {
        void getMax(String str, boolean z, Location location);

        void getMin(Location location);

        void length();

        void setMax(String str, boolean z);

        void setMin(boolean z);

        void setMin(boolean z, String str);
    }

    public interface setMax extends onDelete.length {
        void onAllPromoSectionsCompleted();

        void onEmptyGetPromoCategorized();

        void onEmptyGetPromoList();

        void onErrorGetPromo();

        void onErrorGetPromoCategorized();

        void onErrorLoadMorePromo(boolean z);

        void onGetPromoAdsError();

        void onGetPromoAdsSuccess(List<DownloadFileHandle> list);

        void onSuccessGetPromoList(onScaleEnd onscaleend);

        void onSuccessLoadMorePromo(onScaleEnd onscaleend);
    }
}
