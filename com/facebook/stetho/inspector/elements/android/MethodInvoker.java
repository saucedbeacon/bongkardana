package com.facebook.stetho.inspector.elements.android;

import com.facebook.stetho.common.LogUtil;
import com.facebook.stetho.common.Util;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public class MethodInvoker {
    private static final List<TypedMethodInvoker<?>> invokers = Arrays.asList(new TypedMethodInvoker[]{new StringMethodInvoker(), new CharSequenceMethodInvoker(), new IntegerMethodInvoker(), new FloatMethodInvoker(), new BooleanMethodInvoker()});

    public void invoke(Object obj, String str, String str2) {
        Util.throwIfNull(obj, str, str2);
        int size = invokers.size();
        int i = 0;
        while (i < size) {
            if (!invokers.get(i).invoke(obj, str, str2)) {
                i++;
            } else {
                return;
            }
        }
        StringBuilder sb = new StringBuilder("Method with name ");
        sb.append(str);
        sb.append(" not found for any of the MethodInvoker supported argument types.");
        LogUtil.w(sb.toString());
    }

    static abstract class TypedMethodInvoker<T> {
        private final Class<T> mArgType;

        /* access modifiers changed from: package-private */
        public abstract T convertArgument(String str);

        TypedMethodInvoker(Class<T> cls) {
            this.mArgType = cls;
        }

        /* access modifiers changed from: package-private */
        public boolean invoke(Object obj, String str, String str2) {
            int length = str != null ? str.length() : 0;
            int max = dispatchOnCancelled.setMax(length);
            if (length != max) {
                onCanceled oncanceled = new onCanceled(length, max, 1);
                onCancelLoad.setMax(-243087667, oncanceled);
                onCancelLoad.getMin(-243087667, oncanceled);
            }
            try {
                obj.getClass().getMethod(str, new Class[]{this.mArgType}).invoke(obj, new Object[]{convertArgument(str2)});
                return true;
            } catch (NoSuchMethodException unused) {
                return false;
            } catch (InvocationTargetException e) {
                StringBuilder sb = new StringBuilder("InvocationTargetException: ");
                sb.append(e.getMessage());
                LogUtil.w(sb.toString());
                return false;
            } catch (IllegalAccessException e2) {
                StringBuilder sb2 = new StringBuilder("IllegalAccessException: ");
                sb2.append(e2.getMessage());
                LogUtil.w(sb2.toString());
                return false;
            } catch (IllegalArgumentException e3) {
                StringBuilder sb3 = new StringBuilder("IllegalArgumentException: ");
                sb3.append(e3.getMessage());
                LogUtil.w(sb3.toString());
                return false;
            }
        }
    }

    static class StringMethodInvoker extends TypedMethodInvoker<String> {
        /* access modifiers changed from: package-private */
        public String convertArgument(String str) {
            return str;
        }

        StringMethodInvoker() {
            super(String.class);
        }
    }

    static class CharSequenceMethodInvoker extends TypedMethodInvoker<CharSequence> {
        /* access modifiers changed from: package-private */
        public CharSequence convertArgument(String str) {
            return str;
        }

        CharSequenceMethodInvoker() {
            super(CharSequence.class);
        }
    }

    static class IntegerMethodInvoker extends TypedMethodInvoker<Integer> {
        IntegerMethodInvoker() {
            super(Integer.TYPE);
        }

        /* access modifiers changed from: package-private */
        public Integer convertArgument(String str) {
            return Integer.valueOf(Integer.parseInt(str));
        }
    }

    static class FloatMethodInvoker extends TypedMethodInvoker<Float> {
        FloatMethodInvoker() {
            super(Float.TYPE);
        }

        /* access modifiers changed from: package-private */
        public Float convertArgument(String str) {
            return Float.valueOf(Float.parseFloat(str));
        }
    }

    static class BooleanMethodInvoker extends TypedMethodInvoker<Boolean> {
        BooleanMethodInvoker() {
            super(Boolean.TYPE);
        }

        /* access modifiers changed from: package-private */
        public Boolean convertArgument(String str) {
            return Boolean.valueOf(Boolean.parseBoolean(str));
        }
    }
}
