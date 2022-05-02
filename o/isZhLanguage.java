package o;

import id.dana.lib.gcontainer.app.bridge.contact.ContactEventType;
import o.SecureQwertyKeyboard;

public final class isZhLanguage extends onInit {
    static final long serialVersionUID = -7377989503697220633L;
    private final LogUtils boundThis;
    private final announceSwitchKeyboard targetFunction;

    public isZhLanguage(SecureQwertyKeyboard.AnonymousClass1 r1, LogUtils logUtils, announceSwitchKeyboard announceswitchkeyboard, LogUtils logUtils2) {
        this.targetFunction = announceswitchkeyboard;
        this.boundThis = logUtils2;
        LogItem.getMax((onInit) this, logUtils);
        onInit min = LogItem.setMin();
        setmSubmitInterface setmsubmitinterface = new setmSubmitInterface();
        setmsubmitinterface.put(ContactEventType.CONTACT_GET, (LogUtils) setmsubmitinterface, (Object) min);
        setmsubmitinterface.put("set", (LogUtils) setmsubmitinterface, (Object) min);
        setmsubmitinterface.put("enumerable", (LogUtils) setmsubmitinterface, (Object) Boolean.FALSE);
        setmsubmitinterface.put("configurable", (LogUtils) setmsubmitinterface, (Object) Boolean.FALSE);
        setmsubmitinterface.preventExtensions();
        defineOwnProperty(r1, "caller", setmsubmitinterface, false);
        defineOwnProperty(r1, "arguments", setmsubmitinterface, false);
    }

    public final Object call(SecureQwertyKeyboard.AnonymousClass1 r2, LogUtils logUtils, LogUtils logUtils2, Object[] objArr) {
        LogUtils logUtils3 = this.boundThis;
        if (logUtils3 == null) {
            logUtils3 = LogItem.setMin(r2);
        }
        return this.targetFunction.call(r2, logUtils, logUtils3, objArr);
    }

    public final LogUtils construct(SecureQwertyKeyboard.AnonymousClass1 r1, LogUtils logUtils, Object[] objArr) {
        throw LogItem.length("msg.not.ctor", (Object) decompile(0, 0));
    }

    public final boolean hasInstance(LogUtils logUtils) {
        announceSwitchKeyboard announceswitchkeyboard = this.targetFunction;
        if (announceswitchkeyboard instanceof doCheck) {
            return ((doCheck) announceswitchkeyboard).hasInstance(logUtils);
        }
        throw LogItem.toFloatRange("msg.not.ctor");
    }

    public final int getLength() {
        announceSwitchKeyboard announceswitchkeyboard = this.targetFunction;
        if (announceswitchkeyboard instanceof onInit) {
            return ((onInit) announceswitchkeyboard).getLength();
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    public final String decompile(int i, int i2) {
        announceSwitchKeyboard announceswitchkeyboard = this.targetFunction;
        if (announceswitchkeyboard instanceof onInit) {
            return ((onInit) announceswitchkeyboard).decompile(i, i2);
        }
        return super.decompile(i, i2);
    }
}
