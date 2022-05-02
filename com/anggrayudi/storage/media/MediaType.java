package com.anggrayudi.storage.media;

import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import id.dana.util.media.MimeType;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import o.getCurrentContentInsetLeft;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\n\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u001b\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078F¢\u0006\f\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017¨\u0006\u0018"}, d2 = {"Lcom/anggrayudi/storage/media/MediaType;", "", "readUri", "Landroid/net/Uri;", "writeUri", "(Ljava/lang/String;ILandroid/net/Uri;Landroid/net/Uri;)V", "directories", "", "Ljava/io/File;", "getDirectories$annotations", "()V", "getDirectories", "()Ljava/util/List;", "mimeType", "", "getMimeType", "()Ljava/lang/String;", "getReadUri", "()Landroid/net/Uri;", "getWriteUri", "IMAGE", "AUDIO", "VIDEO", "DOWNLOADS", "storage_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public enum MediaType {
    IMAGE(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, MediaStore.Images.Media.getContentUri(getCurrentContentInsetLeft.length())),
    AUDIO(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, MediaStore.Audio.Media.getContentUri(getCurrentContentInsetLeft.length())),
    VIDEO(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, MediaStore.Video.Media.getContentUri(getCurrentContentInsetLeft.length()));
    
    @Nullable
    private final Uri readUri;
    @Nullable
    private final Uri writeUri;

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public /* synthetic */ class setMin {
        public static final /* synthetic */ int[] getMin = null;

        static {
            int[] iArr = new int[MediaType.values().length];
            iArr[MediaType.IMAGE.ordinal()] = 1;
            iArr[MediaType.AUDIO.ordinal()] = 2;
            iArr[MediaType.VIDEO.ordinal()] = 3;
            iArr[MediaType.DOWNLOADS.ordinal()] = 4;
            getMin = iArr;
        }
    }

    private MediaType(Uri uri, Uri uri2) {
        this.readUri = uri;
        this.writeUri = uri2;
    }

    @Nullable
    public final Uri getReadUri() {
        return this.readUri;
    }

    @Nullable
    public final Uri getWriteUri() {
        return this.writeUri;
    }

    static {
        IMAGE = new MediaType("IMAGE", 0, MediaStore.Images.Media.EXTERNAL_CONTENT_URI, MediaStore.Images.Media.getContentUri(getCurrentContentInsetLeft.length()));
        AUDIO = new MediaType("AUDIO", 1, MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, MediaStore.Audio.Media.getContentUri(getCurrentContentInsetLeft.length()));
        VIDEO = new MediaType("VIDEO", 2, MediaStore.Video.Media.EXTERNAL_CONTENT_URI, MediaStore.Video.Media.getContentUri(getCurrentContentInsetLeft.length()));
        Uri uri = null;
        Uri uri2 = Build.VERSION.SDK_INT < 29 ? null : MediaStore.Downloads.EXTERNAL_CONTENT_URI;
        if (Build.VERSION.SDK_INT >= 29) {
            uri = MediaStore.Downloads.getContentUri(getCurrentContentInsetLeft.length());
        }
        DOWNLOADS = new MediaType("DOWNLOADS", 3, uri2, uri);
        $VALUES = $values();
    }

    @NotNull
    public final List<File> getDirectories() {
        int i = setMin.getMin[ordinal()];
        int i2 = 0;
        if (i == 1) {
            ImageMediaDirectory[] values = ImageMediaDirectory.values();
            Collection arrayList = new ArrayList(values.length);
            int length = values.length;
            while (i2 < length) {
                arrayList.add(Environment.getExternalStoragePublicDirectory(values[i2].getFolderName()));
                i2++;
            }
            return (List) arrayList;
        } else if (i == 2) {
            AudioMediaDirectory[] values2 = AudioMediaDirectory.values();
            Collection arrayList2 = new ArrayList(values2.length);
            int length2 = values2.length;
            while (i2 < length2) {
                arrayList2.add(Environment.getExternalStoragePublicDirectory(values2[i2].getFolderName()));
                i2++;
            }
            return (List) arrayList2;
        } else if (i == 3) {
            VideoMediaDirectory[] values3 = VideoMediaDirectory.values();
            Collection arrayList3 = new ArrayList(values3.length);
            int length3 = values3.length;
            while (i2 < length3) {
                arrayList3.add(Environment.getExternalStoragePublicDirectory(values3[i2].getFolderName()));
                i2++;
            }
            return (List) arrayList3;
        } else if (i == 4) {
            return CollectionsKt.listOf(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS));
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    @NotNull
    public final String getMimeType() {
        int i = setMin.getMin[ordinal()];
        if (i == 1) {
            return MimeType.IMAGE_ALL;
        }
        if (i != 2) {
            return i != 3 ? "*/*" : "video/*";
        }
        return "audio/*";
    }
}
