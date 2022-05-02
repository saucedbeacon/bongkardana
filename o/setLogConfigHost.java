package o;

import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public abstract class setLogConfigHost extends setLogHost {
    private Class<?>[] getMax;
    private boolean length;
    private Type setMax;

    public setLogConfigHost(String str, Class<?> cls, Type type) {
        super(str, cls);
        this.setMax = type;
        this.length = type == null;
    }

    public final Class<?>[] setMin() {
        if (!this.length) {
            Type type = this.setMax;
            if (type instanceof ParameterizedType) {
                Type[] actualTypeArguments = ((ParameterizedType) type).getActualTypeArguments();
                if (actualTypeArguments.length > 0) {
                    this.getMax = new Class[actualTypeArguments.length];
                    int i = 0;
                    while (true) {
                        if (i >= actualTypeArguments.length) {
                            break;
                        }
                        if (!(actualTypeArguments[i] instanceof Class)) {
                            if (!(actualTypeArguments[i] instanceof ParameterizedType)) {
                                if (!(actualTypeArguments[i] instanceof GenericArrayType)) {
                                    this.getMax = null;
                                    break;
                                }
                                Type genericComponentType = ((GenericArrayType) actualTypeArguments[i]).getGenericComponentType();
                                if (!(genericComponentType instanceof Class)) {
                                    this.getMax = null;
                                    break;
                                }
                                this.getMax[i] = Array.newInstance((Class) genericComponentType, 0).getClass();
                            } else {
                                this.getMax[i] = (Class) ((ParameterizedType) actualTypeArguments[i]).getRawType();
                            }
                        } else {
                            this.getMax[i] = (Class) actualTypeArguments[i];
                        }
                        i++;
                    }
                }
            } else if (type instanceof GenericArrayType) {
                Type genericComponentType2 = ((GenericArrayType) type).getGenericComponentType();
                if (genericComponentType2 instanceof Class) {
                    this.getMax = new Class[]{(Class) genericComponentType2};
                }
            } else if ((type instanceof Class) && ((Class) type).isArray()) {
                Class<?>[] clsArr = new Class[1];
                this.getMax = clsArr;
                clsArr[0] = getMax().getComponentType();
            }
            this.length = true;
        }
        return this.getMax;
    }
}
