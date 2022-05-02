package com.alibaba.griver.image.photo;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.griver.base.common.env.GriverEnv;
import com.alibaba.griver.image.activity.GriverPhotoPreviewActivity;
import com.alibaba.griver.image.activity.GriverPhotoSelectActivity;
import com.alibaba.griver.image.photo.listener.PhotoBrowseListener;
import com.alibaba.griver.image.photo.listener.PhotoSelectListener;
import com.alibaba.griver.image.photo.meta.PhotoInfo;
import com.alibaba.griver.image.photo.meta.PhotoItem;
import com.alibaba.griver.image.photo.meta.PhotoParam;
import com.alibaba.griver.image.photo.utils.AnimationUtil;
import com.alibaba.griver.image.photo.utils.ImageHelper;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class PhotoServiceImpl extends PhotoService {
    public static final String EXTRA_SOURCE_APP_ID = "SourceAppId";
    public static final String TAG = "PhotoServiceImpl";
    public static String sCallerAPPId;

    /* renamed from: a  reason: collision with root package name */
    private AtomicInteger f9098a = new AtomicInteger(0);

    public PhotoServiceImpl() {
        RVLogger.d("beehive-photo", "PhotoServiceImpl initialized");
    }

    public void selectPhoto(App app, Bundle bundle, PhotoSelectListener photoSelectListener) {
        selectPhoto(app, (List<PhotoInfo>) null, bundle, photoSelectListener);
    }

    private void a(App app, Bundle bundle, Intent intent) {
        bundle.putInt(PhotoParam.VIDEO_SHOW_TYPE, 1);
        intent.putExtras(bundle);
        GriverEnv.getApplicationContext().startActivity(intent);
        AnimationUtil.fadeInFadeOut(GriverEnv.getTopActivity().get());
    }

    public void selectPhoto(App app, List<PhotoInfo> list, Bundle bundle, PhotoSelectListener photoSelectListener) {
        if (photoSelectListener == null || app == null) {
            RVLogger.e(TAG, "invalid selectPhoto parameters!");
            return;
        }
        if (bundle == null) {
            bundle = new Bundle();
        }
        a(app, bundle);
        String a2 = a();
        RVLogger.d(TAG, "selectPhoto context index ".concat(String.valueOf(a2)));
        bundle.putString(PhotoParam.CONTEXT_INDEX, a2);
        bundle.putBoolean(PhotoParam.PHOTO_SELECT, true);
        PhotoContext photoContext = PhotoContext.get(a2);
        photoContext.photoList = null;
        photoContext.selectListener = photoSelectListener;
        Intent intent = new Intent(GriverEnv.getApplicationContext(), bundle.getBoolean(PhotoParam.SELECT_GRID, true) ? GriverPhotoSelectActivity.class : GriverPhotoPreviewActivity.class);
        if (list != null && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (PhotoInfo photoItem : list) {
                PhotoItem photoItem2 = new PhotoItem(photoItem);
                if (photoItem2.getSelected()) {
                    photoContext.selectedList.add(photoItem2);
                }
                arrayList.add(photoItem2);
            }
            if (!arrayList.isEmpty()) {
                photoContext.photoList = arrayList;
            }
        }
        intent.setFlags(268435456);
        a(app, bundle, intent);
    }

    public void browsePhoto(App app, List<PhotoInfo> list, Bundle bundle, PhotoBrowseListener photoBrowseListener) {
        if (app == null) {
            RVLogger.e(TAG, "invalid browsePhoto parameters!");
            return;
        }
        if (list == null) {
            list = new ArrayList<>();
        }
        String a2 = a();
        RVLogger.d(TAG, "browsePhoto context index ".concat(String.valueOf(a2)));
        PhotoContext.get(a2).previewListener = photoBrowseListener;
        if (bundle == null) {
            bundle = new Bundle();
        }
        a(app, bundle);
        bundle.putString(PhotoParam.CONTEXT_INDEX, a2);
        bundle.putString(EXTRA_SOURCE_APP_ID, app.getAppId());
        Intent intent = new Intent(GriverEnv.getApplicationContext(), bundle.getBoolean(PhotoParam.BROWSE_GRID, false) ? GriverPhotoSelectActivity.class : GriverPhotoPreviewActivity.class);
        ArrayList arrayList = new ArrayList();
        PhotoContext photoContext = PhotoContext.get(a2);
        for (int i = 0; i < list.size(); i++) {
            PhotoItem photoItem = new PhotoItem(list.get(i));
            photoItem.setPhotoIndex(i);
            if (photoItem.getSelected()) {
                photoContext.selectedList.add(photoItem);
            }
            arrayList.add(photoItem);
        }
        photoContext.photoList = arrayList;
        bundle.putInt(PhotoParam.VIDEO_SHOW_TYPE, 0);
        intent.putExtras(bundle);
        intent.setFlags(268435456);
        GriverEnv.getApplicationContext().startActivity(intent);
        AnimationUtil.fadeInFadeOut(GriverEnv.getTopActivity().get());
    }

    private String a() {
        return "photoSvs".concat(String.valueOf(this.f9098a.getAndIncrement()));
    }

    private void a(App app, Bundle bundle) {
        String str;
        String string = bundle.getString("businessId");
        if (TextUtils.isEmpty(string)) {
            String appId = app.getAppId();
            sCallerAPPId = appId;
            bundle.putString("businessId", appId);
            str = "Caller did not supply BUSINESS_ID,simply take APP_ID,which  = ".concat(String.valueOf(appId));
        } else {
            str = "Caller BUSINESS_ID = ".concat(String.valueOf(string));
        }
        RVLogger.w(TAG, str);
        ImageHelper.updateBizType(bundle.getString(PhotoParam.MULTI_MEDIA_BIZ_TYPE));
    }
}
