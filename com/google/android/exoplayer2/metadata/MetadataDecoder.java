package com.google.android.exoplayer2.metadata;

import androidx.annotation.Nullable;

public interface MetadataDecoder {
    @Nullable
    Metadata decode(MetadataInputBuffer metadataInputBuffer);
}
