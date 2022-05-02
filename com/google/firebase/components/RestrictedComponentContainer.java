package com.google.firebase.components;

import com.google.firebase.events.Event;
import com.google.firebase.events.Publisher;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

final class RestrictedComponentContainer extends AbstractComponentContainer {
    private final Set<Class<?>> allowedDeferredInterfaces;
    private final Set<Class<?>> allowedDirectInterfaces;
    private final Set<Class<?>> allowedProviderInterfaces;
    private final Set<Class<?>> allowedPublishedEvents;
    private final Set<Class<?>> allowedSetDirectInterfaces;
    private final Set<Class<?>> allowedSetProviderInterfaces;
    private final ComponentContainer delegateContainer;

    RestrictedComponentContainer(Component<?> component, ComponentContainer componentContainer) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (Dependency next : component.getDependencies()) {
            if (next.isDirectInjection()) {
                if (next.isSet()) {
                    hashSet4.add(next.getInterface());
                } else {
                    hashSet.add(next.getInterface());
                }
            } else if (next.isDeferred()) {
                hashSet3.add(next.getInterface());
            } else if (next.isSet()) {
                hashSet5.add(next.getInterface());
            } else {
                hashSet2.add(next.getInterface());
            }
        }
        if (!component.getPublishedEvents().isEmpty()) {
            hashSet.add(Publisher.class);
        }
        this.allowedDirectInterfaces = Collections.unmodifiableSet(hashSet);
        this.allowedProviderInterfaces = Collections.unmodifiableSet(hashSet2);
        this.allowedDeferredInterfaces = Collections.unmodifiableSet(hashSet3);
        this.allowedSetDirectInterfaces = Collections.unmodifiableSet(hashSet4);
        this.allowedSetProviderInterfaces = Collections.unmodifiableSet(hashSet5);
        this.allowedPublishedEvents = component.getPublishedEvents();
        this.delegateContainer = componentContainer;
    }

    public final <T> T get(Class<T> cls) {
        if (this.allowedDirectInterfaces.contains(cls)) {
            T t = this.delegateContainer.get(cls);
            if (!cls.equals(Publisher.class)) {
                return t;
            }
            return new RestrictedPublisher(this.allowedPublishedEvents, (Publisher) t);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency %s.", new Object[]{cls}));
    }

    public final <T> Provider<T> getProvider(Class<T> cls) {
        if (this.allowedProviderInterfaces.contains(cls)) {
            return this.delegateContainer.getProvider(cls);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Provider<%s>.", new Object[]{cls}));
    }

    public final <T> Deferred<T> getDeferred(Class<T> cls) {
        if (this.allowedDeferredInterfaces.contains(cls)) {
            return this.delegateContainer.getDeferred(cls);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Deferred<%s>.", new Object[]{cls}));
    }

    public final <T> Provider<Set<T>> setOfProvider(Class<T> cls) {
        if (this.allowedSetProviderInterfaces.contains(cls)) {
            return this.delegateContainer.setOfProvider(cls);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", new Object[]{cls}));
    }

    public final <T> Set<T> setOf(Class<T> cls) {
        if (this.allowedSetDirectInterfaces.contains(cls)) {
            return this.delegateContainer.setOf(cls);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Set<%s>.", new Object[]{cls}));
    }

    static class RestrictedPublisher implements Publisher {
        private final Set<Class<?>> allowedPublishedEvents;
        private final Publisher delegate;

        public RestrictedPublisher(Set<Class<?>> set, Publisher publisher) {
            this.allowedPublishedEvents = set;
            this.delegate = publisher;
        }

        public void publish(Event<?> event) {
            if (this.allowedPublishedEvents.contains(event.getType())) {
                this.delegate.publish(event);
            } else {
                throw new DependencyException(String.format("Attempting to publish an undeclared event %s.", new Object[]{event}));
            }
        }
    }
}
