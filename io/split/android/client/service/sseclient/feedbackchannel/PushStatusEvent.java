package io.split.android.client.service.sseclient.feedbackchannel;

public class PushStatusEvent {
    private final EventType message;

    public enum EventType {
        PUSH_SUBSYSTEM_UP,
        PUSH_SUBSYSTEM_DOWN,
        PUSH_RETRYABLE_ERROR,
        PUSH_NON_RETRYABLE_ERROR,
        PUSH_DISABLED
    }

    public PushStatusEvent(EventType eventType) {
        this.message = eventType;
    }

    public EventType getMessage() {
        return this.message;
    }
}
