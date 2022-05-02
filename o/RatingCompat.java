package o;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.ExpandedMenuView;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;
import o.ITrustedWebActivityCallback;
import o.RequiresPermission;
import o.RestrictTo;
import o.getSmallIconId;
import o.onQueueTitleChanged;
import o.onSessionDestroyed;
import o.setNeutralButtonIcon;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class RatingCompat implements RestrictTo.Scope {
    private CharSequence FastBitmap$CoordinateSystem;
    private Drawable Grayscale$Algorithm;
    private ColorStateList ICustomTabsCallback = null;
    private MenuItem.OnActionExpandListener ICustomTabsCallback$Default;
    public int IsOverlapping = 16;
    private int Mean$Arithmetic = 0;
    private CharSequence b;
    private MenuItem.OnMenuItemClickListener create;
    public setNeutralButtonIcon equals;
    private View extraCallback;
    private boolean extraCallbackWithResult = false;
    private PorterDuff.Mode getCause = null;
    public onEvent getMax;
    final int getMin;
    private final int hashCode;
    private Runnable invoke;
    private char invokeSuspend;
    public boolean isInside = false;
    public int length = 4096;
    private boolean onMessageChannelReady = false;
    private CharSequence onNavigationEvent;
    private int onPostMessage = 0;
    private boolean onRelationshipValidationResult = false;
    public onExtrasChanged setMax;
    public int setMin = 4096;
    private CharSequence toDoubleRange;
    private final int toFloatRange;
    ContextMenu.ContextMenuInfo toIntRange;
    private final int toString;
    private char valueOf;
    private Intent values;

    @androidx.annotation.RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public final class StarStyle extends BaseAdapter {
        private final boolean getMax;
        private int getMin = -1;
        public onEvent length;
        private final LayoutInflater setMax;
        public boolean setMin;
        private final int toFloatRange;

        public final long getItemId(int i) {
            return (long) i;
        }

        public StarStyle(onEvent onevent, LayoutInflater layoutInflater, boolean z, int i) {
            this.getMax = z;
            this.setMax = layoutInflater;
            this.length = onevent;
            this.toFloatRange = i;
            setMax();
        }

        public final int getCount() {
            ArrayList<RatingCompat> nonActionItems = this.getMax ? this.length.getNonActionItems() : this.length.getVisibleItems();
            if (this.getMin < 0) {
                return nonActionItems.size();
            }
            return nonActionItems.size() - 1;
        }

        /* renamed from: setMin */
        public final RatingCompat getItem(int i) {
            ArrayList<RatingCompat> nonActionItems = this.getMax ? this.length.getNonActionItems() : this.length.getVisibleItems();
            int i2 = this.getMin;
            if (i2 >= 0 && i >= i2) {
                i++;
            }
            return nonActionItems.get(i);
        }

        public final View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                view = this.setMax.inflate(this.toFloatRange, viewGroup, false);
            }
            int groupId = getItem(i).getGroupId();
            int i2 = i - 1;
            ListMenuItemView listMenuItemView = (ListMenuItemView) view;
            listMenuItemView.setGroupDividerEnabled(this.length.isGroupDividerEnabled() && groupId != (i2 >= 0 ? getItem(i2).getGroupId() : groupId));
            onSessionDestroyed.setMax setmax = (onSessionDestroyed.setMax) view;
            if (this.setMin) {
                listMenuItemView.setForceShowIcon(true);
            }
            setmax.initialize(getItem(i), 0);
            return view;
        }

        private void setMax() {
            RatingCompat expandedItem = this.length.getExpandedItem();
            if (expandedItem != null) {
                ArrayList<RatingCompat> nonActionItems = this.length.getNonActionItems();
                int size = nonActionItems.size();
                for (int i = 0; i < size; i++) {
                    if (nonActionItems.get(i) == expandedItem) {
                        this.getMin = i;
                        return;
                    }
                }
            }
            this.getMin = -1;
        }

        public final void notifyDataSetChanged() {
            setMax();
            super.notifyDataSetChanged();
        }
    }

    @androidx.annotation.RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public final class Style implements onQueueTitleChanged, AdapterView.OnItemClickListener {
        private int IsOverlapping;
        int equals;
        public LayoutInflater getMax;
        onEvent getMin;
        int isInside;
        int length;
        Context setMax;
        public ExpandedMenuView setMin;
        private onQueueTitleChanged.setMax toFloatRange;
        public setMax toIntRange;

        public final boolean collapseItemActionView(onEvent onevent, RatingCompat ratingCompat) {
            return false;
        }

        public final boolean expandItemActionView(onEvent onevent, RatingCompat ratingCompat) {
            return false;
        }

        public final boolean flagActionItems() {
            return false;
        }

        public Style(Context context, int i) {
            this(i);
            this.setMax = context;
            this.getMax = LayoutInflater.from(context);
        }

        private Style(int i) {
            this.isInside = i;
            this.equals = 0;
        }

        public final void initForMenu(Context context, onEvent onevent) {
            if (this.equals != 0) {
                ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, this.equals);
                this.setMax = contextThemeWrapper;
                this.getMax = LayoutInflater.from(contextThemeWrapper);
            } else if (this.setMax != null) {
                this.setMax = context;
                if (this.getMax == null) {
                    this.getMax = LayoutInflater.from(context);
                }
            }
            this.getMin = onevent;
            setMax setmax = this.toIntRange;
            if (setmax != null) {
                setmax.notifyDataSetChanged();
            }
        }

        public final void updateMenuView(boolean z) {
            setMax setmax = this.toIntRange;
            if (setmax != null) {
                setmax.notifyDataSetChanged();
            }
        }

        public final void setCallback(onQueueTitleChanged.setMax setmax) {
            this.toFloatRange = setmax;
        }

        public final boolean onSubMenuSelected(onExtrasChanged onextraschanged) {
            if (!onextraschanged.hasVisibleItems()) {
                return false;
            }
            IMediaControllerCallback iMediaControllerCallback = new IMediaControllerCallback(onextraschanged);
            onEvent onevent = iMediaControllerCallback.getMin;
            getSmallIconId.length length2 = new getSmallIconId.length(onevent.getContext());
            iMediaControllerCallback.setMax = new Style(length2.getContext(), ITrustedWebActivityCallback.Stub.equals.hashCode);
            iMediaControllerCallback.setMax.setCallback(iMediaControllerCallback);
            iMediaControllerCallback.getMin.addMenuPresenter(iMediaControllerCallback.setMax);
            Style style = iMediaControllerCallback.setMax;
            if (style.toIntRange == null) {
                style.toIntRange = new setMax();
            }
            length2.setAdapter(style.toIntRange, iMediaControllerCallback);
            View headerView = onevent.getHeaderView();
            if (headerView != null) {
                length2.setCustomTitle(headerView);
            } else {
                length2.setIcon(onevent.getHeaderIcon()).setTitle(onevent.getHeaderTitle());
            }
            length2.setOnKeyListener(iMediaControllerCallback);
            iMediaControllerCallback.getMax = length2.create();
            iMediaControllerCallback.getMax.setOnDismissListener(iMediaControllerCallback);
            WindowManager.LayoutParams attributes = iMediaControllerCallback.getMax.getWindow().getAttributes();
            attributes.type = 1003;
            attributes.flags |= 131072;
            iMediaControllerCallback.getMax.show();
            onQueueTitleChanged.setMax setmax = this.toFloatRange;
            if (setmax == null) {
                return true;
            }
            setmax.setMax(onextraschanged);
            return true;
        }

        public final void onCloseMenu(onEvent onevent, boolean z) {
            onQueueTitleChanged.setMax setmax = this.toFloatRange;
            if (setmax != null) {
                setmax.getMax(onevent, z);
            }
        }

        public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            this.getMin.performItemAction(this.toIntRange.getItem(i), this, 0);
        }

        public final int getId() {
            return this.IsOverlapping;
        }

        public final Parcelable onSaveInstanceState() {
            if (this.setMin == null) {
                return null;
            }
            Bundle bundle = new Bundle();
            SparseArray sparseArray = new SparseArray();
            ExpandedMenuView expandedMenuView = this.setMin;
            if (expandedMenuView != null) {
                expandedMenuView.saveHierarchyState(sparseArray);
            }
            bundle.putSparseParcelableArray("android:menu:list", sparseArray);
            return bundle;
        }

        public final void onRestoreInstanceState(Parcelable parcelable) {
            SparseArray sparseParcelableArray = ((Bundle) parcelable).getSparseParcelableArray("android:menu:list");
            if (sparseParcelableArray != null) {
                this.setMin.restoreHierarchyState(sparseParcelableArray);
            }
        }

        public class setMax extends BaseAdapter {
            private int setMin = -1;

            public final long getItemId(int i) {
                return (long) i;
            }

            public setMax() {
                getMin();
            }

            public final int getCount() {
                int size = Style.this.getMin.getNonActionItems().size() - Style.this.length;
                return this.setMin < 0 ? size : size - 1;
            }

            /* renamed from: length */
            public final RatingCompat getItem(int i) {
                ArrayList<RatingCompat> nonActionItems = Style.this.getMin.getNonActionItems();
                int i2 = i + Style.this.length;
                int i3 = this.setMin;
                if (i3 >= 0 && i2 >= i3) {
                    i2++;
                }
                return nonActionItems.get(i2);
            }

            public final View getView(int i, View view, ViewGroup viewGroup) {
                if (view == null) {
                    view = Style.this.getMax.inflate(Style.this.isInside, viewGroup, false);
                }
                ((onSessionDestroyed.setMax) view).initialize(getItem(i), 0);
                return view;
            }

            private void getMin() {
                RatingCompat expandedItem = Style.this.getMin.getExpandedItem();
                if (expandedItem != null) {
                    ArrayList<RatingCompat> nonActionItems = Style.this.getMin.getNonActionItems();
                    int size = nonActionItems.size();
                    for (int i = 0; i < size; i++) {
                        if (nonActionItems.get(i) == expandedItem) {
                            this.setMin = i;
                            return;
                        }
                    }
                }
                this.setMin = -1;
            }

            public final void notifyDataSetChanged() {
                getMin();
                super.notifyDataSetChanged();
            }
        }
    }

    RatingCompat(onEvent onevent, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.getMax = onevent;
        this.toFloatRange = i2;
        this.hashCode = i;
        this.toString = i3;
        this.getMin = i4;
        this.FastBitmap$CoordinateSystem = charSequence;
        this.onPostMessage = i5;
    }

    public final boolean setMin() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.create;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        onEvent onevent = this.getMax;
        if (onevent.dispatchMenuItemSelected(onevent, this)) {
            return true;
        }
        Runnable runnable = this.invoke;
        if (runnable != null) {
            runnable.run();
            return true;
        }
        if (this.values != null) {
            try {
                this.getMax.getContext().startActivity(this.values);
                return true;
            } catch (ActivityNotFoundException unused) {
            }
        }
        setNeutralButtonIcon setneutralbuttonicon = this.equals;
        if (setneutralbuttonicon == null || !setneutralbuttonicon.getMin()) {
            return false;
        }
        return true;
    }

    public final boolean isEnabled() {
        return (this.IsOverlapping & 16) != 0;
    }

    public final MenuItem setEnabled(boolean z) {
        if (z) {
            this.IsOverlapping |= 16;
        } else {
            this.IsOverlapping &= -17;
        }
        this.getMax.onItemsChanged(false);
        return this;
    }

    public final int getGroupId() {
        return this.hashCode;
    }

    @ViewDebug.CapturedViewProperty
    public final int getItemId() {
        return this.toFloatRange;
    }

    public final int getOrder() {
        return this.toString;
    }

    public final Intent getIntent() {
        return this.values;
    }

    public final MenuItem setIntent(Intent intent) {
        this.values = intent;
        return this;
    }

    public final char getAlphabeticShortcut() {
        return this.valueOf;
    }

    public final MenuItem setAlphabeticShortcut(char c) {
        if (this.valueOf == c) {
            return this;
        }
        this.valueOf = Character.toLowerCase(c);
        this.getMax.onItemsChanged(false);
        return this;
    }

    public final MenuItem setAlphabeticShortcut(char c, int i) {
        if (this.valueOf == c && this.setMin == i) {
            return this;
        }
        this.valueOf = Character.toLowerCase(c);
        this.setMin = KeyEvent.normalizeMetaState(i);
        this.getMax.onItemsChanged(false);
        return this;
    }

    public final int getAlphabeticModifiers() {
        return this.setMin;
    }

    public final char getNumericShortcut() {
        return this.invokeSuspend;
    }

    public final int getNumericModifiers() {
        return this.length;
    }

    public final MenuItem setNumericShortcut(char c) {
        if (this.invokeSuspend == c) {
            return this;
        }
        this.invokeSuspend = c;
        this.getMax.onItemsChanged(false);
        return this;
    }

    public final MenuItem setNumericShortcut(char c, int i) {
        if (this.invokeSuspend == c && this.length == i) {
            return this;
        }
        this.invokeSuspend = c;
        this.length = KeyEvent.normalizeMetaState(i);
        this.getMax.onItemsChanged(false);
        return this;
    }

    public final MenuItem setShortcut(char c, char c2) {
        this.invokeSuspend = c;
        this.valueOf = Character.toLowerCase(c2);
        this.getMax.onItemsChanged(false);
        return this;
    }

    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.invokeSuspend = c;
        this.length = KeyEvent.normalizeMetaState(i);
        this.valueOf = Character.toLowerCase(c2);
        this.setMin = KeyEvent.normalizeMetaState(i2);
        this.getMax.onItemsChanged(false);
        return this;
    }

    public final char getMin() {
        return this.getMax.isQwertyMode() ? this.valueOf : this.invokeSuspend;
    }

    public static void length(StringBuilder sb, int i, int i2, String str) {
        if ((i & i2) == i2) {
            sb.append(str);
        }
    }

    public final boolean length() {
        return this.getMax.isShortcutsVisible() && getMin() != 0;
    }

    public final SubMenu getSubMenu() {
        return this.setMax;
    }

    public final boolean hasSubMenu() {
        return this.setMax != null;
    }

    @ViewDebug.CapturedViewProperty
    public final CharSequence getTitle() {
        return this.FastBitmap$CoordinateSystem;
    }

    public final MenuItem setTitle(CharSequence charSequence) {
        this.FastBitmap$CoordinateSystem = charSequence;
        this.getMax.onItemsChanged(false);
        onExtrasChanged onextraschanged = this.setMax;
        if (onextraschanged != null) {
            onextraschanged.setHeaderTitle(charSequence);
        }
        return this;
    }

    public final MenuItem setTitle(int i) {
        return setTitle((CharSequence) this.getMax.getContext().getString(i));
    }

    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.toDoubleRange;
        if (charSequence == null) {
            charSequence = this.FastBitmap$CoordinateSystem;
        }
        return (Build.VERSION.SDK_INT >= 18 || charSequence == null || (charSequence instanceof String)) ? charSequence : charSequence.toString();
    }

    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.toDoubleRange = charSequence;
        this.getMax.onItemsChanged(false);
        return this;
    }

    public final Drawable getIcon() {
        Drawable drawable = this.Grayscale$Algorithm;
        if (drawable != null) {
            return setMin(drawable);
        }
        if (this.Mean$Arithmetic == 0) {
            return null;
        }
        Drawable min = cancelAll.getMin(this.getMax.getContext(), this.Mean$Arithmetic);
        this.Mean$Arithmetic = 0;
        this.Grayscale$Algorithm = min;
        return setMin(min);
    }

    public final MenuItem setIcon(Drawable drawable) {
        this.Mean$Arithmetic = 0;
        this.Grayscale$Algorithm = drawable;
        this.onMessageChannelReady = true;
        this.getMax.onItemsChanged(false);
        return this;
    }

    public final MenuItem setIcon(int i) {
        this.Grayscale$Algorithm = null;
        this.Mean$Arithmetic = i;
        this.onMessageChannelReady = true;
        this.getMax.onItemsChanged(false);
        return this;
    }

    public final MenuItem setIconTintList(@Nullable ColorStateList colorStateList) {
        this.ICustomTabsCallback = colorStateList;
        this.extraCallbackWithResult = true;
        this.onMessageChannelReady = true;
        this.getMax.onItemsChanged(false);
        return this;
    }

    public final ColorStateList getIconTintList() {
        return this.ICustomTabsCallback;
    }

    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.getCause = mode;
        this.onRelationshipValidationResult = true;
        this.onMessageChannelReady = true;
        this.getMax.onItemsChanged(false);
        return this;
    }

    public final PorterDuff.Mode getIconTintMode() {
        return this.getCause;
    }

    private Drawable setMin(Drawable drawable) {
        if (drawable != null && this.onMessageChannelReady && (this.extraCallbackWithResult || this.onRelationshipValidationResult)) {
            drawable = RequiresPermission.Read.toIntRange(drawable).mutate();
            if (this.extraCallbackWithResult) {
                RequiresPermission.Read.setMin(drawable, this.ICustomTabsCallback);
            }
            if (this.onRelationshipValidationResult) {
                RequiresPermission.Read.setMin(drawable, this.getCause);
            }
            this.onMessageChannelReady = false;
        }
        return drawable;
    }

    public final boolean isCheckable() {
        return (this.IsOverlapping & 1) == 1;
    }

    public final MenuItem setCheckable(boolean z) {
        int i = this.IsOverlapping;
        boolean z2 = z | (i & true);
        this.IsOverlapping = z2 ? 1 : 0;
        if (i != z2) {
            this.getMax.onItemsChanged(false);
        }
        return this;
    }

    public final boolean getMax() {
        return (this.IsOverlapping & 4) != 0;
    }

    public final boolean isChecked() {
        return (this.IsOverlapping & 2) == 2;
    }

    public final MenuItem setChecked(boolean z) {
        if ((this.IsOverlapping & 4) != 0) {
            this.getMax.setExclusiveItemChecked(this);
        } else {
            getMin(z);
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    public final void getMin(boolean z) {
        int i = this.IsOverlapping;
        int i2 = (z ? 2 : 0) | (i & -3);
        this.IsOverlapping = i2;
        if (i != i2) {
            this.getMax.onItemsChanged(false);
        }
    }

    public final boolean isVisible() {
        setNeutralButtonIcon setneutralbuttonicon = this.equals;
        return (setneutralbuttonicon == null || !setneutralbuttonicon.setMin()) ? (this.IsOverlapping & 8) == 0 : (this.IsOverlapping & 8) == 0 && this.equals.length();
    }

    /* access modifiers changed from: package-private */
    public final boolean getMax(boolean z) {
        int i = this.IsOverlapping;
        int i2 = (z ? 0 : 8) | (i & -9);
        this.IsOverlapping = i2;
        if (i != i2) {
            return true;
        }
        return false;
    }

    public final MenuItem setVisible(boolean z) {
        if (getMax(z)) {
            this.getMax.onItemVisibleChanged(this);
        }
        return this;
    }

    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.create = onMenuItemClickListener;
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.FastBitmap$CoordinateSystem;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.toIntRange;
    }

    public final boolean toFloatRange() {
        return this.getMax.getOptionalIconsVisible();
    }

    public final boolean isInside() {
        return (this.IsOverlapping & 32) == 32;
    }

    public final boolean toIntRange() {
        return (this.onPostMessage & 1) == 1;
    }

    public final boolean equals() {
        return (this.onPostMessage & 2) == 2;
    }

    public final boolean IsOverlapping() {
        return (this.onPostMessage & 4) == 4;
    }

    public final void setShowAsAction(int i) {
        int i2 = i & 3;
        if (i2 == 0 || i2 == 1 || i2 == 2) {
            this.onPostMessage = i;
            this.getMax.onItemActionRequestChanged(this);
            return;
        }
        throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
    }

    /* access modifiers changed from: private */
    /* renamed from: getMin */
    public RestrictTo.Scope setActionView(View view) {
        int i;
        this.extraCallback = view;
        this.equals = null;
        if (view != null && view.getId() == -1 && (i = this.toFloatRange) > 0) {
            view.setId(i);
        }
        this.getMax.onItemActionRequestChanged(this);
        return this;
    }

    public final View getActionView() {
        View view = this.extraCallback;
        if (view != null) {
            return view;
        }
        setNeutralButtonIcon setneutralbuttonicon = this.equals;
        if (setneutralbuttonicon == null) {
            return null;
        }
        View max = setneutralbuttonicon.setMax((MenuItem) this);
        this.extraCallback = max;
        return max;
    }

    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    public final setNeutralButtonIcon setMax() {
        return this.equals;
    }

    public final RestrictTo.Scope getMin(setNeutralButtonIcon setneutralbuttonicon) {
        setNeutralButtonIcon setneutralbuttonicon2 = this.equals;
        if (setneutralbuttonicon2 != null) {
            setneutralbuttonicon2.toFloatRange();
        }
        this.extraCallback = null;
        this.equals = setneutralbuttonicon;
        this.getMax.onItemsChanged(true);
        setNeutralButtonIcon setneutralbuttonicon3 = this.equals;
        if (setneutralbuttonicon3 != null) {
            setneutralbuttonicon3.setMax((setNeutralButtonIcon.setMin) new setNeutralButtonIcon.setMin() {
                public final void length() {
                    RatingCompat.this.getMax.onItemVisibleChanged(RatingCompat.this);
                }
            });
        }
        return this;
    }

    public final boolean expandActionView() {
        if (!values()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.ICustomTabsCallback$Default;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.getMax.expandItemActionView(this);
        }
        return false;
    }

    public final boolean collapseActionView() {
        if ((this.onPostMessage & 8) == 0) {
            return false;
        }
        if (this.extraCallback == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.ICustomTabsCallback$Default;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.getMax.collapseItemActionView(this);
        }
        return false;
    }

    public final boolean values() {
        setNeutralButtonIcon setneutralbuttonicon;
        if ((this.onPostMessage & 8) != 0) {
            if (this.extraCallback == null && (setneutralbuttonicon = this.equals) != null) {
                this.extraCallback = setneutralbuttonicon.setMax((MenuItem) this);
            }
            if (this.extraCallback != null) {
                return true;
            }
        }
        return false;
    }

    public final boolean isActionViewExpanded() {
        return this.isInside;
    }

    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.ICustomTabsCallback$Default = onActionExpandListener;
        return this;
    }

    public final RestrictTo.Scope setMax(CharSequence charSequence) {
        this.onNavigationEvent = charSequence;
        this.getMax.onItemsChanged(false);
        return this;
    }

    public final CharSequence getContentDescription() {
        return this.onNavigationEvent;
    }

    public final RestrictTo.Scope getMin(CharSequence charSequence) {
        this.b = charSequence;
        this.getMax.onItemsChanged(false);
        return this;
    }

    public final CharSequence getTooltipText() {
        return this.b;
    }

    public final /* synthetic */ MenuItem setActionView(int i) {
        Context context = this.getMax.getContext();
        setActionView(LayoutInflater.from(context).inflate(i, new LinearLayout(context), false));
        return this;
    }

    public final /* synthetic */ MenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    public final /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        this.b = charSequence;
        this.getMax.onItemsChanged(false);
        return this;
    }

    public final /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        this.onNavigationEvent = charSequence;
        this.getMax.onItemsChanged(false);
        return this;
    }
}
