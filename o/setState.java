package o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.SpecialEffectsController;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o.StringRes;
import o.isStateful;

public final class setState extends SpecialEffectsController {
    public setState(@NonNull ViewGroup viewGroup) {
        super(viewGroup);
    }

    public final void setMin(@NonNull List<SpecialEffectsController.Operation> list, boolean z) {
        SpecialEffectsController.Operation operation = null;
        SpecialEffectsController.Operation operation2 = null;
        for (SpecialEffectsController.Operation next : list) {
            SpecialEffectsController.Operation.State from = SpecialEffectsController.Operation.State.from(next.setMin.mView);
            int i = AnonymousClass4.getMax[next.getMax.ordinal()];
            if (i == 1 || i == 2 || i == 3) {
                if (from == SpecialEffectsController.Operation.State.VISIBLE && operation == null) {
                    operation = next;
                }
            } else if (i == 4 && from != SpecialEffectsController.Operation.State.VISIBLE) {
                operation2 = next;
            }
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        final ArrayList<SpecialEffectsController.Operation> arrayList3 = new ArrayList<>(list);
        for (final SpecialEffectsController.Operation next2 : list) {
            StringRes stringRes = new StringRes();
            next2.setMax();
            next2.length.add(stringRes);
            arrayList.add(new setMin(next2, stringRes, z));
            StringRes stringRes2 = new StringRes();
            next2.setMax();
            next2.length.add(stringRes2);
            boolean z2 = false;
            if (z) {
                if (next2 != operation) {
                    arrayList2.add(new getMax(next2, stringRes2, z, z2));
                    next2.getMin.add(new Runnable() {
                        public final void run() {
                            if (arrayList3.contains(next2)) {
                                arrayList3.remove(next2);
                                SpecialEffectsController.Operation operation = next2;
                                operation.getMax.applyState(operation.setMin.mView);
                            }
                        }
                    });
                }
            } else if (next2 != operation2) {
                arrayList2.add(new getMax(next2, stringRes2, z, z2));
                next2.getMin.add(new Runnable() {
                    public final void run() {
                        if (arrayList3.contains(next2)) {
                            arrayList3.remove(next2);
                            SpecialEffectsController.Operation operation = next2;
                            operation.getMax.applyState(operation.setMin.mView);
                        }
                    }
                });
            }
            z2 = true;
            arrayList2.add(new getMax(next2, stringRes2, z, z2));
            next2.getMin.add(new Runnable() {
                public final void run() {
                    if (arrayList3.contains(next2)) {
                        arrayList3.remove(next2);
                        SpecialEffectsController.Operation operation = next2;
                        operation.getMax.applyState(operation.setMin.mView);
                    }
                }
            });
        }
        Map<SpecialEffectsController.Operation, Boolean> length2 = length(arrayList2, arrayList3, z, operation, operation2);
        length(arrayList, arrayList3, length2.containsValue(Boolean.TRUE), length2);
        for (SpecialEffectsController.Operation operation3 : arrayList3) {
            operation3.getMax.applyState(operation3.setMin.mView);
        }
        arrayList3.clear();
    }

    /* renamed from: o.setState$4  reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] getMax;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                androidx.fragment.app.SpecialEffectsController$Operation$State[] r0 = androidx.fragment.app.SpecialEffectsController.Operation.State.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                getMax = r0
                androidx.fragment.app.SpecialEffectsController$Operation$State r1 = androidx.fragment.app.SpecialEffectsController.Operation.State.GONE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = getMax     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.fragment.app.SpecialEffectsController$Operation$State r1 = androidx.fragment.app.SpecialEffectsController.Operation.State.INVISIBLE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = getMax     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.fragment.app.SpecialEffectsController$Operation$State r1 = androidx.fragment.app.SpecialEffectsController.Operation.State.REMOVED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = getMax     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.fragment.app.SpecialEffectsController$Operation$State r1 = androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.setState.AnonymousClass4.<clinit>():void");
        }
    }

    private void length(@NonNull List<setMin> list, @NonNull List<SpecialEffectsController.Operation> list2, boolean z, @NonNull Map<SpecialEffectsController.Operation, Boolean> map) {
        final ViewGroup min = setMin();
        Context context = min.getContext();
        ArrayList arrayList = new ArrayList();
        boolean z2 = false;
        for (setMin next : list) {
            if (next.getMin()) {
                SpecialEffectsController.Operation operation = next.setMax;
                if (operation.length.remove(next.length) && operation.length.isEmpty()) {
                    operation.setMin();
                }
            } else {
                isStateful.length min2 = next.setMin(context);
                if (min2 == null) {
                    SpecialEffectsController.Operation operation2 = next.setMax;
                    if (operation2.length.remove(next.length) && operation2.length.isEmpty()) {
                        operation2.setMin();
                    }
                } else {
                    final Animator animator = min2.setMin;
                    if (animator == null) {
                        arrayList.add(next);
                    } else {
                        final SpecialEffectsController.Operation operation3 = next.setMax;
                        Fragment fragment = operation3.setMin;
                        if (Boolean.TRUE.equals(map.get(operation3))) {
                            FragmentManager.getMin(2);
                            SpecialEffectsController.Operation operation4 = next.setMax;
                            if (operation4.length.remove(next.length) && operation4.length.isEmpty()) {
                                operation4.setMin();
                            }
                        } else {
                            final boolean z3 = operation3.getMax == SpecialEffectsController.Operation.State.GONE;
                            List<SpecialEffectsController.Operation> list3 = list2;
                            if (z3) {
                                list3.remove(operation3);
                            }
                            View view = fragment.mView;
                            min.startViewTransition(view);
                            AnonymousClass1 r12 = r0;
                            View view2 = view;
                            final ViewGroup viewGroup = min;
                            final View view3 = view2;
                            final setMin setmin = next;
                            AnonymousClass1 r0 = new AnimatorListenerAdapter() {
                                public final void onAnimationEnd(Animator animator) {
                                    viewGroup.endViewTransition(view3);
                                    if (z3) {
                                        operation3.getMax.applyState(view3);
                                    }
                                    setMin setmin = setmin;
                                    SpecialEffectsController.Operation operation = setmin.setMax;
                                    if (operation.length.remove(setmin.length) && operation.length.isEmpty()) {
                                        operation.setMin();
                                    }
                                }
                            };
                            animator.addListener(r12);
                            animator.setTarget(view2);
                            animator.start();
                            next.length.getMax(new StringRes.getMin() {
                                public final void getMin() {
                                    animator.end();
                                }
                            });
                            z2 = true;
                        }
                    }
                }
            }
            Map<SpecialEffectsController.Operation, Boolean> map2 = map;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            final setMin setmin2 = (setMin) it.next();
            SpecialEffectsController.Operation operation5 = setmin2.setMax;
            Fragment fragment2 = operation5.setMin;
            if (z) {
                FragmentManager.getMin(2);
                SpecialEffectsController.Operation operation6 = setmin2.setMax;
                if (operation6.length.remove(setmin2.length) && operation6.length.isEmpty()) {
                    operation6.setMin();
                }
            } else if (z2) {
                FragmentManager.getMin(2);
                SpecialEffectsController.Operation operation7 = setmin2.setMax;
                if (operation7.length.remove(setmin2.length) && operation7.length.isEmpty()) {
                    operation7.setMin();
                }
            } else {
                final View view4 = fragment2.mView;
                isStateful.length min3 = setmin2.setMin(context);
                if (min3 != null) {
                    Animation animation = min3.length;
                    if (animation != null) {
                        Animation animation2 = animation;
                        if (operation5.getMax != SpecialEffectsController.Operation.State.REMOVED) {
                            view4.startAnimation(animation2);
                            SpecialEffectsController.Operation operation8 = setmin2.setMax;
                            if (operation8.length.remove(setmin2.length) && operation8.length.isEmpty()) {
                                operation8.setMin();
                            }
                        } else {
                            min.startViewTransition(view4);
                            isStateful.getMax getmax = new isStateful.getMax(animation2, min, view4);
                            getmax.setAnimationListener(new Animation.AnimationListener() {
                                public final void onAnimationRepeat(Animation animation) {
                                }

                                public final void onAnimationStart(Animation animation) {
                                }

                                public final void onAnimationEnd(Animation animation) {
                                    min.post(new Runnable() {
                                        public final void run() {
                                            min.endViewTransition(view4);
                                            setMin setmin = setmin2;
                                            SpecialEffectsController.Operation operation = setmin.setMax;
                                            if (operation.length.remove(setmin.length) && operation.length.isEmpty()) {
                                                operation.setMin();
                                            }
                                        }
                                    });
                                }
                            });
                            view4.startAnimation(getmax);
                        }
                        setmin2.length.getMax(new StringRes.getMin() {
                            public final void getMin() {
                                view4.clearAnimation();
                                min.endViewTransition(view4);
                                setMin setmin = setmin2;
                                SpecialEffectsController.Operation operation = setmin.setMax;
                                if (operation.length.remove(setmin.length) && operation.length.isEmpty()) {
                                    operation.setMin();
                                }
                            }
                        });
                    } else {
                        throw null;
                    }
                } else {
                    throw null;
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:88:0x02b8, code lost:
        r0 = (android.view.View) r14.get(r11.get(r1));
     */
    @androidx.annotation.NonNull
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.util.Map<androidx.fragment.app.SpecialEffectsController.Operation, java.lang.Boolean> length(@androidx.annotation.NonNull java.util.List<o.setState.getMax> r33, @androidx.annotation.NonNull java.util.List<androidx.fragment.app.SpecialEffectsController.Operation> r34, boolean r35, @androidx.annotation.Nullable androidx.fragment.app.SpecialEffectsController.Operation r36, @androidx.annotation.Nullable androidx.fragment.app.SpecialEffectsController.Operation r37) {
        /*
            r32 = this;
            r6 = r32
            r7 = r35
            r8 = r36
            r9 = r37
            java.util.HashMap r10 = new java.util.HashMap
            r10.<init>()
            java.util.Iterator r0 = r33.iterator()
            r15 = 0
        L_0x0012:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0093
            java.lang.Object r1 = r0.next()
            o.setState$getMax r1 = (o.setState.getMax) r1
            boolean r2 = r1.getMin()
            if (r2 != 0) goto L_0x0012
            java.lang.Object r2 = r1.setMin
            o.setTintList r2 = r1.length(r2)
            java.lang.Object r3 = r1.getMin
            o.setTintList r3 = r1.length(r3)
            java.lang.String r4 = " returned Transition "
            java.lang.String r5 = "Mixing framework transitions and AndroidX transitions is not allowed. Fragment "
            if (r2 == 0) goto L_0x0063
            if (r3 == 0) goto L_0x0063
            if (r2 != r3) goto L_0x003b
            goto L_0x0063
        L_0x003b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r5)
            androidx.fragment.app.SpecialEffectsController$Operation r3 = r1.setMax
            androidx.fragment.app.Fragment r3 = r3.setMin
            r2.append(r3)
            r2.append(r4)
            java.lang.Object r3 = r1.setMin
            r2.append(r3)
            java.lang.String r3 = " which uses a different Transition  type than its shared element transition "
            r2.append(r3)
            java.lang.Object r1 = r1.getMin
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        L_0x0063:
            if (r2 == 0) goto L_0x0066
            goto L_0x0067
        L_0x0066:
            r2 = r3
        L_0x0067:
            if (r15 != 0) goto L_0x006b
            r15 = r2
            goto L_0x0012
        L_0x006b:
            if (r2 == 0) goto L_0x0012
            if (r15 != r2) goto L_0x0070
            goto L_0x0012
        L_0x0070:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r5)
            androidx.fragment.app.SpecialEffectsController$Operation r3 = r1.setMax
            androidx.fragment.app.Fragment r3 = r3.setMin
            r2.append(r3)
            r2.append(r4)
            java.lang.Object r1 = r1.setMin
            r2.append(r1)
            java.lang.String r1 = " which uses a different Transition  type than other Fragments."
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        L_0x0093:
            if (r15 != 0) goto L_0x00c5
            java.util.Iterator r0 = r33.iterator()
        L_0x0099:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00c4
            java.lang.Object r1 = r0.next()
            o.setState$getMax r1 = (o.setState.getMax) r1
            androidx.fragment.app.SpecialEffectsController$Operation r2 = r1.setMax
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            r10.put(r2, r3)
            androidx.fragment.app.SpecialEffectsController$Operation r2 = r1.setMax
            o.StringRes r1 = r1.length
            java.util.HashSet<o.StringRes> r3 = r2.length
            boolean r1 = r3.remove(r1)
            if (r1 == 0) goto L_0x0099
            java.util.HashSet<o.StringRes> r1 = r2.length
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x0099
            r2.setMin()
            goto L_0x0099
        L_0x00c4:
            return r10
        L_0x00c5:
            android.view.View r14 = new android.view.View
            android.view.ViewGroup r0 = r32.setMin()
            android.content.Context r0 = r0.getContext()
            r14.<init>(r0)
            android.graphics.Rect r13 = new android.graphics.Rect
            r13.<init>()
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            o.PlaybackStateCompat r4 = new o.PlaybackStateCompat
            r4.<init>()
            java.util.Iterator r20 = r33.iterator()
            r0 = 0
            r2 = 0
            r21 = 0
        L_0x00ee:
            boolean r1 = r20.hasNext()
            r22 = 1
            if (r1 == 0) goto L_0x032c
            java.lang.Object r1 = r20.next()
            o.setState$getMax r1 = (o.setState.getMax) r1
            boolean r16 = r1.length()
            if (r16 == 0) goto L_0x0307
            if (r8 == 0) goto L_0x0307
            if (r9 == 0) goto L_0x0307
            java.lang.Object r0 = r1.getMin
            java.lang.Object r0 = r15.setMin((java.lang.Object) r0)
            java.lang.Object r1 = r15.getMin(r0)
            androidx.fragment.app.Fragment r0 = r9.setMin
            java.util.ArrayList r0 = r0.getSharedElementSourceNames()
            androidx.fragment.app.Fragment r3 = r8.setMin
            java.util.ArrayList r3 = r3.getSharedElementSourceNames()
            androidx.fragment.app.Fragment r11 = r8.setMin
            java.util.ArrayList r11 = r11.getSharedElementTargetNames()
            r17 = r1
            r18 = r2
            r1 = 0
        L_0x0127:
            int r2 = r11.size()
            if (r1 >= r2) goto L_0x0146
            java.lang.Object r2 = r11.get(r1)
            int r2 = r0.indexOf(r2)
            r19 = r11
            r11 = -1
            if (r2 == r11) goto L_0x0141
            java.lang.Object r11 = r3.get(r1)
            r0.set(r2, r11)
        L_0x0141:
            int r1 = r1 + 1
            r11 = r19
            goto L_0x0127
        L_0x0146:
            androidx.fragment.app.Fragment r1 = r9.setMin
            java.util.ArrayList r11 = r1.getSharedElementTargetNames()
            if (r7 != 0) goto L_0x015b
            androidx.fragment.app.Fragment r1 = r8.setMin
            o.mask r1 = r1.getExitTransitionCallback()
            androidx.fragment.app.Fragment r2 = r9.setMin
            o.mask r2 = r2.getEnterTransitionCallback()
            goto L_0x0167
        L_0x015b:
            androidx.fragment.app.Fragment r1 = r8.setMin
            o.mask r1 = r1.getEnterTransitionCallback()
            androidx.fragment.app.Fragment r2 = r9.setMin
            o.mask r2 = r2.getExitTransitionCallback()
        L_0x0167:
            int r3 = r0.size()
            r23 = r10
            r10 = 0
        L_0x016e:
            if (r10 >= r3) goto L_0x018e
            java.lang.Object r19 = r0.get(r10)
            r24 = r3
            r3 = r19
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r19 = r11.get(r10)
            r25 = r14
            r14 = r19
            java.lang.String r14 = (java.lang.String) r14
            r4.put(r3, r14)
            int r10 = r10 + 1
            r3 = r24
            r14 = r25
            goto L_0x016e
        L_0x018e:
            r25 = r14
            o.PlaybackStateCompat r10 = new o.PlaybackStateCompat
            r10.<init>()
            androidx.fragment.app.Fragment r3 = r8.setMin
            android.view.View r3 = r3.mView
            r6.getMax(r10, r3)
            r10.getMax(r0)
            if (r1 == 0) goto L_0x01de
            int r1 = r0.size()
            int r1 = r1 + -1
        L_0x01a7:
            if (r1 < 0) goto L_0x01db
            java.lang.Object r3 = r0.get(r1)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r14 = r10.get(r3)
            android.view.View r14 = (android.view.View) r14
            if (r14 != 0) goto L_0x01bd
            r4.remove(r3)
            r19 = r0
            goto L_0x01d6
        L_0x01bd:
            r19 = r0
            java.lang.String r0 = androidx.core.view.ViewCompat.onNavigationEvent(r14)
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x01d6
            java.lang.Object r0 = r4.remove(r3)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r3 = androidx.core.view.ViewCompat.onNavigationEvent(r14)
            r4.put(r3, r0)
        L_0x01d6:
            int r1 = r1 + -1
            r0 = r19
            goto L_0x01a7
        L_0x01db:
            r19 = r0
            goto L_0x01e7
        L_0x01de:
            r19 = r0
            java.util.Set r0 = r10.keySet()
            r4.getMax(r0)
        L_0x01e7:
            o.PlaybackStateCompat r14 = new o.PlaybackStateCompat
            r14.<init>()
            androidx.fragment.app.Fragment r0 = r9.setMin
            android.view.View r0 = r0.mView
            r6.getMax(r14, r0)
            r14.getMax(r11)
            java.util.Collection r0 = r4.values()
            r14.getMax(r0)
            if (r2 == 0) goto L_0x0239
            int r0 = r11.size()
            int r0 = r0 + -1
        L_0x0205:
            if (r0 < 0) goto L_0x023c
            java.lang.Object r1 = r11.get(r0)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r14.get(r1)
            android.view.View r2 = (android.view.View) r2
            if (r2 != 0) goto L_0x021f
            java.lang.String r1 = o.getPadding.setMin((o.PlaybackStateCompat<java.lang.String, java.lang.String>) r4, (java.lang.String) r1)
            if (r1 == 0) goto L_0x0236
            r4.remove(r1)
            goto L_0x0236
        L_0x021f:
            java.lang.String r3 = androidx.core.view.ViewCompat.onNavigationEvent(r2)
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L_0x0236
            java.lang.String r1 = o.getPadding.setMin((o.PlaybackStateCompat<java.lang.String, java.lang.String>) r4, (java.lang.String) r1)
            if (r1 == 0) goto L_0x0236
            java.lang.String r2 = androidx.core.view.ViewCompat.onNavigationEvent(r2)
            r4.put(r1, r2)
        L_0x0236:
            int r0 = r0 + -1
            goto L_0x0205
        L_0x0239:
            o.getPadding.length(r4, r14)
        L_0x023c:
            java.util.Set r0 = r4.keySet()
            setMax((o.PlaybackStateCompat<java.lang.String, android.view.View>) r10, (java.util.Collection<java.lang.String>) r0)
            java.util.Collection r0 = r4.values()
            setMax((o.PlaybackStateCompat<java.lang.String, android.view.View>) r14, (java.util.Collection<java.lang.String>) r0)
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x025f
            r12.clear()
            r5.clear()
            r2 = r18
            r10 = r23
            r14 = r25
            r0 = 0
            goto L_0x00ee
        L_0x025f:
            androidx.fragment.app.Fragment r0 = r9.setMin
            androidx.fragment.app.Fragment r1 = r8.setMin
            o.getPadding.getMax(r0, r1, r7, r10)
            android.view.ViewGroup r3 = r32.setMin()
            o.setState$7 r2 = new o.setState$7
            r1 = r19
            r0 = r2
            r7 = r17
            r1 = r32
            r9 = r2
            r26 = r18
            r2 = r37
            r8 = r3
            r3 = r36
            r27 = r4
            r4 = r35
            r6 = r5
            r5 = r14
            r0.<init>(r2, r3, r4, r5)
            o.getMenuInflater.getMin(r8, r9)
            java.util.Collection r0 = r10.values()
            r12.addAll(r0)
            boolean r0 = r19.isEmpty()
            if (r0 != 0) goto L_0x02a8
            r0 = r19
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r0 = r10.get(r0)
            android.view.View r0 = (android.view.View) r0
            r15.getMin((java.lang.Object) r7, (android.view.View) r0)
            r2 = r0
            goto L_0x02ab
        L_0x02a8:
            r1 = 0
            r2 = r26
        L_0x02ab:
            java.util.Collection r0 = r14.values()
            r6.addAll(r0)
            boolean r0 = r11.isEmpty()
            if (r0 != 0) goto L_0x02d9
            java.lang.Object r0 = r11.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r0 = r14.get(r0)
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L_0x02d9
            android.view.ViewGroup r3 = r32.setMin()
            o.setState$9 r4 = new o.setState$9
            r5 = r32
            r4.<init>(r15, r0, r13)
            o.getMenuInflater.getMin(r3, r4)
            r0 = r25
            r21 = 1
            goto L_0x02dd
        L_0x02d9:
            r5 = r32
            r0 = r25
        L_0x02dd:
            r15.setMax((java.lang.Object) r7, (android.view.View) r0, (java.util.ArrayList<android.view.View>) r12)
            r14 = 0
            r3 = 0
            r16 = 0
            r17 = 0
            r4 = r12
            r12 = r15
            r8 = r13
            r13 = r7
            r9 = r0
            r11 = r15
            r15 = r3
            r18 = r7
            r19 = r6
            r12.length(r13, r14, r15, r16, r17, r18, r19)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1 = r36
            r3 = r23
            r10 = 0
            r3.put(r1, r0)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r15 = r37
            r3.put(r15, r0)
            r0 = r7
            goto L_0x031a
        L_0x0307:
            r26 = r2
            r27 = r4
            r1 = r8
            r3 = r10
            r4 = r12
            r8 = r13
            r11 = r15
            r10 = 0
            r15 = r9
            r9 = r14
            r31 = r6
            r6 = r5
            r5 = r31
            r2 = r26
        L_0x031a:
            r7 = r35
            r10 = r3
            r12 = r4
            r13 = r8
            r14 = r9
            r9 = r15
            r4 = r27
            r8 = r1
            r15 = r11
            r31 = r6
            r6 = r5
            r5 = r31
            goto L_0x00ee
        L_0x032c:
            r26 = r2
            r27 = r4
            r1 = r8
            r3 = r10
            r4 = r12
            r8 = r13
            r11 = r15
            r10 = 0
            r15 = r9
            r9 = r14
            r31 = r6
            r6 = r5
            r5 = r31
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r7 = r33.iterator()
            r13 = 0
            r14 = 0
        L_0x0348:
            boolean r12 = r7.hasNext()
            if (r12 == 0) goto L_0x047d
            java.lang.Object r12 = r7.next()
            o.setState$getMax r12 = (o.setState.getMax) r12
            boolean r16 = r12.getMin()
            if (r16 == 0) goto L_0x037b
            androidx.fragment.app.SpecialEffectsController$Operation r10 = r12.setMax
            r35 = r7
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            r3.put(r10, r7)
            androidx.fragment.app.SpecialEffectsController$Operation r7 = r12.setMax
            o.StringRes r10 = r12.length
            java.util.HashSet<o.StringRes> r12 = r7.length
            boolean r10 = r12.remove(r10)
            if (r10 == 0) goto L_0x03b0
            java.util.HashSet<o.StringRes> r10 = r7.length
            boolean r10 = r10.isEmpty()
            if (r10 == 0) goto L_0x03b0
            r7.setMin()
            goto L_0x03b0
        L_0x037b:
            r35 = r7
            java.lang.Object r7 = r12.setMin
            java.lang.Object r7 = r11.setMin((java.lang.Object) r7)
            androidx.fragment.app.SpecialEffectsController$Operation r10 = r12.setMax
            if (r0 == 0) goto L_0x038e
            if (r10 == r1) goto L_0x038b
            if (r10 != r15) goto L_0x038e
        L_0x038b:
            r16 = 1
            goto L_0x0390
        L_0x038e:
            r16 = 0
        L_0x0390:
            if (r7 != 0) goto L_0x03c5
            if (r16 != 0) goto L_0x03b4
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            r3.put(r10, r7)
            androidx.fragment.app.SpecialEffectsController$Operation r7 = r12.setMax
            o.StringRes r10 = r12.length
            java.util.HashSet<o.StringRes> r12 = r7.length
            boolean r10 = r12.remove(r10)
            if (r10 == 0) goto L_0x03b0
            java.util.HashSet<o.StringRes> r10 = r7.length
            boolean r10 = r10.isEmpty()
            if (r10 == 0) goto L_0x03b0
            r7.setMin()
        L_0x03b0:
            r7 = r35
        L_0x03b2:
            r10 = 0
            goto L_0x0348
        L_0x03b4:
            r12 = r34
            r20 = r0
            r29 = r4
            r30 = r6
            r28 = r9
            r4 = r14
            r6 = r15
            r0 = r26
            r10 = 0
            goto L_0x046d
        L_0x03c5:
            r20 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r17 = r12
            androidx.fragment.app.Fragment r12 = r10.setMin
            android.view.View r12 = r12.mView
            r5.setMax((java.util.ArrayList<android.view.View>) r0, (android.view.View) r12)
            if (r16 == 0) goto L_0x03e0
            if (r10 != r1) goto L_0x03dd
            r0.removeAll(r4)
            goto L_0x03e0
        L_0x03dd:
            r0.removeAll(r6)
        L_0x03e0:
            boolean r12 = r0.isEmpty()
            if (r12 == 0) goto L_0x03f7
            r11.setMax((java.lang.Object) r7, (android.view.View) r9)
            r12 = r34
            r29 = r4
            r30 = r6
            r28 = r9
            r9 = r13
            r4 = r14
            r6 = r15
            r25 = r17
            goto L_0x043b
        L_0x03f7:
            r11.getMin((java.lang.Object) r7, (java.util.ArrayList<android.view.View>) r0)
            r16 = 0
            r18 = 0
            r19 = 0
            r23 = 0
            r25 = r17
            r12 = r11
            r28 = r9
            r9 = r13
            r13 = r7
            r29 = r4
            r4 = r14
            r14 = r7
            r30 = r6
            r6 = r15
            r15 = r0
            r17 = r18
            r18 = r19
            r19 = r23
            r12.length(r13, r14, r15, r16, r17, r18, r19)
            androidx.fragment.app.SpecialEffectsController$Operation$State r12 = r10.getMax
            androidx.fragment.app.SpecialEffectsController$Operation$State r13 = androidx.fragment.app.SpecialEffectsController.Operation.State.GONE
            if (r12 != r13) goto L_0x0439
            r12 = r34
            r12.remove(r10)
            androidx.fragment.app.Fragment r13 = r10.setMin
            android.view.View r13 = r13.mView
            r11.getMax((java.lang.Object) r7, (android.view.View) r13, (java.util.ArrayList<android.view.View>) r0)
            android.view.ViewGroup r13 = r32.setMin()
            o.setState$10 r14 = new o.setState$10
            r14.<init>(r0)
            o.getMenuInflater.getMin(r13, r14)
            goto L_0x043b
        L_0x0439:
            r12 = r34
        L_0x043b:
            androidx.fragment.app.SpecialEffectsController$Operation$State r13 = r10.getMax
            androidx.fragment.app.SpecialEffectsController$Operation$State r14 = androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE
            if (r13 != r14) goto L_0x044c
            r2.addAll(r0)
            if (r21 == 0) goto L_0x0449
            r11.length((java.lang.Object) r7, (android.graphics.Rect) r8)
        L_0x0449:
            r0 = r26
            goto L_0x0451
        L_0x044c:
            r0 = r26
            r11.getMin((java.lang.Object) r7, (android.view.View) r0)
        L_0x0451:
            java.lang.Boolean r13 = java.lang.Boolean.TRUE
            r3.put(r10, r13)
            boolean r10 = r25.setMax()
            if (r10 == 0) goto L_0x0468
            r10 = 0
            java.lang.Object r14 = r11.length((java.lang.Object) r4, (java.lang.Object) r7, (java.lang.Object) r10)
            r7 = r35
            r26 = r0
            r15 = r6
            r13 = r9
            goto L_0x0473
        L_0x0468:
            r10 = 0
            java.lang.Object r13 = r11.length((java.lang.Object) r9, (java.lang.Object) r7, (java.lang.Object) r10)
        L_0x046d:
            r7 = r35
            r26 = r0
            r14 = r4
            r15 = r6
        L_0x0473:
            r0 = r20
            r9 = r28
            r4 = r29
            r6 = r30
            goto L_0x03b2
        L_0x047d:
            r7 = r0
            r29 = r4
            r30 = r6
            r9 = r13
            r4 = r14
            r6 = r15
            java.lang.Object r0 = r11.getMax((java.lang.Object) r4, (java.lang.Object) r9, (java.lang.Object) r7)
            java.util.Iterator r4 = r33.iterator()
        L_0x048d:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto L_0x04eb
            java.lang.Object r8 = r4.next()
            o.setState$getMax r8 = (o.setState.getMax) r8
            boolean r9 = r8.getMin()
            if (r9 != 0) goto L_0x048d
            java.lang.Object r9 = r8.setMin
            androidx.fragment.app.SpecialEffectsController$Operation r10 = r8.setMax
            if (r7 == 0) goto L_0x04ab
            if (r10 == r1) goto L_0x04a9
            if (r10 != r6) goto L_0x04ab
        L_0x04a9:
            r10 = 1
            goto L_0x04ac
        L_0x04ab:
            r10 = 0
        L_0x04ac:
            if (r9 != 0) goto L_0x04b0
            if (r10 == 0) goto L_0x048d
        L_0x04b0:
            android.view.ViewGroup r9 = r32.setMin()
            boolean r9 = androidx.core.view.ViewCompat.asInterface(r9)
            if (r9 != 0) goto L_0x04dc
            r9 = 2
            boolean r9 = androidx.fragment.app.FragmentManager.getMin((int) r9)
            if (r9 == 0) goto L_0x04c4
            r32.setMin()
        L_0x04c4:
            androidx.fragment.app.SpecialEffectsController$Operation r9 = r8.setMax
            o.StringRes r8 = r8.length
            java.util.HashSet<o.StringRes> r10 = r9.length
            boolean r8 = r10.remove(r8)
            if (r8 == 0) goto L_0x048d
            java.util.HashSet<o.StringRes> r8 = r9.length
            boolean r8 = r8.isEmpty()
            if (r8 == 0) goto L_0x048d
            r9.setMin()
            goto L_0x048d
        L_0x04dc:
            androidx.fragment.app.SpecialEffectsController$Operation r9 = r8.setMax
            androidx.fragment.app.Fragment r9 = r9.setMin
            o.StringRes r10 = r8.length
            o.setState$6 r12 = new o.setState$6
            r12.<init>(r8)
            r11.getMax(r9, r0, r10, r12)
            goto L_0x048d
        L_0x04eb:
            android.view.ViewGroup r1 = r32.setMin()
            boolean r1 = androidx.core.view.ViewCompat.asInterface(r1)
            if (r1 != 0) goto L_0x04f6
            return r3
        L_0x04f6:
            r1 = 4
            o.getPadding.setMin((java.util.ArrayList<android.view.View>) r2, (int) r1)
            r1 = r30
            java.util.ArrayList r16 = r11.setMin((java.util.ArrayList<android.view.View>) r1)
            android.view.ViewGroup r4 = r32.setMin()
            r11.setMax((android.view.ViewGroup) r4, (java.lang.Object) r0)
            android.view.ViewGroup r13 = r32.setMin()
            r12 = r11
            r14 = r29
            r15 = r1
            r17 = r27
            r12.setMax(r13, r14, r15, r16, r17)
            r0 = 0
            o.getPadding.setMin((java.util.ArrayList<android.view.View>) r2, (int) r0)
            r0 = r29
            r11.length((java.lang.Object) r7, (java.util.ArrayList<android.view.View>) r0, (java.util.ArrayList<android.view.View>) r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setState.length(java.util.List, java.util.List, boolean, androidx.fragment.app.SpecialEffectsController$Operation, androidx.fragment.app.SpecialEffectsController$Operation):java.util.Map");
    }

    private static void setMax(@NonNull PlaybackStateCompat<String, View> playbackStateCompat, @NonNull Collection<String> collection) {
        Iterator<Map.Entry<String, View>> it = playbackStateCompat.entrySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(ViewCompat.onNavigationEvent((View) it.next().getValue()))) {
                it.remove();
            }
        }
    }

    private void setMax(ArrayList<View> arrayList, View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (!onPostResume.length(viewGroup)) {
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = viewGroup.getChildAt(i);
                    if (childAt.getVisibility() == 0) {
                        setMax(arrayList, childAt);
                    }
                }
            } else if (!arrayList.contains(view)) {
                arrayList.add(viewGroup);
            }
        } else if (!arrayList.contains(view)) {
            arrayList.add(view);
        }
    }

    private void getMax(Map<String, View> map, @NonNull View view) {
        String onNavigationEvent = ViewCompat.onNavigationEvent(view);
        if (onNavigationEvent != null) {
            map.put(onNavigationEvent, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getVisibility() == 0) {
                    getMax(map, childAt);
                }
            }
        }
    }

    static class length {
        @NonNull
        final StringRes length;
        @NonNull
        final SpecialEffectsController.Operation setMax;

        length(@NonNull SpecialEffectsController.Operation operation, @NonNull StringRes stringRes) {
            this.setMax = operation;
            this.length = stringRes;
        }

        /* access modifiers changed from: package-private */
        public final boolean getMin() {
            SpecialEffectsController.Operation.State from = SpecialEffectsController.Operation.State.from(this.setMax.setMin.mView);
            SpecialEffectsController.Operation.State state = this.setMax.getMax;
            if (from != state) {
                return (from == SpecialEffectsController.Operation.State.VISIBLE || state == SpecialEffectsController.Operation.State.VISIBLE) ? false : true;
            }
            return true;
        }
    }

    static class setMin extends length {
        private boolean getMax = false;
        private boolean getMin;
        @Nullable
        private isStateful.length setMin;

        setMin(@NonNull SpecialEffectsController.Operation operation, @NonNull StringRes stringRes, boolean z) {
            super(operation, stringRes);
            this.getMin = z;
        }

        /* access modifiers changed from: package-private */
        @Nullable
        public final isStateful.length setMin(@NonNull Context context) {
            if (this.getMax) {
                return this.setMin;
            }
            isStateful.length length = isStateful.length(context, this.setMax.setMin, this.setMax.getMax == SpecialEffectsController.Operation.State.VISIBLE, this.getMin);
            this.setMin = length;
            this.getMax = true;
            return length;
        }
    }

    static class getMax extends length {
        private final boolean getMax;
        @Nullable
        final Object getMin;
        @Nullable
        final Object setMin;

        getMax(@NonNull SpecialEffectsController.Operation operation, @NonNull StringRes stringRes, boolean z, boolean z2) {
            super(operation, stringRes);
            Object obj;
            Object obj2;
            boolean z3;
            if (operation.getMax == SpecialEffectsController.Operation.State.VISIBLE) {
                if (z) {
                    obj2 = operation.setMin.getReenterTransition();
                } else {
                    obj2 = operation.setMin.getEnterTransition();
                }
                this.setMin = obj2;
                if (z) {
                    z3 = operation.setMin.getAllowReturnTransitionOverlap();
                } else {
                    z3 = operation.setMin.getAllowEnterTransitionOverlap();
                }
                this.getMax = z3;
            } else {
                if (z) {
                    obj = operation.setMin.getReturnTransition();
                } else {
                    obj = operation.setMin.getExitTransition();
                }
                this.setMin = obj;
                this.getMax = true;
            }
            if (!z2) {
                this.getMin = null;
            } else if (z) {
                this.getMin = operation.setMin.getSharedElementReturnTransition();
            } else {
                this.getMin = operation.setMin.getSharedElementEnterTransition();
            }
        }

        /* access modifiers changed from: package-private */
        public final boolean setMax() {
            return this.getMax;
        }

        public final boolean length() {
            return this.getMin != null;
        }

        /* access modifiers changed from: package-private */
        @Nullable
        public final setTintList length(Object obj) {
            if (obj == null) {
                return null;
            }
            if (getPadding.length != null && getPadding.length.setMax(obj)) {
                return getPadding.length;
            }
            if (getPadding.getMin != null && getPadding.getMin.setMax(obj)) {
                return getPadding.getMin;
            }
            StringBuilder sb = new StringBuilder("Transition ");
            sb.append(obj);
            sb.append(" for fragment ");
            sb.append(this.setMax.setMin);
            sb.append(" is not a valid framework Transition or AndroidX Transition");
            throw new IllegalArgumentException(sb.toString());
        }
    }
}
