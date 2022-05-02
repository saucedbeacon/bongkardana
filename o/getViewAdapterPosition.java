package o;

import com.zoloz.wire.Message;
import java.util.List;
import o.RecyclerView;
import o.getAbsoluteAdapterPosition;

public final class getViewAdapterPosition<T extends getAbsoluteAdapterPosition<?>, E> implements Comparable<getViewAdapterPosition<?, ?>> {
    private final Message.Datatype datatype;
    private final Class<? extends RecyclerView.SavedState> enumType;
    private final Class<T> extendedType;
    private final Message.Label label;
    private final Class<? extends Message> messageType;
    private final String name;
    private final int tag;

    public static final class getMax<T extends getAbsoluteAdapterPosition<?>, E> {
        private final Message.Datatype datatype;
        private final Class<? extends RecyclerView.SavedState> enumType;
        private final Class<T> extendedType;
        private Message.Label label;
        private final Class<? extends Message> messageType;
        private String name;
        private int tag;

        private getMax(Class<T> cls, Message.Datatype datatype2) {
            this.name = null;
            this.tag = -1;
            this.label = null;
            this.extendedType = cls;
            this.messageType = null;
            this.enumType = null;
            this.datatype = datatype2;
        }

        private getMax(Class<T> cls, Class<? extends Message> cls2, Class<? extends RecyclerView.SavedState> cls3, Message.Datatype datatype2) {
            this.name = null;
            this.tag = -1;
            this.label = null;
            this.extendedType = cls;
            this.messageType = cls2;
            this.enumType = cls3;
            this.datatype = datatype2;
        }

        public final getMax<T, E> setName(String str) {
            this.name = str;
            return this;
        }

        public final getMax<T, E> setTag(int i) {
            this.tag = i;
            return this;
        }

        public final getViewAdapterPosition<T, E> buildOptional() {
            this.label = Message.Label.OPTIONAL;
            validate();
            return new getViewAdapterPosition(this.extendedType, this.messageType, this.enumType, this.name, this.tag, this.label, this.datatype);
        }

        public final getViewAdapterPosition<T, E> buildRequired() {
            this.label = Message.Label.REQUIRED;
            validate();
            return new getViewAdapterPosition(this.extendedType, this.messageType, this.enumType, this.name, this.tag, this.label, this.datatype);
        }

        public final getViewAdapterPosition<T, List<E>> buildRepeated() {
            this.label = Message.Label.REPEATED;
            validate();
            return new getViewAdapterPosition(this.extendedType, this.messageType, this.enumType, this.name, this.tag, this.label, this.datatype);
        }

        public final getViewAdapterPosition<T, List<E>> buildPacked() {
            this.label = Message.Label.PACKED;
            validate();
            return new getViewAdapterPosition(this.extendedType, this.messageType, this.enumType, this.name, this.tag, this.label, this.datatype);
        }

        private void validate() {
            if (this.extendedType == null) {
                throw new IllegalArgumentException("extendedType == null");
            } else if (this.name != null) {
                Message.Datatype datatype2 = this.datatype;
                if (datatype2 == null) {
                    throw new IllegalArgumentException("datatype == null");
                } else if (this.label == null) {
                    throw new IllegalArgumentException("label == null");
                } else if (this.tag <= 0) {
                    StringBuilder sb = new StringBuilder("tag == ");
                    sb.append(this.tag);
                    throw new IllegalArgumentException(sb.toString());
                } else if (datatype2 == Message.Datatype.MESSAGE) {
                    if (this.messageType == null || this.enumType != null) {
                        throw new IllegalStateException("Message w/o messageType or w/ enumType");
                    }
                } else if (this.datatype == Message.Datatype.ENUM) {
                    if (this.messageType != null || this.enumType == null) {
                        throw new IllegalStateException("Enum w/ messageType or w/o enumType");
                    }
                } else if (this.messageType != null || this.enumType != null) {
                    throw new IllegalStateException("Scalar w/ messageType or enumType");
                }
            } else {
                throw new IllegalArgumentException("name == null");
            }
        }
    }

    public static <T extends getAbsoluteAdapterPosition<?>> getMax<T, Integer> int32Extending(Class<T> cls) {
        return new getMax<>(cls, Message.Datatype.INT32);
    }

    public static <T extends getAbsoluteAdapterPosition<?>> getMax<T, Integer> sint32Extending(Class<T> cls) {
        return new getMax<>(cls, Message.Datatype.SINT32);
    }

    public static <T extends getAbsoluteAdapterPosition<?>> getMax<T, Integer> uint32Extending(Class<T> cls) {
        return new getMax<>(cls, Message.Datatype.UINT32);
    }

    public static <T extends getAbsoluteAdapterPosition<?>> getMax<T, Integer> fixed32Extending(Class<T> cls) {
        return new getMax<>(cls, Message.Datatype.FIXED32);
    }

    public static <T extends getAbsoluteAdapterPosition<?>> getMax<T, Integer> sfixed32Extending(Class<T> cls) {
        return new getMax<>(cls, Message.Datatype.SFIXED32);
    }

    public static <T extends getAbsoluteAdapterPosition<?>> getMax<T, Long> int64Extending(Class<T> cls) {
        return new getMax<>(cls, Message.Datatype.INT64);
    }

    public static <T extends getAbsoluteAdapterPosition<?>> getMax<T, Long> sint64Extending(Class<T> cls) {
        return new getMax<>(cls, Message.Datatype.SINT64);
    }

    public static <T extends getAbsoluteAdapterPosition<?>> getMax<T, Long> uint64Extending(Class<T> cls) {
        return new getMax<>(cls, Message.Datatype.UINT64);
    }

    public static <T extends getAbsoluteAdapterPosition<?>> getMax<T, Long> fixed64Extending(Class<T> cls) {
        return new getMax<>(cls, Message.Datatype.FIXED64);
    }

    public static <T extends getAbsoluteAdapterPosition<?>> getMax<T, Long> sfixed64Extending(Class<T> cls) {
        return new getMax<>(cls, Message.Datatype.SFIXED64);
    }

    public static <T extends getAbsoluteAdapterPosition<?>> getMax<T, Boolean> boolExtending(Class<T> cls) {
        return new getMax<>(cls, Message.Datatype.BOOL);
    }

    public static <T extends getAbsoluteAdapterPosition<?>> getMax<T, String> stringExtending(Class<T> cls) {
        return new getMax<>(cls, Message.Datatype.STRING);
    }

    public static <T extends getAbsoluteAdapterPosition<?>> getMax<T, printConnMonitorLog> bytesExtending(Class<T> cls) {
        return new getMax<>(cls, Message.Datatype.BYTES);
    }

    public static <T extends getAbsoluteAdapterPosition<?>> getMax<T, Float> floatExtending(Class<T> cls) {
        return new getMax<>(cls, Message.Datatype.FLOAT);
    }

    public static <T extends getAbsoluteAdapterPosition<?>> getMax<T, Double> doubleExtending(Class<T> cls) {
        return new getMax<>(cls, Message.Datatype.DOUBLE);
    }

    public static <T extends getAbsoluteAdapterPosition<?>, E extends Enum & RecyclerView.SavedState> getMax<T, E> enumExtending(Class<E> cls, Class<T> cls2) {
        return new getMax(cls2, (Class) null, cls, Message.Datatype.ENUM);
    }

    public static <T extends getAbsoluteAdapterPosition<?>, M extends Message> getMax<T, M> messageExtending(Class<M> cls, Class<T> cls2) {
        return new getMax(cls2, cls, (Class) null, Message.Datatype.MESSAGE);
    }

    private getViewAdapterPosition(Class<T> cls, Class<? extends Message> cls2, Class<? extends RecyclerView.SavedState> cls3, String str, int i, Message.Label label2, Message.Datatype datatype2) {
        this.extendedType = cls;
        this.name = str;
        this.tag = i;
        this.datatype = datatype2;
        this.label = label2;
        this.messageType = cls2;
        this.enumType = cls3;
    }

    public final int compareTo(getViewAdapterPosition<?, ?> getviewadapterposition) {
        int value;
        int value2;
        if (getviewadapterposition == this) {
            return 0;
        }
        int i = this.tag;
        int i2 = getviewadapterposition.tag;
        if (i != i2) {
            return i - i2;
        }
        Message.Datatype datatype2 = this.datatype;
        if (datatype2 != getviewadapterposition.datatype) {
            value = datatype2.value();
            value2 = getviewadapterposition.datatype.value();
        } else {
            Message.Label label2 = this.label;
            if (label2 != getviewadapterposition.label) {
                value = label2.value();
                value2 = getviewadapterposition.label.value();
            } else {
                Class<T> cls = this.extendedType;
                if (cls != null && !cls.equals(getviewadapterposition.extendedType)) {
                    return this.extendedType.getName().compareTo(getviewadapterposition.extendedType.getName());
                }
                Class<? extends Message> cls2 = this.messageType;
                if (cls2 != null && !cls2.equals(getviewadapterposition.messageType)) {
                    return this.messageType.getName().compareTo(getviewadapterposition.messageType.getName());
                }
                Class<? extends RecyclerView.SavedState> cls3 = this.enumType;
                if (cls3 == null || cls3.equals(getviewadapterposition.enumType)) {
                    return 0;
                }
                return this.enumType.getName().compareTo(getviewadapterposition.enumType.getName());
            }
        }
        return value - value2;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof getViewAdapterPosition) && compareTo((getViewAdapterPosition<?, ?>) (getViewAdapterPosition) obj) == 0;
    }

    public final int hashCode() {
        int value = ((((((this.tag * 37) + this.datatype.value()) * 37) + this.label.value()) * 37) + this.extendedType.hashCode()) * 37;
        Class<? extends Message> cls = this.messageType;
        int i = 0;
        int hashCode = (value + (cls != null ? cls.hashCode() : 0)) * 37;
        Class<? extends RecyclerView.SavedState> cls2 = this.enumType;
        if (cls2 != null) {
            i = cls2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return String.format("[%s %s %s = %d]", new Object[]{this.label, this.datatype, this.name, Integer.valueOf(this.tag)});
    }

    public final Class<T> getExtendedType() {
        return this.extendedType;
    }

    public final Class<? extends Message> getMessageType() {
        return this.messageType;
    }

    public final Class<? extends RecyclerView.SavedState> getEnumType() {
        return this.enumType;
    }

    public final String getName() {
        return this.name;
    }

    public final int getTag() {
        return this.tag;
    }

    public final Message.Datatype getDatatype() {
        return this.datatype;
    }

    public final Message.Label getLabel() {
        return this.label;
    }
}
