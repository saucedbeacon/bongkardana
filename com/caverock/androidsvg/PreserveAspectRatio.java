package com.caverock.androidsvg;

public class PreserveAspectRatio {
    public static final PreserveAspectRatio BOTTOM = new PreserveAspectRatio(Alignment.XMidYMax, Scale.Meet);
    public static final PreserveAspectRatio END = new PreserveAspectRatio(Alignment.XMaxYMax, Scale.Meet);
    public static final PreserveAspectRatio FULLSCREEN = new PreserveAspectRatio(Alignment.XMidYMid, Scale.Slice);
    public static final PreserveAspectRatio FULLSCREEN_START = new PreserveAspectRatio(Alignment.XMinYMin, Scale.Slice);
    public static final PreserveAspectRatio LETTERBOX = new PreserveAspectRatio(Alignment.XMidYMid, Scale.Meet);
    public static final PreserveAspectRatio START = new PreserveAspectRatio(Alignment.XMinYMin, Scale.Meet);
    public static final PreserveAspectRatio STRETCH = new PreserveAspectRatio(Alignment.None, (Scale) null);
    public static final PreserveAspectRatio TOP = new PreserveAspectRatio(Alignment.XMidYMin, Scale.Meet);
    public static final PreserveAspectRatio UNSCALED = new PreserveAspectRatio((Alignment) null, (Scale) null);
    private Alignment alignment;
    private Scale scale;

    public enum Alignment {
        None,
        XMinYMin,
        XMidYMin,
        XMaxYMin,
        XMinYMid,
        XMidYMid,
        XMaxYMid,
        XMinYMax,
        XMidYMax,
        XMaxYMax
    }

    public enum Scale {
        Meet,
        Slice
    }

    public PreserveAspectRatio(Alignment alignment2, Scale scale2) {
        this.alignment = alignment2;
        this.scale = scale2;
    }

    public Alignment getAlignment() {
        return this.alignment;
    }

    public Scale getScale() {
        return this.scale;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PreserveAspectRatio preserveAspectRatio = (PreserveAspectRatio) obj;
        return this.alignment == preserveAspectRatio.alignment && this.scale == preserveAspectRatio.scale;
    }
}
