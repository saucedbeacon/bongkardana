package com.alipay.imobile.network.quake;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.alipay.imobile.network.quake.cache.Cache;
import com.alipay.imobile.network.quake.exception.ReinitializationException;
import com.alipay.imobile.network.quake.protocol.Protocol;
import com.alipay.imobile.network.quake.request.RequestInterceptor;
import com.alipay.imobile.network.quake.transport.Transporter;
import com.alipay.imobile.network.sslpinning.api.ISSLPinningManager;
import java.util.List;

public interface IQuake {
    Request addRequest(Request request);

    void addRequestInterceptor(RequestInterceptor requestInterceptor);

    void cancelRequest(String str);

    void config(QuakeConfig quakeConfig) throws ReinitializationException;

    Cache getCache(String str);

    QuakeConfig getConfig();

    Context getContext();

    String getDefaultCacheName();

    String getDefaultProtocolName();

    String getDefaultTransportName();

    Protocol getProtocol(String str);

    @NonNull
    List<RequestInterceptor> getRequestInterceptors();

    @Nullable
    ISSLPinningManager getSSLPinningManager();

    Transporter getTransport(String str);

    void registerCache(String str, Cache cache) throws ReinitializationException;

    void registerProtocol(String str, Protocol<?> protocol) throws ReinitializationException;

    void registerTransport(String str, Transporter transporter) throws ReinitializationException;

    void release();

    void removeRequestInterceptor(RequestInterceptor requestInterceptor);

    void setDefaultCacheName(String str) throws ReinitializationException;

    void setDefaultProtocolName(String str) throws ReinitializationException;

    void setDefaultTransportName(String str) throws ReinitializationException;

    void setDefaultUserAgent(String str);

    void setSSLPinningManager(@NonNull ISSLPinningManager iSSLPinningManager);
}
