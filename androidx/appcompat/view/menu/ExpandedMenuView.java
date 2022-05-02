package androidx.appcompat.view.menu;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.annotation.RestrictTo;
import o.RatingCompat;
import o.onEvent;
import o.onSessionDestroyed;
import o.prepareFromUri;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class ExpandedMenuView extends ListView implements onEvent.setMin, onSessionDestroyed, AdapterView.OnItemClickListener {
    private static final int[] getMin = {16842964, 16843049};
    private int getMax;
    private onEvent setMin;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842868);
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        prepareFromUri min = prepareFromUri.getMin(context, attributeSet, getMin, i, 0);
        if (min.setMin(0)) {
            setBackgroundDrawable(min.setMax(0));
        }
        if (min.setMin(1)) {
            setDivider(min.setMax(1));
        }
        min.setMin.recycle();
    }

    public final void initialize(onEvent onevent) {
        this.setMin = onevent;
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    public final boolean invokeItem(RatingCompat ratingCompat) {
        return this.setMin.performItemAction(ratingCompat, 0);
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        invokeItem((RatingCompat) getAdapter().getItem(i));
    }

    public final int getWindowAnimations() {
        return this.getMax;
    }
}
