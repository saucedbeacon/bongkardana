package com.facebook.stetho.inspector.network;

import android.content.Context;
import com.facebook.stetho.common.Util;
import com.facebook.stetho.inspector.helper.ChromePeerManager;
import com.facebook.stetho.inspector.helper.PeersRegisteredListener;
import javax.annotation.Nullable;

public class NetworkPeerManager extends ChromePeerManager {
    private static NetworkPeerManager sInstance;
    /* access modifiers changed from: private */
    public AsyncPrettyPrinterRegistry mAsyncPrettyPrinterRegistry;
    /* access modifiers changed from: private */
    public AsyncPrettyPrinterInitializer mPrettyPrinterInitializer;
    /* access modifiers changed from: private */
    public final ResponseBodyFileManager mResponseBodyFileManager;
    private final PeersRegisteredListener mTempFileCleanup;

    @Nullable
    public static synchronized NetworkPeerManager getInstanceOrNull() {
        NetworkPeerManager networkPeerManager;
        synchronized (NetworkPeerManager.class) {
            networkPeerManager = sInstance;
        }
        return networkPeerManager;
    }

    public static synchronized NetworkPeerManager getOrCreateInstance(Context context) {
        NetworkPeerManager networkPeerManager;
        synchronized (NetworkPeerManager.class) {
            if (sInstance == null) {
                sInstance = new NetworkPeerManager(new ResponseBodyFileManager(context.getApplicationContext()));
            }
            networkPeerManager = sInstance;
        }
        return networkPeerManager;
    }

    public NetworkPeerManager(ResponseBodyFileManager responseBodyFileManager) {
        AnonymousClass1 r0 = new PeersRegisteredListener() {
            public void onFirstPeerRegistered() {
                AsyncPrettyPrinterExecutorHolder.ensureInitialized();
                if (NetworkPeerManager.this.mAsyncPrettyPrinterRegistry == null && NetworkPeerManager.this.mPrettyPrinterInitializer != null) {
                    AsyncPrettyPrinterRegistry unused = NetworkPeerManager.this.mAsyncPrettyPrinterRegistry = new AsyncPrettyPrinterRegistry();
                    NetworkPeerManager.this.mPrettyPrinterInitializer.populatePrettyPrinters(NetworkPeerManager.this.mAsyncPrettyPrinterRegistry);
                }
                NetworkPeerManager.this.mResponseBodyFileManager.cleanupFiles();
            }

            public void onLastPeerUnregistered() {
                NetworkPeerManager.this.mResponseBodyFileManager.cleanupFiles();
                AsyncPrettyPrinterExecutorHolder.shutdown();
            }
        };
        this.mTempFileCleanup = r0;
        this.mResponseBodyFileManager = responseBodyFileManager;
        setListener(r0);
    }

    public ResponseBodyFileManager getResponseBodyFileManager() {
        return this.mResponseBodyFileManager;
    }

    @Nullable
    public AsyncPrettyPrinterRegistry getAsyncPrettyPrinterRegistry() {
        return this.mAsyncPrettyPrinterRegistry;
    }

    public void setPrettyPrinterInitializer(AsyncPrettyPrinterInitializer asyncPrettyPrinterInitializer) {
        Util.throwIfNotNull(this.mPrettyPrinterInitializer);
        this.mPrettyPrinterInitializer = (AsyncPrettyPrinterInitializer) Util.throwIfNull(asyncPrettyPrinterInitializer);
    }
}
