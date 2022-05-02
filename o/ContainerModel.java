package o;

import android.content.Context;
import o.b;

public final class ContainerModel implements getAdapterPosition<setLaunchParams> {
    private final b.C0007b<Context> contextProvider;

    public ContainerModel(b.C0007b<Context> bVar) {
        this.contextProvider = bVar;
    }

    public final setLaunchParams get() {
        return newInstance(this.contextProvider.get());
    }

    public static ContainerModel create(b.C0007b<Context> bVar) {
        return new ContainerModel(bVar);
    }

    public static setLaunchParams newInstance(Context context) {
        return new setLaunchParams(context);
    }
}
