package com.google.maps.android.heatmaps;

import android.graphics.Bitmap;
import android.graphics.Color;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Tile;
import com.google.android.gms.maps.model.TileProvider;
import com.google.maps.android.geometry.Bounds;
import com.google.maps.android.quadtree.PointQuadTree;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import o.PlaybackStateCompat;

public class HeatmapTileProvider implements TileProvider {
    public static final Gradient DEFAULT_GRADIENT;
    private static final int[] DEFAULT_GRADIENT_COLORS;
    private static final float[] DEFAULT_GRADIENT_START_POINTS;
    private static final int DEFAULT_MAX_ZOOM = 11;
    private static final int DEFAULT_MIN_ZOOM = 5;
    public static final double DEFAULT_OPACITY = 0.7d;
    public static final int DEFAULT_RADIUS = 20;
    private static final int MAX_RADIUS = 50;
    private static final int MAX_ZOOM_LEVEL = 22;
    private static final int MIN_RADIUS = 10;
    private static final int SCREEN_SIZE = 1280;
    private static final int TILE_DIM = 512;
    static final double WORLD_WIDTH = 1.0d;
    private Bounds mBounds;
    private int[] mColorMap;
    private double mCustomMaxIntensity;
    private Collection<WeightedLatLng> mData;
    private Gradient mGradient;
    private double[] mKernel;
    private double[] mMaxIntensity;
    private double mOpacity;
    private int mRadius;
    private PointQuadTree<WeightedLatLng> mTree;

    static {
        int[] iArr = {Color.rgb(102, 225, 0), Color.rgb(255, 0, 0)};
        DEFAULT_GRADIENT_COLORS = iArr;
        float[] fArr = {0.2f, 1.0f};
        DEFAULT_GRADIENT_START_POINTS = fArr;
        DEFAULT_GRADIENT = new Gradient(iArr, fArr);
    }

    public static class Builder {
        /* access modifiers changed from: private */
        public Collection<WeightedLatLng> data;
        /* access modifiers changed from: private */
        public Gradient gradient = HeatmapTileProvider.DEFAULT_GRADIENT;
        /* access modifiers changed from: private */
        public double intensity = 0.0d;
        /* access modifiers changed from: private */
        public double opacity = 0.7d;
        /* access modifiers changed from: private */
        public int radius = 20;

        public Builder data(Collection<LatLng> collection) {
            return weightedData(HeatmapTileProvider.wrapData(collection));
        }

        public Builder weightedData(Collection<WeightedLatLng> collection) {
            this.data = collection;
            if (!collection.isEmpty()) {
                return this;
            }
            throw new IllegalArgumentException("No input points.");
        }

        public Builder radius(int i) {
            this.radius = i;
            if (i >= 10 && i <= 50) {
                return this;
            }
            throw new IllegalArgumentException("Radius not within bounds.");
        }

        public Builder gradient(Gradient gradient2) {
            this.gradient = gradient2;
            return this;
        }

        public Builder opacity(double d) {
            this.opacity = d;
            if (d >= 0.0d && d <= 1.0d) {
                return this;
            }
            throw new IllegalArgumentException("Opacity must be in range [0, 1]");
        }

        public Builder maxIntensity(double d) {
            this.intensity = d;
            return this;
        }

        public HeatmapTileProvider build() {
            if (this.data != null) {
                return new HeatmapTileProvider(this);
            }
            throw new IllegalStateException("No input data: you must use either .data or .weightedData before building");
        }
    }

    private HeatmapTileProvider(Builder builder) {
        this.mData = builder.data;
        this.mRadius = builder.radius;
        this.mGradient = builder.gradient;
        this.mOpacity = builder.opacity;
        this.mCustomMaxIntensity = builder.intensity;
        int i = this.mRadius;
        double d = (double) i;
        Double.isNaN(d);
        this.mKernel = generateKernel(i, d / 3.0d);
        setGradient(this.mGradient);
        setWeightedData(this.mData);
    }

    public void setWeightedData(Collection<WeightedLatLng> collection) {
        this.mData = collection;
        if (!collection.isEmpty()) {
            Bounds bounds = getBounds(this.mData);
            this.mBounds = bounds;
            this.mTree = new PointQuadTree<>(bounds);
            for (WeightedLatLng add : this.mData) {
                this.mTree.add(add);
            }
            this.mMaxIntensity = getMaxIntensities(this.mRadius);
            return;
        }
        throw new IllegalArgumentException("No input points.");
    }

    public void setData(Collection<LatLng> collection) {
        setWeightedData(wrapData(collection));
    }

    /* access modifiers changed from: private */
    public static Collection<WeightedLatLng> wrapData(Collection<LatLng> collection) {
        ArrayList arrayList = new ArrayList();
        for (LatLng weightedLatLng : collection) {
            arrayList.add(new WeightedLatLng(weightedLatLng));
        }
        return arrayList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x00c6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.gms.maps.model.Tile getTile(int r37, int r38, int r39) {
        /*
            r36 = this;
            r0 = r36
            r1 = r37
            r2 = r38
            r3 = r39
            double r4 = (double) r3
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r4 = java.lang.Math.pow(r6, r4)
            r8 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r4 = r8 / r4
            int r10 = r0.mRadius
            double r11 = (double) r10
            java.lang.Double.isNaN(r11)
            double r11 = r11 * r4
            r13 = 4647714815446351872(0x4080000000000000, double:512.0)
            double r11 = r11 / r13
            double r6 = r6 * r11
            double r6 = r6 + r4
            r13 = 2
            int r10 = r10 * 2
            int r10 = r10 + 512
            double r14 = (double) r10
            java.lang.Double.isNaN(r14)
            double r6 = r6 / r14
            double r14 = (double) r1
            java.lang.Double.isNaN(r14)
            double r14 = r14 * r4
            double r14 = r14 - r11
            r10 = 1
            int r1 = r1 + r10
            double r8 = (double) r1
            java.lang.Double.isNaN(r8)
            double r8 = r8 * r4
            double r19 = r8 + r11
            double r8 = (double) r2
            java.lang.Double.isNaN(r8)
            double r8 = r8 * r4
            double r8 = r8 - r11
            int r1 = r2 + 1
            double r1 = (double) r1
            java.lang.Double.isNaN(r1)
            double r1 = r1 * r4
            double r1 = r1 + r11
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r21 = 0
            int r5 = (r14 > r21 ? 1 : (r14 == r21 ? 0 : -1))
            if (r5 >= 0) goto L_0x0073
            com.google.maps.android.geometry.Bounds r4 = new com.google.maps.android.geometry.Bounds
            r16 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r22 = r14 + r16
            r24 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r21 = r4
            r26 = r8
            r28 = r1
            r21.<init>(r22, r24, r26, r28)
            r16 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            com.google.maps.android.quadtree.PointQuadTree<com.google.maps.android.heatmaps.WeightedLatLng> r5 = r0.mTree
            java.util.Collection r4 = r5.search(r4)
        L_0x0070:
            r25 = r16
            goto L_0x0091
        L_0x0073:
            r16 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r5 = (r19 > r16 ? 1 : (r19 == r16 ? 0 : -1))
            if (r5 <= 0) goto L_0x008f
            com.google.maps.android.geometry.Bounds r4 = new com.google.maps.android.geometry.Bounds
            r22 = 0
            double r24 = r19 - r16
            r21 = r4
            r26 = r8
            r28 = r1
            r21.<init>(r22, r24, r26, r28)
            com.google.maps.android.quadtree.PointQuadTree<com.google.maps.android.heatmaps.WeightedLatLng> r5 = r0.mTree
            java.util.Collection r4 = r5.search(r4)
            goto L_0x0070
        L_0x008f:
            r25 = r21
        L_0x0091:
            com.google.maps.android.geometry.Bounds r5 = new com.google.maps.android.geometry.Bounds
            r16 = r5
            r17 = r14
            r21 = r8
            r23 = r1
            r16.<init>(r17, r19, r21, r23)
            com.google.maps.android.geometry.Bounds r1 = new com.google.maps.android.geometry.Bounds
            com.google.maps.android.geometry.Bounds r2 = r0.mBounds
            double r13 = r2.minX
            double r28 = r13 - r11
            com.google.maps.android.geometry.Bounds r2 = r0.mBounds
            double r13 = r2.maxX
            double r30 = r13 + r11
            com.google.maps.android.geometry.Bounds r2 = r0.mBounds
            double r13 = r2.minY
            double r32 = r13 - r11
            com.google.maps.android.geometry.Bounds r2 = r0.mBounds
            double r13 = r2.maxY
            double r34 = r13 + r11
            r27 = r1
            r27.<init>(r28, r30, r32, r34)
            boolean r1 = r5.intersects(r1)
            if (r1 != 0) goto L_0x00c6
            com.google.android.gms.maps.model.Tile r1 = com.google.android.gms.maps.model.TileProvider.NO_TILE
            return r1
        L_0x00c6:
            com.google.maps.android.quadtree.PointQuadTree<com.google.maps.android.heatmaps.WeightedLatLng> r1 = r0.mTree
            java.util.Collection r1 = r1.search(r5)
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L_0x00d5
            com.google.android.gms.maps.model.Tile r1 = com.google.android.gms.maps.model.TileProvider.NO_TILE
            return r1
        L_0x00d5:
            int r2 = r0.mRadius
            int r5 = r2 * 2
            int r5 = r5 + 512
            r11 = 2
            int r2 = r2 * 2
            int r2 = r2 + 512
            int[] r11 = new int[r11]
            r11[r10] = r2
            r2 = 0
            r11[r2] = r5
            java.lang.Class<double> r2 = double.class
            java.lang.Object r2 = java.lang.reflect.Array.newInstance(r2, r11)
            double[][] r2 = (double[][]) r2
            java.util.Iterator r1 = r1.iterator()
        L_0x00f3:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L_0x011a
            java.lang.Object r5 = r1.next()
            com.google.maps.android.heatmaps.WeightedLatLng r5 = (com.google.maps.android.heatmaps.WeightedLatLng) r5
            com.google.maps.android.geometry.Point r10 = r5.getPoint()
            double r11 = r10.x
            double r11 = r11 - r17
            double r11 = r11 / r6
            int r11 = (int) r11
            double r12 = r10.y
            double r12 = r12 - r8
            double r12 = r12 / r6
            int r10 = (int) r12
            r11 = r2[r11]
            r12 = r11[r10]
            double r14 = r5.getIntensity()
            double r12 = r12 + r14
            r11[r10] = r12
            goto L_0x00f3
        L_0x011a:
            java.util.Iterator r1 = r4.iterator()
        L_0x011e:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x0147
            java.lang.Object r4 = r1.next()
            com.google.maps.android.heatmaps.WeightedLatLng r4 = (com.google.maps.android.heatmaps.WeightedLatLng) r4
            com.google.maps.android.geometry.Point r5 = r4.getPoint()
            double r10 = r5.x
            double r10 = r10 + r25
            double r10 = r10 - r17
            double r10 = r10 / r6
            int r10 = (int) r10
            double r11 = r5.y
            double r11 = r11 - r8
            double r11 = r11 / r6
            int r5 = (int) r11
            r10 = r2[r10]
            r11 = r10[r5]
            double r13 = r4.getIntensity()
            double r11 = r11 + r13
            r10[r5] = r11
            goto L_0x011e
        L_0x0147:
            double[] r1 = r0.mKernel
            double[][] r1 = convolve(r2, r1)
            int[] r2 = r0.mColorMap
            double[] r4 = r0.mMaxIntensity
            r3 = r4[r3]
            android.graphics.Bitmap r1 = colorize(r1, r2, r3)
            com.google.android.gms.maps.model.Tile r1 = convertBitmap(r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.maps.android.heatmaps.HeatmapTileProvider.getTile(int, int, int):com.google.android.gms.maps.model.Tile");
    }

    public void setGradient(Gradient gradient) {
        this.mGradient = gradient;
        this.mColorMap = gradient.generateColorMap(this.mOpacity);
    }

    public void setRadius(int i) {
        this.mRadius = i;
        double d = (double) i;
        Double.isNaN(d);
        this.mKernel = generateKernel(i, d / 3.0d);
        this.mMaxIntensity = getMaxIntensities(this.mRadius);
    }

    public void setOpacity(double d) {
        this.mOpacity = d;
        setGradient(this.mGradient);
    }

    public void setMaxIntensity(double d) {
        this.mCustomMaxIntensity = d;
        setWeightedData(this.mData);
    }

    private double[] getMaxIntensities(int i) {
        int i2;
        double[] dArr = new double[22];
        if (this.mCustomMaxIntensity != 0.0d) {
            for (int i3 = 0; i3 < 22; i3++) {
                dArr[i3] = this.mCustomMaxIntensity;
            }
            return dArr;
        }
        int i4 = 5;
        while (true) {
            if (i4 >= 11) {
                break;
            }
            dArr[i4] = getMaxValue(this.mData, this.mBounds, i, (int) (Math.pow(2.0d, (double) (i4 - 3)) * 1280.0d));
            if (i4 == 5) {
                for (int i5 = 0; i5 < i4; i5++) {
                    dArr[i5] = dArr[i4];
                }
            }
            i4++;
        }
        for (i2 = 11; i2 < 22; i2++) {
            dArr[i2] = dArr[10];
        }
        return dArr;
    }

    private static Tile convertBitmap(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        return new Tile(512, 512, byteArrayOutputStream.toByteArray());
    }

    static Bounds getBounds(Collection<WeightedLatLng> collection) {
        Iterator<WeightedLatLng> it = collection.iterator();
        WeightedLatLng next = it.next();
        double d = next.getPoint().x;
        double d2 = next.getPoint().x;
        double d3 = d;
        double d4 = d2;
        double d5 = next.getPoint().y;
        double d6 = next.getPoint().y;
        while (it.hasNext()) {
            WeightedLatLng next2 = it.next();
            double d7 = next2.getPoint().x;
            double d8 = next2.getPoint().y;
            if (d7 < d3) {
                d3 = d7;
            }
            if (d7 > d4) {
                d4 = d7;
            }
            if (d8 < d5) {
                d5 = d8;
            }
            if (d8 > d6) {
                d6 = d8;
            }
        }
        return new Bounds(d3, d4, d5, d6);
    }

    static double[] generateKernel(int i, double d) {
        double[] dArr = new double[((i * 2) + 1)];
        for (int i2 = -i; i2 <= i; i2++) {
            double d2 = (double) ((-i2) * i2);
            Double.isNaN(d2);
            dArr[i2 + i] = Math.exp(d2 / ((2.0d * d) * d));
        }
        return dArr;
    }

    static double[][] convolve(double[][] dArr, double[] dArr2) {
        double[][] dArr3 = dArr;
        double[] dArr4 = dArr2;
        Class<double> cls = double.class;
        double length = (double) dArr4.length;
        Double.isNaN(length);
        int floor = (int) Math.floor(length / 2.0d);
        int length2 = dArr3.length;
        int i = length2 - (floor * 2);
        int i2 = 1;
        int i3 = (floor + i) - 1;
        int[] iArr = new int[2];
        iArr[1] = length2;
        iArr[0] = length2;
        double[][] dArr5 = (double[][]) Array.newInstance(cls, iArr);
        int i4 = 0;
        while (true) {
            double d = 0.0d;
            if (i4 >= length2) {
                break;
            }
            int i5 = 0;
            while (i5 < length2) {
                double d2 = dArr3[i4][i5];
                if (d2 != d) {
                    int i6 = i4 + floor;
                    if (i3 < i6) {
                        i6 = i3;
                    }
                    int i7 = i6 + 1;
                    int i8 = i4 - floor;
                    for (int i9 = floor > i8 ? floor : i8; i9 < i7; i9++) {
                        double[] dArr6 = dArr5[i9];
                        dArr6[i5] = dArr6[i5] + (dArr4[i9 - i8] * d2);
                    }
                }
                i5++;
                d = 0.0d;
            }
            i4++;
        }
        int[] iArr2 = new int[2];
        iArr2[1] = i;
        iArr2[0] = i;
        double[][] dArr7 = (double[][]) Array.newInstance(cls, iArr2);
        int i10 = floor;
        while (i10 < i3 + 1) {
            int i11 = 0;
            while (i11 < length2) {
                double d3 = dArr5[i10][i11];
                if (d3 != 0.0d) {
                    int i12 = i11 + floor;
                    if (i3 < i12) {
                        i12 = i3;
                    }
                    int i13 = i12 + i2;
                    int i14 = i11 - floor;
                    for (int i15 = floor > i14 ? floor : i14; i15 < i13; i15++) {
                        double[] dArr8 = dArr7[i10 - floor];
                        int i16 = i15 - floor;
                        dArr8[i16] = dArr8[i16] + (dArr4[i15 - i14] * d3);
                    }
                }
                i11++;
                i2 = 1;
            }
            i10++;
            i2 = 1;
        }
        return dArr7;
    }

    static Bitmap colorize(double[][] dArr, int[] iArr, double d) {
        double[][] dArr2 = dArr;
        int[] iArr2 = iArr;
        int i = iArr2[iArr2.length - 1];
        double length = (double) (iArr2.length - 1);
        Double.isNaN(length);
        double d2 = length / d;
        int length2 = dArr2.length;
        int[] iArr3 = new int[(length2 * length2)];
        for (int i2 = 0; i2 < length2; i2++) {
            for (int i3 = 0; i3 < length2; i3++) {
                double d3 = dArr2[i3][i2];
                int i4 = (i2 * length2) + i3;
                int i5 = (int) (d3 * d2);
                if (d3 == 0.0d) {
                    iArr3[i4] = 0;
                } else if (i5 < iArr2.length) {
                    iArr3[i4] = iArr2[i5];
                } else {
                    iArr3[i4] = i;
                }
            }
        }
        Bitmap createBitmap = Bitmap.createBitmap(length2, length2, Bitmap.Config.ARGB_8888);
        createBitmap.setPixels(iArr3, 0, length2, 0, 0, length2, length2);
        return createBitmap;
    }

    static double getMaxValue(Collection<WeightedLatLng> collection, Bounds bounds, int i, int i2) {
        Bounds bounds2 = bounds;
        double d = bounds2.minX;
        double d2 = bounds2.maxX;
        double d3 = bounds2.minY;
        double d4 = d2 - d;
        double d5 = bounds2.maxY - d3;
        if (d4 <= d5) {
            d4 = d5;
        }
        double d6 = (double) (i2 / (i * 2));
        Double.isNaN(d6);
        double d7 = (double) ((int) (d6 + 0.5d));
        Double.isNaN(d7);
        double d8 = d7 / d4;
        PlaybackStateCompat.ShuffleMode shuffleMode = new PlaybackStateCompat.ShuffleMode();
        double d9 = 0.0d;
        for (WeightedLatLng next : collection) {
            double d10 = next.getPoint().x;
            int i3 = (int) ((next.getPoint().y - d3) * d8);
            long j = (long) ((int) ((d10 - d) * d8));
            PlaybackStateCompat.ShuffleMode shuffleMode2 = (PlaybackStateCompat.ShuffleMode) shuffleMode.getMax(j, null);
            if (shuffleMode2 == null) {
                shuffleMode2 = new PlaybackStateCompat.ShuffleMode();
                shuffleMode.setMax(j, shuffleMode2);
            }
            long j2 = (long) i3;
            Double d11 = (Double) shuffleMode2.getMax(j2, null);
            if (d11 == null) {
                d11 = Double.valueOf(0.0d);
            }
            Double valueOf = Double.valueOf(d11.doubleValue() + next.getIntensity());
            shuffleMode2.setMax(j2, valueOf);
            if (valueOf.doubleValue() > d9) {
                d9 = valueOf.doubleValue();
            }
        }
        return d9;
    }
}
