package o;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.Interpolator;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o.SupportSQLiteOpenHelper;

public abstract class InitializationProvider<T> extends getVisibleItems {
    private ArrayList<getMin> FastBitmap$CoordinateSystem = new ArrayList<>();
    /* access modifiers changed from: private */
    public ArrayList<RecyclerView.valueOf> Grayscale$Algorithm = new ArrayList<>();
    private ArrayList<RecyclerView.valueOf> Mean$Arithmetic = new ArrayList<>();
    /* access modifiers changed from: private */
    public ArrayList<RecyclerView.valueOf> equals = new ArrayList<>();
    Interpolator getMax;
    private ArrayList<ArrayList<getMin>> getMin = new ArrayList<>();
    private ArrayList<RecyclerView.valueOf> hashCode = new ArrayList<>();
    private TimeInterpolator invokeSuspend;
    private ArrayList<ArrayList<setMin>> isInside = new ArrayList<>();
    /* access modifiers changed from: private */
    public ArrayList<RecyclerView.valueOf> length = new ArrayList<>();
    private ArrayList<ArrayList<RecyclerView.valueOf>> setMax = new ArrayList<>();
    /* access modifiers changed from: private */
    public ArrayList<RecyclerView.valueOf> setMin = new ArrayList<>();
    private ArrayList<setMin> values = new ArrayList<>();

    public abstract void IsOverlapping(RecyclerView.valueOf valueof);

    public abstract invalidateOptionsMenu equals(RecyclerView.valueOf valueof);

    public abstract void isInside(RecyclerView.valueOf valueof);

    public abstract invalidateOptionsMenu length(RecyclerView.valueOf valueof, getMin getmin);

    public abstract invalidateOptionsMenu toDoubleRange(RecyclerView.valueOf valueof);

    public abstract void toFloatRange(RecyclerView.valueOf valueof);

    /* access modifiers changed from: package-private */
    public abstract void toIntRange(RecyclerView.valueOf valueof);

    public abstract invalidateOptionsMenu values(RecyclerView.valueOf valueof);

    public final void getMax() {
        long j;
        long j2;
        long j3;
        long j4;
        boolean z = !this.Mean$Arithmetic.isEmpty();
        boolean z2 = !this.values.isEmpty();
        boolean z3 = !this.FastBitmap$CoordinateSystem.isEmpty();
        boolean z4 = !this.hashCode.isEmpty();
        if (z || z2 || z4 || z3) {
            Iterator<RecyclerView.valueOf> it = this.Mean$Arithmetic.iterator();
            while (it.hasNext()) {
                final RecyclerView.valueOf next = it.next();
                final invalidateOptionsMenu values2 = values(next);
                this.Grayscale$Algorithm.add(next);
                values2.length(new getMax() {
                    public final void setMin(View view) {
                    }

                    public final void length(View view) {
                        values2.length((supportInvalidateOptionsMenu) null);
                        InitializationProvider.this.isInside(next);
                        InitializationProvider initializationProvider = InitializationProvider.this;
                        RecyclerView.valueOf valueof = next;
                        if (initializationProvider.toFloatRange != null) {
                            initializationProvider.toFloatRange.length(valueof);
                        }
                        InitializationProvider.this.Grayscale$Algorithm.remove(next);
                        InitializationProvider.length(InitializationProvider.this);
                    }
                }).setMax();
            }
            this.Mean$Arithmetic.clear();
            if (z2) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(this.values);
                this.isInside.add(arrayList);
                this.values.clear();
                SupportSQLiteOpenHelper supportSQLiteOpenHelper = new SupportSQLiteOpenHelper(this, arrayList);
                if (z) {
                    ViewCompat.getMin(((setMin) arrayList.get(0)).length.itemView, (Runnable) supportSQLiteOpenHelper, 0);
                } else {
                    supportSQLiteOpenHelper.run();
                }
            }
            if (z3) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(this.FastBitmap$CoordinateSystem);
                this.getMin.add(arrayList2);
                this.FastBitmap$CoordinateSystem.clear();
                SupportSQLiteOpenHelper.Configuration configuration = new SupportSQLiteOpenHelper.Configuration(this, arrayList2);
                if (z) {
                    RecyclerView.valueOf valueof = ((getMin) arrayList2.get(0)).setMax;
                    if (z2) {
                        j4 = this.IsOverlapping;
                    } else {
                        j4 = 0;
                    }
                    ViewCompat.getMin(valueof.itemView, (Runnable) configuration, setMax(getMin(), j4, this.toDoubleRange));
                } else {
                    configuration.run();
                }
            }
            if (z4) {
                ArrayList arrayList3 = new ArrayList();
                arrayList3.addAll(this.hashCode);
                this.setMax.add(arrayList3);
                this.hashCode.clear();
                SupportSQLiteQuery supportSQLiteQuery = new SupportSQLiteQuery(this, arrayList3);
                if (z || z2 || z3) {
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
                    } else {
                        j3 = 0;
                    }
                    ViewCompat.getMin(((RecyclerView.valueOf) arrayList3.get(0)).itemView, (Runnable) supportSQLiteQuery, length(j, j2, j3));
                    return;
                }
                supportSQLiteQuery.run();
            }
        }
    }

    public final void getMin(RecyclerView.valueOf valueof) {
        ViewCompat.Grayscale$Algorithm(valueof.itemView).getMax();
        int size = this.values.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (this.values.get(size).length == valueof) {
                valueof.itemView.setTranslationY(0.0f);
                valueof.itemView.setTranslationX(0.0f);
                if (this.toFloatRange != null) {
                    this.toFloatRange.length(valueof);
                }
                this.values.remove(size);
            }
        }
        setMin((List<getMin>) this.FastBitmap$CoordinateSystem, valueof);
        if (this.Mean$Arithmetic.remove(valueof)) {
            isInside(valueof);
            if (this.toFloatRange != null) {
                this.toFloatRange.length(valueof);
            }
        }
        if (this.hashCode.remove(valueof)) {
            toIntRange(valueof);
            if (this.toFloatRange != null) {
                this.toFloatRange.length(valueof);
            }
        }
        for (int size2 = this.getMin.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList = this.getMin.get(size2);
            setMin((List<getMin>) arrayList, valueof);
            if (arrayList.isEmpty()) {
                this.getMin.remove(size2);
            }
        }
        for (int size3 = this.isInside.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList2 = this.isInside.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                } else if (((setMin) arrayList2.get(size4)).length == valueof) {
                    valueof.itemView.setTranslationY(0.0f);
                    valueof.itemView.setTranslationX(0.0f);
                    if (this.toFloatRange != null) {
                        this.toFloatRange.length(valueof);
                    }
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.isInside.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = this.setMax.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList3 = this.setMax.get(size5);
            if (arrayList3.remove(valueof)) {
                toIntRange(valueof);
                if (this.toFloatRange != null) {
                    this.toFloatRange.length(valueof);
                }
                if (arrayList3.isEmpty()) {
                    this.setMax.remove(size5);
                }
            }
        }
        this.Grayscale$Algorithm.remove(valueof);
        this.length.remove(valueof);
        this.setMin.remove(valueof);
        this.equals.remove(valueof);
        if (!setMax()) {
            setMin();
        }
    }

    public final boolean setMax() {
        return !this.hashCode.isEmpty() || !this.FastBitmap$CoordinateSystem.isEmpty() || !this.values.isEmpty() || !this.Mean$Arithmetic.isEmpty() || !this.equals.isEmpty() || !this.Grayscale$Algorithm.isEmpty() || !this.length.isEmpty() || !this.setMin.isEmpty() || !this.isInside.isEmpty() || !this.setMax.isEmpty() || !this.getMin.isEmpty();
    }

    public final boolean getMin(@NonNull RecyclerView.valueOf valueof, @NonNull List<Object> list) {
        return !list.isEmpty() || super.getMin(valueof, list);
    }

    private void getMax(getMin getmin) {
        if (getmin.setMax != null) {
            getMin(getmin, getmin.setMax);
        }
        if (getmin.getMax != null) {
            getMin(getmin, getmin.getMax);
        }
    }

    private static void getMax(List<RecyclerView.valueOf> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            ViewCompat.Grayscale$Algorithm(list.get(size).itemView).getMax();
        }
    }

    private boolean getMin(getMin getmin, RecyclerView.valueOf valueof) {
        if (getmin.getMax == valueof) {
            getmin.getMax = null;
        } else if (getmin.setMax != valueof) {
            return false;
        } else {
            getmin.setMax = null;
        }
        toFloatRange(valueof);
        valueof.itemView.setTranslationX(0.0f);
        valueof.itemView.setTranslationY(0.0f);
        if (this.toFloatRange == null) {
            return true;
        }
        this.toFloatRange.length(valueof);
        return true;
    }

    public long setMax(long j, long j2, long j3) {
        return j + Math.max(j2, j3);
    }

    public long length(long j, long j2, long j3) {
        return j + Math.max(j2, j3);
    }

    public final boolean setMin(RecyclerView.valueOf valueof) {
        toString(valueof);
        this.Mean$Arithmetic.add(valueof);
        return true;
    }

    public final boolean length(RecyclerView.valueOf valueof) {
        toString(valueof);
        IsOverlapping(valueof);
        this.hashCode.add(valueof);
        return true;
    }

    public final boolean setMin(RecyclerView.valueOf valueof, RecyclerView.valueOf valueof2, int i, int i2, int i3, int i4) {
        RecyclerView.valueOf valueof3 = valueof;
        RecyclerView.valueOf valueof4 = valueof2;
        if (valueof3 == valueof4) {
            return setMax(valueof, i, i2, i3, i4);
        }
        float translationX = valueof3.itemView.getTranslationX();
        float translationY = valueof3.itemView.getTranslationY();
        float alpha = valueof3.itemView.getAlpha();
        toString(valueof);
        int i5 = (int) (((float) (i3 - i)) - translationX);
        int i6 = (int) (((float) (i4 - i2)) - translationY);
        valueof3.itemView.setTranslationX(translationX);
        valueof3.itemView.setTranslationY(translationY);
        valueof3.itemView.setAlpha(alpha);
        if (valueof4 != null) {
            toString(valueof4);
            valueof4.itemView.setTranslationX((float) (-i5));
            valueof4.itemView.setTranslationY((float) (-i6));
            valueof4.itemView.setAlpha(0.0f);
        }
        this.FastBitmap$CoordinateSystem.add(new getMin(valueof, valueof2, i, i2, i3, i4, (byte) 0));
        return true;
    }

    public final boolean setMax(RecyclerView.valueOf valueof, int i, int i2, int i3, int i4) {
        View view = valueof.itemView;
        int translationX = (int) (((float) i) + valueof.itemView.getTranslationX());
        int translationY = (int) (((float) i2) + valueof.itemView.getTranslationY());
        toString(valueof);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 != 0 || i6 != 0) {
            if (i5 != 0) {
                view.setTranslationX((float) (-i5));
            }
            if (i6 != 0) {
                view.setTranslationY((float) (-i6));
            }
            this.values.add(new setMin(valueof, translationX, translationY, i3, i4, (byte) 0));
            return true;
        } else if (this.toFloatRange == null) {
            return false;
        } else {
            this.toFloatRange.length(valueof);
            return false;
        }
    }

    private void toString(RecyclerView.valueOf valueof) {
        if (this.invokeSuspend == null) {
            this.invokeSuspend = new ValueAnimator().getInterpolator();
        }
        valueof.itemView.animate().setInterpolator(this.invokeSuspend);
        getMin(valueof);
    }

    private void setMin(List<getMin> list, RecyclerView.valueOf valueof) {
        for (int size = list.size() - 1; size >= 0; size--) {
            getMin getmin = list.get(size);
            if (getMin(getmin, valueof) && getmin.setMax == null && getmin.getMax == null) {
                list.remove(getmin);
            }
        }
    }

    static class setMin {
        int getMax;
        int getMin;
        RecyclerView.valueOf length;
        int setMax;
        int setMin;

        /* synthetic */ setMin(RecyclerView.valueOf valueof, int i, int i2, int i3, int i4, byte b) {
            this(valueof, i, i2, i3, i4);
        }

        private setMin(RecyclerView.valueOf valueof, int i, int i2, int i3, int i4) {
            this.length = valueof;
            this.getMax = i;
            this.getMin = i2;
            this.setMax = i3;
            this.setMin = i4;
        }
    }

    protected static class getMin {
        RecyclerView.valueOf getMax;
        int getMin;
        int length;
        RecyclerView.valueOf setMax;
        int setMin;
        int toIntRange;

        /* synthetic */ getMin(RecyclerView.valueOf valueof, RecyclerView.valueOf valueof2, int i, int i2, int i3, int i4, byte b) {
            this(valueof, valueof2, i, i2, i3, i4);
        }

        private getMin(RecyclerView.valueOf valueof, RecyclerView.valueOf valueof2, int i, int i2, int i3, int i4) {
            this(valueof, valueof2);
            this.length = i;
            this.getMin = i2;
            this.setMin = i3;
            this.toIntRange = i4;
        }

        private getMin(RecyclerView.valueOf valueof, RecyclerView.valueOf valueof2) {
            this.setMax = valueof;
            this.getMax = valueof2;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ChangeInfo{oldHolder=");
            sb.append(this.setMax);
            sb.append(", newHolder=");
            sb.append(this.getMax);
            sb.append(", fromX=");
            sb.append(this.length);
            sb.append(", fromY=");
            sb.append(this.getMin);
            sb.append(", toX=");
            sb.append(this.setMin);
            sb.append(", toY=");
            sb.append(this.toIntRange);
            sb.append('}');
            return sb.toString();
        }
    }

    static class getMax implements supportInvalidateOptionsMenu {
        public void getMin(View view) {
        }

        public void length(View view) {
        }

        public void setMin(View view) {
        }

        private getMax() {
        }

        /* synthetic */ getMax(byte b) {
            this();
        }
    }

    public final void length() {
        int size = this.values.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            setMin setmin = this.values.get(size);
            View view = setmin.length.itemView;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            RecyclerView.valueOf valueof = setmin.length;
            if (this.toFloatRange != null) {
                this.toFloatRange.length(valueof);
            }
            this.values.remove(size);
        }
        for (int size2 = this.Mean$Arithmetic.size() - 1; size2 >= 0; size2--) {
            RecyclerView.valueOf valueof2 = this.Mean$Arithmetic.get(size2);
            if (this.toFloatRange != null) {
                this.toFloatRange.length(valueof2);
            }
            this.Mean$Arithmetic.remove(size2);
        }
        for (int size3 = this.hashCode.size() - 1; size3 >= 0; size3--) {
            RecyclerView.valueOf valueof3 = this.hashCode.get(size3);
            toIntRange(valueof3);
            if (this.toFloatRange != null) {
                this.toFloatRange.length(valueof3);
            }
            this.hashCode.remove(size3);
        }
        for (int size4 = this.FastBitmap$CoordinateSystem.size() - 1; size4 >= 0; size4--) {
            getMax(this.FastBitmap$CoordinateSystem.get(size4));
        }
        this.FastBitmap$CoordinateSystem.clear();
        if (setMax()) {
            for (int size5 = this.isInside.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList = this.isInside.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    setMin setmin2 = (setMin) arrayList.get(size6);
                    View view2 = setmin2.length.itemView;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    RecyclerView.valueOf valueof4 = setmin2.length;
                    if (this.toFloatRange != null) {
                        this.toFloatRange.length(valueof4);
                    }
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.isInside.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.setMax.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList2 = this.setMax.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    RecyclerView.valueOf valueof5 = (RecyclerView.valueOf) arrayList2.get(size8);
                    toIntRange(valueof5);
                    if (this.toFloatRange != null) {
                        this.toFloatRange.length(valueof5);
                    }
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.setMax.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.getMin.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList3 = this.getMin.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    getMax((getMin) arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.getMin.remove(arrayList3);
                    }
                }
            }
            getMax((List<RecyclerView.valueOf>) this.Grayscale$Algorithm);
            getMax((List<RecyclerView.valueOf>) this.equals);
            getMax((List<RecyclerView.valueOf>) this.length);
            getMax((List<RecyclerView.valueOf>) this.setMin);
            setMin();
        }
    }

    static /* synthetic */ void length(InitializationProvider initializationProvider) {
        if (!initializationProvider.setMax()) {
            initializationProvider.setMin();
        }
    }

    static /* synthetic */ void setMin(InitializationProvider initializationProvider, ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            setMin setmin = (setMin) it.next();
            final RecyclerView.valueOf valueof = setmin.length;
            int i = setmin.getMax;
            int i2 = setmin.getMin;
            int i3 = setmin.setMax;
            int i4 = setmin.setMin;
            View view = valueof.itemView;
            int i5 = i3 - i;
            int i6 = i4 - i2;
            if (i5 != 0) {
                ViewCompat.Grayscale$Algorithm(view).setMin(0.0f);
            }
            if (i6 != 0) {
                ViewCompat.Grayscale$Algorithm(view).getMax(0.0f);
            }
            final invalidateOptionsMenu Grayscale$Algorithm2 = ViewCompat.Grayscale$Algorithm(view);
            initializationProvider.equals.add(valueof);
            final int i7 = i5;
            final int i8 = i6;
            Grayscale$Algorithm2.getMin(initializationProvider.IsOverlapping).length(new getMax() {
                public final void setMin(View view) {
                }

                public final void length(View view) {
                    Grayscale$Algorithm2.length((supportInvalidateOptionsMenu) null);
                    InitializationProvider initializationProvider = InitializationProvider.this;
                    RecyclerView.valueOf valueof = valueof;
                    if (initializationProvider.toFloatRange != null) {
                        initializationProvider.toFloatRange.length(valueof);
                    }
                    InitializationProvider.this.equals.remove(valueof);
                    InitializationProvider.length(InitializationProvider.this);
                }

                public final void getMin(View view) {
                    if (i7 != 0) {
                        view.setTranslationX(0.0f);
                    }
                    if (i8 != 0) {
                        view.setTranslationY(0.0f);
                    }
                }
            }).setMax();
        }
        arrayList.clear();
        initializationProvider.isInside.remove(arrayList);
    }

    static /* synthetic */ void getMax(InitializationProvider initializationProvider, ArrayList arrayList) {
        View view;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            final getMin getmin = (getMin) it.next();
            final RecyclerView.valueOf valueof = getmin.setMax;
            View view2 = null;
            if (valueof == null) {
                view = null;
            } else {
                view = valueof.itemView;
            }
            final RecyclerView.valueOf valueof2 = getmin.getMax;
            if (valueof2 != null) {
                view2 = valueof2.itemView;
            }
            final View view3 = view2;
            if (view != null) {
                final invalidateOptionsMenu length2 = initializationProvider.length(valueof, getmin);
                initializationProvider.setMin.add(getmin.setMax);
                length2.length(new getMax() {
                    public final void setMin(View view) {
                    }

                    public final void length(View view) {
                        length2.length((supportInvalidateOptionsMenu) null);
                        InitializationProvider.this.toFloatRange(valueof);
                        view.setTranslationX(0.0f);
                        view.setTranslationY(0.0f);
                        InitializationProvider initializationProvider = InitializationProvider.this;
                        RecyclerView.valueOf valueof = getmin.setMax;
                        if (initializationProvider.toFloatRange != null) {
                            initializationProvider.toFloatRange.length(valueof);
                        }
                        InitializationProvider.this.setMin.remove(getmin.setMax);
                        InitializationProvider.length(InitializationProvider.this);
                    }
                }).setMax();
            }
            if (view3 != null) {
                invalidateOptionsMenu equals2 = initializationProvider.equals(valueof2);
                initializationProvider.setMin.add(getmin.getMax);
                final invalidateOptionsMenu invalidateoptionsmenu = equals2;
                equals2.length(new getMax() {
                    public final void setMin(View view) {
                    }

                    public final void length(View view) {
                        invalidateoptionsmenu.length((supportInvalidateOptionsMenu) null);
                        InitializationProvider.this.toFloatRange(valueof2);
                        view3.setTranslationX(0.0f);
                        view3.setTranslationY(0.0f);
                        InitializationProvider initializationProvider = InitializationProvider.this;
                        RecyclerView.valueOf valueof = getmin.getMax;
                        if (initializationProvider.toFloatRange != null) {
                            initializationProvider.toFloatRange.length(valueof);
                        }
                        InitializationProvider.this.setMin.remove(getmin.getMax);
                        InitializationProvider.length(InitializationProvider.this);
                    }
                }).setMax();
            }
        }
        arrayList.clear();
        initializationProvider.getMin.remove(arrayList);
    }

    static /* synthetic */ void length(InitializationProvider initializationProvider, ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            final RecyclerView.valueOf valueof = (RecyclerView.valueOf) it.next();
            final invalidateOptionsMenu doubleRange = initializationProvider.toDoubleRange(valueof);
            initializationProvider.length.add(valueof);
            doubleRange.length(new getMax() {
                public final void setMin(View view) {
                }

                public final void length(View view) {
                    doubleRange.length((supportInvalidateOptionsMenu) null);
                    InitializationProvider initializationProvider = InitializationProvider.this;
                    RecyclerView.valueOf valueof = valueof;
                    if (initializationProvider.toFloatRange != null) {
                        initializationProvider.toFloatRange.length(valueof);
                    }
                    InitializationProvider.this.length.remove(valueof);
                    InitializationProvider.length(InitializationProvider.this);
                    InitializationProvider.this.toIntRange(valueof);
                }

                public final void getMin(View view) {
                    InitializationProvider.this.toIntRange(valueof);
                }
            }).setMax();
        }
        arrayList.clear();
        initializationProvider.setMax.remove(arrayList);
    }
}
