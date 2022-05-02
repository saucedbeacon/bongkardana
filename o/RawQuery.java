package o;

import butterknife.Unbinder;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, d2 = {"tryUnbind", "", "Lbutterknife/Unbinder;", "finalAction", "Ljava/lang/Runnable;", "app_productionRelease"}, k = 2, mv = {1, 4, 2})
@JvmName(name = "UnbinderKtx")
public final class RawQuery {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 4, 2})
    public static final class length implements Runnable {
        public static final length getMin = new length();

        length() {
        }

        public final void run() {
        }
    }

    @JvmOverloads
    public static final void getMax(@Nullable Unbinder unbinder, @NotNull Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "finalAction");
        if (unbinder != null) {
            try {
                unbinder.setMax();
            } catch (IllegalStateException unused) {
            } finally {
                runnable.run();
            }
        }
    }
}
