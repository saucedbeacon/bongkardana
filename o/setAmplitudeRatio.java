package o;

public final class setAmplitudeRatio extends setWaveLengthRatio {
    public boolean equals;
    public isHasFace isInside;

    public setAmplitudeRatio() {
    }

    public setAmplitudeRatio(int i, isHasFace ishasface) {
        super(i);
        if (ishasface != null) {
            this.isInside = ishasface;
            ishasface.getMax(this);
            return;
        }
        throw new IllegalArgumentException("arg cannot be null");
    }

    public final boolean Grayscale$Algorithm() {
        return this.equals;
    }
}
