package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.lang.reflect.Method;
import o.RatingCompat;
import o.getExtras;
import o.onEvent;
import o.setVolumeTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class MenuPopupWindow extends ListPopupWindow implements getExtras {
    private static Method setMax;
    public getExtras getMax;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                setMax = PopupWindow.class.getDeclaredMethod("setTouchModal", new Class[]{Boolean.TYPE});
            }
        } catch (NoSuchMethodException unused) {
        }
    }

    public MenuPopupWindow(@NonNull Context context, int i, int i2) {
        super(context, (AttributeSet) null, i, i2);
    }

    /* access modifiers changed from: package-private */
    @NonNull
    public final setVolumeTo setMin(Context context, boolean z) {
        MenuDropDownListView menuDropDownListView = new MenuDropDownListView(context, z);
        menuDropDownListView.setHoverListener(this);
        return menuDropDownListView;
    }

    public final void toFloatRange() {
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = setMax;
            if (method != null) {
                try {
                    method.invoke(this.IsOverlapping, new Object[]{Boolean.FALSE});
                } catch (Exception unused) {
                }
            }
        } else {
            this.IsOverlapping.setTouchModal(false);
        }
    }

    public final void getMin(@NonNull onEvent onevent, @NonNull MenuItem menuItem) {
        getExtras getextras = this.getMax;
        if (getextras != null) {
            getextras.getMin(onevent, menuItem);
        }
    }

    public final void getMax(@NonNull onEvent onevent, @NonNull MenuItem menuItem) {
        getExtras getextras = this.getMax;
        if (getextras != null) {
            getextras.getMax(onevent, menuItem);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static class MenuDropDownListView extends setVolumeTo {
        private MenuItem getMax;
        final int mAdvanceKey;
        final int mRetreatKey;
        private getExtras setMin;

        public /* bridge */ /* synthetic */ boolean hasFocus() {
            return super.hasFocus();
        }

        public /* bridge */ /* synthetic */ boolean hasWindowFocus() {
            return super.hasWindowFocus();
        }

        public /* bridge */ /* synthetic */ boolean isFocused() {
            return super.isFocused();
        }

        public /* bridge */ /* synthetic */ boolean isInTouchMode() {
            return super.isInTouchMode();
        }

        public /* bridge */ /* synthetic */ int lookForSelectablePosition(int i, boolean z) {
            return super.lookForSelectablePosition(i, z);
        }

        public /* bridge */ /* synthetic */ int measureHeightOfChildrenCompat(int i, int i2, int i3, int i4, int i5) {
            return super.measureHeightOfChildrenCompat(i, i2, i3, i4, i5);
        }

        public /* bridge */ /* synthetic */ boolean onForwardedEvent(MotionEvent motionEvent, int i) {
            return super.onForwardedEvent(motionEvent, i);
        }

        public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
            return super.onTouchEvent(motionEvent);
        }

        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }

        public MenuDropDownListView(Context context, boolean z) {
            super(context, z);
            Configuration configuration = context.getResources().getConfiguration();
            if (Build.VERSION.SDK_INT < 17 || 1 != configuration.getLayoutDirection()) {
                this.mAdvanceKey = 22;
                this.mRetreatKey = 21;
                return;
            }
            this.mAdvanceKey = 21;
            this.mRetreatKey = 22;
        }

        public void setHoverListener(getExtras getextras) {
            this.setMin = getextras;
        }

        public void clearSelection() {
            setSelection(-1);
        }

        public boolean onKeyDown(int i, KeyEvent keyEvent) {
            RatingCompat.StarStyle starStyle;
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i == this.mAdvanceKey) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            } else if (listMenuItemView == null || i != this.mRetreatKey) {
                return super.onKeyDown(i, keyEvent);
            } else {
                setSelection(-1);
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    starStyle = (RatingCompat.StarStyle) ((HeaderViewListAdapter) adapter).getWrappedAdapter();
                } else {
                    starStyle = (RatingCompat.StarStyle) adapter;
                }
                starStyle.length.close(false);
                return true;
            }
        }

        public boolean onHoverEvent(MotionEvent motionEvent) {
            int i;
            RatingCompat.StarStyle starStyle;
            int pointToPosition;
            int i2;
            if (this.setMin != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i = headerViewListAdapter.getHeadersCount();
                    starStyle = (RatingCompat.StarStyle) headerViewListAdapter.getWrappedAdapter();
                } else {
                    i = 0;
                    starStyle = (RatingCompat.StarStyle) adapter;
                }
                RatingCompat ratingCompat = null;
                if (motionEvent.getAction() != 10 && (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) != -1 && (i2 = pointToPosition - i) >= 0 && i2 < starStyle.getCount()) {
                    ratingCompat = starStyle.getItem(i2);
                }
                MenuItem menuItem = this.getMax;
                if (menuItem != ratingCompat) {
                    onEvent onevent = starStyle.length;
                    if (menuItem != null) {
                        this.setMin.getMax(onevent, menuItem);
                    }
                    this.getMax = ratingCompat;
                    if (ratingCompat != null) {
                        this.setMin.getMin(onevent, ratingCompat);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }
    }
}
