package com.google.android.youtube.player;

import java.util.List;

public interface YouTubePlayer {
    public static final int FULLSCREEN_FLAG_ALWAYS_FULLSCREEN_IN_LANDSCAPE = 4;
    public static final int FULLSCREEN_FLAG_CONTROL_ORIENTATION = 1;
    public static final int FULLSCREEN_FLAG_CONTROL_SYSTEM_UI = 2;
    public static final int FULLSCREEN_FLAG_CUSTOM_LAYOUT = 8;

    public enum ErrorReason {
        EMBEDDING_DISABLED,
        BLOCKED_FOR_APP,
        NOT_PLAYABLE,
        NETWORK_ERROR,
        UNAUTHORIZED_OVERLAY,
        PLAYER_VIEW_TOO_SMALL,
        PLAYER_VIEW_NOT_VISIBLE,
        EMPTY_PLAYLIST,
        AUTOPLAY_DISABLED,
        USER_DECLINED_RESTRICTED_CONTENT,
        USER_DECLINED_HIGH_BANDWIDTH,
        UNEXPECTED_SERVICE_DISCONNECTION,
        INTERNAL_ERROR,
        UNKNOWN
    }

    public interface OnInitializedListener {
        void onInitializationFailure(Provider provider, YouTubeInitializationResult youTubeInitializationResult);

        void onInitializationSuccess(Provider provider, YouTubePlayer youTubePlayer, boolean z);
    }

    public interface PlayerStateChangeListener {
        void onAdStarted();

        void onError(ErrorReason errorReason);

        void onLoaded(String str);

        void onLoading();

        void onVideoEnded();

        void onVideoStarted();
    }

    public interface Provider {
        void initialize(String str, OnInitializedListener onInitializedListener);
    }

    public interface OnFullscreenListener {
        void onFullscreen(boolean z);
    }

    public interface PlaybackEventListener {
        void onBuffering(boolean z);

        void onPaused();

        void onPlaying();

        void onSeekTo(int i);

        void onStopped();
    }

    public enum PlayerStyle {
        DEFAULT,
        MINIMAL,
        CHROMELESS
    }

    public interface PlaylistEventListener {
        void onNext();

        void onPlaylistEnded();

        void onPrevious();
    }

    void addFullscreenControlFlag(int i);

    void cuePlaylist(String str);

    void cuePlaylist(String str, int i, int i2);

    void cueVideo(String str);

    void cueVideo(String str, int i);

    void cueVideos(List<String> list);

    void cueVideos(List<String> list, int i, int i2);

    int getCurrentTimeMillis();

    int getDurationMillis();

    int getFullscreenControlFlags();

    boolean hasNext();

    boolean hasPrevious();

    boolean isPlaying();

    void loadPlaylist(String str);

    void loadPlaylist(String str, int i, int i2);

    void loadVideo(String str);

    void loadVideo(String str, int i);

    void loadVideos(List<String> list);

    void loadVideos(List<String> list, int i, int i2);

    void next();

    void pause();

    void play();

    void previous();

    void release();

    void seekRelativeMillis(int i);

    void seekToMillis(int i);

    void setFullscreen(boolean z);

    void setFullscreenControlFlags(int i);

    void setManageAudioFocus(boolean z);

    void setOnFullscreenListener(OnFullscreenListener onFullscreenListener);

    void setPlaybackEventListener(PlaybackEventListener playbackEventListener);

    void setPlayerStateChangeListener(PlayerStateChangeListener playerStateChangeListener);

    void setPlayerStyle(PlayerStyle playerStyle);

    void setPlaylistEventListener(PlaylistEventListener playlistEventListener);

    void setShowFullscreenButton(boolean z);
}
