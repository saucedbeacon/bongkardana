package com.alibaba.ariver.resource.api.content;

import androidx.annotation.Nullable;
import com.alibaba.ariver.engine.api.resources.Resource;

public interface ResourceProvider {
    public static final String H5_BRIDGE = "https://a.alipayobjects.com/bridgeapi/1.0/jsready.js";
    public static final String UN_SAFE = "https://alipay.com/h5container/un_safe.html";

    @Nullable
    Resource getContent(ResourceQuery resourceQuery);

    @Nullable
    Resource getContent(String str);

    String getFallbackUrl(String str);

    Resource getLocalResource(String str);

    @Nullable
    Resource getRawResource(ResourceQuery resourceQuery);

    boolean hasInputException();

    boolean isLocal();

    void mapContent(String str, Resource resource);

    void releaseContent();

    void setFallbackCache(String str, byte[] bArr);
}
