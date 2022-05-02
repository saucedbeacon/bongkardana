package o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class dispatchMenuItemSelected extends getVisibleItems {
    private static TimeInterpolator hashCode;
    private ArrayList<RecyclerView.valueOf> FastBitmap$CoordinateSystem = new ArrayList<>();
    private ArrayList<setMin> Grayscale$Algorithm = new ArrayList<>();
    ArrayList<RecyclerView.valueOf> equals = new ArrayList<>();
    ArrayList<ArrayList<RecyclerView.valueOf>> getMax = new ArrayList<>();
    ArrayList<RecyclerView.valueOf> getMin = new ArrayList<>();
    private ArrayList<setMax> invokeSuspend = new ArrayList<>();
    ArrayList<RecyclerView.valueOf> isInside = new ArrayList<>();
    ArrayList<RecyclerView.valueOf> length = new ArrayList<>();
    ArrayList<ArrayList<setMax>> setMax = new ArrayList<>();
    ArrayList<ArrayList<setMin>> setMin = new ArrayList<>();
    private ArrayList<RecyclerView.valueOf> values = new ArrayList<>();

    static class setMin {
        public int getMax;
        public int getMin;
        public int length;
        public RecyclerView.valueOf setMax;
        public int setMin;

        setMin(RecyclerView.valueOf valueof, int i, int i2, int i3, int i4) {
            this.setMax = valueof;
            this.setMin = i;
            this.getMin = i2;
            this.length = i3;
            this.getMax = i4;
        }
    }

    static class setMax {
        public int getMax;
        public RecyclerView.valueOf getMin;
        public int length;
        public RecyclerView.valueOf setMax;
        public int setMin;
        public int toFloatRange;

        private setMax(RecyclerView.valueOf valueof, RecyclerView.valueOf valueof2) {
            this.getMin = valueof;
            this.setMax = valueof2;
        }

        setMax(RecyclerView.valueOf valueof, RecyclerView.valueOf valueof2, int i, int i2, int i3, int i4) {
            this(valueof, valueof2);
            this.setMin = i;
            this.length = i2;
            this.getMax = i3;
            this.toFloatRange = i4;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ChangeInfo{oldHolder=");
            sb.append(this.getMin);
            sb.append(", newHolder=");
            sb.append(this.setMax);
            sb.append(", fromX=");
            sb.append(this.setMin);
            sb.append(", fromY=");
            sb.append(this.length);
            sb.append(", toX=");
            sb.append(this.getMax);
            sb.append(", toY=");
            sb.append(this.toFloatRange);
            sb.append('}');
            return sb.toString();
        }
    }

    public final void getMax() {
        long j;
        long j2;
        boolean z = !this.FastBitmap$CoordinateSystem.isEmpty();
        boolean z2 = !this.Grayscale$Algorithm.isEmpty();
        boolean z3 = !this.invokeSuspend.isEmpty();
        boolean z4 = !this.values.isEmpty();
        if (z || z2 || z4 || z3) {
            Iterator<RecyclerView.valueOf> it = this.FastBitmap$CoordinateSystem.iterator();
            while (it.hasNext()) {
                final RecyclerView.valueOf next = it.next();
                final View view = next.itemView;
                final ViewPropertyAnimator animate = view.animate();
                this.isInside.add(next);
                animate.setDuration(getMin()).alpha(0.0f).setListener(new AnimatorListenerAdapter() {
                    public final void onAnimationStart(Animator animator) {
                    }

                    public final void onAnimationEnd(Animator animator) {
                        animate.setListener((Animator.AnimatorListener) null);
                        view.setAlpha(1.0f);
                        dispatchMenuItemSelected dispatchmenuitemselected = dispatchMenuItemSelected.this;
                        RecyclerView.valueOf valueof = next;
                        if (dispatchmenuitemselected.toFloatRange != null) {
                            dispatchmenuitemselected.toFloatRange.length(valueof);
                        }
                        dispatchMenuItemSelected.this.isInside.remove(next);
                        dispatchMenuItemSelected dispatchmenuitemselected2 = dispatchMenuItemSelected.this;
                        if (!dispatchmenuitemselected2.setMax()) {
                            dispatchmenuitemselected2.setMin();
                        }
                    }
                }).start();
            }
            this.FastBitmap$CoordinateSystem.clear();
            if (z2) {
                final ArrayList arrayList = new ArrayList();
                arrayList.addAll(this.Grayscale$Algorithm);
                this.setMin.add(arrayList);
                this.Grayscale$Algorithm.clear();
                AnonymousClass3 r6 = new Runnable() {
                    public final void run() {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            setMin setmin = (setMin) it.next();
                            dispatchMenuItemSelected dispatchmenuitemselected = dispatchMenuItemSelected.this;
                            RecyclerView.valueOf valueof = setmin.setMax;
                            int i = setmin.setMin;
                            int i2 = setmin.getMin;
                            int i3 = setmin.length;
                            int i4 = setmin.getMax;
                            View view = valueof.itemView;
                            int i5 = i3 - i;
                            int i6 = i4 - i2;
                            if (i5 != 0) {
                                view.animate().translationX(0.0f);
                            }
                            if (i6 != 0) {
                                view.animate().translationY(0.0f);
                            }
                            ViewPropertyAnimator animate = view.animate();
                            dispatchmenuitemselected.length.add(valueof);
                            animate.setDuration(dispatchmenuitemselected.IsOverlapping).setListener(new AnimatorListenerAdapter(valueof, i5, view, i6, animate) {
                                final /* synthetic */ RecyclerView.valueOf getMax;
                                final /* synthetic */ int getMin;
                                final /* synthetic */ int length;
                                final /* synthetic */ View setMax;
                                final /* synthetic */ ViewPropertyAnimator setMin;

                                public final void onAnimationStart(Animator animator) {
                                }

                                {
                                    this.getMax = r2;
                                    this.length = r3;
                                    this.setMax = r4;
                                    this.getMin = r5;
                                    this.setMin = r6;
                                }

                                public final void onAnimationCancel(Animator animator) {
                                    if (this.length != 0) {
                                        this.setMax.setTranslationX(0.0f);
                                    }
                                    if (this.getMin != 0) {
                                        this.setMax.setTranslationY(0.0f);
                                    }
                                }

                                public final void onAnimationEnd(Animator animator) {
                                    this.setMin.setListener((Animator.AnimatorListener) null);
                                    dispatchMenuItemSelected dispatchmenuitemselected = dispatchMenuItemSelected.this;
                                    RecyclerView.valueOf valueof = this.getMax;
                                    if (dispatchmenuitemselected.toFloatRange != null) {
                                        dispatchmenuitemselected.toFloatRange.length(valueof);
                                    }
                                    dispatchMenuItemSelected.this.length.remove(this.getMax);
                                    dispatchMenuItemSelected dispatchmenuitemselected2 = dispatchMenuItemSelected.this;
                                    if (!dispatchmenuitemselected2.setMax()) {
                                        dispatchmenuitemselected2.setMin();
                                    }
                                }
                            }).start();
                        }
                        arrayList.clear();
                        dispatchMenuItemSelected.this.setMin.remove(arrayList);
                    }
                };
                if (z) {
                    ViewCompat.getMin(((setMin) arrayList.get(0)).setMax.itemView, (Runnable) r6, getMin());
                } else {
                    r6.run();
                }
            }
            if (z3) {
                final ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(this.invokeSuspend);
                this.setMax.add(arrayList2);
                this.invokeSuspend.clear();
                AnonymousClass4 r62 = new Runnable() {
                    public final void run() {
                        View view;
                        Iterator it = arrayList2.iterator();
                        while (it.hasNext()) {
                            setMax setmax = (setMax) it.next();
                            dispatchMenuItemSelected dispatchmenuitemselected = dispatchMenuItemSelected.this;
                            RecyclerView.valueOf valueof = setmax.getMin;
                            View view2 = null;
                            if (valueof == null) {
                                view = null;
                            } else {
                                view = valueof.itemView;
                            }
                            RecyclerView.valueOf valueof2 = setmax.setMax;
                            if (valueof2 != null) {
                                view2 = valueof2.itemView;
                            }
                            if (view != null) {
                                ViewPropertyAnimator duration = view.animate().setDuration(dispatchmenuitemselected.toDoubleRange);
                                dispatchmenuitemselected.equals.add(setmax.getMin);
                                duration.translationX((float) (setmax.getMax - setmax.setMin));
                                duration.translationY((float) (setmax.toFloatRange - setmax.length));
                                duration.alpha(0.0f).setListener(new AnimatorListenerAdapter(setmax, duration, view) {
                                    final /* synthetic */ View getMax;
                                    final /* synthetic */ ViewPropertyAnimator getMin;
                                    final /* synthetic */ setMax setMin;

                                    public final void onAnimationStart(Animator animator) {
                                    }

                                    {
                                        this.setMin = r2;
                                        this.getMin = r3;
                                        this.getMax = r4;
                                    }

                                    public final void onAnimationEnd(Animator animator) {
                                        this.getMin.setListener((Animator.AnimatorListener) null);
                                        this.getMax.setAlpha(1.0f);
                                        this.getMax.setTranslationX(0.0f);
                                        this.getMax.setTranslationY(0.0f);
                                        dispatchMenuItemSelected dispatchmenuitemselected = dispatchMenuItemSelected.this;
                                        RecyclerView.valueOf valueof = this.setMin.getMin;
                                        if (dispatchmenuitemselected.toFloatRange != null) {
                                            dispatchmenuitemselected.toFloatRange.length(valueof);
                                        }
                                        dispatchMenuItemSelected.this.equals.remove(this.setMin.getMin);
                                        dispatchMenuItemSelected dispatchmenuitemselected2 = dispatchMenuItemSelected.this;
                                        if (!dispatchmenuitemselected2.setMax()) {
                                            dispatchmenuitemselected2.setMin();
                                        }
                                    }
                                }).start();
                            }
                            if (view2 != null) {
                                ViewPropertyAnimator animate = view2.animate();
                                dispatchmenuitemselected.equals.add(setmax.setMax);
                                animate.translationX(0.0f).translationY(0.0f).setDuration(dispatchmenuitemselected.toDoubleRange).alpha(1.0f).setListener(new AnimatorListenerAdapter(setmax, animate, view2) {
                                    final /* synthetic */ View getMax;
                                    final /* synthetic */ ViewPropertyAnimator getMin;
                                    final /* synthetic */ setMax setMax;

                                    public final void onAnimationStart(Animator animator) {
                                    }

                                    {
                                        this.setMax = r2;
                                        this.getMin = r3;
                                        this.getMax = r4;
                                    }

                                    public final void onAnimationEnd(Animator animator) {
                                        this.getMin.setListener((Animator.AnimatorListener) null);
                                        this.getMax.setAlpha(1.0f);
                                        this.getMax.setTranslationX(0.0f);
                                        this.getMax.setTranslationY(0.0f);
                                        dispatchMenuItemSelected dispatchmenuitemselected = dispatchMenuItemSelected.this;
                                        RecyclerView.valueOf valueof = this.setMax.setMax;
                                        if (dispatchmenuitemselected.toFloatRange != null) {
                                            dispatchmenuitemselected.toFloatRange.length(valueof);
                                        }
                                        dispatchMenuItemSelected.this.equals.remove(this.setMax.setMax);
                                        dispatchMenuItemSelected dispatchmenuitemselected2 = dispatchMenuItemSelected.this;
                                        if (!dispatchmenuitemselected2.setMax()) {
                                            dispatchmenuitemselected2.setMin();
                                        }
                                    }
                                }).start();
                            }
                        }
                        arrayList2.clear();
                        dispatchMenuItemSelected.this.setMax.remove(arrayList2);
                    }
                };
                if (z) {
                    ViewCompat.getMin(((setMax) arrayList2.get(0)).getMin.itemView, (Runnable) r62, getMin());
                } else {
                    r62.run();
                }
            }
            if (z4) {
                final ArrayList arrayList3 = new ArrayList();
                arrayList3.addAll(this.values);
                this.getMax.add(arrayList3);
                this.values.clear();
                AnonymousClass5 r5 = new Runnable() {
                    public final void run() {
                        Iterator it = arrayList3.iterator();
                        while (it.hasNext()) {
                            RecyclerView.valueOf valueof = (RecyclerView.valueOf) it.next();
                            dispatchMenuItemSelected dispatchmenuitemselected = dispatchMenuItemSelected.this;
                            View view = valueof.itemView;
                            ViewPropertyAnimator animate = view.animate();
                            dispatchmenuitemselected.getMin.add(valueof);
                            animate.alpha(1.0f).setDuration(dispatchmenuitemselected.toIntRange).setListener(new AnimatorListenerAdapter(valueof, view, animate) {
                                final /* synthetic */ RecyclerView.valueOf length;
                                final /* synthetic */ View setMax;
                                final /* synthetic */ ViewPropertyAnimator setMin;

                                public final void onAnimationStart(Animator animator) {
                                }

                                {
                                    this.length = r2;
                                    this.setMax = r3;
                                    this.setMin = r4;
                                }

                                public final void onAnimationCancel(Animator animator) {
                                    this.setMax.setAlpha(1.0f);
                                }

                                public final void onAnimationEnd(Animator animator) {
                                    this.setMin.setListener((Animator.AnimatorListener) null);
                                    dispatchMenuItemSelected dispatchmenuitemselected = dispatchMenuItemSelected.this;
                                    RecyclerView.valueOf valueof = this.length;
                                    if (dispatchmenuitemselected.toFloatRange != null) {
                                        dispatchmenuitemselected.toFloatRange.length(valueof);
                                    }
                                    dispatchMenuItemSelected.this.getMin.remove(this.length);
                                    dispatchMenuItemSelected dispatchmenuitemselected2 = dispatchMenuItemSelected.this;
                                    if (!dispatchmenuitemselected2.setMax()) {
                                        dispatchmenuitemselected2.setMin();
                                    }
                                }
                            }).start();
                        }
                        arrayList3.clear();
                        dispatchMenuItemSelected.this.getMax.remove(arrayList3);
                    }
                };
                if (z || z2 || z3) {
                    long j3 = 0;
                    if (z) {
                        j = getMin();
                    } else {
                        j = 0;
                    }
                    if (z2) {
                        j2 = this.IsOverlapping;
                    } else {
                        j2 = 0;
                    }
                    if (z3) {
                        j3 = this.toDoubleRange;
                    }
                    ViewCompat.getMin(((RecyclerView.valueOf) arrayList3.get(0)).itemView, (Runnable) r5, j + Math.max(j2, j3));
                    return;
                }
                r5.run();
            }
        }
    }

    public final boolean setMin(RecyclerView.valueOf valueof) {
        isInside(valueof);
        this.FastBitmap$CoordinateSystem.add(valueof);
        return true;
    }

    public final boolean length(RecyclerView.valueOf valueof) {
        isInside(valueof);
        valueof.itemView.setAlpha(0.0f);
        this.values.add(valueof);
        return true;
    }

    public final boolean setMax(RecyclerView.valueOf valueof, int i, int i2, int i3, int i4) {
        View view = valueof.itemView;
        int translationX = i + ((int) valueof.itemView.getTranslationX());
        int translationY = i2 + ((int) valueof.itemView.getTranslationY());
        isInside(valueof);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 != 0 || i6 != 0) {
            if (i5 != 0) {
                view.setTranslationX((float) (-i5));
            }
            if (i6 != 0) {
                view.setTranslationY((float) (-i6));
            }
            this.Grayscale$Algorithm.add(new setMin(valueof, translationX, translationY, i3, i4));
            return true;
        } else if (this.toFloatRange == null) {
            return false;
        } else {
            this.toFloatRange.length(valueof);
            return false;
        }
    }

    public final boolean setMin(RecyclerView.valueOf valueof, RecyclerView.valueOf valueof2, int i, int i2, int i3, int i4) {
        if (valueof == valueof2) {
            return setMax(valueof, i, i2, i3, i4);
        }
        float translationX = valueof.itemView.getTranslationX();
        float translationY = valueof.itemView.getTranslationY();
        float alpha = valueof.itemView.getAlpha();
        isInside(valueof);
        int i5 = (int) (((float) (i3 - i)) - translationX);
        int i6 = (int) (((float) (i4 - i2)) - translationY);
        valueof.itemView.setTranslationX(translationX);
        valueof.itemView.setTranslationY(translationY);
        valueof.itemView.setAlpha(alpha);
        if (valueof2 != null) {
            isInside(valueof2);
            valueof2.itemView.setTranslationX((float) (-i5));
            valueof2.itemView.setTranslationY((float) (-i6));
            valueof2.itemView.setAlpha(0.0f);
        }
        this.invokeSuspend.add(new setMax(valueof, valueof2, i, i2, i3, i4));
        return true;
    }

    private void length(List<setMax> list, RecyclerView.valueOf valueof) {
        for (int size = list.size() - 1; size >= 0; size--) {
            setMax setmax = list.get(size);
            if (getMax(setmax, valueof) && setmax.getMin == null && setmax.setMax == null) {
                list.remove(setmax);
            }
        }
    }

    private void length(setMax setmax) {
        if (setmax.getMin != null) {
            getMax(setmax, setmax.getMin);
        }
        if (setmax.setMax != null) {
            getMax(setmax, setmax.setMax);
        }
    }

    private boolean getMax(setMax setmax, RecyclerView.valueOf valueof) {
        if (setmax.setMax == valueof) {
            setmax.setMax = null;
        } else if (setmax.getMin != valueof) {
            return false;
        } else {
            setmax.getMin = null;
        }
        valueof.itemView.setAlpha(1.0f);
        valueof.itemView.setTranslationX(0.0f);
        valueof.itemView.setTranslationY(0.0f);
        if (this.toFloatRange == null) {
            return true;
        }
        this.toFloatRange.length(valueof);
        return true;
    }

    public final void getMin(RecyclerView.valueOf valueof) {
        View view = valueof.itemView;
        view.animate().cancel();
        int size = this.Grayscale$Algorithm.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (this.Grayscale$Algorithm.get(size).setMax == valueof) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                if (this.toFloatRange != null) {
                    this.toFloatRange.length(valueof);
                }
                this.Grayscale$Algorithm.remove(size);
            }
        }
        length(this.invokeSuspend, valueof);
        if (this.FastBitmap$CoordinateSystem.remove(valueof)) {
            view.setAlpha(1.0f);
            if (this.toFloatRange != null) {
                this.toFloatRange.length(valueof);
            }
        }
        if (this.values.remove(valueof)) {
            view.setAlpha(1.0f);
            if (this.toFloatRange != null) {
                this.toFloatRange.length(valueof);
            }
        }
        for (int size2 = this.setMax.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList = this.setMax.get(size2);
            length(arrayList, valueof);
            if (arrayList.isEmpty()) {
                this.setMax.remove(size2);
            }
        }
        for (int size3 = this.setMin.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList2 = this.setMin.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                } else if (((setMin) arrayList2.get(size4)).setMax == valueof) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    if (this.toFloatRange != null) {
                        this.toFloatRange.length(valueof);
                    }
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.setMin.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = this.getMax.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList3 = this.getMax.get(size5);
            if (arrayList3.remove(valueof)) {
                view.setAlpha(1.0f);
                if (this.toFloatRange != null) {
                    this.toFloatRange.length(valueof);
                }
                if (arrayList3.isEmpty()) {
                    this.getMax.remove(size5);
                }
            }
        }
        this.isInside.remove(valueof);
        this.getMin.remove(valueof);
        this.equals.remove(valueof);
        this.length.remove(valueof);
        if (!setMax()) {
            setMin();
        }
    }

    private void isInside(RecyclerView.valueOf valueof) {
        if (hashCode == null) {
            hashCode = new ValueAnimator().getInterpolator();
        }
        valueof.itemView.animate().setInterpolator(hashCode);
        getMin(valueof);
    }

    public final boolean setMax() {
        return !this.values.isEmpty() || !this.invokeSuspend.isEmpty() || !this.Grayscale$Algorithm.isEmpty() || !this.FastBitmap$CoordinateSystem.isEmpty() || !this.length.isEmpty() || !this.isInside.isEmpty() || !this.getMin.isEmpty() || !this.equals.isEmpty() || !this.setMin.isEmpty() || !this.getMax.isEmpty() || !this.setMax.isEmpty();
    }

    public final void length() {
        int size = this.Grayscale$Algorithm.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            setMin setmin = this.Grayscale$Algorithm.get(size);
            View view = setmin.setMax.itemView;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            RecyclerView.valueOf valueof = setmin.setMax;
            if (this.toFloatRange != null) {
                this.toFloatRange.length(valueof);
            }
            this.Grayscale$Algorithm.remove(size);
        }
        for (int size2 = this.FastBitmap$CoordinateSystem.size() - 1; size2 >= 0; size2--) {
            RecyclerView.valueOf valueof2 = this.FastBitmap$CoordinateSystem.get(size2);
            if (this.toFloatRange != null) {
                this.toFloatRange.length(valueof2);
            }
            this.FastBitmap$CoordinateSystem.remove(size2);
        }
        int size3 = this.values.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.valueOf valueof3 = this.values.get(size3);
            valueof3.itemView.setAlpha(1.0f);
            if (this.toFloatRange != null) {
                this.toFloatRange.length(valueof3);
            }
            this.values.remove(size3);
        }
        for (int size4 = this.invokeSuspend.size() - 1; size4 >= 0; size4--) {
            length(this.invokeSuspend.get(size4));
        }
        this.invokeSuspend.clear();
        if (setMax()) {
            for (int size5 = this.setMin.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList = this.setMin.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    setMin setmin2 = (setMin) arrayList.get(size6);
                    View view2 = setmin2.setMax.itemView;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    RecyclerView.valueOf valueof4 = setmin2.setMax;
                    if (this.toFloatRange != null) {
                        this.toFloatRange.length(valueof4);
                    }
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.setMin.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.getMax.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList2 = this.getMax.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    RecyclerView.valueOf valueof5 = (RecyclerView.valueOf) arrayList2.get(size8);
                    valueof5.itemView.setAlpha(1.0f);
                    if (this.toFloatRange != null) {
                        this.toFloatRange.length(valueof5);
                    }
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.getMax.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.setMax.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList3 = this.setMax.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    length((setMax) arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.setMax.remove(arrayList3);
                    }
                }
            }
            setMax(this.isInside);
            setMax(this.length);
            setMax(this.getMin);
            setMax(this.equals);
            setMin();
        }
    }

    private static void setMax(List<RecyclerView.valueOf> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            list.get(size).itemView.animate().cancel();
        }
    }

    public final boolean getMin(@NonNull RecyclerView.valueOf valueof, @NonNull List<Object> list) {
        return !list.isEmpty() || super.getMin(valueof, list);
    }
}
