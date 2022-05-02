package o;

import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class com_alibaba_ariver_app_api_ExtOpt$99$1 implements Serializable {
    public String Name;
    @JSONField(name = "mc_id")
    public String categoryId;
    public List<String> categoryIds = new ArrayList();
    public String mcc;
}
