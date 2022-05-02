package com.alibaba.ariver.integration.embedview;

import androidx.annotation.Keep;
import com.alibaba.ariver.engine.api.embedview.EmbedViewProvider;
import com.alibaba.ariver.engine.api.embedview.IEmbedView;
import com.alibaba.ariver.integration.RVInitializer;
import com.alibaba.ariver.integration.RVManifest;
import com.alibaba.ariver.kernel.api.classloader.RVClassLoaderFactory;
import com.alibaba.ariver.kernel.api.extension.registry.EmbedViewMetaInfo;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import java.util.Map;

@Keep
public class DefaultEmbedViewProvider implements EmbedViewProvider {
    private static final String TAG = "AriverInt:DefaultEmbedViewProvider";
    private RVManifest mProjectManifest = RVInitializer.getProjectManifest();

    public IEmbedView createEmbedView(String str) {
        Map<String, EmbedViewMetaInfo> embedViews = this.mProjectManifest.getEmbedViews();
        if (embedViews == null) {
            RVLogger.w(TAG, "createEmbedView null because ProjectManifest.getEmbedViews == null!!!");
            return null;
        }
        EmbedViewMetaInfo embedViewMetaInfo = embedViews.get(str);
        if (embedViewMetaInfo == null) {
            StringBuilder sb = new StringBuilder("createEmbedView null because metaInfoMap.get(");
            sb.append(str);
            sb.append(") == null!!!");
            RVLogger.w(TAG, sb.toString());
            return null;
        }
        try {
            return (IEmbedView) ((RVClassLoaderFactory) RVProxy.get(RVClassLoaderFactory.class)).getClassLoader(embedViewMetaInfo.bundleName).loadClass(embedViewMetaInfo.clazzName).newInstance();
        } catch (Throwable th) {
            RVLogger.w(TAG, "createEmbedView null because exception!", th);
            return null;
        }
    }
}
