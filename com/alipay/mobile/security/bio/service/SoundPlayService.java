package com.alipay.mobile.security.bio.service;

import android.content.Context;

public abstract class SoundPlayService extends BioService {
    public abstract void init(Context context, boolean z);

    public abstract boolean isInitialized();

    public abstract void play(String str);

    public abstract void release();

    public abstract void stop();
}
