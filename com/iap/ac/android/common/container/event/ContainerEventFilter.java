package com.iap.ac.android.common.container.event;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ContainerEventFilter {
    private Set<String> actions = new HashSet();

    public void addAction(String str) {
        this.actions.add(str);
    }

    public void setEventsList(List<String> list) {
        if (list != null && !list.isEmpty()) {
            this.actions.addAll(list);
        }
    }

    public Iterator<String> actionIterator() {
        return this.actions.iterator();
    }
}
