package o;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import androidx.transition.AutoTransition;
import androidx.transition.Transition;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import o.onNestedPreFling;

public final class isHideOnContentScrollEnabled {
    private static Transition getMin = new AutoTransition();
    static ArrayList<ViewGroup> length = new ArrayList<>();
    private static ThreadLocal<WeakReference<PlaybackStateCompat<ViewGroup, ArrayList<Transition>>>> setMin = new ThreadLocal<>();
    private PlaybackStateCompat<onNestedPreScroll, PlaybackStateCompat<onNestedPreScroll, Transition>> getMax = new PlaybackStateCompat<>();
    private PlaybackStateCompat<onNestedPreScroll, Transition> setMax = new PlaybackStateCompat<>();

    static PlaybackStateCompat<ViewGroup, ArrayList<Transition>> getMax() {
        PlaybackStateCompat<ViewGroup, ArrayList<Transition>> playbackStateCompat;
        WeakReference weakReference = setMin.get();
        if (weakReference != null && (playbackStateCompat = (PlaybackStateCompat) weakReference.get()) != null) {
            return playbackStateCompat;
        }
        PlaybackStateCompat<ViewGroup, ArrayList<Transition>> playbackStateCompat2 = new PlaybackStateCompat<>();
        setMin.set(new WeakReference(playbackStateCompat2));
        return playbackStateCompat2;
    }

    static class getMax implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
        ViewGroup getMin;
        Transition length;

        public final void onViewAttachedToWindow(View view) {
        }

        getMax(Transition transition, ViewGroup viewGroup) {
            this.length = transition;
            this.getMin = viewGroup;
        }

        public final void onViewDetachedFromWindow(View view) {
            this.getMin.getViewTreeObserver().removeOnPreDrawListener(this);
            this.getMin.removeOnAttachStateChangeListener(this);
            isHideOnContentScrollEnabled.length.remove(this.getMin);
            ArrayList arrayList = isHideOnContentScrollEnabled.getMax().get(this.getMin);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((Transition) it.next()).resume(this.getMin);
                }
            }
            this.length.clearValues(true);
        }

        public final boolean onPreDraw() {
            this.getMin.getViewTreeObserver().removeOnPreDrawListener(this);
            this.getMin.removeOnAttachStateChangeListener(this);
            if (!isHideOnContentScrollEnabled.length.remove(this.getMin)) {
                return true;
            }
            final PlaybackStateCompat<ViewGroup, ArrayList<Transition>> max = isHideOnContentScrollEnabled.getMax();
            ArrayList arrayList = max.get(this.getMin);
            ArrayList arrayList2 = null;
            if (arrayList == null) {
                arrayList = new ArrayList();
                max.put(this.getMin, arrayList);
            } else if (arrayList.size() > 0) {
                arrayList2 = new ArrayList(arrayList);
            }
            arrayList.add(this.length);
            this.length.addListener(new getActionBarHideOffset() {
                public final void onTransitionEnd(@NonNull Transition transition) {
                    ((ArrayList) max.get(getMax.this.getMin)).remove(transition);
                    transition.removeListener(this);
                }
            });
            this.length.captureValues(this.getMin, false);
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((Transition) it.next()).resume(this.getMin);
                }
            }
            this.length.playTransition(this.getMin);
            return true;
        }
    }

    public static void getMin(@NonNull ViewGroup viewGroup, @Nullable Transition transition) {
        if (!length.contains(viewGroup) && ViewCompat.asInterface(viewGroup)) {
            length.add(viewGroup);
            if (transition == null) {
                transition = getMin;
            }
            Transition clone = transition.clone();
            ArrayList arrayList = getMax().get(viewGroup);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((Transition) it.next()).pause(viewGroup);
                }
            }
            if (clone != null) {
                clone.captureValues(viewGroup, true);
            }
            onNestedPreScroll onnestedprescroll = (onNestedPreScroll) viewGroup.getTag(onNestedPreFling.setMin.length);
            if (!(onnestedprescroll == null || ((onNestedPreScroll) onnestedprescroll.getMin.getTag(onNestedPreFling.setMin.length)) != onnestedprescroll || onnestedprescroll.getMax == null)) {
                onnestedprescroll.getMax.run();
            }
            viewGroup.setTag(onNestedPreFling.setMin.length, (Object) null);
            if (clone != null && viewGroup != null) {
                getMax getmax = new getMax(clone, viewGroup);
                viewGroup.addOnAttachStateChangeListener(getmax);
                viewGroup.getViewTreeObserver().addOnPreDrawListener(getmax);
            }
        }
    }
}
