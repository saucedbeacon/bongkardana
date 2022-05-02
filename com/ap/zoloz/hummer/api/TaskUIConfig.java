package com.ap.zoloz.hummer.api;

import com.alibaba.fastjson.annotation.JSONField;
import com.ap.zoloz.hummer.common.UIConfig;
import java.util.ArrayList;

public class TaskUIConfig {
    @JSONField(name = "tasks")
    public ArrayList<UIConfig> tasks = new ArrayList<>();
}
