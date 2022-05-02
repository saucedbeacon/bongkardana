package o;

import android.content.Context;
import o.b;

public final class getExitPerform implements getAdapterPosition<runExit> {
    private final b.C0007b<Context> length;

    private getExitPerform(b.C0007b<Context> bVar) {
        this.length = bVar;
    }

    public static getExitPerform getMin(b.C0007b<Context> bVar) {
        return new getExitPerform(bVar);
    }

    public final /* synthetic */ Object get() {
        return new runExit(this.length.get());
    }
}
