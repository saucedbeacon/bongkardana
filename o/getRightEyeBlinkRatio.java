package o;

public class getRightEyeBlinkRatio extends isHasFace {
    protected int equals = -1;
    protected isHasFace toFloatRange;
    protected isHasFace toIntRange;

    public getRightEyeBlinkRatio() {
    }

    public getRightEyeBlinkRatio(int i) {
        super(i);
    }

    public getRightEyeBlinkRatio(int i, int i2) {
        super(i, i2);
    }

    public getRightEyeBlinkRatio(int i, isHasFace ishasface, isHasFace ishasface2, int i2) {
        setMax(i);
        this.equals = i2 - ishasface.Mean$Arithmetic();
        length(ishasface, ishasface2);
    }

    public final void length(isHasFace ishasface, isHasFace ishasface2) {
        if (ishasface == null) {
            throw new IllegalArgumentException("arg cannot be null");
        } else if (ishasface2 != null) {
            length(ishasface.Mean$Arithmetic(), ishasface2.Mean$Arithmetic() + ishasface2.create());
            if (ishasface != null) {
                this.toFloatRange = ishasface;
                setMin(ishasface.equals());
                ishasface.getMax(this);
                if (ishasface2 != null) {
                    this.toIntRange = ishasface2;
                    ishasface2.getMax(this);
                    return;
                }
                throw new IllegalArgumentException("arg cannot be null");
            }
            throw new IllegalArgumentException("arg cannot be null");
        } else {
            throw new IllegalArgumentException("arg cannot be null");
        }
    }

    public final isHasFace Grayscale$Algorithm() {
        return this.toFloatRange;
    }

    public final void setMax(isHasFace ishasface) {
        if (ishasface != null) {
            this.toFloatRange = ishasface;
            setMin(ishasface.equals());
            ishasface.getMax(this);
            return;
        }
        throw new IllegalArgumentException("arg cannot be null");
    }

    public final isHasFace invokeSuspend() {
        return this.toIntRange;
    }

    public final void getMin(isHasFace ishasface) {
        if (ishasface != null) {
            this.toIntRange = ishasface;
            ishasface.getMax(this);
            return;
        }
        throw new IllegalArgumentException("arg cannot be null");
    }

    public final void toIntRange(int i) {
        this.equals = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0021, code lost:
        r0 = r4.toIntRange;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean toDoubleRange() {
        /*
            r4 = this;
            int r0 = r4.length()
            r1 = 90
            r2 = 1
            r3 = 0
            if (r0 == r1) goto L_0x002d
            r1 = 105(0x69, float:1.47E-43)
            if (r0 == r1) goto L_0x0017
            r1 = 106(0x6a, float:1.49E-43)
            if (r0 == r1) goto L_0x0017
            boolean r0 = super.toDoubleRange()
            return r0
        L_0x0017:
            o.isHasFace r0 = r4.toFloatRange
            if (r0 == 0) goto L_0x0021
            boolean r0 = r0.toDoubleRange()
            if (r0 != 0) goto L_0x002b
        L_0x0021:
            o.isHasFace r0 = r4.toIntRange
            if (r0 == 0) goto L_0x002c
            boolean r0 = r0.toDoubleRange()
            if (r0 == 0) goto L_0x002c
        L_0x002b:
            return r2
        L_0x002c:
            return r3
        L_0x002d:
            o.isHasFace r0 = r4.toIntRange
            if (r0 == 0) goto L_0x0038
            boolean r0 = r0.toDoubleRange()
            if (r0 == 0) goto L_0x0038
            return r2
        L_0x0038:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getRightEyeBlinkRatio.toDoubleRange():boolean");
    }
}
