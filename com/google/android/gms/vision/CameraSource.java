package com.google.android.gms.vision;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.ImageFormat;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.os.SystemClock;
import android.view.SurfaceHolder;
import android.view.WindowManager;
import androidx.annotation.RequiresPermission;
import com.alibaba.griver.ui.ant.utils.AUScreenAdaptTool;
import com.google.android.gms.common.images.Size;
import com.google.android.gms.common.util.VisibleForTesting;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

public class CameraSource {
    @SuppressLint({"InlinedApi"})
    public static final int CAMERA_FACING_BACK = 0;
    @SuppressLint({"InlinedApi"})
    public static final int CAMERA_FACING_FRONT = 1;
    /* access modifiers changed from: private */
    public int facing;
    /* access modifiers changed from: private */
    public int rotation;
    /* access modifiers changed from: private */
    public Context zze;
    /* access modifiers changed from: private */
    public final Object zzf;
    /* access modifiers changed from: private */
    @GuardedBy("cameraLock")
    public Camera zzg;
    /* access modifiers changed from: private */
    public Size zzh;
    /* access modifiers changed from: private */
    public float zzi;
    /* access modifiers changed from: private */
    public int zzj;
    /* access modifiers changed from: private */
    public int zzk;
    /* access modifiers changed from: private */
    public boolean zzl;
    private SurfaceTexture zzm;
    private boolean zzn;
    private Thread zzo;
    /* access modifiers changed from: private */
    public zzb zzp;
    /* access modifiers changed from: private */
    public Map<byte[], ByteBuffer> zzq;

    public interface PictureCallback {
        void onPictureTaken(byte[] bArr);
    }

    public interface ShutterCallback {
        void onShutter();
    }

    class zza implements Camera.PreviewCallback {
        private zza() {
        }

        public final void onPreviewFrame(byte[] bArr, Camera camera) {
            CameraSource.this.zzp.zza(bArr, camera);
        }
    }

    class zzc implements Camera.PictureCallback {
        /* access modifiers changed from: private */
        public PictureCallback zzz;

        private zzc() {
        }

        public final void onPictureTaken(byte[] bArr, Camera camera) {
            PictureCallback pictureCallback = this.zzz;
            if (pictureCallback != null) {
                pictureCallback.onPictureTaken(bArr);
            }
            synchronized (CameraSource.this.zzf) {
                if (CameraSource.this.zzg != null) {
                    CameraSource.this.zzg.startPreview();
                }
            }
        }
    }

    static class zzd implements Camera.ShutterCallback {
        /* access modifiers changed from: private */
        public ShutterCallback zzaa;

        private zzd() {
        }

        public final void onShutter() {
            ShutterCallback shutterCallback = this.zzaa;
            if (shutterCallback != null) {
                shutterCallback.onShutter();
            }
        }
    }

    public void release() {
        synchronized (this.zzf) {
            stop();
            this.zzp.release();
        }
    }

    @VisibleForTesting
    static class zze {
        private Size zzab;
        private Size zzac;

        public zze(Camera.Size size, @Nullable Camera.Size size2) {
            this.zzab = new Size(size.width, size.height);
            if (size2 != null) {
                this.zzac = new Size(size2.width, size2.height);
            }
        }

        public final Size zzb() {
            return this.zzab;
        }

        @Nullable
        public final Size zzc() {
            return this.zzac;
        }
    }

    @RequiresPermission("android.permission.CAMERA")
    public CameraSource start() throws IOException {
        synchronized (this.zzf) {
            if (this.zzg != null) {
                return this;
            }
            this.zzg = zza();
            SurfaceTexture surfaceTexture = new SurfaceTexture(100);
            this.zzm = surfaceTexture;
            this.zzg.setPreviewTexture(surfaceTexture);
            this.zzn = true;
            this.zzg.startPreview();
            Thread thread = new Thread(this.zzp);
            this.zzo = thread;
            thread.setName("gms.vision.CameraSource");
            this.zzp.setActive(true);
            this.zzo.start();
            return this;
        }
    }

    class zzb implements Runnable {
        private final Object lock = new Object();
        private Detector<?> zzr;
        private long zzu = SystemClock.elapsedRealtime();
        private boolean zzv = true;
        private long zzw;
        private int zzx = 0;
        private ByteBuffer zzy;

        zzb(Detector<?> detector) {
            this.zzr = detector;
        }

        /* access modifiers changed from: package-private */
        @SuppressLint({"Assert"})
        public final void release() {
            this.zzr.release();
            this.zzr = null;
        }

        /* access modifiers changed from: package-private */
        public final void setActive(boolean z) {
            synchronized (this.lock) {
                this.zzv = z;
                this.lock.notifyAll();
            }
        }

        /* access modifiers changed from: package-private */
        public final void zza(byte[] bArr, Camera camera) {
            synchronized (this.lock) {
                if (this.zzy != null) {
                    camera.addCallbackBuffer(this.zzy.array());
                    this.zzy = null;
                }
                if (CameraSource.this.zzq.containsKey(bArr)) {
                    this.zzw = SystemClock.elapsedRealtime() - this.zzu;
                    this.zzx++;
                    this.zzy = (ByteBuffer) CameraSource.this.zzq.get(bArr);
                    this.lock.notifyAll();
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0012, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            r6.zzr.receiveFrame(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x006d, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x006e, code lost:
            com.google.android.gms.vision.CameraSource.zzb(r6.zzt).addCallbackBuffer(r2.array());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x007b, code lost:
            throw r0;
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0011 */
        @android.annotation.SuppressLint({"InlinedApi"})
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r6 = this;
            L_0x0000:
                java.lang.Object r0 = r6.lock
                monitor-enter(r0)
            L_0x0003:
                boolean r1 = r6.zzv     // Catch:{ all -> 0x008b }
                if (r1 == 0) goto L_0x0013
                java.nio.ByteBuffer r1 = r6.zzy     // Catch:{ all -> 0x008b }
                if (r1 != 0) goto L_0x0013
                java.lang.Object r1 = r6.lock     // Catch:{ InterruptedException -> 0x0011 }
                r1.wait()     // Catch:{ InterruptedException -> 0x0011 }
                goto L_0x0003
            L_0x0011:
                monitor-exit(r0)     // Catch:{ all -> 0x008b }
                return
            L_0x0013:
                boolean r1 = r6.zzv     // Catch:{ all -> 0x008b }
                if (r1 != 0) goto L_0x0019
                monitor-exit(r0)     // Catch:{ all -> 0x008b }
                return
            L_0x0019:
                com.google.android.gms.vision.Frame$Builder r1 = new com.google.android.gms.vision.Frame$Builder     // Catch:{ all -> 0x008b }
                r1.<init>()     // Catch:{ all -> 0x008b }
                java.nio.ByteBuffer r2 = r6.zzy     // Catch:{ all -> 0x008b }
                com.google.android.gms.vision.CameraSource r3 = com.google.android.gms.vision.CameraSource.this     // Catch:{ all -> 0x008b }
                com.google.android.gms.common.images.Size r3 = r3.zzh     // Catch:{ all -> 0x008b }
                int r3 = r3.getWidth()     // Catch:{ all -> 0x008b }
                com.google.android.gms.vision.CameraSource r4 = com.google.android.gms.vision.CameraSource.this     // Catch:{ all -> 0x008b }
                com.google.android.gms.common.images.Size r4 = r4.zzh     // Catch:{ all -> 0x008b }
                int r4 = r4.getHeight()     // Catch:{ all -> 0x008b }
                r5 = 17
                com.google.android.gms.vision.Frame$Builder r1 = r1.setImageData(r2, r3, r4, r5)     // Catch:{ all -> 0x008b }
                int r2 = r6.zzx     // Catch:{ all -> 0x008b }
                com.google.android.gms.vision.Frame$Builder r1 = r1.setId(r2)     // Catch:{ all -> 0x008b }
                long r2 = r6.zzw     // Catch:{ all -> 0x008b }
                com.google.android.gms.vision.Frame$Builder r1 = r1.setTimestampMillis(r2)     // Catch:{ all -> 0x008b }
                com.google.android.gms.vision.CameraSource r2 = com.google.android.gms.vision.CameraSource.this     // Catch:{ all -> 0x008b }
                int r2 = r2.rotation     // Catch:{ all -> 0x008b }
                com.google.android.gms.vision.Frame$Builder r1 = r1.setRotation(r2)     // Catch:{ all -> 0x008b }
                com.google.android.gms.vision.Frame r1 = r1.build()     // Catch:{ all -> 0x008b }
                java.nio.ByteBuffer r2 = r6.zzy     // Catch:{ all -> 0x008b }
                r3 = 0
                r6.zzy = r3     // Catch:{ all -> 0x008b }
                monitor-exit(r0)     // Catch:{ all -> 0x008b }
                com.google.android.gms.vision.Detector<?> r0 = r6.zzr     // Catch:{ Exception -> 0x007c, all -> 0x006d }
                r0.receiveFrame(r1)     // Catch:{ Exception -> 0x007c, all -> 0x006d }
                com.google.android.gms.vision.CameraSource r0 = com.google.android.gms.vision.CameraSource.this
                android.hardware.Camera r0 = r0.zzg
                byte[] r1 = r2.array()
                r0.addCallbackBuffer(r1)
                goto L_0x0000
            L_0x006d:
                r0 = move-exception
                com.google.android.gms.vision.CameraSource r1 = com.google.android.gms.vision.CameraSource.this
                android.hardware.Camera r1 = r1.zzg
                byte[] r2 = r2.array()
                r1.addCallbackBuffer(r2)
                throw r0
            L_0x007c:
                com.google.android.gms.vision.CameraSource r0 = com.google.android.gms.vision.CameraSource.this
                android.hardware.Camera r0 = r0.zzg
                byte[] r1 = r2.array()
                r0.addCallbackBuffer(r1)
                goto L_0x0000
            L_0x008b:
                r1 = move-exception
                monitor-exit(r0)
                goto L_0x008f
            L_0x008e:
                throw r1
            L_0x008f:
                goto L_0x008e
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.vision.CameraSource.zzb.run():void");
        }
    }

    public static class Builder {
        private final Detector<?> zzr;
        private CameraSource zzs;

        public Builder(Context context, Detector<?> detector) {
            CameraSource cameraSource = new CameraSource();
            this.zzs = cameraSource;
            if (context == null) {
                throw new IllegalArgumentException("No context supplied.");
            } else if (detector != null) {
                this.zzr = detector;
                Context unused = cameraSource.zze = context;
            } else {
                throw new IllegalArgumentException("No detector supplied.");
            }
        }

        public Builder setRequestedFps(float f) {
            if (f > 0.0f) {
                float unused = this.zzs.zzi = f;
                return this;
            }
            StringBuilder sb = new StringBuilder(28);
            sb.append("Invalid fps: ");
            sb.append(f);
            throw new IllegalArgumentException(sb.toString());
        }

        public Builder setRequestedPreviewSize(int i, int i2) {
            if (i <= 0 || i > 1000000 || i2 <= 0 || i2 > 1000000) {
                StringBuilder sb = new StringBuilder(45);
                sb.append("Invalid preview size: ");
                sb.append(i);
                sb.append("x");
                sb.append(i2);
                throw new IllegalArgumentException(sb.toString());
            }
            int unused = this.zzs.zzj = i;
            int unused2 = this.zzs.zzk = i2;
            return this;
        }

        public Builder setFacing(int i) {
            if (i == 0 || i == 1) {
                int unused = this.zzs.facing = i;
                return this;
            }
            StringBuilder sb = new StringBuilder(27);
            sb.append("Invalid camera: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }

        public Builder setAutoFocusEnabled(boolean z) {
            boolean unused = this.zzs.zzl = z;
            return this;
        }

        public CameraSource build() {
            CameraSource cameraSource = this.zzs;
            zzb unused = cameraSource.zzp = new zzb(this.zzr);
            return this.zzs;
        }
    }

    @RequiresPermission("android.permission.CAMERA")
    public CameraSource start(SurfaceHolder surfaceHolder) throws IOException {
        synchronized (this.zzf) {
            if (this.zzg != null) {
                return this;
            }
            Camera zza2 = zza();
            this.zzg = zza2;
            zza2.setPreviewDisplay(surfaceHolder);
            this.zzg.startPreview();
            this.zzo = new Thread(this.zzp);
            this.zzp.setActive(true);
            this.zzo.start();
            this.zzn = false;
            return this;
        }
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0032 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0013 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void stop() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.zzf
            monitor-enter(r0)
            com.google.android.gms.vision.CameraSource$zzb r1 = r3.zzp     // Catch:{ all -> 0x0040 }
            r2 = 0
            r1.setActive(r2)     // Catch:{ all -> 0x0040 }
            java.lang.Thread r1 = r3.zzo     // Catch:{ all -> 0x0040 }
            r2 = 0
            if (r1 == 0) goto L_0x0015
            java.lang.Thread r1 = r3.zzo     // Catch:{ InterruptedException -> 0x0013 }
            r1.join()     // Catch:{ InterruptedException -> 0x0013 }
        L_0x0013:
            r3.zzo = r2     // Catch:{ all -> 0x0040 }
        L_0x0015:
            android.hardware.Camera r1 = r3.zzg     // Catch:{ all -> 0x0040 }
            if (r1 == 0) goto L_0x0039
            android.hardware.Camera r1 = r3.zzg     // Catch:{ all -> 0x0040 }
            r1.stopPreview()     // Catch:{ all -> 0x0040 }
            android.hardware.Camera r1 = r3.zzg     // Catch:{ all -> 0x0040 }
            r1.setPreviewCallbackWithBuffer(r2)     // Catch:{ all -> 0x0040 }
            boolean r1 = r3.zzn     // Catch:{ Exception -> 0x0032 }
            if (r1 == 0) goto L_0x002d
            android.hardware.Camera r1 = r3.zzg     // Catch:{ Exception -> 0x0032 }
            r1.setPreviewTexture(r2)     // Catch:{ Exception -> 0x0032 }
            goto L_0x0032
        L_0x002d:
            android.hardware.Camera r1 = r3.zzg     // Catch:{ Exception -> 0x0032 }
            r1.setPreviewDisplay(r2)     // Catch:{ Exception -> 0x0032 }
        L_0x0032:
            android.hardware.Camera r1 = r3.zzg     // Catch:{ all -> 0x0040 }
            r1.release()     // Catch:{ all -> 0x0040 }
            r3.zzg = r2     // Catch:{ all -> 0x0040 }
        L_0x0039:
            java.util.Map<byte[], java.nio.ByteBuffer> r1 = r3.zzq     // Catch:{ all -> 0x0040 }
            r1.clear()     // Catch:{ all -> 0x0040 }
            monitor-exit(r0)     // Catch:{ all -> 0x0040 }
            return
        L_0x0040:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.vision.CameraSource.stop():void");
    }

    public Size getPreviewSize() {
        return this.zzh;
    }

    public int getCameraFacing() {
        return this.facing;
    }

    public void takePicture(ShutterCallback shutterCallback, PictureCallback pictureCallback) {
        synchronized (this.zzf) {
            if (this.zzg != null) {
                zzd zzd2 = new zzd();
                ShutterCallback unused = zzd2.zzaa = shutterCallback;
                zzc zzc2 = new zzc();
                PictureCallback unused2 = zzc2.zzz = pictureCallback;
                this.zzg.takePicture(zzd2, (Camera.PictureCallback) null, (Camera.PictureCallback) null, zzc2);
            }
        }
    }

    private CameraSource() {
        this.zzf = new Object();
        this.facing = 0;
        this.zzi = 30.0f;
        this.zzj = 1024;
        this.zzk = 768;
        this.zzl = false;
        this.zzq = new HashMap();
    }

    @SuppressLint({"InlinedApi"})
    private final Camera zza() throws IOException {
        int i;
        int i2;
        int i3 = this.facing;
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        int i4 = 0;
        int i5 = 0;
        while (true) {
            if (i5 >= Camera.getNumberOfCameras()) {
                i5 = -1;
                break;
            }
            Camera.getCameraInfo(i5, cameraInfo);
            if (cameraInfo.facing == i3) {
                break;
            }
            i5++;
        }
        if (i5 != -1) {
            Camera open = Camera.open(i5);
            int i6 = this.zzj;
            int i7 = this.zzk;
            Camera.Parameters parameters = open.getParameters();
            List<Camera.Size> supportedPreviewSizes = parameters.getSupportedPreviewSizes();
            List<Camera.Size> supportedPictureSizes = parameters.getSupportedPictureSizes();
            ArrayList arrayList = new ArrayList();
            for (Camera.Size next : supportedPreviewSizes) {
                float f = ((float) next.width) / ((float) next.height);
                Iterator<Camera.Size> it = supportedPictureSizes.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Camera.Size next2 = it.next();
                    if (Math.abs(f - (((float) next2.width) / ((float) next2.height))) < 0.01f) {
                        arrayList.add(new zze(next, next2));
                        break;
                    }
                }
            }
            if (arrayList.size() == 0) {
                for (Camera.Size zze2 : supportedPreviewSizes) {
                    arrayList.add(new zze(zze2, (Camera.Size) null));
                }
            }
            ArrayList arrayList2 = arrayList;
            int size = arrayList2.size();
            int i8 = Integer.MAX_VALUE;
            zze zze3 = null;
            int i9 = 0;
            int i10 = Integer.MAX_VALUE;
            while (i9 < size) {
                Object obj = arrayList2.get(i9);
                i9++;
                zze zze4 = (zze) obj;
                Size zzb2 = zze4.zzb();
                int abs = Math.abs(zzb2.getWidth() - i6) + Math.abs(zzb2.getHeight() - i7);
                if (abs < i10) {
                    zze3 = zze4;
                    i10 = abs;
                }
            }
            if (zze3 != null) {
                Size zzc2 = zze3.zzc();
                this.zzh = zze3.zzb();
                int i11 = (int) (this.zzi * 1000.0f);
                int[] iArr = null;
                for (int[] next3 : open.getParameters().getSupportedPreviewFpsRange()) {
                    int abs2 = Math.abs(i11 - next3[0]) + Math.abs(i11 - next3[1]);
                    if (abs2 < i8) {
                        iArr = next3;
                        i8 = abs2;
                    }
                }
                if (iArr != null) {
                    Camera.Parameters parameters2 = open.getParameters();
                    if (zzc2 != null) {
                        parameters2.setPictureSize(zzc2.getWidth(), zzc2.getHeight());
                    }
                    parameters2.setPreviewSize(this.zzh.getWidth(), this.zzh.getHeight());
                    parameters2.setPreviewFpsRange(iArr[0], iArr[1]);
                    parameters2.setPreviewFormat(17);
                    int rotation2 = ((WindowManager) this.zze.getSystemService("window")).getDefaultDisplay().getRotation();
                    if (rotation2 != 0) {
                        if (rotation2 == 1) {
                            i4 = 90;
                        } else if (rotation2 == 2) {
                            i4 = 180;
                        } else if (rotation2 == 3) {
                            i4 = 270;
                        }
                    }
                    Camera.CameraInfo cameraInfo2 = new Camera.CameraInfo();
                    Camera.getCameraInfo(i5, cameraInfo2);
                    if (cameraInfo2.facing == 1) {
                        i2 = (cameraInfo2.orientation + i4) % AUScreenAdaptTool.WIDTH_BASE;
                        i = (360 - i2) % AUScreenAdaptTool.WIDTH_BASE;
                    } else {
                        i2 = ((cameraInfo2.orientation - i4) + AUScreenAdaptTool.WIDTH_BASE) % AUScreenAdaptTool.WIDTH_BASE;
                        i = i2;
                    }
                    this.rotation = i2 / 90;
                    open.setDisplayOrientation(i);
                    parameters2.setRotation(i2);
                    if (this.zzl && parameters2.getSupportedFocusModes().contains("continuous-video")) {
                        parameters2.setFocusMode("continuous-video");
                    }
                    open.setParameters(parameters2);
                    open.setPreviewCallbackWithBuffer(new zza());
                    open.addCallbackBuffer(zza(this.zzh));
                    open.addCallbackBuffer(zza(this.zzh));
                    open.addCallbackBuffer(zza(this.zzh));
                    open.addCallbackBuffer(zza(this.zzh));
                    return open;
                }
                throw new IOException("Could not find suitable preview frames per second range.");
            }
            throw new IOException("Could not find suitable preview size.");
        }
        throw new IOException("Could not find requested camera.");
    }

    @SuppressLint({"InlinedApi"})
    private final byte[] zza(Size size) {
        double height = (double) ((long) (size.getHeight() * size.getWidth() * ImageFormat.getBitsPerPixel(17)));
        Double.isNaN(height);
        byte[] bArr = new byte[(((int) Math.ceil(height / 8.0d)) + 1)];
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        if (!wrap.hasArray() || wrap.array() != bArr) {
            throw new IllegalStateException("Failed to create valid buffer for camera source.");
        }
        this.zzq.put(bArr, wrap);
        return bArr;
    }
}
