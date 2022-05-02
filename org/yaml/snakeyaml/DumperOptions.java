package org.yaml.snakeyaml;

import java.util.Map;
import java.util.TimeZone;
import kotlin.text.Typography;
import o.getAbtestInfoGetter;
import o.setDeviceIdProvider;
import org.yaml.snakeyaml.error.YAMLException;

public final class DumperOptions {
    private LineBreak FastBitmap$CoordinateSystem = LineBreak.UNIX;
    private setDeviceIdProvider Grayscale$Algorithm = new getAbtestInfoGetter();
    private boolean IsOverlapping = false;
    private Boolean Mean$Arithmetic = Boolean.FALSE;
    private boolean equals = false;
    public FlowStyle getMax = FlowStyle.AUTO;
    public int getMin = 0;
    private int hashCode = 80;
    private int invoke = 128;
    private Map<String, String> invokeSuspend = null;
    private boolean isInside = false;
    public int length = 2;
    public TimeZone setMax = null;
    public ScalarStyle setMin = ScalarStyle.PLAIN;
    private boolean toDoubleRange = false;
    public NonPrintableStyle toFloatRange = NonPrintableStyle.BINARY;
    private boolean toIntRange = true;
    private boolean toString = false;
    private Version valueOf = null;
    private boolean values = true;

    public enum NonPrintableStyle {
        BINARY,
        ESCAPE
    }

    public enum ScalarStyle {
        DOUBLE_QUOTED(Character.valueOf(Typography.quote)),
        SINGLE_QUOTED('\''),
        LITERAL('|'),
        FOLDED(Character.valueOf(Typography.greater)),
        PLAIN((String) null);
        
        private Character styleChar;

        private ScalarStyle(Character ch) {
            this.styleChar = ch;
        }

        public final Character getChar() {
            return this.styleChar;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Scalar style: '");
            sb.append(this.styleChar);
            sb.append("'");
            return sb.toString();
        }

        public static ScalarStyle createStyle(Character ch) {
            if (ch == null) {
                return PLAIN;
            }
            char charValue = ch.charValue();
            if (charValue == '\"') {
                return DOUBLE_QUOTED;
            }
            if (charValue == '\'') {
                return SINGLE_QUOTED;
            }
            if (charValue == '>') {
                return FOLDED;
            }
            if (charValue == '|') {
                return LITERAL;
            }
            throw new YAMLException("Unknown scalar style character: ".concat(String.valueOf(ch)));
        }
    }

    public enum FlowStyle {
        FLOW(Boolean.TRUE),
        BLOCK(Boolean.FALSE),
        AUTO((String) null);
        
        private Boolean styleBoolean;

        private FlowStyle(Boolean bool) {
            this.styleBoolean = bool;
        }

        @Deprecated
        public static FlowStyle fromBoolean(Boolean bool) {
            if (bool == null) {
                return AUTO;
            }
            return bool.booleanValue() ? FLOW : BLOCK;
        }

        public final Boolean getStyleBoolean() {
            return this.styleBoolean;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Flow style: '");
            sb.append(this.styleBoolean);
            sb.append("'");
            return sb.toString();
        }
    }

    public enum LineBreak {
        WIN("\r\n"),
        MAC("\r"),
        UNIX("\n");
        
        private String lineBreak;

        private LineBreak(String str) {
            this.lineBreak = str;
        }

        public final String getString() {
            return this.lineBreak;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Line break: ");
            sb.append(name());
            return sb.toString();
        }

        public static LineBreak getPlatformLineBreak() {
            String property = System.getProperty("line.separator");
            for (LineBreak lineBreak2 : values()) {
                if (lineBreak2.lineBreak.equals(property)) {
                    return lineBreak2;
                }
            }
            return UNIX;
        }
    }

    public enum Version {
        V1_0(new Integer[]{1, 0}),
        V1_1(new Integer[]{1, 1});
        
        private Integer[] version;

        private Version(Integer[] numArr) {
            this.version = numArr;
        }

        public final int major() {
            return this.version[0].intValue();
        }

        public final int minor() {
            return this.version[1].intValue();
        }

        public final String getRepresentation() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.version[0]);
            sb.append(".");
            sb.append(this.version[1]);
            return sb.toString();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Version: ");
            sb.append(getRepresentation());
            return sb.toString();
        }
    }

    public final boolean setMax() {
        return this.equals;
    }

    public final boolean length() {
        return this.IsOverlapping;
    }
}
