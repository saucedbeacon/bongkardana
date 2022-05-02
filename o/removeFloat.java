package o;

import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import io.split.android.client.dtos.Counter;
import io.split.android.client.dtos.Latency;
import io.split.android.client.metrics.DTOMetrics;
import io.split.android.client.network.HttpClient;
import io.split.android.client.network.HttpMethod;
import io.split.android.client.network.HttpResponse;
import java.net.URI;
import java.net.URISyntaxException;
import o.b;

public class removeFloat implements b.a, DTOMetrics {
    private final HttpClient _client;
    private final URI _target;

    public static removeFloat create(HttpClient httpClient, URI uri) throws URISyntaxException {
        return new removeFloat(httpClient, uri);
    }

    private removeFloat(HttpClient httpClient, URI uri) {
        this._client = (HttpClient) Preconditions.checkNotNull(httpClient);
        this._target = (URI) Preconditions.checkNotNull(uri);
    }

    public void time(Latency latency) {
        if (!latency.latencies.isEmpty()) {
            try {
                post(new getByteArrayDDpEx(this._target, "/metrics/time").build(), latency);
            } catch (Throwable th) {
                createLoadingDialog.e(th, "Exception when posting metric %s", latency);
            }
        }
    }

    public void count(Counter counter) {
        try {
            post(new getByteArrayDDpEx(this._target, "/metrics/counter").build(), counter);
        } catch (Throwable th) {
            createLoadingDialog.e(th, "Exception when posting metric %s", counter);
        }
    }

    private void post(URI uri, Object obj) {
        try {
            HttpResponse execute = this._client.request(uri, HttpMethod.POST, IUMIDInitListenerEx.toJson(obj)).execute();
            if (!execute.isSuccess()) {
                createLoadingDialog.w("Response status was: %d", Integer.valueOf(execute.getHttpStatus()));
            }
        } catch (Throwable th) {
            createLoadingDialog.e(th, "Exception when posting metrics", new Object[0]);
        }
    }

    public void count(String str, long j) {
        try {
            Counter counter = new Counter();
            counter.name = str;
            counter.delta = j;
            count(counter);
        } catch (Throwable th) {
            createLoadingDialog.e(th, "Could not count metric %s", str);
        }
    }

    public void time(String str, long j) {
        try {
            Latency latency = new Latency();
            latency.name = str;
            latency.latencies = Lists.newArrayList((E[]) new Long[]{Long.valueOf(j)});
            time(latency);
        } catch (Throwable th) {
            createLoadingDialog.e(th, "Could not time metric %s", str);
        }
    }
}
