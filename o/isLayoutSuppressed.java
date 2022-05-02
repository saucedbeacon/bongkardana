package o;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import androidx.annotation.RequiresApi;

@RequiresApi(api = 18)
public final class isLayoutSuppressed {
    private static final String setMin = isLayoutSuppressed.class.getSimpleName();
    EGLContext getMax;
    private int getMin;
    EGLDisplay length;
    EGLConfig setMax;

    public isLayoutSuppressed() {
        this((EGLContext) null, 0);
    }

    public isLayoutSuppressed(EGLContext eGLContext, int i) {
        EGLConfig min;
        this.length = EGL14.EGL_NO_DISPLAY;
        this.getMax = EGL14.EGL_NO_CONTEXT;
        this.setMax = null;
        this.getMin = -1;
        if (this.length == EGL14.EGL_NO_DISPLAY) {
            eGLContext = eGLContext == null ? EGL14.EGL_NO_CONTEXT : eGLContext;
            EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
            this.length = eglGetDisplay;
            if (eglGetDisplay != EGL14.EGL_NO_DISPLAY) {
                int[] iArr = new int[2];
                if (EGL14.eglInitialize(this.length, iArr, 0, iArr, 1)) {
                    if (!((i & 2) == 0 || (min = setMin(i, 3)) == null)) {
                        EGLContext eglCreateContext = EGL14.eglCreateContext(this.length, min, eGLContext, new int[]{12440, 3, 12344}, 0);
                        if (EGL14.eglGetError() == 12288) {
                            this.setMax = min;
                            this.getMax = eglCreateContext;
                            this.getMin = 3;
                        }
                    }
                    if (this.getMax == EGL14.EGL_NO_CONTEXT) {
                        EGLConfig min2 = setMin(i, 2);
                        if (min2 != null) {
                            EGLContext eglCreateContext2 = EGL14.eglCreateContext(this.length, min2, eGLContext, new int[]{12440, 2, 12344}, 0);
                            setMax("eglCreateContext");
                            this.setMax = min2;
                            this.getMax = eglCreateContext2;
                            this.getMin = 2;
                        } else {
                            throw new RuntimeException("Unable to find a suitable EGLConfig");
                        }
                    }
                    EGL14.eglQueryContext(this.length, this.getMax, 12440, new int[1], 0);
                    return;
                }
                this.length = null;
                throw new RuntimeException("unable to initialize EGL14");
            }
            throw new RuntimeException("unable to get EGL14 display");
        }
        throw new RuntimeException("EGL already set up");
    }

    private EGLConfig setMin(int i, int i2) {
        int[] iArr = {12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, i2 >= 3 ? 68 : 4, 12344, 0, 12344};
        if ((i & 1) != 0) {
            iArr[10] = 12610;
            iArr[11] = 1;
        }
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        if (!EGL14.eglChooseConfig(this.length, iArr, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
            return null;
        }
        return eGLConfigArr[0];
    }

    public final void setMax() {
        if (this.length != EGL14.EGL_NO_DISPLAY) {
            EGLDisplay eGLDisplay = this.length;
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            EGL14.eglDestroyContext(this.length, this.getMax);
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(this.length);
        }
        this.length = EGL14.EGL_NO_DISPLAY;
        this.getMax = EGL14.EGL_NO_CONTEXT;
        this.setMax = null;
    }

    /* access modifiers changed from: protected */
    public final void finalize() throws Throwable {
        try {
            if (this.length != EGL14.EGL_NO_DISPLAY) {
                setMax();
            }
        } finally {
            super.finalize();
        }
    }

    public final boolean setMin(EGLSurface eGLSurface) {
        return EGL14.eglSwapBuffers(this.length, eGLSurface);
    }

    public final boolean length(EGLSurface eGLSurface) {
        return this.getMax.equals(EGL14.eglGetCurrentContext()) && eGLSurface.equals(EGL14.eglGetCurrentSurface(12377));
    }

    static void setMax(String str) {
        int eglGetError = EGL14.eglGetError();
        if (eglGetError != 12288) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(": EGL error: 0x");
            sb.append(Integer.toHexString(eglGetError));
            throw new RuntimeException(sb.toString());
        }
    }
}
