package o;

import android.content.Context;
import android.os.Build;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import javax.annotation.Nullable;
import o.DrawerLayout;
import o.tryCaptureView;

public class onEdgeLock extends tryCaptureView {
    protected final File setMax;
    protected final String setMin;

    public onEdgeLock(Context context, String str, File file, String str2) {
        super(context, str);
        this.setMax = file;
        this.setMin = str2;
    }

    /* access modifiers changed from: protected */
    public tryCaptureView.setMax getMin() throws IOException {
        return new length(this);
    }

    protected class length extends tryCaptureView.setMax {
        private final tryCaptureView getMin;
        @Nullable
        getMin[] length;
        final ZipFile setMax;

        /* access modifiers changed from: protected */
        public boolean getMax(ZipEntry zipEntry, String str) {
            return true;
        }

        length(tryCaptureView trycaptureview) throws IOException {
            this.setMax = new ZipFile(onEdgeLock.this.setMax);
            this.getMin = trycaptureview;
        }

        /* access modifiers changed from: package-private */
        public final getMin[] getMin() {
            if (this.length == null) {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                HashMap hashMap = new HashMap();
                Pattern compile = Pattern.compile(onEdgeLock.this.setMin);
                String[] min = Build.VERSION.SDK_INT < 21 ? new String[]{Build.CPU_ABI, Build.CPU_ABI2} : DrawerLayout.setMax.getMin();
                Enumeration<? extends ZipEntry> entries = this.setMax.entries();
                while (entries.hasMoreElements()) {
                    ZipEntry zipEntry = (ZipEntry) entries.nextElement();
                    Matcher matcher = compile.matcher(zipEntry.getName());
                    if (matcher.matches()) {
                        String group = matcher.group(1);
                        String group2 = matcher.group(2);
                        int max = DrawerLayout.getMax(min, group);
                        if (max >= 0) {
                            linkedHashSet.add(group);
                            getMin getmin = (getMin) hashMap.get(group2);
                            if (getmin == null || max < getmin.getMin) {
                                hashMap.put(group2, new getMin(group2, zipEntry, max));
                            }
                        }
                    }
                }
                this.getMin.isInside = (String[]) linkedHashSet.toArray(new String[linkedHashSet.size()]);
                getMin[] getminArr = (getMin[]) hashMap.values().toArray(new getMin[hashMap.size()]);
                Arrays.sort(getminArr);
                int i = 0;
                for (int i2 = 0; i2 < getminArr.length; i2++) {
                    getMin getmin2 = getminArr[i2];
                    if (getMax(getmin2.setMin, getmin2.setMax)) {
                        i++;
                    } else {
                        getminArr[i2] = null;
                    }
                }
                getMin[] getminArr2 = new getMin[i];
                int i3 = 0;
                for (getMin getmin3 : getminArr) {
                    if (getmin3 != null) {
                        getminArr2[i3] = getmin3;
                        i3++;
                    }
                }
                this.length = getminArr2;
            }
            return this.length;
        }

        public void close() throws IOException {
            this.setMax.close();
        }

        /* access modifiers changed from: protected */
        public final tryCaptureView.length setMax() throws IOException {
            return new tryCaptureView.length(getMin());
        }

        /* access modifiers changed from: protected */
        public final tryCaptureView.getMax getMax() throws IOException {
            return new C0097length(this, (byte) 0);
        }

        /* renamed from: o.onEdgeLock$length$length  reason: collision with other inner class name */
        final class C0097length extends tryCaptureView.getMax {
            private int getMin;

            private C0097length() {
            }

            /* synthetic */ C0097length(length length, byte b) {
                this();
            }

            public final boolean getMax() {
                length.this.getMin();
                return this.getMin < length.this.length.length;
            }

            public final tryCaptureView.setMin length() throws IOException {
                length.this.getMin();
                getMin[] getminArr = length.this.length;
                int i = this.getMin;
                this.getMin = i + 1;
                getMin getmin = getminArr[i];
                InputStream inputStream = length.this.setMax.getInputStream(getmin.setMin);
                try {
                    return new tryCaptureView.setMin(getmin, inputStream);
                } catch (Throwable th) {
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    throw th;
                }
            }
        }
    }

    static final class getMin extends tryCaptureView.getMin implements Comparable {
        final int getMin;
        final ZipEntry setMin;

        public final int compareTo(Object obj) {
            return this.setMax.compareTo(((getMin) obj).setMax);
        }

        getMin(String str, ZipEntry zipEntry, int i) {
            super(str, String.format("pseudo-zip-hash-1-%s-%s-%s-%s", new Object[]{zipEntry.getName(), Long.valueOf(zipEntry.getSize()), Long.valueOf(zipEntry.getCompressedSize()), Long.valueOf(zipEntry.getCrc())}));
            this.setMin = zipEntry;
            this.getMin = i;
        }
    }
}
