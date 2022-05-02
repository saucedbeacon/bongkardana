package com.alibaba.griver.base.resource.extensions;

import androidx.annotation.Nullable;
import com.alibaba.ariver.resource.api.ResourceContext;
import com.alibaba.ariver.resource.parser.ParseContext;

public class AppXResourcePackageWithoutVerify extends GriverAppXResourcePackage {
    public AppXResourcePackageWithoutVerify(ResourceContext resourceContext) {
        super(resourceContext);
    }

    public void beforeParsePackage(ParseContext parseContext) {
        super.beforeParsePackage(parseContext);
        parseContext.needVerify = false;
    }

    public int hashCode() {
        return super.hashCode();
    }

    public boolean equals(@Nullable Object obj) {
        return super.equals(obj);
    }
}
