package o;

import androidx.annotation.MainThread;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import o.ICustomTabsService;

public abstract class receiveFile {
    public boolean length = false;
    public CopyOnWriteArrayList<ICustomTabsService.Default> setMax = new CopyOnWriteArrayList<>();

    @MainThread
    public abstract void getMin();

    @MainThread
    public final boolean length() {
        return this.length;
    }

    @MainThread
    public final void setMin() {
        Iterator<ICustomTabsService.Default> it = this.setMax.iterator();
        while (it.hasNext()) {
            it.next().length();
        }
    }
}
