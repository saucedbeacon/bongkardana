package o;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES10;
import android.opengl.GLES20;
import android.os.Build;
import javax.microedition.khronos.egl.EGL10;

public final class getRightDecorationWidth {
    public static int setMax() {
        try {
            if (Build.VERSION.SDK_INT >= 17) {
                EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
                int[] iArr = new int[2];
                EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1);
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                int[] iArr2 = new int[1];
                EGL14.eglChooseConfig(eglGetDisplay, new int[]{12351, 12430, 12329, 0, 12352, 4, 12339, 1, 12344}, 0, eGLConfigArr, 0, 1, iArr2, 0);
                if (iArr2[0] == 0) {
                    return 0;
                }
                EGLConfig eGLConfig = eGLConfigArr[0];
                EGLSurface eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eglGetDisplay, eGLConfig, new int[]{12375, 64, 12374, 64, 12344}, 0);
                EGLContext eglCreateContext = EGL14.eglCreateContext(eglGetDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344}, 0);
                EGL14.eglMakeCurrent(eglGetDisplay, eglCreatePbufferSurface, eglCreatePbufferSurface, eglCreateContext);
                int[] iArr3 = new int[1];
                GLES20.glGetIntegerv(3379, iArr3, 0);
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eglGetDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
                EGL14.eglDestroySurface(eglGetDisplay, eglCreatePbufferSurface);
                EGL14.eglDestroyContext(eglGetDisplay, eglCreateContext);
                EGL14.eglTerminate(eglGetDisplay);
                return iArr3[0];
            }
            EGL10 egl10 = (EGL10) javax.microedition.khronos.egl.EGLContext.getEGL();
            javax.microedition.khronos.egl.EGLDisplay eglGetDisplay2 = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            egl10.eglInitialize(eglGetDisplay2, new int[2]);
            javax.microedition.khronos.egl.EGLConfig[] eGLConfigArr2 = new javax.microedition.khronos.egl.EGLConfig[1];
            int[] iArr4 = new int[1];
            egl10.eglChooseConfig(eglGetDisplay2, new int[]{12351, 12430, 12329, 0, 12339, 1, 12344}, eGLConfigArr2, 1, iArr4);
            if (iArr4[0] == 0) {
                return 0;
            }
            javax.microedition.khronos.egl.EGLConfig eGLConfig2 = eGLConfigArr2[0];
            javax.microedition.khronos.egl.EGLSurface eglCreatePbufferSurface2 = egl10.eglCreatePbufferSurface(eglGetDisplay2, eGLConfig2, new int[]{12375, 64, 12374, 64, 12344});
            javax.microedition.khronos.egl.EGLContext eglCreateContext2 = egl10.eglCreateContext(eglGetDisplay2, eGLConfig2, EGL10.EGL_NO_CONTEXT, new int[]{12440, 1, 12344});
            egl10.eglMakeCurrent(eglGetDisplay2, eglCreatePbufferSurface2, eglCreatePbufferSurface2, eglCreateContext2);
            int[] iArr5 = new int[1];
            GLES10.glGetIntegerv(3379, iArr5, 0);
            javax.microedition.khronos.egl.EGLSurface eGLSurface2 = EGL10.EGL_NO_SURFACE;
            egl10.eglMakeCurrent(eglGetDisplay2, eGLSurface2, eGLSurface2, EGL10.EGL_NO_CONTEXT);
            egl10.eglDestroySurface(eglGetDisplay2, eglCreatePbufferSurface2);
            egl10.eglDestroyContext(eglGetDisplay2, eglCreateContext2);
            egl10.eglTerminate(eglGetDisplay2);
            return iArr5[0];
        } catch (Exception unused) {
            return 0;
        }
    }
}
