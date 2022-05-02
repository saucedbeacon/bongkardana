package o;

import com.zoloz.wire.Message;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import o.RecyclerView;

public final class isRunning {
    private final Map<Class<? extends Message>, RecyclerView.LayoutParams<? extends Message>> availabilityCheckers;
    private final Map<Class<? extends Message.setMax>, isItemChanged<? extends Message.setMax>> builderAdapters;
    private final Map<Class<? extends RecyclerView.SavedState>, getViewLayoutPosition<? extends RecyclerView.SavedState>> enumAdapters;
    private final Map<Class<? extends Message>, start<? extends Message>> messageAdapters;
    final getBindingAdapterPosition registry;

    public static <T> T get(T t, T t2) {
        return t != null ? t : t2;
    }

    public isRunning(Class<?>... clsArr) {
        this((List<Class<?>>) Arrays.asList(clsArr));
    }

    public isRunning(List<Class<?>> list) {
        this.messageAdapters = new LinkedHashMap();
        this.builderAdapters = new LinkedHashMap();
        this.enumAdapters = new LinkedHashMap();
        this.availabilityCheckers = new LinkedHashMap();
        this.registry = new getBindingAdapterPosition();
        for (Class<?> declaredFields : list) {
            for (Field field : declaredFields.getDeclaredFields()) {
                if (field.getType().equals(getViewAdapterPosition.class)) {
                    try {
                        this.registry.add((getViewAdapterPosition) field.get((Object) null));
                    } catch (IllegalAccessException e) {
                        throw new AssertionError(e);
                    }
                }
            }
        }
    }

    public final synchronized <M extends Message> start<M> messageAdapter(Class<M> cls) {
        start<M> start;
        start = this.messageAdapters.get(cls);
        if (start == null) {
            start = new start<>(this, cls);
            this.messageAdapters.put(cls, start);
        }
        return start;
    }

    public final synchronized <B extends Message.setMax> isItemChanged<B> builderAdapter(Class<B> cls) {
        isItemChanged<B> isitemchanged;
        isitemchanged = this.builderAdapters.get(cls);
        if (isitemchanged == null) {
            isitemchanged = new isItemChanged<>(cls);
            this.builderAdapters.put(cls, isitemchanged);
        }
        return isitemchanged;
    }

    public final synchronized <T extends Message> RecyclerView.LayoutParams<T> availabilityChecker(Class<T> cls) {
        RecyclerView.LayoutParams<T> layoutParams;
        layoutParams = this.availabilityCheckers.get(cls);
        if (layoutParams == null) {
            layoutParams = new RecyclerView.LayoutParams<>(cls);
            this.availabilityCheckers.put(cls, layoutParams);
        }
        return layoutParams;
    }

    public final synchronized <E extends RecyclerView.SavedState> getViewLayoutPosition<E> enumAdapter(Class<E> cls) {
        getViewLayoutPosition<E> getviewlayoutposition;
        getviewlayoutposition = this.enumAdapters.get(cls);
        if (getviewlayoutposition == null) {
            getviewlayoutposition = new getViewLayoutPosition<>(cls);
            this.enumAdapters.put(cls, getviewlayoutposition);
        }
        return getviewlayoutposition;
    }

    public final <M extends Message> M parseFrom(byte[] bArr, Class<M> cls) throws IOException {
        RecyclerView.Orientation.checkNotNull(bArr, "bytes");
        RecyclerView.Orientation.checkNotNull(cls, "messageClass");
        M parseFrom = parseFrom(instantScrollToPosition.newInstance(bArr), cls);
        parseFrom.checkAvailability();
        return parseFrom;
    }

    public final <M extends Message> M parseFrom(byte[] bArr, int i, int i2, Class<M> cls) throws IOException {
        RecyclerView.Orientation.checkNotNull(bArr, "bytes");
        boolean z = true;
        RecyclerView.Orientation.checkArgument(i >= 0, "offset < 0");
        RecyclerView.Orientation.checkArgument(i2 >= 0, "count < 0");
        if (i + i2 > bArr.length) {
            z = false;
        }
        RecyclerView.Orientation.checkArgument(z, "offset + count > bytes");
        RecyclerView.Orientation.checkNotNull(cls, "messageClass");
        return parseFrom(instantScrollToPosition.newInstance(bArr, i, i2), cls);
    }

    public final <M extends Message> M parseFrom(InputStream inputStream, Class<M> cls) throws IOException {
        RecyclerView.Orientation.checkNotNull(inputStream, "input");
        RecyclerView.Orientation.checkNotNull(cls, "messageClass");
        return parseFrom(instantScrollToPosition.newInstance(inputStream), cls);
    }

    public final <M extends Message> M parseFrom(recordWsHsTime recordwshstime, Class<M> cls) throws IOException {
        RecyclerView.Orientation.checkNotNull(recordwshstime, "input");
        RecyclerView.Orientation.checkNotNull(cls, "messageClass");
        return parseFrom(instantScrollToPosition.newInstance(recordwshstime), cls);
    }

    private <M extends Message> M parseFrom(instantScrollToPosition instantscrolltoposition, Class<M> cls) throws IOException {
        return messageAdapter(cls).read(instantscrolltoposition);
    }
}
