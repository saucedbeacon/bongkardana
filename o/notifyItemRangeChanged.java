package o;

import android.util.Base64;
import com.twilio.security.logger.Level;
import java.security.MessageDigest;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¨\u0006\u0003"}, d2 = {"generateKeyDigest", "", "key", "security_release"}, k = 2, mv = {1, 1, 16})
public final class notifyItemRangeChanged {
    @NotNull
    public static final String setMax(@NotNull String str) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        onAttachedToRecyclerView onattachedtorecyclerview = onAttachedToRecyclerView.setMax;
        onAttachedToRecyclerView.getMin(Level.Debug, "Generating key digest for ".concat(String.valueOf(str)));
        MessageDigest instance = MessageDigest.getInstance("SHA-256");
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkExpressionValueIsNotNull(bytes, "(this as java.lang.String).getBytes(charset)");
        String encodeToString = Base64.encodeToString(instance.digest(bytes), 0);
        onAttachedToRecyclerView onattachedtorecyclerview2 = onAttachedToRecyclerView.setMax;
        Level level = Level.Debug;
        StringBuilder sb = new StringBuilder("Generated key digest for ");
        sb.append(str);
        sb.append(": ");
        sb.append(encodeToString);
        onAttachedToRecyclerView.getMin(level, sb.toString());
        Intrinsics.checkExpressionValueIsNotNull(encodeToString, "Base64.encodeToString(me… digest for $key: $it\") }");
        return encodeToString;
    }
}
