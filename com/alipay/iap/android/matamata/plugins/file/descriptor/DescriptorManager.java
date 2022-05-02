package com.alipay.iap.android.matamata.plugins.file.descriptor;

import android.content.Context;
import androidx.annotation.NonNull;
import java.io.File;

public class DescriptorManager {
    private FileDescriptor mFileDescriptor = new FileDescriptor();
    private FolderDescriptor mFolderDescriptor = new FolderDescriptor();
    private ObjectDescriptor mObjectDescriptor = new ObjectDescriptor();
    private RootDescriptor mRootDescriptor = new RootDescriptor();

    @NonNull
    public NodeDescriptor getDescriptorFor(Object obj) {
        if (obj instanceof Context) {
            return this.mRootDescriptor;
        }
        if (!(obj instanceof File)) {
            return this.mObjectDescriptor;
        }
        if (((File) obj).isDirectory()) {
            return this.mFolderDescriptor;
        }
        return this.mFileDescriptor;
    }
}
