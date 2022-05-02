package o;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"kotlinx/coroutines/JobKt__FutureKt", "kotlinx/coroutines/JobKt__JobKt"}, k = 4, mv = {1, 4, 2})
public final class RDSClient {
    public static final void setMin(@NotNull DictionaryKeys dictionaryKeys) {
        for (DictionaryKeys min : dictionaryKeys.values()) {
            min.getMin((CancellationException) null);
        }
    }
}
