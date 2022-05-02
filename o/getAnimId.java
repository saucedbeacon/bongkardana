package o;

import java.lang.reflect.Method;
import o.SecureQwertyKeyboard;
import o.SecureTextView;
import org.mozilla.javascript.ScriptableObject;

public final class getAnimId {
    private final Object getMin;

    static Object setMin(SecureQwertyKeyboard.AnonymousClass1 r7, Class<?> cls, ScriptableObject scriptableObject) {
        getAnimId getanimid;
        if (cls.isInterface()) {
            LogUtils min = LogItem.setMin(r7);
            SecureQwertyKeyboard secureQwertyKeyboard = SecureQwertyKeyboard.get(min);
            getAnimId getanimid2 = (getAnimId) secureQwertyKeyboard.getInterfaceAdapter(cls);
            SecureTextView.SendAccessiBilityEventListener sendAccessiBilityEventListener = r7.getMax;
            if (getanimid2 == null) {
                Method[] methods = cls.getMethods();
                if (scriptableObject instanceof announceSwitchKeyboard) {
                    int length = methods.length;
                    if (length != 0) {
                        int i = 1;
                        if (length > 1) {
                            String name = methods[0].getName();
                            while (i < length) {
                                if (name.equals(methods[i].getName())) {
                                    i++;
                                } else {
                                    throw SecureQwertyKeyboard.AnonymousClass1.getMax("msg.no.function.interface.conversion", (Object) cls.getName());
                                }
                            }
                        }
                    } else {
                        throw SecureQwertyKeyboard.AnonymousClass1.getMax("msg.no.empty.interface.conversion", (Object) cls.getName());
                    }
                }
                getAnimId getanimid3 = new getAnimId(cls);
                secureQwertyKeyboard.cacheInterfaceAdapter(cls, getanimid3);
                getanimid = getanimid3;
            } else {
                getanimid = getanimid2;
            }
            return INotProguard.setMin.getMin(getanimid.getMin, sendAccessiBilityEventListener, getanimid, scriptableObject, min);
        }
        throw new IllegalArgumentException();
    }

    private getAnimId(Class<?> cls) {
        this.getMin = INotProguard.setMin.length(new Class[]{cls});
    }
}
