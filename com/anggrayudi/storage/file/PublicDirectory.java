package com.anggrayudi.storage.file;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lcom/anggrayudi/storage/file/PublicDirectory;", "", "folderName", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getFolderName", "()Ljava/lang/String;", "DOWNLOADS", "MUSIC", "PODCASTS", "RINGTONES", "ALARMS", "NOTIFICATIONS", "PICTURES", "MOVIES", "DCIM", "DOCUMENTS", "storage_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public enum PublicDirectory {
    DOWNLOADS(r1),
    MUSIC(r1),
    PODCASTS(r1),
    RINGTONES(r1),
    ALARMS(r1),
    NOTIFICATIONS(r1),
    PICTURES(r1),
    MOVIES(r1),
    DCIM(r1),
    DOCUMENTS(r1);
    
    @NotNull
    private final String folderName;

    private PublicDirectory(String str) {
        this.folderName = str;
    }

    @NotNull
    public final String getFolderName() {
        return this.folderName;
    }
}
