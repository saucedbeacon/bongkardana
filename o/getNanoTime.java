package o;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.HttpException;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import o.isUseOnHide;

public final class getNanoTime implements isUseOnHide<InputStream> {
    @VisibleForTesting
    static final length setMin = new setMin();
    private InputStream IsOverlapping;
    private final int getMax;
    private HttpURLConnection getMin;
    private volatile boolean isInside;
    private final length length;
    private final access$1400 setMax;

    interface length {
        HttpURLConnection length(URL url) throws IOException;
    }

    public getNanoTime(access$1400 access_1400, int i) {
        this(access_1400, i, setMin);
    }

    @VisibleForTesting
    private getNanoTime(access$1400 access_1400, int i, length length2) {
        this.setMax = access_1400;
        this.getMax = i;
        this.length = length2;
    }

    public final void getMin(@NonNull Priority priority, @NonNull isUseOnHide.getMin<? super InputStream> getmin) {
        long max = getDependencySortedChildren.setMax();
        try {
            access$1400 access_1400 = this.setMax;
            if (access_1400.toIntRange == null) {
                if (TextUtils.isEmpty(access_1400.setMax)) {
                    String str = access_1400.getMin;
                    if (TextUtils.isEmpty(str)) {
                        URL url = access_1400.getMax;
                        if (url != null) {
                            str = url.toString();
                        } else {
                            throw new NullPointerException("Argument must not be null");
                        }
                    }
                    access_1400.setMax = Uri.encode(str, "@#&=*+-_.,:!?()/~'%;$");
                }
                access_1400.toIntRange = new URL(access_1400.setMax);
            }
            getmin.getMax(setMax(access_1400.toIntRange, 0, (URL) null, this.setMax.length.getMin()));
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                getDependencySortedChildren.length(max);
            }
        } catch (IOException e) {
            getmin.setMax(e);
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                getDependencySortedChildren.length(max);
            }
        } catch (Throwable th) {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                getDependencySortedChildren.length(max);
            }
            throw th;
        }
    }

    private InputStream setMax(URL url, int i, URL url2, Map<String, String> map) throws IOException {
        while (i < 5) {
            if (url2 != null) {
                try {
                    if (url.toURI().equals(url2.toURI())) {
                        throw new HttpException("In re-direct loop");
                    }
                } catch (URISyntaxException unused) {
                }
            }
            this.getMin = this.length.length(url);
            for (Map.Entry next : map.entrySet()) {
                this.getMin.addRequestProperty((String) next.getKey(), (String) next.getValue());
            }
            this.getMin.setConnectTimeout(this.getMax);
            this.getMin.setReadTimeout(this.getMax);
            this.getMin.setUseCaches(false);
            this.getMin.setDoInput(true);
            this.getMin.setInstanceFollowRedirects(false);
            this.getMin.connect();
            this.IsOverlapping = this.getMin.getInputStream();
            if (this.isInside) {
                return null;
            }
            int responseCode = this.getMin.getResponseCode();
            if (setMin(responseCode)) {
                HttpURLConnection httpURLConnection = this.getMin;
                if (TextUtils.isEmpty(httpURLConnection.getContentEncoding())) {
                    this.IsOverlapping = new setInsetOffsetX(httpURLConnection.getInputStream(), (long) httpURLConnection.getContentLength());
                } else {
                    if (Log.isLoggable("HttpUrlFetcher", 3)) {
                        httpURLConnection.getContentEncoding();
                    }
                    this.IsOverlapping = httpURLConnection.getInputStream();
                }
                return this.IsOverlapping;
            } else if (length(responseCode)) {
                String headerField = this.getMin.getHeaderField("Location");
                if (!TextUtils.isEmpty(headerField)) {
                    URL url3 = new URL(url, headerField);
                    getMin();
                    i++;
                    url2 = url;
                    url = url3;
                } else {
                    throw new HttpException("Received empty or null redirect url");
                }
            } else if (responseCode == -1) {
                throw new HttpException(responseCode);
            } else {
                throw new HttpException(this.getMin.getResponseMessage(), responseCode);
            }
        }
        throw new HttpException("Too many (> 5) redirects!");
    }

    private static boolean setMin(int i) {
        return i / 100 == 2;
    }

    private static boolean length(int i) {
        return i / 100 == 3;
    }

    public final void getMin() {
        InputStream inputStream = this.IsOverlapping;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.getMin;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.getMin = null;
    }

    public final void getMax() {
        this.isInside = true;
    }

    @NonNull
    public final Class<InputStream> setMax() {
        return InputStream.class;
    }

    @NonNull
    public final DataSource length() {
        return DataSource.REMOTE;
    }

    static class setMin implements length {
        setMin() {
        }

        public final HttpURLConnection length(URL url) throws IOException {
            return (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection()));
        }
    }
}
