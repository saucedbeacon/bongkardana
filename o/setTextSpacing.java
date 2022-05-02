package o;

import android.location.Location;
import id.dana.domain.merchant.MerchantCategoryType;
import id.dana.nearbyme.model.ShopModel;
import java.util.List;
import o.TitleBarRightButtonView;
import o.a;
import o.g;
import o.onDelete;

public interface setTextSpacing {

    public interface getMin extends onDelete.length {
        void getMax(String str);

        void getMax(List<ShopModel> list);

        void getMax(boolean z);

        void getMin(List<ShopModel> list);

        void getMin(a.C0056a aVar);

        void getMin(boolean z);

        void length(List<ShopModel> list);

        void setMin(List<ShopModel> list, boolean z);

        void setMin(GriverCommonResourceProxy griverCommonResourceProxy);

        void setMin(boolean z);
    }

    public interface setMin extends onDelete.getMin {
        void IsOverlapping();

        void equals();

        String getMax();

        void getMax(Location location);

        void getMax(List<g.AnonymousClass1> list);

        void getMax(boolean z);

        List<ShopModel> getMin(List<ShopModel> list);

        void getMin();

        void getMin(Location location);

        void getMin(String str);

        void getMin(TitleBarRightButtonView.AnonymousClass1<String> r1);

        boolean isInside();

        List<ShopModel> length(List<ShopModel> list, String str);

        void length();

        void length(String str);

        void setMax(Location location);

        void setMax(Location location, int i, boolean z);

        void setMax(List<ShopModel> list);

        void setMin();

        void setMin(Location location);

        void setMin(Location location, int i);

        void setMin(List<ShopModel> list);

        void setMin(List<g.AnonymousClass1> list, MerchantCategoryType merchantCategoryType);

        void setMin(a.C0056a aVar);

        void setMin(boolean z);

        void toFloatRange();

        void toIntRange();

        int values();
    }
}
