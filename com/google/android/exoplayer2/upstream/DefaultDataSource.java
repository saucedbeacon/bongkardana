package com.google.android.exoplayer2.upstream;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.upstream.HttpDataSource;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.Predicate;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class DefaultDataSource implements DataSource {
    private static final String SCHEME_ASSET = "asset";
    private static final String SCHEME_CONTENT = "content";
    private static final String SCHEME_RAW = "rawresource";
    private static final String SCHEME_RTMP = "rtmp";
    private static final String TAG = "DefaultDataSource";
    @Nullable
    private DataSource assetDataSource;
    private final DataSource baseDataSource;
    @Nullable
    private DataSource contentDataSource;
    private final Context context;
    @Nullable
    private DataSource dataSchemeDataSource;
    @Nullable
    private DataSource dataSource;
    @Nullable
    private DataSource fileDataSource;
    @Nullable
    private DataSource rawResourceDataSource;
    @Nullable
    private DataSource rtmpDataSource;
    private final List<TransferListener> transferListeners;

    public DefaultDataSource(Context context2, String str, boolean z) {
        this(context2, str, 8000, 8000, z);
    }

    public DefaultDataSource(Context context2, String str, int i, int i2, boolean z) {
        this(context2, new DefaultHttpDataSource(str, (Predicate<String>) null, i, i2, z, (HttpDataSource.RequestProperties) null));
    }

    public DefaultDataSource(Context context2, DataSource dataSource2) {
        this.context = context2.getApplicationContext();
        this.baseDataSource = (DataSource) Assertions.checkNotNull(dataSource2);
        this.transferListeners = new ArrayList();
    }

    @Deprecated
    public DefaultDataSource(Context context2, @Nullable TransferListener transferListener, String str, boolean z) {
        this(context2, transferListener, str, 8000, 8000, z);
    }

    @Deprecated
    public DefaultDataSource(Context context2, @Nullable TransferListener transferListener, String str, int i, int i2, boolean z) {
        this(context2, transferListener, (DataSource) new DefaultHttpDataSource(str, (Predicate<String>) null, transferListener, i, i2, z, (HttpDataSource.RequestProperties) null));
    }

    @Deprecated
    public DefaultDataSource(Context context2, @Nullable TransferListener transferListener, DataSource dataSource2) {
        this(context2, dataSource2);
        if (transferListener != null) {
            this.transferListeners.add(transferListener);
        }
    }

    public final void addTransferListener(TransferListener transferListener) {
        this.baseDataSource.addTransferListener(transferListener);
        this.transferListeners.add(transferListener);
        maybeAddListenerToDataSource(this.fileDataSource, transferListener);
        maybeAddListenerToDataSource(this.assetDataSource, transferListener);
        maybeAddListenerToDataSource(this.contentDataSource, transferListener);
        maybeAddListenerToDataSource(this.rtmpDataSource, transferListener);
        maybeAddListenerToDataSource(this.dataSchemeDataSource, transferListener);
        maybeAddListenerToDataSource(this.rawResourceDataSource, transferListener);
    }

    public final long open(DataSpec dataSpec) throws IOException {
        Assertions.checkState(this.dataSource == null);
        String scheme = dataSpec.uri.getScheme();
        if (Util.isLocalFileUri(dataSpec.uri)) {
            if (dataSpec.uri.getPath().startsWith("/android_asset/")) {
                this.dataSource = getAssetDataSource();
            } else {
                this.dataSource = getFileDataSource();
            }
        } else if (SCHEME_ASSET.equals(scheme)) {
            this.dataSource = getAssetDataSource();
        } else if ("content".equals(scheme)) {
            this.dataSource = getContentDataSource();
        } else if (SCHEME_RTMP.equals(scheme)) {
            this.dataSource = getRtmpDataSource();
        } else if ("data".equals(scheme)) {
            this.dataSource = getDataSchemeDataSource();
        } else if ("rawresource".equals(scheme)) {
            this.dataSource = getRawResourceDataSource();
        } else {
            this.dataSource = this.baseDataSource;
        }
        return this.dataSource.open(dataSpec);
    }

    public final int read(byte[] bArr, int i, int i2) throws IOException {
        return ((DataSource) Assertions.checkNotNull(this.dataSource)).read(bArr, i, i2);
    }

    @Nullable
    public final Uri getUri() {
        DataSource dataSource2 = this.dataSource;
        if (dataSource2 == null) {
            return null;
        }
        return dataSource2.getUri();
    }

    public final Map<String, List<String>> getResponseHeaders() {
        DataSource dataSource2 = this.dataSource;
        if (dataSource2 == null) {
            return default$getResponseHeaders();
        }
        return dataSource2.getResponseHeaders();
    }

    public final void close() throws IOException {
        DataSource dataSource2 = this.dataSource;
        if (dataSource2 != null) {
            try {
                dataSource2.close();
            } finally {
                this.dataSource = null;
            }
        }
    }

    private DataSource getFileDataSource() {
        if (this.fileDataSource == null) {
            FileDataSource fileDataSource2 = new FileDataSource();
            this.fileDataSource = fileDataSource2;
            addListenersToDataSource(fileDataSource2);
        }
        return this.fileDataSource;
    }

    private DataSource getAssetDataSource() {
        if (this.assetDataSource == null) {
            AssetDataSource assetDataSource2 = new AssetDataSource(this.context);
            this.assetDataSource = assetDataSource2;
            addListenersToDataSource(assetDataSource2);
        }
        return this.assetDataSource;
    }

    private DataSource getContentDataSource() {
        if (this.contentDataSource == null) {
            ContentDataSource contentDataSource2 = new ContentDataSource(this.context);
            this.contentDataSource = contentDataSource2;
            addListenersToDataSource(contentDataSource2);
        }
        return this.contentDataSource;
    }

    private DataSource getRtmpDataSource() {
        if (this.rtmpDataSource == null) {
            try {
                DataSource dataSource2 = (DataSource) Class.forName("com.google.android.exoplayer2.ext.rtmp.RtmpDataSource").getConstructor(new Class[0]).newInstance(new Object[0]);
                this.rtmpDataSource = dataSource2;
                addListenersToDataSource(dataSource2);
            } catch (ClassNotFoundException unused) {
                Log.w(TAG, "Attempting to play RTMP stream without depending on the RTMP extension");
            } catch (Exception e) {
                throw new RuntimeException("Error instantiating RTMP extension", e);
            }
            if (this.rtmpDataSource == null) {
                this.rtmpDataSource = this.baseDataSource;
            }
        }
        return this.rtmpDataSource;
    }

    private DataSource getDataSchemeDataSource() {
        if (this.dataSchemeDataSource == null) {
            DataSchemeDataSource dataSchemeDataSource2 = new DataSchemeDataSource();
            this.dataSchemeDataSource = dataSchemeDataSource2;
            addListenersToDataSource(dataSchemeDataSource2);
        }
        return this.dataSchemeDataSource;
    }

    private DataSource getRawResourceDataSource() {
        if (this.rawResourceDataSource == null) {
            RawResourceDataSource rawResourceDataSource2 = new RawResourceDataSource(this.context);
            this.rawResourceDataSource = rawResourceDataSource2;
            addListenersToDataSource(rawResourceDataSource2);
        }
        return this.rawResourceDataSource;
    }

    private void addListenersToDataSource(DataSource dataSource2) {
        for (int i = 0; i < this.transferListeners.size(); i++) {
            dataSource2.addTransferListener(this.transferListeners.get(i));
        }
    }

    private void maybeAddListenerToDataSource(@Nullable DataSource dataSource2, TransferListener transferListener) {
        if (dataSource2 != null) {
            dataSource2.addTransferListener(transferListener);
        }
    }

    public final Map<String, List<String>> default$getResponseHeaders() {
        return Collections.emptyMap();
    }
}
