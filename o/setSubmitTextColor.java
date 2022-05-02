package o;

import android.app.Activity;
import android.content.ContentResolver;
import android.database.ContentObserver;
import android.provider.MediaStore;
import id.dana.lib.gcontainer.app.bridge.constant.H5ActionJSApi;
import o.TitleBarRightButtonView;

public final class setSubmitTextColor {
    /* access modifiers changed from: private */
    public static final String[] getMax = {"_display_name", "_data", "date_added"};
    /* access modifiers changed from: private */
    public static final String getMin = MediaStore.Images.Media.EXTERNAL_CONTENT_URI.toString();
    private final Activity length;

    private setSubmitTextColor(Activity activity) {
        this.length = activity;
    }

    public static TitleBarRightButtonView.AnonymousClass1<String> getMin(Activity activity) {
        setSubmitTextColor setsubmittextcolor = new setSubmitTextColor(activity);
        return setStateOn.getMin(setsubmittextcolor.length, "android.permission.READ_EXTERNAL_STORAGE") ? TitleBarRightButtonView.AnonymousClass1.create(new setCancelTextColor(setsubmittextcolor, setsubmittextcolor.length.getContentResolver())) : TitleBarRightButtonView.AnonymousClass1.error((Throwable) new SecurityException("Permission not granted"));
    }

    /* access modifiers changed from: private */
    public static boolean getMax(String str) {
        return str.toLowerCase().contains(H5ActionJSApi.SCREENSHOT) || str.contains("截屏") || str.contains("截图");
    }

    /* access modifiers changed from: private */
    public static boolean setMax(long j, long j2) {
        return Math.abs(j - j2) <= 10;
    }

    static /* synthetic */ void getMax(setSubmitTextColor setsubmittextcolor, final ContentResolver contentResolver, final TitleBarRightButtonView.AnonymousClass2 r4) {
        AnonymousClass5 r0 = new ContentObserver() {
            /* JADX WARNING: Code restructure failed: missing block: B:14:0x00a2, code lost:
                if (r1 != null) goto L_0x00ae;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:19:0x00ac, code lost:
                if (r1 == null) goto L_0x00b1;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:20:0x00ae, code lost:
                r1.close();
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void onChange(boolean r11, android.net.Uri r12) {
                /*
                    r10 = this;
                    java.lang.String r0 = "DanaScreenshotDetector"
                    o.LogCustomizeControl$getMin r1 = o.LogCustomizeControl.length(r0)
                    java.lang.StringBuilder r2 = new java.lang.StringBuilder
                    java.lang.String r3 = "onChange: "
                    r2.<init>(r3)
                    r2.append(r11)
                    java.lang.String r3 = ", "
                    r2.append(r3)
                    java.lang.String r3 = r12.toString()
                    r2.append(r3)
                    java.lang.String r2 = r2.toString()
                    r3 = 0
                    java.lang.Object[] r4 = new java.lang.Object[r3]
                    r1.length(r2, r4)
                    java.lang.String r1 = r12.toString()
                    java.lang.String r2 = o.setSubmitTextColor.getMin
                    boolean r1 = r1.startsWith(r2)
                    if (r1 == 0) goto L_0x00b1
                    r1 = 0
                    android.content.ContentResolver r4 = r3     // Catch:{ Exception -> 0x00a0, all -> 0x00a5 }
                    java.lang.String[] r6 = o.setSubmitTextColor.getMax     // Catch:{ Exception -> 0x00a0, all -> 0x00a5 }
                    r7 = 0
                    r8 = 0
                    java.lang.String r9 = "date_added DESC"
                    r5 = r12
                    android.database.Cursor r1 = r4.query(r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x00a0, all -> 0x00a5 }
                    if (r1 == 0) goto L_0x00a2
                    boolean r2 = r1.moveToFirst()     // Catch:{ Exception -> 0x00a0, all -> 0x00a5 }
                    if (r2 == 0) goto L_0x00a2
                    java.lang.String r2 = "_data"
                    int r2 = r1.getColumnIndex(r2)     // Catch:{ Exception -> 0x00a0, all -> 0x00a5 }
                    java.lang.String r2 = r1.getString(r2)     // Catch:{ Exception -> 0x00a0, all -> 0x00a5 }
                    java.lang.String r4 = "date_added"
                    int r4 = r1.getColumnIndex(r4)     // Catch:{ Exception -> 0x00a0, all -> 0x00a5 }
                    long r4 = r1.getLong(r4)     // Catch:{ Exception -> 0x00a0, all -> 0x00a5 }
                    long r6 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x00a0, all -> 0x00a5 }
                    r8 = 1000(0x3e8, double:4.94E-321)
                    long r6 = r6 / r8
                    o.LogCustomizeControl$getMin r0 = o.LogCustomizeControl.length(r0)     // Catch:{ Exception -> 0x00a0, all -> 0x00a5 }
                    java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00a0, all -> 0x00a5 }
                    java.lang.String r9 = "path: "
                    r8.<init>(r9)     // Catch:{ Exception -> 0x00a0, all -> 0x00a5 }
                    r8.append(r2)     // Catch:{ Exception -> 0x00a0, all -> 0x00a5 }
                    java.lang.String r9 = ", dateAdded: "
                    r8.append(r9)     // Catch:{ Exception -> 0x00a0, all -> 0x00a5 }
                    r8.append(r4)     // Catch:{ Exception -> 0x00a0, all -> 0x00a5 }
                    java.lang.String r9 = ", currentTime: "
                    r8.append(r9)     // Catch:{ Exception -> 0x00a0, all -> 0x00a5 }
                    r8.append(r6)     // Catch:{ Exception -> 0x00a0, all -> 0x00a5 }
                    java.lang.String r8 = r8.toString()     // Catch:{ Exception -> 0x00a0, all -> 0x00a5 }
                    java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x00a0, all -> 0x00a5 }
                    r0.length(r8, r3)     // Catch:{ Exception -> 0x00a0, all -> 0x00a5 }
                    boolean r0 = o.setSubmitTextColor.getMax(r2)     // Catch:{ Exception -> 0x00a0, all -> 0x00a5 }
                    if (r0 == 0) goto L_0x00a2
                    boolean r0 = o.setSubmitTextColor.setMax(r6, r4)     // Catch:{ Exception -> 0x00a0, all -> 0x00a5 }
                    if (r0 == 0) goto L_0x00a2
                    o.TitleBarRightButtonView$2 r0 = r4     // Catch:{ Exception -> 0x00a0, all -> 0x00a5 }
                    r0.onNext(r2)     // Catch:{ Exception -> 0x00a0, all -> 0x00a5 }
                    goto L_0x00a2
                L_0x00a0:
                    goto L_0x00ac
                L_0x00a2:
                    if (r1 == 0) goto L_0x00b1
                    goto L_0x00ae
                L_0x00a5:
                    r11 = move-exception
                    if (r1 == 0) goto L_0x00ab
                    r1.close()
                L_0x00ab:
                    throw r11
                L_0x00ac:
                    if (r1 == 0) goto L_0x00b1
                L_0x00ae:
                    r1.close()
                L_0x00b1:
                    super.onChange(r11, r12)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: o.setSubmitTextColor.AnonymousClass5.onChange(boolean, android.net.Uri):void");
            }
        };
        contentResolver.registerContentObserver(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, true, r0);
        r4.setCancellable(new setCancelVisible(contentResolver, r0));
    }
}
