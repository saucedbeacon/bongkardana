package com.alipay.imobile.network.quake.transport.strategy;

import com.alipay.mobile.common.rpc.RpcException;

public class DefaultRetryPolicy implements RetryPolicy {
    public static final float DEFAULT_BACKOFF_MULT = 1.0f;
    public static final int DEFAULT_MAX_RETRIES = 0;
    public static final int DEFAULT_TIMEOUT_MS = 10000;

    /* renamed from: a  reason: collision with root package name */
    private int f9390a;
    private int b;
    private final int c;
    private final float d;

    public DefaultRetryPolicy() {
        this(10000, 0, 1.0f);
    }

    public DefaultRetryPolicy(int i, int i2, float f) {
        this.f9390a = i;
        this.c = i2;
        this.d = f;
    }

    public float getBackoffMultiplier() {
        return this.d;
    }

    public int getCurrentRetryCount() {
        return this.b;
    }

    public int getCurrentTimeout() {
        return this.f9390a;
    }

    /* access modifiers changed from: protected */
    public boolean hasAttemptRemaining() {
        return this.b <= this.c;
    }

    public void retry(RpcException rpcException) throws RpcException {
        this.b++;
        int i = this.f9390a;
        this.f9390a = (int) (((float) i) + (((float) i) * this.d));
        if (!hasAttemptRemaining()) {
            throw rpcException;
        }
    }
}
