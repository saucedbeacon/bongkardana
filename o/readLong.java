package o;

import o.Pool;

final class readLong implements RedDotDrawable {
    private final writeShort setMax;

    public readLong(writeShort writeshort) {
        this.setMax = writeshort;
    }

    public final Object apply(Object obj) {
        return this.setMax.lambda$trackQuestUser$4((Pool.Poolable) obj);
    }
}
