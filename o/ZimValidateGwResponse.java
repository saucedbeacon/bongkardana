package o;

import o.SecureQwertyKeyboard;
import org.mozilla.javascript.ScriptableObject;

public abstract class ZimValidateGwResponse {
    private static final Object XML_LIB_KEY = new Object();

    public abstract String escapeAttributeValue(Object obj);

    public abstract String escapeTextValue(Object obj);

    public abstract boolean isXMLName(SecureQwertyKeyboard.AnonymousClass1 r1, Object obj);

    public abstract printException nameRef(SecureQwertyKeyboard.AnonymousClass1 r1, Object obj, Object obj2, LogUtils logUtils, int i);

    public abstract printException nameRef(SecureQwertyKeyboard.AnonymousClass1 r1, Object obj, LogUtils logUtils, int i);

    public abstract Object toDefaultXmlNamespace(SecureQwertyKeyboard.AnonymousClass1 r1, Object obj);

    public static ZimValidateGwResponse extractFromScopeOrNull(LogUtils logUtils) {
        ScriptableObject min = LogItem.setMin(logUtils);
        if (min == null) {
            return null;
        }
        ScriptableObject.getProperty((LogUtils) min, "XML");
        return (ZimValidateGwResponse) min.getAssociatedValue(XML_LIB_KEY);
    }

    public static ZimValidateGwResponse extractFromScope(LogUtils logUtils) {
        ZimValidateGwResponse extractFromScopeOrNull = extractFromScopeOrNull(logUtils);
        if (extractFromScopeOrNull != null) {
            return extractFromScopeOrNull;
        }
        throw SecureQwertyKeyboard.AnonymousClass1.getMax(LogItem.getMax("msg.XML.not.available"));
    }

    public final ZimValidateGwResponse bindToScope(LogUtils logUtils) {
        ScriptableObject min = LogItem.setMin(logUtils);
        if (min != null) {
            return (ZimValidateGwResponse) min.associateValue(XML_LIB_KEY, this);
        }
        throw new IllegalStateException();
    }

    public void setIgnoreComments(boolean z) {
        throw new UnsupportedOperationException();
    }

    public void setIgnoreWhitespace(boolean z) {
        throw new UnsupportedOperationException();
    }

    public void setIgnoreProcessingInstructions(boolean z) {
        throw new UnsupportedOperationException();
    }

    public void setPrettyPrinting(boolean z) {
        throw new UnsupportedOperationException();
    }

    public void setPrettyIndent(int i) {
        throw new UnsupportedOperationException();
    }

    public boolean isIgnoreComments() {
        throw new UnsupportedOperationException();
    }

    public boolean isIgnoreProcessingInstructions() {
        throw new UnsupportedOperationException();
    }

    public boolean isIgnoreWhitespace() {
        throw new UnsupportedOperationException();
    }

    public boolean isPrettyPrinting() {
        throw new UnsupportedOperationException();
    }

    public int getPrettyIndent() {
        throw new UnsupportedOperationException();
    }
}
