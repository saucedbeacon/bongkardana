package o;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import o.SecureQwertyKeyboard;
import org.mozilla.javascript.ContinuationPending;

public final class getStyleableIds implements Serializable {
    private static final Class<?>[] primitives = {Boolean.TYPE, Byte.TYPE, Character.TYPE, Double.TYPE, Float.TYPE, Integer.TYPE, Long.TYPE, Short.TYPE, Void.TYPE};
    static final long serialVersionUID = 6358550398665688245L;
    public transient Class<?>[] argTypes;
    public transient Object delegateTo;
    private transient Member memberObject;
    transient boolean vararg;

    public getStyleableIds(Method method) {
        init(method);
    }

    getStyleableIds(Constructor<?> constructor) {
        init(constructor);
    }

    private void init(Method method) {
        this.memberObject = method;
        this.argTypes = method.getParameterTypes();
        this.vararg = method.isVarArgs();
    }

    private void init(Constructor<?> constructor) {
        this.memberObject = constructor;
        this.argTypes = constructor.getParameterTypes();
        this.vararg = constructor.isVarArgs();
    }

    /* access modifiers changed from: package-private */
    public final Method method() {
        return (Method) this.memberObject;
    }

    /* access modifiers changed from: package-private */
    public final Constructor<?> ctor() {
        return (Constructor) this.memberObject;
    }

    public final Member member() {
        return this.memberObject;
    }

    /* access modifiers changed from: package-private */
    public final boolean isMethod() {
        return this.memberObject instanceof Method;
    }

    /* access modifiers changed from: package-private */
    public final boolean isCtor() {
        return this.memberObject instanceof Constructor;
    }

    /* access modifiers changed from: package-private */
    public final boolean isStatic() {
        return Modifier.isStatic(this.memberObject.getModifiers());
    }

    /* access modifiers changed from: package-private */
    public final String getName() {
        return this.memberObject.getName();
    }

    /* access modifiers changed from: package-private */
    public final Class<?> getDeclaringClass() {
        return this.memberObject.getDeclaringClass();
    }

    /* access modifiers changed from: package-private */
    public final String toJavaDeclaration() {
        StringBuilder sb = new StringBuilder();
        if (isMethod()) {
            Method method = method();
            sb.append(method.getReturnType());
            sb.append(' ');
            sb.append(method.getName());
        } else {
            String name = ctor().getDeclaringClass().getName();
            int lastIndexOf = name.lastIndexOf(46);
            if (lastIndexOf >= 0) {
                name = name.substring(lastIndexOf + 1);
            }
            sb.append(name);
        }
        sb.append(getDrawableId.getMin(this.argTypes));
        return sb.toString();
    }

    public final String toString() {
        return this.memberObject.toString();
    }

    public final Object invoke(Object obj, Object[] objArr) {
        Method method = method();
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            Method searchAccessibleMethod = searchAccessibleMethod(method, this.argTypes);
            if (searchAccessibleMethod != null) {
                this.memberObject = searchAccessibleMethod;
                method = searchAccessibleMethod;
            } else if (!INotProguard.setMin.getMax(method)) {
                throw SecureQwertyKeyboard.AnonymousClass1.getMax((Throwable) e);
            }
            return method.invoke(obj, objArr);
        } catch (InvocationTargetException e2) {
            e = e2;
            do {
                e = ((InvocationTargetException) e).getTargetException();
            } while (e instanceof InvocationTargetException);
            if (e instanceof ContinuationPending) {
                throw ((ContinuationPending) e);
            }
            throw SecureQwertyKeyboard.AnonymousClass1.getMax(e);
        } catch (Exception e3) {
            throw SecureQwertyKeyboard.AnonymousClass1.getMax((Throwable) e3);
        }
    }

    /* access modifiers changed from: package-private */
    public final Object newInstance(Object[] objArr) {
        Constructor<?> ctor = ctor();
        try {
            return ctor.newInstance(objArr);
        } catch (IllegalAccessException e) {
            if (INotProguard.setMin.getMax(ctor)) {
                return ctor.newInstance(objArr);
            }
            throw SecureQwertyKeyboard.AnonymousClass1.getMax((Throwable) e);
        } catch (Exception e2) {
            throw SecureQwertyKeyboard.AnonymousClass1.getMax((Throwable) e2);
        }
    }

    private static Method searchAccessibleMethod(Method method, Class<?>[] clsArr) {
        int modifiers = method.getModifiers();
        if (!Modifier.isPublic(modifiers) || Modifier.isStatic(modifiers)) {
            return null;
        }
        Class declaringClass = method.getDeclaringClass();
        if (Modifier.isPublic(declaringClass.getModifiers())) {
            return null;
        }
        String name = method.getName();
        Class[] interfaces = declaringClass.getInterfaces();
        int i = 0;
        int length = interfaces.length;
        while (i != length) {
            Class cls = interfaces[i];
            if (Modifier.isPublic(cls.getModifiers())) {
                try {
                    return cls.getMethod(name, clsArr);
                } catch (NoSuchMethodException | SecurityException unused) {
                }
            } else {
                i++;
            }
        }
        while (true) {
            declaringClass = declaringClass.getSuperclass();
            if (declaringClass == null) {
                return null;
            }
            if (Modifier.isPublic(declaringClass.getModifiers())) {
                try {
                    Method method2 = declaringClass.getMethod(name, clsArr);
                    int modifiers2 = method2.getModifiers();
                    if (Modifier.isPublic(modifiers2) && !Modifier.isStatic(modifiers2)) {
                        return method2;
                    }
                } catch (NoSuchMethodException | SecurityException unused2) {
                    continue;
                }
            }
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        Member readMember = readMember(objectInputStream);
        if (readMember instanceof Method) {
            init((Method) readMember);
        } else {
            init((Constructor<?>) (Constructor) readMember);
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        writeMember(objectOutputStream, this.memberObject);
    }

    private static void writeMember(ObjectOutputStream objectOutputStream, Member member) throws IOException {
        if (member == null) {
            objectOutputStream.writeBoolean(false);
            return;
        }
        objectOutputStream.writeBoolean(true);
        boolean z = member instanceof Method;
        if (z || (member instanceof Constructor)) {
            objectOutputStream.writeBoolean(z);
            objectOutputStream.writeObject(member.getName());
            objectOutputStream.writeObject(member.getDeclaringClass());
            if (z) {
                writeParameters(objectOutputStream, ((Method) member).getParameterTypes());
            } else {
                writeParameters(objectOutputStream, ((Constructor) member).getParameterTypes());
            }
        } else {
            throw new IllegalArgumentException("not Method or Constructor");
        }
    }

    private static Member readMember(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        if (!objectInputStream.readBoolean()) {
            return null;
        }
        boolean readBoolean = objectInputStream.readBoolean();
        String str = (String) objectInputStream.readObject();
        Class cls = (Class) objectInputStream.readObject();
        Class[] readParameters = readParameters(objectInputStream);
        if (!readBoolean) {
            return cls.getConstructor(readParameters);
        }
        try {
            return cls.getMethod(str, readParameters);
        } catch (NoSuchMethodException e) {
            throw new IOException("Cannot find member: ".concat(String.valueOf(e)));
        }
    }

    private static void writeParameters(ObjectOutputStream objectOutputStream, Class<?>[] clsArr) throws IOException {
        objectOutputStream.writeShort(clsArr.length);
        for (Class<?> cls : clsArr) {
            boolean isPrimitive = cls.isPrimitive();
            objectOutputStream.writeBoolean(isPrimitive);
            if (!isPrimitive) {
                objectOutputStream.writeObject(cls);
            } else {
                int i = 0;
                while (true) {
                    Class<?>[] clsArr2 = primitives;
                    if (i >= clsArr2.length) {
                        StringBuilder sb = new StringBuilder("Primitive ");
                        sb.append(cls);
                        sb.append(" not found");
                        throw new IllegalArgumentException(sb.toString());
                    } else if (cls.equals(clsArr2[i])) {
                        objectOutputStream.writeByte(i);
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
    }

    private static Class<?>[] readParameters(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        int readShort = objectInputStream.readShort();
        Class<?>[] clsArr = new Class[readShort];
        for (int i = 0; i < readShort; i++) {
            if (!objectInputStream.readBoolean()) {
                clsArr[i] = (Class) objectInputStream.readObject();
            } else {
                clsArr[i] = primitives[objectInputStream.readByte()];
            }
        }
        return clsArr;
    }
}
