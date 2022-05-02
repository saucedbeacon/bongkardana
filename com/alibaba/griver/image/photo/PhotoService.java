package com.alibaba.griver.image.photo;

import android.os.Bundle;
import com.alibaba.ariver.app.api.App;
import com.alibaba.griver.image.photo.listener.PhotoBrowseListener;
import com.alibaba.griver.image.photo.listener.PhotoSelectListener;
import com.alibaba.griver.image.photo.meta.PhotoInfo;
import java.util.List;

public abstract class PhotoService {
    public abstract void browsePhoto(App app, List<PhotoInfo> list, Bundle bundle, PhotoBrowseListener photoBrowseListener);

    public abstract void selectPhoto(App app, Bundle bundle, PhotoSelectListener photoSelectListener);

    public abstract void selectPhoto(App app, List<PhotoInfo> list, Bundle bundle, PhotoSelectListener photoSelectListener);
}
