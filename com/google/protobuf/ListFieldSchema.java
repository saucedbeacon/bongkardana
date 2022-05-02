package com.google.protobuf;

import com.google.protobuf.Internal;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

abstract class ListFieldSchema {
    private static final ListFieldSchema FULL_INSTANCE = new ListFieldSchemaFull();
    private static final ListFieldSchema LITE_INSTANCE = new ListFieldSchemaLite();

    /* access modifiers changed from: package-private */
    public abstract void makeImmutableListAt(Object obj, long j);

    /* access modifiers changed from: package-private */
    public abstract <L> void mergeListsAt(Object obj, Object obj2, long j);

    /* access modifiers changed from: package-private */
    public abstract <L> List<L> mutableListAt(Object obj, long j);

    private ListFieldSchema() {
    }

    static ListFieldSchema full() {
        return FULL_INSTANCE;
    }

    static ListFieldSchema lite() {
        return LITE_INSTANCE;
    }

    static final class ListFieldSchemaFull extends ListFieldSchema {
        private static final Class<?> UNMODIFIABLE_LIST_CLASS = Collections.unmodifiableList(Collections.emptyList()).getClass();

        private ListFieldSchemaFull() {
            super();
        }

        /* access modifiers changed from: package-private */
        public final <L> List<L> mutableListAt(Object obj, long j) {
            return mutableListAt(obj, j, 10);
        }

        /* access modifiers changed from: package-private */
        public final void makeImmutableListAt(Object obj, long j) {
            Object obj2;
            List list = (List) UnsafeUtil.getObject(obj, j);
            if (list instanceof LazyStringList) {
                obj2 = ((LazyStringList) list).getUnmodifiableView();
            } else if (!UNMODIFIABLE_LIST_CLASS.isAssignableFrom(list.getClass())) {
                if (!(list instanceof PrimitiveNonBoxingCollection) || !(list instanceof Internal.ProtobufList)) {
                    obj2 = Collections.unmodifiableList(list);
                } else {
                    Internal.ProtobufList protobufList = (Internal.ProtobufList) list;
                    if (protobufList.isModifiable()) {
                        protobufList.makeImmutable();
                        return;
                    }
                    return;
                }
            } else {
                return;
            }
            UnsafeUtil.putObject(obj, j, obj2);
        }

        private static <L> List<L> mutableListAt(Object obj, long j, int i) {
            AbstractList lazyStringArrayList;
            List<L> list;
            List<L> list2 = getList(obj, j);
            if (list2.isEmpty()) {
                if (list2 instanceof LazyStringList) {
                    list = new LazyStringArrayList(i);
                } else if (!(list2 instanceof PrimitiveNonBoxingCollection) || !(list2 instanceof Internal.ProtobufList)) {
                    list = new ArrayList<>(i);
                } else {
                    list = ((Internal.ProtobufList) list2).mutableCopyWithCapacity(i);
                }
                UnsafeUtil.putObject(obj, j, (Object) list);
                return list;
            }
            if (UNMODIFIABLE_LIST_CLASS.isAssignableFrom(list2.getClass())) {
                lazyStringArrayList = new ArrayList(list2.size() + i);
                lazyStringArrayList.addAll(list2);
                UnsafeUtil.putObject(obj, j, (Object) lazyStringArrayList);
            } else if (list2 instanceof UnmodifiableLazyStringList) {
                lazyStringArrayList = new LazyStringArrayList(list2.size() + i);
                lazyStringArrayList.addAll((UnmodifiableLazyStringList) list2);
                UnsafeUtil.putObject(obj, j, (Object) lazyStringArrayList);
            } else if (!(list2 instanceof PrimitiveNonBoxingCollection) || !(list2 instanceof Internal.ProtobufList)) {
                return list2;
            } else {
                Internal.ProtobufList protobufList = (Internal.ProtobufList) list2;
                if (protobufList.isModifiable()) {
                    return list2;
                }
                Internal.ProtobufList mutableCopyWithCapacity = protobufList.mutableCopyWithCapacity(list2.size() + i);
                UnsafeUtil.putObject(obj, j, (Object) mutableCopyWithCapacity);
                return mutableCopyWithCapacity;
            }
            return lazyStringArrayList;
        }

        /* access modifiers changed from: package-private */
        public final <E> void mergeListsAt(Object obj, Object obj2, long j) {
            List list = getList(obj2, j);
            List mutableListAt = mutableListAt(obj, j, list.size());
            int size = mutableListAt.size();
            int size2 = list.size();
            if (size > 0 && size2 > 0) {
                mutableListAt.addAll(list);
            }
            if (size > 0) {
                list = mutableListAt;
            }
            UnsafeUtil.putObject(obj, j, (Object) list);
        }

        static <E> List<E> getList(Object obj, long j) {
            return (List) UnsafeUtil.getObject(obj, j);
        }
    }

    static final class ListFieldSchemaLite extends ListFieldSchema {
        private ListFieldSchemaLite() {
            super();
        }

        /* access modifiers changed from: package-private */
        public final <L> List<L> mutableListAt(Object obj, long j) {
            Internal.ProtobufList protobufList = getProtobufList(obj, j);
            if (protobufList.isModifiable()) {
                return protobufList;
            }
            int size = protobufList.size();
            Internal.ProtobufList mutableCopyWithCapacity = protobufList.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
            UnsafeUtil.putObject(obj, j, (Object) mutableCopyWithCapacity);
            return mutableCopyWithCapacity;
        }

        /* access modifiers changed from: package-private */
        public final void makeImmutableListAt(Object obj, long j) {
            getProtobufList(obj, j).makeImmutable();
        }

        /* access modifiers changed from: package-private */
        public final <E> void mergeListsAt(Object obj, Object obj2, long j) {
            Internal.ProtobufList protobufList = getProtobufList(obj, j);
            Internal.ProtobufList protobufList2 = getProtobufList(obj2, j);
            int size = protobufList.size();
            int size2 = protobufList2.size();
            if (size > 0 && size2 > 0) {
                if (!protobufList.isModifiable()) {
                    protobufList = protobufList.mutableCopyWithCapacity(size2 + size);
                }
                protobufList.addAll(protobufList2);
            }
            if (size > 0) {
                protobufList2 = protobufList;
            }
            UnsafeUtil.putObject(obj, j, (Object) protobufList2);
        }

        static <E> Internal.ProtobufList<E> getProtobufList(Object obj, long j) {
            return (Internal.ProtobufList) UnsafeUtil.getObject(obj, j);
        }
    }
}
