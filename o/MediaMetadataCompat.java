package o;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionMode;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o.PlaybackStateCompat;
import o.RequiresPermission;
import o.RestrictTo;
import o.onQueueTitleChanged;
import o.onSessionDestroyed;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public abstract class MediaMetadataCompat implements onQueueTitleChanged {
    private int IsOverlapping;
    public onQueueTitleChanged.setMax equals;
    public onEvent getMax;
    protected LayoutInflater getMin;
    public int isInside;
    protected LayoutInflater length;
    protected Context setMax;
    protected Context setMin;
    private int toFloatRange;
    public onSessionDestroyed toIntRange;

    public boolean collapseItemActionView(onEvent onevent, RatingCompat ratingCompat) {
        return false;
    }

    public boolean expandItemActionView(onEvent onevent, RatingCompat ratingCompat) {
        return false;
    }

    public boolean flagActionItems() {
        return false;
    }

    public abstract void setMax(RatingCompat ratingCompat, onSessionDestroyed.setMax setmax);

    public boolean setMax(RatingCompat ratingCompat) {
        return true;
    }

    abstract class BitmapKey {
        final Context getMax;
        private PlaybackStateCompat.RepeatMode<min, SubMenu> getMin;
        private PlaybackStateCompat.RepeatMode<RestrictTo.Scope, MenuItem> length;

        BitmapKey(Context context) {
            this.getMax = context;
        }

        /* access modifiers changed from: package-private */
        public final MenuItem setMax(MenuItem menuItem) {
            if (!(menuItem instanceof RestrictTo.Scope)) {
                return menuItem;
            }
            RestrictTo.Scope scope = (RestrictTo.Scope) menuItem;
            if (this.length == null) {
                this.length = new PlaybackStateCompat.RepeatMode<>();
            }
            MenuItem menuItem2 = this.length.get(menuItem);
            if (menuItem2 != null) {
                return menuItem2;
            }
            onPlaybackStateChanged onplaybackstatechanged = new onPlaybackStateChanged(this.getMax, scope);
            this.length.put(scope, onplaybackstatechanged);
            return onplaybackstatechanged;
        }

        /* access modifiers changed from: package-private */
        public final SubMenu getMin(SubMenu subMenu) {
            if (!(subMenu instanceof min)) {
                return subMenu;
            }
            min min = (min) subMenu;
            if (this.getMin == null) {
                this.getMin = new PlaybackStateCompat.RepeatMode<>();
            }
            SubMenu subMenu2 = this.getMin.get(min);
            if (subMenu2 != null) {
                return subMenu2;
            }
            onShuffleModeChangedRemoved onshufflemodechangedremoved = new onShuffleModeChangedRemoved(this.getMax, min);
            this.getMin.put(min, onshufflemodechangedremoved);
            return onshufflemodechangedremoved;
        }

        /* access modifiers changed from: package-private */
        public final void setMax() {
            PlaybackStateCompat.RepeatMode<RestrictTo.Scope, MenuItem> repeatMode = this.length;
            if (repeatMode != null) {
                repeatMode.clear();
            }
            PlaybackStateCompat.RepeatMode<min, SubMenu> repeatMode2 = this.getMin;
            if (repeatMode2 != null) {
                repeatMode2.clear();
            }
        }

        /* access modifiers changed from: package-private */
        public final void getMax(int i) {
            if (this.length != null) {
                int i2 = 0;
                while (i2 < this.length.size()) {
                    if (((RestrictTo.Scope) this.length.isInside[i2 << 1]).getGroupId() == i) {
                        this.length.setMin(i2);
                        i2--;
                    }
                    i2++;
                }
            }
        }

        /* access modifiers changed from: package-private */
        public final void length(int i) {
            if (this.length != null) {
                for (int i2 = 0; i2 < this.length.size(); i2++) {
                    if (((RestrictTo.Scope) this.length.isInside[i2 << 1]).getItemId() == i) {
                        this.length.setMin(i2);
                        return;
                    }
                }
            }
        }
    }

    @androidx.annotation.RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public class RatingKey implements Window.Callback {
        final Window.Callback length;

        public RatingKey(Window.Callback callback) {
            if (callback != null) {
                this.length = callback;
                return;
            }
            throw new IllegalArgumentException("Window callback may not be null");
        }

        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return this.length.dispatchKeyEvent(keyEvent);
        }

        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            return this.length.dispatchKeyShortcutEvent(keyEvent);
        }

        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            return this.length.dispatchTouchEvent(motionEvent);
        }

        public boolean dispatchTrackballEvent(MotionEvent motionEvent) {
            return this.length.dispatchTrackballEvent(motionEvent);
        }

        public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
            return this.length.dispatchGenericMotionEvent(motionEvent);
        }

        public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            return this.length.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }

        public View onCreatePanelView(int i) {
            return this.length.onCreatePanelView(i);
        }

        public boolean onCreatePanelMenu(int i, Menu menu) {
            return this.length.onCreatePanelMenu(i, menu);
        }

        public boolean onPreparePanel(int i, View view, Menu menu) {
            return this.length.onPreparePanel(i, view, menu);
        }

        public boolean onMenuOpened(int i, Menu menu) {
            return this.length.onMenuOpened(i, menu);
        }

        public boolean onMenuItemSelected(int i, MenuItem menuItem) {
            return this.length.onMenuItemSelected(i, menuItem);
        }

        public void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
            this.length.onWindowAttributesChanged(layoutParams);
        }

        public void onContentChanged() {
            this.length.onContentChanged();
        }

        public void onWindowFocusChanged(boolean z) {
            this.length.onWindowFocusChanged(z);
        }

        public void onAttachedToWindow() {
            this.length.onAttachedToWindow();
        }

        public void onDetachedFromWindow() {
            this.length.onDetachedFromWindow();
        }

        public void onPanelClosed(int i, Menu menu) {
            this.length.onPanelClosed(i, menu);
        }

        @RequiresApi(23)
        public boolean onSearchRequested(SearchEvent searchEvent) {
            return this.length.onSearchRequested(searchEvent);
        }

        public boolean onSearchRequested() {
            return this.length.onSearchRequested();
        }

        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            return this.length.onWindowStartingActionMode(callback);
        }

        @RequiresApi(23)
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
            return this.length.onWindowStartingActionMode(callback, i);
        }

        public void onActionModeStarted(ActionMode actionMode) {
            this.length.onActionModeStarted(actionMode);
        }

        public void onActionModeFinished(ActionMode actionMode) {
            this.length.onActionModeFinished(actionMode);
        }

        @RequiresApi(24)
        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
            this.length.onProvideKeyboardShortcuts(list, menu, i);
        }

        @RequiresApi(26)
        public void onPointerCaptureChanged(boolean z) {
            this.length.onPointerCaptureChanged(z);
        }

        public final Window.Callback getMin() {
            return this.length;
        }
    }

    @androidx.annotation.RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public class TextKey {
        private Interpolator getMax;
        private boolean getMin;
        private long length = -1;
        final ArrayList<invalidateOptionsMenu> setMax = new ArrayList<>();
        supportInvalidateOptionsMenu setMin;
        private final onTitleChanged toFloatRange = new onTitleChanged() {
            private int getMax = 0;
            private boolean getMin = false;

            public void setMin(View view) {
                if (!this.getMin) {
                    this.getMin = true;
                    if (TextKey.this.setMin != null) {
                        TextKey.this.setMin.setMin((View) null);
                    }
                }
            }

            /* access modifiers changed from: package-private */
            public void setMax() {
                this.getMax = 0;
                this.getMin = false;
                TextKey.this.getMin();
            }

            public void length(View view) {
                int i = this.getMax + 1;
                this.getMax = i;
                if (i == TextKey.this.setMax.size()) {
                    if (TextKey.this.setMin != null) {
                        TextKey.this.setMin.length((View) null);
                    }
                    setMax();
                }
            }
        };

        public TextKey length(invalidateOptionsMenu invalidateoptionsmenu) {
            if (!this.getMin) {
                this.setMax.add(invalidateoptionsmenu);
            }
            return this;
        }

        public TextKey getMax(invalidateOptionsMenu invalidateoptionsmenu, invalidateOptionsMenu invalidateoptionsmenu2) {
            this.setMax.add(invalidateoptionsmenu);
            invalidateoptionsmenu2.setMin(invalidateoptionsmenu.getMin());
            this.setMax.add(invalidateoptionsmenu2);
            return this;
        }

        public void length() {
            if (!this.getMin) {
                Iterator<invalidateOptionsMenu> it = this.setMax.iterator();
                while (it.hasNext()) {
                    invalidateOptionsMenu next = it.next();
                    long j = this.length;
                    if (j >= 0) {
                        next.getMin(j);
                    }
                    Interpolator interpolator = this.getMax;
                    if (interpolator != null) {
                        next.setMin(interpolator);
                    }
                    if (this.setMin != null) {
                        next.length(this.toFloatRange);
                    }
                    next.setMax();
                }
                this.getMin = true;
            }
        }

        /* access modifiers changed from: package-private */
        public void getMin() {
            this.getMin = false;
        }

        public void getMax() {
            if (this.getMin) {
                Iterator<invalidateOptionsMenu> it = this.setMax.iterator();
                while (it.hasNext()) {
                    it.next().getMax();
                }
                this.getMin = false;
            }
        }

        public TextKey setMin(long j) {
            if (!this.getMin) {
                this.length = j;
            }
            return this;
        }

        public TextKey getMin(Interpolator interpolator) {
            if (!this.getMin) {
                this.getMax = interpolator;
            }
            return this;
        }

        public TextKey getMax(supportInvalidateOptionsMenu supportinvalidateoptionsmenu) {
            if (!this.getMin) {
                this.setMin = supportinvalidateoptionsmenu;
            }
            return this;
        }
    }

    public MediaMetadataCompat(Context context, int i, int i2) {
        this.setMax = context;
        this.getMin = LayoutInflater.from(context);
        this.toFloatRange = i;
        this.IsOverlapping = i2;
    }

    public void initForMenu(Context context, onEvent onevent) {
        this.setMin = context;
        this.length = LayoutInflater.from(context);
        this.getMax = onevent;
    }

    public onSessionDestroyed length(ViewGroup viewGroup) {
        if (this.toIntRange == null) {
            onSessionDestroyed onsessiondestroyed = (onSessionDestroyed) this.getMin.inflate(this.toFloatRange, viewGroup, false);
            this.toIntRange = onsessiondestroyed;
            onsessiondestroyed.initialize(this.getMax);
            updateMenuView(true);
        }
        return this.toIntRange;
    }

    @androidx.annotation.RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public final class LongKey implements RestrictTo.Scope {
        private Context FastBitmap$CoordinateSystem;
        private int Grayscale$Algorithm = 16;
        private int IsOverlapping = 4096;
        private boolean Mean$Arithmetic = false;
        private char equals;
        private final int getMax;
        private CharSequence getMin;
        private Drawable hashCode;
        private ColorStateList invoke = null;
        private PorterDuff.Mode invokeSuspend = null;
        private int isInside = 4096;
        private final int length;
        private CharSequence setMax;
        private final int setMin;
        private CharSequence toDoubleRange;
        private char toFloatRange;
        private Intent toIntRange;
        private MenuItem.OnMenuItemClickListener toString;
        private boolean valueOf = false;
        private CharSequence values;

        public final boolean collapseActionView() {
            return false;
        }

        public final boolean expandActionView() {
            return false;
        }

        public final View getActionView() {
            return null;
        }

        public final ContextMenu.ContextMenuInfo getMenuInfo() {
            return null;
        }

        public final SubMenu getSubMenu() {
            return null;
        }

        public final boolean hasSubMenu() {
            return false;
        }

        public final boolean isActionViewExpanded() {
            return false;
        }

        public final setNeutralButtonIcon setMax() {
            return null;
        }

        public final void setShowAsAction(int i) {
        }

        public LongKey(Context context, CharSequence charSequence) {
            this.FastBitmap$CoordinateSystem = context;
            this.getMax = 16908332;
            this.length = 0;
            this.setMin = 0;
            this.setMax = charSequence;
        }

        public final char getAlphabeticShortcut() {
            return this.toFloatRange;
        }

        public final int getAlphabeticModifiers() {
            return this.IsOverlapping;
        }

        public final int getGroupId() {
            return this.length;
        }

        public final Drawable getIcon() {
            return this.hashCode;
        }

        public final Intent getIntent() {
            return this.toIntRange;
        }

        public final int getItemId() {
            return this.getMax;
        }

        public final char getNumericShortcut() {
            return this.equals;
        }

        public final int getNumericModifiers() {
            return this.isInside;
        }

        public final int getOrder() {
            return this.setMin;
        }

        public final CharSequence getTitle() {
            return this.setMax;
        }

        public final CharSequence getTitleCondensed() {
            CharSequence charSequence = this.getMin;
            return charSequence != null ? charSequence : this.setMax;
        }

        public final boolean isCheckable() {
            return (this.Grayscale$Algorithm & 1) != 0;
        }

        public final boolean isChecked() {
            return (this.Grayscale$Algorithm & 2) != 0;
        }

        public final boolean isEnabled() {
            return (this.Grayscale$Algorithm & 16) != 0;
        }

        public final boolean isVisible() {
            return (this.Grayscale$Algorithm & 8) == 0;
        }

        public final MenuItem setAlphabeticShortcut(char c) {
            this.toFloatRange = Character.toLowerCase(c);
            return this;
        }

        public final MenuItem setAlphabeticShortcut(char c, int i) {
            this.toFloatRange = Character.toLowerCase(c);
            this.IsOverlapping = KeyEvent.normalizeMetaState(i);
            return this;
        }

        public final MenuItem setCheckable(boolean z) {
            this.Grayscale$Algorithm = z | (this.Grayscale$Algorithm & true) ? 1 : 0;
            return this;
        }

        public final MenuItem setChecked(boolean z) {
            this.Grayscale$Algorithm = (z ? 2 : 0) | (this.Grayscale$Algorithm & -3);
            return this;
        }

        public final MenuItem setEnabled(boolean z) {
            this.Grayscale$Algorithm = (z ? 16 : 0) | (this.Grayscale$Algorithm & -17);
            return this;
        }

        public final MenuItem setIcon(Drawable drawable) {
            this.hashCode = drawable;
            getMin();
            return this;
        }

        public final MenuItem setIcon(int i) {
            this.hashCode = IntRange.length(this.FastBitmap$CoordinateSystem, i);
            getMin();
            return this;
        }

        public final MenuItem setIntent(Intent intent) {
            this.toIntRange = intent;
            return this;
        }

        public final MenuItem setNumericShortcut(char c) {
            this.equals = c;
            return this;
        }

        public final MenuItem setNumericShortcut(char c, int i) {
            this.equals = c;
            this.isInside = KeyEvent.normalizeMetaState(i);
            return this;
        }

        public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            this.toString = onMenuItemClickListener;
            return this;
        }

        public final MenuItem setShortcut(char c, char c2) {
            this.equals = c;
            this.toFloatRange = Character.toLowerCase(c2);
            return this;
        }

        public final MenuItem setShortcut(char c, char c2, int i, int i2) {
            this.equals = c;
            this.isInside = KeyEvent.normalizeMetaState(i);
            this.toFloatRange = Character.toLowerCase(c2);
            this.IsOverlapping = KeyEvent.normalizeMetaState(i2);
            return this;
        }

        public final MenuItem setTitle(CharSequence charSequence) {
            this.setMax = charSequence;
            return this;
        }

        public final MenuItem setTitle(int i) {
            this.setMax = this.FastBitmap$CoordinateSystem.getResources().getString(i);
            return this;
        }

        public final MenuItem setTitleCondensed(CharSequence charSequence) {
            this.getMin = charSequence;
            return this;
        }

        public final MenuItem setVisible(boolean z) {
            int i = 8;
            int i2 = this.Grayscale$Algorithm & 8;
            if (z) {
                i = 0;
            }
            this.Grayscale$Algorithm = i2 | i;
            return this;
        }

        public final MenuItem setActionProvider(ActionProvider actionProvider) {
            throw new UnsupportedOperationException();
        }

        public final ActionProvider getActionProvider() {
            throw new UnsupportedOperationException();
        }

        public final RestrictTo.Scope getMin(setNeutralButtonIcon setneutralbuttonicon) {
            throw new UnsupportedOperationException();
        }

        public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
            throw new UnsupportedOperationException();
        }

        public final RestrictTo.Scope setMax(CharSequence charSequence) {
            this.values = charSequence;
            return this;
        }

        public final CharSequence getContentDescription() {
            return this.values;
        }

        public final RestrictTo.Scope getMin(CharSequence charSequence) {
            this.toDoubleRange = charSequence;
            return this;
        }

        public final CharSequence getTooltipText() {
            return this.toDoubleRange;
        }

        public final MenuItem setIconTintList(@Nullable ColorStateList colorStateList) {
            this.invoke = colorStateList;
            this.valueOf = true;
            getMin();
            return this;
        }

        public final ColorStateList getIconTintList() {
            return this.invoke;
        }

        public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
            this.invokeSuspend = mode;
            this.Mean$Arithmetic = true;
            getMin();
            return this;
        }

        public final PorterDuff.Mode getIconTintMode() {
            return this.invokeSuspend;
        }

        private void getMin() {
            if (this.hashCode == null) {
                return;
            }
            if (this.valueOf || this.Mean$Arithmetic) {
                Drawable intRange = RequiresPermission.Read.toIntRange(this.hashCode);
                this.hashCode = intRange;
                Drawable mutate = intRange.mutate();
                this.hashCode = mutate;
                if (this.valueOf) {
                    RequiresPermission.Read.setMin(mutate, this.invoke);
                }
                if (this.Mean$Arithmetic) {
                    RequiresPermission.Read.setMin(this.hashCode, this.invokeSuspend);
                }
            }
        }

        public final /* synthetic */ MenuItem setActionView(int i) {
            throw new UnsupportedOperationException();
        }

        public final /* synthetic */ MenuItem setActionView(View view) {
            throw new UnsupportedOperationException();
        }

        public final /* synthetic */ MenuItem setShowAsActionFlags(int i) {
            setShowAsAction(i);
            return this;
        }

        public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
            this.toDoubleRange = charSequence;
            return this;
        }

        public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
            this.values = charSequence;
            return this;
        }
    }

    public void updateMenuView(boolean z) {
        ViewGroup viewGroup = (ViewGroup) this.toIntRange;
        if (viewGroup != null) {
            onEvent onevent = this.getMax;
            int i = 0;
            if (onevent != null) {
                onevent.flagActionItems();
                ArrayList<RatingCompat> visibleItems = this.getMax.getVisibleItems();
                int size = visibleItems.size();
                int i2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    RatingCompat ratingCompat = visibleItems.get(i3);
                    if (setMax(ratingCompat)) {
                        View childAt = viewGroup.getChildAt(i2);
                        RatingCompat itemData = childAt instanceof onSessionDestroyed.setMax ? ((onSessionDestroyed.setMax) childAt).getItemData() : null;
                        View max = setMax(ratingCompat, childAt, viewGroup);
                        if (ratingCompat != itemData) {
                            max.setPressed(false);
                            max.jumpDrawablesToCurrentState();
                        }
                        if (max != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) max.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(max);
                            }
                            ((ViewGroup) this.toIntRange).addView(max, i2);
                        }
                        i2++;
                    }
                }
                i = i2;
            }
            while (i < viewGroup.getChildCount()) {
                if (!getMin(viewGroup, i)) {
                    i++;
                }
            }
        }
    }

    public boolean getMin(ViewGroup viewGroup, int i) {
        viewGroup.removeViewAt(i);
        return true;
    }

    public void setCallback(onQueueTitleChanged.setMax setmax) {
        this.equals = setmax;
    }

    public View setMax(RatingCompat ratingCompat, View view, ViewGroup viewGroup) {
        onSessionDestroyed.setMax setmax;
        if (view instanceof onSessionDestroyed.setMax) {
            setmax = (onSessionDestroyed.setMax) view;
        } else {
            setmax = (onSessionDestroyed.setMax) this.getMin.inflate(this.IsOverlapping, viewGroup, false);
        }
        setMax(ratingCompat, setmax);
        return (View) setmax;
    }

    public void onCloseMenu(onEvent onevent, boolean z) {
        onQueueTitleChanged.setMax setmax = this.equals;
        if (setmax != null) {
            setmax.getMax(onevent, z);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000e, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onSubMenuSelected(o.onExtrasChanged r2) {
        /*
            r1 = this;
            o.onQueueTitleChanged$setMax r0 = r1.equals
            if (r0 == 0) goto L_0x000e
            if (r2 == 0) goto L_0x0007
            goto L_0x0009
        L_0x0007:
            o.onEvent r2 = r1.getMax
        L_0x0009:
            boolean r2 = r0.setMax(r2)
            return r2
        L_0x000e:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.MediaMetadataCompat.onSubMenuSelected(o.onExtrasChanged):boolean");
    }

    public int getId() {
        return this.isInside;
    }
}
