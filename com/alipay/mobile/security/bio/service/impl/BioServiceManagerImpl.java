package com.alipay.mobile.security.bio.service.impl;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.alipay.mobile.security.bio.api.BioDetector;
import com.alipay.mobile.security.bio.common.record.impl.BioRecordServiceImpl;
import com.alipay.mobile.security.bio.common.record.impl.ZimRecordServiceImpl;
import com.alipay.mobile.security.bio.config.Constant;
import com.alipay.mobile.security.bio.exception.BioIllegalArgumentException;
import com.alipay.mobile.security.bio.module.MicroModule;
import com.alipay.mobile.security.bio.runtime.Runtime;
import com.alipay.mobile.security.bio.service.BioAppDescription;
import com.alipay.mobile.security.bio.service.BioAppManager;
import com.alipay.mobile.security.bio.service.BioExtService;
import com.alipay.mobile.security.bio.service.BioMetaInfo;
import com.alipay.mobile.security.bio.service.BioRecordService;
import com.alipay.mobile.security.bio.service.BioService;
import com.alipay.mobile.security.bio.service.BioServiceDescription;
import com.alipay.mobile.security.bio.service.BioServiceManager;
import com.alipay.mobile.security.bio.service.BioStoreService;
import com.alipay.mobile.security.bio.service.BioTaskService;
import com.alipay.mobile.security.bio.service.BioUploadService;
import com.alipay.mobile.security.bio.service.ZimRecordService;
import com.alipay.mobile.security.bio.service.local.LocalService;
import com.alipay.mobile.security.bio.utils.StringUtil;
import com.google.android.exoplayer2.C;
import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class BioServiceManagerImpl extends BioServiceManager {
    /* access modifiers changed from: private */
    public static boolean isLoading = false;
    private Hashtable<String, BioAppDescription> mApps = new Hashtable<>();
    /* access modifiers changed from: private */
    public final HashMap<String, BioService> mExtServices = new HashMap<>();
    private HashMap<String, BioServiceDescription> mLazyLocalServices = new HashMap<>();
    private HashMap<String, LocalService> mLocalServices = new HashMap<>();
    private Hashtable<String, BioService> mSystemServices = new Hashtable<>();

    public BioServiceManagerImpl(Context context, String str) {
        super(context, str);
        loadLocalServices(context);
        loadSystemServices();
        loadBioMetaInfos(this.mContext);
    }

    private void loadLocalServices(Context context) {
        Runtime.getLocalService(context, this.mLocalServices, this.mLazyLocalServices);
        for (LocalService create : this.mLocalServices.values()) {
            create.create(this);
        }
    }

    private void loadSystemServices() {
        BioStoreServiceImpl bioStoreServiceImpl = new BioStoreServiceImpl();
        this.mSystemServices.put(BioStoreService.class.getName(), bioStoreServiceImpl);
        BioTaskServiceImpl bioTaskServiceImpl = new BioTaskServiceImpl(this.mContext);
        this.mSystemServices.put(BioTaskService.class.getName(), bioTaskServiceImpl);
        BioRecordServiceImpl bioRecordServiceImpl = new BioRecordServiceImpl();
        this.mSystemServices.put(BioRecordService.class.getName(), bioRecordServiceImpl);
        ZimRecordServiceImpl zimRecordServiceImpl = new ZimRecordServiceImpl();
        this.mSystemServices.put(ZimRecordService.class.getName(), zimRecordServiceImpl);
        BioUploadServiceImpl bioUploadServiceImpl = new BioUploadServiceImpl();
        this.mSystemServices.put(BioUploadService.class.getName(), bioUploadServiceImpl);
        BioAppManager bioAppManager = new BioAppManager();
        this.mSystemServices.put(BioAppManager.class.getName(), bioAppManager);
        bioStoreServiceImpl.create(this);
        bioTaskServiceImpl.create(this);
        bioRecordServiceImpl.create(this);
        zimRecordServiceImpl.create(this);
        bioUploadServiceImpl.create(this);
        bioAppManager.create(this);
    }

    private void loadBioMetaInfos(Context context) {
        for (BioMetaInfo next : Runtime.getBioMetaInfoList()) {
            for (BioServiceDescription addExtService : next.getExtServices()) {
                addExtService(addExtService);
            }
            for (BioAppDescription addAppInfo : next.getApplications()) {
                addAppInfo(addAppInfo);
            }
        }
        synchronized (this.mExtServices) {
            for (String str : this.mExtServices.keySet()) {
                this.mExtServices.get(str).create(this);
            }
        }
    }

    private void addExtService(BioServiceDescription bioServiceDescription) {
        try {
            BioService bioService = (BioService) bioServiceDescription.getClazz().newInstance();
            synchronized (this.mExtServices) {
                this.mExtServices.put(bioServiceDescription.getInterfaceName(), bioService);
            }
        } catch (InstantiationException unused) {
            bioServiceDescription.getInterfaceName();
        } catch (IllegalAccessException unused2) {
            bioServiceDescription.getInterfaceName();
        } catch (Throwable unused3) {
            bioServiceDescription.getInterfaceName();
        }
    }

    private void addAppInfo(BioAppDescription bioAppDescription) {
        if (bioAppDescription != null) {
            StringBuilder sb = new StringBuilder("bio_type_");
            sb.append(bioAppDescription.getBioType());
            sb.append("_");
            sb.append(bioAppDescription.getBioAction());
            String obj = sb.toString();
            if (!this.mApps.containsKey(obj)) {
                this.mApps.put(obj, bioAppDescription);
            } else {
                this.mApps.get(obj);
            }
        }
    }

    public <T> T getBioService(Class<T> cls) {
        return getBioService(cls.getName());
    }

    public <T> T getBioService(String str) {
        T t;
        try {
            t = this.mLocalServices.get(str);
        } catch (Throwable unused) {
            t = null;
        }
        if (t == null) {
            try {
                BioServiceDescription remove = this.mLazyLocalServices.remove(str);
                if (remove != null) {
                    T t2 = (LocalService) remove.getClazz().newInstance();
                    t2.create(this);
                    this.mLocalServices.put(remove.getInterfaceName(), t2);
                    t = t2;
                }
            } catch (Throwable unused2) {
            }
        }
        if (t == null) {
            try {
                t = this.mSystemServices.get(str);
            } catch (Throwable unused3) {
            }
        }
        if (t == null) {
            try {
                synchronized (this.mExtServices) {
                    t = this.mExtServices.get(str);
                }
            } catch (Throwable unused4) {
            }
        }
        return t;
    }

    public <T extends BioService> T putBioService(String str, Class<T> cls) {
        try {
            T t = (BioService) cls.newInstance();
            try {
                t.create(this);
                this.mSystemServices.put(str, t);
                return t;
            } catch (Throwable unused) {
                return t;
            }
        } catch (Throwable unused2) {
            return null;
        }
    }

    public void destroy() {
        HashMap<String, BioService> hashMap = this.mExtServices;
        if (hashMap != null) {
            synchronized (hashMap) {
                for (String str : this.mExtServices.keySet()) {
                    this.mExtServices.get(str).destroy();
                }
                this.mExtServices.clear();
            }
        }
        Hashtable<String, BioService> hashtable = this.mSystemServices;
        if (hashtable != null) {
            for (String str2 : hashtable.keySet()) {
                this.mSystemServices.get(str2).destroy();
            }
            this.mSystemServices.clear();
        }
        HashMap<String, LocalService> hashMap2 = this.mLocalServices;
        if (hashMap2 != null) {
            for (String str3 : hashMap2.keySet()) {
                this.mLocalServices.get(str3).destroy();
            }
            this.mLocalServices.clear();
        }
        HashMap<String, BioServiceDescription> hashMap3 = this.mLazyLocalServices;
        if (hashMap3 != null) {
            hashMap3.clear();
        }
        Hashtable<String, BioAppDescription> hashtable2 = this.mApps;
        if (hashtable2 != null) {
            hashtable2.clear();
        }
    }

    public String startBioActivity(BioAppDescription bioAppDescription, MicroModule microModule) {
        if (bioAppDescription == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder("bio_type_");
        sb.append(bioAppDescription.getBioType());
        sb.append("_");
        sb.append(bioAppDescription.getBioAction());
        String obj = sb.toString();
        if (!this.mApps.containsKey(obj)) {
            return "";
        }
        BioAppDescription bioAppDescription2 = this.mApps.get(obj);
        bioAppDescription.setAppName(bioAppDescription2.getAppName());
        bioAppDescription.setAppInterfaceName(bioAppDescription2.getAppInterfaceName());
        bioAppDescription.setAppType(bioAppDescription2.getAppType());
        startApp(bioAppDescription, microModule);
        return obj;
    }

    private boolean isAuthInBackground(BioAppDescription bioAppDescription) {
        Map<String, String> extProperty = bioAppDescription.getExtProperty();
        return extProperty != null && !extProperty.isEmpty() && extProperty.containsKey(BioDetector.EXT_KEY_AUTH_IN_BACKGROUND) && Boolean.parseBoolean(extProperty.get(BioDetector.EXT_KEY_AUTH_IN_BACKGROUND));
    }

    private void startApp(BioAppDescription bioAppDescription, MicroModule microModule) {
        String appInterfaceName = bioAppDescription.getAppInterfaceName();
        if (!StringUtil.isNullorEmpty(appInterfaceName)) {
            Intent intent = new Intent();
            intent.setClassName(this.mContext, appInterfaceName);
            int i = C.ENCODING_PCM_A_LAW;
            if (isAuthInBackground(bioAppDescription)) {
                i = 536903680;
            }
            intent.setFlags(i);
            intent.putExtra(Constant.BIOLOGY_INTENT_ACTION_INFO, bioAppDescription.getTag());
            boolean z = false;
            if (Runtime.isRunningOnQuinox(this.mContext)) {
                Map<String, String> extProperty = bioAppDescription.getExtProperty();
                if ((extProperty == null || extProperty.isEmpty() || !extProperty.containsKey(BioDetector.EXT_KEY_USE_CONTEXT)) ? false : Boolean.parseBoolean(extProperty.remove(BioDetector.EXT_KEY_USE_CONTEXT))) {
                    if (this.mContext instanceof Activity) {
                        intent.setFlags(0);
                    } else {
                        intent.setFlags(268435456);
                    }
                    this.mContext.startActivity(intent);
                    z = true;
                } else {
                    try {
                        z = Runtime.startActivity(intent);
                    } catch (Throwable unused) {
                    }
                }
            }
            if (z) {
                return;
            }
            if (bioAppDescription.getAppType() != 1) {
                this.mContext.startActivity(intent);
            } else {
                this.mContext.startService(intent);
            }
        } else {
            throw new BioIllegalArgumentException();
        }
    }

    public int preLoad() {
        if (isLoading) {
            return 0;
        }
        isLoading = true;
        new Thread(new Runnable() {
            public void run() {
                Collection<BioService> values;
                synchronized (BioServiceManagerImpl.this.mExtServices) {
                    values = BioServiceManagerImpl.this.mExtServices.values();
                }
                for (BioService bioService : values) {
                    if (bioService instanceof BioExtService) {
                        BioExtService bioExtService = (BioExtService) bioService;
                        if (!bioExtService.isPreparing()) {
                            bioExtService.loadingResource();
                        }
                    }
                }
                boolean unused = BioServiceManagerImpl.isLoading = false;
            }
        }, "loadingResource").start();
        return 1;
    }
}
