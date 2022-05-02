package com.google.android.youtube.player;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;
import com.google.common.base.Ascii;
import java.util.Random;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;
import o.registerOnLoadCanceledListener;

public class YouTubeBaseActivity extends Activity {
    public static final byte[] length = {Ascii.GS, -115, 96, -60, -22, Framer.STDIN_FRAME_PREFIX, -42, 22, 0, -21, 0, Ascii.CAN, -28, Ascii.RS, -51, 42, 5, -20, 34, -39, -21, Ascii.DC2, 39, -31, -31, 5, 47, -42, 4, 9, Ascii.DC4, -29, 8, -11, Ascii.CAN, -30, -10, 3, -28, 17, -35, 43, Ascii.CAN, -40, 37, -33, -43, Ascii.US, -22, Ascii.SUB, Ascii.GS, -29, -31, Ascii.ESC, 22, -38, -22, 38, -52, Ascii.ESC, Ascii.DC4, -15, Ascii.ESC, -27, -31, Ascii.SUB, -33, Ascii.DC2, 0, Ascii.DLE, 19, -32, -11, Ascii.FF, 22, -30, 7, -3, -38, Ascii.ESC, 7, -9, -37, 9, Ascii.EM, -1, -42, 9, -24, 46, 17, -49, -22, Framer.STDIN_FRAME_PREFIX, -39, 19, 1, Ascii.SI, -53, 19, Ascii.ESC, -5, -36, 17, -1, 4, -42, 47, -35, -8, 62, -53, -13, 22, -24, 4, 17, -38, Ascii.FF, 13, 1, 32, -56, 6, Ascii.SUB, Ascii.FF, -57, Ascii.FF, -14, Ascii.ESC, -26, Ascii.CAN, -28, Ascii.GS, -35, Ascii.DLE, 0, 32, -53, Ascii.SUB, -36, Ascii.SUB, -31, 10, -12, Ascii.NAK, -20, 2, Ascii.ESC, -9, -28, 3, 46, -32, -38, Ascii.EM, 37, -37, -20, 3, -12, Ascii.EM, -42, Ascii.NAK, 9, 0, -20, 3, -12, 22, -34, Ascii.SUB, 37, -9, -61, 41, -39, 60, -15, 8, -11, 7, -4, -11, Ascii.ETB, -10, -62, 42, 13};
    public static final int setMax = 215;

    /* renamed from: a  reason: collision with root package name */
    private a f9638a;
    /* access modifiers changed from: private */
    public YouTubePlayerView b;
    /* access modifiers changed from: private */
    public int c;
    /* access modifiers changed from: private */
    public Bundle d;

    final class a implements YouTubePlayerView.b {
        private a() {
        }

        /* synthetic */ a(YouTubeBaseActivity youTubeBaseActivity, byte b) {
            this();
        }

        public final void a(YouTubePlayerView youTubePlayerView) {
            if (!(YouTubeBaseActivity.this.b == null || YouTubeBaseActivity.this.b == youTubePlayerView)) {
                YouTubeBaseActivity.this.b.c(true);
            }
            YouTubePlayerView unused = YouTubeBaseActivity.this.b = youTubePlayerView;
            if (YouTubeBaseActivity.this.c > 0) {
                youTubePlayerView.a();
            }
            if (YouTubeBaseActivity.this.c >= 2) {
                youTubePlayerView.b();
            }
        }

        public final void a(YouTubePlayerView youTubePlayerView, String str, YouTubePlayer.OnInitializedListener onInitializedListener) {
            YouTubeBaseActivity youTubeBaseActivity = YouTubeBaseActivity.this;
            youTubePlayerView.a(youTubeBaseActivity, youTubePlayerView, str, onInitializedListener, youTubeBaseActivity.d);
            Bundle unused = YouTubeBaseActivity.this.d = null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String length(short r6, int r7, byte r8) {
        /*
            int r6 = r6 * 175
            int r6 = 178 - r6
            int r7 = r7 * 165
            int r7 = r7 + 11
            byte[] r0 = length
            int r8 = r8 * 45
            int r8 = r8 + 56
            byte[] r1 = new byte[r7]
            int r7 = r7 + -1
            r2 = 0
            if (r0 != 0) goto L_0x0019
            r4 = r8
            r3 = 0
            r8 = r7
            goto L_0x002e
        L_0x0019:
            r3 = 0
        L_0x001a:
            int r6 = r6 + 1
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r7) goto L_0x0027
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L_0x0027:
            int r3 = r3 + 1
            byte r4 = r0[r6]
            r5 = r8
            r8 = r7
            r7 = r5
        L_0x002e:
            int r4 = -r4
            int r7 = r7 + r4
            int r7 = r7 + -2
            r5 = r8
            r8 = r7
            r7 = r5
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.youtube.player.YouTubeBaseActivity.length(short, int, byte):java.lang.String");
    }

    /* access modifiers changed from: package-private */
    public final YouTubePlayerView.b a() {
        int length2;
        int min;
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(-1393513664, oncanceled);
            onCancelLoad.getMin(-1393513664, oncanceled);
        }
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length2)))) {
            onCanceled oncanceled2 = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(-1393513664, oncanceled2);
            onCancelLoad.getMin(-1393513664, oncanceled2);
        }
        return this.f9638a;
    }

    public void onCreate(Bundle bundle) {
        int length2;
        int min;
        int max;
        byte b2 = (byte) length[96];
        byte b3 = (byte) b2;
        String length3 = length(b2, b3, (byte) b3);
        byte b4 = (byte) length[8];
        byte b5 = (byte) b4;
        String length4 = length(b4, b5, (byte) b5);
        Context baseContext = getBaseContext();
        Bundle bundle2 = null;
        Context applicationContext = (baseContext == null || baseContext.getApplicationContext() == null) ? null : baseContext.getApplicationContext();
        if (applicationContext != null) {
            registerOnLoadCanceledListener.setMin().getMax(applicationContext, length3, length4);
        }
        int nextInt = new Random().nextInt(Integer.MAX_VALUE);
        int length5 = dispatchOnCancelled.length(nextInt);
        if (nextInt != length5) {
            onCanceled oncanceled = new onCanceled(nextInt, length5, 1);
            onCancelLoad.setMax(1795222660, oncanceled);
            onCancelLoad.getMin(1795222660, oncanceled);
        }
        Context baseContext2 = getBaseContext();
        Context applicationContext2 = baseContext2 != null ? baseContext2.getApplicationContext() : null;
        if (!(applicationContext2 == null || 1795222660 == (max = dispatchOnCancelled.getMax(applicationContext2, 1795222660)))) {
            onCanceled oncanceled2 = new onCanceled(1795222660, max, 512);
            onCancelLoad.setMax(1795222660, oncanceled2);
            onCancelLoad.getMin(1795222660, oncanceled2);
        }
        Context baseContext3 = getBaseContext();
        Context applicationContext3 = baseContext3 != null ? baseContext3.getApplicationContext() : null;
        if (!(applicationContext3 == null || (length2 = applicationContext3.fileList().length) == (min = dispatchOnCancelled.setMin(applicationContext3, length2)))) {
            onCanceled oncanceled3 = new onCanceled(length2, min, 8);
            onCancelLoad.setMax(1795222660, oncanceled3);
            onCancelLoad.getMin(1795222660, oncanceled3);
        }
        super.onCreate(bundle);
        this.f9638a = new a(this, (byte) 0);
        if (bundle != null) {
            bundle2 = bundle.getBundle("YouTubeBaseActivity.KEY_PLAYER_VIEW_STATE");
        }
        this.d = bundle2;
    }

    public void onDestroy() {
        YouTubePlayerView youTubePlayerView = this.b;
        if (youTubePlayerView != null) {
            youTubePlayerView.b(isFinishing());
        }
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        this.c = 1;
        YouTubePlayerView youTubePlayerView = this.b;
        if (youTubePlayerView != null) {
            youTubePlayerView.c();
        }
        super.onPause();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.c = 2;
        YouTubePlayerView youTubePlayerView = this.b;
        if (youTubePlayerView != null) {
            youTubePlayerView.b();
        }
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        YouTubePlayerView youTubePlayerView = this.b;
        bundle.putBundle("YouTubeBaseActivity.KEY_PLAYER_VIEW_STATE", youTubePlayerView != null ? youTubePlayerView.e() : this.d);
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        this.c = 1;
        YouTubePlayerView youTubePlayerView = this.b;
        if (youTubePlayerView != null) {
            youTubePlayerView.a();
        }
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        this.c = 0;
        YouTubePlayerView youTubePlayerView = this.b;
        if (youTubePlayerView != null) {
            youTubePlayerView.d();
        }
        super.onStop();
    }
}
