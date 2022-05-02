package o;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import o.RatingCompat;

public abstract class onQueueChanged implements onRepeatModeChanged, onQueueTitleChanged, AdapterView.OnItemClickListener {
    public Rect IsOverlapping;

    public boolean collapseItemActionView(onEvent onevent, RatingCompat ratingCompat) {
        return false;
    }

    public boolean expandItemActionView(onEvent onevent, RatingCompat ratingCompat) {
        return false;
    }

    public int getId() {
        return 0;
    }

    public abstract void getMax(int i);

    public abstract void getMax(PopupWindow.OnDismissListener onDismissListener);

    public abstract void getMin(int i);

    public abstract void getMin(boolean z);

    public void initForMenu(@NonNull Context context, @Nullable onEvent onevent) {
    }

    public abstract void length(int i);

    public abstract void length(onEvent onevent);

    public abstract void length(boolean z);

    /* access modifiers changed from: protected */
    public boolean setMax() {
        return true;
    }

    public abstract void setMin(View view);

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        RatingCompat.StarStyle starStyle;
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        if (listAdapter instanceof HeaderViewListAdapter) {
            starStyle = (RatingCompat.StarStyle) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter();
        } else {
            starStyle = (RatingCompat.StarStyle) listAdapter;
        }
        starStyle.length.performItemAction((MenuItem) listAdapter.getItem(i), this, setMax() ? 0 : 4);
    }

    protected static int length(ListAdapter listAdapter, ViewGroup viewGroup, Context context, int i) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        View view = null;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = listAdapter.getItemViewType(i4);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            if (viewGroup == null) {
                viewGroup = new FrameLayout(context);
            }
            view = listAdapter.getView(i4, view, viewGroup);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i) {
                return i;
            }
            if (measuredWidth > i2) {
                i2 = measuredWidth;
            }
        }
        return i2;
    }

    public static boolean getMax(onEvent onevent) {
        int size = onevent.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = onevent.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }
}
