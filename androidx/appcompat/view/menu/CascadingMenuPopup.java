package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Parcelable;
import android.os.SystemClock;
import android.transition.Transition;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StyleRes;
import androidx.appcompat.widget.MenuPopupWindow;
import androidx.core.view.ViewCompat;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
import o.ITrustedWebActivityCallback;
import o.RatingCompat;
import o.getExtras;
import o.onEvent;
import o.onExtrasChanged;
import o.onQueueChanged;
import o.onQueueTitleChanged;
import o.setAdapter;

public final class CascadingMenuPopup extends onQueueChanged implements View.OnKeyListener, PopupWindow.OnDismissListener {
    private static final int toFloatRange = ITrustedWebActivityCallback.Stub.equals.toFloatRange;
    private final int FastBitmap$CoordinateSystem;
    private final getExtras Grayscale$Algorithm = new getExtras() {
        public final void getMax(@NonNull onEvent onevent, @NonNull MenuItem menuItem) {
            CascadingMenuPopup.this.getMax.removeCallbacksAndMessages(onevent);
        }

        public final void getMin(@NonNull final onEvent onevent, @NonNull final MenuItem menuItem) {
            final getMax getmax = null;
            CascadingMenuPopup.this.getMax.removeCallbacksAndMessages((Object) null);
            int size = CascadingMenuPopup.this.length.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    i = -1;
                    break;
                } else if (onevent == CascadingMenuPopup.this.length.get(i).setMin) {
                    break;
                } else {
                    i++;
                }
            }
            if (i != -1) {
                int i2 = i + 1;
                if (i2 < CascadingMenuPopup.this.length.size()) {
                    getmax = CascadingMenuPopup.this.length.get(i2);
                }
                CascadingMenuPopup.this.getMax.postAtTime(new Runnable() {
                    public final void run() {
                        if (getmax != null) {
                            CascadingMenuPopup.this.equals = true;
                            getmax.setMin.close(false);
                            CascadingMenuPopup.this.equals = false;
                        }
                        if (menuItem.isEnabled() && menuItem.hasSubMenu()) {
                            onevent.performItemAction(menuItem, 4);
                        }
                    }
                }, onevent, SystemClock.uptimeMillis() + 200);
            }
        }
    };
    private boolean ICustomTabsCallback;
    private View Mean$Arithmetic;
    private int b;
    private boolean create;
    boolean equals;
    private PopupWindow.OnDismissListener extraCallbackWithResult;
    private boolean getCause;
    final Handler getMax;
    final ViewTreeObserver.OnGlobalLayoutListener getMin = new ViewTreeObserver.OnGlobalLayoutListener() {
        public final void onGlobalLayout() {
            if (CascadingMenuPopup.this.getMin() && CascadingMenuPopup.this.length.size() > 0 && !CascadingMenuPopup.this.length.get(0).getMin.equals()) {
                View view = CascadingMenuPopup.this.setMax;
                if (view == null || !view.isShown()) {
                    CascadingMenuPopup.this.length();
                    return;
                }
                for (getMax getmax : CascadingMenuPopup.this.length) {
                    getmax.getMin.b_();
                }
            }
        }
    };
    private final View.OnAttachStateChangeListener hashCode = new View.OnAttachStateChangeListener() {
        public final void onViewAttachedToWindow(View view) {
        }

        public final void onViewDetachedFromWindow(View view) {
            if (CascadingMenuPopup.this.setMin != null) {
                if (!CascadingMenuPopup.this.setMin.isAlive()) {
                    CascadingMenuPopup.this.setMin = view.getViewTreeObserver();
                }
                CascadingMenuPopup.this.setMin.removeGlobalOnLayoutListener(CascadingMenuPopup.this.getMin);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    };
    private int invoke;
    private int invokeSuspend;
    private final int isInside;
    final List<getMax> length = new ArrayList();
    private boolean onMessageChannelReady;
    private int onNavigationEvent;
    private onQueueTitleChanged.setMax onPostMessage;
    View setMax;
    ViewTreeObserver setMin;
    private final int toDoubleRange;
    private final Context toIntRange;
    private final List<onEvent> toString = new ArrayList();
    private int valueOf;
    private final boolean values;

    @Retention(RetentionPolicy.SOURCE)
    public @interface HorizPosition {
    }

    public final boolean flagActionItems() {
        return false;
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
    }

    public final Parcelable onSaveInstanceState() {
        return null;
    }

    public final boolean setMax() {
        return false;
    }

    public CascadingMenuPopup(@NonNull Context context, @NonNull View view, @AttrRes int i, @StyleRes int i2, boolean z) {
        int i3 = 0;
        this.invoke = 0;
        this.invokeSuspend = 0;
        this.toIntRange = context;
        this.Mean$Arithmetic = view;
        this.FastBitmap$CoordinateSystem = i;
        this.toDoubleRange = i2;
        this.values = z;
        this.ICustomTabsCallback = false;
        this.valueOf = ViewCompat.IsOverlapping(view) != 1 ? 1 : i3;
        Resources resources = context.getResources();
        this.isInside = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(ITrustedWebActivityCallback.Stub.getMax.getMin));
        this.getMax = new Handler();
    }

    public final void length(boolean z) {
        this.ICustomTabsCallback = z;
    }

    private MenuPopupWindow toFloatRange() {
        MenuPopupWindow menuPopupWindow = new MenuPopupWindow(this.toIntRange, this.FastBitmap$CoordinateSystem, this.toDoubleRange);
        menuPopupWindow.getMax = this.Grayscale$Algorithm;
        menuPopupWindow.setMax((AdapterView.OnItemClickListener) this);
        menuPopupWindow.length((PopupWindow.OnDismissListener) this);
        menuPopupWindow.setMax(this.Mean$Arithmetic);
        menuPopupWindow.toFloatRange(this.invokeSuspend);
        menuPopupWindow.setMin(true);
        menuPopupWindow.isInside(2);
        return menuPopupWindow;
    }

    public final void b_() {
        if (!getMin()) {
            for (onEvent min : this.toString) {
                setMin(min);
            }
            this.toString.clear();
            View view = this.Mean$Arithmetic;
            this.setMax = view;
            if (view != null) {
                boolean z = this.setMin == null;
                ViewTreeObserver viewTreeObserver = this.setMax.getViewTreeObserver();
                this.setMin = viewTreeObserver;
                if (z) {
                    viewTreeObserver.addOnGlobalLayoutListener(this.getMin);
                }
                this.setMax.addOnAttachStateChangeListener(this.hashCode);
            }
        }
    }

    public final void length() {
        int size = this.length.size();
        if (size > 0) {
            getMax[] getmaxArr = (getMax[]) this.length.toArray(new getMax[size]);
            for (int i = size - 1; i >= 0; i--) {
                getMax getmax = getmaxArr[i];
                if (getmax.getMin.getMin()) {
                    getmax.getMin.length();
                }
            }
        }
    }

    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        length();
        return true;
    }

    private int setMax(int i) {
        List<getMax> list = this.length;
        ListView c_ = list.get(list.size() - 1).getMin.c_();
        int[] iArr = new int[2];
        c_.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.setMax.getWindowVisibleDisplayFrame(rect);
        if (this.valueOf == 1) {
            if (iArr[0] + c_.getWidth() + i > rect.right) {
                return 0;
            }
            return 1;
        } else if (iArr[0] - i < 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public final void length(onEvent onevent) {
        onevent.addMenuPresenter(this, this.toIntRange);
        if (getMin()) {
            setMin(onevent);
        } else {
            this.toString.add(onevent);
        }
    }

    private void setMin(@NonNull onEvent onevent) {
        View view;
        getMax getmax;
        int i;
        int i2;
        int i3;
        LayoutInflater from = LayoutInflater.from(this.toIntRange);
        RatingCompat.StarStyle starStyle = new RatingCompat.StarStyle(onevent, from, this.values, toFloatRange);
        if (!getMin() && this.ICustomTabsCallback) {
            starStyle.setMin = true;
        } else if (getMin()) {
            starStyle.setMin = onQueueChanged.getMax(onevent);
        }
        int length2 = length(starStyle, (ViewGroup) null, this.toIntRange, this.isInside);
        MenuPopupWindow floatRange = toFloatRange();
        floatRange.setMax((ListAdapter) starStyle);
        floatRange.equals(length2);
        floatRange.toFloatRange(this.invokeSuspend);
        if (this.length.size() > 0) {
            List<getMax> list = this.length;
            getmax = list.get(list.size() - 1);
            view = length(getmax, onevent);
        } else {
            getmax = null;
            view = null;
        }
        if (view != null) {
            floatRange.toFloatRange();
            if (Build.VERSION.SDK_INT >= 23) {
                floatRange.IsOverlapping.setEnterTransition((Transition) null);
            }
            int max = setMax(length2);
            boolean z = max == 1;
            this.valueOf = max;
            if (Build.VERSION.SDK_INT >= 26) {
                floatRange.setMax(view);
                i2 = 0;
                i = 0;
            } else {
                int[] iArr = new int[2];
                this.Mean$Arithmetic.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                view.getLocationOnScreen(iArr2);
                if ((this.invokeSuspend & 7) == 5) {
                    iArr[0] = iArr[0] + this.Mean$Arithmetic.getWidth();
                    iArr2[0] = iArr2[0] + view.getWidth();
                }
                i = iArr2[0] - iArr[0];
                i2 = iArr2[1] - iArr[1];
            }
            if ((this.invokeSuspend & 5) != 5) {
                if (z) {
                    length2 = view.getWidth();
                }
                i3 = i - length2;
                floatRange.getMin(i3);
                floatRange.getMin(true);
                floatRange.setMax(i2);
            } else if (!z) {
                length2 = view.getWidth();
                i3 = i - length2;
                floatRange.getMin(i3);
                floatRange.getMin(true);
                floatRange.setMax(i2);
            }
            i3 = i + length2;
            floatRange.getMin(i3);
            floatRange.getMin(true);
            floatRange.setMax(i2);
        } else {
            if (this.create) {
                floatRange.getMin(this.onNavigationEvent);
            }
            if (this.getCause) {
                floatRange.setMax(this.b);
            }
            floatRange.length(this.IsOverlapping);
        }
        this.length.add(new getMax(floatRange, onevent, this.valueOf));
        floatRange.b_();
        ListView c_ = floatRange.c_();
        c_.setOnKeyListener(this);
        if (getmax == null && this.onMessageChannelReady && onevent.getHeaderTitle() != null) {
            FrameLayout frameLayout = (FrameLayout) from.inflate(ITrustedWebActivityCallback.Stub.equals.values, c_, false);
            frameLayout.setEnabled(false);
            ((TextView) frameLayout.findViewById(16908310)).setText(onevent.getHeaderTitle());
            c_.addHeaderView(frameLayout, (Object) null, false);
            floatRange.b_();
        }
    }

    private static MenuItem length(@NonNull onEvent onevent, @NonNull onEvent onevent2) {
        int size = onevent.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = onevent.getItem(i);
            if (item.hasSubMenu() && onevent2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    @Nullable
    private static View length(@NonNull getMax getmax, @NonNull onEvent onevent) {
        int i;
        RatingCompat.StarStyle starStyle;
        int firstVisiblePosition;
        MenuItem length2 = length(getmax.setMin, onevent);
        if (length2 == null) {
            return null;
        }
        ListView c_ = getmax.getMin.c_();
        ListAdapter adapter = c_.getAdapter();
        int i2 = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            i = headerViewListAdapter.getHeadersCount();
            starStyle = (RatingCompat.StarStyle) headerViewListAdapter.getWrappedAdapter();
        } else {
            starStyle = (RatingCompat.StarStyle) adapter;
            i = 0;
        }
        int count = starStyle.getCount();
        while (true) {
            if (i2 >= count) {
                i2 = -1;
                break;
            } else if (length2 == starStyle.getItem(i2)) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 != -1 && (firstVisiblePosition = (i2 + i) - c_.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < c_.getChildCount()) {
            return c_.getChildAt(firstVisiblePosition);
        }
        return null;
    }

    public final boolean getMin() {
        return this.length.size() > 0 && this.length.get(0).getMin.getMin();
    }

    public final void onDismiss() {
        getMax getmax;
        int size = this.length.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                getmax = null;
                break;
            }
            getmax = this.length.get(i);
            if (!getmax.getMin.getMin()) {
                break;
            }
            i++;
        }
        if (getmax != null) {
            getmax.setMin.close(false);
        }
    }

    public final void updateMenuView(boolean z) {
        for (getMax getmax : this.length) {
            ListAdapter adapter = getmax.getMin.c_().getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((RatingCompat.StarStyle) adapter).notifyDataSetChanged();
        }
    }

    public final void setCallback(onQueueTitleChanged.setMax setmax) {
        this.onPostMessage = setmax;
    }

    public final boolean onSubMenuSelected(onExtrasChanged onextraschanged) {
        for (getMax next : this.length) {
            if (onextraschanged == next.setMin) {
                next.getMin.c_().requestFocus();
                return true;
            }
        }
        if (!onextraschanged.hasVisibleItems()) {
            return false;
        }
        length((onEvent) onextraschanged);
        onQueueTitleChanged.setMax setmax = this.onPostMessage;
        if (setmax != null) {
            setmax.setMax(onextraschanged);
        }
        return true;
    }

    public final void getMax(int i) {
        if (this.invoke != i) {
            this.invoke = i;
            this.invokeSuspend = setAdapter.length(i, ViewCompat.IsOverlapping(this.Mean$Arithmetic));
        }
    }

    public final void setMin(@NonNull View view) {
        if (this.Mean$Arithmetic != view) {
            this.Mean$Arithmetic = view;
            this.invokeSuspend = setAdapter.length(this.invoke, ViewCompat.IsOverlapping(view));
        }
    }

    public final void getMax(PopupWindow.OnDismissListener onDismissListener) {
        this.extraCallbackWithResult = onDismissListener;
    }

    public final ListView c_() {
        if (this.length.isEmpty()) {
            return null;
        }
        List<getMax> list = this.length;
        return list.get(list.size() - 1).getMin.c_();
    }

    public final void length(int i) {
        this.create = true;
        this.onNavigationEvent = i;
    }

    public final void getMin(int i) {
        this.getCause = true;
        this.b = i;
    }

    public final void getMin(boolean z) {
        this.onMessageChannelReady = z;
    }

    static class getMax {
        public final int getMax;
        public final MenuPopupWindow getMin;
        public final onEvent setMin;

        public getMax(@NonNull MenuPopupWindow menuPopupWindow, @NonNull onEvent onevent, int i) {
            this.getMin = menuPopupWindow;
            this.setMin = onevent;
            this.getMax = i;
        }
    }

    public final void onCloseMenu(onEvent onevent, boolean z) {
        int i;
        int size = this.length.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (onevent == this.length.get(i2).setMin) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 >= 0) {
            int i3 = i2 + 1;
            if (i3 < this.length.size()) {
                this.length.get(i3).setMin.close(false);
            }
            getMax remove = this.length.remove(i2);
            remove.setMin.removeMenuPresenter(this);
            if (this.equals) {
                MenuPopupWindow menuPopupWindow = remove.getMin;
                if (Build.VERSION.SDK_INT >= 23) {
                    menuPopupWindow.IsOverlapping.setExitTransition((Transition) null);
                }
                remove.getMin.getMax(0);
            }
            remove.getMin.length();
            int size2 = this.length.size();
            if (size2 > 0) {
                i = this.length.get(size2 - 1).getMax;
            } else {
                i = ViewCompat.IsOverlapping(this.Mean$Arithmetic) == 1 ? 0 : 1;
            }
            this.valueOf = i;
            if (size2 == 0) {
                length();
                onQueueTitleChanged.setMax setmax = this.onPostMessage;
                if (setmax != null) {
                    setmax.getMax(onevent, true);
                }
                ViewTreeObserver viewTreeObserver = this.setMin;
                if (viewTreeObserver != null) {
                    if (viewTreeObserver.isAlive()) {
                        this.setMin.removeGlobalOnLayoutListener(this.getMin);
                    }
                    this.setMin = null;
                }
                this.setMax.removeOnAttachStateChangeListener(this.hashCode);
                this.extraCallbackWithResult.onDismiss();
            } else if (z) {
                this.length.get(0).setMin.close(false);
            }
        }
    }
}
