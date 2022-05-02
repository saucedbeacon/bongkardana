package io.split.android.client.service.workmanager;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.google.common.base.Preconditions;
import io.split.android.client.metrics.DTOMetrics;
import io.split.android.client.network.HttpClient;
import io.split.android.client.service.executor.SplitTask;
import io.split.android.client.storage.db.SplitRoomDatabase;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.concurrent.TimeUnit;
import o.b;
import o.putByteArray;
import o.putByteArrayDDp;
import o.putByteArrayDDpEx;
import o.removeFloat;
import o.showCenterToast;
import o.updateAppearance;

public abstract class SplitWorker extends Worker {
    private final long mCacheExpirationInSeconds;
    private final SplitRoomDatabase mDatabase;
    private final String mEndpoint;
    private final HttpClient mHttpClient;
    private final b.a mMetrics;
    private final showCenterToast mNetworkHelper;
    protected SplitTask mSplitTask;

    public SplitWorker(@NonNull Context context, @NonNull WorkerParameters workerParameters) {
        super(context, workerParameters);
        String str;
        String str2;
        String str3;
        String str4;
        updateAppearance updateappearance = workerParameters.setMax;
        Object obj = updateappearance.setMin.get("databaseName");
        removeFloat removefloat = null;
        if (obj instanceof String) {
            str = (String) obj;
        } else {
            str = null;
        }
        Object obj2 = updateappearance.setMin.get("apiKey");
        if (obj2 instanceof String) {
            str2 = (String) obj2;
        } else {
            str2 = null;
        }
        Object obj3 = updateappearance.setMin.get("endpoint");
        if (obj3 instanceof String) {
            str3 = (String) obj3;
        } else {
            str3 = null;
        }
        this.mEndpoint = str3;
        Object obj4 = updateappearance.setMin.get("eventsEndpoint");
        if (obj4 instanceof String) {
            str4 = (String) obj4;
        } else {
            str4 = null;
        }
        this.mDatabase = SplitRoomDatabase.getDatabase(context, str);
        Object obj5 = updateappearance.setMin.get("splitCacheExpiration");
        this.mCacheExpirationInSeconds = obj5 instanceof Long ? ((Long) obj5).longValue() : 864000;
        putByteArrayDDpEx putbytearrayddpex = new putByteArrayDDpEx();
        putbytearrayddpex.setClientVersion("2.7.2");
        putbytearrayddpex.setApiToken(str2);
        putbytearrayddpex.addJsonTypeHeaders();
        HttpClient build = new putByteArrayDDp.getMax().build();
        this.mHttpClient = build;
        build.addHeaders(putbytearrayddpex.build());
        this.mNetworkHelper = new showCenterToast();
        try {
            removefloat = removeFloat.create(this.mHttpClient, URI.create(str4));
        } catch (URISyntaxException unused) {
        }
        this.mMetrics = new putByteArray((DTOMetrics) removefloat, TimeUnit.SECONDS.toMillis(1));
    }

    @NonNull
    public ListenableWorker.setMax doWork() {
        Preconditions.checkNotNull(this.mSplitTask);
        this.mSplitTask.execute();
        return ListenableWorker.setMax.getMin();
    }

    /* access modifiers changed from: protected */
    public SplitRoomDatabase getDatabase() {
        return this.mDatabase;
    }

    public HttpClient getHttpClient() {
        return this.mHttpClient;
    }

    public showCenterToast getNetworkHelper() {
        return this.mNetworkHelper;
    }

    public String getEndPoint() {
        return this.mEndpoint;
    }

    public b.a getMetrics() {
        return this.mMetrics;
    }

    public long getCacheExpirationInSeconds() {
        return this.mCacheExpirationInSeconds;
    }
}
