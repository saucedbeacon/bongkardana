package o;

import com.zoloz.wire.Message;
import java.util.Collections;
import java.util.List;
import o.getAbsoluteAdapterPosition;

public abstract class getAbsoluteAdapterPosition<T extends getAbsoluteAdapterPosition<?>> extends Message {
    transient getViewPosition<T> extensionMap;

    protected getAbsoluteAdapterPosition(getAbsoluteAdapterPosition<T> getabsoluteadapterposition) {
        super(getabsoluteadapterposition);
        getViewPosition<T> getviewposition;
        if (getabsoluteadapterposition != null && (getviewposition = getabsoluteadapterposition.extensionMap) != null) {
            this.extensionMap = new getViewPosition<>(getviewposition);
        }
    }

    protected getAbsoluteAdapterPosition() {
    }

    /* access modifiers changed from: protected */
    public void setBuilder(getMax<T> getmax) {
        super.setBuilder(getmax);
        if (getmax.extensionMap != null) {
            this.extensionMap = new getViewPosition<>(getmax.extensionMap);
        }
    }

    public <E> T setExtension(getViewAdapterPosition<T, E> getviewadapterposition, E e) {
        getViewPosition<T> getviewposition = this.extensionMap;
        if (getviewposition == null) {
            this.extensionMap = new getViewPosition<>(getviewadapterposition, e);
        } else {
            getviewposition.put(getviewadapterposition, e);
        }
        return this;
    }

    public List<getViewAdapterPosition<T, ?>> getExtensions() {
        getViewPosition<T> getviewposition = this.extensionMap;
        if (getviewposition == null) {
            return Collections.emptyList();
        }
        return getviewposition.getExtensions();
    }

    public <E> E getExtension(getViewAdapterPosition<T, E> getviewadapterposition) {
        getViewPosition<T> getviewposition = this.extensionMap;
        if (getviewposition == null) {
            return null;
        }
        return getviewposition.get(getviewadapterposition);
    }

    /* access modifiers changed from: protected */
    public boolean extensionsEqual(getAbsoluteAdapterPosition<T> getabsoluteadapterposition) {
        getViewPosition<T> getviewposition = this.extensionMap;
        if (getviewposition == null) {
            return getabsoluteadapterposition.extensionMap == null;
        }
        return getviewposition.equals(getabsoluteadapterposition.extensionMap);
    }

    /* access modifiers changed from: protected */
    public int extensionsHashCode() {
        getViewPosition<T> getviewposition = this.extensionMap;
        if (getviewposition == null) {
            return 0;
        }
        return getviewposition.hashCode();
    }

    /* access modifiers changed from: package-private */
    public String extensionsToString() {
        getViewPosition<T> getviewposition = this.extensionMap;
        return getviewposition == null ? "{}" : getviewposition.toString();
    }

    public static abstract class getMax<T extends getAbsoluteAdapterPosition<?>> extends Message.setMax<T> {
        getViewPosition<T> extensionMap;

        protected getMax() {
        }

        protected getMax(getAbsoluteAdapterPosition<T> getabsoluteadapterposition) {
            super(getabsoluteadapterposition);
            if (getabsoluteadapterposition != null && getabsoluteadapterposition.extensionMap != null) {
                this.extensionMap = new getViewPosition<>(getabsoluteadapterposition.extensionMap);
            }
        }

        public <E> E getExtension(getViewAdapterPosition<T, E> getviewadapterposition) {
            getViewPosition<T> getviewposition = this.extensionMap;
            if (getviewposition == null) {
                return null;
            }
            return getviewposition.get(getviewadapterposition);
        }

        public <E> getMax<T> setExtension(getViewAdapterPosition<T, E> getviewadapterposition, E e) {
            getViewPosition<T> getviewposition = this.extensionMap;
            if (getviewposition == null) {
                this.extensionMap = new getViewPosition<>(getviewadapterposition, e);
            } else {
                getviewposition.put(getviewadapterposition, e);
            }
            return this;
        }
    }
}
