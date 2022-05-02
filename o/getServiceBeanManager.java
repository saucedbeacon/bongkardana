package o;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;

public class getServiceBeanManager extends setSpeed<transSyncThreadNames, installPackage> {
    @Inject
    getServiceBeanManager() {
    }

    /* access modifiers changed from: protected */
    public installPackage map(transSyncThreadNames transsyncthreadnames) {
        installPackage installpackage = new installPackage();
        if (transsyncthreadnames != null) {
            installpackage.setTotalCategory(transsyncthreadnames.getTotalCount());
            installpackage.setPromoCategories(map(transsyncthreadnames.getListOfCategory()));
        }
        return installpackage;
    }

    private List<parseAppInfoFromJSONString> map(List<ActionFilter> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (ActionFilter map : list) {
                arrayList.add(map(map));
            }
        }
        return arrayList;
    }

    private parseAppInfoFromJSONString map(ActionFilter actionFilter) {
        parseAppInfoFromJSONString parseappinfofromjsonstring = new parseAppInfoFromJSONString();
        parseappinfofromjsonstring.setCategoryId(actionFilter.getCategoryId());
        parseappinfofromjsonstring.setCategoryName(actionFilter.getCategoryName());
        parseappinfofromjsonstring.setCategoryFilter(actionFilter.getCategoryFilter());
        parseappinfofromjsonstring.setCategorySorting(actionFilter.getCategorySorting());
        return parseappinfofromjsonstring;
    }
}
