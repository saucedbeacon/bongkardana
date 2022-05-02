package o;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.os.Build;
import android.view.Display;
import android.view.WindowManager;
import com.mixpanel.android.mpmetrics.InAppNotification;
import com.mixpanel.android.mpmetrics.MiniInAppNotification;
import com.mixpanel.android.mpmetrics.TakeoverInAppNotification;
import com.mixpanel.android.util.ImageStore;
import com.mixpanel.android.util.RemoteService;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

final class recycleViewsFromEnd {
    private static int IsOverlapping = 1;
    private static final JSONArray equals = new JSONArray();
    private static long isInside;
    private static int toIntRange;
    private final shouldMeasureTwice getMax;
    private final Context getMin;
    final Map<String, recycleChildren> length;
    private final findFirstCompletelyVisibleItemPosition setMax;
    private final ImageStore setMin;

    static class setMax {
        public JSONArray equals;
        public boolean getMax = false;
        public JSONArray getMin = recycleViewsFromEnd.setMax();
        public final List<InAppNotification> length = new ArrayList();
        public JSONArray setMax = recycleViewsFromEnd.setMax();
        public final List<InAppNotification> setMin = new ArrayList();
    }

    static void getMin() {
        isInside = 5267481179878362636L;
    }

    static /* synthetic */ JSONArray setMax() {
        try {
            boolean z = true;
            int i = toIntRange + 1;
            IsOverlapping = i % 128;
            int i2 = i % 2;
            JSONArray jSONArray = equals;
            int i3 = toIntRange + 57;
            IsOverlapping = i3 % 128;
            if (i3 % 2 != 0) {
                z = false;
            }
            if (!z) {
                return jSONArray;
            }
            Object obj = null;
            super.hashCode();
            return jSONArray;
        } catch (Exception e) {
            throw e;
        }
    }

    static {
        getMin();
        int i = IsOverlapping + 37;
        toIntRange = i % 128;
        if ((i % 2 != 0 ? 27 : '9') == 27) {
            Object[] objArr = null;
            int length2 = objArr.length;
        }
    }

    public recycleViewsFromEnd(Context context, shouldMeasureTwice shouldmeasuretwice) {
        try {
            this.getMin = context;
            this.getMax = shouldmeasuretwice;
            this.length = new HashMap();
            this.setMin = new ImageStore(context, "DecideChecker");
            this.setMax = findFirstCompletelyVisibleItemPosition.getMax(context);
        } catch (Exception e) {
            throw e;
        }
    }

    public final void length(String str, RemoteService remoteService) throws RemoteService.ServiceUnavailableException {
        recycleChildren recyclechildren;
        setMax setmax;
        int i = toIntRange + 97;
        IsOverlapping = i % 128;
        boolean z = false;
        if (i % 2 == 0) {
            recyclechildren = this.length.get(str);
            int i2 = 77 / 0;
            if ((recyclechildren != null ? '8' : 'c') == 'c') {
                return;
            }
        } else {
            recyclechildren = this.length.get(str);
            if (recyclechildren == null) {
                return;
            }
        }
        recycleChildren recyclechildren2 = recyclechildren;
        int i3 = toIntRange + 17;
        IsOverlapping = i3 % 128;
        if ((i3 % 2 == 0 ? 'c' : 6) != 'c') {
            try {
                setmax = setMax(recyclechildren2.getMin, recyclechildren2.length(), remoteService);
                if (setmax != null) {
                    z = true;
                }
                if (!z) {
                    return;
                }
            } catch (length e) {
                e.getMessage();
                findOnePartiallyOrCompletelyInvisibleChild.values();
                return;
            }
        } else {
            setmax = setMax(recyclechildren2.getMin, recyclechildren2.length(), remoteService);
            int i4 = 21 / 0;
            if (setmax == null) {
                return;
            }
        }
        recyclechildren2.getMax(setmax.setMin, setmax.length, setmax.setMax, setmax.getMin, setmax.getMax, setmax.equals);
    }

    static class length extends Exception {
        private static final long serialVersionUID = -6501269367559104957L;

        public length(String str, JSONException jSONException) {
            super(str, jSONException);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0027, code lost:
        if (r1 == null) goto L_0x0041;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void getMin(java.util.Iterator<com.mixpanel.android.mpmetrics.InAppNotification> r5) throws com.mixpanel.android.util.RemoteService.ServiceUnavailableException {
        /*
            r4 = this;
        L_0x0000:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0055
            int r0 = IsOverlapping
            int r0 = r0 + 41
            int r1 = r0 % 128
            toIntRange = r1
            int r0 = r0 % 2
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0016
            r0 = 1
            goto L_0x0017
        L_0x0016:
            r0 = 0
        L_0x0017:
            if (r0 == 0) goto L_0x002c
            java.lang.Object r0 = r5.next()
            com.mixpanel.android.mpmetrics.InAppNotification r0 = (com.mixpanel.android.mpmetrics.InAppNotification) r0
            android.content.Context r1 = r4.getMin
            android.graphics.Bitmap r1 = r4.setMax(r0, r1)
            r2 = 0
            int r2 = r2.length     // Catch:{ all -> 0x002a }
            if (r1 != 0) goto L_0x003e
            goto L_0x0041
        L_0x002a:
            r5 = move-exception
            throw r5
        L_0x002c:
            java.lang.Object r0 = r5.next()
            com.mixpanel.android.mpmetrics.InAppNotification r0 = (com.mixpanel.android.mpmetrics.InAppNotification) r0
            android.content.Context r3 = r4.getMin
            android.graphics.Bitmap r3 = r4.setMax(r0, r3)
            if (r3 != 0) goto L_0x003b
            r1 = 1
        L_0x003b:
            if (r1 == r2) goto L_0x0041
            r1 = r3
        L_0x003e:
            r0.isInside = r1
            goto L_0x0000
        L_0x0041:
            r0.setMin()
            o.findOnePartiallyOrCompletelyInvisibleChild.IsOverlapping()
            r5.remove()
            int r0 = toIntRange
            int r0 = r0 + 93
            int r1 = r0 % 128
            IsOverlapping = r1
            int r0 = r0 % 2
            goto L_0x0000
        L_0x0055:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.recycleViewsFromEnd.getMin(java.util.Iterator):void");
    }

    private setMax setMax(String str, String str2, RemoteService remoteService) throws RemoteService.ServiceUnavailableException, length {
        try {
            int i = IsOverlapping + 69;
            toIntRange = i % 128;
            int i2 = i % 2;
            String min = getMin(str, str2, remoteService);
            findOnePartiallyOrCompletelyInvisibleChild.getMax();
            if (min == null) {
                return null;
            }
            setMax min2 = getMin(min);
            getMin(min2.setMin.iterator());
            getMin(min2.length.iterator());
            int i3 = toIntRange + 107;
            IsOverlapping = i3 % 128;
            int i4 = i3 % 2;
            return min2;
        } catch (Exception e) {
            throw e;
        }
    }

    private static List<InAppNotification> length(JSONObject jSONObject) {
        int i;
        JSONArray jSONArray = null;
        ArrayList arrayList = new ArrayList();
        if ((jSONObject.has("notifications") ? '#' : '4') == '#') {
            try {
                jSONArray = jSONObject.getJSONArray("notifications");
                try {
                    i = toIntRange + 21;
                } catch (Exception e) {
                    throw e;
                }
                try {
                    IsOverlapping = i % 128;
                    int i2 = i % 2;
                } catch (Exception e2) {
                    throw e2;
                }
            } catch (JSONException unused) {
                findOnePartiallyOrCompletelyInvisibleChild.toFloatRange();
            }
        }
        if (jSONArray != null) {
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < jSONArray.length(); i5++) {
                try {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i5);
                    if (jSONObject2.has("display_triggers")) {
                        if (i4 >= 2) {
                            int i6 = toIntRange + 111;
                            IsOverlapping = i6 % 128;
                            int i7 = i6 % 2;
                        } else {
                            i4++;
                        }
                    } else if (i3 < 2) {
                        int i8 = toIntRange + 3;
                        IsOverlapping = i8 % 128;
                        int i9 = i8 % 2;
                        i3++;
                    }
                    String string = jSONObject2.getString("type");
                    if (string.equalsIgnoreCase("takeover")) {
                        arrayList.add(new TakeoverInAppNotification(jSONObject2));
                    } else if (string.equalsIgnoreCase("mini")) {
                        arrayList.add(new MiniInAppNotification(jSONObject2));
                    }
                } catch (JSONException unused2) {
                    findOnePartiallyOrCompletelyInvisibleChild.values();
                } catch (assertNotInLayoutOrScroll unused3) {
                    findOnePartiallyOrCompletelyInvisibleChild.values();
                } catch (OutOfMemoryError unused4) {
                    findOnePartiallyOrCompletelyInvisibleChild.values();
                }
            }
        }
        return arrayList;
    }

    private static setMax getMin(String str) throws length {
        boolean z;
        setMax setmax = new setMax();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<InAppNotification> it = length(jSONObject).iterator();
            while (true) {
                z = false;
                if (!it.hasNext()) {
                    break;
                }
                InAppNotification next = it.next();
                if ((next.getMin() ? ' ' : '%') != '%') {
                    int i = IsOverlapping + 75;
                    toIntRange = i % 128;
                    int i2 = i % 2;
                    setmax.length.add(next);
                } else {
                    setmax.setMin.add(next);
                }
            }
            if (!jSONObject.has("event_bindings")) {
                z = true;
            }
            if (!z) {
                try {
                    setmax.setMax = jSONObject.getJSONArray("event_bindings");
                } catch (JSONException unused) {
                    findOnePartiallyOrCompletelyInvisibleChild.toFloatRange();
                }
            }
            if (jSONObject.has("variants")) {
                try {
                    int i3 = IsOverlapping + 115;
                    toIntRange = i3 % 128;
                    int i4 = i3 % 2;
                    try {
                        setmax.getMin = jSONObject.getJSONArray("variants");
                    } catch (JSONException unused2) {
                        findOnePartiallyOrCompletelyInvisibleChild.toFloatRange();
                    }
                } catch (Exception e) {
                    throw e;
                }
            }
            if (jSONObject.has("automatic_events")) {
                try {
                    setmax.getMax = jSONObject.getBoolean("automatic_events");
                } catch (JSONException unused3) {
                    findOnePartiallyOrCompletelyInvisibleChild.toFloatRange();
                }
            }
            if (jSONObject.has("integrations")) {
                try {
                    setmax.equals = jSONObject.getJSONArray("integrations");
                } catch (JSONException unused4) {
                    findOnePartiallyOrCompletelyInvisibleChild.toFloatRange();
                }
            }
            return setmax;
        } catch (JSONException e2) {
            throw new length("Mixpanel endpoint returned unparsable result:\n".concat(String.valueOf(str)), e2);
        }
    }

    private String getMin(String str, String str2, RemoteService remoteService) throws RemoteService.ServiceUnavailableException {
        String str3;
        try {
            String encode = URLEncoder.encode(str, getTabbarModel.ENC);
            if (str2 != null) {
                int i = IsOverlapping + 101;
                toIntRange = i % 128;
                int i2 = i % 2;
                str3 = URLEncoder.encode(str2, getTabbarModel.ENC);
            } else {
                str3 = null;
            }
            StringBuilder sb = new StringBuilder("?version=1&lib=android&token=");
            sb.append(encode);
            if ((str3 != null ? 0 : '\\') == 0) {
                sb.append("&distinct_id=");
                sb.append(str3);
                int i3 = toIntRange + 89;
                IsOverlapping = i3 % 128;
                int i4 = i3 % 2;
            }
            sb.append("&properties=");
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt("$android_lib_version", "5.8.4");
                jSONObject.putOpt("$android_app_version", this.setMax.setMax);
                jSONObject.putOpt("$android_version", Build.VERSION.RELEASE);
                jSONObject.putOpt("$android_app_release", this.setMax.length);
                jSONObject.putOpt("$android_device_model", Build.MODEL);
                sb.append(URLEncoder.encode(jSONObject.toString(), getTabbarModel.ENC));
            } catch (Exception e) {
                e.getCause();
                findOnePartiallyOrCompletelyInvisibleChild.values();
            }
            String obj = sb.toString();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.getMax.toIntRange);
            sb2.append(obj);
            String obj2 = sb2.toString();
            findOnePartiallyOrCompletelyInvisibleChild.getMax();
            byte[] min = getMin(remoteService, this.getMin, obj2);
            if ((min == null ? '4' : 'C') != 'C') {
                return null;
            }
            try {
                String str4 = new String(min, getMax(new char[]{47087, 14774, 57734, 43399, 20893, 6559}).intern());
                int i5 = IsOverlapping + 27;
                toIntRange = i5 % 128;
                if (i5 % 2 == 0) {
                    return str4;
                }
                int i6 = 48 / 0;
                return str4;
            } catch (UnsupportedEncodingException e2) {
                throw new RuntimeException("UTF not supported on this platform?", e2);
            }
        } catch (UnsupportedEncodingException e3) {
            throw new RuntimeException("Mixpanel library requires utf-8 string encoding to be available", e3);
        }
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.util.Map, java.lang.Object, byte[]] */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0025, code lost:
        if ((r5.setMin(r6, r0.FastBitmap$CoordinateSystem())) != false) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003c, code lost:
        if ((r5.setMin(r6, r0.FastBitmap$CoordinateSystem())) != false) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0057, code lost:
        r5 = toIntRange + 45;
        IsOverlapping = r5 % 128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0061, code lost:
        if ((r5 % 2) != 0) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0063, code lost:
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0064, code lost:
        if (r1 == false) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0066, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        super.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x006a, code lost:
        return r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static byte[] getMin(com.mixpanel.android.util.RemoteService r5, android.content.Context r6, java.lang.String r7) throws com.mixpanel.android.util.RemoteService.ServiceUnavailableException {
        /*
            int r0 = toIntRange
            int r0 = r0 + 103
            int r1 = r0 % 128
            IsOverlapping = r1
            int r0 = r0 % 2
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0010
            r0 = 0
            goto L_0x0011
        L_0x0010:
            r0 = 1
        L_0x0011:
            r3 = 0
            if (r0 == 0) goto L_0x0028
            o.shouldMeasureTwice r0 = o.shouldMeasureTwice.getMax(r6)
            o.prepareForDrop r4 = r0.FastBitmap$CoordinateSystem()
            boolean r6 = r5.setMin(r6, r4)
            if (r6 != 0) goto L_0x0024
            r6 = 0
            goto L_0x0025
        L_0x0024:
            r6 = 1
        L_0x0025:
            if (r6 == 0) goto L_0x0057
            goto L_0x003e
        L_0x0028:
            o.shouldMeasureTwice r0 = o.shouldMeasureTwice.getMax(r6)
            o.prepareForDrop r4 = r0.FastBitmap$CoordinateSystem()
            boolean r6 = r5.setMin(r6, r4)
            r4 = 39
            int r4 = r4 / r2
            if (r6 != 0) goto L_0x003b
            r6 = 0
            goto L_0x003c
        L_0x003b:
            r6 = 1
        L_0x003c:
            if (r6 == 0) goto L_0x0057
        L_0x003e:
            javax.net.ssl.SSLSocketFactory r6 = r0.values()     // Catch:{ MalformedURLException -> 0x0053, FileNotFoundException -> 0x004f, IOException -> 0x004b, OutOfMemoryError -> 0x0047 }
            byte[] r3 = r5.getMax(r7, r3, r6)     // Catch:{ MalformedURLException -> 0x0053, FileNotFoundException -> 0x004f, IOException -> 0x004b, OutOfMemoryError -> 0x0047 }
            goto L_0x0056
        L_0x0047:
            o.findOnePartiallyOrCompletelyInvisibleChild.values()
            goto L_0x0056
        L_0x004b:
            o.findOnePartiallyOrCompletelyInvisibleChild.setMax()
            goto L_0x0056
        L_0x004f:
            o.findOnePartiallyOrCompletelyInvisibleChild.setMax()
            goto L_0x0056
        L_0x0053:
            o.findOnePartiallyOrCompletelyInvisibleChild.values()
        L_0x0056:
            return r3
        L_0x0057:
            int r5 = toIntRange
            int r5 = r5 + 45
            int r6 = r5 % 128
            IsOverlapping = r6
            int r5 = r5 % 2
            if (r5 != 0) goto L_0x0064
            r1 = 0
        L_0x0064:
            if (r1 == 0) goto L_0x0067
            return r3
        L_0x0067:
            super.hashCode()     // Catch:{ all -> 0x006b }
            return r3
        L_0x006b:
            r5 = move-exception
            throw r5
        L_0x006d:
            r5 = move-exception
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o.recycleViewsFromEnd.getMin(com.mixpanel.android.util.RemoteService, android.content.Context, java.lang.String):byte[]");
    }

    private Bitmap setMax(InAppNotification inAppNotification, Context context) throws RemoteService.ServiceUnavailableException {
        int i;
        int i2 = 0;
        String[] strArr = {InAppNotification.getMin(inAppNotification.toIntRange, "@2x"), inAppNotification.toIntRange};
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        if (!(Build.VERSION.SDK_INT >= 13)) {
            i = defaultDisplay.getWidth();
        } else {
            Point point = new Point();
            defaultDisplay.getSize(point);
            i = point.x;
        }
        if (!(inAppNotification.getMax() != InAppNotification.Type.TAKEOVER)) {
            int i3 = IsOverlapping + 103;
            toIntRange = i3 % 128;
            if (i3 % 2 == 0 ? i >= 720 : i >= 8951) {
                strArr = new String[]{InAppNotification.getMin(inAppNotification.toIntRange, "@4x"), InAppNotification.getMin(inAppNotification.toIntRange, "@2x"), inAppNotification.toIntRange};
            }
        }
        int length2 = strArr.length;
        while (i2 < length2) {
            int i4 = toIntRange + 103;
            IsOverlapping = i4 % 128;
            int i5 = i4 % 2;
            try {
                return this.setMin.setMax(strArr[i2]);
            } catch (ImageStore.CantGetImageException unused) {
                findOnePartiallyOrCompletelyInvisibleChild.setMax();
                i2++;
            }
        }
        return null;
    }

    private static String getMax(char[] cArr) {
        int i = toIntRange + 81;
        IsOverlapping = i % 128;
        int i2 = i % 2;
        char c = cArr[0];
        char[] cArr2 = new char[(cArr.length - 1)];
        int i3 = 1;
        while (true) {
            if (!(i3 < cArr.length)) {
                return new String(cArr2);
            }
            int i4 = toIntRange + 55;
            IsOverlapping = i4 % 128;
            int i5 = i4 % 2;
            cArr2[i3 - 1] = (char) ((int) (((long) (cArr[i3] ^ (i3 * c))) ^ isInside));
            i3++;
        }
    }
}
