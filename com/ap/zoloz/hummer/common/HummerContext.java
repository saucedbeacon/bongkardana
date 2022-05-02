package com.ap.zoloz.hummer.common;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.alipay.zoloz.config.ConfigCenter;
import com.ap.zoloz.hummer.api.TaskUIConfig;
import com.ap.zoloz.hummer.biz.HummerConstants;
import com.ap.zoloz.hummer.biz.HummerLogger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HummerContext {
    private Map<Integer, Object> argumentContext = new HashMap();
    ClientConfig mClientConfig;
    public Context mContext;
    private TaskConfig mCurrentTaskConfig;
    public String mHummerId;
    TaskUIConfig mTaskUIConfig;
    private List<Map<String, String>> mZStack = new ArrayList();
    public ArrayList<Integer> rpcTaskIndexs = new ArrayList<>();
    private Map<String, Object> runtimeContext = new HashMap();
    private Map<String, Object> serverResponse = new HashMap();

    public void setClientConfig(ClientConfig clientConfig) {
        this.mClientConfig = clientConfig;
    }

    public void setTaskUIConfig(TaskUIConfig taskUIConfig) {
        this.mTaskUIConfig = taskUIConfig;
    }

    public void setCurrentTaskConfig(TaskConfig taskConfig) {
        this.mCurrentTaskConfig = taskConfig;
    }

    public TaskConfig getCurrentTaskConfig() {
        return this.mCurrentTaskConfig;
    }

    public void release() {
        this.serverResponse.clear();
        this.runtimeContext.clear();
        this.argumentContext.clear();
        this.mZStack.clear();
        this.mContext = null;
        this.mCurrentTaskConfig = null;
    }

    public void forceQuit() {
        HummerLogger.i("HummerContext forceQuit");
        this.mZStack.clear();
        this.serverResponse.clear();
        this.runtimeContext.clear();
        this.argumentContext.clear();
        this.mCurrentTaskConfig = null;
    }

    public Object query(String str) {
        HashMap hashMap = new HashMap(ConfigCenter.getInstance().getBizConfig());
        HashMap hashMap2 = new HashMap(ConfigCenter.getInstance().getFrameworkConfigs());
        if (hashMap.containsKey(str)) {
            return hashMap.get(str);
        }
        if (this.serverResponse.containsKey(str)) {
            return this.serverResponse.get(str);
        }
        if (this.runtimeContext.containsKey(str)) {
            return this.runtimeContext.get(str);
        }
        if (hashMap2.containsKey(str)) {
            return hashMap2.get(str);
        }
        return null;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void add(java.lang.String r7, java.lang.String r8, java.lang.Object r9) {
        /*
            r6 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            int r1 = r8.hashCode()
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            switch(r1) {
                case -1589682499: goto L_0x003a;
                case -722006482: goto L_0x002f;
                case -170019676: goto L_0x0025;
                case 3029889: goto L_0x001b;
                case 951530927: goto L_0x0011;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x0044
        L_0x0011:
            java.lang.String r1 = "context"
            boolean r8 = r8.equals(r1)
            if (r8 == 0) goto L_0x0044
            r8 = 0
            goto L_0x0045
        L_0x001b:
            java.lang.String r1 = "both"
            boolean r8 = r8.equals(r1)
            if (r8 == 0) goto L_0x0044
            r8 = 3
            goto L_0x0045
        L_0x0025:
            java.lang.String r1 = "serverResponse"
            boolean r8 = r8.equals(r1)
            if (r8 == 0) goto L_0x0044
            r8 = 2
            goto L_0x0045
        L_0x002f:
            java.lang.String r1 = "zStack"
            boolean r8 = r8.equals(r1)
            if (r8 == 0) goto L_0x0044
            r8 = 4
            goto L_0x0045
        L_0x003a:
            java.lang.String r1 = "argument"
            boolean r8 = r8.equals(r1)
            if (r8 == 0) goto L_0x0044
            r8 = 1
            goto L_0x0045
        L_0x0044:
            r8 = -1
        L_0x0045:
            if (r8 == 0) goto L_0x00df
            if (r8 == r5) goto L_0x00a4
            if (r8 == r4) goto L_0x009e
            if (r8 == r3) goto L_0x005e
            if (r8 == r2) goto L_0x0051
            goto L_0x00de
        L_0x0051:
            com.ap.zoloz.hummer.common.TaskConfig r7 = r6.mCurrentTaskConfig
            java.lang.String r7 = r7.name
            java.lang.String r8 = java.lang.String.valueOf(r9)
            r6.updateZStack(r7, r8)
            goto L_0x00de
        L_0x005e:
            java.util.Map<java.lang.String, java.lang.Object> r8 = r6.runtimeContext
            r8.put(r7, r9)
            com.ap.zoloz.hummer.common.TaskConfig r8 = r6.mCurrentTaskConfig
            if (r8 == 0) goto L_0x00de
            r0.clear()
            java.util.Map<java.lang.Integer, java.lang.Object> r8 = r6.argumentContext
            com.ap.zoloz.hummer.common.TaskConfig r1 = r6.mCurrentTaskConfig
            int r1 = r1.index
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            boolean r8 = r8.containsKey(r1)
            if (r8 == 0) goto L_0x008d
            java.util.Map<java.lang.Integer, java.lang.Object> r8 = r6.argumentContext
            com.ap.zoloz.hummer.common.TaskConfig r1 = r6.mCurrentTaskConfig
            int r1 = r1.index
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r8 = r8.get(r1)
            java.util.Map r8 = (java.util.Map) r8
            r0.putAll(r8)
        L_0x008d:
            r0.put(r7, r9)
            java.util.Map<java.lang.Integer, java.lang.Object> r7 = r6.argumentContext
            com.ap.zoloz.hummer.common.TaskConfig r8 = r6.mCurrentTaskConfig
            int r8 = r8.index
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r7.put(r8, r0)
            return
        L_0x009e:
            java.util.Map<java.lang.String, java.lang.Object> r8 = r6.serverResponse
            r8.put(r7, r9)
            return
        L_0x00a4:
            com.ap.zoloz.hummer.common.TaskConfig r8 = r6.mCurrentTaskConfig
            if (r8 == 0) goto L_0x00de
            r0.clear()
            java.util.Map<java.lang.Integer, java.lang.Object> r8 = r6.argumentContext
            com.ap.zoloz.hummer.common.TaskConfig r1 = r6.mCurrentTaskConfig
            int r1 = r1.index
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            boolean r8 = r8.containsKey(r1)
            if (r8 == 0) goto L_0x00ce
            java.util.Map<java.lang.Integer, java.lang.Object> r8 = r6.argumentContext
            com.ap.zoloz.hummer.common.TaskConfig r1 = r6.mCurrentTaskConfig
            int r1 = r1.index
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r8 = r8.get(r1)
            java.util.Map r8 = (java.util.Map) r8
            r0.putAll(r8)
        L_0x00ce:
            r0.put(r7, r9)
            java.util.Map<java.lang.Integer, java.lang.Object> r7 = r6.argumentContext
            com.ap.zoloz.hummer.common.TaskConfig r8 = r6.mCurrentTaskConfig
            int r8 = r8.index
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r7.put(r8, r0)
        L_0x00de:
            return
        L_0x00df:
            java.util.Map<java.lang.String, java.lang.Object> r8 = r6.runtimeContext
            r8.put(r7, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ap.zoloz.hummer.common.HummerContext.add(java.lang.String, java.lang.String, java.lang.Object):void");
    }

    public boolean needRPC(String str) {
        TaskConfig taskConfig = getTaskConfig(getNextIndex(str));
        return taskConfig != null && HummerConstants.SERVER_TASK.equals(taskConfig.type) && !HummerConstants.TASK_FINALIZE.equals(taskConfig.name) && !"cancel".equals(taskConfig.name);
    }

    public int getNextIndex(String str) {
        TaskConfig taskConfig = this.mCurrentTaskConfig;
        if (taskConfig == null || taskConfig.navigateConfig == null || !this.mCurrentTaskConfig.navigateConfig.containsKey(str)) {
            return 0;
        }
        return ((Integer) ((Map) this.mCurrentTaskConfig.navigateConfig.get(str)).get("index")).intValue();
    }

    public Map<String, Object> getInputParam() {
        TaskConfig taskConfig = this.mCurrentTaskConfig;
        if (taskConfig != null) {
            return taskConfig.inputParams;
        }
        return null;
    }

    public JSONObject getOutputParam(String str) {
        TaskConfig taskConfig = this.mCurrentTaskConfig;
        if (taskConfig != null && taskConfig.navigateConfig.containsKey(str)) {
            return (JSONObject) ((Map) this.mCurrentTaskConfig.navigateConfig.get(str)).get(HummerConstants.OUTPUT_PARAM);
        }
        return null;
    }

    public void delete(String str) {
        this.argumentContext.remove(str);
        this.runtimeContext.remove(str);
        this.serverResponse.remove(str);
        this.argumentContext.remove(str);
    }

    public HashMap<String, Object> packageRPCArguments() {
        TaskConfig taskConfig = this.mCurrentTaskConfig;
        if (taskConfig == null) {
            return null;
        }
        int i = taskConfig.index;
        HashMap<String, Object> hashMap = new HashMap<>();
        ArrayList arrayList = new ArrayList(this.rpcTaskIndexs);
        Collections.sort(arrayList);
        if (!arrayList.contains(Integer.valueOf(i))) {
            return null;
        }
        int intValue = this.rpcTaskIndexs.indexOf(Integer.valueOf(i)) > 0 ? ((Integer) arrayList.get(this.rpcTaskIndexs.indexOf(Integer.valueOf(i)) - 1)).intValue() : 0;
        for (Map.Entry next : this.argumentContext.entrySet()) {
            if (((Integer) next.getKey()).intValue() > intValue && ((Integer) next.getKey()).intValue() <= i) {
                hashMap.putAll((Map) next.getValue());
            }
        }
        return hashMap;
    }

    public List<Map<String, String>> getZStack() {
        return this.mZStack;
    }

    public void updateRpcIndexList() {
        TaskConfig taskConfig = this.mCurrentTaskConfig;
        if (taskConfig != null) {
            this.rpcTaskIndexs.add(Integer.valueOf(taskConfig.index));
            HummerLogger.d(this.rpcTaskIndexs.toString());
        }
    }

    public TaskConfig getTaskConfig(int i) {
        ClientConfig clientConfig = this.mClientConfig;
        if (!(clientConfig == null || clientConfig.tasks == null || this.mClientConfig.tasks.size() == 0)) {
            for (int i2 = 0; i2 < this.mClientConfig.tasks.size(); i2++) {
                if (i == this.mClientConfig.tasks.get(i2).index) {
                    return this.mClientConfig.tasks.get(i2);
                }
            }
        }
        return null;
    }

    public UIConfig getCurrentUIConfig(String str) {
        TaskUIConfig taskUIConfig = this.mTaskUIConfig;
        if (!(taskUIConfig == null || taskUIConfig.tasks.size() == 0)) {
            for (int i = 0; i < this.mTaskUIConfig.tasks.size(); i++) {
                if (str.equals(this.mTaskUIConfig.tasks.get(i).name)) {
                    return this.mTaskUIConfig.tasks.get(i);
                }
            }
        }
        return null;
    }

    public void updateZStack(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put(str, str2);
        this.mZStack.add(hashMap);
    }

    public void recordSystemError(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("subCode", str2);
        hashMap.put(HummerConstants.CURRENT_TASK_NAME, str);
        RecordManager.getInstance().record("ztech_system_error", hashMap);
    }

    public void overwriteZStack(List<Map<String, String>> list) {
        this.mZStack.clear();
        this.mZStack.addAll(list);
    }

    public String getLastZStackCode() {
        List<Map<String, String>> list = this.mZStack;
        String str = "";
        if (list != null && list.size() > 0) {
            List<Map<String, String>> list2 = this.mZStack;
            Map map = list2.get(list2.size() - 1);
            for (String str2 : map.keySet()) {
                str = (String) map.get(str2);
            }
        }
        return str;
    }

    public int getCancelIndex() {
        ClientConfig clientConfig = this.mClientConfig;
        if (!(clientConfig == null || clientConfig.tasks == null || this.mClientConfig.tasks.size() == 0)) {
            for (int i = 0; i < this.mClientConfig.tasks.size(); i++) {
                if ("cancel".equals(this.mClientConfig.tasks.get(i).name)) {
                    return this.mClientConfig.tasks.get(i).index;
                }
            }
        }
        return 0;
    }
}
