package o;

import android.annotation.TargetApi;
import android.graphics.Matrix;
import android.graphics.Path;
import android.os.Build;
import com.airbnb.lottie.model.content.MergePaths;
import java.util.ArrayList;
import java.util.List;

@TargetApi(19)
public final class getSuggestionCommitIconResId implements setImeOptions, removeAllTabs {
    private final String getMax;
    private final Path getMin = new Path();
    private final MergePaths isInside;
    private final List<setImeOptions> length = new ArrayList();
    private final Path setMax = new Path();
    private final Path setMin = new Path();

    public getSuggestionCommitIconResId(MergePaths mergePaths) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.getMax = mergePaths.setMax;
            this.isInside = mergePaths;
            return;
        }
        throw new IllegalStateException("Merge paths are not supported pre-KitKat.");
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP:0: B:0:0x0000->B:3:0x000a, LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void length(java.util.ListIterator<o.animateToTab> r3) {
        /*
            r2 = this;
        L_0x0000:
            boolean r0 = r3.hasPrevious()
            if (r0 == 0) goto L_0x000c
            java.lang.Object r0 = r3.previous()
            if (r0 != r2) goto L_0x0000
        L_0x000c:
            boolean r0 = r3.hasPrevious()
            if (r0 == 0) goto L_0x0027
            java.lang.Object r0 = r3.previous()
            o.animateToTab r0 = (o.animateToTab) r0
            boolean r1 = r0 instanceof o.setImeOptions
            if (r1 == 0) goto L_0x000c
            java.util.List<o.setImeOptions> r1 = r2.length
            o.setImeOptions r0 = (o.setImeOptions) r0
            r1.add(r0)
            r3.remove()
            goto L_0x000c
        L_0x0027:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getSuggestionCommitIconResId.length(java.util.ListIterator):void");
    }

    public final void setMax(List<animateToTab> list, List<animateToTab> list2) {
        for (int i = 0; i < this.length.size(); i++) {
            this.length.get(i).setMax(list, list2);
        }
    }

    public final Path getMax() {
        this.setMax.reset();
        if (this.isInside.getMin()) {
            return this.setMax;
        }
        int i = AnonymousClass1.setMin[this.isInside.length.ordinal()];
        if (i == 1) {
            for (int i2 = 0; i2 < this.length.size(); i2++) {
                this.setMax.addPath(this.length.get(i2).getMax());
            }
        } else if (i == 2) {
            setMax(Path.Op.UNION);
        } else if (i == 3) {
            setMax(Path.Op.REVERSE_DIFFERENCE);
        } else if (i == 4) {
            setMax(Path.Op.INTERSECT);
        } else if (i == 5) {
            setMax(Path.Op.XOR);
        }
        return this.setMax;
    }

    /* renamed from: o.getSuggestionCommitIconResId$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] setMin;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.airbnb.lottie.model.content.MergePaths$MergePathsMode[] r0 = com.airbnb.lottie.model.content.MergePaths.MergePathsMode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                setMin = r0
                com.airbnb.lottie.model.content.MergePaths$MergePathsMode r1 = com.airbnb.lottie.model.content.MergePaths.MergePathsMode.MERGE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = setMin     // Catch:{ NoSuchFieldError -> 0x001d }
                com.airbnb.lottie.model.content.MergePaths$MergePathsMode r1 = com.airbnb.lottie.model.content.MergePaths.MergePathsMode.ADD     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = setMin     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.airbnb.lottie.model.content.MergePaths$MergePathsMode r1 = com.airbnb.lottie.model.content.MergePaths.MergePathsMode.SUBTRACT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = setMin     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.airbnb.lottie.model.content.MergePaths$MergePathsMode r1 = com.airbnb.lottie.model.content.MergePaths.MergePathsMode.INTERSECT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = setMin     // Catch:{ NoSuchFieldError -> 0x003e }
                com.airbnb.lottie.model.content.MergePaths$MergePathsMode r1 = com.airbnb.lottie.model.content.MergePaths.MergePathsMode.EXCLUDE_INTERSECTIONS     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.getSuggestionCommitIconResId.AnonymousClass1.<clinit>():void");
        }
    }

    public final String setMin() {
        return this.getMax;
    }

    @TargetApi(19)
    private void setMax(Path.Op op) {
        Matrix matrix;
        Matrix matrix2;
        this.getMin.reset();
        this.setMin.reset();
        for (int size = this.length.size() - 1; size > 0; size--) {
            setImeOptions setimeoptions = this.length.get(size);
            if (setimeoptions instanceof createTabView) {
                createTabView createtabview = (createTabView) setimeoptions;
                List<setImeOptions> min = createtabview.getMin();
                for (int size2 = min.size() - 1; size2 >= 0; size2--) {
                    Path max = min.get(size2).getMax();
                    if (createtabview.getMin != null) {
                        matrix2 = createtabview.getMin.length();
                    } else {
                        createtabview.setMax.reset();
                        matrix2 = createtabview.setMax;
                    }
                    max.transform(matrix2);
                    this.getMin.addPath(max);
                }
            } else {
                this.getMin.addPath(setimeoptions.getMax());
            }
        }
        setImeOptions setimeoptions2 = this.length.get(0);
        if (setimeoptions2 instanceof createTabView) {
            createTabView createtabview2 = (createTabView) setimeoptions2;
            List<setImeOptions> min2 = createtabview2.getMin();
            for (int i = 0; i < min2.size(); i++) {
                Path max2 = min2.get(i).getMax();
                if (createtabview2.getMin != null) {
                    matrix = createtabview2.getMin.length();
                } else {
                    createtabview2.setMax.reset();
                    matrix = createtabview2.setMax;
                }
                max2.transform(matrix);
                this.setMin.addPath(max2);
            }
        } else {
            this.setMin.set(setimeoptions2.getMax());
        }
        this.setMax.op(this.setMin, this.getMin, op);
    }
}
