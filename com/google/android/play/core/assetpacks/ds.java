package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.FilenameFilter;

final /* synthetic */ class ds implements FilenameFilter {

    /* renamed from: a  reason: collision with root package name */
    static final FilenameFilter f10924a = new ds();

    private ds() {
    }

    public final boolean accept(File file, String str) {
        return dt.f10925a.matcher(str).matches();
    }
}
