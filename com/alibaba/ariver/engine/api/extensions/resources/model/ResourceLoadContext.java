package com.alibaba.ariver.engine.api.extensions.resources.model;

import android.net.Uri;
import com.alibaba.ariver.kernel.api.node.Node;
import com.alibaba.ariver.kernel.common.utils.UrlUtils;

public class ResourceLoadContext {
    public static int WEBTYPE_IS_NOT_WEBVIEW = 4;
    public static int WEBTYPE_RN_VIEW = 3;
    public static int WEBTYPE_SYSTEM_BUILD_IN = 1;
    public static int WEBTYPE_THIRD_PARTY = 2;
    public boolean canAsyncFallback;
    public boolean canDegradeGlobalPackage;
    public boolean canUseFallback;
    public boolean isMainDoc;
    public String originUrl;
    public Node sourceNode;
    public Uri uri;
    @Deprecated
    public int webType;

    public ResourceLoadContext() {
        this.canDegradeGlobalPackage = true;
    }

    public ResourceLoadContext(Builder builder) {
        this.originUrl = builder.originUrl;
        if (builder.uri == null) {
            this.uri = UrlUtils.parseUrl(this.originUrl);
        } else {
            this.uri = builder.uri;
        }
        this.canUseFallback = builder.canUseFallback;
        this.canAsyncFallback = builder.canAsyncFallback;
        this.isMainDoc = builder.isMainDoc;
        this.webType = builder.webType;
        this.canDegradeGlobalPackage = builder.canDegradeGlobalPackage;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static class Builder {
        public boolean canAsyncFallback = false;
        public boolean canDegradeGlobalPackage = true;
        public boolean canUseFallback;
        public boolean isMainDoc = false;
        public String originUrl;
        public Node sourceNode;
        public Uri uri;
        public int webType = ResourceLoadContext.WEBTYPE_IS_NOT_WEBVIEW;

        public Builder uri(Uri uri2) {
            this.uri = uri2;
            return this;
        }

        public Builder originUrl(String str) {
            this.originUrl = str;
            return this;
        }

        public Builder canUseFallback(boolean z) {
            this.canUseFallback = z;
            return this;
        }

        public Builder canAsyncFallback(boolean z) {
            this.canAsyncFallback = z;
            return this;
        }

        public Builder isMainDoc(boolean z) {
            this.isMainDoc = z;
            return this;
        }

        public Builder webType(int i) {
            this.webType = i;
            return this;
        }

        public Builder sourceNode(Node node) {
            this.sourceNode = node;
            return this;
        }

        public Builder canDegradeGlobalPackage(boolean z) {
            this.canDegradeGlobalPackage = z;
            return this;
        }

        public ResourceLoadContext build() {
            return new ResourceLoadContext(this);
        }
    }
}
