package o;

import android.os.StrictMode;
import android.os.Trace;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class onViewReleased extends clampViewPositionVertical {
    protected final int getMax;
    protected final File length;

    public onViewReleased(File file, int i) {
        this.length = file;
        this.getMax = i;
    }

    public int getMin(String str, int i, StrictMode.ThreadPolicy threadPolicy) throws IOException {
        return length(str, i, this.length, threadPolicy);
    }

    /* access modifiers changed from: protected */
    public final int length(String str, int i, File file, StrictMode.ThreadPolicy threadPolicy) throws IOException {
        File file2 = new File(file, str);
        if (!file2.exists()) {
            file.getCanonicalPath();
            return 0;
        }
        file.getCanonicalPath();
        if ((i & 1) != 0 && (this.getMax & 2) != 0) {
            return 2;
        }
        if ((this.getMax & 1) != 0) {
            setMax(file2, i, threadPolicy);
        }
        try {
            getViewVerticalDragRange.length.setMax(file2.getAbsolutePath(), i);
            return 1;
        } catch (UnsatisfiedLinkError e) {
            if (e.getMessage().contains("bad ELF magic")) {
                return 3;
            }
            throw e;
        }
    }

    private static void setMax(File file, int i, StrictMode.ThreadPolicy threadPolicy) throws IOException {
        String[] max = setMax(file);
        Arrays.toString(max);
        for (String str : max) {
            if (!str.startsWith("/")) {
                getViewVerticalDragRange.setMin(str, i | 1, threadPolicy);
            }
        }
    }

    private static String[] setMax(File file) throws IOException {
        if (getViewVerticalDragRange.getMin) {
            StringBuilder sb = new StringBuilder("SoLoader.getElfDependencies[");
            sb.append(file.getName());
            sb.append("]");
            Trace.beginSection(sb.toString());
        }
        try {
            return getViewHorizontalDragRange.setMax(file);
        } finally {
            if (getViewVerticalDragRange.getMin) {
                Trace.endSection();
            }
        }
    }

    public String toString() {
        String str;
        try {
            str = String.valueOf(this.length.getCanonicalPath());
        } catch (IOException unused) {
            str = this.length.getName();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getName());
        sb.append("[root = ");
        sb.append(str);
        sb.append(" flags = ");
        sb.append(this.getMax);
        sb.append(']');
        return sb.toString();
    }
}
