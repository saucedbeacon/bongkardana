package com.alibaba.griver.base.resource.extensions;

import android.text.TextUtils;
import com.alibaba.ariver.kernel.RVParams;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.utils.BundleUtils;
import com.alibaba.ariver.resource.api.ResourceContext;
import com.alibaba.ariver.resource.api.content.ResourcePackage;
import com.alibaba.ariver.resource.api.extension.PackageQueryPoint;
import com.alibaba.ariver.resource.api.models.PluginModel;
import com.alibaba.griver.api.common.config.GriverConfigConstants;
import com.alibaba.griver.api.resource.extensions.GriverCommonResourceProxy;
import com.alibaba.griver.base.common.config.GriverConfig;
import com.alibaba.griver.base.common.logger.GriverLogger;
import com.alibaba.griver.base.resource.utils.H5CommonResourceUtils;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GriverPackageQueryExtension implements PackageQueryPoint {
    public ResourcePackage createPluginPackage(PluginModel pluginModel, ResourceContext resourceContext) {
        return null;
    }

    public void onFinalized() {
    }

    public void onInitialized() {
    }

    public ResourcePackage getMainPackage(ResourceContext resourceContext) {
        if ("yes".equalsIgnoreCase(GriverConfig.getConfig(GriverConfigConstants.KEY_SHOULD_VERIFY_APP, "YES"))) {
            return new GriverMainResourcePackage(resourceContext);
        }
        return new MainResourcePackageWithoutVerify(resourceContext);
    }

    public Set<ResourcePackage> getResourcePackages(ResourceContext resourceContext) {
        List<String> filterCommonResources;
        HashSet hashSet = new HashSet();
        if (BundleUtils.getBoolean(resourceContext.getStartParams(), RVParams.isH5App, false)) {
            GriverCommonResourceProxy griverCommonResourceProxy = (GriverCommonResourceProxy) RVProxy.get(GriverCommonResourceProxy.class);
            if (!(griverCommonResourceProxy == null || (filterCommonResources = H5CommonResourceUtils.filterCommonResources(griverCommonResourceProxy.getCommonResources())) == null || filterCommonResources.size() <= 0)) {
                for (String next : filterCommonResources) {
                    if (!TextUtils.equals(next, "66666692")) {
                        GriverLogger.d("GriverPackageQueryExtension", "shared package for h5: ".concat(String.valueOf(next)));
                        if ("yes".equalsIgnoreCase(GriverConfig.getConfig(GriverConfigConstants.KEY_SHOULD_VERIFY_APP, "YES"))) {
                            hashSet.add(new GriverNormalResourcePackage(next, resourceContext));
                        } else {
                            hashSet.add(new NormalResourcePackageWithoutVerify(next, resourceContext));
                        }
                    }
                }
            }
        } else if ("yes".equalsIgnoreCase(GriverConfig.getConfig(GriverConfigConstants.KEY_SHOULD_VERIFY_APP, "YES"))) {
            hashSet.add(new GriverAppXResourcePackage(resourceContext));
        } else {
            hashSet.add(new AppXResourcePackageWithoutVerify(resourceContext));
        }
        return hashSet;
    }
}
