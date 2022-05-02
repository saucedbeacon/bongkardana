package com.ap.zoloz.hummer.common;

import com.alibaba.fastjson.annotation.JSONField;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ClientConfig {
    @JSONField(name = "clientStartIndex")
    public int clientStartIndex = 0;
    @JSONField(name = "factorContext")
    public Map<String, Object> factorContext = new HashMap();
    @JSONField(name = "flowId")
    public String flowId = null;
    @JSONField(name = "tasks")
    public ArrayList<TaskConfig> tasks = new ArrayList<>();
    @JSONField(name = "zStack")
    public ArrayList<Map<String, String>> zStack = new ArrayList<>();
}
