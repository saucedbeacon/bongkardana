package o;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.provider.Settings;
import com.google.android.exoplayer2.trackselection.AdaptiveTrackSelection;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.maps.model.LatLng;
import id.dana.richview.CurrencyTextView;
import java.util.Locale;
import kotlin.Metadata;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0010\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH\u0007R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lid/dana/utils/ExifHelper;", "", "()V", "TAG", "", "kotlin.jvm.PlatformType", "getOrientation", "", "exifOrientation", "getOrientationFromExif", "source", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class WheelView {
    @NotNull
    public static final WheelView length = new WheelView();
    private static final String setMax = WheelView.class.getName();

    public final class ScrollerTask {

        /* renamed from: o.WheelView$ScrollerTask$2  reason: invalid class name */
        public final class AnonymousClass2 {
            public static String getMin(String str, boolean z) {
                String str2;
                if (z) {
                    str2 = str.replace("+62", "0");
                } else {
                    str2 = str.replace("62-", "0");
                }
                return str2.replace("*", "•");
            }

            public static String getMax(String str, String str2) {
                if (str == null) {
                    return null;
                }
                String substring = str.substring(0, str.length() - (str2.length() * 2));
                String substring2 = str.substring(str.length() - str2.length());
                StringBuilder sb = new StringBuilder();
                sb.append(substring);
                sb.append(str2);
                sb.append(substring2);
                return sb.toString();
            }
        }

        public static boolean getMax(Context context) {
            return setStateOn.getMin(context, "android.permission.ACCESS_FINE_LOCATION");
        }

        @SuppressLint({"NewApi"})
        public static boolean length(Context context) {
            if (CornerMarkingDataProvider.Mean$Arithmetic()) {
                return ((LocationManager) context.getSystemService("location")).isLocationEnabled();
            }
            if (!CornerMarkingDataProvider.getMin()) {
                return Settings.Secure.getInt(context.getContentResolver(), "location_mode", 0) != 0;
            }
            LocationManager locationManager = (LocationManager) context.getSystemService("location");
            return locationManager.isProviderEnabled("gps") || locationManager.isProviderEnabled("network");
        }

        public static LatLng setMin(Location location) {
            return location != null ? new LatLng(location.getLatitude(), location.getLongitude()) : new LatLng(-6.17476d, 106.827072d);
        }

        public static class getMax {
            public uploadCoreByStartService getMax;
            public LocationSettingsRequest.Builder setMin = new LocationSettingsRequest.Builder();

            public getMax(Context context) {
                this.getMax = new uploadCoreByStartService(context);
            }

            public final TitleBarRightButtonView.AnonymousClass1<Location> getMin() {
                try {
                    uploadCoreByStartService uploadcorebystartservice = this.getMax;
                    LocationRequest create = LocationRequest.create();
                    create.setPriority(100);
                    create.setInterval(AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS);
                    create.setFastestInterval(AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS);
                    return takeAndSync.getMin(uploadcorebystartservice.setMin, uploadcorebystartservice.setMax, create);
                } catch (SecurityException unused) {
                    return null;
                }
            }
        }
    }

    private WheelView() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0054, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0055, code lost:
        kotlin.io.CloseableKt.closeFinally(r0, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0058, code lost:
        throw r1;
     */
    @kotlin.jvm.JvmStatic
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final int setMax(@org.jetbrains.annotations.NotNull byte[] r4) {
        /*
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream
            r0.<init>(r4)
            java.io.Closeable r0 = (java.io.Closeable) r0
            r4 = r0
            java.io.ByteArrayInputStream r4 = (java.io.ByteArrayInputStream) r4     // Catch:{ all -> 0x0052 }
            r1 = -1
            androidx.exifinterface.media.ExifInterface r2 = new androidx.exifinterface.media.ExifInterface     // Catch:{ IOException -> 0x0041 }
            java.io.InputStream r4 = (java.io.InputStream) r4     // Catch:{ IOException -> 0x0041 }
            r2.<init>(r4)     // Catch:{ IOException -> 0x0041 }
            java.lang.String r4 = "Orientation"
            r3 = 1
            int r4 = r2.length((java.lang.String) r4, (int) r3)     // Catch:{ IOException -> 0x0041 }
            r1 = 0
            switch(r4) {
                case 1: goto L_0x0031;
                case 2: goto L_0x0031;
                case 3: goto L_0x002d;
                case 4: goto L_0x002d;
                case 5: goto L_0x0028;
                case 6: goto L_0x0028;
                case 7: goto L_0x0023;
                case 8: goto L_0x0023;
                default: goto L_0x0022;
            }     // Catch:{ IOException -> 0x0041 }
        L_0x0022:
            goto L_0x0031
        L_0x0023:
            r4 = 270(0x10e, float:3.78E-43)
            r1 = 270(0x10e, float:3.78E-43)
            goto L_0x0031
        L_0x0028:
            r4 = 90
            r1 = 90
            goto L_0x0031
        L_0x002d:
            r4 = 180(0xb4, float:2.52E-43)
            r1 = 180(0xb4, float:2.52E-43)
        L_0x0031:
            java.lang.String r4 = setMax     // Catch:{ IOException -> 0x0041 }
            java.lang.String r2 = "got orientation from EXIF. "
            java.lang.String r3 = java.lang.String.valueOf(r1)     // Catch:{ IOException -> 0x0041 }
            java.lang.String r2 = r2.concat(r3)     // Catch:{ IOException -> 0x0041 }
            o.updateActionSheetContent.i(r4, r2)     // Catch:{ IOException -> 0x0041 }
            goto L_0x004b
        L_0x0041:
            r4 = move-exception
            java.lang.String r2 = setMax     // Catch:{ all -> 0x0052 }
            java.lang.String r3 = "could not get orientation from EXIF."
            java.lang.Throwable r4 = (java.lang.Throwable) r4     // Catch:{ all -> 0x0052 }
            o.updateActionSheetContent.e(r2, r3, r4)     // Catch:{ all -> 0x0052 }
        L_0x004b:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x0052 }
            r4 = 0
            kotlin.io.CloseableKt.closeFinally(r0, r4)
            return r1
        L_0x0052:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x0054 }
        L_0x0054:
            r1 = move-exception
            kotlin.io.CloseableKt.closeFinally(r0, r4)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.WheelView.setMax(byte[]):int");
    }

    public final class OnWheelViewListener {
        public static Locale getMax;

        public static boolean getMin() {
            return CurrencyTextView.DEFAULT_LANGUAGE_CODE.equals(Locale.getDefault().getLanguage());
        }
    }
}
