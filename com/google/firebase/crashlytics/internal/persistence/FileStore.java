package com.google.firebase.crashlytics.internal.persistence;

import java.io.File;

public interface FileStore {
    File getFilesDir();

    String getFilesDirPath();
}
