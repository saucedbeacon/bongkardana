package com.alibaba.griver.image.photo;

import android.app.Activity;
import android.os.Bundle;
import com.alibaba.ariver.kernel.common.service.executor.ExecutorType;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.griver.base.common.executor.GriverExecutors;
import com.alibaba.griver.image.photo.listener.PhotoBrowseListener;
import com.alibaba.griver.image.photo.listener.PhotoSelectListener;
import com.alibaba.griver.image.photo.meta.PhotoInfo;
import com.alibaba.griver.image.photo.meta.PhotoItem;
import com.alibaba.griver.image.photo.meta.PhotoMenu;
import com.alibaba.griver.image.photo.meta.PhotoParam;
import com.alibaba.griver.image.photo.utils.ImageHelper;
import com.alibaba.griver.image.photo.utils.PhotoUtil;
import com.alipay.multimedia.adjuster.api.APMSandboxProcessor;
import com.alipay.multimedia.adjuster.api.data.APMSaveReq;
import com.alipay.multimedia.adjuster.utils.PathUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhotoContext {
    public static final String FILE_SCHEME = "file://";
    public static final String TAG = "PhotoContext";
    public static Map<String, PhotoContext> contextMap = new HashMap();
    public String contextIndex;
    public boolean editSent;
    public boolean gridPageRunning;
    public List<PhotoItem> photoList = new ArrayList();
    public PhotoResolver photoResolver;
    public Map<String, Map<String, Object>> photosExtraInfo;
    public PhotoBrowseListener previewListener;
    public boolean previewPageRunning;
    public PhotoSelectListener selectListener;
    public boolean selectSent;
    public List<PhotoItem> selectedList = new ArrayList();
    public boolean userOriginPhoto;

    private void a(Activity activity, boolean z) {
    }

    public static void remove(String str) {
        if (contextMap.containsKey(str)) {
            contextMap.remove(str);
        }
    }

    public static PhotoContext get(String str) {
        PhotoContext photoContext;
        if (contextMap.containsKey(str)) {
            photoContext = contextMap.get(str);
        } else {
            PhotoContext photoContext2 = new PhotoContext(str);
            contextMap.put(str, photoContext2);
            photoContext = photoContext2;
        }
        StringBuilder sb = new StringBuilder("context map size ");
        sb.append(contextMap.size());
        RVLogger.d(TAG, sb.toString());
        return photoContext;
    }

    private PhotoContext(String str) {
        this.contextIndex = str;
        this.userOriginPhoto = false;
        this.previewPageRunning = false;
        this.selectSent = false;
        this.gridPageRunning = false;
        this.editSent = false;
    }

    public void sendDeletedPhoto() {
        if (this.previewListener != null) {
            ArrayList arrayList = new ArrayList();
            Bundle bundle = new Bundle();
            for (PhotoItem add : this.photoList) {
                arrayList.add(add);
            }
            StringBuilder sb = new StringBuilder("sendDeletePhoto size ");
            sb.append(arrayList.size());
            RVLogger.d(TAG, sb.toString());
            this.previewListener.onPhotoDelete(arrayList, bundle);
        }
    }

    public void sendSelectedPhoto(Activity activity, float f, int i, Runnable runnable, boolean z) {
        Runnable runnable2 = runnable;
        if (this.selectListener == null) {
            a(runnable2);
        } else if (this.selectedList.isEmpty()) {
            RVLogger.d(TAG, "no photo selected!");
            a(runnable2);
        } else {
            final Bundle bundle = new Bundle();
            bundle.putBoolean(PhotoParam.USE_ORIGIN_PHOTO, this.userOriginPhoto);
            ArrayList arrayList = new ArrayList();
            for (PhotoItem next : this.selectedList) {
                arrayList.add(next);
                a(next);
            }
            StringBuilder sb = new StringBuilder("sendSelectedPhoto size ");
            sb.append(arrayList.size());
            RVLogger.d(TAG, sb.toString());
            if (PhotoUtil.isQCompact()) {
                RVLogger.d(TAG, "QCompact case.");
                final Activity activity2 = activity;
                a(activity, true);
                final ArrayList arrayList2 = arrayList;
                final float f2 = f;
                final Runnable runnable3 = runnable;
                final int i2 = i;
                final boolean z2 = z;
                GriverExecutors.getExecutor(ExecutorType.NORMAL).execute(new Runnable() {
                    public void run() {
                        long currentTimeMillis = System.currentTimeMillis();
                        PhotoContext.this.a((List<PhotoInfo>) arrayList2, activity2);
                        StringBuilder sb = new StringBuilder("Image copy cost = ");
                        sb.append(System.currentTimeMillis() - currentTimeMillis);
                        RVLogger.d(PhotoContext.TAG, sb.toString());
                        PhotoContext.this.a(f2, activity2, runnable3, bundle, arrayList2, i2, z2);
                    }
                });
                return;
            }
            Activity activity3 = activity;
            a(f, activity, runnable, bundle, arrayList, i, z);
        }
    }

    /* access modifiers changed from: private */
    public void a(List<PhotoInfo> list, Activity activity) {
        RVLogger.d(TAG, "doCopyInQ###");
        for (int i = 0; i < list.size(); i++) {
            PhotoInfo photoInfo = list.get(i);
            if (photoInfo.getMediaType() == 0 && photoInfo.getPhotoPath().startsWith(PathUtils.CONTENT_SCHEMA)) {
                String photoPath = photoInfo.getPhotoPath();
                String copyContentUriFile = APMSandboxProcessor.copyContentUriFile(new APMSaveReq.Builder(photoInfo.getPhotoPath(), ImageHelper.getBizType()).context(activity.getApplicationContext()).build());
                photoInfo.shadowPathInQ = photoInfo.getPhotoPath();
                photoInfo.setPhotoPath(FILE_SCHEME.concat(String.valueOf(copyContentUriFile)));
                StringBuilder sb = new StringBuilder("Copy ");
                sb.append(photoPath);
                sb.append(" to ");
                sb.append(copyContentUriFile);
                RVLogger.d(TAG, sb.toString());
            }
        }
    }

    /* access modifiers changed from: private */
    public void a(float f, Activity activity, final Runnable runnable, final Bundle bundle, final List<PhotoInfo> list, int i, boolean z) {
        activity.runOnUiThread(new Runnable() {
            public void run() {
                RVLogger.d(PhotoContext.TAG, "No need beauty.");
                PhotoContext.this.selectListener.onPhotoSelected(list, bundle);
                PhotoContext.this.selectSent = true;
                PhotoContext.this.a(runnable);
            }
        });
    }

    private void a(PhotoItem photoItem) {
        Map<String, Map<String, Object>> map = this.photosExtraInfo;
        if (map != null && map.containsKey(photoItem.getPhotoPath())) {
            photoItem.extraInfo = this.photosExtraInfo.get(photoItem.getPhotoPath());
        }
    }

    /* access modifiers changed from: private */
    public void a(Runnable runnable) {
        if (runnable != null) {
            runnable.run();
        }
    }

    public boolean photoLongPressMenuClick(Activity activity, PhotoInfo photoInfo, PhotoMenu photoMenu) {
        if (this.previewListener == null || photoInfo == null) {
            return false;
        }
        StringBuilder sb = new StringBuilder("photoLongPressMenuClick ");
        sb.append(photoMenu.title);
        RVLogger.d(TAG, sb.toString());
        return this.previewListener.onLongPressMenuClick(activity, photoInfo, photoMenu);
    }
}
