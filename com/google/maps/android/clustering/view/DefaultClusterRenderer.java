package com.google.maps.android.clustering.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import android.util.SparseArray;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import androidx.annotation.NonNull;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.Projection;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.maps.android.R;
import com.google.maps.android.clustering.Cluster;
import com.google.maps.android.clustering.ClusterItem;
import com.google.maps.android.clustering.ClusterManager;
import com.google.maps.android.collections.MarkerManager;
import com.google.maps.android.geometry.Point;
import com.google.maps.android.projection.SphericalMercatorProjection;
import com.google.maps.android.ui.IconGenerator;
import com.google.maps.android.ui.SquareTextView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DefaultClusterRenderer<T extends ClusterItem> implements ClusterRenderer<T> {
    /* access modifiers changed from: private */
    public static final TimeInterpolator ANIMATION_INTERP = new DecelerateInterpolator();
    private static final int[] BUCKETS = {10, 20, 50, 100, 200, 500, 1000};
    /* access modifiers changed from: private */
    public boolean mAnimate;
    /* access modifiers changed from: private */
    public ClusterManager.OnClusterClickListener<T> mClickListener;
    /* access modifiers changed from: private */
    public final ClusterManager<T> mClusterManager;
    /* access modifiers changed from: private */
    public MarkerCache<Cluster<T>> mClusterMarkerCache = new MarkerCache<>();
    /* access modifiers changed from: private */
    public Set<? extends Cluster<T>> mClusters;
    private ShapeDrawable mColoredCircleBackground;
    private final float mDensity;
    private final IconGenerator mIconGenerator;
    private SparseArray<BitmapDescriptor> mIcons = new SparseArray<>();
    /* access modifiers changed from: private */
    public ClusterManager.OnClusterInfoWindowClickListener<T> mInfoWindowClickListener;
    /* access modifiers changed from: private */
    public ClusterManager.OnClusterInfoWindowLongClickListener<T> mInfoWindowLongClickListener;
    /* access modifiers changed from: private */
    public ClusterManager.OnClusterItemClickListener<T> mItemClickListener;
    /* access modifiers changed from: private */
    public ClusterManager.OnClusterItemInfoWindowClickListener<T> mItemInfoWindowClickListener;
    /* access modifiers changed from: private */
    public ClusterManager.OnClusterItemInfoWindowLongClickListener<T> mItemInfoWindowLongClickListener;
    /* access modifiers changed from: private */
    public final GoogleMap mMap;
    /* access modifiers changed from: private */
    public MarkerCache<T> mMarkerCache = new MarkerCache<>();
    /* access modifiers changed from: private */
    public Set<MarkerWithPosition> mMarkers = Collections.newSetFromMap(new ConcurrentHashMap());
    private int mMinClusterSize = 4;
    private final DefaultClusterRenderer<T>.ViewModifier mViewModifier = new ViewModifier();
    /* access modifiers changed from: private */
    public float mZoom;

    /* access modifiers changed from: protected */
    public void onClusterItemRendered(@NonNull T t, @NonNull Marker marker) {
    }

    /* access modifiers changed from: protected */
    public void onClusterRendered(@NonNull Cluster<T> cluster, @NonNull Marker marker) {
    }

    public DefaultClusterRenderer(Context context, GoogleMap googleMap, ClusterManager<T> clusterManager) {
        this.mMap = googleMap;
        this.mAnimate = true;
        this.mDensity = context.getResources().getDisplayMetrics().density;
        IconGenerator iconGenerator = new IconGenerator(context);
        this.mIconGenerator = iconGenerator;
        iconGenerator.setContentView(makeSquareTextView(context));
        this.mIconGenerator.setTextAppearance(R.style.amu_ClusterIcon_TextAppearance);
        this.mIconGenerator.setBackground(makeClusterBackground());
        this.mClusterManager = clusterManager;
    }

    public void onAdd() {
        this.mClusterManager.getMarkerCollection().setOnMarkerClickListener(new GoogleMap.OnMarkerClickListener() {
            public boolean onMarkerClick(Marker marker) {
                return DefaultClusterRenderer.this.mItemClickListener != null && DefaultClusterRenderer.this.mItemClickListener.onClusterItemClick((ClusterItem) DefaultClusterRenderer.this.mMarkerCache.get(marker));
            }
        });
        this.mClusterManager.getMarkerCollection().setOnInfoWindowClickListener(new GoogleMap.OnInfoWindowClickListener() {
            public void onInfoWindowClick(Marker marker) {
                if (DefaultClusterRenderer.this.mItemInfoWindowClickListener != null) {
                    DefaultClusterRenderer.this.mItemInfoWindowClickListener.onClusterItemInfoWindowClick((ClusterItem) DefaultClusterRenderer.this.mMarkerCache.get(marker));
                }
            }
        });
        this.mClusterManager.getMarkerCollection().setOnInfoWindowLongClickListener(new GoogleMap.OnInfoWindowLongClickListener() {
            public void onInfoWindowLongClick(Marker marker) {
                if (DefaultClusterRenderer.this.mItemInfoWindowLongClickListener != null) {
                    DefaultClusterRenderer.this.mItemInfoWindowLongClickListener.onClusterItemInfoWindowLongClick((ClusterItem) DefaultClusterRenderer.this.mMarkerCache.get(marker));
                }
            }
        });
        this.mClusterManager.getClusterMarkerCollection().setOnMarkerClickListener(new GoogleMap.OnMarkerClickListener() {
            public boolean onMarkerClick(Marker marker) {
                return DefaultClusterRenderer.this.mClickListener != null && DefaultClusterRenderer.this.mClickListener.onClusterClick((Cluster) DefaultClusterRenderer.this.mClusterMarkerCache.get(marker));
            }
        });
        this.mClusterManager.getClusterMarkerCollection().setOnInfoWindowClickListener(new GoogleMap.OnInfoWindowClickListener() {
            public void onInfoWindowClick(Marker marker) {
                if (DefaultClusterRenderer.this.mInfoWindowClickListener != null) {
                    DefaultClusterRenderer.this.mInfoWindowClickListener.onClusterInfoWindowClick((Cluster) DefaultClusterRenderer.this.mClusterMarkerCache.get(marker));
                }
            }
        });
        this.mClusterManager.getClusterMarkerCollection().setOnInfoWindowLongClickListener(new GoogleMap.OnInfoWindowLongClickListener() {
            public void onInfoWindowLongClick(Marker marker) {
                if (DefaultClusterRenderer.this.mInfoWindowLongClickListener != null) {
                    DefaultClusterRenderer.this.mInfoWindowLongClickListener.onClusterInfoWindowLongClick((Cluster) DefaultClusterRenderer.this.mClusterMarkerCache.get(marker));
                }
            }
        });
    }

    public void onRemove() {
        this.mClusterManager.getMarkerCollection().setOnMarkerClickListener((GoogleMap.OnMarkerClickListener) null);
        this.mClusterManager.getMarkerCollection().setOnInfoWindowClickListener((GoogleMap.OnInfoWindowClickListener) null);
        this.mClusterManager.getMarkerCollection().setOnInfoWindowLongClickListener((GoogleMap.OnInfoWindowLongClickListener) null);
        this.mClusterManager.getClusterMarkerCollection().setOnMarkerClickListener((GoogleMap.OnMarkerClickListener) null);
        this.mClusterManager.getClusterMarkerCollection().setOnInfoWindowClickListener((GoogleMap.OnInfoWindowClickListener) null);
        this.mClusterManager.getClusterMarkerCollection().setOnInfoWindowLongClickListener((GoogleMap.OnInfoWindowLongClickListener) null);
    }

    private LayerDrawable makeClusterBackground() {
        this.mColoredCircleBackground = new ShapeDrawable(new OvalShape());
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.getPaint().setColor(-2130706433);
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{shapeDrawable, this.mColoredCircleBackground});
        int i = (int) (this.mDensity * 3.0f);
        layerDrawable.setLayerInset(1, i, i, i, i);
        return layerDrawable;
    }

    private SquareTextView makeSquareTextView(Context context) {
        SquareTextView squareTextView = new SquareTextView(context);
        squareTextView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        squareTextView.setId(R.id.amu_text);
        int i = (int) (this.mDensity * 12.0f);
        squareTextView.setPadding(i, i, i, i);
        return squareTextView;
    }

    /* access modifiers changed from: protected */
    public int getColor(int i) {
        float min = 300.0f - Math.min((float) i, 300.0f);
        return Color.HSVToColor(new float[]{((min * min) / 90000.0f) * 220.0f, 1.0f, 0.6f});
    }

    /* access modifiers changed from: protected */
    @NonNull
    public String getClusterText(int i) {
        if (i < BUCKETS[0]) {
            return String.valueOf(i);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        sb.append("+");
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    public int getBucket(@NonNull Cluster<T> cluster) {
        int size = cluster.getSize();
        int i = 0;
        if (size <= BUCKETS[0]) {
            return size;
        }
        while (true) {
            int[] iArr = BUCKETS;
            if (i >= iArr.length - 1) {
                return iArr[iArr.length - 1];
            }
            int i2 = i + 1;
            if (size < iArr[i2]) {
                return iArr[i];
            }
            i = i2;
        }
    }

    public int getMinClusterSize() {
        return this.mMinClusterSize;
    }

    public void setMinClusterSize(int i) {
        this.mMinClusterSize = i;
    }

    @SuppressLint({"HandlerLeak"})
    class ViewModifier extends Handler {
        private static final int RUN_TASK = 0;
        private static final int TASK_FINISHED = 1;
        private DefaultClusterRenderer<T>.RenderTask mNextClusters;
        private boolean mViewModificationInProgress;

        private ViewModifier() {
            this.mViewModificationInProgress = false;
            this.mNextClusters = null;
        }

        public void handleMessage(Message message) {
            DefaultClusterRenderer<T>.RenderTask renderTask;
            if (message.what == 1) {
                this.mViewModificationInProgress = false;
                if (this.mNextClusters != null) {
                    sendEmptyMessage(0);
                    return;
                }
                return;
            }
            removeMessages(0);
            if (!this.mViewModificationInProgress && this.mNextClusters != null) {
                Projection projection = DefaultClusterRenderer.this.mMap.getProjection();
                synchronized (this) {
                    renderTask = this.mNextClusters;
                    this.mNextClusters = null;
                    this.mViewModificationInProgress = true;
                }
                renderTask.setCallback(new Runnable() {
                    public void run() {
                        ViewModifier.this.sendEmptyMessage(1);
                    }
                });
                renderTask.setProjection(projection);
                renderTask.setMapZoom(DefaultClusterRenderer.this.mMap.getCameraPosition().zoom);
                new Thread(renderTask).start();
            }
        }

        public void queue(Set<? extends Cluster<T>> set) {
            synchronized (this) {
                this.mNextClusters = new RenderTask(set);
            }
            sendEmptyMessage(0);
        }
    }

    /* access modifiers changed from: protected */
    public boolean shouldRenderAsCluster(@NonNull Cluster<T> cluster) {
        return cluster.getSize() > this.mMinClusterSize;
    }

    class RenderTask implements Runnable {
        final Set<? extends Cluster<T>> clusters;
        private Runnable mCallback;
        private float mMapZoom;
        private Projection mProjection;
        private SphericalMercatorProjection mSphericalMercatorProjection;

        private RenderTask(Set<? extends Cluster<T>> set) {
            this.clusters = set;
        }

        public void setCallback(Runnable runnable) {
            this.mCallback = runnable;
        }

        public void setProjection(Projection projection) {
            this.mProjection = projection;
        }

        public void setMapZoom(float f) {
            this.mMapZoom = f;
            this.mSphericalMercatorProjection = new SphericalMercatorProjection(Math.pow(2.0d, (double) Math.min(f, DefaultClusterRenderer.this.mZoom)) * 256.0d);
        }

        @SuppressLint({"NewApi"})
        public void run() {
            LatLngBounds latLngBounds;
            ArrayList arrayList;
            if (this.clusters.equals(DefaultClusterRenderer.this.mClusters)) {
                this.mCallback.run();
                return;
            }
            ArrayList arrayList2 = null;
            MarkerModifier markerModifier = new MarkerModifier();
            float f = this.mMapZoom;
            boolean z = f > DefaultClusterRenderer.this.mZoom;
            float access$1200 = f - DefaultClusterRenderer.this.mZoom;
            Set<MarkerWithPosition> access$1500 = DefaultClusterRenderer.this.mMarkers;
            try {
                latLngBounds = this.mProjection.getVisibleRegion().latLngBounds;
            } catch (Exception unused) {
                latLngBounds = LatLngBounds.builder().include(new LatLng(0.0d, 0.0d)).build();
            }
            if (DefaultClusterRenderer.this.mClusters == null || !DefaultClusterRenderer.this.mAnimate) {
                arrayList = null;
            } else {
                arrayList = new ArrayList();
                for (Cluster cluster : DefaultClusterRenderer.this.mClusters) {
                    if (DefaultClusterRenderer.this.shouldRenderAsCluster(cluster) && latLngBounds.contains(cluster.getPosition())) {
                        arrayList.add(this.mSphericalMercatorProjection.toPoint(cluster.getPosition()));
                    }
                }
            }
            Set newSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
            for (Cluster cluster2 : this.clusters) {
                boolean contains = latLngBounds.contains(cluster2.getPosition());
                if (!z || !contains || !DefaultClusterRenderer.this.mAnimate) {
                    markerModifier.add(contains, new CreateMarkerTask(cluster2, newSetFromMap, (LatLng) null));
                } else {
                    Point access$1700 = DefaultClusterRenderer.this.findClosestCluster(arrayList, this.mSphericalMercatorProjection.toPoint(cluster2.getPosition()));
                    if (access$1700 != null) {
                        markerModifier.add(true, new CreateMarkerTask(cluster2, newSetFromMap, this.mSphericalMercatorProjection.toLatLng(access$1700)));
                    } else {
                        markerModifier.add(true, new CreateMarkerTask(cluster2, newSetFromMap, (LatLng) null));
                    }
                }
            }
            markerModifier.waitUntilFree();
            access$1500.removeAll(newSetFromMap);
            if (DefaultClusterRenderer.this.mAnimate) {
                arrayList2 = new ArrayList();
                for (Cluster cluster3 : this.clusters) {
                    if (DefaultClusterRenderer.this.shouldRenderAsCluster(cluster3) && latLngBounds.contains(cluster3.getPosition())) {
                        arrayList2.add(this.mSphericalMercatorProjection.toPoint(cluster3.getPosition()));
                    }
                }
            }
            for (MarkerWithPosition markerWithPosition : access$1500) {
                boolean contains2 = latLngBounds.contains(markerWithPosition.position);
                if (z || access$1200 <= -3.0f || !contains2 || !DefaultClusterRenderer.this.mAnimate) {
                    markerModifier.remove(contains2, markerWithPosition.marker);
                } else {
                    Point access$17002 = DefaultClusterRenderer.this.findClosestCluster(arrayList2, this.mSphericalMercatorProjection.toPoint(markerWithPosition.position));
                    if (access$17002 != null) {
                        markerModifier.animateThenRemove(markerWithPosition, markerWithPosition.position, this.mSphericalMercatorProjection.toLatLng(access$17002));
                    } else {
                        markerModifier.remove(true, markerWithPosition.marker);
                    }
                }
            }
            markerModifier.waitUntilFree();
            Set unused2 = DefaultClusterRenderer.this.mMarkers = newSetFromMap;
            Set unused3 = DefaultClusterRenderer.this.mClusters = this.clusters;
            float unused4 = DefaultClusterRenderer.this.mZoom = f;
            this.mCallback.run();
        }
    }

    public void onClustersChanged(Set<? extends Cluster<T>> set) {
        this.mViewModifier.queue(set);
    }

    public void setOnClusterClickListener(ClusterManager.OnClusterClickListener<T> onClusterClickListener) {
        this.mClickListener = onClusterClickListener;
    }

    public void setOnClusterInfoWindowClickListener(ClusterManager.OnClusterInfoWindowClickListener<T> onClusterInfoWindowClickListener) {
        this.mInfoWindowClickListener = onClusterInfoWindowClickListener;
    }

    public void setOnClusterInfoWindowLongClickListener(ClusterManager.OnClusterInfoWindowLongClickListener<T> onClusterInfoWindowLongClickListener) {
        this.mInfoWindowLongClickListener = onClusterInfoWindowLongClickListener;
    }

    public void setOnClusterItemClickListener(ClusterManager.OnClusterItemClickListener<T> onClusterItemClickListener) {
        this.mItemClickListener = onClusterItemClickListener;
    }

    public void setOnClusterItemInfoWindowClickListener(ClusterManager.OnClusterItemInfoWindowClickListener<T> onClusterItemInfoWindowClickListener) {
        this.mItemInfoWindowClickListener = onClusterItemInfoWindowClickListener;
    }

    public void setOnClusterItemInfoWindowLongClickListener(ClusterManager.OnClusterItemInfoWindowLongClickListener<T> onClusterItemInfoWindowLongClickListener) {
        this.mItemInfoWindowLongClickListener = onClusterItemInfoWindowLongClickListener;
    }

    public void setAnimation(boolean z) {
        this.mAnimate = z;
    }

    private static double distanceSquared(Point point, Point point2) {
        return ((point.x - point2.x) * (point.x - point2.x)) + ((point.y - point2.y) * (point.y - point2.y));
    }

    /* access modifiers changed from: private */
    public Point findClosestCluster(List<Point> list, Point point) {
        Point point2 = null;
        if (list != null && !list.isEmpty()) {
            int maxDistanceBetweenClusteredItems = this.mClusterManager.getAlgorithm().getMaxDistanceBetweenClusteredItems();
            double d = (double) (maxDistanceBetweenClusteredItems * maxDistanceBetweenClusteredItems);
            for (Point next : list) {
                double distanceSquared = distanceSquared(next, point);
                if (distanceSquared < d) {
                    point2 = next;
                    d = distanceSquared;
                }
            }
        }
        return point2;
    }

    @SuppressLint({"HandlerLeak"})
    class MarkerModifier extends Handler implements MessageQueue.IdleHandler {
        private static final int BLANK = 0;
        private final Condition busyCondition;
        private final Lock lock;
        private Queue<DefaultClusterRenderer<T>.AnimationTask> mAnimationTasks;
        private Queue<DefaultClusterRenderer<T>.CreateMarkerTask> mCreateMarkerTasks;
        private boolean mListenerAdded;
        private Queue<DefaultClusterRenderer<T>.CreateMarkerTask> mOnScreenCreateMarkerTasks;
        private Queue<Marker> mOnScreenRemoveMarkerTasks;
        private Queue<Marker> mRemoveMarkerTasks;

        private MarkerModifier() {
            super(Looper.getMainLooper());
            ReentrantLock reentrantLock = new ReentrantLock();
            this.lock = reentrantLock;
            this.busyCondition = reentrantLock.newCondition();
            this.mCreateMarkerTasks = new LinkedList();
            this.mOnScreenCreateMarkerTasks = new LinkedList();
            this.mRemoveMarkerTasks = new LinkedList();
            this.mOnScreenRemoveMarkerTasks = new LinkedList();
            this.mAnimationTasks = new LinkedList();
        }

        public void add(boolean z, DefaultClusterRenderer<T>.CreateMarkerTask createMarkerTask) {
            this.lock.lock();
            sendEmptyMessage(0);
            if (z) {
                this.mOnScreenCreateMarkerTasks.add(createMarkerTask);
            } else {
                this.mCreateMarkerTasks.add(createMarkerTask);
            }
            this.lock.unlock();
        }

        public void remove(boolean z, Marker marker) {
            this.lock.lock();
            sendEmptyMessage(0);
            if (z) {
                this.mOnScreenRemoveMarkerTasks.add(marker);
            } else {
                this.mRemoveMarkerTasks.add(marker);
            }
            this.lock.unlock();
        }

        public void animate(MarkerWithPosition markerWithPosition, LatLng latLng, LatLng latLng2) {
            this.lock.lock();
            this.mAnimationTasks.add(new AnimationTask(markerWithPosition, latLng, latLng2));
            this.lock.unlock();
        }

        @TargetApi(11)
        public void animateThenRemove(MarkerWithPosition markerWithPosition, LatLng latLng, LatLng latLng2) {
            this.lock.lock();
            AnimationTask animationTask = new AnimationTask(markerWithPosition, latLng, latLng2);
            animationTask.removeOnAnimationComplete(DefaultClusterRenderer.this.mClusterManager.getMarkerManager());
            this.mAnimationTasks.add(animationTask);
            this.lock.unlock();
        }

        public void handleMessage(Message message) {
            if (!this.mListenerAdded) {
                Looper.myQueue().addIdleHandler(this);
                this.mListenerAdded = true;
            }
            removeMessages(0);
            this.lock.lock();
            int i = 0;
            while (i < 10) {
                try {
                    performNextTask();
                    i++;
                } catch (Throwable th) {
                    this.lock.unlock();
                    throw th;
                }
            }
            if (!isBusy()) {
                this.mListenerAdded = false;
                Looper.myQueue().removeIdleHandler(this);
                this.busyCondition.signalAll();
            } else {
                sendEmptyMessageDelayed(0, 10);
            }
            this.lock.unlock();
        }

        @TargetApi(11)
        private void performNextTask() {
            if (!this.mOnScreenRemoveMarkerTasks.isEmpty()) {
                removeMarker(this.mOnScreenRemoveMarkerTasks.poll());
            } else if (!this.mAnimationTasks.isEmpty()) {
                this.mAnimationTasks.poll().perform();
            } else if (!this.mOnScreenCreateMarkerTasks.isEmpty()) {
                this.mOnScreenCreateMarkerTasks.poll().perform(this);
            } else if (!this.mCreateMarkerTasks.isEmpty()) {
                this.mCreateMarkerTasks.poll().perform(this);
            } else if (!this.mRemoveMarkerTasks.isEmpty()) {
                removeMarker(this.mRemoveMarkerTasks.poll());
            }
        }

        private void removeMarker(Marker marker) {
            DefaultClusterRenderer.this.mMarkerCache.remove(marker);
            DefaultClusterRenderer.this.mClusterMarkerCache.remove(marker);
            DefaultClusterRenderer.this.mClusterManager.getMarkerManager().remove(marker);
        }

        public boolean isBusy() {
            try {
                this.lock.lock();
                return !this.mCreateMarkerTasks.isEmpty() || !this.mOnScreenCreateMarkerTasks.isEmpty() || !this.mOnScreenRemoveMarkerTasks.isEmpty() || !this.mRemoveMarkerTasks.isEmpty() || !this.mAnimationTasks.isEmpty();
            } finally {
                this.lock.unlock();
            }
        }

        public void waitUntilFree() {
            while (isBusy()) {
                sendEmptyMessage(0);
                this.lock.lock();
                try {
                    if (isBusy()) {
                        this.busyCondition.await();
                    }
                    this.lock.unlock();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                } catch (Throwable th) {
                    this.lock.unlock();
                    throw th;
                }
            }
        }

        public boolean queueIdle() {
            sendEmptyMessage(0);
            return true;
        }
    }

    static class MarkerCache<T> {
        private Map<T, Marker> mCache;
        private Map<Marker, T> mCacheReverse;

        private MarkerCache() {
            this.mCache = new HashMap();
            this.mCacheReverse = new HashMap();
        }

        public Marker get(T t) {
            return this.mCache.get(t);
        }

        public T get(Marker marker) {
            return this.mCacheReverse.get(marker);
        }

        public void put(T t, Marker marker) {
            this.mCache.put(t, marker);
            this.mCacheReverse.put(marker, t);
        }

        public void remove(Marker marker) {
            T t = this.mCacheReverse.get(marker);
            this.mCacheReverse.remove(marker);
            this.mCache.remove(t);
        }
    }

    /* access modifiers changed from: protected */
    public void onBeforeClusterItemRendered(@NonNull T t, @NonNull MarkerOptions markerOptions) {
        if (t.getTitle() != null && t.getSnippet() != null) {
            markerOptions.title(t.getTitle());
            markerOptions.snippet(t.getSnippet());
        } else if (t.getTitle() != null) {
            markerOptions.title(t.getTitle());
        } else if (t.getSnippet() != null) {
            markerOptions.title(t.getSnippet());
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onClusterItemUpdated(@androidx.annotation.NonNull T r5, @androidx.annotation.NonNull com.google.android.gms.maps.model.Marker r6) {
        /*
            r4 = this;
            java.lang.String r0 = r5.getTitle()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x003a
            java.lang.String r0 = r5.getSnippet()
            if (r0 == 0) goto L_0x003a
            java.lang.String r0 = r5.getTitle()
            java.lang.String r3 = r6.getTitle()
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x0024
            java.lang.String r0 = r5.getTitle()
            r6.setTitle(r0)
            r2 = 1
        L_0x0024:
            java.lang.String r0 = r5.getSnippet()
            java.lang.String r3 = r6.getSnippet()
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x0073
            java.lang.String r0 = r5.getSnippet()
            r6.setSnippet(r0)
            goto L_0x0055
        L_0x003a:
            java.lang.String r0 = r5.getSnippet()
            if (r0 == 0) goto L_0x0057
            java.lang.String r0 = r5.getSnippet()
            java.lang.String r3 = r6.getTitle()
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x0057
            java.lang.String r0 = r5.getSnippet()
            r6.setTitle(r0)
        L_0x0055:
            r2 = 1
            goto L_0x0073
        L_0x0057:
            java.lang.String r0 = r5.getTitle()
            if (r0 == 0) goto L_0x0073
            java.lang.String r0 = r5.getTitle()
            java.lang.String r3 = r6.getTitle()
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x0073
            java.lang.String r0 = r5.getTitle()
            r6.setTitle(r0)
            goto L_0x0055
        L_0x0073:
            com.google.android.gms.maps.model.LatLng r0 = r6.getPosition()
            com.google.android.gms.maps.model.LatLng r3 = r5.getPosition()
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x0089
            com.google.android.gms.maps.model.LatLng r5 = r5.getPosition()
            r6.setPosition(r5)
            goto L_0x008a
        L_0x0089:
            r1 = r2
        L_0x008a:
            if (r1 == 0) goto L_0x0095
            boolean r5 = r6.isInfoWindowShown()
            if (r5 == 0) goto L_0x0095
            r6.showInfoWindow()
        L_0x0095:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.maps.android.clustering.view.DefaultClusterRenderer.onClusterItemUpdated(com.google.maps.android.clustering.ClusterItem, com.google.android.gms.maps.model.Marker):void");
    }

    /* access modifiers changed from: protected */
    public void onBeforeClusterRendered(@NonNull Cluster<T> cluster, @NonNull MarkerOptions markerOptions) {
        markerOptions.icon(getDescriptorForCluster(cluster));
    }

    /* access modifiers changed from: protected */
    @NonNull
    public BitmapDescriptor getDescriptorForCluster(@NonNull Cluster<T> cluster) {
        int bucket = getBucket(cluster);
        BitmapDescriptor bitmapDescriptor = this.mIcons.get(bucket);
        if (bitmapDescriptor != null) {
            return bitmapDescriptor;
        }
        this.mColoredCircleBackground.getPaint().setColor(getColor(bucket));
        BitmapDescriptor fromBitmap = BitmapDescriptorFactory.fromBitmap(this.mIconGenerator.makeIcon(getClusterText(bucket)));
        this.mIcons.put(bucket, fromBitmap);
        return fromBitmap;
    }

    /* access modifiers changed from: protected */
    public void onClusterUpdated(@NonNull Cluster<T> cluster, @NonNull Marker marker) {
        marker.setIcon(getDescriptorForCluster(cluster));
    }

    public Marker getMarker(T t) {
        return this.mMarkerCache.get(t);
    }

    public T getClusterItem(Marker marker) {
        return (ClusterItem) this.mMarkerCache.get(marker);
    }

    public Marker getMarker(Cluster<T> cluster) {
        return this.mClusterMarkerCache.get(cluster);
    }

    public Cluster<T> getCluster(Marker marker) {
        return this.mClusterMarkerCache.get(marker);
    }

    class CreateMarkerTask {
        private final LatLng animateFrom;
        private final Cluster<T> cluster;
        private final Set<MarkerWithPosition> newMarkers;

        public CreateMarkerTask(Cluster<T> cluster2, Set<MarkerWithPosition> set, LatLng latLng) {
            this.cluster = cluster2;
            this.newMarkers = set;
            this.animateFrom = latLng;
        }

        /* access modifiers changed from: private */
        public void perform(DefaultClusterRenderer<T>.MarkerModifier markerModifier) {
            MarkerWithPosition markerWithPosition;
            MarkerWithPosition markerWithPosition2;
            if (!DefaultClusterRenderer.this.shouldRenderAsCluster(this.cluster)) {
                for (T t : this.cluster.getItems()) {
                    Marker marker = DefaultClusterRenderer.this.mMarkerCache.get(t);
                    if (marker == null) {
                        MarkerOptions markerOptions = new MarkerOptions();
                        LatLng latLng = this.animateFrom;
                        if (latLng != null) {
                            markerOptions.position(latLng);
                        } else {
                            markerOptions.position(t.getPosition());
                        }
                        DefaultClusterRenderer.this.onBeforeClusterItemRendered(t, markerOptions);
                        marker = DefaultClusterRenderer.this.mClusterManager.getMarkerCollection().addMarker(markerOptions);
                        markerWithPosition2 = new MarkerWithPosition(marker);
                        DefaultClusterRenderer.this.mMarkerCache.put(t, marker);
                        LatLng latLng2 = this.animateFrom;
                        if (latLng2 != null) {
                            markerModifier.animate(markerWithPosition2, latLng2, t.getPosition());
                        }
                    } else {
                        markerWithPosition2 = new MarkerWithPosition(marker);
                        DefaultClusterRenderer.this.onClusterItemUpdated(t, marker);
                    }
                    DefaultClusterRenderer.this.onClusterItemRendered(t, marker);
                    this.newMarkers.add(markerWithPosition2);
                }
                return;
            }
            Marker marker2 = DefaultClusterRenderer.this.mClusterMarkerCache.get(this.cluster);
            if (marker2 == null) {
                MarkerOptions markerOptions2 = new MarkerOptions();
                LatLng latLng3 = this.animateFrom;
                if (latLng3 == null) {
                    latLng3 = this.cluster.getPosition();
                }
                MarkerOptions position = markerOptions2.position(latLng3);
                DefaultClusterRenderer.this.onBeforeClusterRendered(this.cluster, position);
                marker2 = DefaultClusterRenderer.this.mClusterManager.getClusterMarkerCollection().addMarker(position);
                DefaultClusterRenderer.this.mClusterMarkerCache.put(this.cluster, marker2);
                markerWithPosition = new MarkerWithPosition(marker2);
                LatLng latLng4 = this.animateFrom;
                if (latLng4 != null) {
                    markerModifier.animate(markerWithPosition, latLng4, this.cluster.getPosition());
                }
            } else {
                markerWithPosition = new MarkerWithPosition(marker2);
                DefaultClusterRenderer.this.onClusterUpdated(this.cluster, marker2);
            }
            DefaultClusterRenderer.this.onClusterRendered(this.cluster, marker2);
            this.newMarkers.add(markerWithPosition);
        }
    }

    static class MarkerWithPosition {
        /* access modifiers changed from: private */
        public final Marker marker;
        /* access modifiers changed from: private */
        public LatLng position;

        private MarkerWithPosition(Marker marker2) {
            this.marker = marker2;
            this.position = marker2.getPosition();
        }

        public boolean equals(Object obj) {
            if (obj instanceof MarkerWithPosition) {
                return this.marker.equals(((MarkerWithPosition) obj).marker);
            }
            return false;
        }

        public int hashCode() {
            return this.marker.hashCode();
        }
    }

    @TargetApi(12)
    class AnimationTask extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {
        private final LatLng from;
        private MarkerManager mMarkerManager;
        private boolean mRemoveOnComplete;
        private final Marker marker;
        private final MarkerWithPosition markerWithPosition;
        private final LatLng to;

        private AnimationTask(MarkerWithPosition markerWithPosition2, LatLng latLng, LatLng latLng2) {
            this.markerWithPosition = markerWithPosition2;
            this.marker = markerWithPosition2.marker;
            this.from = latLng;
            this.to = latLng2;
        }

        public void perform() {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
            ofFloat.setInterpolator(DefaultClusterRenderer.ANIMATION_INTERP);
            ofFloat.addUpdateListener(this);
            ofFloat.addListener(this);
            ofFloat.start();
        }

        public void onAnimationEnd(Animator animator) {
            if (this.mRemoveOnComplete) {
                DefaultClusterRenderer.this.mMarkerCache.remove(this.marker);
                DefaultClusterRenderer.this.mClusterMarkerCache.remove(this.marker);
                this.mMarkerManager.remove(this.marker);
            }
            LatLng unused = this.markerWithPosition.position = this.to;
        }

        public void removeOnAnimationComplete(MarkerManager markerManager) {
            this.mMarkerManager = markerManager;
            this.mRemoveOnComplete = true;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float animatedFraction = valueAnimator.getAnimatedFraction();
            double d = this.to.latitude - this.from.latitude;
            double d2 = (double) animatedFraction;
            Double.isNaN(d2);
            double d3 = (d * d2) + this.from.latitude;
            double d4 = this.to.longitude - this.from.longitude;
            if (Math.abs(d4) > 180.0d) {
                d4 -= Math.signum(d4) * 360.0d;
            }
            Double.isNaN(d2);
            this.marker.setPosition(new LatLng(d3, (d4 * d2) + this.from.longitude));
        }
    }
}
