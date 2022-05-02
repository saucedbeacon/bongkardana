package o;

import androidx.annotation.NonNull;
import com.otaliastudios.cameraview.controls.Audio;
import com.otaliastudios.cameraview.controls.Engine;
import com.otaliastudios.cameraview.controls.Facing;
import com.otaliastudios.cameraview.controls.Flash;
import com.otaliastudios.cameraview.controls.Grid;
import com.otaliastudios.cameraview.controls.Hdr;
import com.otaliastudios.cameraview.controls.Mode;
import com.otaliastudios.cameraview.controls.PictureFormat;
import com.otaliastudios.cameraview.controls.Preview;
import com.otaliastudios.cameraview.controls.VideoCodec;
import com.otaliastudios.cameraview.controls.WhiteBalance;
import com.zoloz.wire.Message;
import com.zoloz.wire.ProtoField;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public abstract class RecyclerView {
    protected float FastBitmap$CoordinateSystem;
    protected Set<predictiveItemAnimationsEnabled> IsOverlapping = new HashSet(3);
    protected float Mean$Arithmetic;
    protected Set<Integer> equals = new HashSet(2);
    protected Set<WhiteBalance> getMax = new HashSet(5);
    protected Set<Flash> getMin = new HashSet(4);
    protected boolean hashCode;
    protected float invoke;
    protected Set<shouldDeferAccessibilityEvent> isInside = new HashSet(5);
    protected Set<Hdr> length = new HashSet(2);
    protected Set<Facing> setMax = new HashSet(2);
    protected Set<shouldDeferAccessibilityEvent> setMin = new HashSet(15);
    protected boolean toDoubleRange;
    protected Set<predictiveItemAnimationsEnabled> toFloatRange = new HashSet(4);
    protected Set<PictureFormat> toIntRange = new HashSet(2);
    protected boolean toString;
    protected float values;

    public interface SavedState {
        int getValue();
    }

    final class Orientation {
        private Orientation() {
        }

        static void checkNotNull(Object obj, String str) {
            if (obj == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" == null");
                throw new NullPointerException(sb.toString());
            }
        }

        static void checkArgument(boolean z, String str) {
            if (!z) {
                throw new IllegalArgumentException(str);
            }
        }
    }

    public final class LayoutParams<M extends Message> {
        private static final Comparator<Field> ORDER_BY_FIELD_NAME = new Comparator<Field>() {
            public final int compare(Field field, Field field2) {
                return field.getName().compareTo(field2.getName());
            }
        };
        private final List<Field> collectionFields = new ArrayList();
        private final List<Field> requiredFields = new ArrayList();

        public LayoutParams(Class<M> cls) {
            for (Field field : cls.getDeclaredFields()) {
                ProtoField protoField = (ProtoField) field.getAnnotation(ProtoField.class);
                if (protoField != null) {
                    if (protoField.label() == Message.Label.REQUIRED) {
                        try {
                            this.requiredFields.add(cls.getField(field.getName()));
                        } catch (NoSuchFieldException unused) {
                            StringBuilder sb = new StringBuilder("No message field found for message field ");
                            sb.append(field.getName());
                            throw new AssertionError(sb.toString());
                        }
                    }
                    if (protoField.label() == Message.Label.REPEATED) {
                        try {
                            this.collectionFields.add(cls.getField(field.getName()));
                        } catch (NoSuchFieldException unused2) {
                            StringBuilder sb2 = new StringBuilder("No message field found for message field ");
                            sb2.append(field.getName());
                            throw new AssertionError(sb2.toString());
                        }
                    }
                }
            }
            Collections.sort(this.requiredFields, ORDER_BY_FIELD_NAME);
        }

        public final void checkRequiredFields(M m) {
            try {
                int size = this.requiredFields.size();
                StringBuilder sb = null;
                String str = "";
                for (int i = 0; i < size; i++) {
                    Field field = this.requiredFields.get(i);
                    if (field.get(m) == null) {
                        if (sb == null) {
                            sb = new StringBuilder();
                        } else {
                            str = "s";
                        }
                        sb.append("\n  ");
                        sb.append(field.getName());
                    }
                }
                if (sb != null) {
                    StringBuilder sb2 = new StringBuilder("Required field");
                    sb2.append(str);
                    sb2.append(" not set:");
                    sb2.append(sb);
                    throw new IllegalStateException(sb2.toString());
                }
            } catch (IllegalAccessException unused) {
                throw new AssertionError("Unable to access required fields");
            }
        }

        public final void checkForNulls(M m) {
            for (Field next : this.collectionFields) {
                try {
                    List list = (List) next.get(m);
                    if (list == null) {
                        next.set(m, Collections.emptyList());
                    } else if (!list.isEmpty()) {
                        int size = list.size();
                        int i = 0;
                        while (i < size) {
                            if (list.get(i) != null) {
                                i++;
                            } else {
                                throw new NullPointerException(String.format("Element at index %d of field %s is null", new Object[]{Integer.valueOf(i), next.getName()}));
                            }
                        }
                        continue;
                    } else {
                        continue;
                    }
                } catch (IllegalArgumentException unused) {
                    throw new AssertionError("Unable to access required fields");
                } catch (IllegalAccessException unused2) {
                    throw new AssertionError("Unable to access required fields");
                }
            }
        }
    }

    public final boolean setMax(@NonNull createLayoutManager createlayoutmanager) {
        Collection collection;
        Class<?> cls = createlayoutmanager.getClass();
        if (cls.equals(Audio.class)) {
            collection = Arrays.asList(Audio.values());
        } else if (cls.equals(Facing.class)) {
            collection = Collections.unmodifiableSet(this.setMax);
        } else if (cls.equals(Flash.class)) {
            collection = Collections.unmodifiableSet(this.getMin);
        } else if (cls.equals(Grid.class)) {
            collection = Arrays.asList(Grid.values());
        } else if (cls.equals(Hdr.class)) {
            collection = Collections.unmodifiableSet(this.length);
        } else if (cls.equals(Mode.class)) {
            collection = Arrays.asList(Mode.values());
        } else if (cls.equals(VideoCodec.class)) {
            collection = Arrays.asList(VideoCodec.values());
        } else if (cls.equals(WhiteBalance.class)) {
            collection = Collections.unmodifiableSet(this.getMax);
        } else if (cls.equals(Engine.class)) {
            collection = Arrays.asList(Engine.values());
        } else if (cls.equals(Preview.class)) {
            collection = Arrays.asList(Preview.values());
        } else {
            collection = cls.equals(PictureFormat.class) ? Collections.unmodifiableSet(this.toIntRange) : Collections.emptyList();
        }
        return collection.contains(createlayoutmanager);
    }

    @NonNull
    public final Collection<shouldDeferAccessibilityEvent> setMax() {
        return Collections.unmodifiableSet(this.setMin);
    }

    @NonNull
    public final Collection<shouldDeferAccessibilityEvent> length() {
        return Collections.unmodifiableSet(this.isInside);
    }

    public final boolean setMin() {
        return this.hashCode;
    }

    public final boolean getMin() {
        return this.toDoubleRange;
    }

    public final boolean getMax() {
        return this.toString;
    }

    public final float equals() {
        return this.values;
    }

    public final float isInside() {
        return this.FastBitmap$CoordinateSystem;
    }

    public final float toIntRange() {
        return this.Mean$Arithmetic;
    }

    public final float toFloatRange() {
        return this.invoke;
    }
}
