package com.google.android.exoplayer2.upstream;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

public final class AssetDataSource extends BaseDataSource {
    private static int length = 0;
    private static int setMax = 1;
    private final AssetManager assetManager;
    private long bytesRemaining;
    @Nullable
    private InputStream inputStream;
    private boolean opened;
    @Nullable
    private Uri uri;

    public static final class AssetDataSourceException extends IOException {
        public AssetDataSourceException(IOException iOException) {
            super(iOException);
        }
    }

    public AssetDataSource(Context context) {
        super(false);
        this.assetManager = context.getAssets();
    }

    @Deprecated
    public AssetDataSource(Context context, @Nullable TransferListener transferListener) {
        this(context);
        if (transferListener != null) {
            addTransferListener(transferListener);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v14, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v16, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long open(com.google.android.exoplayer2.upstream.DataSpec r11) throws com.google.android.exoplayer2.upstream.AssetDataSource.AssetDataSourceException {
        /*
            r10 = this;
            java.lang.String r0 = "startsWith"
            java.lang.String r1 = "/android_asset/"
            int r2 = setMax     // Catch:{ Exception -> 0x0170 }
            int r2 = r2 + 117
            int r3 = r2 % 128
            length = r3     // Catch:{ Exception -> 0x0170 }
            r3 = 2
            int r2 = r2 % r3
            r4 = 0
            if (r2 == 0) goto L_0x001f
            android.net.Uri r2 = r11.uri     // Catch:{ IOException -> 0x0169 }
            r10.uri = r2     // Catch:{ IOException -> 0x0169 }
            java.lang.String r2 = r2.getPath()     // Catch:{ IOException -> 0x0169 }
            r5 = 3
            int r5 = r5 / r4
            goto L_0x0027
        L_0x001d:
            r11 = move-exception
            throw r11
        L_0x001f:
            android.net.Uri r2 = r11.uri     // Catch:{ IOException -> 0x0169 }
            r10.uri = r2     // Catch:{ IOException -> 0x0169 }
            java.lang.String r2 = r2.getPath()     // Catch:{ IOException -> 0x0169 }
        L_0x0027:
            r5 = 1
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ all -> 0x0160 }
            r6[r4] = r1     // Catch:{ all -> 0x0160 }
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            java.lang.Class[] r7 = new java.lang.Class[r5]     // Catch:{ all -> 0x0160 }
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r7[r4] = r8     // Catch:{ all -> 0x0160 }
            java.lang.reflect.Method r1 = r1.getMethod(r0, r7)     // Catch:{ all -> 0x0160 }
            java.lang.Object r1 = r1.invoke(r2, r6)     // Catch:{ all -> 0x0160 }
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ all -> 0x0160 }
            boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x0160 }
            java.lang.String r6 = "substring"
            if (r1 == 0) goto L_0x006e
            r0 = 15
            java.lang.Object[] r1 = new java.lang.Object[r5]     // Catch:{ all -> 0x0065 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0065 }
            r1[r4] = r0     // Catch:{ all -> 0x0065 }
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            java.lang.Class[] r7 = new java.lang.Class[r5]     // Catch:{ all -> 0x0065 }
            java.lang.Class r8 = java.lang.Integer.TYPE     // Catch:{ all -> 0x0065 }
            r7[r4] = r8     // Catch:{ all -> 0x0065 }
            java.lang.reflect.Method r0 = r0.getMethod(r6, r7)     // Catch:{ all -> 0x0065 }
            java.lang.Object r0 = r0.invoke(r2, r1)     // Catch:{ all -> 0x0065 }
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x0065 }
            goto L_0x00b6
        L_0x0065:
            r11 = move-exception
            java.lang.Throwable r0 = r11.getCause()     // Catch:{ IOException -> 0x0169 }
            if (r0 == 0) goto L_0x006d
            throw r0     // Catch:{ IOException -> 0x0169 }
        L_0x006d:
            throw r11     // Catch:{ IOException -> 0x0169 }
        L_0x006e:
            java.lang.String r1 = "/"
            int r7 = setMax
            int r7 = r7 + 71
            int r8 = r7 % 128
            length = r8
            int r7 = r7 % r3
            java.lang.Object[] r7 = new java.lang.Object[r5]     // Catch:{ all -> 0x0157 }
            r7[r4] = r1     // Catch:{ all -> 0x0157 }
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            java.lang.Class[] r8 = new java.lang.Class[r5]     // Catch:{ all -> 0x0157 }
            java.lang.Class<java.lang.String> r9 = java.lang.String.class
            r8[r4] = r9     // Catch:{ all -> 0x0157 }
            java.lang.reflect.Method r0 = r1.getMethod(r0, r8)     // Catch:{ all -> 0x0157 }
            java.lang.Object r0 = r0.invoke(r2, r7)     // Catch:{ all -> 0x0157 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x0157 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0157 }
            if (r0 == 0) goto L_0x0097
            r0 = 1
            goto L_0x0098
        L_0x0097:
            r0 = 0
        L_0x0098:
            if (r0 == r5) goto L_0x009b
            goto L_0x00b6
        L_0x009b:
            java.lang.Object[] r0 = new java.lang.Object[r5]     // Catch:{ all -> 0x014e }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x014e }
            r0[r4] = r1     // Catch:{ all -> 0x014e }
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            java.lang.Class[] r7 = new java.lang.Class[r5]     // Catch:{ all -> 0x014e }
            java.lang.Class r8 = java.lang.Integer.TYPE     // Catch:{ all -> 0x014e }
            r7[r4] = r8     // Catch:{ all -> 0x014e }
            java.lang.reflect.Method r1 = r1.getMethod(r6, r7)     // Catch:{ all -> 0x014e }
            java.lang.Object r0 = r1.invoke(r2, r0)     // Catch:{ all -> 0x014e }
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x014e }
        L_0x00b6:
            r10.transferInitializing(r11)     // Catch:{ IOException -> 0x0169 }
            android.content.res.AssetManager r0 = r10.assetManager     // Catch:{ IOException -> 0x0169 }
            java.lang.Object[] r1 = new java.lang.Object[r3]     // Catch:{ all -> 0x0145 }
            r1[r5] = r2     // Catch:{ all -> 0x0145 }
            r1[r4] = r0     // Catch:{ all -> 0x0145 }
            int r0 = android.view.View.resolveSizeAndState(r4, r4, r4)     // Catch:{ all -> 0x0145 }
            int r0 = 19 - r0
            int r2 = android.view.KeyEvent.getModifierMetaStateMask()     // Catch:{ all -> 0x0145 }
            byte r2 = (byte) r2     // Catch:{ all -> 0x0145 }
            int r2 = -1 - r2
            r6 = 56348(0xdc1c, float:7.896E-41)
            int r7 = android.view.View.combineMeasuredStates(r4, r4)     // Catch:{ all -> 0x0145 }
            int r6 = r6 - r7
            char r6 = (char) r6     // Catch:{ all -> 0x0145 }
            java.lang.Object r0 = o.upFrom.setMax(r0, r2, r6)     // Catch:{ all -> 0x0145 }
            java.lang.Class r0 = (java.lang.Class) r0     // Catch:{ all -> 0x0145 }
            java.lang.String r2 = "getMin"
            java.lang.Class[] r6 = new java.lang.Class[r3]     // Catch:{ all -> 0x0145 }
            java.lang.Class<android.content.res.AssetManager> r7 = android.content.res.AssetManager.class
            r6[r4] = r7     // Catch:{ all -> 0x0145 }
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            r6[r5] = r7     // Catch:{ all -> 0x0145 }
            java.lang.reflect.Method r0 = r0.getMethod(r2, r6)     // Catch:{ all -> 0x0145 }
            r2 = 0
            java.lang.Object r0 = r0.invoke(r2, r1)     // Catch:{ all -> 0x0145 }
            java.io.InputStream r0 = (java.io.InputStream) r0     // Catch:{ all -> 0x0145 }
            r10.inputStream = r0     // Catch:{ IOException -> 0x0169 }
            long r1 = r11.position     // Catch:{ IOException -> 0x0169 }
            long r0 = r0.skip(r1)     // Catch:{ IOException -> 0x0169 }
            long r6 = r11.position     // Catch:{ IOException -> 0x0169 }
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r2 < 0) goto L_0x013f
            long r0 = r11.length     // Catch:{ IOException -> 0x0169 }
            r6 = -1
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r2 == 0) goto L_0x010b
            goto L_0x010c
        L_0x010b:
            r4 = 1
        L_0x010c:
            if (r4 == r5) goto L_0x0113
            long r0 = r11.length     // Catch:{ IOException -> 0x0169 }
            r10.bytesRemaining = r0     // Catch:{ IOException -> 0x0169 }
            goto L_0x012e
        L_0x0113:
            java.io.InputStream r0 = r10.inputStream     // Catch:{ IOException -> 0x0169 }
            int r0 = r0.available()     // Catch:{ IOException -> 0x0169 }
            long r0 = (long) r0     // Catch:{ IOException -> 0x0169 }
            r10.bytesRemaining = r0     // Catch:{ IOException -> 0x0169 }
            r8 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r2 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r2 != 0) goto L_0x012e
            int r0 = length
            int r0 = r0 + 41
            int r1 = r0 % 128
            setMax = r1
            int r0 = r0 % r3
            r10.bytesRemaining = r6     // Catch:{ IOException -> 0x0169 }
        L_0x012e:
            r10.opened = r5
            r10.transferStarted(r11)
            long r0 = r10.bytesRemaining
            int r11 = length
            int r11 = r11 + 105
            int r2 = r11 % 128
            setMax = r2
            int r11 = r11 % r3
            return r0
        L_0x013f:
            java.io.EOFException r11 = new java.io.EOFException     // Catch:{ IOException -> 0x0169 }
            r11.<init>()     // Catch:{ IOException -> 0x0169 }
            throw r11     // Catch:{ IOException -> 0x0169 }
        L_0x0145:
            r11 = move-exception
            java.lang.Throwable r0 = r11.getCause()     // Catch:{ IOException -> 0x0169 }
            if (r0 == 0) goto L_0x014d
            throw r0     // Catch:{ IOException -> 0x0169 }
        L_0x014d:
            throw r11     // Catch:{ IOException -> 0x0169 }
        L_0x014e:
            r11 = move-exception
            java.lang.Throwable r0 = r11.getCause()     // Catch:{ IOException -> 0x0169 }
            if (r0 == 0) goto L_0x0156
            throw r0     // Catch:{ IOException -> 0x0169 }
        L_0x0156:
            throw r11     // Catch:{ IOException -> 0x0169 }
        L_0x0157:
            r11 = move-exception
            java.lang.Throwable r0 = r11.getCause()     // Catch:{ IOException -> 0x0169 }
            if (r0 == 0) goto L_0x015f
            throw r0     // Catch:{ IOException -> 0x0169 }
        L_0x015f:
            throw r11     // Catch:{ IOException -> 0x0169 }
        L_0x0160:
            r11 = move-exception
            java.lang.Throwable r0 = r11.getCause()     // Catch:{ IOException -> 0x0169 }
            if (r0 == 0) goto L_0x0168
            throw r0     // Catch:{ IOException -> 0x0169 }
        L_0x0168:
            throw r11     // Catch:{ IOException -> 0x0169 }
        L_0x0169:
            r11 = move-exception
            com.google.android.exoplayer2.upstream.AssetDataSource$AssetDataSourceException r0 = new com.google.android.exoplayer2.upstream.AssetDataSource$AssetDataSourceException
            r0.<init>(r11)
            throw r0
        L_0x0170:
            r11 = move-exception
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.upstream.AssetDataSource.open(com.google.android.exoplayer2.upstream.DataSpec):long");
    }

    public final int read(byte[] bArr, int i, int i2) throws AssetDataSourceException {
        if (i2 == 0) {
            return 0;
        }
        long j = this.bytesRemaining;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, (long) i2);
            } catch (IOException e) {
                throw new AssetDataSourceException(e);
            }
        }
        int read = this.inputStream.read(bArr, i, i2);
        if (read != -1) {
            long j2 = this.bytesRemaining;
            if (j2 != -1) {
                this.bytesRemaining = j2 - ((long) read);
            }
            bytesTransferred(read);
            return read;
        } else if (this.bytesRemaining == -1) {
            return -1;
        } else {
            throw new AssetDataSourceException(new EOFException());
        }
    }

    @Nullable
    public final Uri getUri() {
        return this.uri;
    }

    public final void close() throws AssetDataSourceException {
        this.uri = null;
        try {
            if (this.inputStream != null) {
                this.inputStream.close();
            }
            this.inputStream = null;
            if (this.opened) {
                this.opened = false;
                transferEnded();
            }
        } catch (IOException e) {
            throw new AssetDataSourceException(e);
        } catch (Throwable th) {
            this.inputStream = null;
            if (this.opened) {
                this.opened = false;
                transferEnded();
            }
            throw th;
        }
    }
}
