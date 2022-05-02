package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.FilenameFilter;

final /* synthetic */ class cx implements FilenameFilter {

    /* renamed from: a  reason: collision with root package name */
    private final String f10902a;

    cx(String str) {
        this.f10902a = str;
    }

    public final boolean accept(File file, String str) {
        return str.startsWith(String.valueOf(this.f10902a).concat("-")) && str.endsWith(".apk");
    }
}
