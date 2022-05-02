package o;

import com.google.common.net.HttpHeaders;
import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;

public interface CustomTabsService {

    public interface FilePurpose {
        getPreventCornerOverlap getMax();

        CustomTabsService setMin();
    }

    entryRemoved getMin();

    public final class Relation {
        public final getPreventCornerOverlap getMin;
        public final getRadius setMin;

        /* synthetic */ Relation(getRadius getradius, getPreventCornerOverlap getpreventcorneroverlap, byte b) {
            this(getradius, getpreventcorneroverlap);
        }

        private Relation(getRadius getradius, getPreventCornerOverlap getpreventcorneroverlap) {
            this.setMin = getradius;
            this.getMin = getpreventcorneroverlap;
        }

        public static class setMin {
            Date IsOverlapping;
            long equals;
            final long getMax;
            String getMin;
            int hashCode = -1;
            String isInside;
            final getPreventCornerOverlap length;
            final getRadius setMax;
            Date setMin;
            Date toFloatRange;
            long toIntRange;
            String toString;

            public setMin(long j, getRadius getradius, getPreventCornerOverlap getpreventcorneroverlap) {
                this.getMax = j;
                this.setMax = getradius;
                this.length = getpreventcorneroverlap;
                if (getpreventcorneroverlap != null) {
                    this.equals = getpreventcorneroverlap.toDoubleRange;
                    this.toIntRange = getpreventcorneroverlap.toString;
                    setCardElevation setcardelevation = getpreventcorneroverlap.toFloatRange;
                    int length2 = setcardelevation.setMin.length / 2;
                    for (int i = 0; i < length2; i++) {
                        int i2 = i * 2;
                        String str = setcardelevation.setMin[i2];
                        String str2 = setcardelevation.setMin[i2 + 1];
                        if ("Date".equalsIgnoreCase(str)) {
                            this.setMin = onGetActiveNotifications.setMax(str2);
                            this.getMin = str2;
                        } else if (HttpHeaders.EXPIRES.equalsIgnoreCase(str)) {
                            this.toFloatRange = onGetActiveNotifications.setMax(str2);
                        } else if (HttpHeaders.LAST_MODIFIED.equalsIgnoreCase(str)) {
                            this.IsOverlapping = onGetActiveNotifications.setMax(str2);
                            this.isInside = str2;
                        } else if ("ETag".equalsIgnoreCase(str)) {
                            this.toString = str2;
                        } else if (HttpHeaders.AGE.equalsIgnoreCase(str)) {
                            this.hashCode = onCancelNotification.setMin(str2, -1);
                        }
                    }
                }
            }

            /* access modifiers changed from: package-private */
            public final boolean setMin() {
                getPreventCornerOverlap getpreventcorneroverlap = this.length;
                getLayoutResource getlayoutresource = getpreventcorneroverlap.values;
                if (getlayoutresource == null) {
                    getlayoutresource = getLayoutResource.getMin(getpreventcorneroverlap.toFloatRange);
                    getpreventcorneroverlap.values = getlayoutresource;
                }
                return getlayoutresource.getMin == -1 && this.toFloatRange == null;
            }

            static boolean getMin(getRadius getradius) {
                return (setCardElevation.setMax(getradius.setMin.setMin, "If-Modified-Since") == null && setCardElevation.setMax(getradius.setMin.setMin, "If-None-Match") == null) ? false : true;
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:39:0x0075, code lost:
            if (r0.setMin() == false) goto L_0x0077;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:40:0x0077, code lost:
            return false;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static boolean getMin(o.getPreventCornerOverlap r3, o.getRadius r4) {
            /*
                int r0 = r3.length
                r1 = 200(0xc8, float:2.8E-43)
                r2 = 0
                if (r0 == r1) goto L_0x0078
                r1 = 410(0x19a, float:5.75E-43)
                if (r0 == r1) goto L_0x0078
                r1 = 414(0x19e, float:5.8E-43)
                if (r0 == r1) goto L_0x0078
                r1 = 501(0x1f5, float:7.02E-43)
                if (r0 == r1) goto L_0x0078
                r1 = 203(0xcb, float:2.84E-43)
                if (r0 == r1) goto L_0x0078
                r1 = 204(0xcc, float:2.86E-43)
                if (r0 == r1) goto L_0x0078
                r1 = 307(0x133, float:4.3E-43)
                if (r0 == r1) goto L_0x002f
                r1 = 308(0x134, float:4.32E-43)
                if (r0 == r1) goto L_0x0078
                r1 = 404(0x194, float:5.66E-43)
                if (r0 == r1) goto L_0x0078
                r1 = 405(0x195, float:5.68E-43)
                if (r0 == r1) goto L_0x0078
                switch(r0) {
                    case 300: goto L_0x0078;
                    case 301: goto L_0x0078;
                    case 302: goto L_0x002f;
                    default: goto L_0x002e;
                }
            L_0x002e:
                goto L_0x0077
            L_0x002f:
                o.setCardElevation r0 = r3.toFloatRange
                java.lang.String[] r0 = r0.setMin
                java.lang.String r1 = "Expires"
                java.lang.String r0 = o.setCardElevation.setMax(r0, r1)
                if (r0 == 0) goto L_0x003c
                goto L_0x003d
            L_0x003c:
                r0 = 0
            L_0x003d:
                if (r0 != 0) goto L_0x0078
                o.getLayoutResource r0 = r3.values
                if (r0 == 0) goto L_0x0044
                goto L_0x004c
            L_0x0044:
                o.setCardElevation r0 = r3.toFloatRange
                o.getLayoutResource r0 = o.getLayoutResource.getMin(r0)
                r3.values = r0
            L_0x004c:
                int r0 = r0.getMin
                r1 = -1
                if (r0 != r1) goto L_0x0078
                o.getLayoutResource r0 = r3.values
                if (r0 == 0) goto L_0x0056
                goto L_0x005e
            L_0x0056:
                o.setCardElevation r0 = r3.toFloatRange
                o.getLayoutResource r0 = o.getLayoutResource.getMin(r0)
                r3.values = r0
            L_0x005e:
                boolean r0 = r0.length()
                if (r0 != 0) goto L_0x0078
                o.getLayoutResource r0 = r3.values
                if (r0 == 0) goto L_0x0069
                goto L_0x0071
            L_0x0069:
                o.setCardElevation r0 = r3.toFloatRange
                o.getLayoutResource r0 = o.getLayoutResource.getMin(r0)
                r3.values = r0
            L_0x0071:
                boolean r0 = r0.setMin()
                if (r0 != 0) goto L_0x0078
            L_0x0077:
                return r2
            L_0x0078:
                o.getLayoutResource r0 = r3.values
                if (r0 == 0) goto L_0x007d
                goto L_0x0085
            L_0x007d:
                o.setCardElevation r0 = r3.toFloatRange
                o.getLayoutResource r0 = o.getLayoutResource.getMin(r0)
                r3.values = r0
            L_0x0085:
                boolean r3 = r0.getMin()
                if (r3 != 0) goto L_0x00a0
                o.getLayoutResource r3 = r4.toFloatRange
                if (r3 == 0) goto L_0x0090
                goto L_0x0098
            L_0x0090:
                o.setCardElevation r3 = r4.setMin
                o.getLayoutResource r3 = o.getLayoutResource.getMin(r3)
                r4.toFloatRange = r3
            L_0x0098:
                boolean r3 = r3.getMin()
                if (r3 != 0) goto L_0x00a0
                r3 = 1
                return r3
            L_0x00a0:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: o.CustomTabsService.Relation.getMin(o.getPreventCornerOverlap, o.getRadius):boolean");
        }
    }

    public final class Result implements Closeable, Flushable {
        static final Pattern length = Pattern.compile("[a-z0-9_-]{1,120}");
        static final /* synthetic */ boolean setMin = (!Result.class.desiredAssertionStatus());
        private static final entryRemoved toDoubleRange = new entryRemoved() {
            public final void close() {
            }

            public final void flush() {
            }

            public final void setMax(maxSize maxsize, long j) {
                maxsize.setMin(j);
            }

            public final loadParameters setMin() {
                return loadParameters.getMax;
            }
        };
        private boolean FastBitmap$CoordinateSystem;
        private int IsOverlapping;
        private long equals;
        private long getMax;
        private final getContentPaddingBottom getMin;
        private final Runnable hashCode;
        private resize isInside;
        private final int setMax;
        private boolean toFloatRange;
        private final LinkedHashMap<String, length> toIntRange;
        private boolean toString;
        private final Executor values;

        public final class setMax {
            final /* synthetic */ Result getMin;
            final length setMax;
            boolean setMin;
        }

        private boolean getMax() {
            int i = this.IsOverlapping;
            return i >= 2000 && i >= this.toIntRange.size();
        }

        private synchronized boolean setMin() {
            return this.FastBitmap$CoordinateSystem;
        }

        private synchronized void getMin() {
            if (setMin()) {
                throw new IllegalStateException("cache is closed");
            }
        }

        public final synchronized void flush() {
            if (this.toFloatRange) {
                getMin();
                setMax();
                this.isInside.flush();
            }
        }

        public final synchronized void close() {
            if (this.toFloatRange) {
                if (!this.FastBitmap$CoordinateSystem) {
                    for (length length2 : (length[]) this.toIntRange.values().toArray(new length[this.toIntRange.size()])) {
                        if (length2.getMin != null) {
                            setMax setmax = length2.getMin;
                            synchronized (setmax.getMin) {
                                if (!setmax.setMin) {
                                    if (setmax.setMax.getMin == setmax) {
                                        setmax.getMin.getMax(setmax);
                                    }
                                    setmax.setMin = true;
                                } else {
                                    throw new IllegalStateException();
                                }
                            }
                        }
                    }
                    setMax();
                    this.isInside.close();
                    this.isInside = null;
                    this.FastBitmap$CoordinateSystem = true;
                    return;
                }
            }
            this.FastBitmap$CoordinateSystem = true;
        }

        private void setMax() {
            while (this.equals > this.getMax) {
                setMin(this.toIntRange.values().iterator().next());
            }
            this.toString = false;
        }

        final class length {
            final File[] getMax;
            setMax getMin;
            /* access modifiers changed from: private */
            public boolean isInside;
            final File[] length;
            final String setMax;
            final long[] setMin;

            /* access modifiers changed from: package-private */
            public final void setMax(resize resize) {
                for (long min : this.setMin) {
                    resize.getMin(32).getMin(min);
                }
            }
        }

        private synchronized void getMax(setMax setmax) {
            length length2 = setmax.setMax;
            if (length2.getMin == setmax) {
                for (int i = 0; i < this.setMax; i++) {
                    this.getMin.getMax(length2.length[i]);
                }
                this.IsOverlapping++;
                length2.getMin = null;
                if (false || length2.isInside) {
                    boolean unused = length2.isInside = true;
                    this.isInside.getMin("CLEAN").getMin(32);
                    this.isInside.getMin(length2.setMax);
                    length2.setMax(this.isInside);
                    this.isInside.getMin(10);
                } else {
                    this.toIntRange.remove(length2.setMax);
                    this.isInside.getMin("REMOVE").getMin(32);
                    this.isInside.getMin(length2.setMax);
                    this.isInside.getMin(10);
                }
                this.isInside.flush();
                if (this.equals > this.getMax || getMax()) {
                    this.values.execute(this.hashCode);
                }
            } else {
                throw new IllegalStateException();
            }
        }

        private boolean setMin(length length2) {
            if (length2.getMin != null) {
                setMax setmax = length2.getMin;
                if (setmax.setMax.getMin == setmax) {
                    for (int i = 0; i < setmax.getMin.setMax; i++) {
                        try {
                            setmax.getMin.getMin.getMax(setmax.setMax.length[i]);
                        } catch (IOException unused) {
                        }
                    }
                    setmax.setMax.getMin = null;
                }
            }
            for (int i2 = 0; i2 < this.setMax; i2++) {
                this.getMin.getMax(length2.getMax[i2]);
                this.equals -= length2.setMin[i2];
                length2.setMin[i2] = 0;
            }
            this.IsOverlapping++;
            this.isInside.getMin("REMOVE").getMin(32).getMin(length2.setMax).getMin(10);
            this.toIntRange.remove(length2.setMax);
            if (getMax()) {
                this.values.execute(this.hashCode);
            }
            return true;
        }
    }
}
