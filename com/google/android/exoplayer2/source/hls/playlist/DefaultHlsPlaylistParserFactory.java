package com.google.android.exoplayer2.source.hls.playlist;

import com.google.android.exoplayer2.offline.FilteringManifestParser;
import com.google.android.exoplayer2.offline.StreamKey;
import com.google.android.exoplayer2.upstream.ParsingLoadable;
import java.util.Collections;
import java.util.List;

public final class DefaultHlsPlaylistParserFactory implements HlsPlaylistParserFactory {
    private final List<StreamKey> streamKeys;

    public DefaultHlsPlaylistParserFactory() {
        this(Collections.emptyList());
    }

    public DefaultHlsPlaylistParserFactory(List<StreamKey> list) {
        this.streamKeys = list;
    }

    public final ParsingLoadable.Parser<HlsPlaylist> createPlaylistParser() {
        return new FilteringManifestParser(new HlsPlaylistParser(), this.streamKeys);
    }

    public final ParsingLoadable.Parser<HlsPlaylist> createPlaylistParser(HlsMasterPlaylist hlsMasterPlaylist) {
        return new FilteringManifestParser(new HlsPlaylistParser(hlsMasterPlaylist), this.streamKeys);
    }
}
