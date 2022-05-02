package o;

import androidx.annotation.NonNull;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public final class setMessage {
    private final File getMin;
    public final File length;
    public final File setMax;

    public setMessage(@NonNull File file) {
        this.setMax = file;
        StringBuilder sb = new StringBuilder();
        sb.append(file.getPath());
        sb.append(".new");
        this.length = new File(sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(file.getPath());
        sb2.append(".bak");
        this.getMin = new File(sb2.toString());
    }

    @NonNull
    public final FileOutputStream getMin() throws IOException {
        if (this.getMin.exists()) {
            File file = this.getMin;
            File file2 = this.setMax;
            if (file2.isDirectory()) {
                file2.delete();
            }
            file.renameTo(file2);
        }
        try {
            return new FileOutputStream(this.length);
        } catch (FileNotFoundException unused) {
            if (this.length.getParentFile().mkdirs()) {
                try {
                    return new FileOutputStream(this.length);
                } catch (FileNotFoundException e) {
                    StringBuilder sb = new StringBuilder("Failed to create new file ");
                    sb.append(this.length);
                    throw new IOException(sb.toString(), e);
                }
            } else {
                StringBuilder sb2 = new StringBuilder("Failed to create directory for ");
                sb2.append(this.length);
                throw new IOException(sb2.toString());
            }
        }
    }

    public static boolean length(@NonNull FileOutputStream fileOutputStream) {
        try {
            fileOutputStream.getFD().sync();
            return true;
        } catch (IOException unused) {
            return false;
        }
    }
}
