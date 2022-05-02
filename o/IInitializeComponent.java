package o;

import androidx.annotation.NonNull;
import com.google.common.base.Preconditions;
import io.split.android.client.network.HttpClient;
import io.split.android.client.network.HttpMethod;
import io.split.android.client.network.HttpResponse;
import io.split.android.client.service.executor.SplitTask;
import io.split.android.client.service.executor.SplitTaskType;
import io.split.android.client.service.http.HttpRecorder;
import io.split.android.client.service.http.HttpRecorderException;
import io.split.android.client.service.http.HttpRequestBodySerializer;
import io.split.android.client.storage.events.PersistentEventsStorage;
import io.split.android.client.storage.impressions.PersistentImpressionsStorage;
import java.net.URI;

public class IInitializeComponent implements SplitTask {
    private final PersistentEventsStorage mEventsStorage;
    private final PersistentImpressionsStorage mImpressionsStorage;
    private final long mMaxTimestamp;

    public class IInitFinishListener {
        private final int eventsPerPush;

        public IInitFinishListener(int i) {
            this.eventsPerPush = i;
        }

        public int getEventsPerPush() {
            return this.eventsPerPush;
        }
    }

    public IInitializeComponent(PersistentEventsStorage persistentEventsStorage, PersistentImpressionsStorage persistentImpressionsStorage, long j) {
        this.mEventsStorage = (PersistentEventsStorage) Preconditions.checkNotNull(persistentEventsStorage);
        this.mImpressionsStorage = (PersistentImpressionsStorage) Preconditions.checkNotNull(persistentImpressionsStorage);
        this.mMaxTimestamp = j;
    }

    public final class IInitFinishListenerV2<T> implements HttpRecorder<T> {
        private final HttpClient mClient;
        private final showCenterToast mNetworkHelper;
        private HttpRequestBodySerializer<T> mRequestSerializer;
        private final URI mTarget;

        public IInitFinishListenerV2(@NonNull HttpClient httpClient, @NonNull URI uri, @NonNull showCenterToast showcentertoast, @NonNull HttpRequestBodySerializer<T> httpRequestBodySerializer) {
            this.mClient = (HttpClient) Preconditions.checkNotNull(httpClient);
            this.mTarget = (URI) Preconditions.checkNotNull(uri);
            this.mNetworkHelper = (showCenterToast) Preconditions.checkNotNull(showcentertoast);
            this.mRequestSerializer = (HttpRequestBodySerializer) Preconditions.checkNotNull(httpRequestBodySerializer);
        }

        public final void execute(@NonNull T t) throws HttpRecorderException {
            Preconditions.checkNotNull(t);
            String serialize = this.mRequestSerializer.serialize(t);
            try {
                if (this.mNetworkHelper.isReachable(this.mTarget)) {
                    HttpResponse execute = this.mClient.request(this.mTarget, HttpMethod.POST, serialize).execute();
                    if (!execute.isSuccess()) {
                        StringBuilder sb = new StringBuilder("http return code ");
                        sb.append(execute.getHttpStatus());
                        throw new IllegalStateException(sb.toString());
                    }
                    return;
                }
                throw new IllegalStateException("Source not reachable");
            } catch (Exception e) {
                throw new HttpRecorderException(this.mTarget.toString(), e.getLocalizedMessage());
            }
        }
    }

    @NonNull
    public loadLibrarySync execute() {
        this.mEventsStorage.deleteInvalid(this.mMaxTimestamp);
        this.mImpressionsStorage.deleteInvalid(this.mMaxTimestamp);
        return loadLibrarySync.error(SplitTaskType.CLEAN_UP_DATABASE);
    }
}
