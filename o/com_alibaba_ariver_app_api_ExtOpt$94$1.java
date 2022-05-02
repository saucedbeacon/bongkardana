package o;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class com_alibaba_ariver_app_api_ExtOpt$94$1 extends setSpeed<List<com_alibaba_ariver_app_api_ExtOpt$99$1>, List<download>> {
    /* access modifiers changed from: protected */
    public List<download> map(List<com_alibaba_ariver_app_api_ExtOpt$99$1> list) {
        if (list == null || list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (com_alibaba_ariver_app_api_ExtOpt$99$1 transform : list) {
            arrayList.add(transform(transform));
        }
        return arrayList;
    }

    private download transform(com_alibaba_ariver_app_api_ExtOpt$99$1 com_alibaba_ariver_app_api_extopt_99_1) {
        if (com_alibaba_ariver_app_api_extopt_99_1 == null) {
            return null;
        }
        download download = new download();
        download.setMcc(com_alibaba_ariver_app_api_extopt_99_1.mcc);
        download.setName(com_alibaba_ariver_app_api_extopt_99_1.Name);
        download.setCategoryIds(getCategoryIds(com_alibaba_ariver_app_api_extopt_99_1));
        return download;
    }

    private List<String> getCategoryIds(com_alibaba_ariver_app_api_ExtOpt$99$1 com_alibaba_ariver_app_api_extopt_99_1) {
        ArrayList arrayList = new ArrayList();
        if (com_alibaba_ariver_app_api_extopt_99_1.categoryId != null) {
            arrayList.add(com_alibaba_ariver_app_api_extopt_99_1.categoryId);
        }
        if (com_alibaba_ariver_app_api_extopt_99_1.categoryIds != null) {
            arrayList.addAll(com_alibaba_ariver_app_api_extopt_99_1.categoryIds);
        }
        return arrayList;
    }

    public List<download> transform(Map<String, com_alibaba_ariver_app_api_ExtOpt$99$1> map) {
        ArrayList arrayList = new ArrayList();
        if (map != null) {
            for (Map.Entry<String, com_alibaba_ariver_app_api_ExtOpt$99$1> value : map.entrySet()) {
                arrayList.add(transform((com_alibaba_ariver_app_api_ExtOpt$99$1) value.getValue()));
            }
        }
        return arrayList;
    }
}
