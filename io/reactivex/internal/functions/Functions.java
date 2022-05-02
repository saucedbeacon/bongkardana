package io.reactivex.internal.functions;

import io.reactivex.exceptions.OnErrorNotImplementedException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import o.RedDotDrawable;
import o.RedDotManager;
import o.RedDotModel;
import o.SecException;
import o.SecuritySignature;
import o.addChild;
import o.childSize;
import o.getChildren;
import o.getFavorite;
import o.getFmt;
import o.getRedDotParentModelKey;
import o.hasCornerMarking;
import o.isShow;
import o.removeNode;
import o.removeStateDidChangeHandler;
import o.setListener;
import o.setRedDotParentModelKey;
import o.setRefreshAnimation;
import o.setShow;
import o.setStateDidChangeHandler;
import o.showRedPoint;

public final class Functions {
    public static final RedDotManager<getFmt> FastBitmap$CoordinateSystem = new onNavigationEvent();
    public static final RedDotManager<Throwable> IsOverlapping = new onPostMessage();
    public static final setListener equals = new invoke();
    public static final RedDotManager<Throwable> getMax = new valueOf();
    public static final Runnable getMin = new invokeSuspend();
    static final getChildren<Object> isInside = new asBinder();
    public static final removeStateDidChangeHandler length = new toString();
    static final RedDotDrawable<Object, Object> setMax = new create();
    static final RedDotManager<Object> setMin = new hashCode();
    static final Comparator<Object> toDoubleRange = new ICustomTabsCallback();
    static final getChildren<Object> toFloatRange = new Functions$Grayscale$Algorithm();
    static final Callable<Object> toIntRange = new onMessageChannelReady();

    public static <T1, T2, R> RedDotDrawable<Object[], R> getMin(removeNode<? super T1, ? super T2, ? extends R> removenode) {
        setRefreshAnimation.getMax(removenode, "f is null");
        return new setMin(removenode);
    }

    public static <T1, T2, T3, R> RedDotDrawable<Object[], R> getMax(setShow<T1, T2, T3, R> setshow) {
        setRefreshAnimation.getMax(setshow, "f is null");
        return new setMax(setshow);
    }

    public static <T1, T2, T3, T4, R> RedDotDrawable<Object[], R> getMax(RedDotModel<T1, T2, T3, T4, R> redDotModel) {
        setRefreshAnimation.getMax(redDotModel, "f is null");
        return new length(redDotModel);
    }

    public static <T1, T2, T3, T4, T5, R> RedDotDrawable<Object[], R> length(getRedDotParentModelKey<T1, T2, T3, T4, T5, R> getreddotparentmodelkey) {
        setRefreshAnimation.getMax(getreddotparentmodelkey, "f is null");
        return new getMax(getreddotparentmodelkey);
    }

    public static <T1, T2, T3, T4, T5, T6, R> RedDotDrawable<Object[], R> setMax(setRedDotParentModelKey<T1, T2, T3, T4, T5, T6, R> setreddotparentmodelkey) {
        setRefreshAnimation.getMax(setreddotparentmodelkey, "f is null");
        return new toFloatRange(setreddotparentmodelkey);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, R> RedDotDrawable<Object[], R> getMax(isShow<T1, T2, T3, T4, T5, T6, T7, R> isshow) {
        setRefreshAnimation.getMax(isshow, "f is null");
        return new equals(isshow);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> RedDotDrawable<Object[], R> setMax(addChild<T1, T2, T3, T4, T5, T6, T7, T8, R> addchild) {
        setRefreshAnimation.getMax(addchild, "f is null");
        return new isInside(addchild);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> RedDotDrawable<Object[], R> setMin(childSize<T1, T2, T3, T4, T5, T6, T7, T8, T9, R> childsize) {
        setRefreshAnimation.getMax(childsize, "f is null");
        return new toIntRange(childsize);
    }

    public static <T> RedDotDrawable<T, T> setMin() {
        return setMax;
    }

    public static <T> RedDotManager<T> length() {
        return setMin;
    }

    public static <T> getChildren<T> getMin() {
        return isInside;
    }

    public static <T> getChildren<T> getMax() {
        return toFloatRange;
    }

    public static <T> Callable<T> setMax() {
        return toIntRange;
    }

    public static <T> Comparator<T> equals() {
        return toDoubleRange;
    }

    static final class getCause<T, U> implements Callable<U>, RedDotDrawable<T, U> {
        final U setMax;

        getCause(U u) {
            this.setMax = u;
        }

        public final U call() throws Exception {
            return this.setMax;
        }

        public final U apply(T t) throws Exception {
            return this.setMax;
        }
    }

    public static <T> Callable<T> getMin(T t) {
        return new getCause(t);
    }

    public static <T, U> RedDotDrawable<T, U> length(U u) {
        return new getCause(u);
    }

    static final class values<T, U> implements RedDotDrawable<T, U> {
        final Class<U> setMin;

        values(Class<U> cls) {
            this.setMin = cls;
        }

        public final U apply(T t) throws Exception {
            return this.setMin.cast(t);
        }
    }

    public static <T, U> RedDotDrawable<T, U> getMax(Class<U> cls) {
        return new values(cls);
    }

    static final class IsOverlapping<T> implements Callable<List<T>> {
        final int getMin;

        IsOverlapping(int i) {
            this.getMin = i;
        }

        public final /* synthetic */ Object call() throws Exception {
            return new ArrayList(this.getMin);
        }
    }

    public static <T> Callable<List<T>> getMin(int i) {
        return new IsOverlapping(i);
    }

    public static <T> getChildren<T> getMax(T t) {
        return new Functions$Mean$Arithmetic(t);
    }

    enum HashSetCallable implements Callable<Set<Object>> {
        INSTANCE;

        public final Set<Object> call() throws Exception {
            return new HashSet();
        }
    }

    public static <T> Callable<Set<T>> isInside() {
        return HashSetCallable.INSTANCE;
    }

    static final class extraCallbackWithResult<T> implements RedDotManager<T> {
        final RedDotManager<? super getFavorite<T>> length;

        extraCallbackWithResult(RedDotManager<? super getFavorite<T>> redDotManager) {
            this.length = redDotManager;
        }

        public final void accept(T t) throws Exception {
            this.length.accept(getFavorite.getMax(t));
        }
    }

    static final class onRelationshipValidationResult<T> implements RedDotManager<Throwable> {
        final RedDotManager<? super getFavorite<T>> length;

        public final /* synthetic */ void accept(Object obj) throws Exception {
            this.length.accept(getFavorite.length((Throwable) obj));
        }

        onRelationshipValidationResult(RedDotManager<? super getFavorite<T>> redDotManager) {
            this.length = redDotManager;
        }
    }

    static final class extraCallback<T> implements removeStateDidChangeHandler {
        final RedDotManager<? super getFavorite<T>> getMax;

        extraCallback(RedDotManager<? super getFavorite<T>> redDotManager) {
            this.getMax = redDotManager;
        }

        public final void getMax() throws Exception {
            this.getMax.accept(getFavorite.setMax());
        }
    }

    public static <T> RedDotManager<T> length(RedDotManager<? super getFavorite<T>> redDotManager) {
        return new extraCallbackWithResult(redDotManager);
    }

    public static <T> RedDotManager<Throwable> getMax(RedDotManager<? super getFavorite<T>> redDotManager) {
        return new onRelationshipValidationResult(redDotManager);
    }

    public static <T> removeStateDidChangeHandler setMax(RedDotManager<? super getFavorite<T>> redDotManager) {
        return new extraCallback(redDotManager);
    }

    static final class getMin<T> implements RedDotManager<T> {
        final removeStateDidChangeHandler length;

        getMin(removeStateDidChangeHandler removestatedidchangehandler) {
            this.length = removestatedidchangehandler;
        }

        public final void accept(T t) throws Exception {
            this.length.getMax();
        }
    }

    public static <T> RedDotManager<T> setMax(removeStateDidChangeHandler removestatedidchangehandler) {
        return new getMin(removestatedidchangehandler);
    }

    static final class toDoubleRange<T, U> implements getChildren<T> {
        final Class<U> setMax;

        toDoubleRange(Class<U> cls) {
            this.setMax = cls;
        }

        public final boolean test(T t) throws Exception {
            return this.setMax.isInstance(t);
        }
    }

    public static <T, U> getChildren<T> setMax(Class<U> cls) {
        return new toDoubleRange(cls);
    }

    public static <T> getChildren<T> length(showRedPoint showredpoint) {
        return new Functions$FastBitmap$CoordinateSystem(showredpoint);
    }

    static final class onTransact<T> implements RedDotDrawable<T, SecException<T>> {
        final hasCornerMarking getMax;
        final TimeUnit getMin;

        onTransact(TimeUnit timeUnit, hasCornerMarking hascornermarking) {
            this.getMin = timeUnit;
            this.getMax = hascornermarking;
        }

        public final /* synthetic */ Object apply(Object obj) throws Exception {
            return new SecException(obj, this.getMax.now(this.getMin), this.getMin);
        }
    }

    public static <T> RedDotDrawable<T, SecException<T>> getMin(TimeUnit timeUnit, hasCornerMarking hascornermarking) {
        return new onTransact(timeUnit, hascornermarking);
    }

    static final class ICustomTabsCallback implements Comparator<Object> {

        static final class Stub<K, T> implements setStateDidChangeHandler<Map<K, T>, T> {
            private final RedDotDrawable<? super T, ? extends K> getMin;

            public final /* synthetic */ void setMax(Object obj, Object obj2) throws Exception {
                ((Map) obj).put(this.getMin.apply(obj2), obj2);
            }

            Stub(RedDotDrawable<? super T, ? extends K> redDotDrawable) {
                this.getMin = redDotDrawable;
            }
        }

        static final class Default<K, V, T> implements setStateDidChangeHandler<Map<K, V>, T> {
            private final RedDotDrawable<? super T, ? extends K> getMin;
            private final RedDotDrawable<? super T, ? extends V> length;

            public final /* synthetic */ void setMax(Object obj, Object obj2) throws Exception {
                ((Map) obj).put(this.getMin.apply(obj2), this.length.apply(obj2));
            }

            Default(RedDotDrawable<? super T, ? extends V> redDotDrawable, RedDotDrawable<? super T, ? extends K> redDotDrawable2) {
                this.length = redDotDrawable;
                this.getMin = redDotDrawable2;
            }
        }

        ICustomTabsCallback() {
        }

        public final int compare(Object obj, Object obj2) {
            return ((Comparable) obj).compareTo(obj2);
        }
    }

    public static <T, K> setStateDidChangeHandler<Map<K, T>, T> setMin(RedDotDrawable<? super T, ? extends K> redDotDrawable) {
        return new ICustomTabsCallback.Stub(redDotDrawable);
    }

    public static <T, K, V> setStateDidChangeHandler<Map<K, V>, T> getMin(RedDotDrawable<? super T, ? extends K> redDotDrawable, RedDotDrawable<? super T, ? extends V> redDotDrawable2) {
        return new ICustomTabsCallback.Default(redDotDrawable2, redDotDrawable);
    }

    static final class asInterface<K, V, T> implements setStateDidChangeHandler<Map<K, Collection<V>>, T> {
        private final RedDotDrawable<? super T, ? extends K> getMin;
        private final RedDotDrawable<? super K, ? extends Collection<? super V>> length;
        private final RedDotDrawable<? super T, ? extends V> setMin;

        public final /* synthetic */ void setMax(Object obj, Object obj2) throws Exception {
            Map map = (Map) obj;
            Object apply = this.getMin.apply(obj2);
            Collection collection = (Collection) map.get(apply);
            if (collection == null) {
                collection = (Collection) this.length.apply(apply);
                map.put(apply, collection);
            }
            collection.add(this.setMin.apply(obj2));
        }

        asInterface(RedDotDrawable<? super K, ? extends Collection<? super V>> redDotDrawable, RedDotDrawable<? super T, ? extends V> redDotDrawable2, RedDotDrawable<? super T, ? extends K> redDotDrawable3) {
            this.length = redDotDrawable;
            this.setMin = redDotDrawable2;
            this.getMin = redDotDrawable3;
        }
    }

    public static <T, K, V> setStateDidChangeHandler<Map<K, Collection<V>>, T> getMax(RedDotDrawable<? super T, ? extends K> redDotDrawable, RedDotDrawable<? super T, ? extends V> redDotDrawable2, RedDotDrawable<? super K, ? extends Collection<? super V>> redDotDrawable3) {
        return new asInterface(redDotDrawable3, redDotDrawable2, redDotDrawable);
    }

    enum NaturalComparator implements Comparator<Object> {
        INSTANCE;

        public final int compare(Object obj, Object obj2) {
            return ((Comparable) obj).compareTo(obj2);
        }
    }

    public static <T> Comparator<T> toFloatRange() {
        return NaturalComparator.INSTANCE;
    }

    static final class b<T> implements RedDotDrawable<List<T>, List<T>> {
        final Comparator<? super T> setMin;

        public final /* synthetic */ Object apply(Object obj) throws Exception {
            List list = (List) obj;
            Collections.sort(list, this.setMin);
            return list;
        }

        b(Comparator<? super T> comparator) {
            this.setMin = comparator;
        }
    }

    public static <T> RedDotDrawable<List<T>, List<T>> setMin(Comparator<? super T> comparator) {
        return new b(comparator);
    }

    static final class setMin<T1, T2, R> implements RedDotDrawable<Object[], R> {
        final removeNode<? super T1, ? super T2, ? extends R> setMin;

        public final /* synthetic */ Object apply(Object obj) throws Exception {
            Object[] objArr = (Object[]) obj;
            if (objArr.length == 2) {
                return this.setMin.setMax(objArr[0], objArr[1]);
            }
            StringBuilder sb = new StringBuilder("Array of size 2 expected but got ");
            sb.append(objArr.length);
            throw new IllegalArgumentException(sb.toString());
        }

        setMin(removeNode<? super T1, ? super T2, ? extends R> removenode) {
            this.setMin = removenode;
        }
    }

    static final class setMax<T1, T2, T3, R> implements RedDotDrawable<Object[], R> {
        final setShow<T1, T2, T3, R> getMax;

        public final /* synthetic */ Object apply(Object obj) throws Exception {
            Object[] objArr = (Object[]) obj;
            if (objArr.length == 3) {
                return this.getMax.getMin(objArr[0], objArr[1], objArr[2]);
            }
            StringBuilder sb = new StringBuilder("Array of size 3 expected but got ");
            sb.append(objArr.length);
            throw new IllegalArgumentException(sb.toString());
        }

        setMax(setShow<T1, T2, T3, R> setshow) {
            this.getMax = setshow;
        }
    }

    static final class length<T1, T2, T3, T4, R> implements RedDotDrawable<Object[], R> {
        final RedDotModel<T1, T2, T3, T4, R> setMax;

        public final /* synthetic */ Object apply(Object obj) throws Exception {
            Object[] objArr = (Object[]) obj;
            if (objArr.length == 4) {
                return this.setMax.setMin(objArr[0], objArr[1], objArr[2], objArr[3]);
            }
            StringBuilder sb = new StringBuilder("Array of size 4 expected but got ");
            sb.append(objArr.length);
            throw new IllegalArgumentException(sb.toString());
        }

        length(RedDotModel<T1, T2, T3, T4, R> redDotModel) {
            this.setMax = redDotModel;
        }
    }

    static final class getMax<T1, T2, T3, T4, T5, R> implements RedDotDrawable<Object[], R> {
        private final getRedDotParentModelKey<T1, T2, T3, T4, T5, R> getMax;

        public final /* synthetic */ Object apply(Object obj) throws Exception {
            Object[] objArr = (Object[]) obj;
            if (objArr.length == 5) {
                return this.getMax.getMin();
            }
            StringBuilder sb = new StringBuilder("Array of size 5 expected but got ");
            sb.append(objArr.length);
            throw new IllegalArgumentException(sb.toString());
        }

        getMax(getRedDotParentModelKey<T1, T2, T3, T4, T5, R> getreddotparentmodelkey) {
            this.getMax = getreddotparentmodelkey;
        }
    }

    static final class toFloatRange<T1, T2, T3, T4, T5, T6, R> implements RedDotDrawable<Object[], R> {
        final setRedDotParentModelKey<T1, T2, T3, T4, T5, T6, R> setMax;

        public final /* synthetic */ Object apply(Object obj) throws Exception {
            Object[] objArr = (Object[]) obj;
            if (objArr.length == 6) {
                return this.setMax.setMax();
            }
            StringBuilder sb = new StringBuilder("Array of size 6 expected but got ");
            sb.append(objArr.length);
            throw new IllegalArgumentException(sb.toString());
        }

        toFloatRange(setRedDotParentModelKey<T1, T2, T3, T4, T5, T6, R> setreddotparentmodelkey) {
            this.setMax = setreddotparentmodelkey;
        }
    }

    static final class equals<T1, T2, T3, T4, T5, T6, T7, R> implements RedDotDrawable<Object[], R> {
        final isShow<T1, T2, T3, T4, T5, T6, T7, R> setMin;

        public final /* synthetic */ Object apply(Object obj) throws Exception {
            Object[] objArr = (Object[]) obj;
            if (objArr.length == 7) {
                return this.setMin.setMax();
            }
            StringBuilder sb = new StringBuilder("Array of size 7 expected but got ");
            sb.append(objArr.length);
            throw new IllegalArgumentException(sb.toString());
        }

        equals(isShow<T1, T2, T3, T4, T5, T6, T7, R> isshow) {
            this.setMin = isshow;
        }
    }

    static final class isInside<T1, T2, T3, T4, T5, T6, T7, T8, R> implements RedDotDrawable<Object[], R> {
        final addChild<T1, T2, T3, T4, T5, T6, T7, T8, R> setMax;

        public final /* synthetic */ Object apply(Object obj) throws Exception {
            Object[] objArr = (Object[]) obj;
            if (objArr.length == 8) {
                return this.setMax.setMin();
            }
            StringBuilder sb = new StringBuilder("Array of size 8 expected but got ");
            sb.append(objArr.length);
            throw new IllegalArgumentException(sb.toString());
        }

        isInside(addChild<T1, T2, T3, T4, T5, T6, T7, T8, R> addchild) {
            this.setMax = addchild;
        }
    }

    static final class toIntRange<T1, T2, T3, T4, T5, T6, T7, T8, T9, R> implements RedDotDrawable<Object[], R> {
        final childSize<T1, T2, T3, T4, T5, T6, T7, T8, T9, R> getMin;

        public final /* synthetic */ Object apply(Object obj) throws Exception {
            Object[] objArr = (Object[]) obj;
            if (objArr.length == 9) {
                return this.getMin.getMin();
            }
            StringBuilder sb = new StringBuilder("Array of size 9 expected but got ");
            sb.append(objArr.length);
            throw new IllegalArgumentException(sb.toString());
        }

        toIntRange(childSize<T1, T2, T3, T4, T5, T6, T7, T8, T9, R> childsize) {
            this.getMin = childsize;
        }
    }

    static final class create implements RedDotDrawable<Object, Object> {
        public final Object apply(Object obj) {
            return obj;
        }

        public final String toString() {
            return "IdentityFunction";
        }

        create() {
        }
    }

    static final class invokeSuspend implements Runnable {
        public final void run() {
        }

        public final String toString() {
            return "EmptyRunnable";
        }

        invokeSuspend() {
        }
    }

    static final class toString implements removeStateDidChangeHandler {
        public final void getMax() {
        }

        public final String toString() {
            return "EmptyAction";
        }

        toString() {
        }
    }

    static final class hashCode implements RedDotManager<Object> {
        public final void accept(Object obj) {
        }

        public final String toString() {
            return "EmptyConsumer";
        }

        hashCode() {
        }
    }

    static final class valueOf implements RedDotManager<Throwable> {
        valueOf() {
        }

        public final /* synthetic */ void accept(Object obj) throws Exception {
            SecuritySignature.getMax((Throwable) obj);
        }
    }

    static final class onPostMessage implements RedDotManager<Throwable> {
        onPostMessage() {
        }

        public final /* synthetic */ void accept(Object obj) throws Exception {
            SecuritySignature.getMax((Throwable) new OnErrorNotImplementedException((Throwable) obj));
        }
    }

    static final class invoke implements setListener {
        invoke() {
        }
    }

    static final class asBinder implements getChildren<Object> {
        public final boolean test(Object obj) {
            return true;
        }

        asBinder() {
        }
    }

    static final class onMessageChannelReady implements Callable<Object> {
        public final Object call() {
            return null;
        }

        onMessageChannelReady() {
        }
    }

    static final class onNavigationEvent implements RedDotManager<getFmt> {
        onNavigationEvent() {
        }

        public final /* synthetic */ void accept(Object obj) throws Exception {
            ((getFmt) obj).request(Long.MAX_VALUE);
        }
    }
}
