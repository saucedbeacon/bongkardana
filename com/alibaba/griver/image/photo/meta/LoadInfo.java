package com.alibaba.griver.image.photo.meta;

import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.griver.image.framework.api.APImageDownLoadCallback;
import com.alibaba.griver.image.framework.meta.APImageDownloadRsp;
import com.alibaba.griver.image.photo.utils.ImageHelper;
import com.alibaba.griver.image.photo.utils.PhotoUtil;
import com.alibaba.griver.image.photo.widget.PhotoPreview;
import java.lang.ref.WeakReference;

public class LoadInfo implements APImageDownLoadCallback, ImageHelper.LoadListener {

    /* renamed from: a  reason: collision with root package name */
    private WeakReference<PhotoPreview> f10497a;
    private WeakReference<ImageHelper.LoadListener> b;
    public boolean isNeedFullScreen;
    public boolean isShowingPie;
    public boolean loading;
    public int loadingHeight;
    public boolean loadingOrigin;
    public int loadingWidth;
    public PhotoItem photoItem;
    public int progress;
    public String taskId;
    public int thumbHeight;
    public int thumbWidth;

    public String toString() {
        PhotoItem photoItem2 = this.photoItem;
        String photoPath = photoItem2 == null ? "null" : photoItem2.getPhotoPath();
        StringBuilder sb = new StringBuilder("path =");
        sb.append(photoPath);
        sb.append(",isLoadingOriginal = ");
        sb.append(this.loadingOrigin);
        sb.append(",progress=");
        sb.append(this.progress);
        return sb.toString();
    }

    public void onLoadProgress(LoadInfo loadInfo, int i, int i2) {
        StringBuilder sb = new StringBuilder("onLoadProgress ");
        sb.append(loadInfo.toString());
        sb.append(" ");
        sb.append(i);
        sb.append("/");
        sb.append(i2);
        RVLogger.d("LoadInfo", sb.toString());
        ImageHelper.LoadListener proxy = getProxy();
        if (proxy != null) {
            proxy.onLoadProgress(loadInfo, i, i2);
        }
    }

    public void onLoadComplete(LoadInfo loadInfo) {
        StringBuilder sb = new StringBuilder("onLoadComplete ");
        sb.append(loadInfo.toString());
        RVLogger.d("LoadInfo", sb.toString());
        ImageHelper.LoadListener proxy = getProxy();
        if (proxy != null) {
            proxy.onLoadComplete(loadInfo);
        }
    }

    public void onLoadCanceled(LoadInfo loadInfo) {
        StringBuilder sb = new StringBuilder("onLoadCanceled ");
        sb.append(loadInfo.toString());
        RVLogger.d("LoadInfo", sb.toString());
        ImageHelper.LoadListener proxy = getProxy();
        if (proxy != null) {
            proxy.onLoadCanceled(loadInfo);
        }
    }

    public void onLoadFailed(LoadInfo loadInfo, APImageDownloadRsp aPImageDownloadRsp) {
        StringBuilder sb = new StringBuilder("onLoadFailed ");
        sb.append(loadInfo.toString());
        RVLogger.d("LoadInfo", sb.toString());
        ImageHelper.LoadListener proxy = getProxy();
        if (proxy != null) {
            proxy.onLoadFailed(loadInfo, aPImageDownloadRsp);
        }
    }

    public void onSucc(APImageDownloadRsp aPImageDownloadRsp) {
        PhotoUtil.runOnMain(new Runnable() {
            public void run() {
                LoadInfo loadInfo = LoadInfo.this;
                loadInfo.onLoadComplete(loadInfo);
            }
        });
    }

    public void onProcess(String str, final int i) {
        PhotoUtil.runOnMain(new Runnable() {
            public void run() {
                LoadInfo loadInfo = LoadInfo.this;
                loadInfo.onLoadProgress(loadInfo, i, 100);
            }
        });
    }

    public void onError(final APImageDownloadRsp aPImageDownloadRsp, Exception exc) {
        PhotoUtil.runOnMain(new Runnable() {
            public void run() {
                LoadInfo loadInfo = LoadInfo.this;
                loadInfo.onLoadFailed(loadInfo, aPImageDownloadRsp);
            }
        });
    }

    public void setPhotoPreview(PhotoPreview photoPreview) {
        if (photoPreview == null) {
            this.f10497a = null;
        }
        this.f10497a = new WeakReference<>(photoPreview);
    }

    public PhotoPreview getPhotoPreview() {
        WeakReference<PhotoPreview> weakReference = this.f10497a;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public void setProxy(ImageHelper.LoadListener loadListener) {
        if (loadListener == null) {
            this.b = null;
        } else {
            this.b = new WeakReference<>(loadListener);
        }
    }

    public ImageHelper.LoadListener getProxy() {
        WeakReference<ImageHelper.LoadListener> weakReference = this.b;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }
}
