package id.dana.richview.leaderboardentry;

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
import id.dana.danah5.DanaH5;
import id.dana.di.modules.LeaderboardEntryModule;
import id.dana.model.CdpContentModel;
import javax.inject.Inject;
import o.IntRange;
import o.PrepareException;
import o.RuntimeCheckResult;
import o.evaluate;
import o.getDataType;
import o.getInsetDodgeRect;
import o.isHomePage2;
import o.layoutChildWithAnchor;
import o.onDetachedFromLayoutParams;
import o.parseBehavior;
import o.setTopBackgroundColor;
import o.stopIgnoring;
import o.updateCornerMarking;

public class LeaderboardEntryView extends BaseRichView implements getDataType.getMax {
    @BindView(2131362403)
    ConstraintLayout clContainerLeaderboardEntry;
    private RuntimeCheckResult getMax;
    private String getMin;
    @BindView(2131363503)
    ImageView ivLeaderboardEntry;
    @Inject
    public getDataType.setMax presenter;
    private onDetachedFromLayoutParams setMin;

    public int getLayout() {
        return R.layout.view_leadeboard_entry;
    }

    public void onError(String str) {
    }

    public void setup() {
    }

    public LeaderboardEntryView(@NonNull Context context) {
        super(context);
    }

    public LeaderboardEntryView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LeaderboardEntryView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public LeaderboardEntryView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public void injectComponent(PrepareException.AnonymousClass1 r4) {
        if (this.getMax == null) {
            isHomePage2.length length = new isHomePage2.length((byte) 0);
            if (r4 != null) {
                length.length = r4;
                length.setMax = new LeaderboardEntryModule(this);
                stopIgnoring.setMin(length.setMax, LeaderboardEntryModule.class);
                stopIgnoring.setMin(length.length, PrepareException.AnonymousClass1.class);
                this.getMax = new isHomePage2(length.setMax, length.length, (byte) 0);
            } else {
                throw null;
            }
        }
        this.getMax.setMin(this);
        registerPresenter(this.presenter);
    }

    public void injected(boolean z) {
        if (z) {
            this.presenter.length();
        }
    }

    public void showProgress() {
        onDetachedFromLayoutParams ondetachedfromlayoutparams = this.setMin;
        if (ondetachedfromlayoutparams == null) {
            getInsetDodgeRect.setMax setmax = new getInsetDodgeRect.setMax(this.ivLeaderboardEntry);
            setmax.getMax = R.layout.view_leaderboard_entry_skeleton;
            setmax.setMax = 1500;
            setmax.length = true;
            setmax.setMin = IntRange.setMax(setmax.getMin.getContext(), R.color.f24782131100433);
            setmax.isInside = 0;
            getInsetDodgeRect getinsetdodgerect = new getInsetDodgeRect(setmax, (byte) 0);
            getinsetdodgerect.getMin();
            this.setMin = getinsetdodgerect;
            return;
        }
        ondetachedfromlayoutparams.getMin();
    }

    public void dismissProgress() {
        onDetachedFromLayoutParams ondetachedfromlayoutparams = this.setMin;
        if (ondetachedfromlayoutparams != null) {
            ondetachedfromlayoutparams.length();
        }
    }

    public void onGetLeaderBoardSuccess(CdpContentModel cdpContentModel) {
        if (cdpContentModel != null && setTopBackgroundColor.getMin(getContext())) {
            this.clContainerLeaderboardEntry.setVisibility(0);
            this.getMin = cdpContentModel.toDoubleRange;
            this.presenter.setMin();
            ((updateCornerMarking) Glide.getMax(getContext())).setMax(cdpContentModel.setMax).getMax(new parseBehavior<Drawable>() {
                public final boolean onLoadFailed(@Nullable GlideException glideException, Object obj, layoutChildWithAnchor<Drawable> layoutchildwithanchor, boolean z) {
                    return false;
                }

                public final /* bridge */ /* synthetic */ boolean onResourceReady(Object obj, Object obj2, layoutChildWithAnchor layoutchildwithanchor, DataSource dataSource, boolean z) {
                    return false;
                }
            }).setMax(evaluate.setMin).length(this.ivLeaderboardEntry);
        }
    }

    public void onCheckLeaderBoardFeatureSuccess(boolean z) {
        if (z) {
            this.presenter.getMax();
        }
    }

    @OnClick({2131363503})
    public void onClickEntry() {
        DanaH5.startContainerFullUrl(this.getMin);
    }
}
