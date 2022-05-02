package o;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class onEvent implements Size {
    private static final String ACTION_VIEW_STATES_KEY = "android:menu:actionviewstates";
    private static final String EXPANDED_ACTION_VIEW_ID = "android:menu:expandedactionview";
    private static final String PRESENTER_KEY = "android:menu:presenters";
    private static final String TAG = "MenuBuilder";
    private static final int[] sCategoryToOrder = {1, 4, 5, 3, 2, 0};
    private ArrayList<RatingCompat> mActionItems;
    private length mCallback;
    private final Context mContext;
    private ContextMenu.ContextMenuInfo mCurrentMenuInfo;
    private int mDefaultShowAsAction = 0;
    private RatingCompat mExpandedItem;
    private boolean mGroupDividerEnabled = false;
    Drawable mHeaderIcon;
    CharSequence mHeaderTitle;
    View mHeaderView;
    private boolean mIsActionItemsStale;
    private boolean mIsClosing = false;
    private boolean mIsVisibleItemsStale;
    private ArrayList<RatingCompat> mItems;
    private boolean mItemsChangedWhileDispatchPrevented = false;
    private ArrayList<RatingCompat> mNonActionItems;
    private boolean mOptionalIconsVisible = false;
    private boolean mOverrideVisibleItems;
    private CopyOnWriteArrayList<WeakReference<onQueueTitleChanged>> mPresenters = new CopyOnWriteArrayList<>();
    private boolean mPreventDispatchingItemsChanged = false;
    private boolean mQwertyMode;
    private final Resources mResources;
    private boolean mShortcutsVisible;
    private boolean mStructureChangedWhileDispatchPrevented = false;
    private ArrayList<RatingCompat> mTempShortcutItemList = new ArrayList<>();
    private ArrayList<RatingCompat> mVisibleItems;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public interface length {
        boolean onMenuItemSelected(@NonNull onEvent onevent, @NonNull MenuItem menuItem);

        void onMenuModeChange(@NonNull onEvent onevent);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public interface setMin {
        boolean invokeItem(RatingCompat ratingCompat);
    }

    /* access modifiers changed from: protected */
    public String getActionViewStatesKey() {
        return ACTION_VIEW_STATES_KEY;
    }

    public onEvent getRootMenu() {
        return this;
    }

    public onEvent(Context context) {
        this.mContext = context;
        this.mResources = context.getResources();
        this.mItems = new ArrayList<>();
        this.mVisibleItems = new ArrayList<>();
        this.mIsVisibleItemsStale = true;
        this.mActionItems = new ArrayList<>();
        this.mNonActionItems = new ArrayList<>();
        this.mIsActionItemsStale = true;
        setShortcutsVisibleInner(true);
    }

    public onEvent setDefaultShowAsAction(int i) {
        this.mDefaultShowAsAction = i;
        return this;
    }

    public void addMenuPresenter(onQueueTitleChanged onqueuetitlechanged) {
        addMenuPresenter(onqueuetitlechanged, this.mContext);
    }

    public void addMenuPresenter(onQueueTitleChanged onqueuetitlechanged, Context context) {
        this.mPresenters.add(new WeakReference(onqueuetitlechanged));
        onqueuetitlechanged.initForMenu(context, this);
        this.mIsActionItemsStale = true;
    }

    public void removeMenuPresenter(onQueueTitleChanged onqueuetitlechanged) {
        Iterator<WeakReference<onQueueTitleChanged>> it = this.mPresenters.iterator();
        while (it.hasNext()) {
            WeakReference next = it.next();
            onQueueTitleChanged onqueuetitlechanged2 = (onQueueTitleChanged) next.get();
            if (onqueuetitlechanged2 == null || onqueuetitlechanged2 == onqueuetitlechanged) {
                this.mPresenters.remove(next);
            }
        }
    }

    private void dispatchPresenterUpdate(boolean z) {
        if (!this.mPresenters.isEmpty()) {
            stopDispatchingItemsChanged();
            Iterator<WeakReference<onQueueTitleChanged>> it = this.mPresenters.iterator();
            while (it.hasNext()) {
                WeakReference next = it.next();
                onQueueTitleChanged onqueuetitlechanged = (onQueueTitleChanged) next.get();
                if (onqueuetitlechanged == null) {
                    this.mPresenters.remove(next);
                } else {
                    onqueuetitlechanged.updateMenuView(z);
                }
            }
            startDispatchingItemsChanged();
        }
    }

    private boolean dispatchSubMenuSelected(onExtrasChanged onextraschanged, onQueueTitleChanged onqueuetitlechanged) {
        boolean z = false;
        if (this.mPresenters.isEmpty()) {
            return false;
        }
        if (onqueuetitlechanged != null) {
            z = onqueuetitlechanged.onSubMenuSelected(onextraschanged);
        }
        Iterator<WeakReference<onQueueTitleChanged>> it = this.mPresenters.iterator();
        while (it.hasNext()) {
            WeakReference next = it.next();
            onQueueTitleChanged onqueuetitlechanged2 = (onQueueTitleChanged) next.get();
            if (onqueuetitlechanged2 == null) {
                this.mPresenters.remove(next);
            } else if (!z) {
                z = onqueuetitlechanged2.onSubMenuSelected(onextraschanged);
            }
        }
        return z;
    }

    private void dispatchSaveInstanceState(Bundle bundle) {
        Parcelable onSaveInstanceState;
        if (!this.mPresenters.isEmpty()) {
            SparseArray sparseArray = new SparseArray();
            Iterator<WeakReference<onQueueTitleChanged>> it = this.mPresenters.iterator();
            while (it.hasNext()) {
                WeakReference next = it.next();
                onQueueTitleChanged onqueuetitlechanged = (onQueueTitleChanged) next.get();
                if (onqueuetitlechanged == null) {
                    this.mPresenters.remove(next);
                } else {
                    int id2 = onqueuetitlechanged.getId();
                    if (id2 > 0 && (onSaveInstanceState = onqueuetitlechanged.onSaveInstanceState()) != null) {
                        sparseArray.put(id2, onSaveInstanceState);
                    }
                }
            }
            bundle.putSparseParcelableArray(PRESENTER_KEY, sparseArray);
        }
    }

    private void dispatchRestoreInstanceState(Bundle bundle) {
        Parcelable parcelable;
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(PRESENTER_KEY);
        if (sparseParcelableArray != null && !this.mPresenters.isEmpty()) {
            Iterator<WeakReference<onQueueTitleChanged>> it = this.mPresenters.iterator();
            while (it.hasNext()) {
                WeakReference next = it.next();
                onQueueTitleChanged onqueuetitlechanged = (onQueueTitleChanged) next.get();
                if (onqueuetitlechanged == null) {
                    this.mPresenters.remove(next);
                } else {
                    int id2 = onqueuetitlechanged.getId();
                    if (id2 > 0 && (parcelable = (Parcelable) sparseParcelableArray.get(id2)) != null) {
                        onqueuetitlechanged.onRestoreInstanceState(parcelable);
                    }
                }
            }
        }
    }

    public void savePresenterStates(Bundle bundle) {
        dispatchSaveInstanceState(bundle);
    }

    public void restorePresenterStates(Bundle bundle) {
        dispatchRestoreInstanceState(bundle);
    }

    public void saveActionViewStates(Bundle bundle) {
        int size = size();
        SparseArray sparseArray = null;
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (!(actionView == null || actionView.getId() == -1)) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt(EXPANDED_ACTION_VIEW_ID, item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((onExtrasChanged) item.getSubMenu()).saveActionViewStates(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(getActionViewStatesKey(), sparseArray);
        }
    }

    public void restoreActionViewStates(Bundle bundle) {
        MenuItem findItem;
        if (bundle != null) {
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(getActionViewStatesKey());
            int size = size();
            for (int i = 0; i < size; i++) {
                MenuItem item = getItem(i);
                View actionView = item.getActionView();
                if (!(actionView == null || actionView.getId() == -1)) {
                    actionView.restoreHierarchyState(sparseParcelableArray);
                }
                if (item.hasSubMenu()) {
                    ((onExtrasChanged) item.getSubMenu()).restoreActionViewStates(bundle);
                }
            }
            int i2 = bundle.getInt(EXPANDED_ACTION_VIEW_ID);
            if (i2 > 0 && (findItem = findItem(i2)) != null) {
                findItem.expandActionView();
            }
        }
    }

    public void setCallback(length length2) {
        this.mCallback = length2;
    }

    public MenuItem addInternal(int i, int i2, int i3, CharSequence charSequence) {
        int ordering = getOrdering(i3);
        RatingCompat createNewMenuItem = createNewMenuItem(i, i2, i3, ordering, charSequence, this.mDefaultShowAsAction);
        ContextMenu.ContextMenuInfo contextMenuInfo = this.mCurrentMenuInfo;
        if (contextMenuInfo != null) {
            createNewMenuItem.toIntRange = contextMenuInfo;
        }
        ArrayList<RatingCompat> arrayList = this.mItems;
        arrayList.add(findInsertIndex(arrayList, ordering), createNewMenuItem);
        onItemsChanged(true);
        return createNewMenuItem;
    }

    private RatingCompat createNewMenuItem(int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        return new RatingCompat(this, i, i2, i3, i4, charSequence, i5);
    }

    public MenuItem add(CharSequence charSequence) {
        return addInternal(0, 0, 0, charSequence);
    }

    public MenuItem add(int i) {
        return addInternal(0, 0, 0, this.mResources.getString(i));
    }

    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return addInternal(i, i2, i3, charSequence);
    }

    public MenuItem add(int i, int i2, int i3, int i4) {
        return addInternal(i, i2, i3, this.mResources.getString(i4));
    }

    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, (CharSequence) this.mResources.getString(i));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        RatingCompat ratingCompat = (RatingCompat) addInternal(i, i2, i3, charSequence);
        onExtrasChanged onextraschanged = new onExtrasChanged(this.mContext, this, ratingCompat);
        ratingCompat.setMax = onextraschanged;
        onextraschanged.setHeaderTitle(ratingCompat.getTitle());
        return onextraschanged;
    }

    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, (CharSequence) this.mResources.getString(i4));
    }

    public void setGroupDividerEnabled(boolean z) {
        this.mGroupDividerEnabled = z;
    }

    public boolean isGroupDividerEnabled() {
        return this.mGroupDividerEnabled;
    }

    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        PackageManager packageManager = this.mContext.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i5 = 0; i5 < size; i5++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i5);
            Intent intent2 = new Intent(resolveInfo.specificIndex < 0 ? intent : intentArr[resolveInfo.specificIndex]);
            intent2.setComponent(new ComponentName(resolveInfo.activityInfo.applicationInfo.packageName, resolveInfo.activityInfo.name));
            MenuItem intent3 = add(i, i2, i3, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && resolveInfo.specificIndex >= 0) {
                menuItemArr[resolveInfo.specificIndex] = intent3;
            }
        }
        return size;
    }

    public void removeItem(int i) {
        removeItemAtInt(findItemIndex(i), true);
    }

    public void removeGroup(int i) {
        int findGroupIndex = findGroupIndex(i);
        if (findGroupIndex >= 0) {
            int size = this.mItems.size() - findGroupIndex;
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                if (i2 >= size || this.mItems.get(findGroupIndex).getGroupId() != i) {
                    onItemsChanged(true);
                } else {
                    removeItemAtInt(findGroupIndex, false);
                    i2 = i3;
                }
            }
            onItemsChanged(true);
        }
    }

    private void removeItemAtInt(int i, boolean z) {
        if (i >= 0 && i < this.mItems.size()) {
            this.mItems.remove(i);
            if (z) {
                onItemsChanged(true);
            }
        }
    }

    public void removeItemAt(int i) {
        removeItemAtInt(i, true);
    }

    public void clearAll() {
        this.mPreventDispatchingItemsChanged = true;
        clear();
        clearHeader();
        this.mPresenters.clear();
        this.mPreventDispatchingItemsChanged = false;
        this.mItemsChangedWhileDispatchPrevented = false;
        this.mStructureChangedWhileDispatchPrevented = false;
        onItemsChanged(true);
    }

    public void clear() {
        RatingCompat ratingCompat = this.mExpandedItem;
        if (ratingCompat != null) {
            collapseItemActionView(ratingCompat);
        }
        this.mItems.clear();
        onItemsChanged(true);
    }

    /* access modifiers changed from: package-private */
    public void setExclusiveItemChecked(MenuItem menuItem) {
        int groupId = menuItem.getGroupId();
        int size = this.mItems.size();
        stopDispatchingItemsChanged();
        for (int i = 0; i < size; i++) {
            RatingCompat ratingCompat = this.mItems.get(i);
            if (ratingCompat.getGroupId() == groupId && ratingCompat.getMax() && ratingCompat.isCheckable()) {
                ratingCompat.getMin(ratingCompat == menuItem);
            }
        }
        startDispatchingItemsChanged();
    }

    public void setGroupCheckable(int i, boolean z, boolean z2) {
        int size = this.mItems.size();
        for (int i2 = 0; i2 < size; i2++) {
            RatingCompat ratingCompat = this.mItems.get(i2);
            if (ratingCompat.getGroupId() == i) {
                ratingCompat.IsOverlapping = (ratingCompat.IsOverlapping & -5) | (z2 ? 4 : 0);
                ratingCompat.setCheckable(z);
            }
        }
    }

    public void setGroupVisible(int i, boolean z) {
        int size = this.mItems.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            RatingCompat ratingCompat = this.mItems.get(i2);
            if (ratingCompat.getGroupId() == i && ratingCompat.getMax(z)) {
                z2 = true;
            }
        }
        if (z2) {
            onItemsChanged(true);
        }
    }

    public void setGroupEnabled(int i, boolean z) {
        int size = this.mItems.size();
        for (int i2 = 0; i2 < size; i2++) {
            RatingCompat ratingCompat = this.mItems.get(i2);
            if (ratingCompat.getGroupId() == i) {
                ratingCompat.setEnabled(z);
            }
        }
    }

    public boolean hasVisibleItems() {
        if (this.mOverrideVisibleItems) {
            return true;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.mItems.get(i).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public MenuItem findItem(int i) {
        MenuItem findItem;
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            RatingCompat ratingCompat = this.mItems.get(i2);
            if (ratingCompat.getItemId() == i) {
                return ratingCompat;
            }
            if (ratingCompat.hasSubMenu() && (findItem = ratingCompat.getSubMenu().findItem(i)) != null) {
                return findItem;
            }
        }
        return null;
    }

    public int findItemIndex(int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.mItems.get(i2).getItemId() == i) {
                return i2;
            }
        }
        return -1;
    }

    public int findGroupIndex(int i) {
        return findGroupIndex(i, 0);
    }

    public int findGroupIndex(int i, int i2) {
        int size = size();
        if (i2 < 0) {
            i2 = 0;
        }
        while (i2 < size) {
            if (this.mItems.get(i2).getGroupId() == i) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public int size() {
        return this.mItems.size();
    }

    public MenuItem getItem(int i) {
        return this.mItems.get(i);
    }

    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return findItemWithShortcutForKey(i, keyEvent) != null;
    }

    public void setQwertyMode(boolean z) {
        this.mQwertyMode = z;
        onItemsChanged(false);
    }

    private static int getOrdering(int i) {
        int i2 = (-65536 & i) >> 16;
        if (i2 >= 0) {
            int[] iArr = sCategoryToOrder;
            if (i2 < iArr.length) {
                return (i & 65535) | (iArr[i2] << 16);
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    public boolean isQwertyMode() {
        return this.mQwertyMode;
    }

    public void setShortcutsVisible(boolean z) {
        if (this.mShortcutsVisible != z) {
            setShortcutsVisibleInner(z);
            onItemsChanged(false);
        }
    }

    private void setShortcutsVisibleInner(boolean z) {
        boolean z2 = true;
        if (!z || this.mResources.getConfiguration().keyboard == 1 || !onStop.length(ViewConfiguration.get(this.mContext), this.mContext)) {
            z2 = false;
        }
        this.mShortcutsVisible = z2;
    }

    public boolean isShortcutsVisible() {
        return this.mShortcutsVisible;
    }

    /* access modifiers changed from: package-private */
    public Resources getResources() {
        return this.mResources;
    }

    public Context getContext() {
        return this.mContext;
    }

    /* access modifiers changed from: package-private */
    public boolean dispatchMenuItemSelected(@NonNull onEvent onevent, @NonNull MenuItem menuItem) {
        length length2 = this.mCallback;
        return length2 != null && length2.onMenuItemSelected(onevent, menuItem);
    }

    public void changeMenuMode() {
        length length2 = this.mCallback;
        if (length2 != null) {
            length2.onMenuModeChange(this);
        }
    }

    private static int findInsertIndex(ArrayList<RatingCompat> arrayList, int i) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size).getMin <= i) {
                return size + 1;
            }
        }
        return 0;
    }

    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        RatingCompat findItemWithShortcutForKey = findItemWithShortcutForKey(i, keyEvent);
        boolean performItemAction = findItemWithShortcutForKey != null ? performItemAction(findItemWithShortcutForKey, i2) : false;
        if ((i2 & 2) != 0) {
            close(true);
        }
        return performItemAction;
    }

    /* access modifiers changed from: package-private */
    public void findItemsWithShortcutForKey(List<RatingCompat> list, int i, KeyEvent keyEvent) {
        boolean isQwertyMode = isQwertyMode();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            int size = this.mItems.size();
            for (int i2 = 0; i2 < size; i2++) {
                RatingCompat ratingCompat = this.mItems.get(i2);
                if (ratingCompat.hasSubMenu()) {
                    ((onEvent) ratingCompat.getSubMenu()).findItemsWithShortcutForKey(list, i, keyEvent);
                }
                char alphabeticShortcut = isQwertyMode ? ratingCompat.getAlphabeticShortcut() : ratingCompat.getNumericShortcut();
                if (((modifiers & 69647) == ((isQwertyMode ? ratingCompat.getAlphabeticModifiers() : ratingCompat.getNumericModifiers()) & 69647)) && alphabeticShortcut != 0 && ((alphabeticShortcut == keyData.meta[0] || alphabeticShortcut == keyData.meta[2] || (isQwertyMode && alphabeticShortcut == 8 && i == 67)) && ratingCompat.isEnabled())) {
                    list.add(ratingCompat);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public RatingCompat findItemWithShortcutForKey(int i, KeyEvent keyEvent) {
        char c;
        ArrayList<RatingCompat> arrayList = this.mTempShortcutItemList;
        arrayList.clear();
        findItemsWithShortcutForKey(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        boolean isQwertyMode = isQwertyMode();
        for (int i2 = 0; i2 < size; i2++) {
            RatingCompat ratingCompat = arrayList.get(i2);
            if (isQwertyMode) {
                c = ratingCompat.getAlphabeticShortcut();
            } else {
                c = ratingCompat.getNumericShortcut();
            }
            if ((c == keyData.meta[0] && (metaState & 2) == 0) || ((c == keyData.meta[2] && (metaState & 2) != 0) || (isQwertyMode && c == 8 && i == 67))) {
                return ratingCompat;
            }
        }
        return null;
    }

    public boolean performIdentifierAction(int i, int i2) {
        return performItemAction(findItem(i), i2);
    }

    public boolean performItemAction(MenuItem menuItem, int i) {
        return performItemAction(menuItem, (onQueueTitleChanged) null, i);
    }

    public boolean performItemAction(MenuItem menuItem, onQueueTitleChanged onqueuetitlechanged, int i) {
        RatingCompat ratingCompat = (RatingCompat) menuItem;
        if (ratingCompat == null || !ratingCompat.isEnabled()) {
            return false;
        }
        boolean min = ratingCompat.setMin();
        setNeutralButtonIcon setneutralbuttonicon = ratingCompat.equals;
        boolean z = setneutralbuttonicon != null && setneutralbuttonicon.setMax();
        if (ratingCompat.values()) {
            min |= ratingCompat.expandActionView();
            if (min) {
                close(true);
            }
        } else if (ratingCompat.hasSubMenu() || z) {
            if ((i & 4) == 0) {
                close(false);
            }
            if (!ratingCompat.hasSubMenu()) {
                onExtrasChanged onextraschanged = new onExtrasChanged(getContext(), this, ratingCompat);
                ratingCompat.setMax = onextraschanged;
                onextraschanged.setHeaderTitle(ratingCompat.getTitle());
            }
            onExtrasChanged onextraschanged2 = (onExtrasChanged) ratingCompat.getSubMenu();
            if (z) {
                setneutralbuttonicon.setMax((SubMenu) onextraschanged2);
            }
            min |= dispatchSubMenuSelected(onextraschanged2, onqueuetitlechanged);
            if (!min) {
                close(true);
            }
        } else if ((i & 1) == 0) {
            close(true);
        }
        return min;
    }

    public final void close(boolean z) {
        if (!this.mIsClosing) {
            this.mIsClosing = true;
            Iterator<WeakReference<onQueueTitleChanged>> it = this.mPresenters.iterator();
            while (it.hasNext()) {
                WeakReference next = it.next();
                onQueueTitleChanged onqueuetitlechanged = (onQueueTitleChanged) next.get();
                if (onqueuetitlechanged == null) {
                    this.mPresenters.remove(next);
                } else {
                    onqueuetitlechanged.onCloseMenu(this, z);
                }
            }
            this.mIsClosing = false;
        }
    }

    public void close() {
        close(true);
    }

    public void onItemsChanged(boolean z) {
        if (!this.mPreventDispatchingItemsChanged) {
            if (z) {
                this.mIsVisibleItemsStale = true;
                this.mIsActionItemsStale = true;
            }
            dispatchPresenterUpdate(z);
            return;
        }
        this.mItemsChangedWhileDispatchPrevented = true;
        if (z) {
            this.mStructureChangedWhileDispatchPrevented = true;
        }
    }

    public void stopDispatchingItemsChanged() {
        if (!this.mPreventDispatchingItemsChanged) {
            this.mPreventDispatchingItemsChanged = true;
            this.mItemsChangedWhileDispatchPrevented = false;
            this.mStructureChangedWhileDispatchPrevented = false;
        }
    }

    public void startDispatchingItemsChanged() {
        this.mPreventDispatchingItemsChanged = false;
        if (this.mItemsChangedWhileDispatchPrevented) {
            this.mItemsChangedWhileDispatchPrevented = false;
            onItemsChanged(this.mStructureChangedWhileDispatchPrevented);
        }
    }

    /* access modifiers changed from: package-private */
    public void onItemVisibleChanged(RatingCompat ratingCompat) {
        this.mIsVisibleItemsStale = true;
        onItemsChanged(true);
    }

    public void onItemActionRequestChanged(RatingCompat ratingCompat) {
        this.mIsActionItemsStale = true;
        onItemsChanged(true);
    }

    @NonNull
    public ArrayList<RatingCompat> getVisibleItems() {
        if (!this.mIsVisibleItemsStale) {
            return this.mVisibleItems;
        }
        this.mVisibleItems.clear();
        int size = this.mItems.size();
        for (int i = 0; i < size; i++) {
            RatingCompat ratingCompat = this.mItems.get(i);
            if (ratingCompat.isVisible()) {
                this.mVisibleItems.add(ratingCompat);
            }
        }
        this.mIsVisibleItemsStale = false;
        this.mIsActionItemsStale = true;
        return this.mVisibleItems;
    }

    public void flagActionItems() {
        ArrayList<RatingCompat> visibleItems = getVisibleItems();
        if (this.mIsActionItemsStale) {
            Iterator<WeakReference<onQueueTitleChanged>> it = this.mPresenters.iterator();
            boolean z = false;
            while (it.hasNext()) {
                WeakReference next = it.next();
                onQueueTitleChanged onqueuetitlechanged = (onQueueTitleChanged) next.get();
                if (onqueuetitlechanged == null) {
                    this.mPresenters.remove(next);
                } else {
                    z |= onqueuetitlechanged.flagActionItems();
                }
            }
            if (z) {
                this.mActionItems.clear();
                this.mNonActionItems.clear();
                int size = visibleItems.size();
                for (int i = 0; i < size; i++) {
                    RatingCompat ratingCompat = visibleItems.get(i);
                    if (ratingCompat.isInside()) {
                        this.mActionItems.add(ratingCompat);
                    } else {
                        this.mNonActionItems.add(ratingCompat);
                    }
                }
            } else {
                this.mActionItems.clear();
                this.mNonActionItems.clear();
                this.mNonActionItems.addAll(getVisibleItems());
            }
            this.mIsActionItemsStale = false;
        }
    }

    public ArrayList<RatingCompat> getActionItems() {
        flagActionItems();
        return this.mActionItems;
    }

    public ArrayList<RatingCompat> getNonActionItems() {
        flagActionItems();
        return this.mNonActionItems;
    }

    public void clearHeader() {
        this.mHeaderIcon = null;
        this.mHeaderTitle = null;
        this.mHeaderView = null;
        onItemsChanged(false);
    }

    private void setHeaderInternal(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        Resources resources = getResources();
        if (view != null) {
            this.mHeaderView = view;
            this.mHeaderTitle = null;
            this.mHeaderIcon = null;
        } else {
            if (i > 0) {
                this.mHeaderTitle = resources.getText(i);
            } else if (charSequence != null) {
                this.mHeaderTitle = charSequence;
            }
            if (i2 > 0) {
                this.mHeaderIcon = IntRange.length(getContext(), i2);
            } else if (drawable != null) {
                this.mHeaderIcon = drawable;
            }
            this.mHeaderView = null;
        }
        onItemsChanged(false);
    }

    /* access modifiers changed from: protected */
    public onEvent setHeaderTitleInt(CharSequence charSequence) {
        setHeaderInternal(0, charSequence, 0, (Drawable) null, (View) null);
        return this;
    }

    /* access modifiers changed from: protected */
    public onEvent setHeaderTitleInt(int i) {
        setHeaderInternal(i, (CharSequence) null, 0, (Drawable) null, (View) null);
        return this;
    }

    /* access modifiers changed from: protected */
    public onEvent setHeaderIconInt(Drawable drawable) {
        setHeaderInternal(0, (CharSequence) null, 0, drawable, (View) null);
        return this;
    }

    /* access modifiers changed from: protected */
    public onEvent setHeaderIconInt(int i) {
        setHeaderInternal(0, (CharSequence) null, i, (Drawable) null, (View) null);
        return this;
    }

    /* access modifiers changed from: protected */
    public onEvent setHeaderViewInt(View view) {
        setHeaderInternal(0, (CharSequence) null, 0, (Drawable) null, view);
        return this;
    }

    public CharSequence getHeaderTitle() {
        return this.mHeaderTitle;
    }

    public Drawable getHeaderIcon() {
        return this.mHeaderIcon;
    }

    public View getHeaderView() {
        return this.mHeaderView;
    }

    public void setCurrentMenuInfo(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.mCurrentMenuInfo = contextMenuInfo;
    }

    public void setOptionalIconsVisible(boolean z) {
        this.mOptionalIconsVisible = z;
    }

    /* access modifiers changed from: package-private */
    public boolean getOptionalIconsVisible() {
        return this.mOptionalIconsVisible;
    }

    public boolean expandItemActionView(RatingCompat ratingCompat) {
        boolean z = false;
        if (this.mPresenters.isEmpty()) {
            return false;
        }
        stopDispatchingItemsChanged();
        Iterator<WeakReference<onQueueTitleChanged>> it = this.mPresenters.iterator();
        while (it.hasNext()) {
            WeakReference next = it.next();
            onQueueTitleChanged onqueuetitlechanged = (onQueueTitleChanged) next.get();
            if (onqueuetitlechanged == null) {
                this.mPresenters.remove(next);
            } else {
                z = onqueuetitlechanged.expandItemActionView(this, ratingCompat);
                if (z) {
                    break;
                }
            }
        }
        startDispatchingItemsChanged();
        if (z) {
            this.mExpandedItem = ratingCompat;
        }
        return z;
    }

    public boolean collapseItemActionView(RatingCompat ratingCompat) {
        boolean z = false;
        if (!this.mPresenters.isEmpty() && this.mExpandedItem == ratingCompat) {
            stopDispatchingItemsChanged();
            Iterator<WeakReference<onQueueTitleChanged>> it = this.mPresenters.iterator();
            while (it.hasNext()) {
                WeakReference next = it.next();
                onQueueTitleChanged onqueuetitlechanged = (onQueueTitleChanged) next.get();
                if (onqueuetitlechanged == null) {
                    this.mPresenters.remove(next);
                } else {
                    z = onqueuetitlechanged.collapseItemActionView(this, ratingCompat);
                    if (z) {
                        break;
                    }
                }
            }
            startDispatchingItemsChanged();
            if (z) {
                this.mExpandedItem = null;
            }
        }
        return z;
    }

    public RatingCompat getExpandedItem() {
        return this.mExpandedItem;
    }

    public void setOverrideVisibleItems(boolean z) {
        this.mOverrideVisibleItems = z;
    }
}
