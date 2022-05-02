package o;

public final class createShader extends setWaveLengthRatio {
    public String toIntRange;

    public createShader() {
    }

    public createShader(int i, String str) {
        super(i);
        if (str != null) {
            this.toIntRange = str;
            equals(str.length());
            return;
        }
        throw new IllegalArgumentException("arg cannot be null");
    }
}
