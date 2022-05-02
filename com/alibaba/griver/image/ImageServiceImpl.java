package com.alibaba.griver.image;

import android.graphics.drawable.Drawable;
import android.widget.AbsListView;
import android.widget.ImageView;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.griver.base.common.env.GriverEnv;
import com.alibaba.griver.base.common.utils.AndroidVersionUtils;
import com.alibaba.griver.base.common.utils.ReflectUtils;
import com.alibaba.griver.image.framework.api.APImageDownLoadCallback;
import com.alibaba.griver.image.framework.api.GriverImageLoadCallback;
import com.alibaba.griver.image.framework.api.GriverImageLoadExtension;
import com.alibaba.griver.image.framework.encode.APEncodeOptions;
import com.alibaba.griver.image.framework.encode.APEncodeResult;
import com.alibaba.griver.image.framework.encode.ImageEncoder;
import com.alibaba.griver.image.framework.meta.APImageDownloadRsp;
import com.alibaba.griver.image.framework.meta.APImageInfo;
import com.alibaba.griver.image.framework.meta.APImageLoadRequest;
import com.alibaba.griver.image.framework.meta.APImageRetMsg;
import com.alibaba.griver.image.framework.mode.GriverImageLoadRequest;
import com.alibaba.griver.image.framework.utils.AlipayImageParamConverter;
import com.alibaba.griver.image.framework.utils.PathUtils;
import com.alibaba.griver.image.framework.utils.PauseOnScrollListener;
import java.io.File;

public class ImageServiceImpl implements GriverImageService {
    public void optimizeView(AbsListView absListView, AbsListView.OnScrollListener onScrollListener) {
        optimizeView(absListView, false, true, onScrollListener);
    }

    public void optimizeView(AbsListView absListView, boolean z, boolean z2, AbsListView.OnScrollListener onScrollListener) {
        if (absListView != null && !AndroidVersionUtils.isQAndAbove()) {
            AbsListView.OnScrollListener onScrollListener2 = (AbsListView.OnScrollListener) ReflectUtils.getFieldValue(AbsListView.class, "mOnScrollListener", absListView);
            if (absListView instanceof AbsListView.OnScrollListener) {
                onScrollListener = (AbsListView.OnScrollListener) absListView;
                onScrollListener2 = onScrollListener;
            }
            if (onScrollListener == null) {
                onScrollListener = onScrollListener2;
            } else if (!(onScrollListener2 == null || onScrollListener == onScrollListener2)) {
                throw new IllegalStateException("This listView has been set OnScrollerListener. Please check whether conflicted");
            }
            try {
                absListView.setOnScrollListener(new PauseOnScrollListener(z, z2, onScrollListener));
            } catch (Throwable th) {
                StringBuilder sb = new StringBuilder("optimizeView listview setOnScrollListener exp: ");
                sb.append(th.toString());
                RVLogger.d(sb.toString());
            }
        }
    }

    public void loadImage(final APImageLoadRequest aPImageLoadRequest, String str) {
        if (aPImageLoadRequest.width == Integer.MAX_VALUE) {
            aPImageLoadRequest.width = 0;
        }
        if (aPImageLoadRequest.height == Integer.MAX_VALUE) {
            aPImageLoadRequest.height = 0;
        }
        GriverImageLoadRequest griverImageLoadRequest = new GriverImageLoadRequest();
        griverImageLoadRequest.context = GriverEnv.getApplicationContext();
        griverImageLoadRequest.target = aPImageLoadRequest.imageView;
        griverImageLoadRequest.width = aPImageLoadRequest.width;
        griverImageLoadRequest.height = aPImageLoadRequest.height;
        griverImageLoadRequest.defaultDrawable = aPImageLoadRequest.defaultDrawable;
        griverImageLoadRequest.path = aPImageLoadRequest.path;
        griverImageLoadRequest.tag = GriverImageService.IMAGE_TAG;
        griverImageLoadRequest.callback = new GriverImageLoadCallback() {
            public void onSuccess() {
                if (aPImageLoadRequest.callback != null) {
                    APImageDownloadRsp aPImageDownloadRsp = new APImageDownloadRsp();
                    APImageRetMsg aPImageRetMsg = new APImageRetMsg();
                    aPImageRetMsg.setCode(APImageRetMsg.RETCODE.SUC);
                    aPImageDownloadRsp.setRetmsg(aPImageRetMsg);
                    aPImageLoadRequest.callback.onSucc(aPImageDownloadRsp);
                }
            }

            public void onError() {
                if (aPImageLoadRequest.callback != null) {
                    APImageDownloadRsp aPImageDownloadRsp = new APImageDownloadRsp();
                    APImageRetMsg aPImageRetMsg = new APImageRetMsg();
                    aPImageRetMsg.setCode(APImageRetMsg.RETCODE.REUSE);
                    aPImageDownloadRsp.setRetmsg(aPImageRetMsg);
                    aPImageLoadRequest.callback.onError(aPImageDownloadRsp, (Exception) null);
                }
            }
        };
        ((GriverImageLoadExtension) RVProxy.get(GriverImageLoadExtension.class)).loadImage(griverImageLoadRequest);
    }

    public void loadOriginalImage(String str, ImageView imageView, Drawable drawable, final APImageDownLoadCallback aPImageDownLoadCallback, String str2) {
        GriverImageLoadRequest griverImageLoadRequest = new GriverImageLoadRequest();
        griverImageLoadRequest.context = GriverEnv.getApplicationContext();
        griverImageLoadRequest.target = imageView;
        griverImageLoadRequest.defaultDrawable = drawable;
        griverImageLoadRequest.path = str;
        griverImageLoadRequest.tag = GriverImageService.IMAGE_TAG;
        griverImageLoadRequest.callback = new GriverImageLoadCallback() {
            public void onSuccess() {
                if (aPImageDownLoadCallback != null) {
                    APImageDownloadRsp aPImageDownloadRsp = new APImageDownloadRsp();
                    APImageRetMsg aPImageRetMsg = new APImageRetMsg();
                    aPImageRetMsg.setCode(APImageRetMsg.RETCODE.SUC);
                    aPImageDownloadRsp.setRetmsg(aPImageRetMsg);
                    aPImageDownLoadCallback.onSucc(aPImageDownloadRsp);
                }
            }

            public void onError() {
                if (aPImageDownLoadCallback != null) {
                    APImageDownloadRsp aPImageDownloadRsp = new APImageDownloadRsp();
                    APImageRetMsg aPImageRetMsg = new APImageRetMsg();
                    aPImageRetMsg.setCode(APImageRetMsg.RETCODE.REUSE);
                    aPImageDownloadRsp.setRetmsg(aPImageRetMsg);
                    aPImageDownLoadCallback.onError(aPImageDownloadRsp, (Exception) null);
                }
            }
        };
        ((GriverImageLoadExtension) RVProxy.get(GriverImageLoadExtension.class)).loadImage(griverImageLoadRequest);
    }

    public APEncodeResult compress(File file, APEncodeOptions aPEncodeOptions) {
        return AlipayImageParamConverter.from(ImageEncoder.compress(file, AlipayImageParamConverter.from(aPEncodeOptions)));
    }

    public APImageInfo parseImageInfo(String str) {
        File extractFile = PathUtils.extractFile(PathUtils.extractPath(str));
        if (extractFile != null) {
            return APImageInfo.getImageInfo(extractFile.getAbsolutePath());
        }
        return null;
    }
}
