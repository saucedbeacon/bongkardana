package com.google.android.youtube.player.internal;

import android.app.Activity;
import android.content.Context;
import com.google.android.youtube.player.YouTubeThumbnailView;
import com.google.android.youtube.player.internal.t;
import com.google.android.youtube.player.internal.w;

public final class ac extends aa {
    public final a a(b bVar, YouTubeThumbnailView youTubeThumbnailView) {
        return new p(bVar, youTubeThumbnailView);
    }

    public final b a(Context context, String str, t.a aVar, t.b bVar) {
        return new o(context, str, context.getPackageName(), z.d(context), aVar, bVar);
    }

    public final d a(Activity activity, b bVar, boolean z) throws w.a {
        return w.a(activity, bVar.a(), z);
    }
}
