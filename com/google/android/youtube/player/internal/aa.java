package com.google.android.youtube.player.internal;

import android.app.Activity;
import android.content.Context;
import com.google.android.youtube.player.YouTubeThumbnailView;
import com.google.android.youtube.player.internal.t;
import com.google.android.youtube.player.internal.w;

public abstract class aa {

    /* renamed from: a  reason: collision with root package name */
    private static final aa f9646a = b();

    public static aa a() {
        return f9646a;
    }

    private static aa b() {
        try {
            return (aa) Class.forName("com.google.android.youtube.api.locallylinked.LocallyLinkedFactory").asSubclass(aa.class).newInstance();
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (IllegalAccessException e2) {
            throw new IllegalStateException(e2);
        } catch (ClassNotFoundException unused) {
            return new ac();
        }
    }

    public abstract a a(b bVar, YouTubeThumbnailView youTubeThumbnailView);

    public abstract b a(Context context, String str, t.a aVar, t.b bVar);

    public abstract d a(Activity activity, b bVar, boolean z) throws w.a;
}
