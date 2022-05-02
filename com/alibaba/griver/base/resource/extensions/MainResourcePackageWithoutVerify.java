package com.alibaba.griver.base.resource.extensions;

import androidx.annotation.NonNull;
import com.alibaba.ariver.resource.api.ResourceContext;
import com.alibaba.ariver.resource.parser.ParseContext;

public class MainResourcePackageWithoutVerify extends GriverMainResourcePackage {
    public MainResourcePackageWithoutVerify(@NonNull ResourceContext resourceContext) {
        super(resourceContext);
    }

    public void beforeParsePackage(ParseContext parseContext) {
        super.beforeParsePackage(parseContext);
        parseContext.needVerify = false;
    }
}
