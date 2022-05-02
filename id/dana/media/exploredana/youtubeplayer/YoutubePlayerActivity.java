package id.dana.media.exploredana.youtubeplayer;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;
import com.google.common.base.Ascii;
import id.dana.R;
import id.dana.contract.exploredana.PlayerType;
import id.dana.data.foundation.logger.log.DanaLogConstants;
import id.dana.richview.exploredana.ExploreDanaView;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o.DiagnosticBridgeExtension;
import o.RawQuery;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;
import o.registerOnLoadCanceledListener;
import o.updateActionSheetContent;

public class YoutubePlayerActivity extends YouTubeBaseActivity {
    public static final byte[] getMin = {Byte.MAX_VALUE, -110, 36, -49, 22, -45, 42, -22, 0, Ascii.NAK, 0, -24, Ascii.FS, -30, 51, -42, -5, Ascii.DC4, -34, 39, Ascii.NAK, -18, -39, Ascii.US, Ascii.US, -5, -47, 42, -4, -9, -20, Ascii.GS, -8, Ascii.VT, -24, Ascii.RS, 10, -3, Ascii.FS, -17, 35, -43, -24, 40, -37, Framer.ENTER_FRAME_PREFIX, 43, -31, 22, -26, -29, Ascii.GS, Ascii.US, -27, -22, 38, 22, -38, 52, -27, -20, Ascii.SI, -27, Ascii.ESC, Ascii.US, -26, Framer.ENTER_FRAME_PREFIX, -18, 0, -16, -19, 32, Ascii.VT, -12, -22, Ascii.RS, -7, 3, 38, -27, -7, 9, 37, -9, -25, 1, 42, -9, Ascii.CAN, -46, -17, Framer.STDOUT_FRAME_PREFIX, 22, -45, 39, -19, -1, -15, 53, -19, -27, 5, 36, -17, 1, -4, 42, -47, 35, 8, -62, 53, 13, -22, Ascii.CAN, -4, -17, 38, -12, -13, -1, -32, 56, -6, -26, -12, 57, -12, Ascii.SO, -27, Ascii.SUB, -24, Ascii.FS, -29, 35, -16, 0, -32, 53, -26, 36, -26, Ascii.US, -10, Ascii.FF, -21, Ascii.DC4, -2, -27, 9, Ascii.FS, -3, -46, 32, 38, -25, -37, 37, Ascii.DC4, -3, Ascii.FF, -25, 42, -21, -9, 0, Ascii.DC4, -3, Ascii.FF, -22, 34, -26, -37, 9, 61, -41, 39, -60, Ascii.SI, -8, Ascii.VT, -7, 4, Ascii.VT, -23, 10, 62, -42, -13};
    public static final int setMin = 221;
    private Unbinder equals;
    /* access modifiers changed from: private */
    public String getMax;
    private String toIntRange;
    @BindView(2131366073)
    YouTubePlayerView youtubePlayerView;

    /* JADX WARNING: Removed duplicated region for block: B:8:0x002e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String length(short r5, int r6, int r7) {
        /*
            int r5 = r5 * 175
            int r5 = 178 - r5
            byte[] r0 = getMin
            int r7 = r7 * 45
            int r7 = r7 + 56
            int r6 = r6 * 165
            int r6 = r6 + 11
            byte[] r1 = new byte[r6]
            r2 = -1
            int r6 = r6 + r2
            if (r0 != 0) goto L_0x001a
            r2 = r1
            r3 = -1
            r1 = r0
            r0 = r6
            r6 = r5
            goto L_0x0036
        L_0x001a:
            r4 = r6
            r6 = r5
            r5 = r7
            r7 = r4
        L_0x001e:
            int r2 = r2 + 1
            byte r3 = (byte) r5
            r1[r2] = r3
            int r6 = r6 + 1
            if (r2 != r7) goto L_0x002e
            java.lang.String r5 = new java.lang.String
            r6 = 0
            r5.<init>(r1, r6)
            return r5
        L_0x002e:
            byte r3 = r0[r6]
            r4 = r0
            r0 = r7
            r7 = r3
            r3 = r2
            r2 = r1
            r1 = r4
        L_0x0036:
            int r5 = r5 + r7
            int r5 = r5 + -2
            r7 = r0
            r0 = r1
            r1 = r2
            r2 = r3
            goto L_0x001e
        */
        throw new UnsupportedOperationException("Method not decompiled: id.dana.media.exploredana.youtubeplayer.YoutubePlayerActivity.length(short, int, int):java.lang.String");
    }

    public void onCreate(Bundle bundle) {
        String str;
        int length;
        int min;
        int length2;
        int max;
        byte b = (byte) getMin[85];
        byte b2 = (byte) b;
        String length3 = length(b, b2, (byte) b2);
        byte b3 = (byte) getMin[8];
        byte b4 = (byte) b3;
        String length4 = length(b3, b4, (byte) b4);
        Context baseContext = getBaseContext();
        Context context = null;
        Context applicationContext = (baseContext == null || baseContext.getApplicationContext() == null) ? null : baseContext.getApplicationContext();
        if (applicationContext != null) {
            registerOnLoadCanceledListener.setMin().getMax(applicationContext, length3, length4);
        }
        int nextInt = new Random().nextInt(Integer.MAX_VALUE);
        int length5 = dispatchOnCancelled.length(nextInt);
        if (nextInt != length5) {
            onCanceled oncanceled = new onCanceled(nextInt, length5, 1);
            onCancelLoad.setMax(1030090543, oncanceled);
            onCancelLoad.getMin(1030090543, oncanceled);
        }
        Context baseContext2 = getBaseContext();
        Context applicationContext2 = baseContext2 != null ? baseContext2.getApplicationContext() : null;
        if (!(applicationContext2 == null || 1030090543 == (max = dispatchOnCancelled.getMax(applicationContext2, 1030090543)))) {
            onCanceled oncanceled2 = new onCanceled(1030090543, max, 512);
            onCancelLoad.setMax(1030090543, oncanceled2);
            onCancelLoad.getMin(1030090543, oncanceled2);
        }
        Context baseContext3 = getBaseContext();
        Context applicationContext3 = baseContext3 != null ? baseContext3.getApplicationContext() : null;
        if (!(applicationContext3 == null || (length2 = dispatchOnCancelled.length(applicationContext3, 0)) == 0)) {
            onCanceled oncanceled3 = new onCanceled(0, length2, 4);
            onCancelLoad.setMax(1030090543, oncanceled3);
            onCancelLoad.getMin(1030090543, oncanceled3);
        }
        Context baseContext4 = getBaseContext();
        if (baseContext4 != null) {
            context = baseContext4.getApplicationContext();
        }
        if (!(context == null || (length = context.fileList().length) == (min = dispatchOnCancelled.setMin(context, length)))) {
            onCanceled oncanceled4 = new onCanceled(length, min, 8);
            onCancelLoad.setMax(1030090543, oncanceled4);
            onCancelLoad.getMin(1030090543, oncanceled4);
        }
        super.onCreate(bundle);
        setContentView(R.layout.activity_youtube_player);
        this.equals = ButterKnife.length(this);
        this.toIntRange = getIntent().getStringExtra(ExploreDanaView.EXPLORE_DANA_ID);
        Matcher matcher = Pattern.compile("(?:youtube(?:-nocookie)?\\.com\\/(?:[^\\/\\n\\s]+\\/\\S+\\/|(?:v|e(?:mbed)?)\\/|\\S*?[?&]v=)|youtu\\.be\\/)([a-zA-Z0-9_-]{11})", 2).matcher(getIntent().getStringExtra(PlayerType.YOUTUBE));
        if (!matcher.find() || matcher.group().length() < 2) {
            str = "";
        } else {
            str = matcher.group(1);
        }
        this.getMax = str;
        try {
            this.youtubePlayerView.initialize("AIzaSyBm87vS-HYc7wRY-QiaMwr7hkAbJdeGg8U", new YouTubePlayer.OnInitializedListener() {
                public final void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean z) {
                    youTubePlayer.cueVideo(YoutubePlayerActivity.this.getMax);
                    youTubePlayer.setPlayerStateChangeListener(new DiagnosticBridgeExtension(youTubePlayer));
                }

                public final void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
                    updateActionSheetContent.e(DanaLogConstants.BizType.INIT_YOUTUBE_PLAYER, "youtube_player_fail- onInitializationFailure");
                }
            });
        } catch (IllegalStateException e) {
            updateActionSheetContent.exception(DanaLogConstants.BizType.INIT_YOUTUBE_PLAYER, DanaLogConstants.ExceptionType.YOUTUBE_PLAYER_EXCEPTION, e.getMessage());
        }
    }

    public void onDestroy() {
        Unbinder unbinder = this.equals;
        if (unbinder != null) {
            RawQuery.getMax(unbinder, RawQuery.length.getMin);
        }
        super.onDestroy();
    }

    public void onBackPressed() {
        int max;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || 1295683478 == (max = dispatchOnCancelled.getMax(applicationContext, 1295683478)))) {
            onCanceled oncanceled = new onCanceled(1295683478, max, 512);
            onCancelLoad.setMax(1295683478, oncanceled);
            onCancelLoad.getMin(1295683478, oncanceled);
        }
        Intent intent = new Intent();
        intent.putExtra(ExploreDanaView.EXPLORE_DANA_ID, this.toIntRange);
        setResult(-1, intent);
        finish();
    }
}
