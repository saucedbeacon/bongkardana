package o;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;

public interface isUseOnHide<T> {

    public interface getMin<T> {
        void getMax(@Nullable T t);

        void setMax(@NonNull Exception exc);
    }

    void getMax();

    void getMin();

    void getMin(@NonNull Priority priority, @NonNull getMin<? super T> getmin);

    @NonNull
    DataSource length();

    @NonNull
    Class<T> setMax();
}
