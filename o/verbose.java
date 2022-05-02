package o;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public interface verbose {
    public static final verbose length = new verbose() {
        public final recordWsHsTime getMin(File file) throws FileNotFoundException {
            return recordMonitorOfSndMsg.setMin(file);
        }

        public final recordDnsTime getMax(File file) throws FileNotFoundException {
            try {
                return recordMonitorOfSndMsg.getMax(file);
            } catch (FileNotFoundException unused) {
                file.getParentFile().mkdirs();
                return recordMonitorOfSndMsg.getMax(file);
            }
        }

        public final recordDnsTime setMin(File file) throws FileNotFoundException {
            try {
                return recordMonitorOfSndMsg.getMin(file);
            } catch (FileNotFoundException unused) {
                file.getParentFile().mkdirs();
                return recordMonitorOfSndMsg.getMin(file);
            }
        }

        public final void length(File file) throws IOException {
            if (!file.delete() && file.exists()) {
                throw new IOException("failed to delete ".concat(String.valueOf(file)));
            }
        }

        public final boolean setMax(File file) {
            return file.exists();
        }

        public final long toIntRange(File file) {
            return file.length();
        }

        public final void isInside(File file) throws IOException {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                int length = listFiles.length;
                int i = 0;
                while (i < length) {
                    File file2 = listFiles[i];
                    if (file2.isDirectory()) {
                        isInside(file2);
                    }
                    if (file2.delete()) {
                        i++;
                    } else {
                        throw new IOException("failed to delete ".concat(String.valueOf(file2)));
                    }
                }
                return;
            }
            throw new IOException("not a readable directory: ".concat(String.valueOf(file)));
        }

        public final void setMin(File file, File file2) throws IOException {
            if (!file2.delete() && file2.exists()) {
                throw new IOException("failed to delete ".concat(String.valueOf(file2)));
            } else if (!file.renameTo(file2)) {
                StringBuilder sb = new StringBuilder("failed to rename ");
                sb.append(file);
                sb.append(" to ");
                sb.append(file2);
                throw new IOException(sb.toString());
            }
        }
    };

    recordDnsTime getMax(File file) throws FileNotFoundException;

    recordWsHsTime getMin(File file) throws FileNotFoundException;

    void isInside(File file) throws IOException;

    void length(File file) throws IOException;

    boolean setMax(File file);

    recordDnsTime setMin(File file) throws FileNotFoundException;

    void setMin(File file, File file2) throws IOException;

    long toIntRange(File file);
}
