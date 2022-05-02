package id.dana.showcase.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewpager.widget.ViewPager;
import butterknife.BindView;
import id.dana.R;
import id.dana.base.BaseRichView;
import id.dana.popup.LockableViewPager;
import java.util.List;
import o.GyroscopeSensorService;
import o.dispatchOnCancelled;
import o.getGatewayUrl;
import o.getGpSignature;
import o.onCancelLoad;
import o.onCanceled;
import o.setGatewayUrl;
import o.setGpSignature;
import o.setStatusBar;

public class PagerContentView extends BaseRichView {
    @BindView(2131362091)
    Button btnLeft;
    @BindView(2131362125)
    Button btnRight;
    private getMin getMax;
    private setStatusBar getMin;
    @BindView(2131363391)
    ImageView ivClose;
    private boolean setMax = true;
    @BindView(2131365915)
    LockableViewPager viewPager;

    public interface getMin {
        void length();

        void setMax();

        void setMax(int i);

        void setMin();
    }

    private static boolean getMax(int i) {
        return i == 0;
    }

    public int getLayout() {
        return R.layout.view_tooltip_pager;
    }

    public PagerContentView(@NonNull Context context) {
        super(context);
    }

    public PagerContentView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PagerContentView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public PagerContentView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public void setPagerContentActionListener(getMin getmin) {
        this.getMax = getmin;
    }

    public void setViewList(@NonNull List<GyroscopeSensorService.SensorChangedListener> list) {
        this.getMin.getMin(list);
        this.getMin.notifyDataSetChanged();
        this.viewPager.post(new setGatewayUrl(this));
    }

    public void setScrollable(boolean z) {
        this.setMax = z;
        this.viewPager.setSwipeable(z);
    }

    private boolean getMax() {
        return this.getMin.getCount() == 1;
    }

    private boolean length(int i) {
        return i == this.getMin.getCount() - 1;
    }

    private void setMin(int i) {
        int max = dispatchOnCancelled.setMax(i);
        if (i != max) {
            onCanceled oncanceled = new onCanceled(i, max, 1);
            onCancelLoad.setMax(190047109, oncanceled);
            onCancelLoad.getMin(190047109, oncanceled);
        }
        if (getMax()) {
            this.btnLeft.setText(R.string.tooltip_skip);
            this.btnRight.setText(R.string.tooltip_finish);
        } else if (getMax(i)) {
            this.btnLeft.setText(R.string.tooltip_skip);
            this.btnRight.setText(R.string.tooltip_next);
        } else if (length(i)) {
            this.btnLeft.setText(R.string.tooltip_prev);
            this.btnRight.setText(R.string.tooltip_finish);
        } else {
            this.btnLeft.setText(R.string.tooltip_prev);
            this.btnRight.setText(R.string.tooltip_next);
        }
    }

    public void setup() {
        this.getMin = new setStatusBar(getContext());
        this.ivClose.setOnClickListener(new getGpSignature(this));
        this.viewPager.setAdapter(this.getMin);
        this.viewPager.setOffscreenPageLimit(3);
        this.viewPager.measure(-1, -2);
        this.viewPager.setSwipeable(this.setMax);
        this.viewPager.addOnPageChangeListener(new ViewPager.setMax() {
            public final void onPageScrollStateChanged(int i) {
            }

            public final void onPageScrolled(int i, float f, int i2) {
            }

            public final void onPageSelected(int i) {
                PagerContentView.access$000(PagerContentView.this, i);
            }
        });
        setMin(0);
        this.btnLeft.setOnClickListener(new setGpSignature(this));
        this.btnRight.setOnClickListener(new getGatewayUrl(this));
    }

    static /* synthetic */ void access$000(PagerContentView pagerContentView, int i) {
        pagerContentView.setMin(i);
        getMin getmin = pagerContentView.getMax;
        if (getmin != null) {
            getmin.setMax(i);
        }
    }

    public static /* synthetic */ void setMin(PagerContentView pagerContentView) {
        int currentItem = pagerContentView.viewPager.getCurrentItem();
        if (currentItem > 0) {
            pagerContentView.viewPager.setCurrentItem(currentItem - 1, pagerContentView.setMax);
            return;
        }
        getMin getmin = pagerContentView.getMax;
        if (getmin != null) {
            getmin.setMax();
        }
    }

    public static /* synthetic */ void length(PagerContentView pagerContentView) {
        getMin getmin;
        int currentItem = pagerContentView.viewPager.getCurrentItem();
        if (currentItem < pagerContentView.getMin.getCount() - 1) {
            pagerContentView.viewPager.setCurrentItem(currentItem + 1, pagerContentView.setMax);
        } else if (pagerContentView.length(currentItem) && (getmin = pagerContentView.getMax) != null) {
            getmin.length();
        }
    }

    public static /* synthetic */ void getMin(PagerContentView pagerContentView) {
        getMin getmin = pagerContentView.getMax;
        if (getmin != null) {
            getmin.setMin();
        }
    }
}
