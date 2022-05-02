package androidx.transition;

import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.IdRes;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.transition.Transition;
import java.util.ArrayList;
import java.util.Iterator;
import o.NonNull;
import o.getActionBarHideOffset;
import o.haltActionBarHideOffsetAnimations;
import o.hasIcon;
import o.initFeature;
import o.setActionBarHideOffset;

public class TransitionSet extends Transition {
    public ArrayList<Transition> getMax;
    private boolean getMin;
    boolean length;
    private int setMax;
    int setMin;

    public TransitionSet() {
        this.getMax = new ArrayList<>();
        this.getMin = true;
        this.length = false;
        this.setMax = 0;
    }

    @SuppressLint({"RestrictedApi"})
    public TransitionSet(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.getMax = new ArrayList<>();
        this.getMin = true;
        int i = 0;
        this.length = false;
        this.setMax = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, setActionBarHideOffset.toFloatRange);
        setMin(NonNull.setMin((XmlResourceParser) attributeSet, "transitionOrdering") ? obtainStyledAttributes.getInt(0, 0) : i);
        obtainStyledAttributes.recycle();
    }

    @androidx.annotation.NonNull
    public final TransitionSet setMin(int i) {
        if (i == 0) {
            this.getMin = true;
        } else if (i == 1) {
            this.getMin = false;
        } else {
            throw new AndroidRuntimeException("Invalid parameter for TransitionSet ordering: ".concat(String.valueOf(i)));
        }
        return this;
    }

    @androidx.annotation.NonNull
    /* renamed from: setMin */
    public final TransitionSet setDuration(long j) {
        ArrayList<Transition> arrayList;
        super.setDuration(j);
        if (this.mDuration >= 0 && (arrayList = this.getMax) != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.getMax.get(i).setDuration(j);
            }
        }
        return this;
    }

    @androidx.annotation.NonNull
    /* renamed from: setMin */
    public final TransitionSet setInterpolator(@Nullable TimeInterpolator timeInterpolator) {
        this.setMax |= 1;
        ArrayList<Transition> arrayList = this.getMax;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.getMax.get(i).setInterpolator(timeInterpolator);
            }
        }
        return (TransitionSet) super.setInterpolator(timeInterpolator);
    }

    @androidx.annotation.NonNull
    public Transition excludeTarget(@androidx.annotation.NonNull View view, boolean z) {
        for (int i = 0; i < this.getMax.size(); i++) {
            this.getMax.get(i).excludeTarget(view, z);
        }
        return super.excludeTarget(view, z);
    }

    @androidx.annotation.NonNull
    public Transition excludeTarget(@androidx.annotation.NonNull String str, boolean z) {
        for (int i = 0; i < this.getMax.size(); i++) {
            this.getMax.get(i).excludeTarget(str, z);
        }
        return super.excludeTarget(str, z);
    }

    @androidx.annotation.NonNull
    public Transition excludeTarget(int i, boolean z) {
        for (int i2 = 0; i2 < this.getMax.size(); i2++) {
            this.getMax.get(i2).excludeTarget(i, z);
        }
        return super.excludeTarget(i, z);
    }

    @androidx.annotation.NonNull
    public Transition excludeTarget(@androidx.annotation.NonNull Class<?> cls, boolean z) {
        for (int i = 0; i < this.getMax.size(); i++) {
            this.getMax.get(i).excludeTarget(cls, z);
        }
        return super.excludeTarget(cls, z);
    }

    public void setPathMotion(PathMotion pathMotion) {
        super.setPathMotion(pathMotion);
        this.setMax |= 4;
        if (this.getMax != null) {
            for (int i = 0; i < this.getMax.size(); i++) {
                this.getMax.get(i).setPathMotion(pathMotion);
            }
        }
    }

    static class length extends getActionBarHideOffset {
        TransitionSet setMax;

        length(TransitionSet transitionSet) {
            this.setMax = transitionSet;
        }

        public final void onTransitionStart(@androidx.annotation.NonNull Transition transition) {
            if (!this.setMax.length) {
                this.setMax.start();
                this.setMax.length = true;
            }
        }

        public final void onTransitionEnd(@androidx.annotation.NonNull Transition transition) {
            TransitionSet transitionSet = this.setMax;
            transitionSet.setMin--;
            if (this.setMax.setMin == 0) {
                this.setMax.length = false;
                this.setMax.end();
            }
            transition.removeListener(this);
        }
    }

    /* access modifiers changed from: protected */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void createAnimators(ViewGroup viewGroup, initFeature initfeature, initFeature initfeature2, ArrayList<hasIcon> arrayList, ArrayList<hasIcon> arrayList2) {
        long startDelay = getStartDelay();
        int size = this.getMax.size();
        for (int i = 0; i < size; i++) {
            Transition transition = this.getMax.get(i);
            if (startDelay > 0 && (this.getMin || i == 0)) {
                long startDelay2 = transition.getStartDelay();
                if (startDelay2 > 0) {
                    transition.setStartDelay(startDelay2 + startDelay);
                } else {
                    transition.setStartDelay(startDelay);
                }
            }
            transition.createAnimators(viewGroup, initfeature, initfeature2, arrayList, arrayList2);
        }
    }

    /* access modifiers changed from: protected */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void runAnimators() {
        if (this.getMax.isEmpty()) {
            start();
            end();
            return;
        }
        length length2 = new length(this);
        Iterator<Transition> it = this.getMax.iterator();
        while (it.hasNext()) {
            it.next().addListener(length2);
        }
        this.setMin = this.getMax.size();
        if (!this.getMin) {
            for (int i = 1; i < this.getMax.size(); i++) {
                final Transition transition = this.getMax.get(i);
                this.getMax.get(i - 1).addListener(new getActionBarHideOffset() {
                    public final void onTransitionEnd(@androidx.annotation.NonNull Transition transition) {
                        transition.runAnimators();
                        transition.removeListener(this);
                    }
                });
            }
            Transition transition2 = this.getMax.get(0);
            if (transition2 != null) {
                transition2.runAnimators();
                return;
            }
            return;
        }
        Iterator<Transition> it2 = this.getMax.iterator();
        while (it2.hasNext()) {
            it2.next().runAnimators();
        }
    }

    public void captureStartValues(@androidx.annotation.NonNull hasIcon hasicon) {
        if (isValidTarget(hasicon.setMin)) {
            Iterator<Transition> it = this.getMax.iterator();
            while (it.hasNext()) {
                Transition next = it.next();
                if (next.isValidTarget(hasicon.setMin)) {
                    next.captureStartValues(hasicon);
                    hasicon.getMin.add(next);
                }
            }
        }
    }

    public void captureEndValues(@androidx.annotation.NonNull hasIcon hasicon) {
        if (isValidTarget(hasicon.setMin)) {
            Iterator<Transition> it = this.getMax.iterator();
            while (it.hasNext()) {
                Transition next = it.next();
                if (next.isValidTarget(hasicon.setMin)) {
                    next.captureEndValues(hasicon);
                    hasicon.getMin.add(next);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void capturePropagationValues(hasIcon hasicon) {
        super.capturePropagationValues(hasicon);
        int size = this.getMax.size();
        for (int i = 0; i < size; i++) {
            this.getMax.get(i).capturePropagationValues(hasicon);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void pause(View view) {
        super.pause(view);
        int size = this.getMax.size();
        for (int i = 0; i < size; i++) {
            this.getMax.get(i).pause(view);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void resume(View view) {
        super.resume(view);
        int size = this.getMax.size();
        for (int i = 0; i < size; i++) {
            this.getMax.get(i).resume(view);
        }
    }

    /* access modifiers changed from: protected */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void cancel() {
        super.cancel();
        int size = this.getMax.size();
        for (int i = 0; i < size; i++) {
            this.getMax.get(i).cancel();
        }
    }

    /* access modifiers changed from: package-private */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void forceToEnd(ViewGroup viewGroup) {
        super.forceToEnd(viewGroup);
        int size = this.getMax.size();
        for (int i = 0; i < size; i++) {
            this.getMax.get(i).forceToEnd(viewGroup);
        }
    }

    /* access modifiers changed from: package-private */
    public void setCanRemoveViews(boolean z) {
        super.setCanRemoveViews(z);
        int size = this.getMax.size();
        for (int i = 0; i < size; i++) {
            this.getMax.get(i).setCanRemoveViews(z);
        }
    }

    public void setPropagation(haltActionBarHideOffsetAnimations haltactionbarhideoffsetanimations) {
        super.setPropagation(haltactionbarhideoffsetanimations);
        this.setMax |= 2;
        int size = this.getMax.size();
        for (int i = 0; i < size; i++) {
            this.getMax.get(i).setPropagation(haltactionbarhideoffsetanimations);
        }
    }

    public void setEpicenterCallback(Transition.length length2) {
        super.setEpicenterCallback(length2);
        this.setMax |= 8;
        int size = this.getMax.size();
        for (int i = 0; i < size; i++) {
            this.getMax.get(i).setEpicenterCallback(length2);
        }
    }

    /* access modifiers changed from: package-private */
    public String toString(String str) {
        String transition = super.toString(str);
        for (int i = 0; i < this.getMax.size(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(transition);
            sb.append("\n");
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append("  ");
            sb.append(this.getMax.get(i).toString(sb2.toString()));
            transition = sb.toString();
        }
        return transition;
    }

    public Transition clone() {
        TransitionSet transitionSet = (TransitionSet) super.clone();
        transitionSet.getMax = new ArrayList<>();
        int size = this.getMax.size();
        for (int i = 0; i < size; i++) {
            Transition clone = this.getMax.get(i).clone();
            transitionSet.getMax.add(clone);
            clone.mParent = transitionSet;
        }
        return transitionSet;
    }

    @androidx.annotation.NonNull
    public final TransitionSet setMax(@androidx.annotation.NonNull Transition transition) {
        this.getMax.add(transition);
        transition.mParent = this;
        if (this.mDuration >= 0) {
            transition.setDuration(this.mDuration);
        }
        if ((this.setMax & 1) != 0) {
            transition.setInterpolator(getInterpolator());
        }
        if ((this.setMax & 2) != 0) {
            transition.setPropagation(getPropagation());
        }
        if ((this.setMax & 4) != 0) {
            transition.setPathMotion(getPathMotion());
        }
        if ((this.setMax & 8) != 0) {
            transition.setEpicenterCallback(getEpicenterCallback());
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    public /* synthetic */ Transition setSceneRoot(ViewGroup viewGroup) {
        super.setSceneRoot(viewGroup);
        int size = this.getMax.size();
        for (int i = 0; i < size; i++) {
            this.getMax.get(i).setSceneRoot(viewGroup);
        }
        return this;
    }

    @androidx.annotation.NonNull
    public /* bridge */ /* synthetic */ Transition removeListener(@androidx.annotation.NonNull Transition.getMax getmax) {
        return (TransitionSet) super.removeListener(getmax);
    }

    @androidx.annotation.NonNull
    public /* bridge */ /* synthetic */ Transition addListener(@androidx.annotation.NonNull Transition.getMax getmax) {
        return (TransitionSet) super.addListener(getmax);
    }

    @androidx.annotation.NonNull
    public /* synthetic */ Transition removeTarget(@androidx.annotation.NonNull Class cls) {
        for (int i = 0; i < this.getMax.size(); i++) {
            this.getMax.get(i).removeTarget((Class<?>) cls);
        }
        return (TransitionSet) super.removeTarget((Class<?>) cls);
    }

    @androidx.annotation.NonNull
    public /* synthetic */ Transition removeTarget(@androidx.annotation.NonNull String str) {
        for (int i = 0; i < this.getMax.size(); i++) {
            this.getMax.get(i).removeTarget(str);
        }
        return (TransitionSet) super.removeTarget(str);
    }

    @androidx.annotation.NonNull
    public /* synthetic */ Transition removeTarget(@IdRes int i) {
        for (int i2 = 0; i2 < this.getMax.size(); i2++) {
            this.getMax.get(i2).removeTarget(i);
        }
        return (TransitionSet) super.removeTarget(i);
    }

    @androidx.annotation.NonNull
    public /* synthetic */ Transition removeTarget(@androidx.annotation.NonNull View view) {
        for (int i = 0; i < this.getMax.size(); i++) {
            this.getMax.get(i).removeTarget(view);
        }
        return (TransitionSet) super.removeTarget(view);
    }

    @androidx.annotation.NonNull
    public /* synthetic */ Transition addTarget(@androidx.annotation.NonNull Class cls) {
        for (int i = 0; i < this.getMax.size(); i++) {
            this.getMax.get(i).addTarget((Class<?>) cls);
        }
        return (TransitionSet) super.addTarget((Class<?>) cls);
    }

    @androidx.annotation.NonNull
    public /* synthetic */ Transition addTarget(@androidx.annotation.NonNull String str) {
        for (int i = 0; i < this.getMax.size(); i++) {
            this.getMax.get(i).addTarget(str);
        }
        return (TransitionSet) super.addTarget(str);
    }

    @androidx.annotation.NonNull
    public /* synthetic */ Transition addTarget(@IdRes int i) {
        for (int i2 = 0; i2 < this.getMax.size(); i2++) {
            this.getMax.get(i2).addTarget(i);
        }
        return (TransitionSet) super.addTarget(i);
    }

    @androidx.annotation.NonNull
    public /* synthetic */ Transition addTarget(@androidx.annotation.NonNull View view) {
        for (int i = 0; i < this.getMax.size(); i++) {
            this.getMax.get(i).addTarget(view);
        }
        return (TransitionSet) super.addTarget(view);
    }

    @androidx.annotation.NonNull
    public /* bridge */ /* synthetic */ Transition setStartDelay(long j) {
        return (TransitionSet) super.setStartDelay(j);
    }
}
