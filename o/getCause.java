package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class getCause extends Lambda implements Function1<ICustomTabsCallback, Unit> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Function1 f10818a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public getCause(Function1 function1) {
        super(1);
        this.f10818a = function1;
    }

    public final Object invoke(Object obj) {
        ICustomTabsCallback iCustomTabsCallback = (ICustomTabsCallback) obj;
        Intrinsics.checkNotNullParameter(iCustomTabsCallback, "it");
        this.f10818a.invoke(iCustomTabsCallback);
        return Unit.INSTANCE;
    }
}
