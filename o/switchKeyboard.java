package o;

import java.util.ArrayList;
import java.util.List;

final class switchKeyboard {
    private static final List<switchKeyboard> pendingPostPool = new ArrayList();
    Object event;
    switchKeyboard next;
    initializeNoneKeyboard subscription;

    private switchKeyboard(Object obj, initializeNoneKeyboard initializenonekeyboard) {
        this.event = obj;
        this.subscription = initializenonekeyboard;
    }

    static switchKeyboard obtainPendingPost(initializeNoneKeyboard initializenonekeyboard, Object obj) {
        synchronized (pendingPostPool) {
            int size = pendingPostPool.size();
            if (size <= 0) {
                return new switchKeyboard(obj, initializenonekeyboard);
            }
            switchKeyboard remove = pendingPostPool.remove(size - 1);
            remove.event = obj;
            remove.subscription = initializenonekeyboard;
            remove.next = null;
            return remove;
        }
    }

    static void releasePendingPost(switchKeyboard switchkeyboard) {
        switchkeyboard.event = null;
        switchkeyboard.subscription = null;
        switchkeyboard.next = null;
        synchronized (pendingPostPool) {
            if (pendingPostPool.size() < 10000) {
                pendingPostPool.add(switchkeyboard);
            }
        }
    }
}
