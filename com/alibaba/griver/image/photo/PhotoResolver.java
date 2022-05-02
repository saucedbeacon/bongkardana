package com.alibaba.griver.image.photo;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Point;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.service.executor.ExecutorType;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.griver.base.common.config.GriverConfig;
import com.alibaba.griver.base.common.executor.GriverExecutors;
import com.alibaba.griver.image.GriverImageService;
import com.alibaba.griver.image.R;
import com.alibaba.griver.image.framework.api.APImageFormat;
import com.alibaba.griver.image.framework.meta.APImageInfo;
import com.alibaba.griver.image.photo.meta.BucketInfo;
import com.alibaba.griver.image.photo.meta.PhotoItem;
import com.alibaba.griver.image.photo.meta.PhotoParam;
import com.alibaba.griver.image.photo.utils.ImageObserver;
import com.alibaba.griver.image.photo.utils.PhotoUtil;
import com.alipay.multimedia.adjuster.api.APMSandboxProcessor;
import com.j256.ormlite.field.FieldType;
import id.dana.sendmoney.summary.SummaryActivity;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;

public class PhotoResolver {
    public static final String TAG = "PhotoResolver";

    /* renamed from: a  reason: collision with root package name */
    private String f10491a;
    private int b;
    private ContentResolver c;
    private volatile Map<String, List<PhotoItem>> d;
    private volatile List<PhotoItem> e;
    private volatile List<BucketInfo> f;
    private volatile Map<String, BucketInfo> g;
    private boolean h;
    private LinkedHashSet<String> i;
    /* access modifiers changed from: private */
    public BucketUpdateListener j;
    private SimpleDateFormat k;
    private GriverImageService l;
    private volatile Map<String, List<PhotoItem>> m;
    private volatile List<PhotoItem> n;

    /* renamed from: o  reason: collision with root package name */
    private volatile List<BucketInfo> f10492o;
    private Handler p = new Handler(Looper.getMainLooper());
    private boolean q;
    private volatile int r;
    private volatile int s;
    /* access modifiers changed from: private */
    public SparseArray<String> t;
    /* access modifiers changed from: private */
    public Set<String> u = new HashSet();

    public interface BucketUpdateListener {
        void onScanFinished();

        void onScanStep();
    }

    public PhotoResolver(Context context, BucketUpdateListener bucketUpdateListener) {
        a(context);
        Context applicationContext = context.getApplicationContext();
        this.j = bucketUpdateListener;
        this.c = applicationContext.getContentResolver();
        this.b = PhotoParam.DEFAULT_MIN_PHOTO_SIZE;
        this.h = false;
        this.t = new SparseArray<>();
    }

    public void setBucketListener(BucketUpdateListener bucketUpdateListener) {
        this.j = bucketUpdateListener;
    }

    public void setAllBucketName(String str) {
        this.f10491a = str;
    }

    public void setEnableGif(boolean z) {
        this.h = z;
    }

    public void setMinPhotoSize(int i2) {
        this.b = i2;
    }

    public void setMinPhotoWidth(int i2) {
        this.r = i2;
    }

    public void setMinPhotoHeight(int i2) {
        this.s = i2;
    }

    public void setSelectedPhotoPaths(LinkedHashSet<String> linkedHashSet) {
        this.i = linkedHashSet;
    }

    public List<PhotoItem> getBucketList(String str) {
        return this.d.get(str);
    }

    public List<BucketInfo> getBucketList() {
        return this.f;
    }

    public void asyncScanPhotoAndVideo(final boolean z, boolean z2) {
        b();
        RVLogger.d("PhotoDisplayLink", "Fire async scan job.");
        GriverExecutors.getExecutor(ExecutorType.NORMAL).execute(new Runnable() {
            public void run() {
                Cursor cursor;
                Cursor access$200;
                RVLogger.d("PhotoDisplayLink", "Async scan started.");
                long currentTimeMillis = System.currentTimeMillis();
                if (z) {
                    cursor = PhotoResolver.this.e();
                    if (!TextUtils.equals(GriverConfig.getConfig("disable_photo_thumbnail_scan", "false"), SummaryActivity.CHECKED)) {
                        PhotoResolver.this.a();
                    }
                } else {
                    cursor = null;
                }
                if (cursor == null || !cursor.moveToLast()) {
                    RVLogger.d("PhotoDisplayLink", "asyncScanPhotoAndVideo(), No img!");
                }
                int i = 0;
                do {
                    access$200 = PhotoResolver.this.a(cursor, true);
                    if (access$200 != null) {
                        i++;
                    }
                } while (PhotoResolver.this.a(access$200));
                if (cursor != null) {
                    cursor.close();
                }
                StringBuilder sb = new StringBuilder("Async scan finished, costTime = ");
                sb.append(System.currentTimeMillis() - currentTimeMillis);
                sb.append(",fileCount = ");
                sb.append(i);
                sb.append("imageThumbCount =");
                sb.append(PhotoResolver.this.t.size());
                RVLogger.d("PhotoDisplayLink", sb.toString());
                PhotoResolver.this.i();
                PhotoResolver.this.d();
                ImageObserver.getInstance().active(new ArrayList(PhotoResolver.this.u));
            }
        });
    }

    /* access modifiers changed from: private */
    public void a() {
        RVLogger.e(TAG, "queryThumbnailInfo:###");
        long currentTimeMillis = System.currentTimeMillis();
        Cursor f2 = f();
        if (f2 != null) {
            try {
                if (f2.moveToFirst()) {
                    do {
                        this.t.put(f2.getInt(f2.getColumnIndex("image_id")), f2.getString(f2.getColumnIndex("_data")));
                    } while (f2.moveToNext());
                }
                f2.close();
            } catch (Throwable th) {
                StringBuilder sb = new StringBuilder("Parse thumbnail exception :");
                sb.append(th.getMessage());
                RVLogger.e(TAG, sb.toString());
            }
        }
        StringBuilder sb2 = new StringBuilder("Query thumbnail cost time = ");
        sb2.append(System.currentTimeMillis() - currentTimeMillis);
        RVLogger.d(TAG, sb2.toString());
    }

    private void a(Context context) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(context.getString(R.string.griver_image_str_media_time_pattern));
        this.k = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
    }

    private void b() {
        RVLogger.d("PhotoDisplayLink", "initPhotoBucket");
        this.d = new HashMap();
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.g = new HashMap();
        this.m = new HashMap();
        this.n = new ArrayList();
        this.f10492o = new ArrayList();
        this.t = new SparseArray<>();
    }

    /* access modifiers changed from: private */
    public Cursor a(Cursor cursor, boolean z) {
        if (((cursor == null || cursor.isBeforeFirst() || cursor.isAfterLast()) ? -1 : cursor.getLong(cursor.getColumnIndex("date_added")) * 1000) < 0) {
            RVLogger.d("mediaScan", "both cursor no more data!");
            return null;
        }
        b(cursor, z);
        return cursor;
    }

    private String c() {
        StringBuilder sb = new StringBuilder();
        sb.append("date_added");
        sb.append(" ASC");
        sb.append(", _id");
        sb.append(" ASC");
        return sb.toString();
    }

    /* access modifiers changed from: private */
    public void d() {
        this.p.post(new Runnable() {
            public void run() {
                PhotoResolver.this.g();
                if (PhotoResolver.this.j != null) {
                    RVLogger.d("PhotoDisplayLink", "OnScanFinished");
                    PhotoResolver.this.j.onScanFinished();
                }
            }
        });
    }

    /* access modifiers changed from: private */
    public boolean a(Cursor cursor) {
        return cursor != null && cursor.moveToPrevious() && !cursor.isBeforeFirst();
    }

    /* access modifiers changed from: private */
    public Cursor e() {
        Cursor cursor;
        try {
            cursor = this.c.query(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, new String[]{FieldType.FOREIGN_ID_FIELD_SUFFIX, "bucket_display_name", "_data", "_size", "mime_type", "width", "height", "orientation", "datetaken", "date_added", "date_modified", "latitude", "longitude"}, (String) null, (String[]) null, c());
        } catch (Exception e2) {
            StringBuilder sb = new StringBuilder("getImageCursor exception:");
            sb.append(e2.getMessage());
            RVLogger.d(TAG, sb.toString());
            cursor = null;
        }
        if (cursor == null || !cursor.isClosed()) {
            return cursor;
        }
        return null;
    }

    private Cursor f() {
        Cursor cursor;
        try {
            cursor = this.c.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, new String[]{"image_id", "_data"}, (String) null, (String[]) null, (String) null);
        } catch (Throwable th) {
            StringBuilder sb = new StringBuilder("GetThumbnailCursor exception :");
            sb.append(th.getMessage());
            RVLogger.e(TAG, sb.toString());
            cursor = null;
        }
        if (cursor == null || !cursor.isClosed()) {
            return cursor;
        }
        return null;
    }

    /* access modifiers changed from: private */
    public void g() {
        if (!this.f.isEmpty() && !this.e.isEmpty()) {
            if (this.f.get(0).allPhoto) {
                this.f.remove(0);
            }
            BucketInfo bucketInfo = new BucketInfo(this.f10491a, 0, this.e.get(0), true);
            bucketInfo.allPhoto = true;
            this.f.add(0, bucketInfo);
            this.d.put(this.f10491a, this.e);
        }
    }

    private boolean b(Cursor cursor, boolean z) {
        Cursor cursor2 = cursor;
        if (cursor2.getLong(cursor2.getColumnIndex("_size")) < ((long) this.b)) {
            return false;
        }
        String string = cursor2.getString(cursor2.getColumnIndex("_data"));
        String concat = PhotoContext.FILE_SCHEME.concat(String.valueOf(string));
        if (PhotoUtil.isQCompact()) {
            int i2 = cursor2.getInt(cursor2.getColumnIndex(FieldType.FOREIGN_ID_FIELD_SUFFIX));
            StringBuilder sb = new StringBuilder();
            sb.append(MediaStore.Images.Media.EXTERNAL_CONTENT_URI.toString());
            sb.append(File.separator);
            sb.append(i2);
            concat = Uri.parse(sb.toString()).toString();
        } else {
            try {
                if (!TextUtils.isEmpty(string) && !string.contains("cache") && string.contains("/")) {
                    this.u.add(string.substring(0, string.lastIndexOf("/")));
                }
            } catch (Exception e2) {
                StringBuilder sb2 = new StringBuilder("Parse observer path exception :");
                sb2.append(e2.getMessage());
                RVLogger.e(TAG, sb2.toString());
            }
        }
        if (TextUtils.isEmpty(string)) {
            RVLogger.d(TAG, "Photo path is invalid.");
            return false;
        } else if (!PhotoUtil.isQVersion() && !APMSandboxProcessor.checkFileExist(concat)) {
            return false;
        } else {
            boolean equals = TextUtils.equals(cursor2.getString(cursor2.getColumnIndex("mime_type")), "image/gif");
            if (!this.h && equals) {
                return false;
            }
            long j2 = cursor2.getLong(cursor2.getColumnIndex("_size"));
            long j3 = cursor2.getLong(cursor2.getColumnIndex("date_modified")) * 1000;
            int i3 = cursor2.getInt(cursor2.getColumnIndex("orientation"));
            int i4 = cursor2.getInt(cursor2.getColumnIndex("width"));
            int i5 = cursor2.getInt(cursor2.getColumnIndex("height"));
            if (i4 <= 0 || i5 <= 0) {
                try {
                    Point a2 = a(string, i4, i5, equals);
                    i4 = a2.x;
                    i5 = a2.y;
                } catch (Exception e3) {
                    StringBuilder sb3 = new StringBuilder("Update size exception :");
                    sb3.append(e3.getMessage());
                    RVLogger.e(TAG, sb3.toString());
                }
            }
            if (i4 <= 0 || i5 <= 0) {
                StringBuilder sb4 = new StringBuilder("Invalid size : w = ");
                sb4.append(i4);
                sb4.append("h = ");
                sb4.append(i5);
                RVLogger.w(TAG, sb4.toString());
            }
            if (i4 < this.r || i5 < this.s) {
                StringBuilder sb5 = new StringBuilder("Ignore photo when w=");
                sb5.append(i4);
                sb5.append(",h=");
                sb5.append(i5);
                RVLogger.d(TAG, sb5.toString());
                return false;
            }
            double d2 = cursor2.getDouble(cursor2.getColumnIndex("latitude"));
            int columnIndex = cursor2.getColumnIndex("longitude");
            boolean z2 = equals;
            String str = FieldType.FOREIGN_ID_FIELD_SUFFIX;
            double d3 = cursor2.getDouble(columnIndex);
            PhotoItem photoItem = new PhotoItem(concat);
            a(photoItem, j3);
            a(photoItem);
            photoItem.setPhotoSize(j2);
            photoItem.setModifiedTime(j3);
            photoItem.setPhotoOrientation(i3);
            photoItem.setPhotoHeight(i5);
            photoItem.setPhotoWidth(i4);
            photoItem.setLatitude(d2);
            photoItem.setLongitude(d3);
            String string2 = cursor2.getString(cursor2.getColumnIndex("bucket_display_name"));
            int i6 = cursor2.getInt(cursor2.getColumnIndex(str));
            photoItem.setThumbPath(this.t.get(i6));
            photoItem.setMediaId(i6);
            photoItem.setIsAlbumMedia(true);
            if (z2) {
                photoItem.setMediaSubType(100);
            }
            return a(photoItem, string2, z);
        }
    }

    @NonNull
    private Point a(String str, int i2, int i3, boolean z) {
        Point point = new Point(i2, i3);
        if (this.l == null) {
            this.l = (GriverImageService) RVProxy.get(GriverImageService.class);
        }
        APImageInfo parseImageInfo = this.l.parseImageInfo(str);
        if (parseImageInfo != null) {
            point.x = parseImageInfo.width;
            point.y = parseImageInfo.height;
            StringBuilder sb = new StringBuilder("Update wh to ");
            sb.append(i2);
            sb.append(", ");
            sb.append(i3);
            RVLogger.d(TAG, sb.toString());
        }
        return point;
    }

    private void a(PhotoItem photoItem) {
        LinkedHashSet<String> linkedHashSet = this.i;
        if (linkedHashSet != null && linkedHashSet.contains(photoItem.getPhotoPath())) {
            photoItem.setSelected(true);
        }
    }

    private void a(PhotoItem photoItem, long j2) {
        try {
            photoItem.modifyTimeDesc = this.k.format(new Date(j2));
        } catch (Exception unused) {
        }
    }

    private boolean a(PhotoItem photoItem, String str, boolean z) {
        String photoPath = photoItem.getPhotoPath();
        int i2 = 0;
        if (!this.h && photoPath.toLowerCase().endsWith(APImageFormat.SUFFIX_GIF)) {
            RVLogger.d(TAG, "select gif not enabled.");
            return false;
        } else if (photoItem.getPhotoSize() < ((long) this.b)) {
            RVLogger.d(TAG, "ignore small file ".concat(String.valueOf(photoPath)));
            return false;
        } else {
            BucketInfo bucketInfo = this.g.get(str);
            if (bucketInfo == null) {
                bucketInfo = new BucketInfo(str, 0, photoItem);
                this.g.put(str, bucketInfo);
                this.f10492o.add(z ? this.f10492o.size() : 0, bucketInfo);
            }
            if (!z) {
                bucketInfo.setPhoto(photoItem);
            }
            bucketInfo.increaseCount();
            List list = this.m.get(str);
            if (list == null) {
                list = new ArrayList();
                this.m.put(str, list);
            }
            this.n.add(z ? this.n.size() : 0, photoItem);
            if (z) {
                i2 = list.size();
            }
            list.add(i2, photoItem);
            if (!this.q) {
                return true;
            }
            h();
            return true;
        }
    }

    private void h() {
        if ((this.j != null && this.n.size() == 100) || (this.n.size() > 100 && this.n.size() % 1000 == 0)) {
            if (TextUtils.equals(GriverConfig.getConfig("disable_bee_dialog_manager", ""), SummaryActivity.CHECKED)) {
                RVLogger.d("PhotoDisplayLink", "Config to disable step update.");
                return;
            }
            i();
            RVLogger.d("PhotoDisplayLink", "Do step update.");
            this.p.post(new Runnable() {
                public void run() {
                    if (PhotoResolver.this.j != null) {
                        PhotoResolver.this.g();
                        PhotoResolver.this.j.onScanStep();
                    }
                }
            });
        }
    }

    /* access modifiers changed from: private */
    public void i() {
        Map<String, List<PhotoItem>> map = this.m;
        List<PhotoItem> list = this.n;
        List<BucketInfo> list2 = this.f10492o;
        this.m = new HashMap();
        this.n = new ArrayList();
        this.f10492o = new ArrayList();
        this.m.putAll(map);
        this.n.addAll(list);
        this.f10492o.addAll(list2);
        this.d = map;
        this.e = list;
        this.f = list2;
    }

    public void setEnableStepScan(boolean z) {
        this.q = z;
    }
}
