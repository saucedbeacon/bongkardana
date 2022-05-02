package o;

import androidx.annotation.NonNull;

public interface fireTrigger<Z> {
    @NonNull
    Class<Z> getMin();

    void length();

    int setMax();

    @NonNull
    Z setMin();
}
