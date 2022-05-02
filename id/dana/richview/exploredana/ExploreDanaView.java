package id.dana.richview.exploredana;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import id.dana.R;
import id.dana.base.BaseActivity;
import id.dana.base.BaseRichView;
import id.dana.contract.exploredana.ExploreDanaModule;
import id.dana.contract.exploredana.PlayerType;
import id.dana.danah5.DanaH5;
import id.dana.media.exploredana.exoplayer.ExoPlayerActivity;
import id.dana.media.exploredana.youtubeplayer.YoutubePlayerActivity;
import java.util.List;
import javax.inject.Inject;
import o.CornerMarkingDataProvider;
import o.DownloadStep;
import o.Ignore;
import o.PrepareException;
import o.TakePictureProcessor;
import o.containsFavoriteMenuItem;
import o.cropBitmap;
import o.getTrimPathStart;
import o.makeHeaderView;
import o.onDetachedFromLayoutParams;
import o.setCancelOnTouchOutside$core;
import o.setShadowResource;
import o.snapshotHit;
import o.stopIgnoring;

public class ExploreDanaView extends BaseRichView implements getTrimPathStart.length {
    public static final String EXPLORE_DANA_ID = "EXPLORE_DANA_ID";
    public static final int EXPLORE_DANA_REQUEST_CODE = CornerMarkingDataProvider.AnonymousClass2.setMax();
    @BindView(2131362864)
    RecyclerView exploreDana;
    @BindView(2131362865)
    ConstraintLayout exploreDanaContainer;
    private DownloadStep.MyPackageDownloadCallback.AnonymousClass1 getMax;
    private onDetachedFromLayoutParams length;
    @Inject
    public getTrimPathStart.getMax presenter;
    private ExploreDanaAdapter setMin;

    public int getLayout() {
        return R.layout.view_exploredana;
    }

    public void onError(String str) {
    }

    public ExploreDanaView(@NonNull Context context) {
        super(context);
    }

    public ExploreDanaView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ExploreDanaView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public ExploreDanaView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public void injectComponent(PrepareException.AnonymousClass1 r4) {
        if (this.getMax == null) {
            snapshotHit.getMin getmin = new snapshotHit.getMin((byte) 0);
            if (r4 != null) {
                getmin.setMax = r4;
                getmin.getMin = new ExploreDanaModule(this);
                stopIgnoring.setMin(getmin.getMin, ExploreDanaModule.class);
                stopIgnoring.setMin(getmin.setMax, PrepareException.AnonymousClass1.class);
                this.getMax = new snapshotHit(getmin.getMin, getmin.setMax, (byte) 0);
            } else {
                throw null;
            }
        }
        this.getMax.setMin(this);
        registerPresenter(this.presenter);
    }

    public void injected(boolean z) {
        if (z) {
            this.presenter.getMax();
        }
    }

    public void setup() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(0);
        this.exploreDana.setLayoutManager(linearLayoutManager);
        this.exploreDana.setItemAnimator(new setShadowResource());
        this.exploreDana.addItemDecoration(new makeHeaderView(getResources().getDimensionPixelOffset(R.dimen.f26372131165291), getResources().getDimensionPixelOffset(R.dimen.f26362131165290), getResources().getDimensionPixelOffset(R.dimen.f26362131165290)));
        getMin();
        this.exploreDana.setAdapter(this.setMin);
        this.exploreDana.setNestedScrollingEnabled(false);
        if (this.length == null) {
            this.length = containsFavoriteMenuItem.getMin(this.exploreDanaContainer, R.layout.view_item_explore_dana_skeleton);
        }
    }

    private void getMin() {
        if (this.setMin == null) {
            ExploreDanaAdapter exploreDanaAdapter = new ExploreDanaAdapter();
            this.setMin = exploreDanaAdapter;
            exploreDanaAdapter.getMax((Ignore.setMin) new cropBitmap(this));
        }
    }

    public void onSuccessGetDana(List<TakePictureProcessor.AnonymousClass7> list) {
        if (isViewBinded() && this.exploreDana != null) {
            getMin();
            this.setMin.getMin(list);
            ConstraintLayout constraintLayout = this.exploreDanaContainer;
            if (constraintLayout != null) {
                constraintLayout.setVisibility(0);
            }
        }
    }

    public void onRead(String str) {
        ExploreDanaAdapter exploreDanaAdapter = this.setMin;
        if (exploreDanaAdapter != null && !TextUtils.isEmpty(str)) {
            List max = exploreDanaAdapter.getMax();
            for (int i = 0; i < max.size(); i++) {
                if (str.equals(((TakePictureProcessor.AnonymousClass7) max.get(i)).getMin)) {
                    exploreDanaAdapter.getMax(i);
                    return;
                }
            }
        }
    }

    public void onEmptyExploreDanaEntityList() {
        ExploreDanaAdapter exploreDanaAdapter = this.setMin;
        if (exploreDanaAdapter != null) {
            exploreDanaAdapter.getMin();
        }
        this.exploreDanaContainer.setVisibility(8);
    }

    public void showProgress() {
        onDetachedFromLayoutParams ondetachedfromlayoutparams = this.length;
        if (ondetachedfromlayoutparams != null) {
            ondetachedfromlayoutparams.getMin();
        }
    }

    public void dismissProgress() {
        onDetachedFromLayoutParams ondetachedfromlayoutparams = this.length;
        if (ondetachedfromlayoutparams != null) {
            ondetachedfromlayoutparams.length();
        }
    }

    /* access modifiers changed from: private */
    public void getMax(String str) {
        if (2 == this.setMin.getItemCount()) {
            this.presenter.setMax(this.setMin.setMax());
        } else {
            this.presenter.setMin(str);
        }
    }

    public void onActivityResult(int i, Intent intent) {
        if (i == -1) {
            Bundle extras = intent.getExtras();
            String str = null;
            if (extras != null) {
                str = extras.getString(EXPLORE_DANA_ID, "");
            }
            getMax(str);
        }
    }

    public static /* synthetic */ void getMax(ExploreDanaView exploreDanaView, int i) {
        Intent intent;
        int itemViewType = exploreDanaView.setMin.getItemViewType(i);
        if (itemViewType == 0) {
            String str = ((TakePictureProcessor.AnonymousClass7) exploreDanaView.setMin.setMin(i)).length;
            final String str2 = ((TakePictureProcessor.AnonymousClass7) exploreDanaView.setMin.setMin(i)).getMin;
            String str3 = ((TakePictureProcessor.AnonymousClass7) exploreDanaView.setMin.setMin(i)).setMax;
            if (PlayerType.H5CONTAINER.equals(str3)) {
                DanaH5.startContainerFullUrl(str, new setCancelOnTouchOutside$core() {
                    public final void onContainerCreated(Bundle bundle) {
                    }

                    public final void onContainerDestroyed(Bundle bundle) {
                        ExploreDanaView.this.getMax(str2);
                    }
                });
                return;
            }
            BaseActivity baseActivity = exploreDanaView.getBaseActivity();
            if (PlayerType.YOUTUBE.equals(str3)) {
                intent = new Intent(exploreDanaView.getBaseActivity(), YoutubePlayerActivity.class);
                intent.putExtra(PlayerType.YOUTUBE, str);
                intent.putExtra(EXPLORE_DANA_ID, str2);
            } else {
                intent = new Intent(exploreDanaView.getBaseActivity(), ExoPlayerActivity.class);
                intent.putExtra(PlayerType.EXOPLAYER, str);
                intent.putExtra(EXPLORE_DANA_ID, str2);
            }
            baseActivity.startActivityForResult(intent, EXPLORE_DANA_REQUEST_CODE);
        } else if (1 == itemViewType) {
            exploreDanaView.enableClick();
            exploreDanaView.presenter.setMax(exploreDanaView.setMin.setMax());
        } else {
            exploreDanaView.enableClick();
        }
    }
}
