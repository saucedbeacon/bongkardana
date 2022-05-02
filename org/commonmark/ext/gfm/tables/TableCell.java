package org.commonmark.ext.gfm.tables;

import o.encodeBytes;

public final class TableCell extends encodeBytes {
    public Alignment getMin;
    public boolean setMax;

    public enum Alignment {
        LEFT,
        CENTER,
        RIGHT
    }

    public final boolean setMax() {
        return this.setMax;
    }
}
