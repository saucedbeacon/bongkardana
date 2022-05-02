package androidx.constraintlayout.solver;

import java.util.Arrays;
import java.util.HashSet;
import o.registerForActivityResult;
import o.reportFullyDrawn;

public final class SolverVariable {
    private static int Grayscale$Algorithm = 1;
    private static int ICustomTabsCallback = 1;
    private static int Mean$Arithmetic = 1;
    private static int invokeSuspend = 1;
    private static int valueOf = 1;
    int FastBitmap$CoordinateSystem = 0;
    registerForActivityResult[] IsOverlapping = new registerForActivityResult[16];
    public float[] equals = new float[9];
    private String getCause;
    public float getMax;
    public int getMin = -1;
    public int hashCode = 0;
    HashSet<registerForActivityResult> invoke = null;
    public boolean isInside = false;
    public int length = -1;
    public int setMax = 0;
    public boolean setMin;
    public float toDoubleRange = 0.0f;
    public Type toFloatRange;
    public float[] toIntRange = new float[9];
    public boolean toString = false;
    public int values = -1;

    public enum Type {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public static void setMin() {
        invokeSuspend++;
    }

    public SolverVariable(Type type) {
        this.toFloatRange = type;
    }

    public final void length(registerForActivityResult registerforactivityresult) {
        int i = 0;
        while (true) {
            int i2 = this.FastBitmap$CoordinateSystem;
            if (i >= i2) {
                registerForActivityResult[] registerforactivityresultArr = this.IsOverlapping;
                if (i2 >= registerforactivityresultArr.length) {
                    this.IsOverlapping = (registerForActivityResult[]) Arrays.copyOf(registerforactivityresultArr, registerforactivityresultArr.length * 2);
                }
                registerForActivityResult[] registerforactivityresultArr2 = this.IsOverlapping;
                int i3 = this.FastBitmap$CoordinateSystem;
                registerforactivityresultArr2[i3] = registerforactivityresult;
                this.FastBitmap$CoordinateSystem = i3 + 1;
                return;
            } else if (this.IsOverlapping[i] != registerforactivityresult) {
                i++;
            } else {
                return;
            }
        }
    }

    public final void setMin(registerForActivityResult registerforactivityresult) {
        int i = this.FastBitmap$CoordinateSystem;
        int i2 = 0;
        while (i2 < i) {
            if (this.IsOverlapping[i2] == registerforactivityresult) {
                while (i2 < i - 1) {
                    registerForActivityResult[] registerforactivityresultArr = this.IsOverlapping;
                    int i3 = i2 + 1;
                    registerforactivityresultArr[i2] = registerforactivityresultArr[i3];
                    i2 = i3;
                }
                this.FastBitmap$CoordinateSystem--;
                return;
            }
            i2++;
        }
    }

    public final void length(reportFullyDrawn reportfullydrawn, registerForActivityResult registerforactivityresult) {
        int i = this.FastBitmap$CoordinateSystem;
        for (int i2 = 0; i2 < i; i2++) {
            this.IsOverlapping[i2].getMin(reportfullydrawn, registerforactivityresult, false);
        }
        this.FastBitmap$CoordinateSystem = 0;
    }

    public final void getMax(reportFullyDrawn reportfullydrawn, float f) {
        this.getMax = f;
        this.isInside = true;
        this.toString = false;
        this.values = -1;
        this.toDoubleRange = 0.0f;
        int i = this.FastBitmap$CoordinateSystem;
        this.length = -1;
        for (int i2 = 0; i2 < i; i2++) {
            this.IsOverlapping[i2].setMax(reportfullydrawn, this, false);
        }
        this.FastBitmap$CoordinateSystem = 0;
    }

    public final void setMax() {
        this.getCause = null;
        this.toFloatRange = Type.UNKNOWN;
        this.setMax = 0;
        this.getMin = -1;
        this.length = -1;
        this.getMax = 0.0f;
        this.isInside = false;
        this.toString = false;
        this.values = -1;
        this.toDoubleRange = 0.0f;
        int i = this.FastBitmap$CoordinateSystem;
        for (int i2 = 0; i2 < i; i2++) {
            this.IsOverlapping[i2] = null;
        }
        this.FastBitmap$CoordinateSystem = 0;
        this.hashCode = 0;
        this.setMin = false;
        Arrays.fill(this.equals, 0.0f);
    }

    public final String toString() {
        if (this.getCause != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("");
            sb.append(this.getCause);
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("");
        sb2.append(this.getMin);
        return sb2.toString();
    }
}
