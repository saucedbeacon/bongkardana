package com.google.android.youtube.player;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.google.android.youtube.player.internal.aa;
import com.google.android.youtube.player.internal.ab;
import com.google.android.youtube.player.internal.b;
import com.google.android.youtube.player.internal.t;

public final class YouTubeThumbnailView extends ImageView {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public b f11016a;
    /* access modifiers changed from: private */
    public com.google.android.youtube.player.internal.a b;

    public interface OnInitializedListener {
        void onInitializationFailure(YouTubeThumbnailView youTubeThumbnailView, YouTubeInitializationResult youTubeInitializationResult);

        void onInitializationSuccess(YouTubeThumbnailView youTubeThumbnailView, YouTubeThumbnailLoader youTubeThumbnailLoader);
    }

    static final class a implements t.a, t.b {

        /* renamed from: a  reason: collision with root package name */
        private YouTubeThumbnailView f11017a;
        private OnInitializedListener b;

        public a(YouTubeThumbnailView youTubeThumbnailView, OnInitializedListener onInitializedListener) {
            this.f11017a = (YouTubeThumbnailView) ab.a(youTubeThumbnailView, (Object) "thumbnailView cannot be null");
            this.b = (OnInitializedListener) ab.a(onInitializedListener, (Object) "onInitializedlistener cannot be null");
        }

        private void c() {
            YouTubeThumbnailView youTubeThumbnailView = this.f11017a;
            if (youTubeThumbnailView != null) {
                b unused = youTubeThumbnailView.f11016a = null;
                this.f11017a = null;
                this.b = null;
            }
        }

        public final void a() {
            YouTubeThumbnailView youTubeThumbnailView = this.f11017a;
            if (youTubeThumbnailView != null && youTubeThumbnailView.f11016a != null) {
                com.google.android.youtube.player.internal.a unused = this.f11017a.b = aa.a().a(this.f11017a.f11016a, this.f11017a);
                OnInitializedListener onInitializedListener = this.b;
                YouTubeThumbnailView youTubeThumbnailView2 = this.f11017a;
                onInitializedListener.onInitializationSuccess(youTubeThumbnailView2, youTubeThumbnailView2.b);
                c();
            }
        }

        public final void a(YouTubeInitializationResult youTubeInitializationResult) {
            this.b.onInitializationFailure(this.f11017a, youTubeInitializationResult);
            c();
        }

        public final void b() {
            c();
        }
    }

    public YouTubeThumbnailView(Context context) {
        this(context, (AttributeSet) null);
    }

    public YouTubeThumbnailView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public YouTubeThumbnailView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* access modifiers changed from: protected */
    public final void finalize() throws Throwable {
        com.google.android.youtube.player.internal.a aVar = this.b;
        if (aVar != null) {
            aVar.b();
            this.b = null;
        }
        super.finalize();
    }

    public final void initialize(String str, OnInitializedListener onInitializedListener) {
        a aVar = new a(this, onInitializedListener);
        b a2 = aa.a().a(getContext(), str, aVar, aVar);
        this.f11016a = a2;
        a2.e();
    }
}
