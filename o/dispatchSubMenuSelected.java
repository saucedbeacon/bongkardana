package o;

import android.os.Bundle;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public abstract class dispatchSubMenuSelected {

    public interface getMax<D> {
        @MainThread
        @NonNull
        dispatchRestoreInstanceState<D> onCreateLoader(int i, @Nullable Bundle bundle);

        @MainThread
        void onLoadFinished(@NonNull dispatchRestoreInstanceState<D> dispatchrestoreinstancestate, D d);

        @MainThread
        void onLoaderReset(@NonNull dispatchRestoreInstanceState<D> dispatchrestoreinstancestate);
    }

    @MainThread
    @NonNull
    public abstract <D> dispatchRestoreInstanceState<D> getMax(@NonNull getMax<D> getmax);

    public abstract void getMax();

    @Deprecated
    public abstract void setMin(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    @NonNull
    public static <T extends setChecked & ListMenuItemView> dispatchSubMenuSelected length(@NonNull T t) {
        return new setDefaultShowAsAction(t, ((ListMenuItemView) t).getViewModelStore());
    }
}
