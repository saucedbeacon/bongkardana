package o;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

public final class setIntegrity extends isHasFace {
    public isHasFace toIntRange;

    public setIntegrity() {
        this.getMin = TsExtractor.TS_STREAM_TYPE_SPLICE_INFO;
    }

    public setIntegrity(isHasFace ishasface, boolean z) {
        this(ishasface);
        if (z) {
            this.getMin = TsExtractor.TS_STREAM_TYPE_E_AC3;
        }
    }

    public setIntegrity(isHasFace ishasface) {
        this(ishasface.Mean$Arithmetic(), ishasface.create(), ishasface);
    }

    private setIntegrity(int i, int i2, isHasFace ishasface) {
        super(i, i2);
        this.getMin = TsExtractor.TS_STREAM_TYPE_SPLICE_INFO;
        if (ishasface != null) {
            this.toIntRange = ishasface;
            ishasface.getMax(this);
            setMin(ishasface.equals());
            return;
        }
        throw new IllegalArgumentException("arg cannot be null");
    }

    public final boolean toDoubleRange() {
        return this.getMin == 135 || this.toIntRange.toDoubleRange();
    }
}
