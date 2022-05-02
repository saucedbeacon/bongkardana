package o;

import android.annotation.SuppressLint;
import com.google.android.exoplayer2.trackselection.AdaptiveTrackSelection;
import io.reactivex.internal.functions.Functions;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u001a \u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0007\u001a\u0018\u0010\u0000\u001a\u00020\u0004*\u00020\b2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\t"}, d2 = {"waitForIapConnected", "Lio/reactivex/disposables/Disposable;", "executable", "Lkotlin/Function0;", "", "waitForIapConnectedWithTimeout", "timeout", "", "Lio/reactivex/disposables/CompositeDisposable;", "app_productionRelease"}, k = 2, mv = {1, 4, 2})
@JvmName(name = "IapConnectKtx")
public final class getLeftSelectedIndex {
    @SuppressLint({"CheckResult"})
    public static final void setMin(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "executable");
        setIsRecyclable.getMax().timeout((long) AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS, TimeUnit.MILLISECONDS).onErrorReturnItem(Boolean.FALSE).first(Boolean.FALSE).setMin(new setMin(function0), Functions.IsOverlapping);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "connected", "", "kotlin.jvm.PlatformType", "accept", "(Ljava/lang/Boolean;)V"}, k = 3, mv = {1, 4, 2})
    public static final class getMin<T> implements RedDotManager<Boolean> {
        final /* synthetic */ Function0 length;

        public getMin(Function0 function0) {
            this.length = function0;
        }

        public final /* synthetic */ void accept(Object obj) {
            Boolean bool = (Boolean) obj;
            Intrinsics.checkNotNullExpressionValue(bool, "connected");
            if (bool.booleanValue()) {
                this.length.invoke();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "connected", "", "kotlin.jvm.PlatformType", "accept", "(Ljava/lang/Boolean;)V"}, k = 3, mv = {1, 4, 2})
    static final class setMin<T> implements RedDotManager<Boolean> {
        final /* synthetic */ Function0 getMin;

        setMin(Function0 function0) {
            this.getMin = function0;
        }

        public final /* synthetic */ void accept(Object obj) {
            Boolean bool = (Boolean) obj;
            Intrinsics.checkNotNullExpressionValue(bool, "connected");
            if (bool.booleanValue()) {
                this.getMin.invoke();
            }
        }
    }
}
