package com.google.android.exoplayer2;

import android.os.Handler;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.Assertions;

public final class PlayerMessage {
    private boolean deleteAfterDelivery = true;
    private Handler handler;
    private boolean isCanceled;
    private boolean isDelivered;
    private boolean isProcessed;
    private boolean isSent;
    @Nullable
    private Object payload;
    private long positionMs = C.TIME_UNSET;
    private final Sender sender;
    private final Target target;
    private final Timeline timeline;
    private int type;
    private int windowIndex;

    public interface Sender {
        void sendMessage(PlayerMessage playerMessage);
    }

    public interface Target {
        void handleMessage(int i, @Nullable Object obj) throws ExoPlaybackException;
    }

    public PlayerMessage(Sender sender2, Target target2, Timeline timeline2, int i, Handler handler2) {
        this.sender = sender2;
        this.target = target2;
        this.timeline = timeline2;
        this.handler = handler2;
        this.windowIndex = i;
    }

    public final Timeline getTimeline() {
        return this.timeline;
    }

    public final Target getTarget() {
        return this.target;
    }

    public final PlayerMessage setType(int i) {
        Assertions.checkState(!this.isSent);
        this.type = i;
        return this;
    }

    public final int getType() {
        return this.type;
    }

    public final PlayerMessage setPayload(@Nullable Object obj) {
        Assertions.checkState(!this.isSent);
        this.payload = obj;
        return this;
    }

    @Nullable
    public final Object getPayload() {
        return this.payload;
    }

    public final PlayerMessage setHandler(Handler handler2) {
        Assertions.checkState(!this.isSent);
        this.handler = handler2;
        return this;
    }

    public final Handler getHandler() {
        return this.handler;
    }

    public final long getPositionMs() {
        return this.positionMs;
    }

    public final PlayerMessage setPosition(long j) {
        Assertions.checkState(!this.isSent);
        this.positionMs = j;
        return this;
    }

    public final PlayerMessage setPosition(int i, long j) {
        boolean z = true;
        Assertions.checkState(!this.isSent);
        if (j == C.TIME_UNSET) {
            z = false;
        }
        Assertions.checkArgument(z);
        if (i < 0 || (!this.timeline.isEmpty() && i >= this.timeline.getWindowCount())) {
            throw new IllegalSeekPositionException(this.timeline, i, j);
        }
        this.windowIndex = i;
        this.positionMs = j;
        return this;
    }

    public final int getWindowIndex() {
        return this.windowIndex;
    }

    public final PlayerMessage setDeleteAfterDelivery(boolean z) {
        Assertions.checkState(!this.isSent);
        this.deleteAfterDelivery = z;
        return this;
    }

    public final boolean getDeleteAfterDelivery() {
        return this.deleteAfterDelivery;
    }

    public final PlayerMessage send() {
        Assertions.checkState(!this.isSent);
        if (this.positionMs == C.TIME_UNSET) {
            Assertions.checkArgument(this.deleteAfterDelivery);
        }
        this.isSent = true;
        this.sender.sendMessage(this);
        return this;
    }

    public final synchronized PlayerMessage cancel() {
        Assertions.checkState(this.isSent);
        this.isCanceled = true;
        markAsProcessed(false);
        return this;
    }

    public final synchronized boolean isCanceled() {
        return this.isCanceled;
    }

    public final synchronized boolean blockUntilDelivered() throws InterruptedException {
        Assertions.checkState(this.isSent);
        Assertions.checkState(this.handler.getLooper().getThread() != Thread.currentThread());
        while (!this.isProcessed) {
            wait();
        }
        return this.isDelivered;
    }

    public final synchronized void markAsProcessed(boolean z) {
        this.isDelivered = z | this.isDelivered;
        this.isProcessed = true;
        notifyAll();
    }
}
