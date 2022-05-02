package o;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public final class LogEvent {
    @Nullable
    public static String getMin(@NonNull getLogEventType getlogeventtype) {
        String min = getlogeventtype.getMin();
        if (TtmlNode.TAG_BR.equals(min)) {
            return "\n";
        }
        if (!"img".equals(min)) {
            return null;
        }
        String str = getlogeventtype.getMax().get("alt");
        return (str == null || str.length() == 0) ? "￼" : str;
    }
}
