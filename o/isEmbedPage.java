package o;

import id.dana.data.di.NetworkModule;
import o.Draft;
import o.b;
import o.translateSingleFrame;
import okhttp3.logging.HttpLoggingInterceptor;

public final class isEmbedPage implements getAdapterPosition<generateKey> {
    private final b.C0007b<Draft.CloseHandshakeType> cacheProvider;
    private final b.C0007b<SendToNativeCallback> eTagCacheInterceptorProvider;
    private final b.C0007b<translateSingleFrame.length> eventListenerFactoryProvider;
    private final b.C0007b<onHandleWork> flipperOkhttpInterceptorProvider;
    private final b.C0007b<HttpLoggingInterceptor> httpLoggingInterceptorProvider;
    private final NetworkModule module;
    private final b.C0007b<CommonBackPerform> networkAvailabilityInterceptorProvider;
    private final b.C0007b<getCallback> requestHeaderInterceptorProvider;

    public isEmbedPage(NetworkModule networkModule, b.C0007b<HttpLoggingInterceptor> bVar, b.C0007b<getCallback> bVar2, b.C0007b<CommonBackPerform> bVar3, b.C0007b<SendToNativeCallback> bVar4, b.C0007b<onHandleWork> bVar5, b.C0007b<translateSingleFrame.length> bVar6, b.C0007b<Draft.CloseHandshakeType> bVar7) {
        this.module = networkModule;
        this.httpLoggingInterceptorProvider = bVar;
        this.requestHeaderInterceptorProvider = bVar2;
        this.networkAvailabilityInterceptorProvider = bVar3;
        this.eTagCacheInterceptorProvider = bVar4;
        this.flipperOkhttpInterceptorProvider = bVar5;
        this.eventListenerFactoryProvider = bVar6;
        this.cacheProvider = bVar7;
    }

    public final generateKey get() {
        return provideSecuredNameCheckOkHttpClient(this.module, this.httpLoggingInterceptorProvider.get(), this.requestHeaderInterceptorProvider.get(), this.networkAvailabilityInterceptorProvider.get(), this.eTagCacheInterceptorProvider.get(), this.flipperOkhttpInterceptorProvider.get(), this.eventListenerFactoryProvider.get(), this.cacheProvider.get());
    }

    public static isEmbedPage create(NetworkModule networkModule, b.C0007b<HttpLoggingInterceptor> bVar, b.C0007b<getCallback> bVar2, b.C0007b<CommonBackPerform> bVar3, b.C0007b<SendToNativeCallback> bVar4, b.C0007b<onHandleWork> bVar5, b.C0007b<translateSingleFrame.length> bVar6, b.C0007b<Draft.CloseHandshakeType> bVar7) {
        return new isEmbedPage(networkModule, bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7);
    }

    public static generateKey provideSecuredNameCheckOkHttpClient(NetworkModule networkModule, HttpLoggingInterceptor httpLoggingInterceptor, getCallback getcallback, CommonBackPerform commonBackPerform, SendToNativeCallback sendToNativeCallback, onHandleWork onhandlework, translateSingleFrame.length length, Draft.CloseHandshakeType closeHandshakeType) {
        generateKey provideSecuredNameCheckOkHttpClient = networkModule.provideSecuredNameCheckOkHttpClient(httpLoggingInterceptor, getcallback, commonBackPerform, sendToNativeCallback, onhandlework, length, closeHandshakeType);
        if (provideSecuredNameCheckOkHttpClient != null) {
            return provideSecuredNameCheckOkHttpClient;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
