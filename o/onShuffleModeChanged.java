package o;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.database.DataSetObservable;
import android.os.AsyncTask;
import java.math.BigDecimal;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.text.Typography;

public class onShuffleModeChanged extends DataSetObservable {
    private static final Object IsOverlapping = new Object();
    private static int Mean$Arithmetic = 0;
    private static int invoke = 1;
    private static char[] invokeSuspend;
    static final String setMin = onShuffleModeChanged.class.getSimpleName();
    private static final Map<String, onShuffleModeChanged> toIntRange = new HashMap();
    private getMax FastBitmap$CoordinateSystem;
    boolean equals;
    final String getMax;
    public final Object getMin;
    private int hashCode;
    private Intent isInside;
    final Context length;
    public final List<setMax> setMax;
    private boolean toDoubleRange;
    private final List<length> toFloatRange;
    private boolean toString;
    private setMin valueOf;
    private boolean values;

    public interface getMax {
    }

    public interface setMin {
        boolean setMin();
    }

    static void IsOverlapping() {
        invokeSuspend = new char[]{'k', 209, 216, 236, 243};
    }

    static {
        IsOverlapping();
        try {
            int i = invoke + 67;
            Mean$Arithmetic = i % 128;
            int i2 = i % 2;
        } catch (Exception e) {
            throw e;
        }
    }

    public final int length() {
        int size;
        synchronized (this.getMin) {
            boolean min = setMin() | isInside();
            toFloatRange();
            if (min) {
                getMin();
                notifyChanged();
            }
            size = this.setMax.size();
        }
        return size;
    }

    public final ResolveInfo setMin(int i) {
        ResolveInfo resolveInfo;
        synchronized (this.getMin) {
            boolean min = setMin() | isInside();
            toFloatRange();
            if (min) {
                getMin();
                notifyChanged();
            }
            resolveInfo = this.setMax.get(i).setMin;
        }
        return resolveInfo;
    }

    public final int getMax(ResolveInfo resolveInfo) {
        synchronized (this.getMin) {
            boolean min = setMin() | isInside();
            toFloatRange();
            if (min) {
                getMin();
                notifyChanged();
            }
            List<setMax> list = this.setMax;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (list.get(i).setMin == resolveInfo) {
                    return i;
                }
            }
            return -1;
        }
    }

    public final Intent length(int i) {
        synchronized (this.getMin) {
            if (this.isInside == null) {
                return null;
            }
            boolean min = setMin() | isInside();
            toFloatRange();
            if (min) {
                getMin();
                notifyChanged();
            }
            setMax setmax = this.setMax.get(i);
            ComponentName componentName = new ComponentName(setmax.setMin.activityInfo.packageName, setmax.setMin.activityInfo.name);
            Intent intent = new Intent(this.isInside);
            intent.setComponent(componentName);
            if (this.valueOf != null) {
                new Intent(intent);
                if (this.valueOf.setMin()) {
                    return null;
                }
            }
            getMin(new length(componentName, System.currentTimeMillis(), 1.0f));
            return intent;
        }
    }

    public final ResolveInfo getMax() {
        synchronized (this.getMin) {
            boolean min = setMin() | isInside();
            toFloatRange();
            if (min) {
                getMin();
                notifyChanged();
            }
            if (this.setMax.isEmpty()) {
                return null;
            }
            ResolveInfo resolveInfo = this.setMax.get(0).setMin;
            return resolveInfo;
        }
    }

    public final int setMax() {
        int size;
        synchronized (this.getMin) {
            boolean min = setMin() | isInside();
            toFloatRange();
            if (min) {
                getMin();
                notifyChanged();
            }
            size = this.toFloatRange.size();
        }
        return size;
    }

    public final boolean getMin() {
        int i = invoke + 45;
        Mean$Arithmetic = i % 128;
        int i2 = i % 2;
        if (this.FastBitmap$CoordinateSystem != null) {
            try {
                if (this.isInside != null) {
                    try {
                        if ((!this.setMax.isEmpty() ? '0' : 'K') != 'K' && !this.toFloatRange.isEmpty()) {
                            Collections.unmodifiableList(this.toFloatRange);
                            return true;
                        }
                    } catch (Exception e) {
                        throw e;
                    }
                }
            } catch (Exception e2) {
                throw e2;
            }
        }
        int i3 = Mean$Arithmetic + 41;
        invoke = i3 % 128;
        if (i3 % 2 != 0) {
            return false;
        }
        Object obj = null;
        super.hashCode();
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0025, code lost:
        if ((r7.isInside != null) != false) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0031, code lost:
        if ((r7.isInside != null) != true) goto L_0x0080;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean setMin() {
        /*
            r7 = this;
            boolean r0 = r7.values
            r1 = 91
            if (r0 == 0) goto L_0x0009
            r0 = 97
            goto L_0x000b
        L_0x0009:
            r0 = 91
        L_0x000b:
            r2 = 0
            if (r0 == r1) goto L_0x0080
            int r0 = invoke
            int r0 = r0 + 33
            int r1 = r0 % 128
            Mean$Arithmetic = r1
            int r0 = r0 % 2
            r1 = 1
            if (r0 == 0) goto L_0x002a
            android.content.Intent r0 = r7.isInside
            r3 = 93
            int r3 = r3 / r2
            if (r0 == 0) goto L_0x0024
            r0 = 1
            goto L_0x0025
        L_0x0024:
            r0 = 0
        L_0x0025:
            if (r0 == 0) goto L_0x0080
            goto L_0x0034
        L_0x0028:
            r0 = move-exception
            throw r0
        L_0x002a:
            android.content.Intent r0 = r7.isInside
            if (r0 == 0) goto L_0x0030
            r0 = 1
            goto L_0x0031
        L_0x0030:
            r0 = 0
        L_0x0031:
            if (r0 == r1) goto L_0x0034
            goto L_0x0080
        L_0x0034:
            int r0 = invoke     // Catch:{ Exception -> 0x007e }
            int r0 = r0 + 63
            int r3 = r0 % 128
            Mean$Arithmetic = r3     // Catch:{ Exception -> 0x007c }
            int r0 = r0 % 2
            r7.values = r2     // Catch:{ Exception -> 0x007c }
            java.util.List<o.onShuffleModeChanged$setMax> r0 = r7.setMax     // Catch:{ Exception -> 0x007e }
            r0.clear()     // Catch:{ Exception -> 0x007e }
            android.content.Context r0 = r7.length     // Catch:{ Exception -> 0x007e }
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch:{ Exception -> 0x007e }
            android.content.Intent r3 = r7.isInside     // Catch:{ Exception -> 0x007e }
            java.util.List r0 = r0.queryIntentActivities(r3, r2)     // Catch:{ Exception -> 0x007e }
            int r3 = r0.size()     // Catch:{ Exception -> 0x007e }
        L_0x0055:
            if (r2 >= r3) goto L_0x006a
            java.lang.Object r4 = r0.get(r2)
            android.content.pm.ResolveInfo r4 = (android.content.pm.ResolveInfo) r4
            java.util.List<o.onShuffleModeChanged$setMax> r5 = r7.setMax
            o.onShuffleModeChanged$setMax r6 = new o.onShuffleModeChanged$setMax
            r6.<init>(r4)
            r5.add(r6)
            int r2 = r2 + 1
            goto L_0x0055
        L_0x006a:
            int r0 = invoke
            int r0 = r0 + 17
            int r2 = r0 % 128
            Mean$Arithmetic = r2
            int r0 = r0 % 2
            if (r0 == 0) goto L_0x007b
            r0 = 0
            int r0 = r0.length     // Catch:{ all -> 0x0079 }
            return r1
        L_0x0079:
            r0 = move-exception
            throw r0
        L_0x007b:
            return r1
        L_0x007c:
            r0 = move-exception
            throw r0
        L_0x007e:
            r0 = move-exception
            throw r0
        L_0x0080:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.onShuffleModeChanged.setMin():boolean");
    }

    /* JADX WARNING: type inference failed for: r11v2, types: [java.lang.String] */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0120, code lost:
        throw new org.xmlpull.v1.XmlPullParserException("Share records file not well-formed.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0124, code lost:
        if (r2 != true) goto L_0x0142;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x013b, code lost:
        if (r0 == null) goto L_0x0142;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x013f, code lost:
        if (r0 == null) goto L_0x0142;
     */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean isInside() {
        /*
            r14 = this;
            boolean r0 = r14.equals
            r1 = 87
            if (r0 == 0) goto L_0x0009
            r0 = 87
            goto L_0x000b
        L_0x0009:
            r0 = 96
        L_0x000b:
            r2 = 0
            if (r0 == r1) goto L_0x0010
            goto L_0x0143
        L_0x0010:
            boolean r0 = r14.toDoubleRange
            if (r0 == 0) goto L_0x0143
            java.lang.String r0 = r14.getMax
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r1 = 2
            if (r0 != 0) goto L_0x001f
            r0 = 2
            goto L_0x0021
        L_0x001f:
            r0 = 17
        L_0x0021:
            if (r0 == r1) goto L_0x0025
            goto L_0x0143
        L_0x0025:
            int r0 = Mean$Arithmetic
            int r0 = r0 + 69
            int r3 = r0 % 128
            invoke = r3
            int r0 = r0 % r1
            r3 = 1
            if (r0 != 0) goto L_0x003e
            r14.equals = r2
            r14.toString = r2
            android.content.Context r0 = r14.length     // Catch:{ FileNotFoundException -> 0x0142 }
        L_0x0037:
            java.lang.String r4 = r14.getMax     // Catch:{ FileNotFoundException -> 0x0142 }
            java.io.FileInputStream r0 = r0.openFileInput(r4)     // Catch:{ FileNotFoundException -> 0x0142 }
            goto L_0x0045
        L_0x003e:
            r14.equals = r2
            r14.toString = r3
            android.content.Context r0 = r14.length     // Catch:{ FileNotFoundException -> 0x0142 }
            goto L_0x0037
        L_0x0045:
            int r4 = Mean$Arithmetic
            int r4 = r4 + 119
            int r5 = r4 % 128
            invoke = r5
            int r4 = r4 % r1
            org.xmlpull.v1.XmlPullParser r4 = android.util.Xml.newPullParser()     // Catch:{ XmlPullParserException -> 0x013e, IOException -> 0x013a, all -> 0x0133 }
            r5 = 5
            byte[] r6 = new byte[r5]     // Catch:{ XmlPullParserException -> 0x013e, IOException -> 0x013a, all -> 0x0133 }
            r6[r2] = r3     // Catch:{ XmlPullParserException -> 0x013e, IOException -> 0x013a, all -> 0x0133 }
            r6[r3] = r3     // Catch:{ XmlPullParserException -> 0x013e, IOException -> 0x013a, all -> 0x0133 }
            r6[r1] = r3     // Catch:{ XmlPullParserException -> 0x013e, IOException -> 0x013a, all -> 0x0133 }
            r7 = 3
            r6[r7] = r2     // Catch:{ XmlPullParserException -> 0x013e, IOException -> 0x013a, all -> 0x0133 }
            r8 = 4
            r6[r8] = r3     // Catch:{ XmlPullParserException -> 0x013e, IOException -> 0x013a, all -> 0x0133 }
            int[] r9 = new int[r8]     // Catch:{ XmlPullParserException -> 0x013e, IOException -> 0x013a, all -> 0x0133 }
            r9[r2] = r2     // Catch:{ XmlPullParserException -> 0x013e, IOException -> 0x013a, all -> 0x0133 }
            r9[r3] = r5     // Catch:{ XmlPullParserException -> 0x013e, IOException -> 0x013a, all -> 0x0133 }
            r10 = 159(0x9f, float:2.23E-43)
            r9[r1] = r10     // Catch:{ XmlPullParserException -> 0x013e, IOException -> 0x013a, all -> 0x0133 }
            r9[r7] = r2     // Catch:{ XmlPullParserException -> 0x013e, IOException -> 0x013a, all -> 0x0133 }
            java.lang.String r10 = "javascript:"
            boolean r10 = android.webkit.URLUtil.isJavaScriptUrl(r10)     // Catch:{ XmlPullParserException -> 0x013e, IOException -> 0x013a, all -> 0x0133 }
            java.lang.String r6 = setMax(r6, r9, r10)     // Catch:{ XmlPullParserException -> 0x013e, IOException -> 0x013a, all -> 0x0133 }
            java.lang.String r6 = r6.intern()     // Catch:{ XmlPullParserException -> 0x013e, IOException -> 0x013a, all -> 0x0133 }
            r4.setInput(r0, r6)     // Catch:{ XmlPullParserException -> 0x013e, IOException -> 0x013a, all -> 0x0133 }
            int r6 = invoke
            int r6 = r6 + 117
            int r9 = r6 % 128
            Mean$Arithmetic = r9
            int r6 = r6 % r1
            r6 = 0
        L_0x0088:
            if (r6 == r3) goto L_0x008d
            r9 = 33
            goto L_0x008e
        L_0x008d:
            r9 = 5
        L_0x008e:
            if (r9 == r5) goto L_0x00a1
            r9 = 39
            if (r6 == r1) goto L_0x0097
            r6 = 39
            goto L_0x0099
        L_0x0097:
            r6 = 35
        L_0x0099:
            if (r6 == r9) goto L_0x009c
            goto L_0x00a1
        L_0x009c:
            int r6 = r4.next()     // Catch:{ XmlPullParserException -> 0x013e, IOException -> 0x013a, all -> 0x0133 }
            goto L_0x0088
        L_0x00a1:
            java.lang.String r6 = "historical-records"
            java.lang.String r9 = r4.getName()     // Catch:{ XmlPullParserException -> 0x013e, IOException -> 0x013a, all -> 0x0133 }
            boolean r6 = r6.equals(r9)     // Catch:{ XmlPullParserException -> 0x013e, IOException -> 0x013a, all -> 0x0133 }
            if (r6 == 0) goto L_0x012b
            java.util.List<o.onShuffleModeChanged$length> r6 = r14.toFloatRange     // Catch:{ XmlPullParserException -> 0x013e, IOException -> 0x013a, all -> 0x0133 }
            r6.clear()     // Catch:{ XmlPullParserException -> 0x013e, IOException -> 0x013a, all -> 0x0133 }
        L_0x00b2:
            int r9 = r4.next()     // Catch:{ XmlPullParserException -> 0x013e, IOException -> 0x013a, all -> 0x0133 }
            if (r9 == r3) goto L_0x0121
            int r10 = Mean$Arithmetic
            int r10 = r10 + 73
            int r11 = r10 % 128
            invoke = r11
            int r10 = r10 % r1
            r11 = 75
            if (r10 != 0) goto L_0x00c8
            r10 = 32
            goto L_0x00ca
        L_0x00c8:
            r10 = 75
        L_0x00ca:
            if (r10 == r11) goto L_0x00cf
            if (r9 == r5) goto L_0x00b2
            goto L_0x00d1
        L_0x00cf:
            if (r9 == r7) goto L_0x00b2
        L_0x00d1:
            if (r9 == r8) goto L_0x00b2
            int r9 = Mean$Arithmetic
            int r9 = r9 + r11
            int r10 = r9 % 128
            invoke = r10
            int r9 = r9 % r1
            java.lang.String r10 = "historical-record"
            r11 = 0
            if (r9 != 0) goto L_0x00ec
            java.lang.String r9 = r4.getName()     // Catch:{ XmlPullParserException -> 0x013e, IOException -> 0x013a, all -> 0x0133 }
            boolean r9 = r10.equals(r9)     // Catch:{ XmlPullParserException -> 0x013e, IOException -> 0x013a, all -> 0x0133 }
            int r10 = r11.length     // Catch:{ XmlPullParserException -> 0x013e, IOException -> 0x013a, all -> 0x0133 }
            if (r9 == 0) goto L_0x0119
            goto L_0x00f6
        L_0x00ec:
            java.lang.String r9 = r4.getName()     // Catch:{ XmlPullParserException -> 0x013e, IOException -> 0x013a, all -> 0x0133 }
            boolean r9 = r10.equals(r9)     // Catch:{ XmlPullParserException -> 0x013e, IOException -> 0x013a, all -> 0x0133 }
            if (r9 == 0) goto L_0x0119
        L_0x00f6:
            java.lang.String r9 = "activity"
            java.lang.String r9 = r4.getAttributeValue(r11, r9)     // Catch:{ XmlPullParserException -> 0x013e, IOException -> 0x013a, all -> 0x0133 }
            java.lang.String r10 = "time"
            java.lang.String r10 = r4.getAttributeValue(r11, r10)     // Catch:{ XmlPullParserException -> 0x013e, IOException -> 0x013a, all -> 0x0133 }
            long r12 = java.lang.Long.parseLong(r10)     // Catch:{ XmlPullParserException -> 0x013e, IOException -> 0x013a, all -> 0x0133 }
            java.lang.String r10 = "weight"
            java.lang.String r10 = r4.getAttributeValue(r11, r10)     // Catch:{ XmlPullParserException -> 0x013e, IOException -> 0x013a, all -> 0x0133 }
            float r10 = java.lang.Float.parseFloat(r10)     // Catch:{ XmlPullParserException -> 0x013e, IOException -> 0x013a, all -> 0x0133 }
            o.onShuffleModeChanged$length r11 = new o.onShuffleModeChanged$length     // Catch:{ XmlPullParserException -> 0x013e, IOException -> 0x013a, all -> 0x0133 }
            r11.<init>((java.lang.String) r9, (long) r12, (float) r10)     // Catch:{ XmlPullParserException -> 0x013e, IOException -> 0x013a, all -> 0x0133 }
            r6.add(r11)     // Catch:{ XmlPullParserException -> 0x013e, IOException -> 0x013a, all -> 0x0133 }
            goto L_0x00b2
        L_0x0119:
            org.xmlpull.v1.XmlPullParserException r1 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ XmlPullParserException -> 0x013e, IOException -> 0x013a, all -> 0x0133 }
            java.lang.String r2 = "Share records file not well-formed."
            r1.<init>(r2)     // Catch:{ XmlPullParserException -> 0x013e, IOException -> 0x013a, all -> 0x0133 }
            throw r1     // Catch:{ XmlPullParserException -> 0x013e, IOException -> 0x013a, all -> 0x0133 }
        L_0x0121:
            if (r0 == 0) goto L_0x0124
            r2 = 1
        L_0x0124:
            if (r2 == r3) goto L_0x0127
            goto L_0x0142
        L_0x0127:
            r0.close()     // Catch:{  }
            goto L_0x0142
        L_0x012b:
            org.xmlpull.v1.XmlPullParserException r1 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ XmlPullParserException -> 0x013e, IOException -> 0x013a, all -> 0x0133 }
            java.lang.String r2 = "Share records file does not start with historical-records tag."
            r1.<init>(r2)     // Catch:{ XmlPullParserException -> 0x013e, IOException -> 0x013a, all -> 0x0133 }
            throw r1     // Catch:{ XmlPullParserException -> 0x013e, IOException -> 0x013a, all -> 0x0133 }
        L_0x0133:
            r1 = move-exception
            if (r0 == 0) goto L_0x0139
            r0.close()     // Catch:{ IOException -> 0x0139 }
        L_0x0139:
            throw r1
        L_0x013a:
            if (r0 == 0) goto L_0x0142
            goto L_0x0127
        L_0x013e:
            if (r0 == 0) goto L_0x0142
            goto L_0x0127
        L_0x0142:
            return r3
        L_0x0143:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.onShuffleModeChanged.isInside():boolean");
    }

    public final void toFloatRange() {
        try {
            int i = invoke + 79;
            Mean$Arithmetic = i % 128;
            int i2 = i % 2;
            int size = this.toFloatRange.size() - this.hashCode;
            if (size > 0) {
                this.toDoubleRange = true;
                int i3 = 0;
                while (true) {
                    if ((i3 < size ? 'G' : '9') != '9') {
                        int i4 = invoke + 1;
                        Mean$Arithmetic = i4 % 128;
                        int i5 = i4 % 2;
                        this.toFloatRange.remove(0);
                        i3++;
                    } else {
                        int i6 = Mean$Arithmetic + 77;
                        invoke = i6 % 128;
                        int i7 = i6 % 2;
                        return;
                    }
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public static final class length {
        public final float getMax;
        public final long getMin;
        public final ComponentName length;

        public length(String str, long j, float f) {
            this(ComponentName.unflattenFromString(str), j, f);
        }

        public length(ComponentName componentName, long j, float f) {
            this.length = componentName;
            this.getMin = j;
            this.getMax = f;
        }

        public final int hashCode() {
            ComponentName componentName = this.length;
            int hashCode = componentName == null ? 0 : componentName.hashCode();
            long j = this.getMin;
            return ((((hashCode + 31) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + Float.floatToIntBits(this.getMax);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            length length2 = (length) obj;
            ComponentName componentName = this.length;
            if (componentName == null) {
                if (length2.length != null) {
                    return false;
                }
            } else if (!componentName.equals(length2.length)) {
                return false;
            }
            return this.getMin == length2.getMin && Float.floatToIntBits(this.getMax) == Float.floatToIntBits(length2.getMax);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            sb.append("; activity:");
            sb.append(this.length);
            sb.append("; time:");
            sb.append(this.getMin);
            sb.append("; weight:");
            sb.append(new BigDecimal((double) this.getMax));
            sb.append("]");
            return sb.toString();
        }
    }

    public static final class setMax implements Comparable<setMax> {
        public float setMax;
        public final ResolveInfo setMin;

        public final /* synthetic */ int compareTo(Object obj) {
            return Float.floatToIntBits(((setMax) obj).setMax) - Float.floatToIntBits(this.setMax);
        }

        public setMax(ResolveInfo resolveInfo) {
            this.setMin = resolveInfo;
        }

        public final int hashCode() {
            return Float.floatToIntBits(this.setMax) + 31;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && Float.floatToIntBits(this.setMax) == Float.floatToIntBits(((setMax) obj).setMax);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            sb.append("resolveInfo:");
            sb.append(this.setMin.toString());
            sb.append("; weight:");
            sb.append(new BigDecimal((double) this.setMax));
            sb.append("]");
            return sb.toString();
        }
    }

    final class getMin extends AsyncTask<Object, Void, Void> {
        private static int getMax = 125;
        private static int length = 1;
        private static int setMax;

        public final /* synthetic */ Object doInBackground(Object[] objArr) {
            int i = setMax + 19;
            length = i % 128;
            if ((i % 2 == 0 ? Typography.quote : '`') == '`') {
                return getMax(objArr);
            }
            Void max = getMax(objArr);
            Object[] objArr2 = null;
            int length2 = objArr2.length;
            return max;
        }

        getMin() {
        }

        /* JADX WARNING: type inference failed for: r0v5, types: [java.lang.Void] */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x00b8, code lost:
            if ((r6 == null) != true) goto L_0x00ba;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
            r6.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x00be, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
            r0 = o.onShuffleModeChanged.setMin;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x00cb, code lost:
            r0 = setMax + 7;
            length = r0 % 128;
            r0 = r0 % 2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
            r0 = o.onShuffleModeChanged.setMin;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x00d7, code lost:
            r1.setMin.equals = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x00db, code lost:
            if (r6 == null) goto L_0x00f2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
            r0 = o.onShuffleModeChanged.setMin;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x00e0, code lost:
            r1.setMin.equals = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x00e4, code lost:
            if (r6 != null) goto L_0x00e6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
            r6.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x00e9, code lost:
            r0 = length + 73;
            setMax = r0 % 128;
            r0 = r0 % 2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:48:0x0108, code lost:
            r1.setMin.equals = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:49:0x010c, code lost:
            if (r6 != null) goto L_0x010e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:51:?, code lost:
            r6.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:52:0x0111, code lost:
            throw r0;
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [B:17:0x00c0, B:24:0x00d5, B:28:0x00de] */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x00c0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x00d5 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x00de */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private java.lang.Void getMax(java.lang.Object... r20) {
            /*
                r19 = this;
                r1 = r19
                java.lang.String r0 = "historical-record"
                java.lang.String r2 = "historical-records"
                r3 = 0
                r4 = r20[r3]
                java.util.List r4 = (java.util.List) r4
                r5 = 1
                r6 = r20[r5]
                java.lang.String r6 = (java.lang.String) r6
                r7 = 0
                o.onShuffleModeChanged r8 = o.onShuffleModeChanged.this     // Catch:{ FileNotFoundException -> 0x0112 }
                android.content.Context r8 = r8.length     // Catch:{ FileNotFoundException -> 0x0112 }
                java.io.FileOutputStream r6 = r8.openFileOutput(r6, r3)     // Catch:{ FileNotFoundException -> 0x0112 }
                int r8 = length
                int r8 = r8 + 53
                int r9 = r8 % 128
                setMax = r9
                r9 = 2
                int r8 = r8 % r9
                org.xmlpull.v1.XmlSerializer r8 = android.util.Xml.newSerializer()
                r8.setOutput(r6, r7)     // Catch:{ IllegalArgumentException -> 0x00de, IllegalStateException -> 0x00d5, IOException -> 0x00c0 }
                int r10 = android.view.ViewConfiguration.getJumpTapTimeout()     // Catch:{ IllegalArgumentException -> 0x00de, IllegalStateException -> 0x00d5, IOException -> 0x00c0 }
                r11 = 16
                int r10 = r10 >> r11
                r12 = 3
                int r10 = r10 + r12
                int r13 = android.view.View.resolveSizeAndState(r3, r3, r3)     // Catch:{ IllegalArgumentException -> 0x00de, IllegalStateException -> 0x00d5, IOException -> 0x00c0 }
                int r13 = 193 - r13
                r14 = 48
                boolean r14 = android.telephony.PhoneNumberUtils.isDialable(r14)     // Catch:{ IllegalArgumentException -> 0x00de, IllegalStateException -> 0x00d5, IOException -> 0x00c0 }
                r15 = 5
                char[] r7 = new char[r15]     // Catch:{ IllegalArgumentException -> 0x00de, IllegalStateException -> 0x00d5, IOException -> 0x00c0 }
                r7[r3] = r9     // Catch:{ IllegalArgumentException -> 0x00de, IllegalStateException -> 0x00d5, IOException -> 0x00c0 }
                r7[r5] = r11     // Catch:{ IllegalArgumentException -> 0x00de, IllegalStateException -> 0x00d5, IOException -> 0x00c0 }
                r11 = 17
                r7[r9] = r11     // Catch:{ IllegalArgumentException -> 0x00de, IllegalStateException -> 0x00d5, IOException -> 0x00c0 }
                r11 = 65524(0xfff4, float:9.1819E-41)
                r7[r12] = r11     // Catch:{ IllegalArgumentException -> 0x00de, IllegalStateException -> 0x00d5, IOException -> 0x00c0 }
                r11 = 4
                r12 = 65513(0xffe9, float:9.1803E-41)
                r7[r11] = r12     // Catch:{ IllegalArgumentException -> 0x00de, IllegalStateException -> 0x00d5, IOException -> 0x00c0 }
                long r11 = android.widget.ExpandableListView.getPackedPositionForGroup(r3)     // Catch:{ IllegalArgumentException -> 0x00de, IllegalStateException -> 0x00d5, IOException -> 0x00c0 }
                r16 = 0
                int r18 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
                int r11 = r18 + 5
                java.lang.String r7 = getMax(r10, r13, r14, r7, r11)     // Catch:{ IllegalArgumentException -> 0x00de, IllegalStateException -> 0x00d5, IOException -> 0x00c0 }
                java.lang.String r7 = r7.intern()     // Catch:{ IllegalArgumentException -> 0x00de, IllegalStateException -> 0x00d5, IOException -> 0x00c0 }
                java.lang.Boolean r10 = java.lang.Boolean.TRUE     // Catch:{ IllegalArgumentException -> 0x00de, IllegalStateException -> 0x00d5, IOException -> 0x00c0 }
                r8.startDocument(r7, r10)     // Catch:{ IllegalArgumentException -> 0x00de, IllegalStateException -> 0x00d5, IOException -> 0x00c0 }
                r7 = 0
                r8.startTag(r7, r2)     // Catch:{ IllegalArgumentException -> 0x00de, IllegalStateException -> 0x00d5, IOException -> 0x00c0 }
                int r7 = r4.size()     // Catch:{ IllegalArgumentException -> 0x00de, IllegalStateException -> 0x00d5, IOException -> 0x00c0 }
                r10 = 0
            L_0x0075:
                if (r10 >= r7) goto L_0x00a8
                java.lang.Object r11 = r4.remove(r3)     // Catch:{ IllegalArgumentException -> 0x00de, IllegalStateException -> 0x00d5, IOException -> 0x00c0 }
                o.onShuffleModeChanged$length r11 = (o.onShuffleModeChanged.length) r11     // Catch:{ IllegalArgumentException -> 0x00de, IllegalStateException -> 0x00d5, IOException -> 0x00c0 }
                r12 = 0
                r8.startTag(r12, r0)     // Catch:{ IllegalArgumentException -> 0x00de, IllegalStateException -> 0x00d5, IOException -> 0x00c0 }
                java.lang.String r13 = "activity"
                android.content.ComponentName r14 = r11.length     // Catch:{ IllegalArgumentException -> 0x00de, IllegalStateException -> 0x00d5, IOException -> 0x00c0 }
                java.lang.String r14 = r14.flattenToString()     // Catch:{ IllegalArgumentException -> 0x00de, IllegalStateException -> 0x00d5, IOException -> 0x00c0 }
                r8.attribute(r12, r13, r14)     // Catch:{ IllegalArgumentException -> 0x00de, IllegalStateException -> 0x00d5, IOException -> 0x00c0 }
                java.lang.String r13 = "time"
                long r14 = r11.getMin     // Catch:{ IllegalArgumentException -> 0x00de, IllegalStateException -> 0x00d5, IOException -> 0x00c0 }
                java.lang.String r14 = java.lang.String.valueOf(r14)     // Catch:{ IllegalArgumentException -> 0x00de, IllegalStateException -> 0x00d5, IOException -> 0x00c0 }
                r8.attribute(r12, r13, r14)     // Catch:{ IllegalArgumentException -> 0x00de, IllegalStateException -> 0x00d5, IOException -> 0x00c0 }
                java.lang.String r13 = "weight"
                float r11 = r11.getMax     // Catch:{ IllegalArgumentException -> 0x00de, IllegalStateException -> 0x00d5, IOException -> 0x00c0 }
                java.lang.String r11 = java.lang.String.valueOf(r11)     // Catch:{ IllegalArgumentException -> 0x00de, IllegalStateException -> 0x00d5, IOException -> 0x00c0 }
                r8.attribute(r12, r13, r11)     // Catch:{ IllegalArgumentException -> 0x00de, IllegalStateException -> 0x00d5, IOException -> 0x00c0 }
                r8.endTag(r12, r0)     // Catch:{ IllegalArgumentException -> 0x00de, IllegalStateException -> 0x00d5, IOException -> 0x00c0 }
                int r10 = r10 + 1
                goto L_0x0075
            L_0x00a8:
                r0 = 0
                r8.endTag(r0, r2)     // Catch:{ IllegalArgumentException -> 0x00de, IllegalStateException -> 0x00d5, IOException -> 0x00c0 }
                r8.endDocument()     // Catch:{ IllegalArgumentException -> 0x00de, IllegalStateException -> 0x00d5, IOException -> 0x00c0 }
                o.onShuffleModeChanged r0 = o.onShuffleModeChanged.this
                r0.equals = r5
                if (r6 == 0) goto L_0x00b7
                r0 = 0
                goto L_0x00b8
            L_0x00b7:
                r0 = 1
            L_0x00b8:
                if (r0 == r5) goto L_0x00f2
            L_0x00ba:
                r6.close()     // Catch:{ IOException -> 0x00f2 }
                goto L_0x00f2
            L_0x00be:
                r0 = move-exception
                goto L_0x0108
            L_0x00c0:
                java.lang.String r0 = o.onShuffleModeChanged.setMin     // Catch:{ all -> 0x00be }
                o.onShuffleModeChanged r0 = o.onShuffleModeChanged.this
                r0.equals = r5
                if (r6 == 0) goto L_0x00f2
                r6.close()     // Catch:{ IOException -> 0x00f2 }
                int r0 = setMax
                int r0 = r0 + 7
                int r2 = r0 % 128
                length = r2
                int r0 = r0 % r9
                goto L_0x00f2
            L_0x00d5:
                java.lang.String r0 = o.onShuffleModeChanged.setMin     // Catch:{ all -> 0x00be }
                o.onShuffleModeChanged r0 = o.onShuffleModeChanged.this
                r0.equals = r5
                if (r6 == 0) goto L_0x00f2
                goto L_0x00ba
            L_0x00de:
                java.lang.String r0 = o.onShuffleModeChanged.setMin     // Catch:{ all -> 0x00be }
                o.onShuffleModeChanged r0 = o.onShuffleModeChanged.this
                r0.equals = r5
                if (r6 == 0) goto L_0x00f2
                r6.close()     // Catch:{ IOException -> 0x00f2 }
                int r0 = length
                int r0 = r0 + 73
                int r2 = r0 % 128
                setMax = r2
                int r0 = r0 % r9
            L_0x00f2:
                int r0 = length
                int r0 = r0 + 47
                int r2 = r0 % 128
                setMax = r2
                int r0 = r0 % r9
                if (r0 == 0) goto L_0x00fe
                r3 = 1
            L_0x00fe:
                if (r3 == r5) goto L_0x0102
                r0 = 0
                return r0
            L_0x0102:
                r0 = 0
                int r2 = r0.length     // Catch:{ all -> 0x0105 }
                return r0
            L_0x0105:
                r0 = move-exception
                r2 = r0
                throw r2
            L_0x0108:
                o.onShuffleModeChanged r2 = o.onShuffleModeChanged.this
                r2.equals = r5
                if (r6 == 0) goto L_0x0111
                r6.close()     // Catch:{ IOException -> 0x0111 }
            L_0x0111:
                throw r0
            L_0x0112:
                java.lang.String r0 = o.onShuffleModeChanged.setMin
                r2 = 0
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: o.onShuffleModeChanged.getMin.getMax(java.lang.Object[]):java.lang.Void");
        }

        private static String getMax(int i, int i2, boolean z, char[] cArr, int i3) {
            try {
                int i4 = setMax + 73;
                try {
                    length = i4 % 128;
                    if (i4 % 2 == 0) {
                    }
                    char[] cArr2 = new char[i3];
                    for (int i5 = 0; i5 < i3; i5++) {
                        int i6 = setMax + 109;
                        length = i6 % 128;
                        int i7 = i6 % 2;
                        cArr2[i5] = (char) (cArr[i5] + i2);
                        cArr2[i5] = (char) (cArr2[i5] - getMax);
                    }
                    if (i > 0) {
                        int i8 = setMax + 35;
                        length = i8 % 128;
                        int i9 = i8 % 2;
                        char[] cArr3 = new char[i3];
                        System.arraycopy(cArr2, 0, cArr3, 0, i3);
                        int i10 = i3 - i;
                        System.arraycopy(cArr3, 0, cArr2, i10, i);
                        System.arraycopy(cArr3, i, cArr2, 0, i10);
                    }
                    if (z) {
                        int i11 = setMax + 123;
                        length = i11 % 128;
                        int i12 = i11 % 2;
                        char[] cArr4 = new char[i3];
                        for (int i13 = 0; i13 < i3; i13++) {
                            int i14 = setMax + 11;
                            length = i14 % 128;
                            int i15 = i14 % 2;
                            cArr4[i13] = cArr2[(i3 - i13) - 1];
                        }
                        int i16 = length + 83;
                        setMax = i16 % 128;
                        int i17 = i16 % 2;
                        cArr2 = cArr4;
                    }
                    return new String(cArr2);
                } catch (Exception e) {
                    throw e;
                }
            } catch (Exception e2) {
                throw e2;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0028, code lost:
        if ((r9 ? kotlin.text.Typography.amp : '6') != '6') goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0033, code lost:
        if (r9 != false) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x005d, code lost:
        if (android.text.TextUtils.isEmpty(r8.getMax) == false) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0068, code lost:
        if (android.text.TextUtils.isEmpty(r8.getMax) == false) goto L_0x006a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean getMin(o.onShuffleModeChanged.length r9) {
        /*
            r8 = this;
            int r0 = Mean$Arithmetic     // Catch:{ Exception -> 0x009e }
            int r0 = r0 + 81
            int r1 = r0 % 128
            invoke = r1     // Catch:{ Exception -> 0x009e }
            r1 = 2
            int r0 = r0 % r1
            r2 = 68
            if (r0 != 0) goto L_0x0011
            r0 = 65
            goto L_0x0013
        L_0x0011:
            r0 = 68
        L_0x0013:
            if (r0 == r2) goto L_0x002d
            java.util.List<o.onShuffleModeChanged$length> r0 = r8.toFloatRange
            boolean r9 = r0.add(r9)
            r0 = 0
            super.hashCode()     // Catch:{ all -> 0x002b }
            r0 = 54
            if (r9 == 0) goto L_0x0026
            r2 = 38
            goto L_0x0028
        L_0x0026:
            r2 = 54
        L_0x0028:
            if (r2 == r0) goto L_0x0092
            goto L_0x0035
        L_0x002b:
            r9 = move-exception
            throw r9
        L_0x002d:
            java.util.List<o.onShuffleModeChanged$length> r0 = r8.toFloatRange     // Catch:{ Exception -> 0x009c }
            boolean r9 = r0.add(r9)     // Catch:{ Exception -> 0x009c }
            if (r9 == 0) goto L_0x0092
        L_0x0035:
            r0 = 1
            r8.toDoubleRange = r0
            r8.toFloatRange()
            boolean r2 = r8.toString
            if (r2 == 0) goto L_0x008a
            boolean r2 = r8.toDoubleRange
            r3 = 0
            if (r2 == 0) goto L_0x0046
            r2 = 1
            goto L_0x0047
        L_0x0046:
            r2 = 0
        L_0x0047:
            if (r2 == r0) goto L_0x004a
            goto L_0x0083
        L_0x004a:
            int r2 = invoke
            int r2 = r2 + 111
            int r4 = r2 % 128
            Mean$Arithmetic = r4
            int r2 = r2 % r1
            if (r2 == 0) goto L_0x0060
            r8.toDoubleRange = r0
            java.lang.String r2 = r8.getMax
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x0083
            goto L_0x006a
        L_0x0060:
            r8.toDoubleRange = r3
            java.lang.String r2 = r8.getMax
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x0083
        L_0x006a:
            o.onShuffleModeChanged$getMin r2 = new o.onShuffleModeChanged$getMin
            r2.<init>()
            java.util.concurrent.Executor r4 = android.os.AsyncTask.THREAD_POOL_EXECUTOR
            java.lang.Object[] r5 = new java.lang.Object[r1]
            java.util.ArrayList r6 = new java.util.ArrayList
            java.util.List<o.onShuffleModeChanged$length> r7 = r8.toFloatRange
            r6.<init>(r7)
            r5[r3] = r6
            java.lang.String r3 = r8.getMax
            r5[r0] = r3
            r2.executeOnExecutor(r4, r5)
        L_0x0083:
            r8.getMin()
            r8.notifyChanged()
            goto L_0x0092
        L_0x008a:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "No preceding call to #readHistoricalData"
            r9.<init>(r0)
            throw r9
        L_0x0092:
            int r0 = Mean$Arithmetic     // Catch:{ Exception -> 0x009e }
            int r0 = r0 + 111
            int r2 = r0 % 128
            invoke = r2     // Catch:{ Exception -> 0x009e }
            int r0 = r0 % r1
            return r9
        L_0x009c:
            r9 = move-exception
            throw r9
        L_0x009e:
            r9 = move-exception
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: o.onShuffleModeChanged.getMin(o.onShuffleModeChanged$length):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0048, code lost:
        if ((r12[r7] == 1 ? 'G' : 25) != 25) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004d, code lost:
        if (r12[r7] == 1) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0058, code lost:
        r2[r7] = (char) ((r8[r7] << 1) - r9);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String setMax(byte[] r12, int[] r13, boolean r14) {
        /*
            int r0 = Mean$Arithmetic     // Catch:{ Exception -> 0x00e3 }
            int r0 = r0 + 107
            int r1 = r0 % 128
            invoke = r1     // Catch:{ Exception -> 0x00e1 }
            r1 = 2
            int r0 = r0 % r1
            r0 = 0
            r2 = r13[r0]
            r3 = 1
            r4 = r13[r3]
            r5 = r13[r1]
            r6 = 3
            r6 = r13[r6]
            char[] r7 = invokeSuspend
            char[] r8 = new char[r4]
            java.lang.System.arraycopy(r7, r2, r8, r0, r4)
            if (r12 == 0) goto L_0x0065
            int r2 = Mean$Arithmetic     // Catch:{ Exception -> 0x00e3 }
            int r2 = r2 + 117
            int r7 = r2 % 128
            invoke = r7
            int r2 = r2 % r1
            char[] r2 = new char[r4]
            r7 = 0
            r9 = 0
        L_0x002b:
            if (r7 >= r4) goto L_0x0064
            int r10 = invoke
            int r10 = r10 + 21
            int r11 = r10 % 128
            Mean$Arithmetic = r11
            int r10 = r10 % r1
            if (r10 == 0) goto L_0x003a
            r10 = 0
            goto L_0x003b
        L_0x003a:
            r10 = 1
        L_0x003b:
            if (r10 == 0) goto L_0x004b
            byte r10 = r12[r7]
            r11 = 25
            if (r10 != r3) goto L_0x0046
            r10 = 71
            goto L_0x0048
        L_0x0046:
            r10 = 25
        L_0x0048:
            if (r10 == r11) goto L_0x0058
            goto L_0x004f
        L_0x004b:
            byte r10 = r12[r7]
            if (r10 != r3) goto L_0x0058
        L_0x004f:
            char r10 = r8[r7]
            int r10 = r10 << r3
            int r10 = r10 + r3
            int r10 = r10 - r9
            char r9 = (char) r10
            r2[r7] = r9
            goto L_0x005f
        L_0x0058:
            char r10 = r8[r7]
            int r10 = r10 << r3
            int r10 = r10 - r9
            char r9 = (char) r10
            r2[r7] = r9
        L_0x005f:
            char r9 = r2[r7]
            int r7 = r7 + 1
            goto L_0x002b
        L_0x0064:
            r8 = r2
        L_0x0065:
            if (r6 <= 0) goto L_0x0069
            r12 = 1
            goto L_0x006a
        L_0x0069:
            r12 = 0
        L_0x006a:
            if (r12 == r3) goto L_0x006d
            goto L_0x0083
        L_0x006d:
            int r12 = invoke
            int r12 = r12 + 41
            int r2 = r12 % 128
            Mean$Arithmetic = r2
            int r12 = r12 % r1
            char[] r12 = new char[r4]
            java.lang.System.arraycopy(r8, r0, r12, r0, r4)
            int r2 = r4 - r6
            java.lang.System.arraycopy(r12, r0, r8, r2, r6)
            java.lang.System.arraycopy(r12, r6, r8, r0, r2)
        L_0x0083:
            if (r14 == 0) goto L_0x0087
            r12 = 0
            goto L_0x0088
        L_0x0087:
            r12 = 1
        L_0x0088:
            if (r12 == 0) goto L_0x008b
            goto L_0x00a3
        L_0x008b:
            int r12 = invoke     // Catch:{ Exception -> 0x00e3 }
            int r12 = r12 + 91
            int r14 = r12 % 128
            Mean$Arithmetic = r14     // Catch:{ Exception -> 0x00e3 }
            int r12 = r12 % r1
            char[] r12 = new char[r4]
            r14 = 0
        L_0x0097:
            r2 = 24
            if (r14 >= r4) goto L_0x009e
            r6 = 24
            goto L_0x00a0
        L_0x009e:
            r6 = 87
        L_0x00a0:
            if (r6 == r2) goto L_0x00ce
            r8 = r12
        L_0x00a3:
            if (r5 <= 0) goto L_0x00c8
            int r12 = Mean$Arithmetic
            int r12 = r12 + 19
            int r14 = r12 % 128
            invoke = r14
            int r12 = r12 % r1
            if (r12 != 0) goto L_0x00b1
            goto L_0x00b2
        L_0x00b1:
            r3 = 0
        L_0x00b2:
            if (r0 >= r4) goto L_0x00c8
            int r12 = Mean$Arithmetic
            int r12 = r12 + 103
            int r14 = r12 % 128
            invoke = r14
            int r12 = r12 % r1
            char r12 = r8[r0]
            r14 = r13[r1]
            int r12 = r12 - r14
            char r12 = (char) r12
            r8[r0] = r12
            int r0 = r0 + 1
            goto L_0x00b2
        L_0x00c8:
            java.lang.String r12 = new java.lang.String
            r12.<init>(r8)
            return r12
        L_0x00ce:
            int r2 = Mean$Arithmetic
            int r2 = r2 + 111
            int r6 = r2 % 128
            invoke = r6
            int r2 = r2 % r1
            int r2 = r4 - r14
            int r2 = r2 - r3
            char r2 = r8[r2]
            r12[r14] = r2
            int r14 = r14 + 1
            goto L_0x0097
        L_0x00e1:
            r12 = move-exception
            throw r12
        L_0x00e3:
            r12 = move-exception
            goto L_0x00e6
        L_0x00e5:
            throw r12
        L_0x00e6:
            goto L_0x00e5
        */
        throw new UnsupportedOperationException("Method not decompiled: o.onShuffleModeChanged.setMax(byte[], int[], boolean):java.lang.String");
    }
}
