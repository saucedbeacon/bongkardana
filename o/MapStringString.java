package o;

import java.io.Serializable;

class MapStringString implements Serializable {
    static final long serialVersionUID = -6144956577595844213L;
    int anchorCh = -1;
    int classCount;
    BisFaceImage[] classList;
    int flags;
    int parenCount;
    byte[] program;
    final char[] source;

    MapStringString(String str) {
        this.source = str.toCharArray();
    }
}
