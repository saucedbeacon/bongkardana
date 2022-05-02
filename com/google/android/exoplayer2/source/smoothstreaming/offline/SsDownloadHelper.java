package com.google.android.exoplayer2.source.smoothstreaming.offline;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.offline.DownloadHelper;
import com.google.android.exoplayer2.offline.StreamKey;
import com.google.android.exoplayer2.offline.TrackKey;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifest;
import com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifestParser;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.ParsingLoadable;
import com.google.android.exoplayer2.util.Assertions;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public final class SsDownloadHelper extends DownloadHelper {
    private SsManifest manifest;
    private final DataSource.Factory manifestDataSourceFactory;
    private final Uri uri;

    public SsDownloadHelper(Uri uri2, DataSource.Factory factory) {
        this.uri = uri2;
        this.manifestDataSourceFactory = factory;
    }

    public final void prepareInternal() throws IOException {
        this.manifest = (SsManifest) ParsingLoadable.load(this.manifestDataSourceFactory.createDataSource(), new SsManifestParser(), this.uri, 4);
    }

    public final SsManifest getManifest() {
        Assertions.checkNotNull(this.manifest);
        return this.manifest;
    }

    public final int getPeriodCount() {
        Assertions.checkNotNull(this.manifest);
        return 1;
    }

    public final TrackGroupArray getTrackGroups(int i) {
        Assertions.checkNotNull(this.manifest);
        SsManifest.StreamElement[] streamElementArr = this.manifest.streamElements;
        TrackGroup[] trackGroupArr = new TrackGroup[streamElementArr.length];
        for (int i2 = 0; i2 < streamElementArr.length; i2++) {
            trackGroupArr[i2] = new TrackGroup(streamElementArr[i2].formats);
        }
        return new TrackGroupArray(trackGroupArr);
    }

    public final SsDownloadAction getDownloadAction(@Nullable byte[] bArr, List<TrackKey> list) {
        return SsDownloadAction.createDownloadAction(this.uri, bArr, toStreamKeys(list));
    }

    public final SsDownloadAction getRemoveAction(@Nullable byte[] bArr) {
        return SsDownloadAction.createRemoveAction(this.uri, bArr);
    }

    private static List<StreamKey> toStreamKeys(List<TrackKey> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            TrackKey trackKey = list.get(i);
            arrayList.add(new StreamKey(trackKey.groupIndex, trackKey.trackIndex));
        }
        return arrayList;
    }
}
