package com.ap.zoloz.hot.reload;

import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.serializer.NameFilter;
import com.alibaba.fastjson.serializer.SerializeFilter;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.serializer.ValueFilter;
import com.alibaba.griver.base.common.utils.H5ResourceHandlerUtil;
import com.ap.zoloz.hot.reload.layot.LayoutModel;
import com.ap.zoloz.hot.reload.layot.ZDocModel;
import java.io.File;
import java.io.FileInputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public class BasicViewLoadService extends ViewLoadService {
    private Map<String, Map<String, String>> mAllResources = new HashMap();
    private File mConfigDir;
    private String mConfigPath;
    private boolean mIsUsedConfig = true;
    /* access modifiers changed from: private */
    public Map<String, String> mLayoutMapping = new HashMap();
    private Thread mLoadConfigThread;
    private Object mLock = new Object();
    private String mSpecialJson = "";
    private StringsManager mStringsManager = new StringsManager();
    private Map<String, ZDocModel> mZdocLayouts = new HashMap();

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:12|13|14|15|16|17) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0059 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onInitViewLoadService(com.alipay.mobile.security.bio.service.BioServiceManager r2, java.lang.String r3) {
        /*
            r1 = this;
            r1.mConfigPath = r3
            boolean r2 = android.text.TextUtils.isEmpty(r3)
            r3 = 0
            if (r2 == 0) goto L_0x000c
            r1.mIsUsedConfig = r3
            return
        L_0x000c:
            java.io.File r2 = new java.io.File
            java.lang.String r0 = r1.mConfigPath
            r2.<init>(r0)
            r1.mConfigDir = r2
            if (r2 == 0) goto L_0x0062
            boolean r2 = r2.exists()
            if (r2 != 0) goto L_0x001e
            goto L_0x0062
        L_0x001e:
            java.util.Map<java.lang.String, java.lang.String> r2 = r1.mLayoutMapping
            r2.clear()
            java.util.Map<java.lang.String, java.lang.String> r2 = r1.mLayoutMapping
            java.lang.String r3 = "standard_frame"
            java.lang.String r0 = "layout_manual_stand_frame"
            r2.put(r3, r0)
            java.util.Map<java.lang.String, java.lang.String> r2 = r1.mLayoutMapping
            java.lang.String r3 = "passport_frame"
            java.lang.String r0 = "layout_manual_passport"
            r2.put(r3, r0)
            java.util.Map<java.lang.String, java.lang.String> r2 = r1.mLayoutMapping
            java.lang.String r3 = "empty_frame"
            java.lang.String r0 = "layout_manual_0"
            r2.put(r3, r0)
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            java.lang.String r2 = r2.getName()
            java.lang.String r3 = "main"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x005e
            java.lang.Object r2 = r1.mLock
            monitor-enter(r2)
            r1.asyncLoadConfig()     // Catch:{ all -> 0x005b }
            java.lang.Object r3 = r1.mLock     // Catch:{ InterruptedException -> 0x0059 }
            r3.wait()     // Catch:{ InterruptedException -> 0x0059 }
        L_0x0059:
            monitor-exit(r2)     // Catch:{ all -> 0x005b }
            return
        L_0x005b:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        L_0x005e:
            r1.syncLoadConfig()
            return
        L_0x0062:
            r1.mIsUsedConfig = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ap.zoloz.hot.reload.BasicViewLoadService.onInitViewLoadService(com.alipay.mobile.security.bio.service.BioServiceManager, java.lang.String):void");
    }

    private void asyncLoadConfig() {
        if (this.mLoadConfigThread == null) {
            this.mLoadConfigThread = new Thread(new NotifyRunnalbe(this.mLock) {
                public void realRun() {
                    BasicViewLoadService.this.syncLoadConfig();
                }
            });
        }
        this.mLoadConfigThread.start();
    }

    /* access modifiers changed from: private */
    public void syncLoadConfig() {
        File[] listFiles = this.mConfigDir.listFiles(new FilenameFilter() {
            public boolean accept(File file, String str) {
                return str.startsWith("strings");
            }
        });
        this.mStringsManager.clear();
        for (File file : listFiles) {
            String fileToString = fileToString(file);
            if (!TextUtils.isEmpty(fileToString.trim())) {
                try {
                    this.mStringsManager.add(file.getName(), (Map) JSON.parseObject(fileToString, new TypeReference<Map<String, String>>() {
                    }.getType(), new Feature[0]));
                } catch (Exception unused) {
                }
            }
        }
        try {
            this.mAllResources = (Map) JSON.parseObject(fileToString(new File(this.mConfigDir, "resources.json")), new TypeReference<Map<String, Map<String, String>>>() {
            }.getType(), new Feature[0]);
        } catch (Exception unused2) {
            this.mAllResources = new HashMap();
        }
        if (this.mAllResources == null) {
            this.mAllResources = new HashMap();
        }
        try {
            Map<String, ZDocModel> map = ((LayoutModel) JSON.parseObject(fileToString(new File(this.mConfigDir, "layout.json")), LayoutModel.class)).zdoc;
            this.mZdocLayouts = map;
            if (map == null) {
                this.mZdocLayouts = new HashMap();
            }
        } catch (Exception unused3) {
            this.mZdocLayouts = new HashMap();
        }
    }

    private void convertZdocLayoutToSpecial() {
        for (Map.Entry next : this.mZdocLayouts.entrySet()) {
            ZDocModel zDocModel = (ZDocModel) next.getValue();
            StringBuilder sb = new StringBuilder("zdoc_");
            sb.append((String) zDocModel.get("view"));
            sb.append("_tips_");
            sb.append((String) next.getKey());
            String obj = sb.toString();
            if (!this.mStringsManager.containsKey(obj)) {
                StringBuilder sb2 = new StringBuilder("zdoc_");
                sb2.append((String) zDocModel.get("view"));
                sb2.append("_tips");
                obj = sb2.toString();
            }
            zDocModel.put("textResId", obj);
        }
        SerializeFilter[] serializeFilterArr = {new NameFilter() {
            public String process(Object obj, String str, Object obj2) {
                return str.equals("view") ? TtmlNode.TAG_LAYOUT : str;
            }
        }, new ValueFilter() {
            public Object process(Object obj, String str, Object obj2) {
                if (str.equals(TtmlNode.TAG_LAYOUT)) {
                    String str2 = (String) BasicViewLoadService.this.mLayoutMapping.get(obj2);
                    if (!TextUtils.isEmpty(str2)) {
                        return str2;
                    }
                }
                return obj2;
            }
        }};
        Map<String, ZDocModel> map = this.mZdocLayouts;
        if (map == null || map.isEmpty()) {
            this.mSpecialJson = "";
        } else {
            this.mSpecialJson = JSON.toJSONString((Object) this.mZdocLayouts, serializeFilterArr, new SerializerFeature[0]);
        }
    }

    private String fileToString(File file) {
        try {
            Scanner useDelimiter = new Scanner(new FileInputStream(file)).useDelimiter("\\A");
            return useDelimiter.hasNext() ? useDelimiter.next() : "";
        } catch (IOException unused) {
            return null;
        }
    }

    public String getString(String str, int i) {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(-893893451, oncanceled);
            onCancelLoad.getMin(-893893451, oncanceled);
        }
        return this.mStringsManager.getString(this.mContext, str, i);
    }

    public int getColor(String str, int i) {
        Map map = this.mAllResources.get("color");
        if (map == null || map.get(str) == null) {
            return this.mContext.getResources().getColor(i);
        }
        return Color.parseColor((String) map.get(str));
    }

    public boolean getBool(String str, int i) {
        Map map = this.mAllResources.get("bool");
        if (map == null || map.get(str) == null) {
            return this.mContext.getResources().getBoolean(i);
        }
        return Boolean.TRUE.toString().equals(map.get(str));
    }

    public int getInteger(String str, int i) {
        Map map = this.mAllResources.get("integer");
        if (map == null || map.get(str) == null) {
            return this.mContext.getResources().getInteger(i);
        }
        try {
            return Integer.parseInt((String) map.get(str));
        } catch (NumberFormatException unused) {
            return this.mContext.getResources().getInteger(i);
        }
    }

    public Drawable getDrawable(String str, int i) {
        Map map = this.mAllResources.get(H5ResourceHandlerUtil.IMAGE);
        if (map == null || map.get(str) == null) {
            return this.mContext.getResources().getDrawable(i);
        }
        File file = new File(this.mConfigDir, (String) map.get(str));
        if (!file.exists()) {
            return this.mContext.getResources().getDrawable(i);
        }
        try {
            float f = this.mContext.getResources().getDisplayMetrics().density;
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inSampleSize = (int) (3.0f / f);
            return new BitmapDrawable(this.mContext.getResources(), BitmapFactory.decodeFile(file.getAbsolutePath(), options));
        } catch (Exception unused) {
            return this.mContext.getResources().getDrawable(i);
        }
    }

    public void setLayoutMapping(Map<String, String> map) {
        this.mLayoutMapping.putAll(map);
    }

    public String getSpecialUiLayout() {
        if (!this.mIsUsedConfig) {
            return null;
        }
        if (TextUtils.isEmpty(this.mSpecialJson)) {
            convertZdocLayoutToSpecial();
        }
        return this.mSpecialJson;
    }

    public boolean isUsedConfig() {
        return this.mIsUsedConfig;
    }

    abstract class NotifyRunnalbe implements Runnable {
        private Object mLock;

        /* access modifiers changed from: protected */
        public abstract void realRun();

        public NotifyRunnalbe(Object obj) {
            this.mLock = obj;
        }

        public void run() {
            realRun();
            synchronized (this.mLock) {
                if (this.mLock != null) {
                    this.mLock.notifyAll();
                }
            }
        }
    }

    public boolean configContainKey(String str, String str2) {
        if ("strings".equals(str)) {
            return this.mStringsManager.containsKey(str2);
        }
        if ("drawable".equals(str)) {
            str = H5ResourceHandlerUtil.IMAGE;
        }
        Map map = this.mAllResources.get(str);
        if (map == null || map.isEmpty()) {
            return false;
        }
        return map.containsKey(str2);
    }
}
