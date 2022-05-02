package com.alibaba.ariver.app.api.point.activity;

import android.content.Intent;
import com.alibaba.ariver.kernel.api.extension.Extension;

public interface ActivityResultPoint extends Extension {
    void onActivityResult(int i, int i2, Intent intent);
}
