package o;

import android.content.Context;
import o.b;

public final class ClientMsgReceiver implements getAdapterPosition<unRegisterAppHandler> {
    private final b.C0007b<Context> contextProvider;

    public ClientMsgReceiver(b.C0007b<Context> bVar) {
        this.contextProvider = bVar;
    }

    public final unRegisterAppHandler get() {
        return newInstance(this.contextProvider.get());
    }

    public static ClientMsgReceiver create(b.C0007b<Context> bVar) {
        return new ClientMsgReceiver(bVar);
    }

    public static unRegisterAppHandler newInstance(Context context) {
        return new unRegisterAppHandler(context);
    }
}
