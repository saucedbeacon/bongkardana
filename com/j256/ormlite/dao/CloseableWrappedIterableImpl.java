package com.j256.ormlite.dao;

import com.j256.ormlite.misc.IOUtils;
import java.io.IOException;

public class CloseableWrappedIterableImpl<T> implements CloseableWrappedIterable<T> {
    private final CloseableIterable<T> iterable;
    private CloseableIterator<T> iterator;

    public CloseableWrappedIterableImpl(CloseableIterable<T> closeableIterable) {
        this.iterable = closeableIterable;
    }

    public CloseableIterator<T> iterator() {
        return closeableIterator();
    }

    public CloseableIterator<T> closeableIterator() {
        IOUtils.closeQuietly(this);
        CloseableIterator<T> closeableIterator = this.iterable.closeableIterator();
        this.iterator = closeableIterator;
        return closeableIterator;
    }

    public void close() throws IOException {
        CloseableIterator<T> closeableIterator = this.iterator;
        if (closeableIterator != null) {
            closeableIterator.close();
            this.iterator = null;
        }
    }
}
