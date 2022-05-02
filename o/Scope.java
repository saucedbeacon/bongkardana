package o;

public final class Scope implements getAdapterPosition<ValueStore> {

    static final class setMax {
        /* access modifiers changed from: private */
        public static final Scope getMax = new Scope();
    }

    public final ValueStore get() {
        return newInstance();
    }

    public static Scope create() {
        return setMax.getMax;
    }

    public static ValueStore newInstance() {
        return new ValueStore();
    }
}
