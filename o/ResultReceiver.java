package o;

import java.util.Arrays;
import o.IResultReceiver;

public final class ResultReceiver extends IResultReceiver.Default {
    private double[][] getMax;
    private double getMin = Double.NaN;
    private double[] length;

    public ResultReceiver(double[] dArr, double[][] dArr2) {
        int length2 = dArr2[0].length;
        this.length = dArr;
        this.getMax = dArr2;
        if (length2 > 2) {
            this.getMin = 0.0d;
        }
    }

    public class MyResultReceiver {
        static MyResultReceiver getMin = new MyResultReceiver();
        public static String[] length = {"standard", "accelerate", "decelerate", "linear"};
        String setMax = "identity";

        public double getMin(double d) {
            return d;
        }

        public double setMin(double d) {
            return 1.0d;
        }

        public static MyResultReceiver getMax(String str) {
            if (str == null) {
                return null;
            }
            if (str.startsWith("cubic")) {
                return new getMin(str);
            }
            char c = 65535;
            switch (str.hashCode()) {
                case -1354466595:
                    if (str.equals("accelerate")) {
                        c = 1;
                        break;
                    }
                    break;
                case -1263948740:
                    if (str.equals("decelerate")) {
                        c = 2;
                        break;
                    }
                    break;
                case -1102672091:
                    if (str.equals("linear")) {
                        c = 3;
                        break;
                    }
                    break;
                case 1312628413:
                    if (str.equals("standard")) {
                        c = 0;
                        break;
                    }
                    break;
            }
            if (c == 0) {
                return new getMin("cubic(0.4, 0.0, 0.2, 1)");
            }
            if (c == 1) {
                return new getMin("cubic(0.4, 0.05, 0.8, 0.7)");
            }
            if (c == 2) {
                return new getMin("cubic(0.0, 0.0, 0.2, 0.95)");
            }
            if (c == 3) {
                return new getMin("cubic(1, 1, 0, 0)");
            }
            Arrays.toString(length);
            return getMin;
        }

        public String toString() {
            return this.setMax;
        }

        static class getMin extends MyResultReceiver {
            private static double equals = 0.01d;
            private static double toIntRange = 1.0E-4d;
            double IsOverlapping;
            double getMax;
            double setMin;
            double toFloatRange;

            getMin(String str) {
                this.setMax = str;
                int indexOf = str.indexOf(40);
                int indexOf2 = str.indexOf(44, indexOf);
                this.getMax = Double.parseDouble(str.substring(indexOf + 1, indexOf2).trim());
                int i = indexOf2 + 1;
                int indexOf3 = str.indexOf(44, i);
                this.setMin = Double.parseDouble(str.substring(i, indexOf3).trim());
                int i2 = indexOf3 + 1;
                int indexOf4 = str.indexOf(44, i2);
                this.toFloatRange = Double.parseDouble(str.substring(i2, indexOf4).trim());
                int i3 = indexOf4 + 1;
                this.IsOverlapping = Double.parseDouble(str.substring(i3, str.indexOf(41, i3)).trim());
            }

            private double length(double d) {
                double d2 = 1.0d - d;
                double d3 = 3.0d * d2;
                return (this.getMax * d2 * d3 * d) + (this.toFloatRange * d3 * d * d) + (d * d * d);
            }

            private double getMax(double d) {
                double d2 = 1.0d - d;
                double d3 = 3.0d * d2;
                return (this.setMin * d2 * d3 * d) + (this.IsOverlapping * d3 * d * d) + (d * d * d);
            }

            public final double setMin(double d) {
                double d2 = 0.5d;
                double d3 = 0.5d;
                while (d2 > toIntRange) {
                    d2 *= 0.5d;
                    d3 = length(d3) < d ? d3 + d2 : d3 - d2;
                }
                double d4 = d3 - d2;
                double d5 = d3 + d2;
                return (getMax(d5) - getMax(d4)) / (length(d5) - length(d4));
            }

            public final double getMin(double d) {
                if (d <= 0.0d) {
                    return 0.0d;
                }
                if (d >= 1.0d) {
                    return 1.0d;
                }
                double d2 = 0.5d;
                double d3 = 0.5d;
                while (d2 > equals) {
                    d2 *= 0.5d;
                    d3 = length(d3) < d ? d3 + d2 : d3 - d2;
                }
                double d4 = d3 - d2;
                double length = length(d4);
                double d5 = d3 + d2;
                double length2 = length(d5);
                double max = getMax(d4);
                return (((getMax(d5) - max) * (d - length)) / (length2 - length)) + max;
            }
        }
    }

    public final void length(double d, double[] dArr) {
        double[] dArr2 = this.length;
        int length2 = dArr2.length;
        int i = 0;
        int length3 = this.getMax[0].length;
        if (d <= dArr2[0]) {
            for (int i2 = 0; i2 < length3; i2++) {
                dArr[i2] = this.getMax[0][i2];
            }
            return;
        }
        int i3 = length2 - 1;
        if (d >= dArr2[i3]) {
            while (i < length3) {
                dArr[i] = this.getMax[i3][i];
                i++;
            }
            return;
        }
        int i4 = 0;
        while (i4 < i3) {
            if (d == this.length[i4]) {
                for (int i5 = 0; i5 < length3; i5++) {
                    dArr[i5] = this.getMax[i4][i5];
                }
            }
            double[] dArr3 = this.length;
            int i6 = i4 + 1;
            if (d < dArr3[i6]) {
                double d2 = (d - dArr3[i4]) / (dArr3[i6] - dArr3[i4]);
                while (i < length3) {
                    double[][] dArr4 = this.getMax;
                    dArr[i] = (dArr4[i4][i] * (1.0d - d2)) + (dArr4[i6][i] * d2);
                    i++;
                }
                return;
            }
            i4 = i6;
        }
    }

    public final void getMax(double d, float[] fArr) {
        double[] dArr = this.length;
        int length2 = dArr.length;
        int i = 0;
        int length3 = this.getMax[0].length;
        if (d <= dArr[0]) {
            for (int i2 = 0; i2 < length3; i2++) {
                fArr[i2] = (float) this.getMax[0][i2];
            }
            return;
        }
        int i3 = length2 - 1;
        if (d >= dArr[i3]) {
            while (i < length3) {
                fArr[i] = (float) this.getMax[i3][i];
                i++;
            }
            return;
        }
        int i4 = 0;
        while (i4 < i3) {
            if (d == this.length[i4]) {
                for (int i5 = 0; i5 < length3; i5++) {
                    fArr[i5] = (float) this.getMax[i4][i5];
                }
            }
            double[] dArr2 = this.length;
            int i6 = i4 + 1;
            if (d < dArr2[i6]) {
                double d2 = (d - dArr2[i4]) / (dArr2[i6] - dArr2[i4]);
                while (i < length3) {
                    double[][] dArr3 = this.getMax;
                    fArr[i] = (float) ((dArr3[i4][i] * (1.0d - d2)) + (dArr3[i6][i] * d2));
                    i++;
                }
                return;
            }
            i4 = i6;
        }
    }

    public final double getMax(double d) {
        double[] dArr = this.length;
        int length2 = dArr.length;
        if (d <= dArr[0]) {
            return this.getMax[0][0];
        }
        int i = length2 - 1;
        if (d >= dArr[i]) {
            return this.getMax[i][0];
        }
        int i2 = 0;
        while (i2 < i) {
            double[] dArr2 = this.length;
            if (d == dArr2[i2]) {
                return this.getMax[i2][0];
            }
            int i3 = i2 + 1;
            if (d < dArr2[i3]) {
                double d2 = (d - dArr2[i2]) / (dArr2[i3] - dArr2[i2]);
                double[][] dArr3 = this.getMax;
                return (dArr3[i2][0] * (1.0d - d2)) + (dArr3[i3][0] * d2);
            }
            i2 = i3;
        }
        return 0.0d;
    }

    public final void getMin(double d, double[] dArr) {
        double[] dArr2 = this.length;
        int length2 = dArr2.length;
        int length3 = this.getMax[0].length;
        if (d <= dArr2[0]) {
            d = dArr2[0];
        } else {
            int i = length2 - 1;
            if (d >= dArr2[i]) {
                d = dArr2[i];
            }
        }
        int i2 = 0;
        while (i2 < length2 - 1) {
            double[] dArr3 = this.length;
            int i3 = i2 + 1;
            if (d <= dArr3[i3]) {
                double d2 = dArr3[i3] - dArr3[i2];
                for (int i4 = 0; i4 < length3; i4++) {
                    double[][] dArr4 = this.getMax;
                    dArr[i4] = (dArr4[i3][i4] - dArr4[i2][i4]) / d2;
                }
                return;
            }
            i2 = i3;
        }
    }

    public final double setMax(double d) {
        double[] dArr = this.length;
        int length2 = dArr.length;
        if (d < dArr[0]) {
            d = dArr[0];
        } else {
            int i = length2 - 1;
            if (d >= dArr[i]) {
                d = dArr[i];
            }
        }
        int i2 = 0;
        while (i2 < length2 - 1) {
            double[] dArr2 = this.length;
            int i3 = i2 + 1;
            if (d <= dArr2[i3]) {
                double d2 = dArr2[i3] - dArr2[i2];
                double[][] dArr3 = this.getMax;
                return (dArr3[i3][0] - dArr3[i2][0]) / d2;
            }
            i2 = i3;
        }
        return 0.0d;
    }

    public final double[] getMin() {
        return this.length;
    }
}
