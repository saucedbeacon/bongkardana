package o;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.lang.reflect.Method;
import o.MediaMetadataCompat;
import o.RestrictTo;
import o.setNeutralButtonIcon;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class onPlaybackStateChanged extends MediaMetadataCompat.BitmapKey implements MenuItem {
    public Method length;
    public final RestrictTo.Scope setMax;

    public onPlaybackStateChanged(Context context, RestrictTo.Scope scope) {
        super(context);
        if (scope != null) {
            this.setMax = scope;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    public final int getItemId() {
        return this.setMax.getItemId();
    }

    public final int getGroupId() {
        return this.setMax.getGroupId();
    }

    public final int getOrder() {
        return this.setMax.getOrder();
    }

    public final MenuItem setTitle(CharSequence charSequence) {
        this.setMax.setTitle(charSequence);
        return this;
    }

    public final MenuItem setTitle(int i) {
        this.setMax.setTitle(i);
        return this;
    }

    public final CharSequence getTitle() {
        return this.setMax.getTitle();
    }

    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.setMax.setTitleCondensed(charSequence);
        return this;
    }

    public final CharSequence getTitleCondensed() {
        return this.setMax.getTitleCondensed();
    }

    public final MenuItem setIcon(Drawable drawable) {
        this.setMax.setIcon(drawable);
        return this;
    }

    public final MenuItem setIcon(int i) {
        this.setMax.setIcon(i);
        return this;
    }

    public final Drawable getIcon() {
        return this.setMax.getIcon();
    }

    public final MenuItem setIntent(Intent intent) {
        this.setMax.setIntent(intent);
        return this;
    }

    public final Intent getIntent() {
        return this.setMax.getIntent();
    }

    public final MenuItem setShortcut(char c, char c2) {
        this.setMax.setShortcut(c, c2);
        return this;
    }

    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.setMax.setShortcut(c, c2, i, i2);
        return this;
    }

    public final MenuItem setNumericShortcut(char c) {
        this.setMax.setNumericShortcut(c);
        return this;
    }

    public final MenuItem setNumericShortcut(char c, int i) {
        this.setMax.setNumericShortcut(c, i);
        return this;
    }

    public final char getNumericShortcut() {
        return this.setMax.getNumericShortcut();
    }

    public final int getNumericModifiers() {
        return this.setMax.getNumericModifiers();
    }

    public final MenuItem setAlphabeticShortcut(char c) {
        this.setMax.setAlphabeticShortcut(c);
        return this;
    }

    public final MenuItem setAlphabeticShortcut(char c, int i) {
        this.setMax.setAlphabeticShortcut(c, i);
        return this;
    }

    public final char getAlphabeticShortcut() {
        return this.setMax.getAlphabeticShortcut();
    }

    public final int getAlphabeticModifiers() {
        return this.setMax.getAlphabeticModifiers();
    }

    public final MenuItem setCheckable(boolean z) {
        this.setMax.setCheckable(z);
        return this;
    }

    public final boolean isCheckable() {
        return this.setMax.isCheckable();
    }

    public final MenuItem setChecked(boolean z) {
        this.setMax.setChecked(z);
        return this;
    }

    public final boolean isChecked() {
        return this.setMax.isChecked();
    }

    public final MenuItem setVisible(boolean z) {
        return this.setMax.setVisible(z);
    }

    public final boolean isVisible() {
        return this.setMax.isVisible();
    }

    public final MenuItem setEnabled(boolean z) {
        this.setMax.setEnabled(z);
        return this;
    }

    public final boolean isEnabled() {
        return this.setMax.isEnabled();
    }

    public final boolean hasSubMenu() {
        return this.setMax.hasSubMenu();
    }

    public final SubMenu getSubMenu() {
        return getMin(this.setMax.getSubMenu());
    }

    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.setMax.setOnMenuItemClickListener(onMenuItemClickListener != null ? new length(onMenuItemClickListener) : null);
        return this;
    }

    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.setMax.getMenuInfo();
    }

    public final void setShowAsAction(int i) {
        this.setMax.setShowAsAction(i);
    }

    public final MenuItem setShowAsActionFlags(int i) {
        this.setMax.setShowAsActionFlags(i);
        return this;
    }

    public final MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new setMax(view);
        }
        this.setMax.setActionView(view);
        return this;
    }

    public final MenuItem setActionView(int i) {
        this.setMax.setActionView(i);
        View actionView = this.setMax.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            this.setMax.setActionView((View) new setMax(actionView));
        }
        return this;
    }

    public final View getActionView() {
        View actionView = this.setMax.getActionView();
        return actionView instanceof setMax ? (View) ((setMax) actionView).getMin : actionView;
    }

    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        setNeutralButtonIcon setneutralbuttonicon;
        if (Build.VERSION.SDK_INT >= 16) {
            setneutralbuttonicon = new getMax(this.getMax, actionProvider);
        } else {
            setneutralbuttonicon = new setMin(this.getMax, actionProvider);
        }
        RestrictTo.Scope scope = this.setMax;
        if (actionProvider == null) {
            setneutralbuttonicon = null;
        }
        scope.getMin(setneutralbuttonicon);
        return this;
    }

    public final ActionProvider getActionProvider() {
        setNeutralButtonIcon max = this.setMax.setMax();
        if (max instanceof setMin) {
            return ((setMin) max).setMin;
        }
        return null;
    }

    public final boolean expandActionView() {
        return this.setMax.expandActionView();
    }

    public final boolean collapseActionView() {
        return this.setMax.collapseActionView();
    }

    public final boolean isActionViewExpanded() {
        return this.setMax.isActionViewExpanded();
    }

    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.setMax.setOnActionExpandListener(onActionExpandListener != null ? new getMin(onActionExpandListener) : null);
        return this;
    }

    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.setMax.setMax(charSequence);
        return this;
    }

    public final CharSequence getContentDescription() {
        return this.setMax.getContentDescription();
    }

    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.setMax.getMin(charSequence);
        return this;
    }

    public final CharSequence getTooltipText() {
        return this.setMax.getTooltipText();
    }

    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.setMax.setIconTintList(colorStateList);
        return this;
    }

    public final ColorStateList getIconTintList() {
        return this.setMax.getIconTintList();
    }

    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.setMax.setIconTintMode(mode);
        return this;
    }

    public final PorterDuff.Mode getIconTintMode() {
        return this.setMax.getIconTintMode();
    }

    class length implements MenuItem.OnMenuItemClickListener {
        private final MenuItem.OnMenuItemClickListener setMin;

        length(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            this.setMin = onMenuItemClickListener;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            return this.setMin.onMenuItemClick(onPlaybackStateChanged.this.setMax(menuItem));
        }
    }

    class getMin implements MenuItem.OnActionExpandListener {
        private final MenuItem.OnActionExpandListener setMin;

        getMin(MenuItem.OnActionExpandListener onActionExpandListener) {
            this.setMin = onActionExpandListener;
        }

        public final boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.setMin.onMenuItemActionExpand(onPlaybackStateChanged.this.setMax(menuItem));
        }

        public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.setMin.onMenuItemActionCollapse(onPlaybackStateChanged.this.setMax(menuItem));
        }
    }

    class setMin extends setNeutralButtonIcon {
        final ActionProvider setMin;

        setMin(Context context, ActionProvider actionProvider) {
            super(context);
            this.setMin = actionProvider;
        }

        public View getMax() {
            return this.setMin.onCreateActionView();
        }

        public boolean getMin() {
            return this.setMin.onPerformDefaultAction();
        }

        public boolean setMax() {
            return this.setMin.hasSubMenu();
        }

        public void setMax(SubMenu subMenu) {
            this.setMin.onPrepareSubMenu(onPlaybackStateChanged.this.getMin(subMenu));
        }
    }

    @RequiresApi(16)
    class getMax extends setMin implements ActionProvider.VisibilityListener {
        private setNeutralButtonIcon.setMin length;

        getMax(Context context, ActionProvider actionProvider) {
            super(context, actionProvider);
        }

        public View setMax(MenuItem menuItem) {
            return this.setMin.onCreateActionView(menuItem);
        }

        public boolean setMin() {
            return this.setMin.overridesItemVisibility();
        }

        public boolean length() {
            return this.setMin.isVisible();
        }

        public void setMax(setNeutralButtonIcon.setMin setmin) {
            this.length = setmin;
            this.setMin.setVisibilityListener(setmin != null ? this : null);
        }

        public void onActionProviderVisibilityChanged(boolean z) {
            setNeutralButtonIcon.setMin setmin = this.length;
            if (setmin != null) {
                setmin.length();
            }
        }
    }

    static class setMax extends FrameLayout implements MediaBrowserCompat$SearchResultReceiver {
        final CollapsibleActionView getMin;

        setMax(View view) {
            super(view.getContext());
            this.getMin = (CollapsibleActionView) view;
            addView(view);
        }

        public final void onActionViewExpanded() {
            this.getMin.onActionViewExpanded();
        }

        public final void onActionViewCollapsed() {
            this.getMin.onActionViewCollapsed();
        }
    }
}
