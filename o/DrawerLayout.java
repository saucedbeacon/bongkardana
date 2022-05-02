package o;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import com.facebook.soloader.DoNotOptimize;
import com.github.mikephil.charting.charts.RadarChart;
import com.github.mikephil.charting.data.Entry;
import java.io.File;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.List;

public final class DrawerLayout {

    public interface SavedState {
        addFocusables setMax(float f, float f2);
    }

    public final class LayoutParams extends onKeyUp<RadarChart> {
        public LayoutParams(RadarChart radarChart) {
            super(radarChart);
        }

        /* access modifiers changed from: protected */
        public final addFocusables getMin(int i, float f, float f2) {
            int i2 = i;
            this.getMax.clear();
            float min = ((RadarChart) this.setMax).getAnimator().getMin();
            float length = ((RadarChart) this.setMax).getAnimator().length();
            float sliceAngle = ((RadarChart) this.setMax).getSliceAngle();
            float factor = ((RadarChart) this.setMax).getFactor();
            setArguments max = setArguments.getMax(0.0f, 0.0f);
            int i3 = 0;
            while (i3 < ((gravityToString) ((RadarChart) this.setMax).getData()).setMin()) {
                EmojiAppCompatTextView min2 = ((gravityToString) ((RadarChart) this.setMax).getData()).setMin(i3);
                Entry intRange = min2.toIntRange(i2);
                float f3 = (float) i2;
                getTargetFragment.setMax(((RadarChart) this.setMax).getCenterOffsets(), (intRange.getMin() - ((RadarChart) this.setMax).getYChartMin()) * factor * length, (sliceAngle * f3 * min) + ((RadarChart) this.setMax).getRotationAngle(), max);
                List list = this.getMax;
                addFocusables addfocusables = r8;
                addFocusables addfocusables2 = new addFocusables(f3, intRange.getMin(), max.length, max.getMin, i3, min2.getCause());
                list.add(addfocusables);
                i3++;
                i2 = i;
            }
            List list2 = this.getMax;
            float distanceToCenter = ((RadarChart) this.setMax).distanceToCenter(f, f2) / ((RadarChart) this.setMax).getFactor();
            addFocusables addfocusables3 = null;
            float f4 = Float.MAX_VALUE;
            for (int i4 = 0; i4 < list2.size(); i4++) {
                addFocusables addfocusables4 = (addFocusables) list2.get(i4);
                float abs = Math.abs(addfocusables4.getMin - distanceToCenter);
                if (abs < f4) {
                    addfocusables3 = addfocusables4;
                    f4 = abs;
                }
            }
            return addfocusables3;
        }
    }

    public static int getMax(String[] strArr, String str) {
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i] != null && str.equals(strArr[i])) {
                return i;
            }
        }
        return -1;
    }

    public static void getMin(File file) throws IOException {
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File min : listFiles) {
                    getMin(min);
                }
            } else {
                return;
            }
        }
        if (!file.delete() && file.exists()) {
            throw new IOException("could not delete: ".concat(String.valueOf(file)));
        }
    }

    @DoNotOptimize
    @TargetApi(21)
    static final class setMax {
        @DoNotOptimize
        public static String[] getMin() {
            return Build.SUPPORTED_ABIS;
        }

        @DoNotOptimize
        public static void length(FileDescriptor fileDescriptor, long j) throws IOException {
            try {
                Os.posix_fallocate(fileDescriptor, 0, j);
            } catch (ErrnoException e) {
                if (e.errno != OsConstants.EOPNOTSUPP && e.errno != OsConstants.ENOSYS && e.errno != OsConstants.EINVAL) {
                    throw new IOException(e.toString(), e);
                }
            }
        }
    }

    static int getMin(RandomAccessFile randomAccessFile, InputStream inputStream, byte[] bArr) throws IOException {
        int read;
        int i = 0;
        while (i < Integer.MAX_VALUE && (read = inputStream.read(bArr, 0, Math.min(32768, Integer.MAX_VALUE - i))) != -1) {
            randomAccessFile.write(bArr, 0, read);
            i += read;
        }
        return i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0049, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004f, code lost:
        r2.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0052, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void getMax(java.io.File r2) throws java.io.IOException {
        /*
            boolean r0 = r2.isDirectory()
            if (r0 == 0) goto L_0x0029
            java.io.File[] r0 = r2.listFiles()
            if (r0 == 0) goto L_0x0019
            r2 = 0
        L_0x000d:
            int r1 = r0.length
            if (r2 >= r1) goto L_0x0018
            r1 = r0[r2]
            getMax(r1)
            int r2 = r2 + 1
            goto L_0x000d
        L_0x0018:
            return
        L_0x0019:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r1 = "cannot list directory "
            java.lang.String r2 = r1.concat(r2)
            r0.<init>(r2)
            throw r0
        L_0x0029:
            java.lang.String r0 = r2.getPath()
            java.lang.String r1 = "_lock"
            boolean r0 = r0.endsWith(r1)
            if (r0 != 0) goto L_0x0053
            java.io.RandomAccessFile r0 = new java.io.RandomAccessFile
            java.lang.String r1 = "r"
            r0.<init>(r2, r1)
            java.io.FileDescriptor r2 = r0.getFD()     // Catch:{ all -> 0x0047 }
            r2.sync()     // Catch:{ all -> 0x0047 }
            r0.close()
            return
        L_0x0047:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x0049 }
        L_0x0049:
            r1 = move-exception
            r0.close()     // Catch:{ all -> 0x004e }
            goto L_0x0052
        L_0x004e:
            r0 = move-exception
            r2.addSuppressed(r0)
        L_0x0052:
            throw r1
        L_0x0053:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.DrawerLayout.getMax(java.io.File):void");
    }

    public static int setMax(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            try {
                return packageManager.getPackageInfo(context.getPackageName(), 0).versionCode;
            } catch (PackageManager.NameNotFoundException | RuntimeException unused) {
            }
        }
        return 0;
    }
}
