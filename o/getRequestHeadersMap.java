package o;

import o.b;

public final class getRequestHeadersMap implements getAdapterPosition<NetworkStream> {
    private final b.C0007b<available> length;

    private getRequestHeadersMap(b.C0007b<available> bVar) {
        this.length = bVar;
    }

    public static getRequestHeadersMap setMin(b.C0007b<available> bVar) {
        return new getRequestHeadersMap(bVar);
    }

    public final /* synthetic */ Object get() {
        return new NetworkStream(this.length.get());
    }
}
