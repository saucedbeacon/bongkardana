package o;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import androidx.annotation.Nullable;
import androidx.annotation.RawRes;
import androidx.annotation.WorkerThread;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import o.LinearLayoutCompat;

public final class getOrientation {
    private static int getMax = 0;
    private static final byte[] getMin = {80, 75, 3, 4};
    private static int length = 1;
    /* access modifiers changed from: private */
    public static final Map<String, ListPopupWindow<setVerticalGravity>> setMin = new HashMap();

    public static ListPopupWindow<setVerticalGravity> setMin(final Context context, final String str) {
        final String concat = "url_".concat(String.valueOf(str));
        return getMax(concat, (Callable<LinearLayoutCompat.DividerMode<setVerticalGravity>>) new Callable<LinearLayoutCompat.DividerMode<setVerticalGravity>>() {
            /* JADX WARNING: Removed duplicated region for block: B:13:0x003a  */
            /* JADX WARNING: Removed duplicated region for block: B:14:0x0040  */
            /* JADX WARNING: Removed duplicated region for block: B:21:0x005b  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final /* synthetic */ java.lang.Object call() throws java.lang.Exception {
                /*
                    r6 = this;
                    android.content.Context r0 = r2
                    o.setTrackDrawable r0 = o.setChildFrame.setMin(r0)
                    java.lang.String r1 = r3
                    java.lang.String r2 = r0
                    if (r2 == 0) goto L_0x0037
                    o.setTrackResource r3 = r0.setMax
                    android.util.Pair r3 = r3.setMin(r1)
                    if (r3 == 0) goto L_0x0037
                    java.lang.Object r4 = r3.first
                    com.airbnb.lottie.network.FileExtension r4 = (com.airbnb.lottie.network.FileExtension) r4
                    java.lang.Object r3 = r3.second
                    java.io.InputStream r3 = (java.io.InputStream) r3
                    com.airbnb.lottie.network.FileExtension r5 = com.airbnb.lottie.network.FileExtension.ZIP
                    if (r4 != r5) goto L_0x002a
                    java.util.zip.ZipInputStream r4 = new java.util.zip.ZipInputStream
                    r4.<init>(r3)
                    o.LinearLayoutCompat$DividerMode r3 = o.getOrientation.length((java.util.zip.ZipInputStream) r4, (java.lang.String) r1)
                    goto L_0x002e
                L_0x002a:
                    o.LinearLayoutCompat$DividerMode r3 = o.getOrientation.length((java.io.InputStream) r3, (java.lang.String) r1)
                L_0x002e:
                    V r4 = r3.length
                    if (r4 == 0) goto L_0x0037
                    V r3 = r3.length
                    o.setVerticalGravity r3 = (o.setVerticalGravity) r3
                    goto L_0x0038
                L_0x0037:
                    r3 = 0
                L_0x0038:
                    if (r3 == 0) goto L_0x0040
                    o.LinearLayoutCompat$DividerMode r0 = new o.LinearLayoutCompat$DividerMode
                    r0.<init>(r3)
                    goto L_0x0047
                L_0x0040:
                    o.setTitleMargin.getMin()
                    o.LinearLayoutCompat$DividerMode r0 = r0.getMax(r1, r2)
                L_0x0047:
                    java.lang.String r1 = r0
                    if (r1 == 0) goto L_0x0060
                    V r1 = r0.length
                    if (r1 == 0) goto L_0x0060
                    o.updateFocusedState r1 = o.updateFocusedState.setMax()
                    java.lang.String r2 = r0
                    V r3 = r0.length
                    o.setVerticalGravity r3 = (o.setVerticalGravity) r3
                    if (r2 == 0) goto L_0x0060
                    o.PlaybackStateCompat$ErrorCode<java.lang.String, o.setVerticalGravity> r1 = r1.getMin
                    r1.put(r2, r3)
                L_0x0060:
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: o.getOrientation.AnonymousClass1.call():java.lang.Object");
            }
        });
    }

    public static ListPopupWindow<setVerticalGravity> length(final Context context, final String str, @Nullable final String str2) {
        return getMax(str2, (Callable<LinearLayoutCompat.DividerMode<setVerticalGravity>>) new Callable<LinearLayoutCompat.DividerMode<setVerticalGravity>>() {
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final /* synthetic */ java.lang.Object call() {
                /*
                    r6 = this;
                    android.content.Context r0 = r2
                    o.setTrackDrawable r0 = o.setChildFrame.setMin(r0)
                    java.lang.String r1 = r3
                    java.lang.String r2 = r0
                    if (r2 == 0) goto L_0x0037
                    o.setTrackResource r3 = r0.setMax
                    android.util.Pair r3 = r3.setMin(r1)
                    if (r3 == 0) goto L_0x0037
                    java.lang.Object r4 = r3.first
                    com.airbnb.lottie.network.FileExtension r4 = (com.airbnb.lottie.network.FileExtension) r4
                    java.lang.Object r3 = r3.second
                    java.io.InputStream r3 = (java.io.InputStream) r3
                    com.airbnb.lottie.network.FileExtension r5 = com.airbnb.lottie.network.FileExtension.ZIP
                    if (r4 != r5) goto L_0x002a
                    java.util.zip.ZipInputStream r4 = new java.util.zip.ZipInputStream
                    r4.<init>(r3)
                    o.LinearLayoutCompat$DividerMode r3 = o.getOrientation.length((java.util.zip.ZipInputStream) r4, (java.lang.String) r1)
                    goto L_0x002e
                L_0x002a:
                    o.LinearLayoutCompat$DividerMode r3 = o.getOrientation.length((java.io.InputStream) r3, (java.lang.String) r1)
                L_0x002e:
                    V r4 = r3.length
                    if (r4 == 0) goto L_0x0037
                    V r3 = r3.length
                    o.setVerticalGravity r3 = (o.setVerticalGravity) r3
                    goto L_0x0038
                L_0x0037:
                    r3 = 0
                L_0x0038:
                    if (r3 == 0) goto L_0x0040
                    o.LinearLayoutCompat$DividerMode r0 = new o.LinearLayoutCompat$DividerMode
                    r0.<init>(r3)
                    goto L_0x0047
                L_0x0040:
                    o.setTitleMargin.getMin()
                    o.LinearLayoutCompat$DividerMode r0 = r0.getMax(r1, r2)
                L_0x0047:
                    java.lang.String r1 = r0
                    if (r1 == 0) goto L_0x0060
                    V r1 = r0.length
                    if (r1 == 0) goto L_0x0060
                    o.updateFocusedState r1 = o.updateFocusedState.setMax()
                    java.lang.String r2 = r0
                    V r3 = r0.length
                    o.setVerticalGravity r3 = (o.setVerticalGravity) r3
                    if (r2 == 0) goto L_0x0060
                    o.PlaybackStateCompat$ErrorCode<java.lang.String, o.setVerticalGravity> r1 = r1.getMin
                    r1.put(r2, r3)
                L_0x0060:
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: o.getOrientation.AnonymousClass1.call():java.lang.Object");
            }
        });
    }

    public static ListPopupWindow<setVerticalGravity> getMax(Context context, final String str) {
        final String concat = "asset_".concat(String.valueOf(str));
        final Context applicationContext = context.getApplicationContext();
        return getMax(concat, (Callable<LinearLayoutCompat.DividerMode<setVerticalGravity>>) new Callable<LinearLayoutCompat.DividerMode<setVerticalGravity>>() {
            public final /* synthetic */ Object call() throws Exception {
                return getOrientation.setMax(r2, r3, null);
            }
        });
    }

    public static ListPopupWindow<setVerticalGravity> setMax(Context context, final String str) {
        final Context applicationContext = context.getApplicationContext();
        return getMax((String) null, (Callable<LinearLayoutCompat.DividerMode<setVerticalGravity>>) new Callable<LinearLayoutCompat.DividerMode<setVerticalGravity>>((String) null) {
            public final /* synthetic */ Object call() throws Exception {
                return getOrientation.setMax(applicationContext, str, null);
            }
        });
    }

    @WorkerThread
    public static LinearLayoutCompat.DividerMode<setVerticalGravity> length(Context context, String str) {
        return setMax(context, str, "asset_".concat(String.valueOf(str)));
    }

    public static ListPopupWindow<setVerticalGravity> length(Context context, @RawRes final int i) {
        final String max = setMax(context, i);
        final WeakReference weakReference = new WeakReference(context);
        final Context applicationContext = context.getApplicationContext();
        return getMax(max, (Callable<LinearLayoutCompat.DividerMode<setVerticalGravity>>) new Callable<LinearLayoutCompat.DividerMode<setVerticalGravity>>() {
            public final /* synthetic */ Object call() throws Exception {
                Context context = (Context) r0.get();
                if (context == null) {
                    context = r3;
                }
                return getOrientation.getMax(context, r4, null);
            }
        });
    }

    public static ListPopupWindow<setVerticalGravity> setMin(Context context, @RawRes final int i) {
        final WeakReference weakReference = new WeakReference(context);
        final Context applicationContext = context.getApplicationContext();
        return getMax((String) null, (Callable<LinearLayoutCompat.DividerMode<setVerticalGravity>>) new Callable<LinearLayoutCompat.DividerMode<setVerticalGravity>>((String) null) {
            public final /* synthetic */ Object call() throws Exception {
                Context context = (Context) weakReference.get();
                if (context == null) {
                    context = applicationContext;
                }
                return getOrientation.getMax(context, i, null);
            }
        });
    }

    @WorkerThread
    public static LinearLayoutCompat.DividerMode<setVerticalGravity> getMin(Context context, @RawRes int i) {
        return getMax(context, i, setMax(context, i));
    }

    @WorkerThread
    public static LinearLayoutCompat.DividerMode<setVerticalGravity> getMax(Context context, @RawRes int i, @Nullable String str) {
        try {
            schedule min = recordMonitorOfSndMsg.setMin(recordMonitorOfSndMsg.getMin(context.getResources().openRawResource(i)));
            if (length(min).booleanValue()) {
                return length(new ZipInputStream(min.setMin()), str);
            }
            return setMin(min.setMin(), str);
        } catch (Resources.NotFoundException e) {
            return new LinearLayoutCompat.DividerMode<>((Throwable) e);
        }
    }

    private static String setMax(Context context, @RawRes int i) {
        StringBuilder sb = new StringBuilder("rawRes");
        sb.append(getMin(context) ? "_night_" : "_day_");
        sb.append(i);
        return sb.toString();
    }

    private static boolean getMin(Context context) {
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }

    public static ListPopupWindow<setVerticalGravity> getMin(final InputStream inputStream, @Nullable final String str) {
        return getMax(str, (Callable<LinearLayoutCompat.DividerMode<setVerticalGravity>>) new Callable<LinearLayoutCompat.DividerMode<setVerticalGravity>>() {
            public final /* synthetic */ Object call() throws Exception {
                return getOrientation.length(inputStream, str);
            }
        });
    }

    @WorkerThread
    public static LinearLayoutCompat.DividerMode<setVerticalGravity> length(InputStream inputStream, @Nullable String str) {
        return setMin(inputStream, str);
    }

    @WorkerThread
    private static LinearLayoutCompat.DividerMode<setVerticalGravity> setMin(InputStream inputStream, @Nullable String str) {
        try {
            return setMax(JsonReader.setMin(recordMonitorOfSndMsg.setMin(recordMonitorOfSndMsg.getMin(inputStream))), str, true);
        } finally {
            setTitleMarginStart.setMin(inputStream);
        }
    }

    private static LinearLayoutCompat.DividerMode<setVerticalGravity> setMax(JsonReader jsonReader, @Nullable String str, boolean z) {
        try {
            setVerticalGravity max = getTextOff.getMax(jsonReader);
            if (str != null) {
                updateFocusedState max2 = updateFocusedState.setMax();
                if (str != null) {
                    max2.getMin.put(str, max);
                }
            }
            LinearLayoutCompat.DividerMode<setVerticalGravity> dividerMode = new LinearLayoutCompat.DividerMode<>(max);
            if (z) {
                setTitleMarginStart.setMin(jsonReader);
            }
            return dividerMode;
        } catch (Exception e) {
            LinearLayoutCompat.DividerMode<setVerticalGravity> dividerMode2 = new LinearLayoutCompat.DividerMode<>((Throwable) e);
            if (z) {
                setTitleMarginStart.setMin(jsonReader);
            }
            return dividerMode2;
        } catch (Throwable th) {
            if (z) {
                setTitleMarginStart.setMin(jsonReader);
            }
            throw th;
        }
    }

    @WorkerThread
    public static LinearLayoutCompat.DividerMode<setVerticalGravity> length(ZipInputStream zipInputStream, @Nullable String str) {
        try {
            return setMax(zipInputStream, str);
        } finally {
            setTitleMarginStart.setMin(zipInputStream);
        }
    }

    @WorkerThread
    private static LinearLayoutCompat.DividerMode<setVerticalGravity> setMax(ZipInputStream zipInputStream, @Nullable String str) {
        HashMap hashMap = new HashMap();
        try {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            setVerticalGravity setverticalgravity = null;
            while (nextEntry != null) {
                String name = nextEntry.getName();
                if (!name.contains("__MACOSX") && !nextEntry.getName().equalsIgnoreCase("manifest.json")) {
                    if (nextEntry.getName().contains(".json")) {
                        setverticalgravity = (setVerticalGravity) setMax(JsonReader.setMin(recordMonitorOfSndMsg.setMin(recordMonitorOfSndMsg.getMin((InputStream) zipInputStream))), (String) null, false).length;
                    } else if (name.contains(".png") || name.contains(".webp") || name.contains(".jpg") || name.contains(".jpeg")) {
                        String[] split = name.split("/");
                        hashMap.put(split[split.length - 1], BitmapFactory.decodeStream(zipInputStream));
                    }
                    nextEntry = zipInputStream.getNextEntry();
                }
                zipInputStream.closeEntry();
                nextEntry = zipInputStream.getNextEntry();
            }
            if (setverticalgravity == null) {
                return new LinearLayoutCompat.DividerMode<>((Throwable) new IllegalArgumentException("Unable to parse composition"));
            }
            for (Map.Entry entry : hashMap.entrySet()) {
                setGravity max = getMax(setverticalgravity, (String) entry.getKey());
                if (max != null) {
                    max.setMin = setTitleMarginStart.getMax((Bitmap) entry.getValue(), max.getMax, max.setMax);
                }
            }
            for (Map.Entry next : setverticalgravity.setMax.entrySet()) {
                if (((setGravity) next.getValue()).setMin == null) {
                    StringBuilder sb = new StringBuilder("There is no image for ");
                    sb.append(((setGravity) next.getValue()).length);
                    return new LinearLayoutCompat.DividerMode<>((Throwable) new IllegalStateException(sb.toString()));
                }
            }
            if (str != null) {
                updateFocusedState max2 = updateFocusedState.setMax();
                if (str != null) {
                    max2.getMin.put(str, setverticalgravity);
                }
            }
            return new LinearLayoutCompat.DividerMode<>(setverticalgravity);
        } catch (IOException e) {
            return new LinearLayoutCompat.DividerMode<>((Throwable) e);
        }
    }

    private static Boolean length(schedule schedule) {
        try {
            schedule length2 = schedule.length();
            for (byte b : getMin) {
                if (length2.IsOverlapping() != b) {
                    return Boolean.FALSE;
                }
            }
            length2.close();
            return Boolean.TRUE;
        } catch (Exception unused) {
            setTitleMargin.setMax();
            return Boolean.FALSE;
        }
    }

    private static ListPopupWindow<setVerticalGravity> getMax(@Nullable final String str, Callable<LinearLayoutCompat.DividerMode<setVerticalGravity>> callable) {
        final setVerticalGravity setverticalgravity = null;
        if (str != null) {
            updateFocusedState max = updateFocusedState.setMax();
            if (str != null) {
                setverticalgravity = max.getMin.get(str);
            }
        }
        if (setverticalgravity != null) {
            return new ListPopupWindow<>(new Callable<LinearLayoutCompat.DividerMode<setVerticalGravity>>() {
                public final /* synthetic */ Object call() throws Exception {
                    return new LinearLayoutCompat.DividerMode(setVerticalGravity.this);
                }
            });
        }
        if (str != null && setMin.containsKey(str)) {
            return setMin.get(str);
        }
        ListPopupWindow<setVerticalGravity> listPopupWindow = new ListPopupWindow<>(callable);
        if (str != null) {
            listPopupWindow.length(new setHorizontalGravity<setVerticalGravity>() {
                public final /* synthetic */ void length(Object obj) {
                    getOrientation.setMin.remove(str);
                }
            });
            listPopupWindow.getMax((setHorizontalGravity<Throwable>) new setHorizontalGravity<Throwable>() {
                public final /* synthetic */ void length(Object obj) {
                    getOrientation.setMin.remove(str);
                }
            });
            setMin.put(str, listPopupWindow);
        }
        return listPopupWindow;
    }

    @WorkerThread
    public static LinearLayoutCompat.DividerMode<setVerticalGravity> setMax(Context context, String str, @Nullable String str2) {
        try {
            int i = length + 27;
            getMax = i % 128;
            int i2 = i % 2;
            int i3 = length + 101;
            getMax = i3 % 128;
            int i4 = i3 % 2;
            try {
                if ((!((Boolean) String.class.getMethod("endsWith", new Class[]{String.class}).invoke(str, new Object[]{".zip"})).booleanValue() ? '#' : ')') == '#') {
                    int i5 = length + 65;
                    getMax = i5 % 128;
                    int i6 = i5 % 2;
                    if (!((Boolean) String.class.getMethod("endsWith", new Class[]{String.class}).invoke(str, new Object[]{".lottie"})).booleanValue()) {
                        AssetManager assets = context.getAssets();
                        Object[] objArr = new Object[2];
                        objArr[1] = str;
                        objArr[0] = assets;
                        return setMin((InputStream) ((Class) upFrom.setMax(KeyEvent.getDeadChar(0, 0) + 19, ViewConfiguration.getScrollBarFadeDuration() >> 16, (char) (56348 - KeyEvent.normalizeMetaState(0)))).getMethod("getMin", new Class[]{AssetManager.class, String.class}).invoke((Object) null, objArr), str2);
                    }
                }
                AssetManager assets2 = context.getAssets();
                Object[] objArr2 = new Object[2];
                objArr2[1] = str;
                objArr2[0] = assets2;
                return length(new ZipInputStream((InputStream) ((Class) upFrom.setMax((ViewConfiguration.getPressedStateDuration() >> 16) + 19, (SystemClock.uptimeMillis() > 0 ? 1 : (SystemClock.uptimeMillis() == 0 ? 0 : -1)) - 1, (char) (56348 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)))).getMethod("getMin", new Class[]{AssetManager.class, String.class}).invoke((Object) null, objArr2)), str2);
            } catch (IOException e) {
                return new LinearLayoutCompat.DividerMode<>((Throwable) e);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    @Nullable
    private static setGravity getMax(setVerticalGravity setverticalgravity, String str) {
        for (setGravity next : setverticalgravity.setMax.values()) {
            if (next.length.equals(str)) {
                return next;
            }
        }
        return null;
    }
}
