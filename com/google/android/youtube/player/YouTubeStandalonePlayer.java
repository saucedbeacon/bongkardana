package com.google.android.youtube.player;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;
import java.util.List;

public final class YouTubeStandalonePlayer {
    private YouTubeStandalonePlayer() {
    }

    private static Intent a(Intent intent, Activity activity, String str, int i, boolean z, boolean z2) {
        YouTubeIntents.a(intent, (Context) activity).putExtra("developer_key", str).putExtra("autoplay", z).putExtra("lightbox_mode", z2).putExtra("start_time_millis", i).putExtra("window_has_status_bar", (activity.getWindow().getAttributes().flags & 1024) == 0);
        return intent;
    }

    public static Intent createPlaylistIntent(Activity activity, String str, String str2) {
        return createPlaylistIntent(activity, str, str2, 0, 0, false, false);
    }

    public static Intent createPlaylistIntent(Activity activity, String str, String str2, int i, int i2, boolean z, boolean z2) {
        if (str2 == null) {
            throw new NullPointerException("The playlistId cannot be null");
        } else if (str != null) {
            return a(new Intent("com.google.android.youtube.api.StandalonePlayerActivity.START").putExtra("playlist_id", str2).putExtra("current_index", i), activity, str, i2, z, z2);
        } else {
            throw new NullPointerException("The developerKey cannot be null");
        }
    }

    public static Intent createVideoIntent(Activity activity, String str, String str2) {
        return createVideoIntent(activity, str, str2, 0, false, false);
    }

    public static Intent createVideoIntent(Activity activity, String str, String str2, int i, boolean z, boolean z2) {
        if (str2 == null) {
            throw new NullPointerException("The videoId cannot be null");
        } else if (str != null) {
            return a(new Intent("com.google.android.youtube.api.StandalonePlayerActivity.START").putExtra("video_id", str2), activity, str, i, z, z2);
        } else {
            throw new NullPointerException("The developerKey cannot be null");
        }
    }

    public static Intent createVideosIntent(Activity activity, String str, List<String> list) {
        return createVideosIntent(activity, str, list, 0, 0, false, false);
    }

    public static Intent createVideosIntent(Activity activity, String str, List<String> list, int i, int i2, boolean z, boolean z2) {
        if (list == null) {
            throw new NullPointerException("The list of videoIds cannot be null");
        } else if (list.isEmpty()) {
            throw new IllegalStateException("The list of videoIds cannot be empty");
        } else if (str != null) {
            return a(new Intent("com.google.android.youtube.api.StandalonePlayerActivity.START").putStringArrayListExtra("video_ids", new ArrayList(list)).putExtra("current_index", i), activity, str, i2, z, z2);
        } else {
            throw new NullPointerException("The developerKey cannot be null");
        }
    }

    public static YouTubeInitializationResult getReturnedInitializationResult(Intent intent) {
        try {
            return YouTubeInitializationResult.valueOf(intent.getExtras().getString("initialization_result"));
        } catch (IllegalArgumentException unused) {
            return YouTubeInitializationResult.UNKNOWN_ERROR;
        } catch (NullPointerException unused2) {
            return YouTubeInitializationResult.UNKNOWN_ERROR;
        }
    }
}
