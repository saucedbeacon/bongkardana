package o;

import o.b;

public final class sendMsgToClient implements getAdapterPosition<addAttrToClient> {
    private final b.C0007b<onRegister> length;

    private sendMsgToClient(b.C0007b<onRegister> bVar) {
        this.length = bVar;
    }

    public static sendMsgToClient setMax(b.C0007b<onRegister> bVar) {
        return new sendMsgToClient(bVar);
    }

    public final /* synthetic */ Object get() {
        return new addAttrToClient(this.length.get());
    }
}
