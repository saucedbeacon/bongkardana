package com.google.android.youtube.player.internal;

import android.content.Context;
import android.content.res.Resources;
import java.util.Locale;
import java.util.Map;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    public final String f11019a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;

    public m(Context context) {
        Resources resources = context.getResources();
        Map<String, String> a2 = x.a((resources == null || resources.getConfiguration() == null || resources.getConfiguration().locale == null) ? Locale.getDefault() : resources.getConfiguration().locale);
        this.f11019a = a2.get("error_initializing_player");
        this.b = a2.get("get_youtube_app_title");
        this.c = a2.get("get_youtube_app_text");
        this.d = a2.get("get_youtube_app_action");
        this.e = a2.get("enable_youtube_app_title");
        this.f = a2.get("enable_youtube_app_text");
        this.g = a2.get("enable_youtube_app_action");
        this.h = a2.get("update_youtube_app_title");
        this.i = a2.get("update_youtube_app_text");
        this.j = a2.get("update_youtube_app_action");
    }
}
