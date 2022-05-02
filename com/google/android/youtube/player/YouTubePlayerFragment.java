package com.google.android.youtube.player;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;
import com.google.android.youtube.player.internal.ab;

public class YouTubePlayerFragment extends Fragment implements YouTubePlayer.Provider {

    /* renamed from: a  reason: collision with root package name */
    private final a f11011a = new a(this, (byte) 0);
    private Bundle b;
    private YouTubePlayerView c;
    private String d;
    /* access modifiers changed from: private */
    public YouTubePlayer.OnInitializedListener e;
    private boolean f;

    final class a implements YouTubePlayerView.b {
        private a() {
        }

        /* synthetic */ a(YouTubePlayerFragment youTubePlayerFragment, byte b) {
            this();
        }

        public final void a(YouTubePlayerView youTubePlayerView) {
        }

        public final void a(YouTubePlayerView youTubePlayerView, String str, YouTubePlayer.OnInitializedListener onInitializedListener) {
            YouTubePlayerFragment youTubePlayerFragment = YouTubePlayerFragment.this;
            youTubePlayerFragment.initialize(str, youTubePlayerFragment.e);
        }
    }

    private void a() {
        YouTubePlayerView youTubePlayerView = this.c;
        if (youTubePlayerView != null && this.e != null) {
            youTubePlayerView.a(this.f);
            this.c.a(getActivity(), this, this.d, this.e, this.b);
            this.b = null;
            this.e = null;
        }
    }

    public static YouTubePlayerFragment newInstance() {
        return new YouTubePlayerFragment();
    }

    public void initialize(String str, YouTubePlayer.OnInitializedListener onInitializedListener) {
        this.d = ab.a(str, (Object) "Developer key cannot be null or empty");
        this.e = onInitializedListener;
        a();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.b = bundle != null ? bundle.getBundle("YouTubePlayerFragment.KEY_PLAYER_VIEW_STATE") : null;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.c = new YouTubePlayerView(getActivity(), (AttributeSet) null, 0, this.f11011a);
        a();
        return this.c;
    }

    public void onDestroy() {
        if (this.c != null) {
            Activity activity = getActivity();
            this.c.b(activity == null || activity.isFinishing());
        }
        super.onDestroy();
    }

    public void onDestroyView() {
        this.c.c(getActivity().isFinishing());
        this.c = null;
        super.onDestroyView();
    }

    public void onPause() {
        this.c.c();
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        this.c.b();
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        YouTubePlayerView youTubePlayerView = this.c;
        bundle.putBundle("YouTubePlayerFragment.KEY_PLAYER_VIEW_STATE", youTubePlayerView != null ? youTubePlayerView.e() : this.b);
    }

    public void onStart() {
        super.onStart();
        this.c.a();
    }

    public void onStop() {
        this.c.d();
        super.onStop();
    }
}
