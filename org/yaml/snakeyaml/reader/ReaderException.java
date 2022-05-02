package org.yaml.snakeyaml.reader;

import org.yaml.snakeyaml.error.YAMLException;

public class ReaderException extends YAMLException {
    private static final long serialVersionUID = 8710781187529689083L;
    private final int codePoint;
    private final String name;
    private final int position;

    public ReaderException(String str, int i, int i2, String str2) {
        super(str2);
        this.name = str;
        this.codePoint = i2;
        this.position = i;
    }

    public String getName() {
        return this.name;
    }

    public int getCodePoint() {
        return this.codePoint;
    }

    public int getPosition() {
        return this.position;
    }

    public String toString() {
        String str = new String(Character.toChars(this.codePoint));
        StringBuilder sb = new StringBuilder("unacceptable code point '");
        sb.append(str);
        sb.append("' (0x");
        sb.append(Integer.toHexString(this.codePoint).toUpperCase());
        sb.append(") ");
        sb.append(getMessage());
        sb.append("\nin \"");
        sb.append(this.name);
        sb.append("\", position ");
        sb.append(this.position);
        return sb.toString();
    }
}
