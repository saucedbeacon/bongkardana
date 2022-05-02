package o;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

public final class Grayscale$Algorithm extends Lambda implements Function1<ICustomTabsCallback, Unit> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Mean$Arithmetic f10803a;
    public final /* synthetic */ Ref.ObjectRef b;
    public final /* synthetic */ Function1 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Grayscale$Algorithm(Mean$Arithmetic mean$Arithmetic, Ref.ObjectRef objectRef, Function1 function1) {
        super(1);
        this.f10803a = mean$Arithmetic;
        this.b = objectRef;
        this.c = function1;
    }

    public final Object invoke(Object obj) {
        T t = (ICustomTabsCallback) obj;
        Intrinsics.checkNotNullParameter(t, "it");
        Ref.ObjectRef objectRef = this.b;
        String min = this.f10803a.getMin();
        if (t != null) {
            Intrinsics.checkNotNullParameter(min, "<set-?>");
            t.getMax = min;
            Unit unit = Unit.INSTANCE;
            objectRef.element = t;
            ICustomTabsCallback iCustomTabsCallback = (ICustomTabsCallback) this.b.element;
            if (iCustomTabsCallback.equals) {
                this.f10803a.setMin(new invokeSuspend(this));
            } else {
                this.c.invoke(iCustomTabsCallback);
                this.f10803a.length.getMin((CancellationException) null);
            }
            return Unit.INSTANCE;
        }
        throw null;
    }
}
