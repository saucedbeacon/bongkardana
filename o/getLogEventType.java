package o;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;
import java.util.Map;

public interface getLogEventType {

    public interface setMax extends getLogEventType {
        @NonNull
        List<setMax> isInside();

        @Nullable
        setMax toIntRange();
    }

    public interface setMin extends getLogEventType {
    }

    boolean IsOverlapping();

    @NonNull
    setMax equals();

    @NonNull
    Map<String, String> getMax();

    @NonNull
    String getMin();

    boolean length();

    int setMax();

    int setMin();
}
