package kotlin.reflect.jvm.internal.pcollections;

import java.util.Iterator;
import java.util.NoSuchElementException;

final class ConsPStack<E> implements Iterable<E> {
    private static final ConsPStack<Object> EMPTY = new ConsPStack<>();
    final E first;
    final ConsPStack<E> rest;
    /* access modifiers changed from: private */
    public final int size;

    public static <E> ConsPStack<E> empty() {
        return EMPTY;
    }

    private ConsPStack() {
        this.size = 0;
        this.first = null;
        this.rest = null;
    }

    private ConsPStack(E e, ConsPStack<E> consPStack) {
        this.first = e;
        this.rest = consPStack;
        this.size = consPStack.size + 1;
    }

    public final E get(int i) {
        if (i < 0 || i > this.size) {
            throw new IndexOutOfBoundsException();
        }
        try {
            return iterator(i).next();
        } catch (NoSuchElementException unused) {
            throw new IndexOutOfBoundsException("Index: ".concat(String.valueOf(i)));
        }
    }

    public final Iterator<E> iterator() {
        return iterator(0);
    }

    public final int size() {
        return this.size;
    }

    private Iterator<E> iterator(int i) {
        return new Itr(subList(i));
    }

    static class Itr<E> implements Iterator<E> {
        private ConsPStack<E> next;

        public Itr(ConsPStack<E> consPStack) {
            this.next = consPStack;
        }

        public boolean hasNext() {
            return this.next.size > 0;
        }

        public E next() {
            E e = this.next.first;
            this.next = this.next.rest;
            return e;
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public final ConsPStack<E> plus(E e) {
        return new ConsPStack<>(e, this);
    }

    private ConsPStack<E> minus(Object obj) {
        if (this.size == 0) {
            return this;
        }
        if (this.first.equals(obj)) {
            return this.rest;
        }
        ConsPStack<E> minus = this.rest.minus(obj);
        if (minus == this.rest) {
            return this;
        }
        return new ConsPStack<>(this.first, minus);
    }

    public final ConsPStack<E> minus(int i) {
        return minus(get(i));
    }

    private ConsPStack<E> subList(int i) {
        ConsPStack consPStack = this;
        while (i >= 0 && i <= consPStack.size) {
            if (i == 0) {
                return consPStack;
            }
            consPStack = consPStack.rest;
            i--;
        }
        throw new IndexOutOfBoundsException();
    }
}
