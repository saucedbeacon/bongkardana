package com.alibaba.griver.ui.reddot;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.alibaba.griver.ui.reddot.model.RedDotModel;
import java.util.HashMap;
import java.util.Map;

public class RedDotManager implements IRedDotManager {

    /* renamed from: a  reason: collision with root package name */
    private static IRedDotManager f10610a;
    private Map<String, RedDotModel> b = new HashMap();
    private final Object c = new Object();

    private RedDotManager() {
    }

    public static IRedDotManager getInstance() {
        if (f10610a == null) {
            synchronized (RedDotManager.class) {
                if (f10610a == null) {
                    f10610a = new RedDotManager();
                }
            }
        }
        return f10610a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003a, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void registerNode(@androidx.annotation.NonNull java.lang.String r4, @androidx.annotation.Nullable java.lang.String r5) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.c
            monitor-enter(r0)
            boolean r1 = r4.equals(r5)     // Catch:{ all -> 0x003b }
            if (r1 == 0) goto L_0x000b
            monitor-exit(r0)     // Catch:{ all -> 0x003b }
            return
        L_0x000b:
            java.util.Map<java.lang.String, com.alibaba.griver.ui.reddot.model.RedDotModel> r1 = r3.b     // Catch:{ all -> 0x003b }
            boolean r1 = r1.containsKey(r4)     // Catch:{ all -> 0x003b }
            if (r1 != 0) goto L_0x0039
            com.alibaba.griver.ui.reddot.model.RedDotModel r1 = new com.alibaba.griver.ui.reddot.model.RedDotModel     // Catch:{ all -> 0x003b }
            r1.<init>()     // Catch:{ all -> 0x003b }
            java.util.Map<java.lang.String, com.alibaba.griver.ui.reddot.model.RedDotModel> r2 = r3.b     // Catch:{ all -> 0x003b }
            r2.put(r4, r1)     // Catch:{ all -> 0x003b }
            boolean r2 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x003b }
            if (r2 != 0) goto L_0x0039
            java.util.Map<java.lang.String, com.alibaba.griver.ui.reddot.model.RedDotModel> r2 = r3.b     // Catch:{ all -> 0x003b }
            boolean r2 = r2.containsKey(r5)     // Catch:{ all -> 0x003b }
            if (r2 == 0) goto L_0x0039
            r1.setRedDotParentModelKey(r5)     // Catch:{ all -> 0x003b }
            java.util.Map<java.lang.String, com.alibaba.griver.ui.reddot.model.RedDotModel> r1 = r3.b     // Catch:{ all -> 0x003b }
            java.lang.Object r5 = r1.get(r5)     // Catch:{ all -> 0x003b }
            com.alibaba.griver.ui.reddot.model.RedDotModel r5 = (com.alibaba.griver.ui.reddot.model.RedDotModel) r5     // Catch:{ all -> 0x003b }
            r5.addChild(r4)     // Catch:{ all -> 0x003b }
        L_0x0039:
            monitor-exit(r0)     // Catch:{ all -> 0x003b }
            return
        L_0x003b:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.griver.ui.reddot.RedDotManager.registerNode(java.lang.String, java.lang.String):void");
    }

    public void removeNode(@NonNull String str) {
        synchronized (this.c) {
            if (this.b.containsKey(str)) {
                RedDotModel remove = this.b.remove(str);
                String redDotParentModelKey = remove.getRedDotParentModelKey();
                if (!TextUtils.isEmpty(redDotParentModelKey) && this.b.containsKey(redDotParentModelKey)) {
                    this.b.get(redDotParentModelKey).removeChild(str);
                }
                if (remove.childSize() != 0) {
                    for (String removeNode : remove.getChildren()) {
                        removeNode(removeNode);
                    }
                }
            }
        }
    }

    public void setStateDidChangeHandler(@NonNull String str, @NonNull OnStateChangeListener onStateChangeListener) {
        synchronized (this.c) {
            if (this.b.containsKey(str)) {
                this.b.get(str).setListener(onStateChangeListener);
            }
        }
    }

    public void removeStateDidChangeHandler(@NonNull String str) {
        synchronized (this.c) {
            if (this.b.containsKey(str)) {
                this.b.get(str).setListener((OnStateChangeListener) null);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0069, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void resetState(@androidx.annotation.NonNull java.lang.String r6, boolean r7) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.c
            monitor-enter(r0)
            java.util.Map<java.lang.String, com.alibaba.griver.ui.reddot.model.RedDotModel> r1 = r5.b     // Catch:{ all -> 0x006a }
            boolean r1 = r1.containsKey(r6)     // Catch:{ all -> 0x006a }
            if (r1 != 0) goto L_0x000d
            monitor-exit(r0)     // Catch:{ all -> 0x006a }
            return
        L_0x000d:
            java.util.Map<java.lang.String, com.alibaba.griver.ui.reddot.model.RedDotModel> r1 = r5.b     // Catch:{ all -> 0x006a }
            java.lang.Object r1 = r1.get(r6)     // Catch:{ all -> 0x006a }
            com.alibaba.griver.ui.reddot.model.RedDotModel r1 = (com.alibaba.griver.ui.reddot.model.RedDotModel) r1     // Catch:{ all -> 0x006a }
            int r2 = r1.childSize()     // Catch:{ all -> 0x006a }
            if (r2 == 0) goto L_0x003f
            r7 = 0
            java.util.Set r2 = r1.getChildren()     // Catch:{ all -> 0x006a }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x006a }
        L_0x0024:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x006a }
            if (r3 == 0) goto L_0x003f
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x006a }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x006a }
            java.util.Map<java.lang.String, com.alibaba.griver.ui.reddot.model.RedDotModel> r4 = r5.b     // Catch:{ all -> 0x006a }
            java.lang.Object r3 = r4.get(r3)     // Catch:{ all -> 0x006a }
            com.alibaba.griver.ui.reddot.model.RedDotModel r3 = (com.alibaba.griver.ui.reddot.model.RedDotModel) r3     // Catch:{ all -> 0x006a }
            boolean r3 = r3.isShow()     // Catch:{ all -> 0x006a }
            if (r3 == 0) goto L_0x0024
            r7 = 1
        L_0x003f:
            r1.setShow(r7)     // Catch:{ all -> 0x006a }
            com.alibaba.griver.ui.reddot.OnStateChangeListener r7 = r1.getListener()     // Catch:{ all -> 0x006a }
            if (r7 == 0) goto L_0x0053
            com.alibaba.griver.ui.reddot.OnStateChangeListener r7 = r1.getListener()     // Catch:{ all -> 0x006a }
            boolean r2 = r1.isShow()     // Catch:{ all -> 0x006a }
            r7.onStateChange(r6, r2)     // Catch:{ all -> 0x006a }
        L_0x0053:
            java.lang.String r6 = r1.getRedDotParentModelKey()     // Catch:{ all -> 0x006a }
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x006a }
            if (r6 != 0) goto L_0x0068
            java.lang.String r6 = r1.getRedDotParentModelKey()     // Catch:{ all -> 0x006a }
            boolean r7 = r1.isShow()     // Catch:{ all -> 0x006a }
            r5.resetState(r6, r7)     // Catch:{ all -> 0x006a }
        L_0x0068:
            monitor-exit(r0)     // Catch:{ all -> 0x006a }
            return
        L_0x006a:
            r6 = move-exception
            monitor-exit(r0)
            goto L_0x006e
        L_0x006d:
            throw r6
        L_0x006e:
            goto L_0x006d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.griver.ui.reddot.RedDotManager.resetState(java.lang.String, boolean):void");
    }
}
