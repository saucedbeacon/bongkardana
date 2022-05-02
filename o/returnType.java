package o;

import id.dana.contract.user.GetBalanceModule;
import o.b;
import o.parameters;

public final class returnType implements getAdapterPosition<parameters.setMax> {
    private final b.C0007b<getThemeRes> getMin;
    private final GetBalanceModule length;

    private returnType(GetBalanceModule getBalanceModule, b.C0007b<getThemeRes> bVar) {
        this.length = getBalanceModule;
        this.getMin = bVar;
    }

    public static returnType setMax(GetBalanceModule getBalanceModule, b.C0007b<getThemeRes> bVar) {
        return new returnType(getBalanceModule, bVar);
    }

    public final /* synthetic */ Object get() {
        parameters.setMax length2 = this.length.length(this.getMin.get());
        if (length2 != null) {
            return length2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
