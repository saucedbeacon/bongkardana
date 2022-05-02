package com.alipay.iap.android.wallet.acl;

import com.alibaba.griver.api.constants.GriverErrors;
import com.alipay.iap.android.wallet.acl.base.BaseService;
import com.alipay.iap.android.wallet.acl.base.ServiceMetaInfo;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

public class WalletServiceManager {
    private static WalletServiceManager instance;
    private final String IllegalAccessException = GriverErrors.ERROR_APPID_EXCEPTION;
    private final String InstantiationException = GriverErrors.ERROR_UNZIP_FAILED;
    private final String InvocationTargetException = GriverErrors.ERROR_NO_APP_INFO;
    private final String TAG = "WalletServiceManager";
    Map<Class<? extends BaseService>, BaseService> serviceMap = new HashMap();

    private WalletServiceManager() {
    }

    public static WalletServiceManager getInstance() {
        if (instance == null) {
            instance = new WalletServiceManager();
        }
        return instance;
    }

    public void registerServices(Class<? extends BaseService>... clsArr) throws BaseService.NoServiceMetaInfoException, BaseService.ServiceRegisterException {
        for (Class<? extends BaseService> cls : clsArr) {
            InterfaceDetail findAnnotation = findAnnotation(cls, ServiceMetaInfo.class);
            if (findAnnotation.annotation != null) {
                try {
                    this.serviceMap.put(findAnnotation.serviceInterface, (BaseService) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                } catch (IllegalAccessException unused) {
                    throw new BaseService.ServiceRegisterException("Service initialization error [10001]");
                } catch (InstantiationException unused2) {
                    throw new BaseService.ServiceRegisterException("Service initialization error [10002]");
                } catch (InvocationTargetException unused3) {
                    throw new BaseService.ServiceRegisterException("Service initialization error [10003]");
                } catch (NoSuchMethodException unused4) {
                    throw new BaseService.ServiceRegisterException("No default null constructor found. Please ensure a null constructor is available");
                }
            }
        }
    }

    public <T extends BaseService> T getService(Class<? extends T> cls) throws ServiceNotFoundException {
        T t = (BaseService) this.serviceMap.get(cls);
        if (t != null) {
            return t;
        }
        throw new ServiceNotFoundException("Service is not found");
    }

    public class ServiceNotFoundException extends Exception {
        public ServiceNotFoundException(String str) {
            super(str);
        }
    }

    private <T> InterfaceDetail findAnnotation(Class cls, Class<T> cls2) throws BaseService.NoServiceMetaInfoException {
        if (cls != null) {
            InterfaceDetail interfaceDetail = null;
            Annotation annotation = cls.getAnnotation(cls2);
            if (annotation != null) {
                return new InterfaceDetail(annotation, cls);
            }
            Class[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                Class cls3 = interfaces[i];
                if (BaseService.class.isAssignableFrom(cls3)) {
                    annotation = cls3.getAnnotation(cls2);
                    interfaceDetail = new InterfaceDetail(annotation, cls3);
                    break;
                }
                i++;
            }
            if (annotation == null) {
                return findAnnotation(cls.getSuperclass(), cls2);
            }
            return interfaceDetail;
        }
        throw new BaseService.NoServiceMetaInfoException("Please associate ServiceMetaInfo annotation to the subclass of BaseService");
    }

    public void clearAllLoadedService() {
        this.serviceMap.clear();
    }

    class InterfaceDetail<T> {
        protected T annotation;
        protected Class<? extends BaseService> serviceInterface;

        protected InterfaceDetail(T t, Class<? extends BaseService> cls) {
            this.annotation = t;
            this.serviceInterface = cls;
        }
    }
}
