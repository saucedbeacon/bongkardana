package com.alipay.plus.push.core;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.alipay.imobile.network.quake.transport.http.constant.HeaderConstant;
import com.alipay.plus.push.core.api.util.MetaDataUtil;
import com.alipay.plus.push.core.model.PushSource;
import com.alipay.plus.push.core.model.ServiceDescription;

public class PushServiceManager implements IPushServiceManager {
    private static Application application;
    private static Context context;
    private static PushServiceManager instance;
    private PushService pushService;

    public void init(@NonNull Application application2, @NonNull PushSource pushSource) {
        if (this.pushService == null) {
            if (application == null && pushSource != null) {
                application = application2;
                context = application2.getApplicationContext();
                initPushServiceImpl(pushSource);
            }
            initSDKConfig();
        }
    }

    public void initSDKConfig() {
        Context context2 = context;
        if (context2 != null) {
            PushConfig.appId = MetaDataUtil.getMetaData(context2, "ALIPUSH_APPID");
            PushConfig.workSpaceId = MetaDataUtil.getMetaData(context, HeaderConstant.HEADER_KEY_WORKSPACE_ID);
            if (TextUtils.isEmpty(MetaDataUtil.getMetaData(context, "host"))) {
                PushConfig.mpsHost = "https://cn-hangzhou-mps-api.cloud.alipay.com";
            } else {
                PushConfig.mpsHost = MetaDataUtil.getMetaData(context, "host");
            }
            if (!TextUtils.isEmpty(MetaDataUtil.getMetaData(context, "push.secret"))) {
                PushConfig.rsa = MetaDataUtil.getMetaData(context, "push.secret");
            }
            if (!TextUtils.isEmpty(PushConfig.appId)) {
                String str = PushConfig.appId;
                StringBuilder sb = new StringBuilder("-");
                sb.append(PushConfig.workSpaceId);
                PushConfig.appId = str.replace(sb.toString(), "");
            }
        }
    }

    public void initialize(@NonNull Application application2, @NonNull PushService pushService2) {
        if (application == null && pushService2 != null) {
            application = application2;
            context = application2.getApplicationContext();
            initPushServiceImpl(pushService2);
        }
    }

    public PushService getPushService() {
        return this.pushService;
    }

    private void initPushServiceImpl(@NonNull PushSource pushSource) {
        if (application == null || this.pushService != null) {
            return;
        }
        if (PushSource.FCM.equals(pushSource)) {
            ServiceDescription serviceDescription = new ServiceDescription();
            serviceDescription.setInterfaceClass(PushService.class.getSimpleName());
            serviceDescription.setClassName("com.alipay.plus.android.push.fcm.FcmPushService");
            initService(serviceDescription);
        } else if (PushSource.JPUSH.equals(pushSource)) {
            ServiceDescription serviceDescription2 = new ServiceDescription();
            serviceDescription2.setInterfaceClass(PushService.class.getSimpleName());
            serviceDescription2.setClassName("com.alipay.plus.android.push.jpush.JpushService");
            initService(serviceDescription2);
        } else if (PushSource.ALIPAY.equals(pushSource)) {
            ServiceDescription serviceDescription3 = new ServiceDescription();
            serviceDescription3.setInterfaceClass(PushService.class.getSimpleName());
            serviceDescription3.setClassName("com.mpaas.pushaar.demo.demo_pushaar.AlipayPushSerice");
            initService(serviceDescription3);
        }
    }

    private void initPushServiceImpl(@NonNull PushService pushService2) {
        if (application != null && this.pushService == null) {
            this.pushService = pushService2;
        }
    }

    private void initService(@NonNull ServiceDescription serviceDescription) {
        if (!TextUtils.isEmpty(serviceDescription.getClassName()) && !TextUtils.isEmpty(serviceDescription.getInterfaceClass())) {
            try {
                Class<?> cls = Class.forName(serviceDescription.getClassName());
                if (cls != null) {
                    PushService pushService2 = (PushService) cls.newInstance();
                    this.pushService = pushService2;
                    pushService2.init(context);
                }
            } catch (Exception unused) {
            }
        }
    }
}
