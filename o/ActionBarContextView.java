package o;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class ActionBarContextView {
    private static final Map<String, Lock> getMax = new HashMap();
    public final Lock getMin;
    private final boolean length;
    private final File setMax;
    public FileChannel setMin;

    public ActionBarContextView(@NonNull String str, @NonNull File file, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(".lck");
        File file2 = new File(file, sb.toString());
        this.setMax = file2;
        this.getMin = getMin(file2.getAbsolutePath());
        this.length = z;
    }

    public final void setMin() {
        this.getMin.lock();
        if (this.length) {
            try {
                FileChannel channel = new FileOutputStream(this.setMax).getChannel();
                this.setMin = channel;
                channel.lock();
            } catch (IOException e) {
                throw new IllegalStateException("Unable to grab copy lock.", e);
            }
        }
    }

    private static Lock getMin(String str) {
        Lock lock;
        synchronized (getMax) {
            lock = getMax.get(str);
            if (lock == null) {
                lock = new ReentrantLock();
                getMax.put(str, lock);
            }
        }
        return lock;
    }
}
