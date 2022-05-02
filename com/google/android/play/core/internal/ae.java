package com.google.android.play.core.internal;

import com.google.android.play.core.listener.StateUpdatedListener;
import java.util.HashSet;
import java.util.Set;

public final class ae<StateT> {

    /* renamed from: a  reason: collision with root package name */
    protected final Set<StateUpdatedListener<StateT>> f10952a = new HashSet();

    public final synchronized void a(StateUpdatedListener<StateT> stateUpdatedListener) {
        this.f10952a.add(stateUpdatedListener);
    }

    public final synchronized void a(StateT statet) {
        for (StateUpdatedListener<StateT> onStateUpdate : this.f10952a) {
            onStateUpdate.onStateUpdate(statet);
        }
    }

    public final synchronized void b(StateUpdatedListener<StateT> stateUpdatedListener) {
        this.f10952a.remove(stateUpdatedListener);
    }
}
