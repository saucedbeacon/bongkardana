package com.alibaba.griver.ui.popmenu;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class TinyAppActionStateController {

    /* renamed from: a  reason: collision with root package name */
    private static final String[] f10591a = {TinyAppActionState.ACTION_BLUE_TOOTH, "location", TinyAppActionState.ACTION_RECORD};
    private final List<WeakReference<TinyAppActionStateListener>> b = new ArrayList();
    private final List<TinyAppActionState> c = new LinkedList();
    private final Object d = new Object();

    public void setStateOn(String str, String str2) {
        a(str, str2, 1);
    }

    public void setStateOff(String str, String str2) {
        a(str, str2, 0);
    }

    public void removeAction(String str) {
        synchronized (this.d) {
            Iterator<TinyAppActionState> it = this.c.iterator();
            while (it.hasNext()) {
                TinyAppActionState next = it.next();
                if (next != null && TextUtils.equals(str, next.getAction())) {
                    it.remove();
                }
            }
        }
        a();
    }

    private void a(String str, String str2, int i) {
        if (a(str)) {
            StringBuilder sb = new StringBuilder("setStateInner action[");
            sb.append(str);
            sb.append("] type[");
            sb.append(str2);
            sb.append("] state ");
            sb.append(i);
            RVLogger.d("TinyAppActionStateContr", sb.toString());
            synchronized (this.d) {
                int i2 = 0;
                TinyAppActionState tinyAppActionState = null;
                while (true) {
                    if (i2 >= this.c.size()) {
                        break;
                    }
                    TinyAppActionState tinyAppActionState2 = this.c.get(i2);
                    if (TextUtils.equals(tinyAppActionState2.getAction(), str)) {
                        tinyAppActionState = tinyAppActionState2;
                        break;
                    }
                    i2++;
                }
                if (i == 1) {
                    if (tinyAppActionState == null) {
                        i2 = this.c.size();
                        tinyAppActionState = b(str);
                        this.c.add(tinyAppActionState);
                    }
                    a(tinyAppActionState, i2, str2);
                } else if (i == 0) {
                    a(tinyAppActionState, str2);
                }
            }
        }
    }

    private void a(TinyAppActionState tinyAppActionState, int i, String str) {
        StringBuilder sb = new StringBuilder("handleStateIncreaseCount before action ");
        sb.append(tinyAppActionState.getAction());
        sb.append(" count ");
        sb.append(tinyAppActionState.getCount());
        sb.append(" type ");
        sb.append(str);
        RVLogger.d("TinyAppActionStateContr", sb.toString());
        tinyAppActionState.increaseCount(str);
        if (i != 0) {
            List<TinyAppActionState> list = this.c;
            list.add(0, list.remove(i));
        }
        if (tinyAppActionState.getCount() == 1) {
            a();
        }
        StringBuilder sb2 = new StringBuilder("handleStateIncreaseCount after action ");
        sb2.append(tinyAppActionState.getAction());
        sb2.append(" count ");
        sb2.append(tinyAppActionState.getCount());
        sb2.append(" type ");
        sb2.append(str);
        RVLogger.d("TinyAppActionStateContr", sb2.toString());
    }

    private void a(TinyAppActionState tinyAppActionState, String str) {
        if (tinyAppActionState != null) {
            StringBuilder sb = new StringBuilder("handleStateDecreaseCount before action ");
            sb.append(tinyAppActionState.getAction());
            sb.append(" count ");
            sb.append(tinyAppActionState.getCount());
            sb.append(" type ");
            sb.append(str);
            RVLogger.d("TinyAppActionStateContr", sb.toString());
            if (tinyAppActionState.getCount() > 0) {
                tinyAppActionState.decreaseCount(str);
                if (tinyAppActionState.getCount() == 0) {
                    this.c.remove(tinyAppActionState);
                    a();
                }
                StringBuilder sb2 = new StringBuilder("handleStateDecreaseCount after action ");
                sb2.append(tinyAppActionState.getAction());
                sb2.append(" count ");
                sb2.append(tinyAppActionState.getCount());
                sb2.append(" type ");
                sb2.append(str);
                RVLogger.d("TinyAppActionStateContr", sb2.toString());
            }
        }
    }

    private boolean a(String str) {
        for (String equals : f10591a) {
            if (equals.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public synchronized void registerListener(TinyAppActionStateListener tinyAppActionStateListener) {
        if (tinyAppActionStateListener != null) {
            this.b.add(new WeakReference(tinyAppActionStateListener));
            tinyAppActionStateListener.onStateChanged(getCurrentState());
        }
    }

    private synchronized void a() {
        Iterator<WeakReference<TinyAppActionStateListener>> it = this.b.iterator();
        TinyAppActionState currentState = getCurrentState();
        RVLogger.d("TinyAppActionStateContr", "notifyStateChanged  currentState: ".concat(String.valueOf(currentState)));
        while (it.hasNext()) {
            TinyAppActionStateListener tinyAppActionStateListener = (TinyAppActionStateListener) it.next().get();
            if (tinyAppActionStateListener != null) {
                tinyAppActionStateListener.onStateChanged(currentState);
            } else {
                it.remove();
            }
        }
    }

    @Nullable
    public TinyAppActionState getCurrentState() {
        if (this.c.size() > 0) {
            return this.c.get(0);
        }
        return null;
    }

    public void destroy() {
        this.c.clear();
        this.b.clear();
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x003d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.alibaba.griver.ui.popmenu.TinyAppActionState b(java.lang.String r5) {
        /*
            r4 = this;
            int r0 = r5.hashCode()
            r1 = -934908847(0xffffffffc8466c51, float:-203185.27)
            r2 = 1
            r3 = 0
            if (r0 == r1) goto L_0x002a
            r1 = 1901043637(0x714f9fb5, float:1.0281035E30)
            if (r0 == r1) goto L_0x0020
            r1 = 1968882350(0x755ac2ae, float:2.7731184E32)
            if (r0 == r1) goto L_0x0016
            goto L_0x0034
        L_0x0016:
            java.lang.String r0 = "bluetooth"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0034
            r0 = 0
            goto L_0x0035
        L_0x0020:
            java.lang.String r0 = "location"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0034
            r0 = 1
            goto L_0x0035
        L_0x002a:
            java.lang.String r0 = "record"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0034
            r0 = 2
            goto L_0x0035
        L_0x0034:
            r0 = -1
        L_0x0035:
            if (r0 == 0) goto L_0x003d
            com.alibaba.griver.ui.popmenu.TinyAppActionState r0 = new com.alibaba.griver.ui.popmenu.TinyAppActionState
            r0.<init>(r5, r2)
            return r0
        L_0x003d:
            com.alibaba.griver.ui.popmenu.TinyAppActionState r0 = new com.alibaba.griver.ui.popmenu.TinyAppActionState
            r0.<init>(r5, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.griver.ui.popmenu.TinyAppActionStateController.b(java.lang.String):com.alibaba.griver.ui.popmenu.TinyAppActionState");
    }
}
