package o;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import o.onEvent;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class onExtrasChanged extends onEvent implements SubMenu {
    private RatingCompat mItem;
    private onEvent mParentMenu;

    public onExtrasChanged(Context context, onEvent onevent, RatingCompat ratingCompat) {
        super(context);
        this.mParentMenu = onevent;
        this.mItem = ratingCompat;
    }

    public void setQwertyMode(boolean z) {
        this.mParentMenu.setQwertyMode(z);
    }

    public boolean isQwertyMode() {
        return this.mParentMenu.isQwertyMode();
    }

    public void setShortcutsVisible(boolean z) {
        this.mParentMenu.setShortcutsVisible(z);
    }

    public boolean isShortcutsVisible() {
        return this.mParentMenu.isShortcutsVisible();
    }

    public Menu getParentMenu() {
        return this.mParentMenu;
    }

    public MenuItem getItem() {
        return this.mItem;
    }

    public void setCallback(onEvent.length length) {
        this.mParentMenu.setCallback(length);
    }

    public onEvent getRootMenu() {
        return this.mParentMenu.getRootMenu();
    }

    /* access modifiers changed from: package-private */
    public boolean dispatchMenuItemSelected(@NonNull onEvent onevent, @NonNull MenuItem menuItem) {
        return super.dispatchMenuItemSelected(onevent, menuItem) || this.mParentMenu.dispatchMenuItemSelected(onevent, menuItem);
    }

    public SubMenu setIcon(Drawable drawable) {
        this.mItem.setIcon(drawable);
        return this;
    }

    public SubMenu setIcon(int i) {
        this.mItem.setIcon(i);
        return this;
    }

    public SubMenu setHeaderIcon(Drawable drawable) {
        return (SubMenu) super.setHeaderIconInt(drawable);
    }

    public SubMenu setHeaderIcon(int i) {
        return (SubMenu) super.setHeaderIconInt(i);
    }

    public SubMenu setHeaderTitle(CharSequence charSequence) {
        return (SubMenu) super.setHeaderTitleInt(charSequence);
    }

    public SubMenu setHeaderTitle(int i) {
        return (SubMenu) super.setHeaderTitleInt(i);
    }

    public SubMenu setHeaderView(View view) {
        return (SubMenu) super.setHeaderViewInt(view);
    }

    public boolean expandItemActionView(RatingCompat ratingCompat) {
        return this.mParentMenu.expandItemActionView(ratingCompat);
    }

    public boolean collapseItemActionView(RatingCompat ratingCompat) {
        return this.mParentMenu.collapseItemActionView(ratingCompat);
    }

    public String getActionViewStatesKey() {
        RatingCompat ratingCompat = this.mItem;
        int itemId = ratingCompat != null ? ratingCompat.getItemId() : 0;
        if (itemId == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(super.getActionViewStatesKey());
        sb.append(":");
        sb.append(itemId);
        return sb.toString();
    }

    public void setGroupDividerEnabled(boolean z) {
        this.mParentMenu.setGroupDividerEnabled(z);
    }

    public boolean isGroupDividerEnabled() {
        return this.mParentMenu.isGroupDividerEnabled();
    }
}
