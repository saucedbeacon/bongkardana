package o;

import id.dana.nearbyme.model.MerchantSubcategoryModel;
import java.util.ArrayList;
import java.util.List;

public final class MiniProgramFacade extends setSpeed<List<download>, List<MerchantSubcategoryModel>> {
    public final /* synthetic */ Object map(Object obj) {
        return setMin((List) obj);
    }

    protected static List<MerchantSubcategoryModel> setMin(List<download> list) {
        MerchantSubcategoryModel merchantSubcategoryModel;
        if (list == null || list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (download next : list) {
            if (next != null) {
                merchantSubcategoryModel = new MerchantSubcategoryModel();
                merchantSubcategoryModel.setMax = next.getMcc();
                merchantSubcategoryModel.getMin = next.getName();
                merchantSubcategoryModel.setMin = next.getCategoryIds();
            } else {
                merchantSubcategoryModel = null;
            }
            arrayList.add(merchantSubcategoryModel);
        }
        return arrayList;
    }
}
