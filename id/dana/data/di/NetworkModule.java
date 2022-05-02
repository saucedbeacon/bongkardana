package id.dana.data.di;

import android.content.Context;
import com.alipay.imobile.network.sslpinning.SSLPinningManager;
import com.alipay.imobile.network.sslpinning.api.ISSLPinningManager;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import dagger.Module;
import dagger.Provides;
import id.dana.twilio.identityverification.TwilioIdentityVerificationActivity;
import java.io.File;
import java.util.concurrent.TimeUnit;
import javax.inject.Named;
import javax.inject.Singleton;
import o.AppenderManager;
import o.CommonBackPerform;
import o.Draft;
import o.ProcessInfoImpl;
import o.SendToNativeCallback;
import o.UtdidDeviceIdProvider;
import o.checkAlloc;
import o.generateKey;
import o.getCallback;
import o.getEntryInfo;
import o.getLogCategory;
import o.hasPermission;
import o.initCloseCode;
import o.onHandleWork;
import o.postTimeOut;
import o.setParam;
import o.translateSingleFrame;
import okhttp3.logging.HttpLoggingInterceptor;

@Module
public class NetworkModule {
    private static final String CERT = "cert";
    private static final String DATE_FORMAT = "yyyy-MM-dd'T'hh:mm:ssZ";
    private static final String DEFAULT_CACHE_FILE_NAME = "okhttp-cache";
    private static final int DEFAULT_CACHE_SIZE = 1048576;
    private static final int DEFAULT_CONNECT_TIME_OUT = 30000;
    private static final int DEFAULT_READ_TIME_OUT = 30000;
    private final boolean debugMode;

    @Singleton
    @Provides
    public setParam provideIOkHttpSSLPinningManager$3c962557(setParam setparam) {
        return setparam;
    }

    public NetworkModule(boolean z) {
        this.debugMode = z;
    }

    @Singleton
    @Provides
    public Gson provideGson() {
        return new GsonBuilder().setDateFormat(DATE_FORMAT).create();
    }

    @Singleton
    @Provides
    public Draft.CloseHandshakeType provideCache(Context context) {
        return new Draft.CloseHandshakeType(new File(context.getFilesDir(), DEFAULT_CACHE_FILE_NAME));
    }

    @Singleton
    @Provides
    public translateSingleFrame.length provideEventListenerFactory() {
        return hasPermission.FACTORY;
    }

    @Singleton
    @Provides
    public ISSLPinningManager provideISSLPinningManager(Context context) {
        SSLPinningManager sSLPinningManager = new SSLPinningManager(context);
        sSLPinningManager.setPinningMode(0);
        sSLPinningManager.setPresetCertificateFolderPath(CERT);
        return sSLPinningManager;
    }

    @Singleton
    @Provides
    public HttpLoggingInterceptor provideHttpLoggingInterceptor() {
        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor();
        if (this.debugMode) {
            HttpLoggingInterceptor.Level level = HttpLoggingInterceptor.Level.BODY;
            if (level != null) {
                httpLoggingInterceptor.setMin = level;
            } else {
                throw new NullPointerException("level == null. Use Level.NONE instead.");
            }
        } else {
            HttpLoggingInterceptor.Level level2 = HttpLoggingInterceptor.Level.NONE;
            if (level2 != null) {
                httpLoggingInterceptor.setMin = level2;
            } else {
                throw new NullPointerException("level == null. Use Level.NONE instead.");
            }
        }
        return httpLoggingInterceptor;
    }

    @Singleton
    @Provides
    public onHandleWork provideOkhttpInterceptor() {
        return new onHandleWork(getEntryInfo.getInstance().getNetworkFlipperPlugin());
    }

    @Singleton
    @Provides
    public generateKey provideOkHttpClient(HttpLoggingInterceptor httpLoggingInterceptor, getCallback getcallback, CommonBackPerform commonBackPerform, SendToNativeCallback sendToNativeCallback, onHandleWork onhandlework, translateSingleFrame.length length, Draft.CloseHandshakeType closeHandshakeType) {
        generateKey.getMax getmax = new generateKey.getMax();
        getmax.getCause = initCloseCode.getMax(TwilioIdentityVerificationActivity.CHALLENGE_INFO_TIMEOUT, 30000, TimeUnit.MILLISECONDS);
        getmax.extraCallback = initCloseCode.getMax(TwilioIdentityVerificationActivity.CHALLENGE_INFO_TIMEOUT, 30000, TimeUnit.MILLISECONDS);
        getmax.equals = closeHandshakeType;
        getmax.hashCode = null;
        if (length != null) {
            getmax.toFloatRange = length;
            if (httpLoggingInterceptor != null) {
                getmax.getMin.add(httpLoggingInterceptor);
                if (getcallback != null) {
                    getmax.getMin.add(getcallback);
                    if (commonBackPerform != null) {
                        getmax.getMin.add(commonBackPerform);
                        if (sendToNativeCallback != null) {
                            getmax.getMin.add(sendToNativeCallback);
                            if (onhandlework != null) {
                                getmax.getMin.add(onhandlework);
                                return new generateKey(getmax);
                            }
                            throw new IllegalArgumentException("interceptor == null");
                        }
                        throw new IllegalArgumentException("interceptor == null");
                    }
                    throw new IllegalArgumentException("interceptor == null");
                }
                throw new IllegalArgumentException("interceptor == null");
            }
            throw new IllegalArgumentException("interceptor == null");
        }
        throw new NullPointerException("eventListenerFactory == null");
    }

    @Singleton
    @Provides
    @Named("SECURED_OKHTTP")
    public generateKey provideSecuredOkHttpClient(HttpLoggingInterceptor httpLoggingInterceptor, getCallback getcallback, CommonBackPerform commonBackPerform, SendToNativeCallback sendToNativeCallback, onHandleWork onhandlework, translateSingleFrame.length length, Draft.CloseHandshakeType closeHandshakeType) {
        generateKey.getMax getmax = new generateKey.getMax();
        getmax.getCause = initCloseCode.getMax(TwilioIdentityVerificationActivity.CHALLENGE_INFO_TIMEOUT, 30000, TimeUnit.MILLISECONDS);
        getmax.extraCallback = initCloseCode.getMax(TwilioIdentityVerificationActivity.CHALLENGE_INFO_TIMEOUT, 30000, TimeUnit.MILLISECONDS);
        getmax.equals = closeHandshakeType;
        getmax.hashCode = null;
        if (length != null) {
            getmax.toFloatRange = length;
            if (httpLoggingInterceptor != null) {
                getmax.getMin.add(httpLoggingInterceptor);
                if (getcallback != null) {
                    getmax.getMin.add(getcallback);
                    if (commonBackPerform != null) {
                        getmax.getMin.add(commonBackPerform);
                        if (sendToNativeCallback != null) {
                            getmax.getMin.add(sendToNativeCallback);
                            if (onhandlework != null) {
                                getmax.getMin.add(onhandlework);
                                return new generateKey(postTimeOut.enableTls12OnPreLollipop(getmax));
                            }
                            throw new IllegalArgumentException("interceptor == null");
                        }
                        throw new IllegalArgumentException("interceptor == null");
                    }
                    throw new IllegalArgumentException("interceptor == null");
                }
                throw new IllegalArgumentException("interceptor == null");
            }
            throw new IllegalArgumentException("interceptor == null");
        }
        throw new NullPointerException("eventListenerFactory == null");
    }

    @Singleton
    @Provides
    @Named("SECURED_OKHTTP_NAMECHECK")
    public generateKey provideSecuredNameCheckOkHttpClient(HttpLoggingInterceptor httpLoggingInterceptor, getCallback getcallback, CommonBackPerform commonBackPerform, SendToNativeCallback sendToNativeCallback, onHandleWork onhandlework, translateSingleFrame.length length, Draft.CloseHandshakeType closeHandshakeType) {
        generateKey.getMax getmax = new generateKey.getMax();
        getmax.getCause = initCloseCode.getMax(TwilioIdentityVerificationActivity.CHALLENGE_INFO_TIMEOUT, 30000, TimeUnit.MILLISECONDS);
        getmax.extraCallback = initCloseCode.getMax(TwilioIdentityVerificationActivity.CHALLENGE_INFO_TIMEOUT, 30000, TimeUnit.MILLISECONDS);
        getmax.equals = closeHandshakeType;
        getmax.hashCode = null;
        if (length != null) {
            getmax.toFloatRange = length;
            if (httpLoggingInterceptor != null) {
                getmax.getMin.add(httpLoggingInterceptor);
                if (getcallback != null) {
                    getmax.getMin.add(getcallback);
                    if (sendToNativeCallback != null) {
                        getmax.getMin.add(sendToNativeCallback);
                        if (onhandlework != null) {
                            getmax.getMin.add(onhandlework);
                            return new generateKey(postTimeOut.enableTls12OnPreLollipop(getmax));
                        }
                        throw new IllegalArgumentException("interceptor == null");
                    }
                    throw new IllegalArgumentException("interceptor == null");
                }
                throw new IllegalArgumentException("interceptor == null");
            }
            throw new IllegalArgumentException("interceptor == null");
        }
        throw new NullPointerException("eventListenerFactory == null");
    }

    @Singleton
    @Provides
    public UtdidDeviceIdProvider.getMin provideRetrofitBuilder(Gson gson, generateKey generatekey) {
        UtdidDeviceIdProvider.getMin getmin = new UtdidDeviceIdProvider.getMin();
        if (gson != null) {
            getmin.setMax.add(ProcessInfoImpl.getMin(new AppenderManager(gson), "factory == null"));
            getmin.getMax.add(ProcessInfoImpl.getMin(new getLogCategory(), "factory == null"));
            getmin.setMin = (checkAlloc.getMin) ProcessInfoImpl.getMin((checkAlloc.getMin) ProcessInfoImpl.getMin(generatekey, "client == null"), "factory == null");
            return getmin;
        }
        throw new NullPointerException("gson == null");
    }

    @Singleton
    @Provides
    @Named("SECURED_RETROFIT")
    public UtdidDeviceIdProvider.getMin provideSecuredRetrofitBuilder(Gson gson, @Named("SECURED_OKHTTP") generateKey generatekey) {
        UtdidDeviceIdProvider.getMin getmin = new UtdidDeviceIdProvider.getMin();
        if (gson != null) {
            getmin.setMax.add(ProcessInfoImpl.getMin(new AppenderManager(gson), "factory == null"));
            getmin.getMax.add(ProcessInfoImpl.getMin(new getLogCategory(), "factory == null"));
            getmin.setMin = (checkAlloc.getMin) ProcessInfoImpl.getMin((checkAlloc.getMin) ProcessInfoImpl.getMin(generatekey, "client == null"), "factory == null");
            return getmin;
        }
        throw new NullPointerException("gson == null");
    }

    @Singleton
    @Provides
    @Named("SECURED_RETROFIT_NAMECHECK")
    public UtdidDeviceIdProvider.getMin provideSecuredRetrofitNameCheckBuilder(Gson gson, @Named("SECURED_OKHTTP_NAMECHECK") generateKey generatekey) {
        UtdidDeviceIdProvider.getMin getmin = new UtdidDeviceIdProvider.getMin();
        if (gson != null) {
            getmin.setMax.add(ProcessInfoImpl.getMin(new AppenderManager(gson), "factory == null"));
            getmin.getMax.add(ProcessInfoImpl.getMin(new getLogCategory(), "factory == null"));
            getmin.setMin = (checkAlloc.getMin) ProcessInfoImpl.getMin((checkAlloc.getMin) ProcessInfoImpl.getMin(generatekey, "client == null"), "factory == null");
            return getmin;
        }
        throw new NullPointerException("gson == null");
    }
}
