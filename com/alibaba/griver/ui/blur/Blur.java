package com.alibaba.griver.ui.blur;

import android.graphics.Bitmap;
import com.alibaba.ariver.kernel.common.utils.RVLogger;

public class Blur {
    /* JADX WARNING: Can't wrap try/catch for region: R(2:14|15) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x005e */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x005e A[SYNTHETIC, Splitter:B:14:0x005e] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized android.graphics.Bitmap of(android.content.Context r9, android.graphics.Bitmap r10, com.alibaba.griver.ui.blur.BlurFactor r11) {
        /*
            java.lang.Class<com.alibaba.griver.ui.blur.Blur> r0 = com.alibaba.griver.ui.blur.Blur.class
            monitor-enter(r0)
            int r1 = r11.width     // Catch:{ all -> 0x0079 }
            int r2 = r11.sampling     // Catch:{ all -> 0x0079 }
            int r1 = r1 / r2
            int r2 = r11.height     // Catch:{ all -> 0x0079 }
            int r3 = r11.sampling     // Catch:{ all -> 0x0079 }
            int r2 = r2 / r3
            r3 = 2
            int[] r3 = new int[r3]     // Catch:{ all -> 0x0079 }
            r4 = 0
            r3[r4] = r1     // Catch:{ all -> 0x0079 }
            r4 = 1
            r3[r4] = r2     // Catch:{ all -> 0x0079 }
            boolean r3 = com.alibaba.griver.ui.blur.Helper.hasZero(r3)     // Catch:{ all -> 0x0079 }
            r5 = 0
            if (r3 == 0) goto L_0x001f
            monitor-exit(r0)
            return r5
        L_0x001f:
            android.graphics.Bitmap$Config r3 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ all -> 0x0079 }
            android.graphics.Bitmap r1 = android.graphics.Bitmap.createBitmap(r1, r2, r3)     // Catch:{ all -> 0x0079 }
            android.graphics.Canvas r2 = new android.graphics.Canvas     // Catch:{ all -> 0x0079 }
            r2.<init>(r1)     // Catch:{ all -> 0x0079 }
            int r3 = r11.sampling     // Catch:{ all -> 0x0079 }
            float r3 = (float) r3     // Catch:{ all -> 0x0079 }
            r6 = 1065353216(0x3f800000, float:1.0)
            float r3 = r6 / r3
            int r7 = r11.sampling     // Catch:{ all -> 0x0079 }
            float r7 = (float) r7     // Catch:{ all -> 0x0079 }
            float r6 = r6 / r7
            r2.scale(r3, r6)     // Catch:{ all -> 0x0079 }
            android.graphics.Paint r3 = new android.graphics.Paint     // Catch:{ all -> 0x0079 }
            r3.<init>()     // Catch:{ all -> 0x0079 }
            r6 = 3
            r3.setFlags(r6)     // Catch:{ all -> 0x0079 }
            android.graphics.PorterDuffColorFilter r6 = new android.graphics.PorterDuffColorFilter     // Catch:{ all -> 0x0079 }
            int r7 = r11.color     // Catch:{ all -> 0x0079 }
            android.graphics.PorterDuff$Mode r8 = android.graphics.PorterDuff.Mode.SRC_ATOP     // Catch:{ all -> 0x0079 }
            r6.<init>(r7, r8)     // Catch:{ all -> 0x0079 }
            r3.setColorFilter(r6)     // Catch:{ all -> 0x0079 }
            r6 = 0
            r2.drawBitmap(r10, r6, r6, r3)     // Catch:{ all -> 0x0079 }
            int r10 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0079 }
            r2 = 18
            if (r10 < r2) goto L_0x005e
            int r10 = r11.radius     // Catch:{ all -> 0x005e }
            android.graphics.Bitmap r9 = a(r9, r1, r10)     // Catch:{ all -> 0x005e }
            goto L_0x0062
        L_0x005e:
            android.graphics.Bitmap r9 = a(r1)     // Catch:{ all -> 0x0079 }
        L_0x0062:
            int r10 = r11.sampling     // Catch:{ all -> 0x0079 }
            if (r10 != r4) goto L_0x0068
            monitor-exit(r0)
            return r9
        L_0x0068:
            if (r9 == 0) goto L_0x0077
            int r10 = r11.width     // Catch:{ all -> 0x0079 }
            int r11 = r11.height     // Catch:{ all -> 0x0079 }
            android.graphics.Bitmap r10 = android.graphics.Bitmap.createScaledBitmap(r9, r10, r11, r4)     // Catch:{ all -> 0x0079 }
            r9.recycle()     // Catch:{ all -> 0x0079 }
            monitor-exit(r0)
            return r10
        L_0x0077:
            monitor-exit(r0)
            return r5
        L_0x0079:
            r9 = move-exception
            monitor-exit(r0)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.griver.ui.blur.Blur.of(android.content.Context, android.graphics.Bitmap, com.alibaba.griver.ui.blur.BlurFactor):android.graphics.Bitmap");
    }

    private static Bitmap a(Bitmap bitmap) {
        try {
            return new StackBlurManager(bitmap).process(5);
        } catch (Throwable th) {
            RVLogger.e("blur", th);
            return null;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: android.renderscript.RenderScript} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: android.renderscript.ScriptIntrinsicBlur} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: android.renderscript.RenderScript} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: android.renderscript.ScriptIntrinsicBlur} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: android.renderscript.Allocation} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: android.renderscript.RenderScript} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: android.renderscript.ScriptIntrinsicBlur} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: android.renderscript.Allocation} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: android.renderscript.Allocation} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: android.renderscript.RenderScript} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: android.renderscript.RenderScript} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: android.renderscript.RenderScript} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: android.renderscript.ScriptIntrinsicBlur} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: android.renderscript.ScriptIntrinsicBlur} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: android.renderscript.RenderScript} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0069  */
    @android.annotation.TargetApi(18)
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.graphics.Bitmap a(android.content.Context r5, android.graphics.Bitmap r6, int r7) {
        /*
            r0 = 0
            android.renderscript.RenderScript r5 = android.renderscript.RenderScript.create(r5)     // Catch:{ all -> 0x0054 }
            android.renderscript.RenderScript$RSMessageHandler r1 = new android.renderscript.RenderScript$RSMessageHandler     // Catch:{ all -> 0x004e }
            r1.<init>()     // Catch:{ all -> 0x004e }
            r5.setMessageHandler(r1)     // Catch:{ all -> 0x004e }
            android.renderscript.Allocation$MipmapControl r1 = android.renderscript.Allocation.MipmapControl.MIPMAP_NONE     // Catch:{ all -> 0x004e }
            r2 = 1
            android.renderscript.Allocation r1 = android.renderscript.Allocation.createFromBitmap(r5, r6, r1, r2)     // Catch:{ all -> 0x004e }
            android.renderscript.Type r2 = r1.getType()     // Catch:{ all -> 0x004b }
            android.renderscript.Allocation r2 = android.renderscript.Allocation.createTyped(r5, r2)     // Catch:{ all -> 0x004b }
            android.renderscript.Element r3 = android.renderscript.Element.U8_4(r5)     // Catch:{ all -> 0x0046 }
            android.renderscript.ScriptIntrinsicBlur r0 = android.renderscript.ScriptIntrinsicBlur.create(r5, r3)     // Catch:{ all -> 0x0046 }
            r0.setInput(r1)     // Catch:{ all -> 0x0046 }
            float r7 = (float) r7     // Catch:{ all -> 0x0046 }
            r0.setRadius(r7)     // Catch:{ all -> 0x0046 }
            r0.forEach(r2)     // Catch:{ all -> 0x0046 }
            r2.copyTo(r6)     // Catch:{ all -> 0x0046 }
            if (r5 == 0) goto L_0x0036
            r5.destroy()
        L_0x0036:
            if (r1 == 0) goto L_0x003b
            r1.destroy()
        L_0x003b:
            if (r2 == 0) goto L_0x0040
            r2.destroy()
        L_0x0040:
            if (r0 == 0) goto L_0x0045
            r0.destroy()
        L_0x0045:
            return r6
        L_0x0046:
            r6 = move-exception
            r4 = r0
            r0 = r5
            r5 = r4
            goto L_0x0058
        L_0x004b:
            r6 = move-exception
            r2 = r0
            goto L_0x0051
        L_0x004e:
            r6 = move-exception
            r1 = r0
            r2 = r1
        L_0x0051:
            r0 = r5
            r5 = r2
            goto L_0x0058
        L_0x0054:
            r6 = move-exception
            r5 = r0
            r1 = r5
            r2 = r1
        L_0x0058:
            if (r0 == 0) goto L_0x005d
            r0.destroy()
        L_0x005d:
            if (r1 == 0) goto L_0x0062
            r1.destroy()
        L_0x0062:
            if (r2 == 0) goto L_0x0067
            r2.destroy()
        L_0x0067:
            if (r5 == 0) goto L_0x006c
            r5.destroy()
        L_0x006c:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.griver.ui.blur.Blur.a(android.content.Context, android.graphics.Bitmap, int):android.graphics.Bitmap");
    }
}
