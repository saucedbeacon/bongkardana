package com.alibaba.ariver.integration.ipc.server;

import com.alibaba.ariver.engine.api.bridge.model.SendToNativeCallback;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import o.PlaybackStateCompat;

public class e {

    /* renamed from: a  reason: collision with root package name */
    private static e f8995a;
    private static PlaybackStateCompat.ShuffleMode<Set<String>> b = new PlaybackStateCompat.ShuffleMode<>();
    private static Map<String, SendToNativeCallback> c = new HashMap();

    public static e a() {
        if (f8995a == null) {
            synchronized (e.class) {
                if (f8995a == null) {
                    f8995a = new e();
                }
            }
        }
        return f8995a;
    }

    public synchronized void a(long j, String str, SendToNativeCallback sendToNativeCallback) {
        if (sendToNativeCallback != null) {
            Set max = b.getMax(j, null);
            if (max == null) {
                max = new HashSet();
                b.setMax(j, max);
            }
            max.add(str);
            c.put(str, sendToNativeCallback);
        }
    }

    public synchronized void a(long j) {
        Set<String> max = b.getMax(j, null);
        if (max != null) {
            for (String remove : max) {
                c.remove(remove);
            }
            b.getMin(j);
        }
    }

    public synchronized SendToNativeCallback a(long j, String str, boolean z) {
        SendToNativeCallback sendToNativeCallback;
        sendToNativeCallback = c.get(str);
        if (!z) {
            c.remove(str);
            Set max = b.getMax(j, null);
            if (max != null) {
                max.remove(str);
            }
        }
        return sendToNativeCallback;
    }
}
