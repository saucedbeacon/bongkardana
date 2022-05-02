package o;

import com.alibaba.griver.ui.ant.utils.AUScreenAdaptTool;
import kotlin.text.Typography;

public abstract class bindKeyboard implements CountValue {
    /* access modifiers changed from: protected */
    public abstract void getMax(char c);

    public final CountValue getMin(String str) {
        setMin(str);
        return this;
    }

    public final CountValue getMin(KeyboardManager keyboardManager) {
        keyboardManager.describeTo(this);
        return this;
    }

    public final CountValue getMax(Object obj) {
        if (obj == null) {
            setMin("null");
        } else {
            int i = 0;
            if (obj instanceof String) {
                String str = (String) obj;
                getMax((char) Typography.quote);
                while (i < str.length()) {
                    getMin(str.charAt(i));
                    i++;
                }
                getMax((char) Typography.quote);
            } else if (obj instanceof Character) {
                getMax((char) Typography.quote);
                getMin(((Character) obj).charValue());
                getMax((char) Typography.quote);
            } else if (obj instanceof Short) {
                getMax((char) Typography.less);
                setMin(setMin(obj));
                setMin("s>");
            } else if (obj instanceof Long) {
                getMax((char) Typography.less);
                setMin(setMin(obj));
                setMin("L>");
            } else if (obj instanceof Float) {
                getMax((char) Typography.less);
                setMin(setMin(obj));
                setMin("F>");
            } else if (obj.getClass().isArray()) {
                getAcceptedChars getacceptedchars = new getAcceptedChars(new onTouchDown(obj));
                setMin("[");
                while (getacceptedchars.hasNext()) {
                    if (i != 0) {
                        setMin(", ");
                    }
                    ((KeyboardManager) getacceptedchars.next()).describeTo(this);
                    i = 1;
                }
                setMin("]");
            } else {
                getMax((char) Typography.less);
                setMin(setMin(obj));
                getMax((char) Typography.greater);
            }
        }
        return this;
    }

    private static String setMin(Object obj) {
        try {
            return String.valueOf(obj);
        } catch (Exception unused) {
            StringBuilder sb = new StringBuilder();
            sb.append(obj.getClass().getName());
            sb.append(AUScreenAdaptTool.PREFIX_ID);
            sb.append(Integer.toHexString(obj.hashCode()));
            return sb.toString();
        }
    }

    /* access modifiers changed from: protected */
    public void setMin(String str) {
        for (int i = 0; i < str.length(); i++) {
            getMax(str.charAt(i));
        }
    }

    private void getMin(char c) {
        if (c == 9) {
            setMin("\\t");
        } else if (c == 10) {
            setMin("\\n");
        } else if (c == 13) {
            setMin("\\r");
        } else if (c != '\"') {
            getMax(c);
        } else {
            setMin("\\\"");
        }
    }
}
