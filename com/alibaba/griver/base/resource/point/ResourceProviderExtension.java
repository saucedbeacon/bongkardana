package com.alibaba.griver.base.resource.point;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Keep;
import com.alibaba.ariver.engine.api.resources.Resource;
import com.alibaba.ariver.kernel.common.utils.IOUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.ariver.kernel.common.utils.UrlUtils;
import com.alibaba.ariver.resource.api.content.OfflineResource;
import com.alibaba.ariver.resource.api.content.ResourceQuery;
import com.alibaba.ariver.resource.api.extension.ResourceProviderPoint;
import com.alibaba.griver.base.common.utils.AOMPFileTinyAppUtils;
import com.alibaba.griver.image.photo.PhotoContext;
import java.io.FileInputStream;

@Keep
public class ResourceProviderExtension implements ResourceProviderPoint {
    private static final String LOCAL_RES_PREFIX = "https://resource/";
    private static final String LOCAL_RES_TYPE = "image";
    private static final String TAG = "ResourceProviderExtension";

    public void onFinalized() {
    }

    public void onInitialized() {
    }

    private static byte[] localIdToBytes(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            if (str.startsWith(PhotoContext.FILE_SCHEME)) {
                str = str.replaceAll(PhotoContext.FILE_SCHEME, "");
            }
            return IOUtils.readToByte(new FileInputStream(str));
        } catch (Exception e) {
            RVLogger.e(TAG, (Throwable) e);
            return null;
        }
    }

    public Resource getResource(ResourceQuery resourceQuery) {
        Resource localResponse = getLocalResponse(resourceQuery.pureUrl);
        if (localResponse != null) {
            return localResponse;
        }
        if (UrlUtils.parseUrl(resourceQuery.pureUrl) == null) {
        }
        return null;
    }

    private static String matchLocalId(String str, String str2) {
        Uri parseUrl;
        String[] split;
        if (str == null || !str.startsWith("https://resource/") || !str.endsWith(str2) || (parseUrl = UrlUtils.parseUrl(str)) == null || TextUtils.isEmpty(parseUrl.getPath()) || (split = parseUrl.getPath().replace("/", "").split("\\.")) == null || split.length <= 1) {
            return null;
        }
        String str3 = split[0];
        try {
            if (!TextUtils.isEmpty(str3)) {
                return str3;
            }
            return null;
        } catch (Exception e) {
            RVLogger.e(TAG, (Throwable) e);
            return null;
        }
    }

    private Resource getLocalResponse(String str) {
        byte[] localIdToBytes;
        if (TextUtils.isEmpty(str) || !str.endsWith("image")) {
            return null;
        }
        String localPathFromId = AOMPFileTinyAppUtils.getLocalPathFromId(str);
        if (TextUtils.isEmpty(localPathFromId) || (localIdToBytes = localIdToBytes(localPathFromId)) == null) {
            return null;
        }
        return new OfflineResource(str, localIdToBytes, "image/jpeg");
    }
}
