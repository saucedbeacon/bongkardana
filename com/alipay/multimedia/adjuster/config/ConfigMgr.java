package com.alipay.multimedia.adjuster.config;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alipay.multimedia.adjuster.api.data.IConfig;
import com.alipay.multimedia.adjuster.utils.AliCdnUtils;
import com.alipay.multimedia.adjuster.utils.Log;

public class ConfigMgr {
    private static final String TAG = "ConfigMgr";
    /* access modifiers changed from: private */
    public static final Log logger = Log.getLogger(TAG);
    static ConfigMgr mInstance;
    /* access modifiers changed from: private */
    public CdnConfigItem mCdnConfigItem = new CdnConfigItem();
    /* access modifiers changed from: private */
    public IConfig mConfig;

    private ConfigMgr() {
    }

    public static ConfigMgr getInc() {
        if (mInstance == null) {
            synchronized (ConfigMgr.class) {
                if (mInstance == null) {
                    mInstance = new ConfigMgr();
                }
            }
        }
        return mInstance;
    }

    public void registerConfig(IConfig iConfig) {
        this.mConfig = iConfig;
    }

    public CdnConfigItem getCdnConfigItem() {
        CdnConfigItem cdnConfigItem;
        synchronized (this.mCdnConfigItem) {
            if (this.mCdnConfigItem.needUpdate()) {
                AliCdnUtils.getSingleExecutor().execute(new Runnable() {
                    public void run() {
                        synchronized (ConfigMgr.this.mCdnConfigItem) {
                            if (ConfigMgr.this.mConfig != null) {
                                String config = ConfigMgr.this.mConfig.getConfig(ConfigConst.CONFIG_KEY_CDN);
                                if (!TextUtils.isEmpty(config)) {
                                    try {
                                        CdnConfigItem unused = ConfigMgr.this.mCdnConfigItem = (CdnConfigItem) JSON.parseObject(config, CdnConfigItem.class);
                                    } catch (Throwable th) {
                                        Log access$200 = ConfigMgr.logger;
                                        StringBuilder sb = new StringBuilder("getCdnConfigItem update error: ");
                                        sb.append(config);
                                        sb.append(", e: ");
                                        sb.append(th.toString());
                                        access$200.d(sb.toString(), new Object[0]);
                                    }
                                }
                            }
                            ConfigMgr.this.mCdnConfigItem.updateTime();
                            Log access$2002 = ConfigMgr.logger;
                            StringBuilder sb2 = new StringBuilder("getCdnConfigItem config: ");
                            sb2.append(ConfigMgr.this.mCdnConfigItem);
                            access$2002.d(sb2.toString(), new Object[0]);
                        }
                    }
                });
            }
            cdnConfigItem = this.mCdnConfigItem;
        }
        return cdnConfigItem;
    }
}
