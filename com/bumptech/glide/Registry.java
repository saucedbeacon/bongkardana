package com.bumptech.glide;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import o.PlaybackStateCompat;
import o.SolverVariable$Type;
import o.access$2000;
import o.addPreDrawListener;
import o.ensurePreDrawListener;
import o.fireTransitionCompleted;
import o.fireTrigger;
import o.forceLayout;
import o.getLastWindowInsets;
import o.isUsedOnShow;
import o.parseLayoutDescription;
import o.performIntercept;
import o.resetTouchBehaviors;
import o.setPositiveButtonIcon;
import o.setStatusBarBackground;
import o.setStatusBarBackgroundColor;
import o.setWindowInsets;

public final class Registry {
    public final forceLayout IsOverlapping;
    private final setPositiveButtonIcon.length<List<Throwable>> equals;
    final access$2000 getMax;
    public final resetTouchBehaviors getMin;
    public final setStatusBarBackgroundColor isInside;
    public final setStatusBarBackground length;
    public final isUsedOnShow setMax;
    public final setWindowInsets setMin;
    private final performIntercept toFloatRange = new performIntercept();
    private final getLastWindowInsets toIntRange = new getLastWindowInsets();

    public Registry() {
        setPositiveButtonIcon.length<List<Throwable>> max = addPreDrawListener.setMax();
        this.equals = max;
        this.getMax = new access$2000(max);
        this.length = new setStatusBarBackground();
        this.getMin = new resetTouchBehaviors();
        this.setMin = new setWindowInsets();
        this.setMax = new isUsedOnShow();
        this.IsOverlapping = new forceLayout();
        this.isInside = new setStatusBarBackgroundColor();
        List asList = Arrays.asList(new String[]{"Gif", "Bitmap", "BitmapDrawable"});
        ArrayList arrayList = new ArrayList(asList.size());
        arrayList.addAll(asList);
        arrayList.add(0, "legacy_prepend_all");
        arrayList.add("legacy_append");
        this.getMin.getMin((List<String>) arrayList);
    }

    @Nullable
    public final <Data, TResource, Transcode> fireTransitionCompleted<Data, TResource, Transcode> setMax(@NonNull Class<Data> cls, @NonNull Class<TResource> cls2, @NonNull Class<Transcode> cls3) {
        fireTransitionCompleted<?, ?, ?> firetransitioncompleted;
        Class<Data> cls4 = cls;
        Class<TResource> cls5 = cls2;
        Class<Transcode> cls6 = cls3;
        fireTransitionCompleted<Data, TResource, Transcode> max = this.toIntRange.setMax(cls4, cls5, cls6);
        if (getLastWindowInsets.setMax(max)) {
            return null;
        }
        if (max == null) {
            ArrayList arrayList = new ArrayList();
            for (Class next : this.getMin.getMax(cls4, cls5)) {
                for (Class next2 : this.IsOverlapping.setMax(next, cls6)) {
                    parseLayoutDescription parselayoutdescription = r2;
                    parseLayoutDescription parselayoutdescription2 = new parseLayoutDescription(cls, next, next2, this.getMin.getMin(cls4, next), this.IsOverlapping.getMax(next, next2), this.equals);
                    arrayList.add(parselayoutdescription);
                }
            }
            if (arrayList.isEmpty()) {
                max = null;
            } else {
                max = new fireTransitionCompleted<>(cls, cls2, cls3, arrayList, this.equals);
            }
            getLastWindowInsets getlastwindowinsets = this.toIntRange;
            synchronized (getlastwindowinsets.getMax) {
                PlaybackStateCompat<ensurePreDrawListener, fireTransitionCompleted<?, ?, ?>> playbackStateCompat = getlastwindowinsets.getMax;
                ensurePreDrawListener ensurepredrawlistener = new ensurePreDrawListener(cls4, cls5, cls6);
                if (max != null) {
                    firetransitioncompleted = max;
                } else {
                    firetransitioncompleted = getLastWindowInsets.length;
                }
                playbackStateCompat.put(ensurepredrawlistener, firetransitioncompleted);
            }
        }
        return max;
    }

    @NonNull
    public final <Model, TResource, Transcode> List<Class<?>> getMin(@NonNull Class<Model> cls, @NonNull Class<TResource> cls2, @NonNull Class<Transcode> cls3) {
        List<Class<?>> length2 = this.toFloatRange.length(cls, cls2, cls3);
        if (length2 == null) {
            length2 = new ArrayList<>();
            for (Class<?> max : this.getMax.getMin(cls)) {
                for (Class next : this.getMin.getMax(max, cls2)) {
                    if (!this.IsOverlapping.setMax(next, cls3).isEmpty() && !length2.contains(next)) {
                        length2.add(next);
                    }
                }
            }
            performIntercept performintercept = this.toFloatRange;
            List<T> unmodifiableList = Collections.unmodifiableList(length2);
            synchronized (performintercept.setMin) {
                performintercept.setMin.put(new ensurePreDrawListener(cls, cls2, cls3), unmodifiableList);
            }
        }
        return length2;
    }

    public final boolean getMin(@NonNull fireTrigger<?> firetrigger) {
        return this.setMin.setMin(firetrigger.getMin()) != null;
    }

    @NonNull
    public final <Model> List<SolverVariable$Type<Model, ?>> getMax(@NonNull Model model) {
        List<SolverVariable$Type<A, ?>> min = this.getMax.setMin(model.getClass());
        if (!min.isEmpty()) {
            int size = min.size();
            List<SolverVariable$Type<Model, ?>> emptyList = Collections.emptyList();
            boolean z = true;
            for (int i = 0; i < size; i++) {
                SolverVariable$Type solverVariable$Type = min.get(i);
                if (solverVariable$Type.getMin(model)) {
                    if (z) {
                        emptyList = new ArrayList<>(size - i);
                        z = false;
                    }
                    emptyList.add(solverVariable$Type);
                }
            }
            if (!emptyList.isEmpty()) {
                return emptyList;
            }
            throw new NoModelLoaderAvailableException(model, min);
        }
        throw new NoModelLoaderAvailableException(model);
    }

    public static class NoModelLoaderAvailableException extends MissingComponentException {
        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public NoModelLoaderAvailableException(@androidx.annotation.NonNull java.lang.Object r3) {
            /*
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "Failed to find any ModelLoaders registered for model class: "
                r0.<init>(r1)
                java.lang.Class r3 = r3.getClass()
                r0.append(r3)
                java.lang.String r3 = r0.toString()
                r2.<init>(r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.Registry.NoModelLoaderAvailableException.<init>(java.lang.Object):void");
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public <M> NoModelLoaderAvailableException(@androidx.annotation.NonNull M r3, @androidx.annotation.NonNull java.util.List<o.SolverVariable$Type<M, ?>> r4) {
            /*
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "Found ModelLoaders for model class: "
                r0.<init>(r1)
                r0.append(r4)
                java.lang.String r4 = ", but none that handle this specific model instance: "
                r0.append(r4)
                r0.append(r3)
                java.lang.String r3 = r0.toString()
                r2.<init>(r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.Registry.NoModelLoaderAvailableException.<init>(java.lang.Object, java.util.List):void");
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public NoModelLoaderAvailableException(@androidx.annotation.NonNull java.lang.Class<?> r3, @androidx.annotation.NonNull java.lang.Class<?> r4) {
            /*
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "Failed to find any ModelLoaders for model: "
                r0.<init>(r1)
                r0.append(r3)
                java.lang.String r3 = " and data: "
                r0.append(r3)
                r0.append(r4)
                java.lang.String r3 = r0.toString()
                r2.<init>(r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.Registry.NoModelLoaderAvailableException.<init>(java.lang.Class, java.lang.Class):void");
        }
    }

    public static class NoResultEncoderAvailableException extends MissingComponentException {
        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public NoResultEncoderAvailableException(@androidx.annotation.NonNull java.lang.Class<?> r3) {
            /*
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "Failed to find result encoder for resource class: "
                r0.<init>(r1)
                r0.append(r3)
                java.lang.String r3 = ", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary."
                r0.append(r3)
                java.lang.String r3 = r0.toString()
                r2.<init>(r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.Registry.NoResultEncoderAvailableException.<init>(java.lang.Class):void");
        }
    }

    public static class NoSourceEncoderAvailableException extends MissingComponentException {
        public NoSourceEncoderAvailableException(@NonNull Class<?> cls) {
            super("Failed to find source encoder for data class: ".concat(String.valueOf(cls)));
        }
    }

    public static class MissingComponentException extends RuntimeException {
        public MissingComponentException(@NonNull String str) {
            super(str);
        }
    }

    public static final class NoImageHeaderParserException extends MissingComponentException {
        public NoImageHeaderParserException() {
            super("Failed to find image header parser.");
        }
    }
}
