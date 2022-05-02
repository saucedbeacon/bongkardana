package o;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.StrictMode;
import java.io.File;
import java.io.IOException;

public final class onViewDragStateChanged extends clampViewPositionVertical {
    private Context getMax;
    private onViewReleased setMax;
    private int setMin;

    public onViewDragStateChanged(Context context, int i) {
        Context applicationContext = context.getApplicationContext();
        this.getMax = applicationContext;
        if (applicationContext == null) {
            this.getMax = context;
        }
        this.setMin = i;
        this.setMax = new onViewReleased(new File(this.getMax.getApplicationInfo().nativeLibraryDir), i);
    }

    public final boolean getMax() throws IOException {
        try {
            File file = this.setMax.length;
            Context createPackageContext = this.getMax.createPackageContext(this.getMax.getPackageName(), 0);
            File file2 = new File(createPackageContext.getApplicationInfo().nativeLibraryDir);
            if (file.equals(file2)) {
                return false;
            }
            int i = this.setMin | 1;
            this.setMin = i;
            onViewReleased onviewreleased = new onViewReleased(file2, i);
            this.setMax = onviewreleased;
            onviewreleased.getMax(this.setMin);
            this.getMax = createPackageContext;
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public final int getMin(String str, int i, StrictMode.ThreadPolicy threadPolicy) throws IOException {
        return this.setMax.getMin(str, i, threadPolicy);
    }

    /* access modifiers changed from: protected */
    public final void getMax(int i) throws IOException {
        this.setMax.getMax(i);
    }

    public final String toString() {
        return this.setMax.toString();
    }
}
