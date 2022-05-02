package o;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Pattern;

public class setFavoriteStatus {
    private getMax<String, Pattern> cache;

    public setFavoriteStatus(int i) {
        this.cache = new getMax<>(i);
    }

    public Pattern getPatternForRegex(String str) {
        Pattern pattern = this.cache.get(str);
        if (pattern != null) {
            return pattern;
        }
        Pattern compile = Pattern.compile(str);
        this.cache.put(str, compile);
        return compile;
    }

    /* access modifiers changed from: package-private */
    public boolean containsRegex(String str) {
        return this.cache.containsKey(str);
    }

    static class getMax<K, V> {
        private LinkedHashMap<K, V> map;
        /* access modifiers changed from: private */
        public int size;

        public getMax(int i) {
            this.size = i;
            this.map = new LinkedHashMap<K, V>(((i * 4) / 3) + 1, 0.75f, true) {
                /* access modifiers changed from: protected */
                public final boolean removeEldestEntry(Map.Entry<K, V> entry) {
                    return size() > getMax.this.size;
                }
            };
        }

        public synchronized V get(K k) {
            return this.map.get(k);
        }

        public synchronized void put(K k, V v) {
            this.map.put(k, v);
        }

        public synchronized boolean containsKey(K k) {
            return this.map.containsKey(k);
        }
    }
}
