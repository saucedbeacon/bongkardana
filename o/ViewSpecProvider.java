package o;

import android.content.Context;
import o.b;

public final class ViewSpecProvider implements getAdapterPosition<getWidthSpec> {
    private final b.C0007b<Context> contextProvider;

    public ViewSpecProvider(b.C0007b<Context> bVar) {
        this.contextProvider = bVar;
    }

    public final getWidthSpec get() {
        return newInstance(this.contextProvider.get());
    }

    public static ViewSpecProvider create(b.C0007b<Context> bVar) {
        return new ViewSpecProvider(bVar);
    }

    public static getWidthSpec newInstance(Context context) {
        return new getWidthSpec(context);
    }
}
