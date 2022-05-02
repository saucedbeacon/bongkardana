package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import java.util.ArrayList;
import o.ITrustedWebActivityCallback;
import o.MediaBrowserCompat$CustomActionResultReceiver;
import o.MediaMetadataCompat;
import o.RatingCompat;
import o.RequiresPermission;
import o.getQueue;
import o.onEvent;
import o.onExtrasChanged;
import o.onMetadataChanged;
import o.onQueueTitleChanged;
import o.onRepeatModeChanged;
import o.onSessionDestroyed;
import o.removeQueueItemAt;
import o.setNeutralButtonIcon;

public class ActionMenuPresenter extends MediaMetadataCompat implements setNeutralButtonIcon.getMin {
    boolean FastBitmap$CoordinateSystem;
    private int Grayscale$Algorithm;
    private boolean ICustomTabsCallback;
    Drawable IsOverlapping;
    getMax Mean$Arithmetic;
    private int b;
    private int create;
    private setMax extraCallback;
    private final SparseBooleanArray extraCallbackWithResult = new SparseBooleanArray();
    private boolean getCause;
    getMin hashCode;
    final IsOverlapping invoke = new IsOverlapping();
    int invokeSuspend;
    private boolean onNavigationEvent;
    private int onPostMessage;
    boolean toDoubleRange;
    setMin toFloatRange;
    boolean toString;
    length valueOf;
    boolean values;

    public ActionMenuPresenter(Context context) {
        super(context, ITrustedWebActivityCallback.Stub.equals.setMax, ITrustedWebActivityCallback.Stub.equals.getMin);
    }

    public void initForMenu(@NonNull Context context, @Nullable onEvent onevent) {
        super.initForMenu(context, onevent);
        Resources resources = context.getResources();
        MediaBrowserCompat$CustomActionResultReceiver mediaBrowserCompat$CustomActionResultReceiver = new MediaBrowserCompat$CustomActionResultReceiver(context);
        if (!this.values) {
            this.FastBitmap$CoordinateSystem = mediaBrowserCompat$CustomActionResultReceiver.getMin();
        }
        if (!this.ICustomTabsCallback) {
            this.Grayscale$Algorithm = mediaBrowserCompat$CustomActionResultReceiver.getMin.getResources().getDisplayMetrics().widthPixels / 2;
        }
        if (!this.onNavigationEvent) {
            this.create = mediaBrowserCompat$CustomActionResultReceiver.setMin();
        }
        int i = this.Grayscale$Algorithm;
        if (this.FastBitmap$CoordinateSystem) {
            if (this.toFloatRange == null) {
                setMin setmin = new setMin(this.setMax);
                this.toFloatRange = setmin;
                if (this.toString) {
                    setmin.setImageDrawable(this.IsOverlapping);
                    this.IsOverlapping = null;
                    this.toString = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.toFloatRange.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i -= this.toFloatRange.getMeasuredWidth();
        } else {
            this.toFloatRange = null;
        }
        this.b = i;
        this.onPostMessage = (int) (resources.getDisplayMetrics().density * 56.0f);
    }

    public final void getMin() {
        if (!this.onNavigationEvent) {
            this.create = new MediaBrowserCompat$CustomActionResultReceiver(this.setMin).setMin();
        }
        if (this.getMax != null) {
            this.getMax.onItemsChanged(true);
        }
    }

    public final onSessionDestroyed length(ViewGroup viewGroup) {
        onSessionDestroyed onsessiondestroyed = this.toIntRange;
        onSessionDestroyed length2 = super.length(viewGroup);
        if (onsessiondestroyed != length2) {
            ((ActionMenuView) length2).setPresenter(this);
        }
        return length2;
    }

    public final View setMax(RatingCompat ratingCompat, View view, ViewGroup viewGroup) {
        View actionView = ratingCompat.getActionView();
        if (actionView == null || ratingCompat.values()) {
            actionView = super.setMax(ratingCompat, view, viewGroup);
        }
        actionView.setVisibility(ratingCompat.isActionViewExpanded() ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.generateLayoutParams(layoutParams));
        }
        return actionView;
    }

    public final void setMax(RatingCompat ratingCompat, onSessionDestroyed.setMax setmax) {
        setmax.initialize(ratingCompat, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) setmax;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.toIntRange);
        if (this.extraCallback == null) {
            this.extraCallback = new setMax();
        }
        actionMenuItemView.setPopupCallback(this.extraCallback);
    }

    public final boolean setMax(RatingCompat ratingCompat) {
        return ratingCompat.isInside();
    }

    public void updateMenuView(boolean z) {
        super.updateMenuView(z);
        ((View) this.toIntRange).requestLayout();
        boolean z2 = false;
        if (this.getMax != null) {
            ArrayList<RatingCompat> actionItems = this.getMax.getActionItems();
            int size = actionItems.size();
            for (int i = 0; i < size; i++) {
                setNeutralButtonIcon setneutralbuttonicon = actionItems.get(i).equals;
                if (setneutralbuttonicon != null) {
                    setneutralbuttonicon.length(this);
                }
            }
        }
        ArrayList<RatingCompat> nonActionItems = this.getMax != null ? this.getMax.getNonActionItems() : null;
        if (this.FastBitmap$CoordinateSystem && nonActionItems != null) {
            int size2 = nonActionItems.size();
            if (size2 == 1) {
                z2 = !nonActionItems.get(0).isActionViewExpanded();
            } else if (size2 > 0) {
                z2 = true;
            }
        }
        if (z2) {
            if (this.toFloatRange == null) {
                this.toFloatRange = new setMin(this.setMax);
            }
            ViewGroup viewGroup = (ViewGroup) this.toFloatRange.getParent();
            if (viewGroup != this.toIntRange) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.toFloatRange);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.toIntRange;
                actionMenuView.addView(this.toFloatRange, actionMenuView.generateOverflowButtonLayoutParams());
            }
        } else {
            setMin setmin = this.toFloatRange;
            if (setmin != null && setmin.getParent() == this.toIntRange) {
                ((ViewGroup) this.toIntRange).removeView(this.toFloatRange);
            }
        }
        ((ActionMenuView) this.toIntRange).setOverflowReserved(this.FastBitmap$CoordinateSystem);
    }

    public final boolean getMin(ViewGroup viewGroup, int i) {
        if (viewGroup.getChildAt(i) == this.toFloatRange) {
            return false;
        }
        return super.getMin(viewGroup, i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0041 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0042  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onSubMenuSelected(o.onExtrasChanged r8) {
        /*
            r7 = this;
            boolean r0 = r8.hasVisibleItems()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            r0 = r8
        L_0x0009:
            android.view.Menu r2 = r0.getParentMenu()
            o.onEvent r3 = r7.getMax
            if (r2 == r3) goto L_0x0018
            android.view.Menu r0 = r0.getParentMenu()
            o.onExtrasChanged r0 = (o.onExtrasChanged) r0
            goto L_0x0009
        L_0x0018:
            android.view.MenuItem r0 = r0.getItem()
            o.onSessionDestroyed r2 = r7.toIntRange
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            if (r2 == 0) goto L_0x003e
            int r3 = r2.getChildCount()
            r4 = 0
        L_0x0027:
            if (r4 >= r3) goto L_0x003e
            android.view.View r5 = r2.getChildAt(r4)
            boolean r6 = r5 instanceof o.onSessionDestroyed.setMax
            if (r6 == 0) goto L_0x003b
            r6 = r5
            o.onSessionDestroyed$setMax r6 = (o.onSessionDestroyed.setMax) r6
            o.RatingCompat r6 = r6.getItemData()
            if (r6 != r0) goto L_0x003b
            goto L_0x003f
        L_0x003b:
            int r4 = r4 + 1
            goto L_0x0027
        L_0x003e:
            r5 = 0
        L_0x003f:
            if (r5 != 0) goto L_0x0042
            return r1
        L_0x0042:
            android.view.MenuItem r0 = r8.getItem()
            int r0 = r0.getItemId()
            r7.invokeSuspend = r0
            int r0 = r8.size()
            r2 = 0
        L_0x0051:
            r3 = 1
            if (r2 >= r0) goto L_0x0069
            android.view.MenuItem r4 = r8.getItem(r2)
            boolean r6 = r4.isVisible()
            if (r6 == 0) goto L_0x0066
            android.graphics.drawable.Drawable r4 = r4.getIcon()
            if (r4 == 0) goto L_0x0066
            r1 = 1
            goto L_0x0069
        L_0x0066:
            int r2 = r2 + 1
            goto L_0x0051
        L_0x0069:
            androidx.appcompat.widget.ActionMenuPresenter$getMax r0 = new androidx.appcompat.widget.ActionMenuPresenter$getMax
            android.content.Context r2 = r7.setMin
            r0.<init>(r2, r8, r5)
            r7.Mean$Arithmetic = r0
            r0.length = r1
            o.onQueueChanged r2 = r0.setMax
            if (r2 == 0) goto L_0x007d
            o.onQueueChanged r0 = r0.setMax
            r0.length((boolean) r1)
        L_0x007d:
            androidx.appcompat.widget.ActionMenuPresenter$getMax r0 = r7.Mean$Arithmetic
            boolean r0 = r0.setMax()
            if (r0 == 0) goto L_0x0089
            super.onSubMenuSelected(r8)
            return r3
        L_0x0089:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "MenuPopupHelper cannot be used without an anchor"
            r8.<init>(r0)
            goto L_0x0092
        L_0x0091:
            throw r8
        L_0x0092:
            goto L_0x0091
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionMenuPresenter.onSubMenuSelected(o.onExtrasChanged):boolean");
    }

    public final boolean setMin() {
        if (!this.FastBitmap$CoordinateSystem || equals() || this.getMax == null || this.toIntRange == null || this.valueOf != null || this.getMax.getNonActionItems().isEmpty()) {
            return false;
        }
        this.valueOf = new length(new getMin(this.setMin, this.getMax, this.toFloatRange));
        ((View) this.toIntRange).post(this.valueOf);
        return true;
    }

    public final boolean setMax() {
        if (this.valueOf == null || this.toIntRange == null) {
            getMin getmin = this.hashCode;
            if (getmin == null) {
                return false;
            }
            if (getmin.setMin()) {
                getmin.setMax.length();
            }
            return true;
        }
        ((View) this.toIntRange).removeCallbacks(this.valueOf);
        this.valueOf = null;
        return true;
    }

    public final boolean getMax() {
        return setMax() | length();
    }

    public final boolean length() {
        getMax getmax = this.Mean$Arithmetic;
        if (getmax == null) {
            return false;
        }
        if (!getmax.setMin()) {
            return true;
        }
        getmax.setMax.length();
        return true;
    }

    public final boolean equals() {
        getMin getmin = this.hashCode;
        return getmin != null && getmin.setMin();
    }

    public final boolean IsOverlapping() {
        return this.valueOf != null || equals();
    }

    public final boolean isInside() {
        return this.FastBitmap$CoordinateSystem;
    }

    /* JADX WARNING: Removed duplicated region for block: B:66:0x00ee  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean flagActionItems() {
        /*
            r21 = this;
            r0 = r21
            o.onEvent r1 = r0.getMax
            r2 = 0
            r3 = 0
            if (r1 == 0) goto L_0x0013
            o.onEvent r1 = r0.getMax
            java.util.ArrayList r1 = r1.getVisibleItems()
            int r4 = r1.size()
            goto L_0x0015
        L_0x0013:
            r1 = r2
            r4 = 0
        L_0x0015:
            int r5 = r0.create
            int r6 = r0.b
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r3)
            o.onSessionDestroyed r8 = r0.toIntRange
            android.view.ViewGroup r8 = (android.view.ViewGroup) r8
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
        L_0x0025:
            if (r9 >= r4) goto L_0x004e
            java.lang.Object r14 = r1.get(r9)
            o.RatingCompat r14 = (o.RatingCompat) r14
            boolean r15 = r14.equals()
            if (r15 == 0) goto L_0x0036
            int r11 = r11 + 1
            goto L_0x0040
        L_0x0036:
            boolean r15 = r14.toIntRange()
            if (r15 == 0) goto L_0x003f
            int r12 = r12 + 1
            goto L_0x0040
        L_0x003f:
            r10 = 1
        L_0x0040:
            boolean r13 = r0.toDoubleRange
            if (r13 == 0) goto L_0x004b
            boolean r13 = r14.isActionViewExpanded()
            if (r13 == 0) goto L_0x004b
            r5 = 0
        L_0x004b:
            int r9 = r9 + 1
            goto L_0x0025
        L_0x004e:
            boolean r9 = r0.FastBitmap$CoordinateSystem
            if (r9 == 0) goto L_0x0059
            if (r10 != 0) goto L_0x0057
            int r12 = r12 + r11
            if (r12 <= r5) goto L_0x0059
        L_0x0057:
            int r5 = r5 + -1
        L_0x0059:
            int r5 = r5 - r11
            android.util.SparseBooleanArray r9 = r0.extraCallbackWithResult
            r9.clear()
            boolean r10 = r0.getCause
            if (r10 == 0) goto L_0x006c
            int r10 = r0.onPostMessage
            int r11 = r6 / r10
            int r12 = r6 % r10
            int r12 = r12 / r11
            int r10 = r10 + r12
            goto L_0x006e
        L_0x006c:
            r10 = 0
            r11 = 0
        L_0x006e:
            r12 = 0
            r14 = 0
        L_0x0070:
            if (r12 >= r4) goto L_0x015a
            java.lang.Object r15 = r1.get(r12)
            o.RatingCompat r15 = (o.RatingCompat) r15
            boolean r16 = r15.equals()
            if (r16 == 0) goto L_0x00ab
            android.view.View r13 = r0.setMax(r15, r2, r8)
            boolean r2 = r0.getCause
            if (r2 == 0) goto L_0x008c
            int r2 = androidx.appcompat.widget.ActionMenuView.measureChildForCells(r13, r10, r11, r7, r3)
            int r11 = r11 - r2
            goto L_0x008f
        L_0x008c:
            r13.measure(r7, r7)
        L_0x008f:
            int r2 = r13.getMeasuredWidth()
            int r6 = r6 - r2
            if (r14 != 0) goto L_0x0097
            r14 = r2
        L_0x0097:
            int r2 = r15.getGroupId()
            if (r2 == 0) goto L_0x00a1
            r13 = 1
            r9.put(r2, r13)
        L_0x00a1:
            int r2 = r15.IsOverlapping
            r2 = r2 | 32
            r15.IsOverlapping = r2
            r17 = r4
            goto L_0x0150
        L_0x00ab:
            boolean r2 = r15.toIntRange()
            if (r2 == 0) goto L_0x0148
            int r2 = r15.getGroupId()
            boolean r13 = r9.get(r2)
            if (r5 > 0) goto L_0x00bd
            if (r13 == 0) goto L_0x00c7
        L_0x00bd:
            if (r6 <= 0) goto L_0x00c7
            boolean r3 = r0.getCause
            if (r3 == 0) goto L_0x00c5
            if (r11 <= 0) goto L_0x00c7
        L_0x00c5:
            r3 = 1
            goto L_0x00c8
        L_0x00c7:
            r3 = 0
        L_0x00c8:
            r19 = r3
            r17 = r4
            if (r3 == 0) goto L_0x00fe
            r3 = 0
            android.view.View r4 = r0.setMax(r15, r3, r8)
            boolean r3 = r0.getCause
            if (r3 == 0) goto L_0x00e2
            r3 = 0
            int r20 = androidx.appcompat.widget.ActionMenuView.measureChildForCells(r4, r10, r11, r7, r3)
            int r11 = r11 - r20
            if (r20 != 0) goto L_0x00e5
            r3 = 0
            goto L_0x00e7
        L_0x00e2:
            r4.measure(r7, r7)
        L_0x00e5:
            r3 = r19
        L_0x00e7:
            int r4 = r4.getMeasuredWidth()
            int r6 = r6 - r4
            if (r14 != 0) goto L_0x00ef
            r14 = r4
        L_0x00ef:
            boolean r4 = r0.getCause
            if (r4 == 0) goto L_0x00f6
            if (r6 < 0) goto L_0x00fc
            goto L_0x00fa
        L_0x00f6:
            int r4 = r6 + r14
            if (r4 <= 0) goto L_0x00fc
        L_0x00fa:
            r4 = 1
            goto L_0x00fd
        L_0x00fc:
            r4 = 0
        L_0x00fd:
            r3 = r3 & r4
        L_0x00fe:
            if (r3 == 0) goto L_0x0107
            if (r2 == 0) goto L_0x0107
            r4 = 1
            r9.put(r2, r4)
            goto L_0x0134
        L_0x0107:
            if (r13 == 0) goto L_0x0134
            r4 = 0
            r9.put(r2, r4)
            r13 = r5
            r5 = 0
        L_0x010f:
            if (r5 >= r12) goto L_0x0133
            java.lang.Object r18 = r1.get(r5)
            r4 = r18
            o.RatingCompat r4 = (o.RatingCompat) r4
            int r0 = r4.getGroupId()
            if (r0 != r2) goto L_0x012d
            boolean r0 = r4.isInside()
            if (r0 == 0) goto L_0x0127
            int r13 = r13 + 1
        L_0x0127:
            int r0 = r4.IsOverlapping
            r0 = r0 & -33
            r4.IsOverlapping = r0
        L_0x012d:
            int r5 = r5 + 1
            r4 = 0
            r0 = r21
            goto L_0x010f
        L_0x0133:
            r5 = r13
        L_0x0134:
            if (r3 == 0) goto L_0x0138
            int r5 = r5 + -1
        L_0x0138:
            if (r3 == 0) goto L_0x0141
            int r0 = r15.IsOverlapping
            r0 = r0 | 32
            r15.IsOverlapping = r0
            goto L_0x0150
        L_0x0141:
            int r0 = r15.IsOverlapping
            r0 = r0 & -33
            r15.IsOverlapping = r0
            goto L_0x0150
        L_0x0148:
            r17 = r4
            int r0 = r15.IsOverlapping
            r0 = r0 & -33
            r15.IsOverlapping = r0
        L_0x0150:
            int r12 = r12 + 1
            r2 = 0
            r3 = 0
            r0 = r21
            r4 = r17
            goto L_0x0070
        L_0x015a:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionMenuPresenter.flagActionItems():boolean");
    }

    public void onCloseMenu(onEvent onevent, boolean z) {
        getMax();
        super.onCloseMenu(onevent, z);
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState();
        savedState.getMax = this.invokeSuspend;
        return savedState;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem findItem;
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            if (savedState.getMax > 0 && (findItem = this.getMax.findItem(savedState.getMax)) != null) {
                onSubMenuSelected((onExtrasChanged) findItem.getSubMenu());
            }
        }
    }

    public final void length(boolean z) {
        if (z) {
            super.onSubMenuSelected((onExtrasChanged) null);
        } else if (this.getMax != null) {
            this.getMax.close(false);
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() {
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new SavedState[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }
        };
        public int getMax;

        public int describeContents() {
            return 0;
        }

        SavedState() {
        }

        SavedState(Parcel parcel) {
            this.getMax = parcel.readInt();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.getMax);
        }
    }

    class setMin extends AppCompatImageView implements ActionMenuView.getMin {
        public final boolean needsDividerAfter() {
            return false;
        }

        public final boolean needsDividerBefore() {
            return false;
        }

        public setMin(Context context) {
            super(context, (AttributeSet) null, ITrustedWebActivityCallback.Stub.getMin.FastBitmap$CoordinateSystem);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            removeQueueItemAt.setMax(this, getContentDescription());
            setOnTouchListener(new getQueue(this, ActionMenuPresenter.this) {
                public final onRepeatModeChanged length() {
                    if (ActionMenuPresenter.this.hashCode == null) {
                        return null;
                    }
                    return ActionMenuPresenter.this.hashCode.getMax();
                }

                public final boolean getMax() {
                    ActionMenuPresenter.this.setMin();
                    return true;
                }

                public final boolean setMin() {
                    if (ActionMenuPresenter.this.valueOf != null) {
                        return false;
                    }
                    ActionMenuPresenter.this.setMax();
                    return true;
                }
            });
        }

        public final boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            ActionMenuPresenter.this.setMin();
            return true;
        }

        /* access modifiers changed from: protected */
        public final boolean setFrame(int i, int i2, int i3, int i4) {
            boolean frame = super.setFrame(i, i2, i3, i4);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (!(drawable == null || background == null)) {
                int width = getWidth();
                int height = getHeight();
                int max = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                RequiresPermission.Read.setMin(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
            }
            return frame;
        }
    }

    class getMin extends onMetadataChanged {
        public getMin(Context context, onEvent onevent, View view) {
            super(context, onevent, view, true, ITrustedWebActivityCallback.Stub.getMin.toDoubleRange);
            this.getMin = 8388613;
            IsOverlapping isOverlapping = ActionMenuPresenter.this.invoke;
            this.setMin = isOverlapping;
            if (this.setMax != null) {
                this.setMax.setCallback(isOverlapping);
            }
        }

        public final void getMin() {
            if (ActionMenuPresenter.this.getMax != null) {
                ActionMenuPresenter.this.getMax.close();
            }
            ActionMenuPresenter.this.hashCode = null;
            super.getMin();
        }
    }

    class getMax extends onMetadataChanged {
        public getMax(Context context, onExtrasChanged onextraschanged, View view) {
            super(context, onextraschanged, view, false, ITrustedWebActivityCallback.Stub.getMin.toDoubleRange);
            if (!((RatingCompat) onextraschanged.getItem()).isInside()) {
                getMin(ActionMenuPresenter.this.toFloatRange == null ? (View) ActionMenuPresenter.this.toIntRange : ActionMenuPresenter.this.toFloatRange);
            }
            IsOverlapping isOverlapping = ActionMenuPresenter.this.invoke;
            this.setMin = isOverlapping;
            if (this.setMax != null) {
                this.setMax.setCallback(isOverlapping);
            }
        }

        public final void getMin() {
            ActionMenuPresenter.this.Mean$Arithmetic = null;
            ActionMenuPresenter.this.invokeSuspend = 0;
            super.getMin();
        }
    }

    class IsOverlapping implements onQueueTitleChanged.setMax {
        IsOverlapping() {
        }

        public final boolean setMax(@NonNull onEvent onevent) {
            if (onevent == ActionMenuPresenter.this.getMax) {
                return false;
            }
            ActionMenuPresenter.this.invokeSuspend = ((onExtrasChanged) onevent).getItem().getItemId();
            onQueueTitleChanged.setMax setmax = ActionMenuPresenter.this.equals;
            if (setmax != null) {
                return setmax.setMax(onevent);
            }
            return false;
        }

        public final void getMax(@NonNull onEvent onevent, boolean z) {
            if (onevent instanceof onExtrasChanged) {
                onevent.getRootMenu().close(false);
            }
            onQueueTitleChanged.setMax setmax = ActionMenuPresenter.this.equals;
            if (setmax != null) {
                setmax.getMax(onevent, z);
            }
        }
    }

    class length implements Runnable {
        private getMin setMax;

        public length(getMin getmin) {
            this.setMax = getmin;
        }

        public final void run() {
            if (ActionMenuPresenter.this.getMax != null) {
                ActionMenuPresenter.this.getMax.changeMenuMode();
            }
            View view = (View) ActionMenuPresenter.this.toIntRange;
            if (!(view == null || view.getWindowToken() == null || !this.setMax.setMax())) {
                ActionMenuPresenter.this.hashCode = this.setMax;
            }
            ActionMenuPresenter.this.valueOf = null;
        }
    }

    class setMax extends ActionMenuItemView.getMax {
        setMax() {
        }

        public final onRepeatModeChanged setMax() {
            if (ActionMenuPresenter.this.Mean$Arithmetic != null) {
                return ActionMenuPresenter.this.Mean$Arithmetic.getMax();
            }
            return null;
        }
    }
}
