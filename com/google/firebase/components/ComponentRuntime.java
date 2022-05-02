package com.google.firebase.components;

import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import com.google.firebase.dynamicloading.ComponentLoader;
import com.google.firebase.events.Publisher;
import com.google.firebase.events.Subscriber;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import o.Fragment$InstantiationException;
import o.generateActivityResultKey;
import o.registerOnPreAttachListener;
import o.supportFinishAfterTransition;
import o.supportPostponeEnterTransition;

public class ComponentRuntime extends AbstractComponentContainer implements ComponentLoader {
    private static final Provider<Set<Object>> EMPTY_PROVIDER = Fragment$InstantiationException.getMin;
    private final Map<Component<?>, Provider<?>> components;
    private final AtomicReference<Boolean> eagerComponentsInitializedWith;
    private final EventBus eventBus;
    private final Map<Class<?>, Provider<?>> lazyInstanceMap;
    private final Map<Class<?>, LazySet<?>> lazySetMap;
    private final List<Provider<ComponentRegistrar>> unprocessedRegistrarProviders;

    /* access modifiers changed from: private */
    public static /* synthetic */ ComponentRegistrar lambda$toProviders$1(ComponentRegistrar componentRegistrar) {
        return componentRegistrar;
    }

    public /* bridge */ /* synthetic */ Object get(Class cls) {
        return super.get(cls);
    }

    public /* bridge */ /* synthetic */ Set setOf(Class cls) {
        return super.setOf(cls);
    }

    @Deprecated
    public ComponentRuntime(Executor executor, Iterable<ComponentRegistrar> iterable, Component<?>... componentArr) {
        this(executor, toProviders(iterable), (Collection<Component<?>>) Arrays.asList(componentArr));
    }

    public static Builder builder(Executor executor) {
        return new Builder(executor);
    }

    private ComponentRuntime(Executor executor, Iterable<Provider<ComponentRegistrar>> iterable, Collection<Component<?>> collection) {
        this.components = new HashMap();
        this.lazyInstanceMap = new HashMap();
        this.lazySetMap = new HashMap();
        this.eagerComponentsInitializedWith = new AtomicReference<>();
        this.eventBus = new EventBus(executor);
        ArrayList arrayList = new ArrayList();
        arrayList.add(Component.of(this.eventBus, EventBus.class, Subscriber.class, Publisher.class));
        arrayList.add(Component.of(this, ComponentLoader.class, new Class[0]));
        for (Component next : collection) {
            if (next != null) {
                arrayList.add(next);
            }
        }
        this.unprocessedRegistrarProviders = iterableToList(iterable);
        discoverComponents(arrayList);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:11|12|36) */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r1.remove();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void discoverComponents(java.util.List<com.google.firebase.components.Component<?>> r6) {
        /*
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            monitor-enter(r5)
            java.util.List<com.google.firebase.inject.Provider<com.google.firebase.components.ComponentRegistrar>> r1 = r5.unprocessedRegistrarProviders     // Catch:{ all -> 0x0096 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0096 }
        L_0x000c:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x0096 }
            if (r2 == 0) goto L_0x002f
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x0096 }
            com.google.firebase.inject.Provider r2 = (com.google.firebase.inject.Provider) r2     // Catch:{ all -> 0x0096 }
            java.lang.Object r2 = r2.get()     // Catch:{ InvalidRegistrarException -> 0x002b }
            com.google.firebase.components.ComponentRegistrar r2 = (com.google.firebase.components.ComponentRegistrar) r2     // Catch:{ InvalidRegistrarException -> 0x002b }
            if (r2 == 0) goto L_0x000c
            java.util.List r2 = r2.getComponents()     // Catch:{ InvalidRegistrarException -> 0x002b }
            r6.addAll(r2)     // Catch:{ InvalidRegistrarException -> 0x002b }
            r1.remove()     // Catch:{ InvalidRegistrarException -> 0x002b }
            goto L_0x000c
        L_0x002b:
            r1.remove()     // Catch:{ all -> 0x0096 }
            goto L_0x000c
        L_0x002f:
            java.util.Map<com.google.firebase.components.Component<?>, com.google.firebase.inject.Provider<?>> r1 = r5.components     // Catch:{ all -> 0x0096 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0096 }
            if (r1 == 0) goto L_0x003b
            com.google.firebase.components.CycleDetector.detect(r6)     // Catch:{ all -> 0x0096 }
            goto L_0x004c
        L_0x003b:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x0096 }
            java.util.Map<com.google.firebase.components.Component<?>, com.google.firebase.inject.Provider<?>> r2 = r5.components     // Catch:{ all -> 0x0096 }
            java.util.Set r2 = r2.keySet()     // Catch:{ all -> 0x0096 }
            r1.<init>(r2)     // Catch:{ all -> 0x0096 }
            r1.addAll(r6)     // Catch:{ all -> 0x0096 }
            com.google.firebase.components.CycleDetector.detect(r1)     // Catch:{ all -> 0x0096 }
        L_0x004c:
            java.util.Iterator r1 = r6.iterator()     // Catch:{ all -> 0x0096 }
        L_0x0050:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x0096 }
            if (r2 == 0) goto L_0x006c
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x0096 }
            com.google.firebase.components.Component r2 = (com.google.firebase.components.Component) r2     // Catch:{ all -> 0x0096 }
            com.google.firebase.components.Lazy r3 = new com.google.firebase.components.Lazy     // Catch:{ all -> 0x0096 }
            o.prepareCallInternal r4 = new o.prepareCallInternal     // Catch:{ all -> 0x0096 }
            r4.<init>(r5, r2)     // Catch:{ all -> 0x0096 }
            r3.<init>(r4)     // Catch:{ all -> 0x0096 }
            java.util.Map<com.google.firebase.components.Component<?>, com.google.firebase.inject.Provider<?>> r4 = r5.components     // Catch:{ all -> 0x0096 }
            r4.put(r2, r3)     // Catch:{ all -> 0x0096 }
            goto L_0x0050
        L_0x006c:
            java.util.List r6 = r5.processInstanceComponents(r6)     // Catch:{ all -> 0x0096 }
            r0.addAll(r6)     // Catch:{ all -> 0x0096 }
            java.util.List r6 = r5.processSetComponents()     // Catch:{ all -> 0x0096 }
            r0.addAll(r6)     // Catch:{ all -> 0x0096 }
            r5.processDependencies()     // Catch:{ all -> 0x0096 }
            monitor-exit(r5)     // Catch:{ all -> 0x0096 }
            java.util.Iterator r6 = r0.iterator()
        L_0x0082:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0092
            java.lang.Object r0 = r6.next()
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            r0.run()
            goto L_0x0082
        L_0x0092:
            r5.maybeInitializeEagerComponents()
            return
        L_0x0096:
            r6 = move-exception
            monitor-exit(r5)
            goto L_0x009a
        L_0x0099:
            throw r6
        L_0x009a:
            goto L_0x0099
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.components.ComponentRuntime.discoverComponents(java.util.List):void");
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object lambda$discoverComponents$0(Component component) {
        return component.getFactory().create(new RestrictedComponentContainer(component, this));
    }

    private void maybeInitializeEagerComponents() {
        Boolean bool = this.eagerComponentsInitializedWith.get();
        if (bool != null) {
            doInitializeEagerComponents(this.components, bool.booleanValue());
        }
    }

    private static Iterable<Provider<ComponentRegistrar>> toProviders(Iterable<ComponentRegistrar> iterable) {
        ArrayList arrayList = new ArrayList();
        for (ComponentRegistrar registeronpreattachlistener : iterable) {
            arrayList.add(new registerOnPreAttachListener(registeronpreattachlistener));
        }
        return arrayList;
    }

    private static <T> List<T> iterableToList(Iterable<T> iterable) {
        ArrayList arrayList = new ArrayList();
        for (T add : iterable) {
            arrayList.add(add);
        }
        return arrayList;
    }

    private List<Runnable> processInstanceComponents(List<Component<?>> list) {
        ArrayList arrayList = new ArrayList();
        for (Component next : list) {
            if (next.isValue()) {
                Provider provider = this.components.get(next);
                for (Class cls : next.getProvidedInterfaces()) {
                    if (!this.lazyInstanceMap.containsKey(cls)) {
                        this.lazyInstanceMap.put(cls, provider);
                    } else {
                        arrayList.add(new generateActivityResultKey((OptionalProvider) this.lazyInstanceMap.get(cls), provider));
                    }
                }
            }
        }
        return arrayList;
    }

    private List<Runnable> processSetComponents() {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        for (Map.Entry next : this.components.entrySet()) {
            Component component = (Component) next.getKey();
            if (!component.isValue()) {
                Provider provider = (Provider) next.getValue();
                for (Class cls : component.getProvidedInterfaces()) {
                    if (!hashMap.containsKey(cls)) {
                        hashMap.put(cls, new HashSet());
                    }
                    ((Set) hashMap.get(cls)).add(provider);
                }
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (!this.lazySetMap.containsKey(entry.getKey())) {
                this.lazySetMap.put((Class) entry.getKey(), LazySet.fromCollection((Collection) entry.getValue()));
            } else {
                LazySet lazySet = this.lazySetMap.get(entry.getKey());
                for (Provider supportfinishaftertransition : (Set) entry.getValue()) {
                    arrayList.add(new supportFinishAfterTransition(lazySet, supportfinishaftertransition));
                }
            }
        }
        return arrayList;
    }

    public synchronized <T> Provider<T> getProvider(Class<T> cls) {
        Preconditions.checkNotNull(cls, "Null interface requested.");
        return this.lazyInstanceMap.get(cls);
    }

    public <T> Deferred<T> getDeferred(Class<T> cls) {
        Provider<T> provider = getProvider(cls);
        if (provider == null) {
            return OptionalProvider.empty();
        }
        if (provider instanceof OptionalProvider) {
            return (OptionalProvider) provider;
        }
        return OptionalProvider.of(provider);
    }

    public synchronized <T> Provider<Set<T>> setOfProvider(Class<T> cls) {
        LazySet lazySet = this.lazySetMap.get(cls);
        if (lazySet != null) {
            return lazySet;
        }
        return EMPTY_PROVIDER;
    }

    public void initializeEagerComponents(boolean z) {
        HashMap hashMap;
        if (this.eagerComponentsInitializedWith.compareAndSet((Object) null, Boolean.valueOf(z))) {
            synchronized (this) {
                hashMap = new HashMap(this.components);
            }
            doInitializeEagerComponents(hashMap, z);
        }
    }

    private void doInitializeEagerComponents(Map<Component<?>, Provider<?>> map, boolean z) {
        for (Map.Entry next : map.entrySet()) {
            Component component = (Component) next.getKey();
            Provider provider = (Provider) next.getValue();
            if (component.isAlwaysEager() || (component.isEagerInDefaultApp() && z)) {
                provider.get();
            }
        }
        this.eventBus.enablePublishingAndFlushPending();
    }

    public void discoverComponents() {
        synchronized (this) {
            if (!this.unprocessedRegistrarProviders.isEmpty()) {
                discoverComponents(new ArrayList());
            }
        }
    }

    @VisibleForTesting
    @RestrictTo({RestrictTo.Scope.TESTS})
    public void initializeAllComponentsForTests() {
        for (Provider<?> provider : this.components.values()) {
            provider.get();
        }
    }

    private void processDependencies() {
        for (Component next : this.components.keySet()) {
            Iterator<Dependency> it = next.getDependencies().iterator();
            while (true) {
                if (it.hasNext()) {
                    Dependency next2 = it.next();
                    if (next2.isSet() && !this.lazySetMap.containsKey(next2.getInterface())) {
                        this.lazySetMap.put(next2.getInterface(), LazySet.fromCollection(Collections.emptySet()));
                    } else if (this.lazyInstanceMap.containsKey(next2.getInterface())) {
                        continue;
                    } else if (next2.isRequired()) {
                        throw new MissingDependencyException(String.format("Unsatisfied dependency for component %s: %s", new Object[]{next, next2.getInterface()}));
                    } else if (!next2.isSet()) {
                        this.lazyInstanceMap.put(next2.getInterface(), OptionalProvider.empty());
                    }
                }
            }
        }
    }

    public static final class Builder {
        private final List<Component<?>> additionalComponents = new ArrayList();
        private final Executor defaultExecutor;
        private final List<Provider<ComponentRegistrar>> lazyRegistrars = new ArrayList();

        /* access modifiers changed from: private */
        public static /* synthetic */ ComponentRegistrar lambda$addComponentRegistrar$0(ComponentRegistrar componentRegistrar) {
            return componentRegistrar;
        }

        Builder(Executor executor) {
            this.defaultExecutor = executor;
        }

        public final Builder addLazyComponentRegistrars(Collection<Provider<ComponentRegistrar>> collection) {
            this.lazyRegistrars.addAll(collection);
            return this;
        }

        public final Builder addComponentRegistrar(ComponentRegistrar componentRegistrar) {
            this.lazyRegistrars.add(new supportPostponeEnterTransition(componentRegistrar));
            return this;
        }

        public final Builder addComponent(Component<?> component) {
            this.additionalComponents.add(component);
            return this;
        }

        public final ComponentRuntime build() {
            return new ComponentRuntime(this.defaultExecutor, this.lazyRegistrars, this.additionalComponents);
        }
    }
}
