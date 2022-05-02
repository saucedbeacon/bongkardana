package com.otaliastudios.cameraview.internal;

import android.annotation.SuppressLint;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.otaliastudios.cameraview.CameraLogger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import o.shouldDeferAccessibilityEvent;

public class DeviceEncoders {
    @VisibleForTesting
    static boolean length = (Build.VERSION.SDK_INT >= 21);
    private static final CameraLogger setMax;
    private static final String setMin;
    private final MediaCodecInfo.AudioCapabilities equals;
    public final MediaCodecInfo getMax;
    public final MediaCodecInfo getMin;
    private final MediaCodecInfo.VideoCapabilities isInside;

    static {
        String simpleName = DeviceEncoders.class.getSimpleName();
        setMin = simpleName;
        setMax = CameraLogger.setMin(simpleName);
    }

    public class VideoException extends RuntimeException {
        private VideoException(@NonNull String str) {
            super(str);
        }
    }

    public class AudioException extends RuntimeException {
        private AudioException(@NonNull String str) {
            super(str);
        }
    }

    @SuppressLint({"NewApi"})
    public DeviceEncoders(int i, @NonNull String str, @NonNull String str2, int i2, int i3) {
        if (length) {
            List<MediaCodecInfo> max = setMax();
            MediaCodecInfo min = getMin(max, str, i, i2);
            this.getMin = min;
            setMax.setMax("Enabled. Found video encoder:", min.getName());
            MediaCodecInfo min2 = getMin(max, str2, i, i3);
            this.getMax = min2;
            setMax.setMax("Enabled. Found audio encoder:", min2.getName());
            this.isInside = this.getMin.getCapabilitiesForType(str).getVideoCapabilities();
            this.equals = this.getMax.getCapabilitiesForType(str2).getAudioCapabilities();
            return;
        }
        this.getMin = null;
        this.getMax = null;
        this.isInside = null;
        this.equals = null;
        setMax.setMax("Disabled.");
    }

    @SuppressLint({"NewApi"})
    @VisibleForTesting
    @NonNull
    private static List<MediaCodecInfo> setMax() {
        ArrayList arrayList = new ArrayList();
        for (MediaCodecInfo mediaCodecInfo : new MediaCodecList(0).getCodecInfos()) {
            if (mediaCodecInfo.isEncoder()) {
                arrayList.add(mediaCodecInfo);
            }
        }
        return arrayList;
    }

    @VisibleForTesting
    @SuppressLint({"NewApi"})
    static boolean length(@NonNull String str) {
        String lowerCase = str.toLowerCase();
        return !(lowerCase.startsWith("omx.google.") || lowerCase.startsWith("c2.android.") || (!lowerCase.startsWith("omx.") && !lowerCase.startsWith("c2.")));
    }

    @SuppressLint({"NewApi"})
    @VisibleForTesting
    @NonNull
    private MediaCodecInfo getMin(@NonNull List<MediaCodecInfo> list, @NonNull String str, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        Iterator<MediaCodecInfo> it = list.iterator();
        while (true) {
            int i3 = 0;
            if (!it.hasNext()) {
                break;
            }
            MediaCodecInfo next = it.next();
            String[] supportedTypes = next.getSupportedTypes();
            int length2 = supportedTypes.length;
            while (true) {
                if (i3 >= length2) {
                    break;
                } else if (supportedTypes[i3].equalsIgnoreCase(str)) {
                    arrayList.add(next);
                    break;
                } else {
                    i3++;
                }
            }
        }
        setMax.setMax("findDeviceEncoder -", "type:", str, "encoders:", Integer.valueOf(arrayList.size()));
        if (i == 1) {
            Collections.sort(arrayList, new Comparator<MediaCodecInfo>() {
                public /* synthetic */ int compare(Object obj, Object obj2) {
                    return Boolean.compare(DeviceEncoders.length(((MediaCodecInfo) obj2).getName()), DeviceEncoders.length(((MediaCodecInfo) obj).getName()));
                }
            });
        }
        if (arrayList.size() >= i2 + 1) {
            return (MediaCodecInfo) arrayList.get(i2);
        }
        throw new RuntimeException("No encoders for type:".concat(String.valueOf(str)));
    }

    @SuppressLint({"NewApi"})
    @NonNull
    public final shouldDeferAccessibilityEvent setMax(@NonNull shouldDeferAccessibilityEvent shoulddeferaccessibilityevent) {
        if (!length) {
            return shoulddeferaccessibilityevent;
        }
        int i = shoulddeferaccessibilityevent.getMax;
        int i2 = shoulddeferaccessibilityevent.getMin;
        double d = (double) i;
        double d2 = (double) i2;
        Double.isNaN(d);
        Double.isNaN(d2);
        double d3 = d / d2;
        setMax.getMax(1, "getSupportedVideoSize - started. width:", Integer.valueOf(i), "height:", Integer.valueOf(i2));
        if (this.isInside.getSupportedWidths().getUpper().intValue() < i) {
            i = this.isInside.getSupportedWidths().getUpper().intValue();
            double d4 = (double) i;
            Double.isNaN(d4);
            i2 = (int) Math.round(d4 / d3);
            setMax.getMax(1, "getSupportedVideoSize - exceeds maxWidth! width:", Integer.valueOf(i), "height:", Integer.valueOf(i2));
        }
        if (this.isInside.getSupportedHeights().getUpper().intValue() < i2) {
            i2 = this.isInside.getSupportedHeights().getUpper().intValue();
            double d5 = (double) i2;
            Double.isNaN(d5);
            i = (int) Math.round(d5 * d3);
            setMax.getMax(1, "getSupportedVideoSize - exceeds maxHeight! width:", Integer.valueOf(i), "height:", Integer.valueOf(i2));
        }
        while (i % this.isInside.getWidthAlignment() != 0) {
            i--;
        }
        while (i2 % this.isInside.getHeightAlignment() != 0) {
            i2--;
        }
        setMax.getMax(1, "getSupportedVideoSize - aligned. width:", Integer.valueOf(i), "height:", Integer.valueOf(i2));
        if (!this.isInside.getSupportedWidths().contains(Integer.valueOf(i))) {
            StringBuilder sb = new StringBuilder("Width not supported after adjustment. Desired:");
            sb.append(i);
            sb.append(" Range:");
            sb.append(this.isInside.getSupportedWidths());
            throw new VideoException(sb.toString());
        } else if (this.isInside.getSupportedHeights().contains(Integer.valueOf(i2))) {
            try {
                if (!this.isInside.getSupportedHeightsFor(i).contains(Integer.valueOf(i2))) {
                    int intValue = this.isInside.getSupportedWidths().getLower().intValue();
                    int widthAlignment = this.isInside.getWidthAlignment();
                    int i3 = i;
                    while (i3 >= intValue) {
                        i3 -= 32;
                        while (i3 % widthAlignment != 0) {
                            i3--;
                        }
                        double d6 = (double) i3;
                        Double.isNaN(d6);
                        int round = (int) Math.round(d6 / d3);
                        if (this.isInside.getSupportedHeightsFor(i3).contains(Integer.valueOf(round))) {
                            setMax.getMin("getSupportedVideoSize - restarting with smaller size.");
                            return setMax(new shouldDeferAccessibilityEvent(i3, round));
                        }
                    }
                }
            } catch (IllegalArgumentException unused) {
            }
            if (this.isInside.isSizeSupported(i, i2)) {
                return new shouldDeferAccessibilityEvent(i, i2);
            }
            StringBuilder sb2 = new StringBuilder("Size not supported for unknown reason. Might be an aspect ratio issue. Desired size:");
            sb2.append(new shouldDeferAccessibilityEvent(i, i2));
            throw new VideoException(sb2.toString());
        } else {
            StringBuilder sb3 = new StringBuilder("Height not supported after adjustment. Desired:");
            sb3.append(i2);
            sb3.append(" Range:");
            sb3.append(this.isInside.getSupportedHeights());
            throw new VideoException(sb3.toString());
        }
    }

    @SuppressLint({"NewApi"})
    public final int getMax(int i) {
        if (!length) {
            return i;
        }
        int intValue = this.isInside.getBitrateRange().clamp(Integer.valueOf(i)).intValue();
        setMax.getMax(1, "getSupportedVideoBitRate -", "inputRate:", Integer.valueOf(i), "adjustedRate:", Integer.valueOf(intValue));
        return intValue;
    }

    @SuppressLint({"NewApi"})
    public final int length(@NonNull shouldDeferAccessibilityEvent shoulddeferaccessibilityevent, int i) {
        if (!length) {
            return i;
        }
        int doubleValue = (int) this.isInside.getSupportedFrameRatesFor(shoulddeferaccessibilityevent.getMax, shoulddeferaccessibilityevent.getMin).clamp(Double.valueOf((double) i)).doubleValue();
        setMax.getMax(1, "getSupportedVideoFrameRate -", "inputRate:", Integer.valueOf(i), "adjustedRate:", Integer.valueOf(doubleValue));
        return doubleValue;
    }

    @SuppressLint({"NewApi"})
    public final int getMin(int i) {
        if (!length) {
            return i;
        }
        int intValue = this.equals.getBitrateRange().clamp(Integer.valueOf(i)).intValue();
        setMax.getMax(1, "getSupportedAudioBitRate -", "inputRate:", Integer.valueOf(i), "adjustedRate:", Integer.valueOf(intValue));
        return intValue;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x005a A[SYNTHETIC, Splitter:B:21:0x005a] */
    @android.annotation.SuppressLint({"NewApi"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void length(@androidx.annotation.NonNull java.lang.String r3, @androidx.annotation.NonNull o.shouldDeferAccessibilityEvent r4, int r5, int r6) {
        /*
            r2 = this;
            android.media.MediaCodecInfo r0 = r2.getMin
            if (r0 == 0) goto L_0x005e
            r0 = 0
            int r1 = r4.getMax     // Catch:{ Exception -> 0x003c, all -> 0x003a }
            int r4 = r4.getMin     // Catch:{ Exception -> 0x003c, all -> 0x003a }
            android.media.MediaFormat r3 = android.media.MediaFormat.createVideoFormat(r3, r1, r4)     // Catch:{ Exception -> 0x003c, all -> 0x003a }
            java.lang.String r4 = "color-format"
            r1 = 2130708361(0x7f000789, float:1.701803E38)
            r3.setInteger(r4, r1)     // Catch:{ Exception -> 0x003c, all -> 0x003a }
            java.lang.String r4 = "bitrate"
            r3.setInteger(r4, r6)     // Catch:{ Exception -> 0x003c, all -> 0x003a }
            java.lang.String r4 = "frame-rate"
            r3.setInteger(r4, r5)     // Catch:{ Exception -> 0x003c, all -> 0x003a }
            java.lang.String r4 = "i-frame-interval"
            r5 = 1
            r3.setInteger(r4, r5)     // Catch:{ Exception -> 0x003c, all -> 0x003a }
            android.media.MediaCodecInfo r4 = r2.getMin     // Catch:{ Exception -> 0x003c, all -> 0x003a }
            java.lang.String r4 = r4.getName()     // Catch:{ Exception -> 0x003c, all -> 0x003a }
            android.media.MediaCodec r4 = android.media.MediaCodec.createByCodecName(r4)     // Catch:{ Exception -> 0x003c, all -> 0x003a }
            r4.configure(r3, r0, r0, r5)     // Catch:{ Exception -> 0x0038 }
            if (r4 == 0) goto L_0x005e
            r4.release()     // Catch:{ Exception -> 0x0037 }
        L_0x0037:
            return
        L_0x0038:
            r3 = move-exception
            goto L_0x003e
        L_0x003a:
            r3 = move-exception
            goto L_0x0058
        L_0x003c:
            r3 = move-exception
            r4 = r0
        L_0x003e:
            com.otaliastudios.cameraview.internal.DeviceEncoders$VideoException r5 = new com.otaliastudios.cameraview.internal.DeviceEncoders$VideoException     // Catch:{ all -> 0x0056 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0056 }
            java.lang.String r1 = "Failed to configure video codec: "
            r6.<init>(r1)     // Catch:{ all -> 0x0056 }
            java.lang.String r3 = r3.getMessage()     // Catch:{ all -> 0x0056 }
            r6.append(r3)     // Catch:{ all -> 0x0056 }
            java.lang.String r3 = r6.toString()     // Catch:{ all -> 0x0056 }
            r5.<init>(r3)     // Catch:{ all -> 0x0056 }
            throw r5     // Catch:{ all -> 0x0056 }
        L_0x0056:
            r3 = move-exception
            r0 = r4
        L_0x0058:
            if (r0 == 0) goto L_0x005d
            r0.release()     // Catch:{ Exception -> 0x005d }
        L_0x005d:
            throw r3
        L_0x005e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.otaliastudios.cameraview.internal.DeviceEncoders.length(java.lang.String, o.shouldDeferAccessibilityEvent, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0051 A[SYNTHETIC, Splitter:B:26:0x0051] */
    @android.annotation.SuppressLint({"NewApi"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void length(@androidx.annotation.NonNull java.lang.String r3, int r4, int r5, int r6) {
        /*
            r2 = this;
            android.media.MediaCodecInfo r0 = r2.getMax
            if (r0 == 0) goto L_0x0055
            r0 = 0
            android.media.MediaFormat r3 = android.media.MediaFormat.createAudioFormat(r3, r5, r6)     // Catch:{ Exception -> 0x0033, all -> 0x0031 }
            r5 = 2
            if (r6 != r5) goto L_0x000f
            r5 = 12
            goto L_0x0011
        L_0x000f:
            r5 = 16
        L_0x0011:
            java.lang.String r6 = "channel-mask"
            r3.setInteger(r6, r5)     // Catch:{ Exception -> 0x0033, all -> 0x0031 }
            java.lang.String r5 = "bitrate"
            r3.setInteger(r5, r4)     // Catch:{ Exception -> 0x0033, all -> 0x0031 }
            android.media.MediaCodecInfo r4 = r2.getMax     // Catch:{ Exception -> 0x0033, all -> 0x0031 }
            java.lang.String r4 = r4.getName()     // Catch:{ Exception -> 0x0033, all -> 0x0031 }
            android.media.MediaCodec r4 = android.media.MediaCodec.createByCodecName(r4)     // Catch:{ Exception -> 0x0033, all -> 0x0031 }
            r5 = 1
            r4.configure(r3, r0, r0, r5)     // Catch:{ Exception -> 0x002f }
            if (r4 == 0) goto L_0x0055
            r4.release()     // Catch:{ Exception -> 0x002e }
        L_0x002e:
            return
        L_0x002f:
            r3 = move-exception
            goto L_0x0035
        L_0x0031:
            r3 = move-exception
            goto L_0x004f
        L_0x0033:
            r3 = move-exception
            r4 = r0
        L_0x0035:
            com.otaliastudios.cameraview.internal.DeviceEncoders$AudioException r5 = new com.otaliastudios.cameraview.internal.DeviceEncoders$AudioException     // Catch:{ all -> 0x004d }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x004d }
            java.lang.String r1 = "Failed to configure video audio: "
            r6.<init>(r1)     // Catch:{ all -> 0x004d }
            java.lang.String r3 = r3.getMessage()     // Catch:{ all -> 0x004d }
            r6.append(r3)     // Catch:{ all -> 0x004d }
            java.lang.String r3 = r6.toString()     // Catch:{ all -> 0x004d }
            r5.<init>(r3)     // Catch:{ all -> 0x004d }
            throw r5     // Catch:{ all -> 0x004d }
        L_0x004d:
            r3 = move-exception
            r0 = r4
        L_0x004f:
            if (r0 == 0) goto L_0x0054
            r0.release()     // Catch:{ Exception -> 0x0054 }
        L_0x0054:
            throw r3
        L_0x0055:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.otaliastudios.cameraview.internal.DeviceEncoders.length(java.lang.String, int, int, int):void");
    }
}
