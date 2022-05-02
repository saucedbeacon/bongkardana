package o;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Singleton;

@Singleton
public class FontSizeSetting {
    public initUC7zSo map(ErrorView errorView) {
        if (errorView == null || !errorView.getCurrencyPair().contains("/")) {
            return new initUC7zSo();
        }
        initUC7zSo inituc7zso = new initUC7zSo();
        inituc7zso.setCurrency(errorView.getCurrencyPair().split("/")[0]);
        inituc7zso.setRate(Double.parseDouble(errorView.getPrice()));
        return inituc7zso;
    }

    public List<initUC7zSo> transform(List<ErrorView> list) {
        if (list == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            ErrorView errorView = list.get(i);
            initUC7zSo inituc7zso = new initUC7zSo();
            if (!(errorView == null || errorView.getCurrencyPair() == null || !errorView.getCurrencyPair().contains("/"))) {
                inituc7zso.setCurrency(errorView.getCurrencyPair().split("/")[0]);
                inituc7zso.setRate(Double.parseDouble(errorView.getPrice()));
                arrayList.add(inituc7zso);
            }
        }
        return arrayList;
    }
}
