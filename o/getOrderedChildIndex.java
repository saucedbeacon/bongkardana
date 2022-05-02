package o;

import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileLock;
import javax.annotation.Nullable;

public final class getOrderedChildIndex implements Closeable {
    private final FileOutputStream getMin;
    @Nullable
    private final FileLock setMax;

    getOrderedChildIndex(File file) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        this.getMin = fileOutputStream;
        try {
            FileLock lock = fileOutputStream.getChannel().lock();
            if (lock == null) {
            }
            this.setMax = lock;
        } finally {
            this.getMin.close();
        }
    }

    public final void close() throws IOException {
        try {
            if (this.setMax != null) {
                this.setMax.release();
            }
        } finally {
            this.getMin.close();
        }
    }
}
