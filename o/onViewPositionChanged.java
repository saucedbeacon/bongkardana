package o;

import android.content.Context;
import android.os.Parcel;
import java.io.File;
import java.io.IOException;
import java.util.zip.ZipEntry;
import o.onEdgeLock;
import o.tryCaptureView;

public final class onViewPositionChanged extends onEdgeLock {
    final int getMin;

    public onViewPositionChanged(Context context, File file, String str, int i) {
        super(context, str, file, "^lib/([^/]+)/([^/]+\\.so)$");
        this.getMin = i;
    }

    /* access modifiers changed from: protected */
    public final tryCaptureView.setMax getMin() throws IOException {
        return new getMax(this);
    }

    protected class getMax extends onEdgeLock.length {
        private final int IsOverlapping;
        private File getMin;

        getMax(onEdgeLock onedgelock) throws IOException {
            super(onedgelock);
            this.getMin = new File(onViewPositionChanged.this.toIntRange.getApplicationInfo().nativeLibraryDir);
            this.IsOverlapping = onViewPositionChanged.this.getMin;
        }

        /* access modifiers changed from: protected */
        public final boolean getMax(ZipEntry zipEntry, String str) {
            zipEntry.getName();
            if (str.equals(onViewPositionChanged.this.IsOverlapping)) {
                onViewPositionChanged.this.IsOverlapping = null;
                return true;
            } else if ((this.IsOverlapping & 1) == 0) {
                return true;
            } else {
                File file = new File(this.getMin, str);
                if (!file.isFile()) {
                    return true;
                }
                long length = file.length();
                long size = zipEntry.getSize();
                if (length == size) {
                    return false;
                }
                Long.valueOf(length);
                Long.valueOf(size);
                return true;
            }
        }
    }

    /* access modifiers changed from: protected */
    public final byte[] setMax() throws IOException {
        File canonicalFile = this.setMax.getCanonicalFile();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeByte((byte) 2);
            obtain.writeString(canonicalFile.getPath());
            obtain.writeLong(canonicalFile.lastModified());
            obtain.writeInt(DrawerLayout.setMax(this.toIntRange));
            if ((this.getMin & 1) == 0) {
                obtain.writeByte((byte) 0);
                return obtain.marshall();
            }
            String str = this.toIntRange.getApplicationInfo().nativeLibraryDir;
            if (str == null) {
                obtain.writeByte((byte) 1);
                byte[] marshall = obtain.marshall();
                obtain.recycle();
                return marshall;
            }
            File canonicalFile2 = new File(str).getCanonicalFile();
            if (!canonicalFile2.exists()) {
                obtain.writeByte((byte) 1);
                byte[] marshall2 = obtain.marshall();
                obtain.recycle();
                return marshall2;
            }
            obtain.writeByte((byte) 2);
            obtain.writeString(canonicalFile2.getPath());
            obtain.writeLong(canonicalFile2.lastModified());
            byte[] marshall3 = obtain.marshall();
            obtain.recycle();
            return marshall3;
        } finally {
            obtain.recycle();
        }
    }
}
