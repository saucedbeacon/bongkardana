package o;

import androidx.annotation.IntRange;
import java.util.Locale;

interface VisibleForTesting {
    Object getMin();

    @IntRange(from = 0)
    int length();

    String setMin();

    Locale setMin(int i);
}
