package o;

import android.net.Uri;
import android.webkit.MimeTypeMap;
import androidx.annotation.Nullable;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

final class createTextView extends superDispatchKeyEvent {
    private File setMax;

    createTextView(@Nullable superDispatchKeyEvent superdispatchkeyevent, File file) {
        super(superdispatchkeyevent);
        this.setMax = file;
    }

    @Nullable
    public final superDispatchKeyEvent getMax(String str, String str2) {
        String extensionFromMimeType = MimeTypeMap.getSingleton().getExtensionFromMimeType(str);
        if (extensionFromMimeType != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(".");
            sb.append(extensionFromMimeType);
            str2 = sb.toString();
        }
        File file = new File(this.setMax, str2);
        try {
            file.createNewFile();
            return new createTextView(this, file);
        } catch (IOException unused) {
            return null;
        }
    }

    @Nullable
    public final superDispatchKeyEvent getMin(String str) {
        File file = new File(this.setMax, str);
        if (file.isDirectory() || file.mkdir()) {
            return new createTextView(this, file);
        }
        return null;
    }

    public final Uri setMin() {
        return Uri.fromFile(this.setMax);
    }

    public final String getMin() {
        return this.setMax.getName();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0018, code lost:
        r0 = android.webkit.MimeTypeMap.getSingleton().getMimeTypeFromExtension(r0.substring(r1 + 1).toLowerCase());
     */
    @androidx.annotation.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String getMax() {
        /*
            r2 = this;
            java.io.File r0 = r2.setMax
            boolean r0 = r0.isDirectory()
            if (r0 == 0) goto L_0x000a
            r0 = 0
            return r0
        L_0x000a:
            java.io.File r0 = r2.setMax
            java.lang.String r0 = r0.getName()
            r1 = 46
            int r1 = r0.lastIndexOf(r1)
            if (r1 < 0) goto L_0x002d
            int r1 = r1 + 1
            java.lang.String r0 = r0.substring(r1)
            java.lang.String r0 = r0.toLowerCase()
            android.webkit.MimeTypeMap r1 = android.webkit.MimeTypeMap.getSingleton()
            java.lang.String r0 = r1.getMimeTypeFromExtension(r0)
            if (r0 == 0) goto L_0x002d
            return r0
        L_0x002d:
            java.lang.String r0 = "application/octet-stream"
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.createTextView.getMax():java.lang.String");
    }

    public final boolean setMax() {
        return this.setMax.isDirectory();
    }

    public final boolean toFloatRange() {
        return this.setMax.isFile();
    }

    public final boolean IsOverlapping() {
        return this.setMax.canRead();
    }

    public final boolean isInside() {
        return this.setMax.canWrite();
    }

    public final boolean equals() {
        getMin(this.setMax);
        return this.setMax.delete();
    }

    public final boolean toIntRange() {
        return this.setMax.exists();
    }

    public final superDispatchKeyEvent[] FastBitmap$CoordinateSystem() {
        ArrayList arrayList = new ArrayList();
        File[] listFiles = this.setMax.listFiles();
        if (listFiles != null) {
            for (File createtextview : listFiles) {
                arrayList.add(new createTextView(this, createtextview));
            }
        }
        return (superDispatchKeyEvent[]) arrayList.toArray(new superDispatchKeyEvent[arrayList.size()]);
    }

    public final boolean setMax(String str) {
        File file = new File(this.setMax.getParentFile(), str);
        if (!this.setMax.renameTo(file)) {
            return false;
        }
        this.setMax = file;
        return true;
    }

    private static boolean getMin(File file) {
        File[] listFiles = file.listFiles();
        boolean z = true;
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    z &= getMin(file2);
                }
                if (!file2.delete()) {
                    z = false;
                }
            }
        }
        return z;
    }
}
