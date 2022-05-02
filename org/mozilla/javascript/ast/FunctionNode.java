package org.mozilla.javascript.ast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import o.CircleFrameLayout;
import o.LogFactory;
import o.dispatchOnCancelled;
import o.getCricleColor;
import o.isHasFace;
import o.onCancelLoad;
import o.onCanceled;

public final class FunctionNode extends getCricleColor {
    public static final List<isHasFace> equals = Collections.unmodifiableList(new ArrayList());
    public int Grayscale$Algorithm = -1;
    public boolean Mean$Arithmetic;
    public Map<LogFactory, int[]> b;
    public isHasFace create;
    private boolean getInterfaceDescriptor;
    public boolean invoke;
    public int invokeSuspend;
    public isHasFace isInside;
    public int toDoubleRange = -1;
    public List<isHasFace> toFloatRange;
    public CircleFrameLayout.WidgetListener toIntRange;
    public List<LogFactory> valueOf;
    public Form values = Form.FUNCTION;

    public enum Form {
        FUNCTION,
        GETTER,
        SETTER,
        METHOD
    }

    public FunctionNode() {
        this.getMin = 110;
    }

    public FunctionNode(int i) {
        super(i);
        this.getMin = 110;
    }

    public FunctionNode(int i, CircleFrameLayout.WidgetListener widgetListener) {
        super(i);
        this.getMin = 110;
        this.toIntRange = widgetListener;
        if (widgetListener != null) {
            widgetListener.getMax(this);
        }
    }

    public final void getMin(isHasFace ishasface) {
        if (ishasface != null) {
            if (this.toFloatRange == null) {
                this.toFloatRange = new ArrayList();
            }
            this.toFloatRange.add(ishasface);
            ishasface.getMax(this);
            return;
        }
        throw new IllegalArgumentException("arg cannot be null");
    }

    public final void setMax(isHasFace ishasface) {
        if (ishasface != null) {
            this.isInside = ishasface;
            if (Boolean.TRUE.equals(ishasface.getMax(25))) {
                this.getInterfaceDescriptor = true;
            }
            int Mean$Arithmetic2 = ishasface.Mean$Arithmetic() + ishasface.create();
            ishasface.getMax(this);
            equals(Mean$Arithmetic2 - this.toString);
            this.extraCallback = this.toString;
            this.onRelationshipValidationResult = Mean$Arithmetic2;
            return;
        }
        throw new IllegalArgumentException("arg cannot be null");
    }

    public final void toIntRange(int i) {
        int max = dispatchOnCancelled.setMax(i);
        if (i != max) {
            onCanceled oncanceled = new onCanceled(i, max, 1);
            onCancelLoad.setMax(1010134004, oncanceled);
            onCancelLoad.getMin(1010134004, oncanceled);
        }
        this.Grayscale$Algorithm = i;
    }

    public final boolean invoke() {
        return this.getInterfaceDescriptor;
    }

    public final boolean Grayscale$Algorithm() {
        return this.Mean$Arithmetic;
    }

    public final boolean invokeSuspend() {
        return this.invoke;
    }

    public final int setMin(FunctionNode functionNode) {
        int min = super.setMin(functionNode);
        if ((this.ICustomTabsCallback$Default == null ? 0 : this.ICustomTabsCallback$Default.size()) > 0) {
            this.Mean$Arithmetic = true;
        }
        return min;
    }
}
