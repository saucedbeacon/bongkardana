package com.facebook.stetho.inspector.network;

import com.facebook.stetho.inspector.protocol.module.Page;
import id.dana.util.media.MimeType;

public class ResourceTypeHelper {
    private final MimeMatcher<Page.ResourceType> mMimeMatcher;

    public ResourceTypeHelper() {
        MimeMatcher<Page.ResourceType> mimeMatcher = new MimeMatcher<>();
        this.mMimeMatcher = mimeMatcher;
        mimeMatcher.addRule("text/css", Page.ResourceType.STYLESHEET);
        this.mMimeMatcher.addRule(MimeType.IMAGE_ALL, Page.ResourceType.IMAGE);
        this.mMimeMatcher.addRule("application/x-javascript", Page.ResourceType.SCRIPT);
        this.mMimeMatcher.addRule("text/javascript", Page.ResourceType.XHR);
        this.mMimeMatcher.addRule("application/json", Page.ResourceType.XHR);
        this.mMimeMatcher.addRule("text/*", Page.ResourceType.DOCUMENT);
        this.mMimeMatcher.addRule("*", Page.ResourceType.OTHER);
    }

    public Page.ResourceType determineResourceType(String str) {
        return this.mMimeMatcher.match(stripContentExtras(str));
    }

    public String stripContentExtras(String str) {
        int indexOf = str.indexOf(59);
        return indexOf >= 0 ? str.substring(0, indexOf) : str;
    }
}
