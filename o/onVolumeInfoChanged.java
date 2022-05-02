package o;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.annotation.RestrictTo;
import o.MediaMetadataCompat;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class onVolumeInfoChanged extends MediaMetadataCompat.BitmapKey implements Menu {
    private final Size length;

    public onVolumeInfoChanged(Context context, Size size) {
        super(context);
        if (size != null) {
            this.length = size;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    public MenuItem add(CharSequence charSequence) {
        return setMax(this.length.add(charSequence));
    }

    public MenuItem add(int i) {
        return setMax(this.length.add(i));
    }

    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return setMax(this.length.add(i, i2, i3, charSequence));
    }

    public MenuItem add(int i, int i2, int i3, int i4) {
        return setMax(this.length.add(i, i2, i3, i4));
    }

    public SubMenu addSubMenu(CharSequence charSequence) {
        return getMin(this.length.addSubMenu(charSequence));
    }

    public SubMenu addSubMenu(int i) {
        return getMin(this.length.addSubMenu(i));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        return getMin(this.length.addSubMenu(i, i2, i3, charSequence));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return getMin(this.length.addSubMenu(i, i2, i3, i4));
    }

    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr;
        MenuItem[] menuItemArr3 = menuItemArr2 != null ? new MenuItem[menuItemArr2.length] : null;
        int addIntentOptions = this.length.addIntentOptions(i, i2, i3, componentName, intentArr, intent, i4, menuItemArr3);
        if (menuItemArr3 != null) {
            int length2 = menuItemArr3.length;
            for (int i5 = 0; i5 < length2; i5++) {
                menuItemArr2[i5] = setMax(menuItemArr3[i5]);
            }
        }
        return addIntentOptions;
    }

    public void removeItem(int i) {
        length(i);
        this.length.removeItem(i);
    }

    public void removeGroup(int i) {
        getMax(i);
        this.length.removeGroup(i);
    }

    public void clear() {
        setMax();
        this.length.clear();
    }

    public void setGroupCheckable(int i, boolean z, boolean z2) {
        this.length.setGroupCheckable(i, z, z2);
    }

    public void setGroupVisible(int i, boolean z) {
        this.length.setGroupVisible(i, z);
    }

    public void setGroupEnabled(int i, boolean z) {
        this.length.setGroupEnabled(i, z);
    }

    public boolean hasVisibleItems() {
        return this.length.hasVisibleItems();
    }

    public MenuItem findItem(int i) {
        return setMax(this.length.findItem(i));
    }

    public int size() {
        return this.length.size();
    }

    public MenuItem getItem(int i) {
        return setMax(this.length.getItem(i));
    }

    public void close() {
        this.length.close();
    }

    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        return this.length.performShortcut(i, keyEvent, i2);
    }

    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return this.length.isShortcutKey(i, keyEvent);
    }

    public boolean performIdentifierAction(int i, int i2) {
        return this.length.performIdentifierAction(i, i2);
    }

    public void setQwertyMode(boolean z) {
        this.length.setQwertyMode(z);
    }
}
