package androidx.core.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import o.getDelegate;
import o.onPanelClosed;
import o.onSupportContentChanged;
import o.supportShouldUpRecreateTask;

public class ContentLoadingProgressBar extends ProgressBar {
    private final Runnable getMax;
    boolean mDismissed;
    boolean mPostedHide;
    boolean mPostedShow;
    long mStartTime;
    private final Runnable setMax;

    public ContentLoadingProgressBar(@NonNull Context context) {
        this(context, (AttributeSet) null);
    }

    public ContentLoadingProgressBar(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.mStartTime = -1;
        this.mPostedHide = false;
        this.mPostedShow = false;
        this.mDismissed = false;
        this.getMax = new supportShouldUpRecreateTask(this);
        this.setMax = new onSupportContentChanged(this);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        removeCallbacks(this.getMax);
        removeCallbacks(this.setMax);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.getMax);
        removeCallbacks(this.setMax);
    }

    public void hide() {
        post(new getDelegate(this));
    }

    public void show() {
        post(new onPanelClosed(this));
    }

    public static /* synthetic */ void getMin(ContentLoadingProgressBar contentLoadingProgressBar) {
        contentLoadingProgressBar.mPostedShow = false;
        if (!contentLoadingProgressBar.mDismissed) {
            contentLoadingProgressBar.mStartTime = System.currentTimeMillis();
            contentLoadingProgressBar.setVisibility(0);
        }
    }

    public static /* synthetic */ void setMin(ContentLoadingProgressBar contentLoadingProgressBar) {
        contentLoadingProgressBar.mDismissed = true;
        contentLoadingProgressBar.removeCallbacks(contentLoadingProgressBar.setMax);
        contentLoadingProgressBar.mPostedShow = false;
        long currentTimeMillis = System.currentTimeMillis();
        long j = contentLoadingProgressBar.mStartTime;
        long j2 = currentTimeMillis - j;
        if (j2 >= 500 || j == -1) {
            contentLoadingProgressBar.setVisibility(8);
        } else if (!contentLoadingProgressBar.mPostedHide) {
            contentLoadingProgressBar.postDelayed(contentLoadingProgressBar.getMax, 500 - j2);
            contentLoadingProgressBar.mPostedHide = true;
        }
    }

    public static /* synthetic */ void getMax(ContentLoadingProgressBar contentLoadingProgressBar) {
        contentLoadingProgressBar.mStartTime = -1;
        contentLoadingProgressBar.mDismissed = false;
        contentLoadingProgressBar.removeCallbacks(contentLoadingProgressBar.getMax);
        contentLoadingProgressBar.mPostedHide = false;
        if (!contentLoadingProgressBar.mPostedShow) {
            contentLoadingProgressBar.postDelayed(contentLoadingProgressBar.setMax, 500);
            contentLoadingProgressBar.mPostedShow = true;
        }
    }

    public static /* synthetic */ void length(ContentLoadingProgressBar contentLoadingProgressBar) {
        contentLoadingProgressBar.mPostedHide = false;
        contentLoadingProgressBar.mStartTime = -1;
        contentLoadingProgressBar.setVisibility(8);
    }
}
