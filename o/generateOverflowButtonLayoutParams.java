package o;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.io.IOException;
import java.util.ArrayList;
import o.RequiresPermission;
import o.getOverflowIcon;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class generateOverflowButtonLayoutParams extends setMenuCallbacks implements getOverflowIcon {
    private ArgbEvaluator IsOverlapping;
    private Context getMax;
    private getMax getMin;
    private Animator.AnimatorListener isInside;
    final Drawable.Callback setMax;
    ArrayList<getOverflowIcon.getMax> setMin;

    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i) {
        super.setChangingConfigurations(i);
    }

    public /* bridge */ /* synthetic */ void setColorFilter(int i, PorterDuff.Mode mode) {
        super.setColorFilter(i, mode);
    }

    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z) {
        super.setFilterBitmap(z);
    }

    public /* bridge */ /* synthetic */ void setHotspot(float f, float f2) {
        super.setHotspot(f, f2);
    }

    public /* bridge */ /* synthetic */ void setHotspotBounds(int i, int i2, int i3, int i4) {
        super.setHotspotBounds(i, i2, i3, i4);
    }

    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    generateOverflowButtonLayoutParams() {
        this((Context) null, (getMax) null, (Resources) null);
    }

    private generateOverflowButtonLayoutParams(@Nullable Context context) {
        this(context, (getMax) null, (Resources) null);
    }

    private generateOverflowButtonLayoutParams(@Nullable Context context, @Nullable getMax getmax, @Nullable Resources resources) {
        this.IsOverlapping = null;
        this.isInside = null;
        this.setMin = null;
        this.setMax = new Drawable.Callback() {
            public void invalidateDrawable(Drawable drawable) {
                generateOverflowButtonLayoutParams.this.invalidateSelf();
            }

            public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
                generateOverflowButtonLayoutParams.this.scheduleSelf(runnable, j);
            }

            public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
                generateOverflowButtonLayoutParams.this.unscheduleSelf(runnable);
            }
        };
        this.getMax = context;
        if (getmax != null) {
            this.getMin = getmax;
        } else {
            this.getMin = new getMax(context, getmax, this.setMax, resources);
        }
    }

    public Drawable mutate() {
        if (this.length != null) {
            this.length.mutate();
        }
        return this;
    }

    public static generateOverflowButtonLayoutParams getMax(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        generateOverflowButtonLayoutParams generateoverflowbuttonlayoutparams = new generateOverflowButtonLayoutParams(context);
        generateoverflowbuttonlayoutparams.inflate(resources, xmlPullParser, attributeSet, theme);
        return generateoverflowbuttonlayoutparams;
    }

    public Drawable.ConstantState getConstantState() {
        if (this.length == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new getMin(this.length.getConstantState());
    }

    public int getChangingConfigurations() {
        if (this.length != null) {
            return this.length.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.getMin.length;
    }

    public void draw(Canvas canvas) {
        if (this.length != null) {
            this.length.draw(canvas);
            return;
        }
        this.getMin.getMax.draw(canvas);
        if (this.getMin.setMax.isStarted()) {
            invalidateSelf();
        }
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        if (this.length != null) {
            this.length.setBounds(rect);
        } else {
            this.getMin.getMax.setBounds(rect);
        }
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        if (this.length != null) {
            return this.length.setState(iArr);
        }
        return this.getMin.getMax.setState(iArr);
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        if (this.length != null) {
            return this.length.setLevel(i);
        }
        return this.getMin.getMax.setLevel(i);
    }

    public int getAlpha() {
        if (this.length != null) {
            return RequiresPermission.Read.length(this.length);
        }
        return this.getMin.getMax.getAlpha();
    }

    public void setAlpha(int i) {
        if (this.length != null) {
            this.length.setAlpha(i);
        } else {
            this.getMin.getMax.setAlpha(i);
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        if (this.length != null) {
            this.length.setColorFilter(colorFilter);
        } else {
            this.getMin.getMax.setColorFilter(colorFilter);
        }
    }

    public ColorFilter getColorFilter() {
        if (this.length != null) {
            return RequiresPermission.Read.setMax(this.length);
        }
        return this.getMin.getMax.getColorFilter();
    }

    public void setTint(int i) {
        if (this.length != null) {
            RequiresPermission.Read.getMin(this.length, i);
        } else {
            this.getMin.getMax.setTint(i);
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        if (this.length != null) {
            RequiresPermission.Read.setMin(this.length, colorStateList);
        } else {
            this.getMin.getMax.setTintList(colorStateList);
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        if (this.length != null) {
            RequiresPermission.Read.setMin(this.length, mode);
        } else {
            this.getMin.getMax.setTintMode(mode);
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        if (this.length != null) {
            return this.length.setVisible(z, z2);
        }
        this.getMin.getMax.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    public boolean isStateful() {
        if (this.length != null) {
            return this.length.isStateful();
        }
        return this.getMin.getMax.isStateful();
    }

    public int getOpacity() {
        if (this.length != null) {
            return this.length.getOpacity();
        }
        return this.getMin.getMax.getOpacity();
    }

    public int getIntrinsicWidth() {
        if (this.length != null) {
            return this.length.getIntrinsicWidth();
        }
        return this.getMin.getMax.getIntrinsicWidth();
    }

    public int getIntrinsicHeight() {
        if (this.length != null) {
            return this.length.getIntrinsicHeight();
        }
        return this.getMin.getMax.getIntrinsicHeight();
    }

    public boolean isAutoMirrored() {
        if (this.length != null) {
            return RequiresPermission.Read.setMin(this.length);
        }
        return this.getMin.getMax.isAutoMirrored();
    }

    public void setAutoMirrored(boolean z) {
        if (this.length != null) {
            RequiresPermission.Read.getMin(this.length, z);
        } else {
            this.getMin.getMax.setAutoMirrored(z);
        }
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        TypedArray typedArray;
        if (this.length != null) {
            RequiresPermission.Read.getMin(this.length, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    int[] iArr = getMenu.setMax;
                    if (theme == null) {
                        typedArray = resources.obtainAttributes(attributeSet, iArr);
                    } else {
                        typedArray = theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
                    }
                    int resourceId = typedArray.getResourceId(0, 0);
                    if (resourceId != 0) {
                        setExpandActivityOverflowButtonContentDescription max = setExpandActivityOverflowButtonContentDescription.getMax(resources, resourceId, theme);
                        max.getMin(false);
                        max.setCallback(this.setMax);
                        if (this.getMin.getMax != null) {
                            this.getMin.getMax.setCallback((Drawable.Callback) null);
                        }
                        this.getMin.getMax = max;
                    }
                    typedArray.recycle();
                } else if ("target".equals(name)) {
                    TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, getMenu.equals);
                    String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.getMax;
                        if (context != null) {
                            getMin(string, setExpandedActionViewsExclusive.getMin(context, resourceId2));
                        } else {
                            obtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                    }
                    obtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        this.getMin.getMax();
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        inflate(resources, xmlPullParser, attributeSet, (Resources.Theme) null);
    }

    public void applyTheme(Resources.Theme theme) {
        if (this.length != null) {
            RequiresPermission.Read.getMax(this.length, theme);
        }
    }

    public boolean canApplyTheme() {
        if (this.length != null) {
            return RequiresPermission.Read.getMax(this.length);
        }
        return false;
    }

    @RequiresApi(24)
    static class getMin extends Drawable.ConstantState {
        private final Drawable.ConstantState getMax;

        public getMin(Drawable.ConstantState constantState) {
            this.getMax = constantState;
        }

        public Drawable newDrawable() {
            generateOverflowButtonLayoutParams generateoverflowbuttonlayoutparams = new generateOverflowButtonLayoutParams();
            generateoverflowbuttonlayoutparams.length = this.getMax.newDrawable();
            generateoverflowbuttonlayoutparams.length.setCallback(generateoverflowbuttonlayoutparams.setMax);
            return generateoverflowbuttonlayoutparams;
        }

        public Drawable newDrawable(Resources resources) {
            generateOverflowButtonLayoutParams generateoverflowbuttonlayoutparams = new generateOverflowButtonLayoutParams();
            generateoverflowbuttonlayoutparams.length = this.getMax.newDrawable(resources);
            generateoverflowbuttonlayoutparams.length.setCallback(generateoverflowbuttonlayoutparams.setMax);
            return generateoverflowbuttonlayoutparams;
        }

        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            generateOverflowButtonLayoutParams generateoverflowbuttonlayoutparams = new generateOverflowButtonLayoutParams();
            generateoverflowbuttonlayoutparams.length = this.getMax.newDrawable(resources, theme);
            generateoverflowbuttonlayoutparams.length.setCallback(generateoverflowbuttonlayoutparams.setMax);
            return generateoverflowbuttonlayoutparams;
        }

        public boolean canApplyTheme() {
            return this.getMax.canApplyTheme();
        }

        public int getChangingConfigurations() {
            return this.getMax.getChangingConfigurations();
        }
    }

    static class getMax extends Drawable.ConstantState {
        setExpandActivityOverflowButtonContentDescription getMax;
        ArrayList<Animator> getMin;
        int length;
        AnimatorSet setMax;
        PlaybackStateCompat<Animator, String> setMin;

        public getMax(Context context, getMax getmax, Drawable.Callback callback, Resources resources) {
            if (getmax != null) {
                this.length = getmax.length;
                setExpandActivityOverflowButtonContentDescription setexpandactivityoverflowbuttoncontentdescription = getmax.getMax;
                if (setexpandactivityoverflowbuttoncontentdescription != null) {
                    Drawable.ConstantState constantState = setexpandactivityoverflowbuttoncontentdescription.getConstantState();
                    if (resources != null) {
                        this.getMax = (setExpandActivityOverflowButtonContentDescription) constantState.newDrawable(resources);
                    } else {
                        this.getMax = (setExpandActivityOverflowButtonContentDescription) constantState.newDrawable();
                    }
                    setExpandActivityOverflowButtonContentDescription setexpandactivityoverflowbuttoncontentdescription2 = (setExpandActivityOverflowButtonContentDescription) this.getMax.mutate();
                    this.getMax = setexpandactivityoverflowbuttoncontentdescription2;
                    setexpandactivityoverflowbuttoncontentdescription2.setCallback(callback);
                    this.getMax.setBounds(getmax.getMax.getBounds());
                    this.getMax.getMin(false);
                }
                ArrayList<Animator> arrayList = getmax.getMin;
                if (arrayList != null) {
                    int size = arrayList.size();
                    this.getMin = new ArrayList<>(size);
                    this.setMin = new PlaybackStateCompat<>(size);
                    for (int i = 0; i < size; i++) {
                        Animator animator = getmax.getMin.get(i);
                        Animator clone = animator.clone();
                        String str = getmax.setMin.get(animator);
                        clone.setTarget(this.getMax.getMin(str));
                        this.getMin.add(clone);
                        this.setMin.put(clone, str);
                    }
                    getMax();
                }
            }
        }

        public Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        public Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        public int getChangingConfigurations() {
            return this.length;
        }

        public void getMax() {
            if (this.setMax == null) {
                this.setMax = new AnimatorSet();
            }
            this.setMax.playTogether(this.getMin);
        }
    }

    private void setMax(Animator animator) {
        ArrayList<Animator> childAnimations;
        if ((animator instanceof AnimatorSet) && (childAnimations = ((AnimatorSet) animator).getChildAnimations()) != null) {
            for (int i = 0; i < childAnimations.size(); i++) {
                setMax(childAnimations.get(i));
            }
        }
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            String propertyName = objectAnimator.getPropertyName();
            if ("fillColor".equals(propertyName) || "strokeColor".equals(propertyName)) {
                if (this.IsOverlapping == null) {
                    this.IsOverlapping = new ArgbEvaluator();
                }
                objectAnimator.setEvaluator(this.IsOverlapping);
            }
        }
    }

    private void getMin(String str, Animator animator) {
        animator.setTarget(this.getMin.getMax.getMin(str));
        if (Build.VERSION.SDK_INT < 21) {
            setMax(animator);
        }
        if (this.getMin.getMin == null) {
            this.getMin.getMin = new ArrayList<>();
            this.getMin.setMin = new PlaybackStateCompat<>();
        }
        this.getMin.getMin.add(animator);
        this.getMin.setMin.put(animator, str);
    }

    public boolean isRunning() {
        if (this.length != null) {
            return ((AnimatedVectorDrawable) this.length).isRunning();
        }
        return this.getMin.setMax.isRunning();
    }

    public void start() {
        if (this.length != null) {
            ((AnimatedVectorDrawable) this.length).start();
        } else if (!this.getMin.setMax.isStarted()) {
            this.getMin.setMax.start();
            invalidateSelf();
        }
    }

    public void stop() {
        if (this.length != null) {
            ((AnimatedVectorDrawable) this.length).stop();
        } else {
            this.getMin.setMax.end();
        }
    }
}
