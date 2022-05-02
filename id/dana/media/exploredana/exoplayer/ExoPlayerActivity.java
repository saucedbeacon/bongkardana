package id.dana.media.exploredana.exoplayer;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import butterknife.BindView;
import com.google.android.exoplayer2.source.ExtractorMediaSource;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.hls.HlsMediaSource;
import com.google.android.exoplayer2.ui.PlayerView;
import id.dana.R;
import id.dana.base.BaseActivity;
import id.dana.contract.exploredana.PlayerType;
import id.dana.richview.exploredana.ExploreDanaView;
import javax.inject.Inject;
import o.DownloadStep;
import o.PrepareException;
import o.RVResourcePresetProxy;
import o.SystemInfoBridgeExtension;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;
import o.stopIgnoring;

public class ExoPlayerActivity extends BaseActivity {
    @Inject
    public SystemInfoBridgeExtension.AnonymousClass1 exoPlayerManager;
    private DownloadStep.MyPluginDownloadCallback.AnonymousClass1 getMin;
    @BindView(2131365802)
    PlayerView playerView;
    private String setMax;

    public void configToolbar() {
        int length;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (applicationContext != null && (length = applicationContext.fileList().length) != (min = dispatchOnCancelled.getMin(applicationContext, length))) {
            onCanceled oncanceled = new onCanceled(length, min, 32);
            onCancelLoad.setMax(934832005, oncanceled);
            onCancelLoad.getMin(934832005, oncanceled);
        }
    }

    public int getLayout() {
        return R.layout.content_explore_dana_player;
    }

    public void onBackPressed() {
        this.exoPlayerManager.getMax.stop();
        Intent intent = new Intent();
        intent.putExtra(ExploreDanaView.EXPLORE_DANA_ID, this.setMax);
        setResult(-1, intent);
        finish();
    }

    public void init() {
        MediaSource mediaSource;
        if (this.getMin == null) {
            RVResourcePresetProxy.PresetPackage.length length = new RVResourcePresetProxy.PresetPackage.length((byte) 0);
            PrepareException.AnonymousClass1 applicationComponent = getApplicationComponent();
            if (applicationComponent != null) {
                length.setMax = applicationComponent;
                stopIgnoring.setMin(length.setMax, PrepareException.AnonymousClass1.class);
                this.getMin = new RVResourcePresetProxy.PresetPackage(length.setMax, (byte) 0);
            } else {
                throw null;
            }
        }
        this.getMin.length(this);
        String stringExtra = getIntent().getStringExtra(PlayerType.EXOPLAYER);
        this.setMax = getIntent().getStringExtra(ExploreDanaView.EXPLORE_DANA_ID);
        this.playerView.setPlayer(this.exoPlayerManager.getMin.getPlayer());
        SystemInfoBridgeExtension.AnonymousClass1 r1 = this.exoPlayerManager;
        r1.setMax = stringExtra;
        Uri parse = Uri.parse(r1.setMax);
        if (r1.setMax.toUpperCase().contains("EXPLOREDANA")) {
            mediaSource = new HlsMediaSource.Factory(r1.length).createMediaSource(parse);
        } else {
            mediaSource = new ExtractorMediaSource.Factory(r1.length).createMediaSource(Uri.parse(stringExtra));
        }
        r1.getMax.prepare(mediaSource);
        r1.getMax.setPlayWhenReady(true);
    }
}
