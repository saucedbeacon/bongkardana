package o;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import com.alipay.imobile.network.sslpinning.api.ISSLPinningManager;
import o.b;

public final class setActionEventListener implements getAdapterPosition<appendExtraInfo> {
    private final b.C0007b<Context> contextProvider;
    private final b.C0007b<setParam> okHttpSSLPinningManagerProvider;
    private final b.C0007b<ISSLPinningManager> sslPinningManagerProvider;

    public setActionEventListener(b.C0007b<Context> bVar, b.C0007b<ISSLPinningManager> bVar2, b.C0007b<setParam> bVar3) {
        this.contextProvider = bVar;
        this.sslPinningManagerProvider = bVar2;
        this.okHttpSSLPinningManagerProvider = bVar3;
    }

    /* renamed from: get$4e7b9b4e */
    public final appendExtraInfo get() {
        return newInstance$1c578fb3(this.contextProvider.get(), this.sslPinningManagerProvider.get(), this.okHttpSSLPinningManagerProvider.get());
    }

    public static setActionEventListener create(b.C0007b<Context> bVar, b.C0007b<ISSLPinningManager> bVar2, b.C0007b<setParam> bVar3) {
        return new setActionEventListener(bVar, bVar2, bVar3);
    }

    public static appendExtraInfo newInstance$1c578fb3(Context context, ISSLPinningManager iSSLPinningManager, setParam setparam) {
        try {
            Object[] objArr = new Object[3];
            objArr[2] = setparam;
            objArr[1] = iSSLPinningManager;
            objArr[0] = context;
            return (appendExtraInfo) ((Class) setKeep.getMin(9 - View.resolveSize(0, 0), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 21, (char) View.getDefaultSize(0, 0))).getDeclaredConstructor(new Class[]{Context.class, ISSLPinningManager.class, setParam.class}).newInstance(objArr);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }
}
