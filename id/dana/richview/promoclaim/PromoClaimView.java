package id.dana.richview.promoclaim;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import butterknife.BindView;
import butterknife.OnClick;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import id.dana.R;
import id.dana.base.BaseRichView;
import id.dana.di.modules.PromoClaimModule;
import javax.inject.Inject;
import o.IntRange;
import o.PluginResourcePackage;
import o.PrepareException;
import o.getInsetDodgeRect;
import o.layoutChildWithAnchor;
import o.onDetachedFromLayoutParams;
import o.openRecordMode;
import o.parseBehavior;
import o.stopIgnoring;
import o.updateCornerMarking;

public class PromoClaimView extends BaseRichView implements openRecordMode.setMax {
    @BindView(2131362403)
    ConstraintLayout clContainer;
    @BindView(2131363503)
    ImageView imageView;
    @Inject
    public openRecordMode.setMin presenter;
    private onDetachedFromLayoutParams setMax;

    public int getLayout() {
        return R.layout.view_leadeboard_entry;
    }

    public void injected(boolean z) {
    }

    public void onError(String str) {
    }

    public PromoClaimView(@NonNull Context context) {
        super(context);
    }

    public PromoClaimView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PromoClaimView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public PromoClaimView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public void showProgress() {
        onDetachedFromLayoutParams ondetachedfromlayoutparams = this.setMax;
        if (ondetachedfromlayoutparams == null) {
            getInsetDodgeRect.setMax setmax = new getInsetDodgeRect.setMax(this.clContainer);
            setmax.getMax = R.layout.view_leaderboard_entry_skeleton;
            setmax.setMax = 1500;
            setmax.length = true;
            setmax.setMin = IntRange.setMax(setmax.getMin.getContext(), R.color.f24782131100433);
            setmax.isInside = 0;
            getInsetDodgeRect getinsetdodgerect = new getInsetDodgeRect(setmax, (byte) 0);
            getinsetdodgerect.getMin();
            this.setMax = getinsetdodgerect;
            return;
        }
        ondetachedfromlayoutparams.getMin();
    }

    public void dismissProgress() {
        onDetachedFromLayoutParams ondetachedfromlayoutparams = this.setMax;
        if (ondetachedfromlayoutparams != null) {
            ondetachedfromlayoutparams.length();
        }
    }

    public void setup() {
        this.presenter.setMin();
    }

    public void onLoadBanner(String str) {
        ((updateCornerMarking) Glide.getMax(getContext())).setMax(str).getMax(new parseBehavior<Drawable>() {
            public final /* bridge */ /* synthetic */ boolean onResourceReady(Object obj, Object obj2, layoutChildWithAnchor layoutchildwithanchor, DataSource dataSource, boolean z) {
                return false;
            }

            public final boolean onLoadFailed(@Nullable GlideException glideException, Object obj, layoutChildWithAnchor<Drawable> layoutchildwithanchor, boolean z) {
                PromoClaimView.this.enableBanner(false);
                return false;
            }
        }).length(this.imageView);
    }

    public void enableBanner(boolean z) {
        this.clContainer.setVisibility(z ? 0 : 8);
        if (!z) {
            this.setMax.length();
        }
    }

    /* access modifiers changed from: package-private */
    @OnClick({2131362403})
    public void onClick() {
        this.presenter.getMin();
    }

    public void injectComponent(PrepareException.AnonymousClass1 r4) {
        PluginResourcePackage.MyPluginDownloadCallback.length length = new PluginResourcePackage.MyPluginDownloadCallback.length((byte) 0);
        if (r4 != null) {
            length.length = r4;
            length.setMin = new PromoClaimModule(this);
            stopIgnoring.setMin(length.setMin, PromoClaimModule.class);
            stopIgnoring.setMin(length.length, PrepareException.AnonymousClass1.class);
            new PluginResourcePackage.MyPluginDownloadCallback(length.setMin, length.length, (byte) 0).getMin(this);
            registerPresenter(this.presenter);
            return;
        }
        throw null;
    }
}
