package o;

import android.content.Context;
import java.io.File;
import o.access$100;

public final class access$200 extends access$100 {
    public access$200(Context context) {
        this(context, "image_manager_disk_cache");
    }

    private access$200(final Context context, final String str) {
        super(new access$100.getMax() {
            public final File length() {
                File cacheDir = context.getCacheDir();
                if (cacheDir == null) {
                    return null;
                }
                return str != null ? new File(cacheDir, str) : cacheDir;
            }
        });
    }
}
