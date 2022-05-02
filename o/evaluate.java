package o;

import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.EncodeStrategy;

public abstract class evaluate {
    public static final evaluate getMax = new evaluate() {
        public final boolean getMax() {
            return true;
        }

        public final boolean length() {
            return true;
        }

        public final boolean getMin(DataSource dataSource) {
            return dataSource == DataSource.REMOTE;
        }

        public final boolean setMin(boolean z, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return (dataSource == DataSource.RESOURCE_DISK_CACHE || dataSource == DataSource.MEMORY_CACHE) ? false : true;
        }
    };
    public static final evaluate getMin = new evaluate() {
        public final boolean getMax() {
            return true;
        }

        public final boolean length() {
            return false;
        }

        public final boolean setMin(boolean z, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return false;
        }

        public final boolean getMin(DataSource dataSource) {
            return (dataSource == DataSource.DATA_DISK_CACHE || dataSource == DataSource.MEMORY_CACHE) ? false : true;
        }
    };
    public static final evaluate length = new evaluate() {
        public final boolean getMax() {
            return false;
        }

        public final boolean getMin(DataSource dataSource) {
            return false;
        }

        public final boolean length() {
            return false;
        }

        public final boolean setMin(boolean z, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return false;
        }
    };
    public static final evaluate setMax = new evaluate() {
        public final boolean getMax() {
            return false;
        }

        public final boolean getMin(DataSource dataSource) {
            return false;
        }

        public final boolean length() {
            return true;
        }

        public final boolean setMin(boolean z, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return (dataSource == DataSource.RESOURCE_DISK_CACHE || dataSource == DataSource.MEMORY_CACHE) ? false : true;
        }
    };
    public static final evaluate setMin = new evaluate() {
        public final boolean getMax() {
            return true;
        }

        public final boolean length() {
            return true;
        }

        public final boolean getMin(DataSource dataSource) {
            return dataSource == DataSource.REMOTE;
        }

        public final boolean setMin(boolean z, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return ((z && dataSource == DataSource.DATA_DISK_CACHE) || dataSource == DataSource.LOCAL) && encodeStrategy == EncodeStrategy.TRANSFORMED;
        }
    };

    public abstract boolean getMax();

    public abstract boolean getMin(DataSource dataSource);

    public abstract boolean length();

    public abstract boolean setMin(boolean z, DataSource dataSource, EncodeStrategy encodeStrategy);
}
