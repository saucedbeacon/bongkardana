package o;

import id.dana.domain.profilemenu.model.SettingModel;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public interface notNeedInitUc {
    List<SettingModel> apply(Map.Entry<String, LinkedHashMap<String, SettingModel>> entry);
}
