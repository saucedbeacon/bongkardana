package o;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u000e\u001a\u00020\u000fH$J)\u0010\u0010\u001a\u00020\u00112!\u0010\u0012\u001a\u001d\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u00110\u0013J\b\u0010\u0018\u001a\u00020\u0019H$J+\u0010\u001a\u001a\u00020\u00112!\u0010\u0012\u001a\u001d\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\u00110\u0013H$J+\u0010\u001c\u001a\u00020\u00112!\u0010\u0012\u001a\u001d\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\u00110\u0013H$R\u001b\u0010\u0003\u001a\u00020\u00048DX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u000b\u001a\u00020\u00048DX\u0002¢\u0006\f\n\u0004\b\r\u0010\b\u001a\u0004\b\f\u0010\u0006¨\u0006\u001d"}, d2 = {"Lid/dana/lib/electronicmoney/base/AbstractElectronicmoneyRepository;", "", "()V", "ioScope", "Lkotlinx/coroutines/CoroutineScope;", "getIoScope", "()Lkotlinx/coroutines/CoroutineScope;", "ioScope$delegate", "Lkotlin/Lazy;", "job", "Lkotlinx/coroutines/CompletableJob;", "uiScope", "getUiScope", "uiScope$delegate", "check", "", "getBalance", "", "onResult", "Lkotlin/Function1;", "Lid/dana/lib/electronicmoney/entity/BalanceResult;", "Lkotlin/ParameterName;", "name", "balance", "getCardType", "", "reversal", "balanceResult", "update", "electronicmoney_release"}, k = 1, mv = {1, 4, 0})
public abstract class Mean$Arithmetic {
    @NotNull
    public final Lazy getMin = LazyKt.lazy(new setMax(this));
    public final getAD102 length = new getApkKeyHashBytes((DictionaryKeys) null);
    @NotNull
    public final Lazy setMax = LazyKt.lazy(new setMin(this));

    public static final class setMax extends Lambda implements Function0<initToken> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Mean$Arithmetic f10807a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public setMax(Mean$Arithmetic mean$Arithmetic) {
            super(0);
            this.f10807a = mean$Arithmetic;
        }

        public final Object invoke() {
            return setConfiguration.length(DeviceTokenClient.length().plus(this.f10807a.length));
        }
    }

    public static final class setMin extends Lambda implements Function0<initToken> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Mean$Arithmetic f10808a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public setMin(Mean$Arithmetic mean$Arithmetic) {
            super(0);
            this.f10808a = mean$Arithmetic;
        }

        public final Object invoke() {
            return setConfiguration.length(DeviceTokenClient.setMax().plus(this.f10808a.length));
        }
    }

    public abstract boolean getMax();

    @NotNull
    public abstract String getMin();

    public abstract void getMin(@NotNull Function1<? super ICustomTabsCallback, Unit> function1);

    public abstract void setMin(@NotNull Function1<? super ICustomTabsCallback, Unit> function1);
}
