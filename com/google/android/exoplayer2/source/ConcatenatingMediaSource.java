package com.google.android.exoplayer2.source;

import android.os.Handler;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.PlayerMessage;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.ShuffleOrder;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public class ConcatenatingMediaSource extends CompositeMediaSource<MediaSourceHolder> implements PlayerMessage.Target {
    private static final int MSG_ADD = 0;
    private static final int MSG_MOVE = 2;
    private static final int MSG_NOTIFY_LISTENER = 4;
    private static final int MSG_ON_COMPLETION = 5;
    private static final int MSG_REMOVE = 1;
    private static final int MSG_SET_SHUFFLE_ORDER = 3;
    private final boolean isAtomic;
    private boolean listenerNotificationScheduled;
    private final Map<MediaPeriod, MediaSourceHolder> mediaSourceByMediaPeriod;
    private final Map<Object, MediaSourceHolder> mediaSourceByUid;
    private final List<MediaSourceHolder> mediaSourceHolders;
    private final List<MediaSourceHolder> mediaSourcesPublic;
    private final List<Runnable> pendingOnCompletionActions;
    private int periodCount;
    @Nullable
    private ExoPlayer player;
    @Nullable
    private Handler playerApplicationHandler;
    private ShuffleOrder shuffleOrder;
    private final boolean useLazyPreparation;
    private final Timeline.Window window;
    private int windowCount;

    public void maybeThrowSourceInfoRefreshError() throws IOException {
    }

    public ConcatenatingMediaSource(MediaSource... mediaSourceArr) {
        this(false, mediaSourceArr);
    }

    public ConcatenatingMediaSource(boolean z, MediaSource... mediaSourceArr) {
        this(z, new ShuffleOrder.DefaultShuffleOrder(0), mediaSourceArr);
    }

    public ConcatenatingMediaSource(boolean z, ShuffleOrder shuffleOrder2, MediaSource... mediaSourceArr) {
        this(z, false, shuffleOrder2, mediaSourceArr);
    }

    public ConcatenatingMediaSource(boolean z, boolean z2, ShuffleOrder shuffleOrder2, MediaSource... mediaSourceArr) {
        for (MediaSource checkNotNull : mediaSourceArr) {
            Assertions.checkNotNull(checkNotNull);
        }
        this.shuffleOrder = shuffleOrder2.getLength() > 0 ? shuffleOrder2.cloneAndClear() : shuffleOrder2;
        this.mediaSourceByMediaPeriod = new IdentityHashMap();
        this.mediaSourceByUid = new HashMap();
        this.mediaSourcesPublic = new ArrayList();
        this.mediaSourceHolders = new ArrayList();
        this.pendingOnCompletionActions = new ArrayList();
        this.isAtomic = z;
        this.useLazyPreparation = z2;
        this.window = new Timeline.Window();
        addMediaSources(Arrays.asList(mediaSourceArr));
    }

    public final synchronized void addMediaSource(MediaSource mediaSource) {
        addMediaSource(this.mediaSourcesPublic.size(), mediaSource, (Runnable) null);
    }

    public final synchronized void addMediaSource(MediaSource mediaSource, @Nullable Runnable runnable) {
        addMediaSource(this.mediaSourcesPublic.size(), mediaSource, runnable);
    }

    public final synchronized void addMediaSource(int i, MediaSource mediaSource) {
        addMediaSource(i, mediaSource, (Runnable) null);
    }

    public final synchronized void addMediaSource(int i, MediaSource mediaSource, @Nullable Runnable runnable) {
        addMediaSources(i, Collections.singletonList(mediaSource), runnable);
    }

    public final synchronized void addMediaSources(Collection<MediaSource> collection) {
        addMediaSources(this.mediaSourcesPublic.size(), collection, (Runnable) null);
    }

    public final synchronized void addMediaSources(Collection<MediaSource> collection, @Nullable Runnable runnable) {
        addMediaSources(this.mediaSourcesPublic.size(), collection, runnable);
    }

    public final synchronized void addMediaSources(int i, Collection<MediaSource> collection) {
        addMediaSources(i, collection, (Runnable) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0065, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void addMediaSources(int r5, java.util.Collection<com.google.android.exoplayer2.source.MediaSource> r6, @androidx.annotation.Nullable java.lang.Runnable r7) {
        /*
            r4 = this;
            monitor-enter(r4)
            java.util.Iterator r0 = r6.iterator()     // Catch:{ all -> 0x0066 }
        L_0x0005:
            boolean r1 = r0.hasNext()     // Catch:{ all -> 0x0066 }
            if (r1 == 0) goto L_0x0015
            java.lang.Object r1 = r0.next()     // Catch:{ all -> 0x0066 }
            com.google.android.exoplayer2.source.MediaSource r1 = (com.google.android.exoplayer2.source.MediaSource) r1     // Catch:{ all -> 0x0066 }
            com.google.android.exoplayer2.util.Assertions.checkNotNull(r1)     // Catch:{ all -> 0x0066 }
            goto L_0x0005
        L_0x0015:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x0066 }
            int r1 = r6.size()     // Catch:{ all -> 0x0066 }
            r0.<init>(r1)     // Catch:{ all -> 0x0066 }
            java.util.Iterator r1 = r6.iterator()     // Catch:{ all -> 0x0066 }
        L_0x0022:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x0066 }
            if (r2 == 0) goto L_0x0037
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x0066 }
            com.google.android.exoplayer2.source.MediaSource r2 = (com.google.android.exoplayer2.source.MediaSource) r2     // Catch:{ all -> 0x0066 }
            com.google.android.exoplayer2.source.ConcatenatingMediaSource$MediaSourceHolder r3 = new com.google.android.exoplayer2.source.ConcatenatingMediaSource$MediaSourceHolder     // Catch:{ all -> 0x0066 }
            r3.<init>(r2)     // Catch:{ all -> 0x0066 }
            r0.add(r3)     // Catch:{ all -> 0x0066 }
            goto L_0x0022
        L_0x0037:
            java.util.List<com.google.android.exoplayer2.source.ConcatenatingMediaSource$MediaSourceHolder> r1 = r4.mediaSourcesPublic     // Catch:{ all -> 0x0066 }
            r1.addAll(r5, r0)     // Catch:{ all -> 0x0066 }
            com.google.android.exoplayer2.ExoPlayer r1 = r4.player     // Catch:{ all -> 0x0066 }
            if (r1 == 0) goto L_0x005f
            boolean r6 = r6.isEmpty()     // Catch:{ all -> 0x0066 }
            if (r6 != 0) goto L_0x005f
            com.google.android.exoplayer2.ExoPlayer r6 = r4.player     // Catch:{ all -> 0x0066 }
            com.google.android.exoplayer2.PlayerMessage r6 = r6.createMessage(r4)     // Catch:{ all -> 0x0066 }
            r1 = 0
            com.google.android.exoplayer2.PlayerMessage r6 = r6.setType(r1)     // Catch:{ all -> 0x0066 }
            com.google.android.exoplayer2.source.ConcatenatingMediaSource$MessageData r1 = new com.google.android.exoplayer2.source.ConcatenatingMediaSource$MessageData     // Catch:{ all -> 0x0066 }
            r1.<init>(r5, r0, r7)     // Catch:{ all -> 0x0066 }
            com.google.android.exoplayer2.PlayerMessage r5 = r6.setPayload(r1)     // Catch:{ all -> 0x0066 }
            r5.send()     // Catch:{ all -> 0x0066 }
            monitor-exit(r4)
            return
        L_0x005f:
            if (r7 == 0) goto L_0x0064
            r7.run()     // Catch:{ all -> 0x0066 }
        L_0x0064:
            monitor-exit(r4)
            return
        L_0x0066:
            r5 = move-exception
            monitor-exit(r4)
            goto L_0x006a
        L_0x0069:
            throw r5
        L_0x006a:
            goto L_0x0069
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.ConcatenatingMediaSource.addMediaSources(int, java.util.Collection, java.lang.Runnable):void");
    }

    public final synchronized void removeMediaSource(int i) {
        removeMediaSource(i, (Runnable) null);
    }

    public final synchronized void removeMediaSource(int i, @Nullable Runnable runnable) {
        removeMediaSourceRange(i, i + 1, runnable);
    }

    public final synchronized void removeMediaSourceRange(int i, int i2) {
        removeMediaSourceRange(i, i2, (Runnable) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0036, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000e, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void removeMediaSourceRange(int r3, int r4, @androidx.annotation.Nullable java.lang.Runnable r5) {
        /*
            r2 = this;
            monitor-enter(r2)
            java.util.List<com.google.android.exoplayer2.source.ConcatenatingMediaSource$MediaSourceHolder> r0 = r2.mediaSourcesPublic     // Catch:{ all -> 0x0037 }
            com.google.android.exoplayer2.util.Util.removeRange(r0, r3, r4)     // Catch:{ all -> 0x0037 }
            if (r3 != r4) goto L_0x000f
            if (r5 == 0) goto L_0x000d
            r5.run()     // Catch:{ all -> 0x0037 }
        L_0x000d:
            monitor-exit(r2)
            return
        L_0x000f:
            com.google.android.exoplayer2.ExoPlayer r0 = r2.player     // Catch:{ all -> 0x0037 }
            if (r0 == 0) goto L_0x0030
            com.google.android.exoplayer2.ExoPlayer r0 = r2.player     // Catch:{ all -> 0x0037 }
            com.google.android.exoplayer2.PlayerMessage r0 = r0.createMessage(r2)     // Catch:{ all -> 0x0037 }
            r1 = 1
            com.google.android.exoplayer2.PlayerMessage r0 = r0.setType(r1)     // Catch:{ all -> 0x0037 }
            com.google.android.exoplayer2.source.ConcatenatingMediaSource$MessageData r1 = new com.google.android.exoplayer2.source.ConcatenatingMediaSource$MessageData     // Catch:{ all -> 0x0037 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0037 }
            r1.<init>(r3, r4, r5)     // Catch:{ all -> 0x0037 }
            com.google.android.exoplayer2.PlayerMessage r3 = r0.setPayload(r1)     // Catch:{ all -> 0x0037 }
            r3.send()     // Catch:{ all -> 0x0037 }
            monitor-exit(r2)
            return
        L_0x0030:
            if (r5 == 0) goto L_0x0035
            r5.run()     // Catch:{ all -> 0x0037 }
        L_0x0035:
            monitor-exit(r2)
            return
        L_0x0037:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.ConcatenatingMediaSource.removeMediaSourceRange(int, int, java.lang.Runnable):void");
    }

    public final synchronized void moveMediaSource(int i, int i2) {
        moveMediaSource(i, i2, (Runnable) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0035, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void moveMediaSource(int r3, int r4, @androidx.annotation.Nullable java.lang.Runnable r5) {
        /*
            r2 = this;
            monitor-enter(r2)
            if (r3 != r4) goto L_0x0005
            monitor-exit(r2)
            return
        L_0x0005:
            java.util.List<com.google.android.exoplayer2.source.ConcatenatingMediaSource$MediaSourceHolder> r0 = r2.mediaSourcesPublic     // Catch:{ all -> 0x0036 }
            java.lang.Object r1 = r0.remove(r3)     // Catch:{ all -> 0x0036 }
            r0.add(r4, r1)     // Catch:{ all -> 0x0036 }
            com.google.android.exoplayer2.ExoPlayer r0 = r2.player     // Catch:{ all -> 0x0036 }
            if (r0 == 0) goto L_0x002f
            com.google.android.exoplayer2.ExoPlayer r0 = r2.player     // Catch:{ all -> 0x0036 }
            com.google.android.exoplayer2.PlayerMessage r0 = r0.createMessage(r2)     // Catch:{ all -> 0x0036 }
            r1 = 2
            com.google.android.exoplayer2.PlayerMessage r0 = r0.setType(r1)     // Catch:{ all -> 0x0036 }
            com.google.android.exoplayer2.source.ConcatenatingMediaSource$MessageData r1 = new com.google.android.exoplayer2.source.ConcatenatingMediaSource$MessageData     // Catch:{ all -> 0x0036 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0036 }
            r1.<init>(r3, r4, r5)     // Catch:{ all -> 0x0036 }
            com.google.android.exoplayer2.PlayerMessage r3 = r0.setPayload(r1)     // Catch:{ all -> 0x0036 }
            r3.send()     // Catch:{ all -> 0x0036 }
            monitor-exit(r2)
            return
        L_0x002f:
            if (r5 == 0) goto L_0x0034
            r5.run()     // Catch:{ all -> 0x0036 }
        L_0x0034:
            monitor-exit(r2)
            return
        L_0x0036:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.ConcatenatingMediaSource.moveMediaSource(int, int, java.lang.Runnable):void");
    }

    public final synchronized void clear() {
        clear((Runnable) null);
    }

    public final synchronized void clear(@Nullable Runnable runnable) {
        removeMediaSourceRange(0, getSize(), runnable);
    }

    public final synchronized int getSize() {
        return this.mediaSourcesPublic.size();
    }

    public final synchronized MediaSource getMediaSource(int i) {
        int max = dispatchOnCancelled.setMax(i);
        if (i != max) {
            onCanceled oncanceled = new onCanceled(i, max, 1);
            onCancelLoad.setMax(472142681, oncanceled);
            onCancelLoad.getMin(472142681, oncanceled);
        }
        return this.mediaSourcesPublic.get(i).mediaSource;
    }

    public final synchronized void setShuffleOrder(ShuffleOrder shuffleOrder2) {
        setShuffleOrder(shuffleOrder2, (Runnable) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0041, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void setShuffleOrder(com.google.android.exoplayer2.source.ShuffleOrder r5, @androidx.annotation.Nullable java.lang.Runnable r6) {
        /*
            r4 = this;
            monitor-enter(r4)
            com.google.android.exoplayer2.ExoPlayer r0 = r4.player     // Catch:{ all -> 0x0042 }
            if (r0 == 0) goto L_0x002f
            int r1 = r4.getSize()     // Catch:{ all -> 0x0042 }
            int r2 = r5.getLength()     // Catch:{ all -> 0x0042 }
            r3 = 0
            if (r2 == r1) goto L_0x0018
            com.google.android.exoplayer2.source.ShuffleOrder r5 = r5.cloneAndClear()     // Catch:{ all -> 0x0042 }
            com.google.android.exoplayer2.source.ShuffleOrder r5 = r5.cloneAndInsert(r3, r1)     // Catch:{ all -> 0x0042 }
        L_0x0018:
            com.google.android.exoplayer2.PlayerMessage r0 = r0.createMessage(r4)     // Catch:{ all -> 0x0042 }
            r1 = 3
            com.google.android.exoplayer2.PlayerMessage r0 = r0.setType(r1)     // Catch:{ all -> 0x0042 }
            com.google.android.exoplayer2.source.ConcatenatingMediaSource$MessageData r1 = new com.google.android.exoplayer2.source.ConcatenatingMediaSource$MessageData     // Catch:{ all -> 0x0042 }
            r1.<init>(r3, r5, r6)     // Catch:{ all -> 0x0042 }
            com.google.android.exoplayer2.PlayerMessage r5 = r0.setPayload(r1)     // Catch:{ all -> 0x0042 }
            r5.send()     // Catch:{ all -> 0x0042 }
            monitor-exit(r4)
            return
        L_0x002f:
            int r0 = r5.getLength()     // Catch:{ all -> 0x0042 }
            if (r0 <= 0) goto L_0x0039
            com.google.android.exoplayer2.source.ShuffleOrder r5 = r5.cloneAndClear()     // Catch:{ all -> 0x0042 }
        L_0x0039:
            r4.shuffleOrder = r5     // Catch:{ all -> 0x0042 }
            if (r6 == 0) goto L_0x0040
            r6.run()     // Catch:{ all -> 0x0042 }
        L_0x0040:
            monitor-exit(r4)
            return
        L_0x0042:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.ConcatenatingMediaSource.setShuffleOrder(com.google.android.exoplayer2.source.ShuffleOrder, java.lang.Runnable):void");
    }

    public final synchronized void prepareSourceInternal(ExoPlayer exoPlayer, boolean z, @Nullable TransferListener transferListener) {
        super.prepareSourceInternal(exoPlayer, z, transferListener);
        this.player = exoPlayer;
        this.playerApplicationHandler = new Handler(exoPlayer.getApplicationLooper());
        if (this.mediaSourcesPublic.isEmpty()) {
            notifyListener();
            return;
        }
        this.shuffleOrder = this.shuffleOrder.cloneAndInsert(0, this.mediaSourcesPublic.size());
        addMediaSourcesInternal(0, this.mediaSourcesPublic);
        scheduleListenerNotification((Runnable) null);
    }

    public final MediaPeriod createPeriod(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator) {
        MediaSourceHolder mediaSourceHolder = this.mediaSourceByUid.get(getMediaSourceHolderUid(mediaPeriodId.periodUid));
        if (mediaSourceHolder == null) {
            mediaSourceHolder = new MediaSourceHolder(new DummyMediaSource());
            mediaSourceHolder.hasStartedPreparing = true;
        }
        DeferredMediaPeriod deferredMediaPeriod = new DeferredMediaPeriod(mediaSourceHolder.mediaSource, mediaPeriodId, allocator);
        this.mediaSourceByMediaPeriod.put(deferredMediaPeriod, mediaSourceHolder);
        mediaSourceHolder.activeMediaPeriods.add(deferredMediaPeriod);
        if (!mediaSourceHolder.hasStartedPreparing) {
            mediaSourceHolder.hasStartedPreparing = true;
            prepareChildSource(mediaSourceHolder, mediaSourceHolder.mediaSource);
        } else if (mediaSourceHolder.isPrepared) {
            deferredMediaPeriod.createPeriod(mediaPeriodId.copyWithPeriodUid(getChildPeriodUid(mediaSourceHolder, mediaPeriodId.periodUid)));
        }
        return deferredMediaPeriod;
    }

    public final void releasePeriod(MediaPeriod mediaPeriod) {
        MediaSourceHolder mediaSourceHolder = (MediaSourceHolder) Assertions.checkNotNull(this.mediaSourceByMediaPeriod.remove(mediaPeriod));
        ((DeferredMediaPeriod) mediaPeriod).releasePeriod();
        mediaSourceHolder.activeMediaPeriods.remove(mediaPeriod);
        if (mediaSourceHolder.activeMediaPeriods.isEmpty() && mediaSourceHolder.isRemoved) {
            releaseChildSource(mediaSourceHolder);
        }
    }

    public final void releaseSourceInternal() {
        super.releaseSourceInternal();
        this.mediaSourceHolders.clear();
        this.mediaSourceByUid.clear();
        this.player = null;
        this.playerApplicationHandler = null;
        this.shuffleOrder = this.shuffleOrder.cloneAndClear();
        this.windowCount = 0;
        this.periodCount = 0;
    }

    /* access modifiers changed from: protected */
    public final void onChildSourceInfoRefreshed(MediaSourceHolder mediaSourceHolder, MediaSource mediaSource, Timeline timeline, @Nullable Object obj) {
        updateMediaSourceInternal(mediaSourceHolder, timeline);
    }

    /* access modifiers changed from: protected */
    @Nullable
    public MediaSource.MediaPeriodId getMediaPeriodIdForChildMediaPeriodId(MediaSourceHolder mediaSourceHolder, MediaSource.MediaPeriodId mediaPeriodId) {
        for (int i = 0; i < mediaSourceHolder.activeMediaPeriods.size(); i++) {
            if (mediaSourceHolder.activeMediaPeriods.get(i).f10790id.windowSequenceNumber == mediaPeriodId.windowSequenceNumber) {
                return mediaPeriodId.copyWithPeriodUid(getPeriodUid(mediaSourceHolder, mediaPeriodId.periodUid));
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public int getWindowIndexForChildWindowIndex(MediaSourceHolder mediaSourceHolder, int i) {
        return i + mediaSourceHolder.firstWindowIndexInChild;
    }

    public final void handleMessage(int i, @Nullable Object obj) throws ExoPlaybackException {
        if (this.player != null) {
            if (i == 0) {
                MessageData messageData = (MessageData) Util.castNonNull(obj);
                this.shuffleOrder = this.shuffleOrder.cloneAndInsert(messageData.index, ((Collection) messageData.customData).size());
                addMediaSourcesInternal(messageData.index, (Collection) messageData.customData);
                scheduleListenerNotification(messageData.actionOnCompletion);
            } else if (i == 1) {
                MessageData messageData2 = (MessageData) Util.castNonNull(obj);
                int i2 = messageData2.index;
                int intValue = ((Integer) messageData2.customData).intValue();
                if (i2 == 0 && intValue == this.shuffleOrder.getLength()) {
                    this.shuffleOrder = this.shuffleOrder.cloneAndClear();
                } else {
                    for (int i3 = intValue - 1; i3 >= i2; i3--) {
                        this.shuffleOrder = this.shuffleOrder.cloneAndRemove(i3);
                    }
                }
                for (int i4 = intValue - 1; i4 >= i2; i4--) {
                    removeMediaSourceInternal(i4);
                }
                scheduleListenerNotification(messageData2.actionOnCompletion);
            } else if (i == 2) {
                MessageData messageData3 = (MessageData) Util.castNonNull(obj);
                ShuffleOrder cloneAndRemove = this.shuffleOrder.cloneAndRemove(messageData3.index);
                this.shuffleOrder = cloneAndRemove;
                this.shuffleOrder = cloneAndRemove.cloneAndInsert(((Integer) messageData3.customData).intValue(), 1);
                moveMediaSourceInternal(messageData3.index, ((Integer) messageData3.customData).intValue());
                scheduleListenerNotification(messageData3.actionOnCompletion);
            } else if (i == 3) {
                MessageData messageData4 = (MessageData) Util.castNonNull(obj);
                this.shuffleOrder = (ShuffleOrder) messageData4.customData;
                scheduleListenerNotification(messageData4.actionOnCompletion);
            } else if (i == 4) {
                notifyListener();
            } else if (i == 5) {
                List list = (List) Util.castNonNull(obj);
                Handler handler = (Handler) Assertions.checkNotNull(this.playerApplicationHandler);
                for (int i5 = 0; i5 < list.size(); i5++) {
                    handler.post((Runnable) list.get(i5));
                }
            } else {
                throw new IllegalStateException();
            }
        }
    }

    private void scheduleListenerNotification(@Nullable Runnable runnable) {
        if (!this.listenerNotificationScheduled) {
            ((ExoPlayer) Assertions.checkNotNull(this.player)).createMessage(this).setType(4).send();
            this.listenerNotificationScheduled = true;
        }
        if (runnable != null) {
            this.pendingOnCompletionActions.add(runnable);
        }
    }

    private void notifyListener() {
        this.listenerNotificationScheduled = false;
        List emptyList = this.pendingOnCompletionActions.isEmpty() ? Collections.emptyList() : new ArrayList(this.pendingOnCompletionActions);
        this.pendingOnCompletionActions.clear();
        refreshSourceInfo(new ConcatenatedTimeline(this.mediaSourceHolders, this.windowCount, this.periodCount, this.shuffleOrder, this.isAtomic), (Object) null);
        if (!emptyList.isEmpty()) {
            ((ExoPlayer) Assertions.checkNotNull(this.player)).createMessage(this).setType(5).setPayload(emptyList).send();
        }
    }

    private void addMediaSourcesInternal(int i, Collection<MediaSourceHolder> collection) {
        for (MediaSourceHolder addMediaSourceInternal : collection) {
            addMediaSourceInternal(i, addMediaSourceInternal);
            i++;
        }
    }

    private void addMediaSourceInternal(int i, MediaSourceHolder mediaSourceHolder) {
        if (i > 0) {
            MediaSourceHolder mediaSourceHolder2 = this.mediaSourceHolders.get(i - 1);
            mediaSourceHolder.reset(i, mediaSourceHolder2.firstWindowIndexInChild + mediaSourceHolder2.timeline.getWindowCount(), mediaSourceHolder2.firstPeriodIndexInChild + mediaSourceHolder2.timeline.getPeriodCount());
        } else {
            mediaSourceHolder.reset(i, 0, 0);
        }
        correctOffsets(i, 1, mediaSourceHolder.timeline.getWindowCount(), mediaSourceHolder.timeline.getPeriodCount());
        this.mediaSourceHolders.add(i, mediaSourceHolder);
        this.mediaSourceByUid.put(mediaSourceHolder.uid, mediaSourceHolder);
        if (!this.useLazyPreparation) {
            mediaSourceHolder.hasStartedPreparing = true;
            prepareChildSource(mediaSourceHolder, mediaSourceHolder.mediaSource);
        }
    }

    private void updateMediaSourceInternal(MediaSourceHolder mediaSourceHolder, Timeline timeline) {
        if (mediaSourceHolder != null) {
            DeferredTimeline deferredTimeline = mediaSourceHolder.timeline;
            if (deferredTimeline.getTimeline() != timeline) {
                int windowCount2 = timeline.getWindowCount() - deferredTimeline.getWindowCount();
                int periodCount2 = timeline.getPeriodCount() - deferredTimeline.getPeriodCount();
                if (!(windowCount2 == 0 && periodCount2 == 0)) {
                    correctOffsets(mediaSourceHolder.childIndex + 1, 0, windowCount2, periodCount2);
                }
                mediaSourceHolder.timeline = deferredTimeline.cloneWithNewTimeline(timeline);
                if (!mediaSourceHolder.isPrepared && !timeline.isEmpty()) {
                    timeline.getWindow(0, this.window);
                    long positionInFirstPeriodUs = this.window.getPositionInFirstPeriodUs() + this.window.getDefaultPositionUs();
                    for (int i = 0; i < mediaSourceHolder.activeMediaPeriods.size(); i++) {
                        DeferredMediaPeriod deferredMediaPeriod = mediaSourceHolder.activeMediaPeriods.get(i);
                        deferredMediaPeriod.setDefaultPreparePositionUs(positionInFirstPeriodUs);
                        deferredMediaPeriod.createPeriod(deferredMediaPeriod.f10790id.copyWithPeriodUid(getChildPeriodUid(mediaSourceHolder, deferredMediaPeriod.f10790id.periodUid)));
                    }
                    mediaSourceHolder.isPrepared = true;
                }
                scheduleListenerNotification((Runnable) null);
                return;
            }
            return;
        }
        throw new IllegalArgumentException();
    }

    private void removeMediaSourceInternal(int i) {
        MediaSourceHolder remove = this.mediaSourceHolders.remove(i);
        this.mediaSourceByUid.remove(remove.uid);
        DeferredTimeline deferredTimeline = remove.timeline;
        correctOffsets(i, -1, -deferredTimeline.getWindowCount(), -deferredTimeline.getPeriodCount());
        remove.isRemoved = true;
        if (remove.activeMediaPeriods.isEmpty()) {
            releaseChildSource(remove);
        }
    }

    private void moveMediaSourceInternal(int i, int i2) {
        int min = Math.min(i, i2);
        int max = Math.max(i, i2);
        int i3 = this.mediaSourceHolders.get(min).firstWindowIndexInChild;
        int i4 = this.mediaSourceHolders.get(min).firstPeriodIndexInChild;
        List<MediaSourceHolder> list = this.mediaSourceHolders;
        list.add(i2, list.remove(i));
        while (min <= max) {
            MediaSourceHolder mediaSourceHolder = this.mediaSourceHolders.get(min);
            mediaSourceHolder.firstWindowIndexInChild = i3;
            mediaSourceHolder.firstPeriodIndexInChild = i4;
            i3 += mediaSourceHolder.timeline.getWindowCount();
            i4 += mediaSourceHolder.timeline.getPeriodCount();
            min++;
        }
    }

    private void correctOffsets(int i, int i2, int i3, int i4) {
        this.windowCount += i3;
        this.periodCount += i4;
        while (i < this.mediaSourceHolders.size()) {
            this.mediaSourceHolders.get(i).childIndex += i2;
            this.mediaSourceHolders.get(i).firstWindowIndexInChild += i3;
            this.mediaSourceHolders.get(i).firstPeriodIndexInChild += i4;
            i++;
        }
    }

    private static Object getMediaSourceHolderUid(Object obj) {
        return ConcatenatedTimeline.getChildTimelineUidFromConcatenatedUid(obj);
    }

    private static Object getChildPeriodUid(MediaSourceHolder mediaSourceHolder, Object obj) {
        Object childPeriodUidFromConcatenatedUid = ConcatenatedTimeline.getChildPeriodUidFromConcatenatedUid(obj);
        return childPeriodUidFromConcatenatedUid.equals(DeferredTimeline.DUMMY_ID) ? mediaSourceHolder.timeline.replacedId : childPeriodUidFromConcatenatedUid;
    }

    private static Object getPeriodUid(MediaSourceHolder mediaSourceHolder, Object obj) {
        if (mediaSourceHolder.timeline.replacedId.equals(obj)) {
            obj = DeferredTimeline.DUMMY_ID;
        }
        return ConcatenatedTimeline.getConcatenatedUid(mediaSourceHolder.uid, obj);
    }

    static final class MediaSourceHolder implements Comparable<MediaSourceHolder> {
        public List<DeferredMediaPeriod> activeMediaPeriods = new ArrayList();
        public int childIndex;
        public int firstPeriodIndexInChild;
        public int firstWindowIndexInChild;
        public boolean hasStartedPreparing;
        public boolean isPrepared;
        public boolean isRemoved;
        public final MediaSource mediaSource;
        public DeferredTimeline timeline = new DeferredTimeline();
        public final Object uid = new Object();

        public MediaSourceHolder(MediaSource mediaSource2) {
            this.mediaSource = mediaSource2;
        }

        public final void reset(int i, int i2, int i3) {
            this.childIndex = i;
            this.firstWindowIndexInChild = i2;
            this.firstPeriodIndexInChild = i3;
            this.hasStartedPreparing = false;
            this.isPrepared = false;
            this.isRemoved = false;
            this.activeMediaPeriods.clear();
        }

        public final int compareTo(@NonNull MediaSourceHolder mediaSourceHolder) {
            return this.firstPeriodIndexInChild - mediaSourceHolder.firstPeriodIndexInChild;
        }
    }

    static final class MessageData<T> {
        @Nullable
        public final Runnable actionOnCompletion;
        public final T customData;
        public final int index;

        public MessageData(int i, T t, @Nullable Runnable runnable) {
            this.index = i;
            this.actionOnCompletion = runnable;
            this.customData = t;
        }
    }

    static final class ConcatenatedTimeline extends AbstractConcatenatedTimeline {
        private final HashMap<Object, Integer> childIndexByUid = new HashMap<>();
        private final int[] firstPeriodInChildIndices;
        private final int[] firstWindowInChildIndices;
        private final int periodCount;
        private final Timeline[] timelines;
        private final Object[] uids;
        private final int windowCount;

        public ConcatenatedTimeline(Collection<MediaSourceHolder> collection, int i, int i2, ShuffleOrder shuffleOrder, boolean z) {
            super(z, shuffleOrder);
            this.windowCount = i;
            this.periodCount = i2;
            int size = collection.size();
            this.firstPeriodInChildIndices = new int[size];
            this.firstWindowInChildIndices = new int[size];
            this.timelines = new Timeline[size];
            this.uids = new Object[size];
            int i3 = 0;
            for (MediaSourceHolder next : collection) {
                this.timelines[i3] = next.timeline;
                this.firstPeriodInChildIndices[i3] = next.firstPeriodIndexInChild;
                this.firstWindowInChildIndices[i3] = next.firstWindowIndexInChild;
                this.uids[i3] = next.uid;
                this.childIndexByUid.put(this.uids[i3], Integer.valueOf(i3));
                i3++;
            }
        }

        /* access modifiers changed from: protected */
        public final int getChildIndexByPeriodIndex(int i) {
            return Util.binarySearchFloor(this.firstPeriodInChildIndices, i + 1, false, false);
        }

        /* access modifiers changed from: protected */
        public final int getChildIndexByWindowIndex(int i) {
            return Util.binarySearchFloor(this.firstWindowInChildIndices, i + 1, false, false);
        }

        /* access modifiers changed from: protected */
        public final int getChildIndexByChildUid(Object obj) {
            Integer num = this.childIndexByUid.get(obj);
            if (num == null) {
                return -1;
            }
            return num.intValue();
        }

        /* access modifiers changed from: protected */
        public final Timeline getTimelineByChildIndex(int i) {
            return this.timelines[i];
        }

        /* access modifiers changed from: protected */
        public final int getFirstPeriodIndexByChildIndex(int i) {
            return this.firstPeriodInChildIndices[i];
        }

        /* access modifiers changed from: protected */
        public final int getFirstWindowIndexByChildIndex(int i) {
            return this.firstWindowInChildIndices[i];
        }

        /* access modifiers changed from: protected */
        public final Object getChildUidByChildIndex(int i) {
            return this.uids[i];
        }

        public final int getWindowCount() {
            return this.windowCount;
        }

        public final int getPeriodCount() {
            return this.periodCount;
        }
    }

    static final class DeferredTimeline extends ForwardingTimeline {
        /* access modifiers changed from: private */
        public static final Object DUMMY_ID = new Object();
        private static final DummyTimeline dummyTimeline = new DummyTimeline();
        /* access modifiers changed from: private */
        public final Object replacedId;

        public DeferredTimeline() {
            this(dummyTimeline, DUMMY_ID);
        }

        private DeferredTimeline(Timeline timeline, Object obj) {
            super(timeline);
            this.replacedId = obj;
        }

        public final DeferredTimeline cloneWithNewTimeline(Timeline timeline) {
            return new DeferredTimeline(timeline, (this.replacedId != DUMMY_ID || timeline.getPeriodCount() <= 0) ? this.replacedId : timeline.getUidOfPeriod(0));
        }

        public final Timeline getTimeline() {
            return this.timeline;
        }

        public final Timeline.Period getPeriod(int i, Timeline.Period period, boolean z) {
            this.timeline.getPeriod(i, period, z);
            if (Util.areEqual(period.uid, this.replacedId)) {
                period.uid = DUMMY_ID;
            }
            return period;
        }

        public final int getIndexOfPeriod(Object obj) {
            Timeline timeline = this.timeline;
            if (DUMMY_ID.equals(obj)) {
                obj = this.replacedId;
            }
            return timeline.getIndexOfPeriod(obj);
        }

        public final Object getUidOfPeriod(int i) {
            int max = dispatchOnCancelled.setMax(i);
            if (i != max) {
                onCanceled oncanceled = new onCanceled(i, max, 1);
                onCancelLoad.setMax(1324675388, oncanceled);
                onCancelLoad.getMin(1324675388, oncanceled);
            }
            Object uidOfPeriod = this.timeline.getUidOfPeriod(i);
            return Util.areEqual(uidOfPeriod, this.replacedId) ? DUMMY_ID : uidOfPeriod;
        }
    }

    static final class DummyTimeline extends Timeline {
        public final int getPeriodCount() {
            return 1;
        }

        public final int getWindowCount() {
            return 1;
        }

        private DummyTimeline() {
        }

        public final Timeline.Window getWindow(int i, Timeline.Window window, boolean z, long j) {
            return window.set((Object) null, C.TIME_UNSET, C.TIME_UNSET, false, true, 0, C.TIME_UNSET, 0, 0, 0);
        }

        public final Timeline.Period getPeriod(int i, Timeline.Period period, boolean z) {
            return period.set(0, DeferredTimeline.DUMMY_ID, 0, C.TIME_UNSET, 0);
        }

        public final int getIndexOfPeriod(Object obj) {
            return obj == DeferredTimeline.DUMMY_ID ? 0 : -1;
        }

        public final Object getUidOfPeriod(int i) {
            return DeferredTimeline.DUMMY_ID;
        }
    }

    static final class DummyMediaSource extends BaseMediaSource {
        public final void maybeThrowSourceInfoRefreshError() throws IOException {
        }

        /* access modifiers changed from: protected */
        public final void prepareSourceInternal(ExoPlayer exoPlayer, boolean z, @Nullable TransferListener transferListener) {
        }

        public final void releasePeriod(MediaPeriod mediaPeriod) {
        }

        /* access modifiers changed from: protected */
        public final void releaseSourceInternal() {
        }

        private DummyMediaSource() {
        }

        public final MediaPeriod createPeriod(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator) {
            throw new UnsupportedOperationException();
        }
    }
}
