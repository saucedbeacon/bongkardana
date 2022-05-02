package com.google.android.youtube.player.internal;

import android.content.res.Configuration;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.KeyEvent;
import android.view.View;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.internal.e;
import com.google.android.youtube.player.internal.f;
import com.google.android.youtube.player.internal.g;
import com.google.android.youtube.player.internal.h;
import java.util.List;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public final class s implements YouTubePlayer {

    /* renamed from: a  reason: collision with root package name */
    private b f9664a;
    private d b;

    public s(b bVar, d dVar) {
        this.f9664a = (b) ab.a(bVar, (Object) "connectionClient cannot be null");
        this.b = (d) ab.a(dVar, (Object) "embeddedPlayer cannot be null");
    }

    public final View a() {
        try {
            return (View) v.a(this.b.s());
        } catch (RemoteException e) {
            throw new q(e);
        }
    }

    public final void a(Configuration configuration) {
        try {
            this.b.a(configuration);
        } catch (RemoteException e) {
            throw new q(e);
        }
    }

    public final void a(boolean z) {
        try {
            this.b.a(z);
            this.f9664a.a(z);
            this.f9664a.d();
        } catch (RemoteException e) {
            throw new q(e);
        }
    }

    public final boolean a(int i, KeyEvent keyEvent) {
        int max = dispatchOnCancelled.setMax(i);
        if (i != max) {
            onCanceled oncanceled = new onCanceled(i, max, 1);
            onCancelLoad.setMax(1835165349, oncanceled);
            onCancelLoad.getMin(1835165349, oncanceled);
        }
        try {
            return this.b.a(i, keyEvent);
        } catch (RemoteException e) {
            throw new q(e);
        }
    }

    public final boolean a(Bundle bundle) {
        try {
            return this.b.a(bundle);
        } catch (RemoteException e) {
            throw new q(e);
        }
    }

    public final void addFullscreenControlFlag(int i) {
        try {
            this.b.d(i);
        } catch (RemoteException e) {
            throw new q(e);
        }
    }

    public final void b() {
        try {
            this.b.m();
        } catch (RemoteException e) {
            throw new q(e);
        }
    }

    public final void b(boolean z) {
        try {
            this.b.e(z);
        } catch (RemoteException e) {
            throw new q(e);
        }
    }

    public final boolean b(int i, KeyEvent keyEvent) {
        try {
            return this.b.b(i, keyEvent);
        } catch (RemoteException e) {
            throw new q(e);
        }
    }

    public final void c() {
        try {
            this.b.n();
        } catch (RemoteException e) {
            throw new q(e);
        }
    }

    public final void cuePlaylist(String str) {
        cuePlaylist(str, 0, 0);
    }

    public final void cuePlaylist(String str, int i, int i2) {
        try {
            this.b.a(str, i, i2);
        } catch (RemoteException e) {
            throw new q(e);
        }
    }

    public final void cueVideo(String str) {
        cueVideo(str, 0);
    }

    public final void cueVideo(String str, int i) {
        try {
            this.b.a(str, i);
        } catch (RemoteException e) {
            throw new q(e);
        }
    }

    public final void cueVideos(List<String> list) {
        cueVideos(list, 0, 0);
    }

    public final void cueVideos(List<String> list, int i, int i2) {
        try {
            this.b.a(list, i, i2);
        } catch (RemoteException e) {
            throw new q(e);
        }
    }

    public final void d() {
        try {
            this.b.o();
        } catch (RemoteException e) {
            throw new q(e);
        }
    }

    public final void e() {
        try {
            this.b.p();
        } catch (RemoteException e) {
            throw new q(e);
        }
    }

    public final void f() {
        try {
            this.b.q();
        } catch (RemoteException e) {
            throw new q(e);
        }
    }

    public final void g() {
        try {
            this.b.l();
        } catch (RemoteException e) {
            throw new q(e);
        }
    }

    public final int getCurrentTimeMillis() {
        try {
            return this.b.h();
        } catch (RemoteException e) {
            throw new q(e);
        }
    }

    public final int getDurationMillis() {
        try {
            return this.b.i();
        } catch (RemoteException e) {
            throw new q(e);
        }
    }

    public final int getFullscreenControlFlags() {
        try {
            return this.b.j();
        } catch (RemoteException e) {
            throw new q(e);
        }
    }

    public final Bundle h() {
        try {
            return this.b.r();
        } catch (RemoteException e) {
            throw new q(e);
        }
    }

    public final boolean hasNext() {
        try {
            return this.b.d();
        } catch (RemoteException e) {
            throw new q(e);
        }
    }

    public final boolean hasPrevious() {
        try {
            return this.b.e();
        } catch (RemoteException e) {
            throw new q(e);
        }
    }

    public final boolean isPlaying() {
        try {
            return this.b.c();
        } catch (RemoteException e) {
            throw new q(e);
        }
    }

    public final void loadPlaylist(String str) {
        loadPlaylist(str, 0, 0);
    }

    public final void loadPlaylist(String str, int i, int i2) {
        try {
            this.b.b(str, i, i2);
        } catch (RemoteException e) {
            throw new q(e);
        }
    }

    public final void loadVideo(String str) {
        loadVideo(str, 0);
    }

    public final void loadVideo(String str, int i) {
        try {
            this.b.b(str, i);
        } catch (RemoteException e) {
            throw new q(e);
        }
    }

    public final void loadVideos(List<String> list) {
        loadVideos(list, 0, 0);
    }

    public final void loadVideos(List<String> list, int i, int i2) {
        try {
            this.b.b(list, i, i2);
        } catch (RemoteException e) {
            throw new q(e);
        }
    }

    public final void next() {
        try {
            this.b.f();
        } catch (RemoteException e) {
            throw new q(e);
        }
    }

    public final void pause() {
        try {
            this.b.b();
        } catch (RemoteException e) {
            throw new q(e);
        }
    }

    public final void play() {
        try {
            this.b.a();
        } catch (RemoteException e) {
            throw new q(e);
        }
    }

    public final void previous() {
        try {
            this.b.g();
        } catch (RemoteException e) {
            throw new q(e);
        }
    }

    public final void release() {
        a(true);
    }

    public final void seekRelativeMillis(int i) {
        try {
            this.b.b(i);
        } catch (RemoteException e) {
            throw new q(e);
        }
    }

    public final void seekToMillis(int i) {
        try {
            this.b.a(i);
        } catch (RemoteException e) {
            throw new q(e);
        }
    }

    public final void setFullscreen(boolean z) {
        try {
            this.b.b(z);
        } catch (RemoteException e) {
            throw new q(e);
        }
    }

    public final void setFullscreenControlFlags(int i) {
        try {
            this.b.c(i);
        } catch (RemoteException e) {
            throw new q(e);
        }
    }

    public final void setManageAudioFocus(boolean z) {
        try {
            this.b.d(z);
        } catch (RemoteException e) {
            throw new q(e);
        }
    }

    public final void setOnFullscreenListener(final YouTubePlayer.OnFullscreenListener onFullscreenListener) {
        try {
            this.b.a((e) new e.a() {
                public final void a(boolean z) {
                    onFullscreenListener.onFullscreen(z);
                }
            });
        } catch (RemoteException e) {
            throw new q(e);
        }
    }

    public final void setPlaybackEventListener(final YouTubePlayer.PlaybackEventListener playbackEventListener) {
        try {
            this.b.a((f) new f.a() {
                public final void a() {
                    playbackEventListener.onPlaying();
                }

                public final void a(int i) {
                    playbackEventListener.onSeekTo(i);
                }

                public final void a(boolean z) {
                    playbackEventListener.onBuffering(z);
                }

                public final void b() {
                    playbackEventListener.onPaused();
                }

                public final void c() {
                    playbackEventListener.onStopped();
                }
            });
        } catch (RemoteException e) {
            throw new q(e);
        }
    }

    public final void setPlayerStateChangeListener(final YouTubePlayer.PlayerStateChangeListener playerStateChangeListener) {
        try {
            this.b.a((g) new g.a() {
                public final void a() {
                    playerStateChangeListener.onLoading();
                }

                public final void a(String str) {
                    playerStateChangeListener.onLoaded(str);
                }

                public final void b() {
                    playerStateChangeListener.onAdStarted();
                }

                public final void b(String str) {
                    YouTubePlayer.ErrorReason errorReason;
                    try {
                        errorReason = YouTubePlayer.ErrorReason.valueOf(str);
                    } catch (IllegalArgumentException | NullPointerException unused) {
                        errorReason = YouTubePlayer.ErrorReason.UNKNOWN;
                    }
                    playerStateChangeListener.onError(errorReason);
                }

                public final void c() {
                    playerStateChangeListener.onVideoStarted();
                }

                public final void d() {
                    playerStateChangeListener.onVideoEnded();
                }
            });
        } catch (RemoteException e) {
            throw new q(e);
        }
    }

    public final void setPlayerStyle(YouTubePlayer.PlayerStyle playerStyle) {
        try {
            this.b.a(playerStyle.name());
        } catch (RemoteException e) {
            throw new q(e);
        }
    }

    public final void setPlaylistEventListener(final YouTubePlayer.PlaylistEventListener playlistEventListener) {
        try {
            this.b.a((h) new h.a() {
                public final void a() {
                    playlistEventListener.onPrevious();
                }

                public final void b() {
                    playlistEventListener.onNext();
                }

                public final void c() {
                    playlistEventListener.onPlaylistEnded();
                }
            });
        } catch (RemoteException e) {
            throw new q(e);
        }
    }

    public final void setShowFullscreenButton(boolean z) {
        try {
            this.b.c(z);
        } catch (RemoteException e) {
            throw new q(e);
        }
    }
}
