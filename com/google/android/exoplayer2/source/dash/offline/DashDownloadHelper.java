package com.google.android.exoplayer2.source.dash.offline;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.offline.DownloadHelper;
import com.google.android.exoplayer2.offline.StreamKey;
import com.google.android.exoplayer2.offline.TrackKey;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.source.dash.manifest.AdaptationSet;
import com.google.android.exoplayer2.source.dash.manifest.DashManifest;
import com.google.android.exoplayer2.source.dash.manifest.DashManifestParser;
import com.google.android.exoplayer2.source.dash.manifest.Representation;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.ParsingLoadable;
import com.google.android.exoplayer2.util.Assertions;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public final class DashDownloadHelper extends DownloadHelper {
    private DashManifest manifest;
    private final DataSource.Factory manifestDataSourceFactory;
    private final Uri uri;

    public DashDownloadHelper(Uri uri2, DataSource.Factory factory) {
        this.uri = uri2;
        this.manifestDataSourceFactory = factory;
    }

    public final void prepareInternal() throws IOException {
        this.manifest = (DashManifest) ParsingLoadable.load(this.manifestDataSourceFactory.createDataSource(), new DashManifestParser(), this.uri, 4);
    }

    public final DashManifest getManifest() {
        Assertions.checkNotNull(this.manifest);
        return this.manifest;
    }

    public final int getPeriodCount() {
        Assertions.checkNotNull(this.manifest);
        return this.manifest.getPeriodCount();
    }

    public final TrackGroupArray getTrackGroups(int i) {
        Assertions.checkNotNull(this.manifest);
        List<AdaptationSet> list = this.manifest.getPeriod(i).adaptationSets;
        int size = list.size();
        TrackGroup[] trackGroupArr = new TrackGroup[size];
        for (int i2 = 0; i2 < size; i2++) {
            List<Representation> list2 = list.get(i2).representations;
            Format[] formatArr = new Format[list2.size()];
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                formatArr[i3] = list2.get(i3).format;
            }
            trackGroupArr[i2] = new TrackGroup(formatArr);
        }
        return new TrackGroupArray(trackGroupArr);
    }

    public final DashDownloadAction getDownloadAction(@Nullable byte[] bArr, List<TrackKey> list) {
        return DashDownloadAction.createDownloadAction(this.uri, bArr, toStreamKeys(list));
    }

    public final DashDownloadAction getRemoveAction(@Nullable byte[] bArr) {
        return DashDownloadAction.createRemoveAction(this.uri, bArr);
    }

    private static List<StreamKey> toStreamKeys(List<TrackKey> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            TrackKey trackKey = list.get(i);
            arrayList.add(new StreamKey(trackKey.periodIndex, trackKey.groupIndex, trackKey.trackIndex));
        }
        return arrayList;
    }
}
