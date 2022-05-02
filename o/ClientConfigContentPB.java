package o;

import org.mozilla.javascript.ast.FunctionNode;

public final class ClientConfigContentPB {
    boolean equals;
    int getMax = -1;
    boolean[] getMin;
    public final FunctionNode length;
    boolean setMax;
    boolean setMin;

    ClientConfigContentPB(FunctionNode functionNode) {
        this.length = functionNode;
        if (functionNode.ICustomTabsCallback$Stub$Proxy == null) {
            functionNode.ICustomTabsCallback$Stub$Proxy = this;
            return;
        }
        throw new IllegalStateException();
    }

    public final boolean setMax() {
        return this.getMax >= 0;
    }

    public final boolean length() {
        return this.setMax;
    }

    public final boolean getMax(int i) {
        return i < this.length.onTransact;
    }

    public final boolean setMin(int i) {
        boolean[] zArr;
        int i2 = i - this.length.onTransact;
        if (i2 < 0 || (zArr = this.getMin) == null) {
            return false;
        }
        return zArr[i2];
    }

    public final int setMax(LogFactory logFactory) {
        LogFactory logFactory2;
        int min = logFactory.setMin(7, -1);
        if (min == -1) {
            int length2 = logFactory.length();
            if (length2 == 55) {
                logFactory2 = logFactory;
            } else if (length2 == 56 || length2 == 157) {
                logFactory2 = logFactory.setMin();
            } else {
                throw getStyleId.setMin();
            }
            min = this.length.IsOverlapping(logFactory2);
            if (min >= 0) {
                logFactory.setMax(7, min);
            } else {
                throw getStyleId.setMin();
            }
        }
        return min;
    }
}
