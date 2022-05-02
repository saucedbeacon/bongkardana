package o;

import o.PlaybackStateCompat;

public final class onChildViewsChanged<K, V> extends PlaybackStateCompat<K, V> {
    private int toIntRange;

    public final void clear() {
        this.toIntRange = 0;
        super.clear();
    }

    public final V length(int i, V v) {
        this.toIntRange = 0;
        return super.length(i, v);
    }

    public final V put(K k, V v) {
        this.toIntRange = 0;
        return super.put(k, v);
    }

    public final void length(PlaybackStateCompat.RepeatMode<? extends K, ? extends V> repeatMode) {
        this.toIntRange = 0;
        super.length(repeatMode);
    }

    public final V setMin(int i) {
        this.toIntRange = 0;
        return super.setMin(i);
    }

    public final int hashCode() {
        if (this.toIntRange == 0) {
            this.toIntRange = super.hashCode();
        }
        return this.toIntRange;
    }
}
