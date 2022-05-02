package io.split.android.client.service.sseclient.feedbackchannel;

public interface BroadcastedEventListener {
    void onEvent(PushStatusEvent pushStatusEvent);
}
