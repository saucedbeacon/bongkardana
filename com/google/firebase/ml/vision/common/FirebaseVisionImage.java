package com.google.firebase.ml.vision.common;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.media.Image;
import android.net.Uri;
import android.os.SystemClock;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.firebase_ml.zzqk;
import com.google.android.gms.internal.firebase_ml.zzql;
import com.google.android.gms.vision.Frame;
import com.google.firebase.ml.vision.common.FirebaseVisionImageMetadata;
import java.io.IOException;
import java.nio.ByteBuffer;
import javax.annotation.concurrent.Immutable;

@Immutable
public class FirebaseVisionImage {
    private static final zzqk zzbhe = zzqk.zzph();
    @Nullable
    private volatile Bitmap zzbhf;
    @Nullable
    private volatile ByteBuffer zzbhg;
    @Nullable
    private volatile FirebaseVisionImageMetadata zzbhh;
    @Nullable
    private volatile Frame zzbhi;
    @Nullable
    private volatile byte[] zzbhj;
    private final long zzbhk;

    @NonNull
    public static FirebaseVisionImage fromByteBuffer(@NonNull ByteBuffer byteBuffer, @NonNull FirebaseVisionImageMetadata firebaseVisionImageMetadata) {
        return new FirebaseVisionImage(byteBuffer, firebaseVisionImageMetadata);
    }

    @NonNull
    public static FirebaseVisionImage fromByteArray(@NonNull byte[] bArr, @NonNull FirebaseVisionImageMetadata firebaseVisionImageMetadata) {
        return new FirebaseVisionImage(bArr, firebaseVisionImageMetadata);
    }

    @NonNull
    public static FirebaseVisionImage fromBitmap(@NonNull Bitmap bitmap) {
        return new FirebaseVisionImage(bitmap);
    }

    @RequiresApi(19)
    @TargetApi(19)
    @NonNull
    public static FirebaseVisionImage fromMediaImage(@NonNull Image image, @FirebaseVisionImageMetadata.Rotation int i) {
        Preconditions.checkNotNull(image, "Please provide a valid image");
        Preconditions.checkArgument(image.getFormat() == 256 || image.getFormat() == 35, "Only JPEG and YUV_420_888 are supported now");
        Image.Plane[] planes = image.getPlanes();
        if (image.getFormat() != 256) {
            return new FirebaseVisionImage(zzqk.zza(planes, image.getWidth(), image.getHeight()), new FirebaseVisionImageMetadata.Builder().setFormat(17).setWidth(image.getWidth()).setHeight(image.getHeight()).setRotation(i).build());
        }
        if (planes == null || planes.length != 1) {
            throw new IllegalArgumentException("Unexpected image format, JPEG should have exactly 1 image plane");
        }
        ByteBuffer buffer = planes[0].getBuffer();
        int remaining = buffer.remaining();
        byte[] bArr = new byte[remaining];
        buffer.get(bArr);
        if (i == 0) {
            return new FirebaseVisionImage(bArr);
        }
        return new FirebaseVisionImage(zza(BitmapFactory.decodeByteArray(bArr, 0, remaining), i));
    }

    @NonNull
    public static FirebaseVisionImage fromFilePath(@NonNull Context context, @NonNull Uri uri) throws IOException {
        Preconditions.checkNotNull(context, "Please provide a valid Context");
        Preconditions.checkNotNull(uri, "Please provide a valid imageUri");
        zzql.zzpi();
        return new FirebaseVisionImage(zzql.zza(context.getContentResolver(), uri));
    }

    private FirebaseVisionImage(@NonNull ByteBuffer byteBuffer, @NonNull FirebaseVisionImageMetadata firebaseVisionImageMetadata) {
        this.zzbhk = SystemClock.elapsedRealtime();
        this.zzbhg = (ByteBuffer) Preconditions.checkNotNull(byteBuffer);
        this.zzbhh = (FirebaseVisionImageMetadata) Preconditions.checkNotNull(firebaseVisionImageMetadata);
    }

    private FirebaseVisionImage(@NonNull byte[] bArr, @NonNull FirebaseVisionImageMetadata firebaseVisionImageMetadata) {
        this(ByteBuffer.wrap((byte[]) Preconditions.checkNotNull(bArr)), firebaseVisionImageMetadata);
    }

    private FirebaseVisionImage(@NonNull Bitmap bitmap) {
        this.zzbhk = SystemClock.elapsedRealtime();
        this.zzbhf = (Bitmap) Preconditions.checkNotNull(bitmap);
    }

    private FirebaseVisionImage(byte[] bArr) {
        this.zzbhk = SystemClock.elapsedRealtime();
        this.zzbhj = (byte[]) Preconditions.checkNotNull(bArr);
    }

    @NonNull
    public Bitmap getBitmap() {
        return zzpe();
    }

    private final Bitmap zzpe() {
        if (this.zzbhf != null) {
            return this.zzbhf;
        }
        synchronized (this) {
            if (this.zzbhf == null) {
                byte[] zzay = zzay(false);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(zzay, 0, zzay.length);
                if (this.zzbhh != null) {
                    decodeByteArray = zza(decodeByteArray, this.zzbhh.getRotation());
                }
                this.zzbhf = decodeByteArray;
            }
        }
        return this.zzbhf;
    }

    private static Bitmap zza(Bitmap bitmap, @FirebaseVisionImageMetadata.Rotation int i) {
        int i2;
        if (i == 0) {
            i2 = 0;
        } else if (i == 1) {
            i2 = 90;
        } else if (i == 2) {
            i2 = 180;
        } else if (i == 3) {
            i2 = 270;
        } else {
            StringBuilder sb = new StringBuilder(29);
            sb.append("Invalid rotation: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
        if (i2 == 0) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        matrix.postRotate((float) i2);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }

    public final Pair<byte[], Float> zze(int i, int i2) {
        int i3;
        int i4;
        byte[] bArr;
        if (this.zzbhh != null) {
            boolean z = this.zzbhh.getRotation() == 1 || this.zzbhh.getRotation() == 3;
            FirebaseVisionImageMetadata firebaseVisionImageMetadata = this.zzbhh;
            i3 = z ? firebaseVisionImageMetadata.getHeight() : firebaseVisionImageMetadata.getWidth();
            i4 = z ? this.zzbhh.getWidth() : this.zzbhh.getHeight();
        } else {
            i3 = zzpe().getWidth();
            i4 = zzpe().getHeight();
        }
        float min = Math.min(((float) i) / ((float) i3), ((float) i2) / ((float) i4));
        if (min < 1.0f) {
            Bitmap zzpe = zzpe();
            Matrix matrix = new Matrix();
            matrix.postScale(min, min);
            bArr = zzqk.zza(Bitmap.createBitmap(zzpe, 0, 0, this.zzbhf.getWidth(), this.zzbhf.getHeight(), matrix, true));
        } else {
            bArr = zzay(true);
            min = 1.0f;
        }
        return Pair.create(bArr, Float.valueOf(min));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005b, code lost:
        return r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final byte[] zzay(boolean r3) {
        /*
            r2 = this;
            byte[] r0 = r2.zzbhj
            if (r0 == 0) goto L_0x0007
            byte[] r3 = r2.zzbhj
            return r3
        L_0x0007:
            monitor-enter(r2)
            byte[] r0 = r2.zzbhj     // Catch:{ all -> 0x0068 }
            if (r0 == 0) goto L_0x0010
            byte[] r3 = r2.zzbhj     // Catch:{ all -> 0x0068 }
            monitor-exit(r2)     // Catch:{ all -> 0x0068 }
            return r3
        L_0x0010:
            java.nio.ByteBuffer r0 = r2.zzbhg     // Catch:{ all -> 0x0068 }
            if (r0 == 0) goto L_0x005c
            if (r3 == 0) goto L_0x001e
            com.google.firebase.ml.vision.common.FirebaseVisionImageMetadata r3 = r2.zzbhh     // Catch:{ all -> 0x0068 }
            int r3 = r3.getRotation()     // Catch:{ all -> 0x0068 }
            if (r3 != 0) goto L_0x005c
        L_0x001e:
            java.nio.ByteBuffer r3 = r2.zzbhg     // Catch:{ all -> 0x0068 }
            byte[] r3 = com.google.android.gms.internal.firebase_ml.zzqk.zza((java.nio.ByteBuffer) r3)     // Catch:{ all -> 0x0068 }
            com.google.firebase.ml.vision.common.FirebaseVisionImageMetadata r0 = r2.zzbhh     // Catch:{ all -> 0x0068 }
            int r0 = r0.getFormat()     // Catch:{ all -> 0x0068 }
            r1 = 17
            if (r0 == r1) goto L_0x0040
            r1 = 842094169(0x32315659, float:1.0322389E-8)
            if (r0 != r1) goto L_0x0038
            byte[] r3 = com.google.android.gms.internal.firebase_ml.zzqk.zzf(r3)     // Catch:{ all -> 0x0068 }
            goto L_0x0040
        L_0x0038:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0068 }
            java.lang.String r0 = "Must be one of: IMAGE_FORMAT_NV21, IMAGE_FORMAT_YV12"
            r3.<init>(r0)     // Catch:{ all -> 0x0068 }
            throw r3     // Catch:{ all -> 0x0068 }
        L_0x0040:
            com.google.firebase.ml.vision.common.FirebaseVisionImageMetadata r0 = r2.zzbhh     // Catch:{ all -> 0x0068 }
            int r0 = r0.getWidth()     // Catch:{ all -> 0x0068 }
            com.google.firebase.ml.vision.common.FirebaseVisionImageMetadata r1 = r2.zzbhh     // Catch:{ all -> 0x0068 }
            int r1 = r1.getHeight()     // Catch:{ all -> 0x0068 }
            byte[] r3 = com.google.android.gms.internal.firebase_ml.zzqk.zza((byte[]) r3, (int) r0, (int) r1)     // Catch:{ all -> 0x0068 }
            com.google.firebase.ml.vision.common.FirebaseVisionImageMetadata r0 = r2.zzbhh     // Catch:{ all -> 0x0068 }
            int r0 = r0.getRotation()     // Catch:{ all -> 0x0068 }
            if (r0 != 0) goto L_0x005a
            r2.zzbhj = r3     // Catch:{ all -> 0x0068 }
        L_0x005a:
            monitor-exit(r2)     // Catch:{ all -> 0x0068 }
            return r3
        L_0x005c:
            android.graphics.Bitmap r3 = r2.zzpe()     // Catch:{ all -> 0x0068 }
            byte[] r3 = com.google.android.gms.internal.firebase_ml.zzqk.zza((android.graphics.Bitmap) r3)     // Catch:{ all -> 0x0068 }
            r2.zzbhj = r3     // Catch:{ all -> 0x0068 }
            monitor-exit(r2)     // Catch:{ all -> 0x0068 }
            return r3
        L_0x0068:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.ml.vision.common.FirebaseVisionImage.zzay(boolean):byte[]");
    }

    public final void zzpf() {
        if (this.zzbhg != null) {
            ByteBuffer byteBuffer = this.zzbhg;
            ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.capacity());
            byteBuffer.rewind();
            allocate.put(byteBuffer);
            byteBuffer.rewind();
            allocate.flip();
            this.zzbhg = allocate;
        }
    }

    public final synchronized Frame zza(boolean z, boolean z2) {
        int i = 0;
        Preconditions.checkArgument(!z || !z2, "Can't restrict to bitmap-only and NV21 byte buffer-only");
        if (this.zzbhi == null) {
            Frame.Builder builder = new Frame.Builder();
            if (this.zzbhg == null || z) {
                builder.setBitmap(zzpe());
            } else {
                int i2 = FirebaseVisionImageMetadata.IMAGE_FORMAT_YV12;
                if (z2 && this.zzbhh.getFormat() != 17) {
                    if (this.zzbhh.getFormat() == 842094169) {
                        this.zzbhg = ByteBuffer.wrap(zzqk.zzf(zzqk.zza(this.zzbhg)));
                        this.zzbhh = new FirebaseVisionImageMetadata.Builder().setFormat(17).setWidth(this.zzbhh.getWidth()).setHeight(this.zzbhh.getHeight()).setRotation(this.zzbhh.getRotation()).build();
                    } else {
                        throw new IllegalStateException("Must be one of: IMAGE_FORMAT_NV21, IMAGE_FORMAT_YV12");
                    }
                }
                ByteBuffer byteBuffer = this.zzbhg;
                int width = this.zzbhh.getWidth();
                int height = this.zzbhh.getHeight();
                int format = this.zzbhh.getFormat();
                if (format == 17) {
                    i2 = 17;
                } else if (format != 842094169) {
                    i2 = 0;
                }
                builder.setImageData(byteBuffer, width, height, i2);
                int rotation = this.zzbhh.getRotation();
                if (rotation != 0) {
                    if (rotation == 1) {
                        i = 1;
                    } else if (rotation == 2) {
                        i = 2;
                    } else if (rotation == 3) {
                        i = 3;
                    } else {
                        StringBuilder sb = new StringBuilder(29);
                        sb.append("Invalid rotation: ");
                        sb.append(rotation);
                        throw new IllegalArgumentException(sb.toString());
                    }
                }
                builder.setRotation(i);
            }
            builder.setTimestampMillis(this.zzbhk);
            this.zzbhi = builder.build();
        }
        return this.zzbhi;
    }
}
