package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.InflateException;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.view.ViewCompat;
import com.alibaba.griver.ui.ant.utils.AUScreenAdaptTool;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;
import o.PlaybackStateCompat;
import o.dismissPopups;
import o.haltActionBarHideOffsetAnimations;
import o.hasIcon;
import o.initFeature;
import o.onStartNestedScroll;
import o.setActionBarHideOffset;
import o.setOverflowIcon;

public abstract class Transition implements Cloneable {
    static final boolean DBG = false;
    private static final int[] DEFAULT_MATCH_ORDER = {2, 1, 3, 4};
    private static final String LOG_TAG = "Transition";
    private static final int MATCH_FIRST = 1;
    public static final int MATCH_ID = 3;
    private static final String MATCH_ID_STR = "id";
    public static final int MATCH_INSTANCE = 1;
    private static final String MATCH_INSTANCE_STR = "instance";
    public static final int MATCH_ITEM_ID = 4;
    private static final String MATCH_ITEM_ID_STR = "itemId";
    private static final int MATCH_LAST = 4;
    public static final int MATCH_NAME = 2;
    private static final String MATCH_NAME_STR = "name";
    private static final PathMotion STRAIGHT_PATH_MOTION = new PathMotion() {
        public final Path getPath(float f, float f2, float f3, float f4) {
            Path path = new Path();
            path.moveTo(f, f2);
            path.lineTo(f3, f4);
            return path;
        }
    };
    private static ThreadLocal<PlaybackStateCompat<Animator, getMin>> sRunningAnimators = new ThreadLocal<>();
    private ArrayList<Animator> mAnimators;
    boolean mCanRemoveViews;
    ArrayList<Animator> mCurrentAnimators;
    long mDuration;
    private initFeature mEndValues;
    private ArrayList<hasIcon> mEndValuesList;
    private boolean mEnded;
    private length mEpicenterCallback;
    private TimeInterpolator mInterpolator;
    private ArrayList<getMax> mListeners;
    private int[] mMatchOrder;
    private String mName;
    private PlaybackStateCompat<String, String> mNameOverrides;
    private int mNumInstances;
    public TransitionSet mParent;
    private PathMotion mPathMotion;
    private boolean mPaused;
    haltActionBarHideOffsetAnimations mPropagation;
    private ViewGroup mSceneRoot;
    private long mStartDelay;
    private initFeature mStartValues;
    private ArrayList<hasIcon> mStartValuesList;
    private ArrayList<View> mTargetChildExcludes;
    private ArrayList<View> mTargetExcludes;
    private ArrayList<Integer> mTargetIdChildExcludes;
    private ArrayList<Integer> mTargetIdExcludes;
    ArrayList<Integer> mTargetIds;
    private ArrayList<String> mTargetNameExcludes;
    private ArrayList<String> mTargetNames;
    private ArrayList<Class<?>> mTargetTypeChildExcludes;
    private ArrayList<Class<?>> mTargetTypeExcludes;
    private ArrayList<Class<?>> mTargetTypes;
    ArrayList<View> mTargets;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface MatchOrder {
    }

    public interface getMax {
        void onTransitionCancel(@NonNull Transition transition);

        void onTransitionEnd(@NonNull Transition transition);

        void onTransitionPause(@NonNull Transition transition);

        void onTransitionResume(@NonNull Transition transition);

        void onTransitionStart(@NonNull Transition transition);
    }

    public static abstract class length {
        public abstract Rect getMax();
    }

    private static boolean isValidMatch(int i) {
        return i > 0 && i <= 4;
    }

    public abstract void captureEndValues(@NonNull hasIcon hasicon);

    public abstract void captureStartValues(@NonNull hasIcon hasicon);

    @Nullable
    public Animator createAnimator(@NonNull ViewGroup viewGroup, @Nullable hasIcon hasicon, @Nullable hasIcon hasicon2) {
        return null;
    }

    @Nullable
    public String[] getTransitionProperties() {
        return null;
    }

    public Transition() {
        this.mName = getClass().getName();
        this.mStartDelay = -1;
        this.mDuration = -1;
        this.mInterpolator = null;
        this.mTargetIds = new ArrayList<>();
        this.mTargets = new ArrayList<>();
        this.mTargetNames = null;
        this.mTargetTypes = null;
        this.mTargetIdExcludes = null;
        this.mTargetExcludes = null;
        this.mTargetTypeExcludes = null;
        this.mTargetNameExcludes = null;
        this.mTargetIdChildExcludes = null;
        this.mTargetChildExcludes = null;
        this.mTargetTypeChildExcludes = null;
        this.mStartValues = new initFeature();
        this.mEndValues = new initFeature();
        this.mParent = null;
        this.mMatchOrder = DEFAULT_MATCH_ORDER;
        this.mSceneRoot = null;
        this.mCanRemoveViews = false;
        this.mCurrentAnimators = new ArrayList<>();
        this.mNumInstances = 0;
        this.mPaused = false;
        this.mEnded = false;
        this.mListeners = null;
        this.mAnimators = new ArrayList<>();
        this.mPathMotion = STRAIGHT_PATH_MOTION;
    }

    @SuppressLint({"RestrictedApi"})
    public Transition(Context context, AttributeSet attributeSet) {
        int i;
        this.mName = getClass().getName();
        this.mStartDelay = -1;
        this.mDuration = -1;
        String str = null;
        this.mInterpolator = null;
        this.mTargetIds = new ArrayList<>();
        this.mTargets = new ArrayList<>();
        this.mTargetNames = null;
        this.mTargetTypes = null;
        this.mTargetIdExcludes = null;
        this.mTargetExcludes = null;
        this.mTargetTypeExcludes = null;
        this.mTargetNameExcludes = null;
        this.mTargetIdChildExcludes = null;
        this.mTargetChildExcludes = null;
        this.mTargetTypeChildExcludes = null;
        this.mStartValues = new initFeature();
        this.mEndValues = new initFeature();
        this.mParent = null;
        this.mMatchOrder = DEFAULT_MATCH_ORDER;
        this.mSceneRoot = null;
        int i2 = 0;
        this.mCanRemoveViews = false;
        this.mCurrentAnimators = new ArrayList<>();
        this.mNumInstances = 0;
        this.mPaused = false;
        this.mEnded = false;
        this.mListeners = null;
        this.mAnimators = new ArrayList<>();
        this.mPathMotion = STRAIGHT_PATH_MOTION;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, setActionBarHideOffset.getMin);
        XmlResourceParser xmlResourceParser = (XmlResourceParser) attributeSet;
        int i3 = -1;
        if (!o.NonNull.setMin(xmlResourceParser, "duration")) {
            i = -1;
        } else {
            i = obtainStyledAttributes.getInt(1, -1);
        }
        long j = (long) i;
        if (j >= 0) {
            setDuration(j);
        }
        long j2 = (long) (o.NonNull.setMin(xmlResourceParser, "startDelay") ? obtainStyledAttributes.getInt(2, -1) : i3);
        if (j2 > 0) {
            setStartDelay(j2);
        }
        i2 = o.NonNull.setMin(xmlResourceParser, "interpolator") ? obtainStyledAttributes.getResourceId(0, 0) : i2;
        if (i2 > 0) {
            setInterpolator(AnimationUtils.loadInterpolator(context, i2));
        }
        str = o.NonNull.setMin(xmlResourceParser, "matchOrder") ? obtainStyledAttributes.getString(3) : str;
        if (str != null) {
            setMatchOrder(parseMatchOrder(str));
        }
        obtainStyledAttributes.recycle();
    }

    private static int[] parseMatchOrder(String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(str, ",");
        int[] iArr = new int[stringTokenizer.countTokens()];
        int i = 0;
        while (stringTokenizer.hasMoreTokens()) {
            String trim = stringTokenizer.nextToken().trim();
            if ("id".equalsIgnoreCase(trim)) {
                iArr[i] = 3;
            } else if (MATCH_INSTANCE_STR.equalsIgnoreCase(trim)) {
                iArr[i] = 1;
            } else if ("name".equalsIgnoreCase(trim)) {
                iArr[i] = 2;
            } else if (MATCH_ITEM_ID_STR.equalsIgnoreCase(trim)) {
                iArr[i] = 4;
            } else if (trim.isEmpty()) {
                int[] iArr2 = new int[(iArr.length - 1)];
                System.arraycopy(iArr, 0, iArr2, 0, i);
                i--;
                iArr = iArr2;
            } else {
                StringBuilder sb = new StringBuilder("Unknown match type in matchOrder: '");
                sb.append(trim);
                sb.append("'");
                throw new InflateException(sb.toString());
            }
            i++;
        }
        return iArr;
    }

    @NonNull
    public Transition setDuration(long j) {
        this.mDuration = j;
        return this;
    }

    public long getDuration() {
        return this.mDuration;
    }

    @NonNull
    public Transition setStartDelay(long j) {
        this.mStartDelay = j;
        return this;
    }

    public long getStartDelay() {
        return this.mStartDelay;
    }

    @NonNull
    public Transition setInterpolator(@Nullable TimeInterpolator timeInterpolator) {
        this.mInterpolator = timeInterpolator;
        return this;
    }

    @Nullable
    public TimeInterpolator getInterpolator() {
        return this.mInterpolator;
    }

    public void setMatchOrder(int... iArr) {
        if (iArr == null || iArr.length == 0) {
            this.mMatchOrder = DEFAULT_MATCH_ORDER;
            return;
        }
        int i = 0;
        while (i < iArr.length) {
            if (!isValidMatch(iArr[i])) {
                throw new IllegalArgumentException("matches contains invalid value");
            } else if (!alreadyContains(iArr, i)) {
                i++;
            } else {
                throw new IllegalArgumentException("matches contains a duplicate value");
            }
        }
        this.mMatchOrder = (int[]) iArr.clone();
    }

    private static boolean alreadyContains(int[] iArr, int i) {
        int i2 = iArr[i];
        for (int i3 = 0; i3 < i; i3++) {
            if (iArr[i3] == i2) {
                return true;
            }
        }
        return false;
    }

    private void matchInstances(PlaybackStateCompat<View, hasIcon> playbackStateCompat, PlaybackStateCompat<View, hasIcon> playbackStateCompat2) {
        hasIcon remove;
        for (int size = playbackStateCompat.size() - 1; size >= 0; size--) {
            View view = (View) playbackStateCompat.isInside[size << 1];
            if (view != null && isValidTarget(view) && (remove = playbackStateCompat2.remove(view)) != null && isValidTarget(remove.setMin)) {
                this.mStartValuesList.add(playbackStateCompat.setMin(size));
                this.mEndValuesList.add(remove);
            }
        }
    }

    private void matchIds(PlaybackStateCompat<View, hasIcon> playbackStateCompat, PlaybackStateCompat<View, hasIcon> playbackStateCompat2, SparseArray<View> sparseArray, SparseArray<View> sparseArray2) {
        View view;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            View valueAt = sparseArray.valueAt(i);
            if (valueAt != null && isValidTarget(valueAt) && (view = sparseArray2.get(sparseArray.keyAt(i))) != null && isValidTarget(view)) {
                hasIcon hasicon = playbackStateCompat.get(valueAt);
                hasIcon hasicon2 = playbackStateCompat2.get(view);
                if (!(hasicon == null || hasicon2 == null)) {
                    this.mStartValuesList.add(hasicon);
                    this.mEndValuesList.add(hasicon2);
                    playbackStateCompat.remove(valueAt);
                    playbackStateCompat2.remove(view);
                }
            }
        }
    }

    private void matchNames(PlaybackStateCompat<View, hasIcon> playbackStateCompat, PlaybackStateCompat<View, hasIcon> playbackStateCompat2, PlaybackStateCompat<String, View> playbackStateCompat3, PlaybackStateCompat<String, View> playbackStateCompat4) {
        View view;
        int size = playbackStateCompat3.size();
        for (int i = 0; i < size; i++) {
            int i2 = i << 1;
            View view2 = (View) playbackStateCompat3.isInside[i2 + 1];
            if (view2 != null && isValidTarget(view2) && (view = playbackStateCompat4.get(playbackStateCompat3.isInside[i2])) != null && isValidTarget(view)) {
                hasIcon hasicon = playbackStateCompat.get(view2);
                hasIcon hasicon2 = playbackStateCompat2.get(view);
                if (!(hasicon == null || hasicon2 == null)) {
                    this.mStartValuesList.add(hasicon);
                    this.mEndValuesList.add(hasicon2);
                    playbackStateCompat.remove(view2);
                    playbackStateCompat2.remove(view);
                }
            }
        }
    }

    private void addUnmatched(PlaybackStateCompat<View, hasIcon> playbackStateCompat, PlaybackStateCompat<View, hasIcon> playbackStateCompat2) {
        for (int i = 0; i < playbackStateCompat.size(); i++) {
            hasIcon hasicon = (hasIcon) playbackStateCompat.isInside[(i << 1) + 1];
            if (isValidTarget(hasicon.setMin)) {
                this.mStartValuesList.add(hasicon);
                this.mEndValuesList.add((Object) null);
            }
        }
        for (int i2 = 0; i2 < playbackStateCompat2.size(); i2++) {
            hasIcon hasicon2 = (hasIcon) playbackStateCompat2.isInside[(i2 << 1) + 1];
            if (isValidTarget(hasicon2.setMin)) {
                this.mEndValuesList.add(hasicon2);
                this.mStartValuesList.add((Object) null);
            }
        }
    }

    private void matchStartAndEnd(initFeature initfeature, initFeature initfeature2) {
        PlaybackStateCompat playbackStateCompat = new PlaybackStateCompat((PlaybackStateCompat.RepeatMode) initfeature.getMin);
        PlaybackStateCompat playbackStateCompat2 = new PlaybackStateCompat((PlaybackStateCompat.RepeatMode) initfeature2.getMin);
        int i = 0;
        while (true) {
            int[] iArr = this.mMatchOrder;
            if (i < iArr.length) {
                int i2 = iArr[i];
                if (i2 == 1) {
                    matchInstances(playbackStateCompat, playbackStateCompat2);
                } else if (i2 == 2) {
                    matchNames(playbackStateCompat, playbackStateCompat2, initfeature.setMax, initfeature2.setMax);
                } else if (i2 == 3) {
                    matchIds(playbackStateCompat, playbackStateCompat2, initfeature.setMin, initfeature2.setMin);
                } else if (i2 == 4) {
                    matchItemIds(playbackStateCompat, playbackStateCompat2, initfeature.getMax, initfeature2.getMax);
                }
                i++;
            } else {
                addUnmatched(playbackStateCompat, playbackStateCompat2);
                return;
            }
        }
    }

    /* access modifiers changed from: protected */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void createAnimators(ViewGroup viewGroup, initFeature initfeature, initFeature initfeature2, ArrayList<hasIcon> arrayList, ArrayList<hasIcon> arrayList2) {
        int i;
        int i2;
        Animator createAnimator;
        View view;
        Animator animator;
        hasIcon hasicon;
        Animator animator2;
        hasIcon hasicon2;
        ViewGroup viewGroup2 = viewGroup;
        PlaybackStateCompat<Animator, getMin> runningAnimators = getRunningAnimators();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        long j = Long.MAX_VALUE;
        int i3 = 0;
        while (i3 < size) {
            hasIcon hasicon3 = arrayList.get(i3);
            hasIcon hasicon4 = arrayList2.get(i3);
            if (hasicon3 != null && !hasicon3.getMin.contains(this)) {
                hasicon3 = null;
            }
            if (hasicon4 != null && !hasicon4.getMin.contains(this)) {
                hasicon4 = null;
            }
            if (!(hasicon3 == null && hasicon4 == null)) {
                if ((hasicon3 == null || hasicon4 == null || isTransitionRequired(hasicon3, hasicon4)) && (createAnimator = createAnimator(viewGroup2, hasicon3, hasicon4)) != null) {
                    if (hasicon4 != null) {
                        view = hasicon4.setMin;
                        String[] transitionProperties = getTransitionProperties();
                        if (transitionProperties == null || transitionProperties.length <= 0) {
                            animator2 = createAnimator;
                            i2 = size;
                            i = i3;
                            hasicon2 = null;
                        } else {
                            hasIcon hasicon5 = new hasIcon(view);
                            animator2 = createAnimator;
                            i2 = size;
                            hasIcon hasicon6 = initfeature2.getMin.get(view);
                            if (hasicon6 != null) {
                                int i4 = 0;
                                while (i4 < transitionProperties.length) {
                                    hasicon5.setMax.put(transitionProperties[i4], hasicon6.setMax.get(transitionProperties[i4]));
                                    i4++;
                                    ArrayList<hasIcon> arrayList3 = arrayList2;
                                    i3 = i3;
                                    hasicon6 = hasicon6;
                                }
                            }
                            i = i3;
                            int size2 = runningAnimators.size();
                            for (int i5 = 0; i5 < size2; i5++) {
                                getMin getmin = runningAnimators.get((Animator) runningAnimators.isInside[i5 << 1]);
                                if (getmin.getMax != null && getmin.getMin == view && getmin.setMin.equals(getName()) && getmin.getMax.equals(hasicon5)) {
                                    hasicon = hasicon5;
                                    animator = null;
                                    break;
                                }
                            }
                            hasicon2 = hasicon5;
                        }
                        hasicon = hasicon2;
                        animator = animator2;
                    } else {
                        i2 = size;
                        i = i3;
                        view = hasicon3.setMin;
                        animator = createAnimator;
                        hasicon = null;
                    }
                    if (animator != null) {
                        haltActionBarHideOffsetAnimations haltactionbarhideoffsetanimations = this.mPropagation;
                        if (haltactionbarhideoffsetanimations != null) {
                            long max = haltactionbarhideoffsetanimations.setMax(viewGroup2, this, hasicon3, hasicon4);
                            sparseIntArray.put(this.mAnimators.size(), (int) max);
                            j = Math.min(max, j);
                        }
                        runningAnimators.put(animator, new getMin(view, getName(), this, dismissPopups.setMin(viewGroup), hasicon));
                        this.mAnimators.add(animator);
                        j = j;
                    }
                    i3 = i + 1;
                    size = i2;
                }
            }
            i2 = size;
            i = i3;
            i3 = i + 1;
            size = i2;
        }
        if (sparseIntArray.size() != 0) {
            for (int i6 = 0; i6 < sparseIntArray.size(); i6++) {
                Animator animator3 = this.mAnimators.get(sparseIntArray.keyAt(i6));
                animator3.setStartDelay((((long) sparseIntArray.valueAt(i6)) - j) + animator3.getStartDelay());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean isValidTarget(View view) {
        ArrayList<Class<?>> arrayList;
        ArrayList<String> arrayList2;
        int id2 = view.getId();
        ArrayList<Integer> arrayList3 = this.mTargetIdExcludes;
        if (arrayList3 != null && arrayList3.contains(Integer.valueOf(id2))) {
            return false;
        }
        ArrayList<View> arrayList4 = this.mTargetExcludes;
        if (arrayList4 != null && arrayList4.contains(view)) {
            return false;
        }
        ArrayList<Class<?>> arrayList5 = this.mTargetTypeExcludes;
        if (arrayList5 != null) {
            int size = arrayList5.size();
            for (int i = 0; i < size; i++) {
                if (this.mTargetTypeExcludes.get(i).isInstance(view)) {
                    return false;
                }
            }
        }
        if (this.mTargetNameExcludes != null && ViewCompat.onNavigationEvent(view) != null && this.mTargetNameExcludes.contains(ViewCompat.onNavigationEvent(view))) {
            return false;
        }
        if ((this.mTargetIds.size() == 0 && this.mTargets.size() == 0 && (((arrayList = this.mTargetTypes) == null || arrayList.isEmpty()) && ((arrayList2 = this.mTargetNames) == null || arrayList2.isEmpty()))) || this.mTargetIds.contains(Integer.valueOf(id2)) || this.mTargets.contains(view)) {
            return true;
        }
        ArrayList<String> arrayList6 = this.mTargetNames;
        if (arrayList6 != null && arrayList6.contains(ViewCompat.onNavigationEvent(view))) {
            return true;
        }
        if (this.mTargetTypes != null) {
            for (int i2 = 0; i2 < this.mTargetTypes.size(); i2++) {
                if (this.mTargetTypes.get(i2).isInstance(view)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static PlaybackStateCompat<Animator, getMin> getRunningAnimators() {
        PlaybackStateCompat<Animator, getMin> playbackStateCompat = sRunningAnimators.get();
        if (playbackStateCompat != null) {
            return playbackStateCompat;
        }
        PlaybackStateCompat<Animator, getMin> playbackStateCompat2 = new PlaybackStateCompat<>();
        sRunningAnimators.set(playbackStateCompat2);
        return playbackStateCompat2;
    }

    /* access modifiers changed from: protected */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void runAnimators() {
        start();
        PlaybackStateCompat<Animator, getMin> runningAnimators = getRunningAnimators();
        Iterator<Animator> it = this.mAnimators.iterator();
        while (it.hasNext()) {
            Animator next = it.next();
            if (runningAnimators.containsKey(next)) {
                start();
                runAnimator(next, runningAnimators);
            }
        }
        this.mAnimators.clear();
        end();
    }

    private void runAnimator(Animator animator, final PlaybackStateCompat<Animator, getMin> playbackStateCompat) {
        if (animator != null) {
            animator.addListener(new AnimatorListenerAdapter() {
                public final void onAnimationStart(Animator animator) {
                    Transition.this.mCurrentAnimators.add(animator);
                }

                public final void onAnimationEnd(Animator animator) {
                    playbackStateCompat.remove(animator);
                    Transition.this.mCurrentAnimators.remove(animator);
                }
            });
            animate(animator);
        }
    }

    @NonNull
    public Transition addTarget(@NonNull View view) {
        this.mTargets.add(view);
        return this;
    }

    @NonNull
    public Transition addTarget(@IdRes int i) {
        if (i != 0) {
            this.mTargetIds.add(Integer.valueOf(i));
        }
        return this;
    }

    @NonNull
    public Transition addTarget(@NonNull String str) {
        if (this.mTargetNames == null) {
            this.mTargetNames = new ArrayList<>();
        }
        this.mTargetNames.add(str);
        return this;
    }

    @NonNull
    public Transition addTarget(@NonNull Class<?> cls) {
        if (this.mTargetTypes == null) {
            this.mTargetTypes = new ArrayList<>();
        }
        this.mTargetTypes.add(cls);
        return this;
    }

    @NonNull
    public Transition removeTarget(@NonNull View view) {
        this.mTargets.remove(view);
        return this;
    }

    @NonNull
    public Transition removeTarget(@IdRes int i) {
        if (i != 0) {
            this.mTargetIds.remove(Integer.valueOf(i));
        }
        return this;
    }

    @NonNull
    public Transition removeTarget(@NonNull String str) {
        ArrayList<String> arrayList = this.mTargetNames;
        if (arrayList != null) {
            arrayList.remove(str);
        }
        return this;
    }

    @NonNull
    public Transition removeTarget(@NonNull Class<?> cls) {
        ArrayList<Class<?>> arrayList = this.mTargetTypes;
        if (arrayList != null) {
            arrayList.remove(cls);
        }
        return this;
    }

    @NonNull
    public Transition excludeTarget(@NonNull View view, boolean z) {
        this.mTargetExcludes = excludeView(this.mTargetExcludes, view, z);
        return this;
    }

    @NonNull
    public Transition excludeTarget(@IdRes int i, boolean z) {
        this.mTargetIdExcludes = excludeId(this.mTargetIdExcludes, i, z);
        return this;
    }

    @NonNull
    public Transition excludeTarget(@NonNull String str, boolean z) {
        this.mTargetNameExcludes = excludeObject(this.mTargetNameExcludes, str, z);
        return this;
    }

    @NonNull
    public Transition excludeChildren(@NonNull View view, boolean z) {
        this.mTargetChildExcludes = excludeView(this.mTargetChildExcludes, view, z);
        return this;
    }

    @NonNull
    public Transition excludeChildren(@IdRes int i, boolean z) {
        this.mTargetIdChildExcludes = excludeId(this.mTargetIdChildExcludes, i, z);
        return this;
    }

    private ArrayList<Integer> excludeId(ArrayList<Integer> arrayList, int i, boolean z) {
        if (i <= 0) {
            return arrayList;
        }
        if (z) {
            Integer valueOf = Integer.valueOf(i);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
            }
            if (arrayList.contains(valueOf)) {
                return arrayList;
            }
            arrayList.add(valueOf);
            return arrayList;
        }
        Integer valueOf2 = Integer.valueOf(i);
        if (arrayList == null) {
            return arrayList;
        }
        arrayList.remove(valueOf2);
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    @NonNull
    public Transition excludeTarget(@NonNull Class<?> cls, boolean z) {
        this.mTargetTypeExcludes = excludeType(this.mTargetTypeExcludes, cls, z);
        return this;
    }

    @NonNull
    public Transition excludeChildren(@NonNull Class<?> cls, boolean z) {
        this.mTargetTypeChildExcludes = excludeType(this.mTargetTypeChildExcludes, cls, z);
        return this;
    }

    @NonNull
    public List<Integer> getTargetIds() {
        return this.mTargetIds;
    }

    @NonNull
    public List<View> getTargets() {
        return this.mTargets;
    }

    @Nullable
    public List<String> getTargetNames() {
        return this.mTargetNames;
    }

    @Nullable
    public List<Class<?>> getTargetTypes() {
        return this.mTargetTypes;
    }

    public void captureValues(ViewGroup viewGroup, boolean z) {
        PlaybackStateCompat<String, String> playbackStateCompat;
        ArrayList<String> arrayList;
        ArrayList<Class<?>> arrayList2;
        clearValues(z);
        if ((this.mTargetIds.size() > 0 || this.mTargets.size() > 0) && (((arrayList = this.mTargetNames) == null || arrayList.isEmpty()) && ((arrayList2 = this.mTargetTypes) == null || arrayList2.isEmpty()))) {
            for (int i = 0; i < this.mTargetIds.size(); i++) {
                View findViewById = viewGroup.findViewById(this.mTargetIds.get(i).intValue());
                if (findViewById != null) {
                    hasIcon hasicon = new hasIcon(findViewById);
                    if (z) {
                        captureStartValues(hasicon);
                    } else {
                        captureEndValues(hasicon);
                    }
                    hasicon.getMin.add(this);
                    capturePropagationValues(hasicon);
                    if (z) {
                        addViewValues(this.mStartValues, findViewById, hasicon);
                    } else {
                        addViewValues(this.mEndValues, findViewById, hasicon);
                    }
                }
            }
            for (int i2 = 0; i2 < this.mTargets.size(); i2++) {
                View view = this.mTargets.get(i2);
                hasIcon hasicon2 = new hasIcon(view);
                if (z) {
                    captureStartValues(hasicon2);
                } else {
                    captureEndValues(hasicon2);
                }
                hasicon2.getMin.add(this);
                capturePropagationValues(hasicon2);
                if (z) {
                    addViewValues(this.mStartValues, view, hasicon2);
                } else {
                    addViewValues(this.mEndValues, view, hasicon2);
                }
            }
        } else {
            captureHierarchy(viewGroup, z);
        }
        if (!z && (playbackStateCompat = this.mNameOverrides) != null) {
            int size = playbackStateCompat.size();
            ArrayList arrayList3 = new ArrayList(size);
            for (int i3 = 0; i3 < size; i3++) {
                arrayList3.add(this.mStartValues.setMax.remove((String) this.mNameOverrides.isInside[i3 << 1]));
            }
            for (int i4 = 0; i4 < size; i4++) {
                View view2 = (View) arrayList3.get(i4);
                if (view2 != null) {
                    this.mStartValues.setMax.put((String) this.mNameOverrides.isInside[(i4 << 1) + 1], view2);
                }
            }
        }
    }

    private static void addViewValues(initFeature initfeature, View view, hasIcon hasicon) {
        initfeature.getMin.put(view, hasicon);
        int id2 = view.getId();
        if (id2 >= 0) {
            if (initfeature.setMin.indexOfKey(id2) >= 0) {
                initfeature.setMin.put(id2, (Object) null);
            } else {
                initfeature.setMin.put(id2, view);
            }
        }
        String onNavigationEvent = ViewCompat.onNavigationEvent(view);
        if (onNavigationEvent != null) {
            if (initfeature.setMax.containsKey(onNavigationEvent)) {
                initfeature.setMax.put(onNavigationEvent, null);
            } else {
                initfeature.setMax.put(onNavigationEvent, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                PlaybackStateCompat.ShuffleMode<View> shuffleMode = initfeature.getMax;
                if (shuffleMode.getMin) {
                    shuffleMode.getMin();
                }
                if (PlaybackStateCompat.State.getMax(shuffleMode.setMax, shuffleMode.length, itemIdAtPosition) >= 0) {
                    View max = initfeature.getMax.getMax(itemIdAtPosition, null);
                    if (max != null) {
                        ViewCompat.getMax(max, false);
                        initfeature.getMax.setMax(itemIdAtPosition, null);
                        return;
                    }
                    return;
                }
                ViewCompat.getMax(view, true);
                initfeature.getMax.setMax(itemIdAtPosition, view);
            }
        }
    }

    public void clearValues(boolean z) {
        if (z) {
            this.mStartValues.getMin.clear();
            this.mStartValues.setMin.clear();
            this.mStartValues.getMax.setMin();
            return;
        }
        this.mEndValues.getMin.clear();
        this.mEndValues.setMin.clear();
        this.mEndValues.getMax.setMin();
    }

    private void captureHierarchy(View view, boolean z) {
        if (view != null) {
            int id2 = view.getId();
            ArrayList<Integer> arrayList = this.mTargetIdExcludes;
            if (arrayList == null || !arrayList.contains(Integer.valueOf(id2))) {
                ArrayList<View> arrayList2 = this.mTargetExcludes;
                if (arrayList2 == null || !arrayList2.contains(view)) {
                    ArrayList<Class<?>> arrayList3 = this.mTargetTypeExcludes;
                    if (arrayList3 != null) {
                        int size = arrayList3.size();
                        int i = 0;
                        while (i < size) {
                            if (!this.mTargetTypeExcludes.get(i).isInstance(view)) {
                                i++;
                            } else {
                                return;
                            }
                        }
                    }
                    if (view.getParent() instanceof ViewGroup) {
                        hasIcon hasicon = new hasIcon(view);
                        if (z) {
                            captureStartValues(hasicon);
                        } else {
                            captureEndValues(hasicon);
                        }
                        hasicon.getMin.add(this);
                        capturePropagationValues(hasicon);
                        if (z) {
                            addViewValues(this.mStartValues, view, hasicon);
                        } else {
                            addViewValues(this.mEndValues, view, hasicon);
                        }
                    }
                    if (view instanceof ViewGroup) {
                        ArrayList<Integer> arrayList4 = this.mTargetIdChildExcludes;
                        if (arrayList4 == null || !arrayList4.contains(Integer.valueOf(id2))) {
                            ArrayList<View> arrayList5 = this.mTargetChildExcludes;
                            if (arrayList5 == null || !arrayList5.contains(view)) {
                                ArrayList<Class<?>> arrayList6 = this.mTargetTypeChildExcludes;
                                if (arrayList6 != null) {
                                    int size2 = arrayList6.size();
                                    int i2 = 0;
                                    while (i2 < size2) {
                                        if (!this.mTargetTypeChildExcludes.get(i2).isInstance(view)) {
                                            i2++;
                                        } else {
                                            return;
                                        }
                                    }
                                }
                                ViewGroup viewGroup = (ViewGroup) view;
                                for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                                    captureHierarchy(viewGroup.getChildAt(i3), z);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @Nullable
    public hasIcon getTransitionValues(@NonNull View view, boolean z) {
        TransitionSet transitionSet = this.mParent;
        if (transitionSet != null) {
            return transitionSet.getTransitionValues(view, z);
        }
        return (z ? this.mStartValues : this.mEndValues).getMin.get(view);
    }

    /* access modifiers changed from: package-private */
    public hasIcon getMatchedTransitionValues(View view, boolean z) {
        TransitionSet transitionSet = this.mParent;
        if (transitionSet != null) {
            return transitionSet.getMatchedTransitionValues(view, z);
        }
        ArrayList<hasIcon> arrayList = z ? this.mStartValuesList : this.mEndValuesList;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = -1;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            hasIcon hasicon = arrayList.get(i2);
            if (hasicon == null) {
                return null;
            }
            if (hasicon.setMin == view) {
                i = i2;
                break;
            }
            i2++;
        }
        if (i < 0) {
            return null;
        }
        return (z ? this.mEndValuesList : this.mStartValuesList).get(i);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void pause(View view) {
        int i;
        if (!this.mEnded) {
            PlaybackStateCompat<Animator, getMin> runningAnimators = getRunningAnimators();
            int size = runningAnimators.size();
            setOverflowIcon min = dismissPopups.setMin(view);
            int i2 = size - 1;
            while (true) {
                i = 0;
                if (i2 < 0) {
                    break;
                }
                int i3 = i2 << 1;
                getMin getmin = (getMin) runningAnimators.isInside[i3 + 1];
                if (getmin.getMin != null && min.equals(getmin.setMax)) {
                    Animator animator = (Animator) runningAnimators.isInside[i3];
                    if (Build.VERSION.SDK_INT >= 19) {
                        animator.pause();
                    } else {
                        ArrayList<Animator.AnimatorListener> listeners = animator.getListeners();
                        if (listeners != null) {
                            int size2 = listeners.size();
                            while (i < size2) {
                                Animator.AnimatorListener animatorListener = listeners.get(i);
                                if (animatorListener instanceof onStartNestedScroll.getMin) {
                                    ((onStartNestedScroll.getMin) animatorListener).onAnimationPause(animator);
                                }
                                i++;
                            }
                        }
                    }
                }
                i2--;
            }
            ArrayList<getMax> arrayList = this.mListeners;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.mListeners.clone();
                int size3 = arrayList2.size();
                while (i < size3) {
                    ((getMax) arrayList2.get(i)).onTransitionPause(this);
                    i++;
                }
            }
            this.mPaused = true;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void resume(View view) {
        if (this.mPaused) {
            if (!this.mEnded) {
                PlaybackStateCompat<Animator, getMin> runningAnimators = getRunningAnimators();
                int size = runningAnimators.size();
                setOverflowIcon min = dismissPopups.setMin(view);
                for (int i = size - 1; i >= 0; i--) {
                    int i2 = i << 1;
                    getMin getmin = (getMin) runningAnimators.isInside[i2 + 1];
                    if (getmin.getMin != null && min.equals(getmin.setMax)) {
                        Animator animator = (Animator) runningAnimators.isInside[i2];
                        if (Build.VERSION.SDK_INT >= 19) {
                            animator.resume();
                        } else {
                            ArrayList<Animator.AnimatorListener> listeners = animator.getListeners();
                            if (listeners != null) {
                                int size2 = listeners.size();
                                for (int i3 = 0; i3 < size2; i3++) {
                                    Animator.AnimatorListener animatorListener = listeners.get(i3);
                                    if (animatorListener instanceof onStartNestedScroll.getMin) {
                                        ((onStartNestedScroll.getMin) animatorListener).onAnimationResume(animator);
                                    }
                                }
                            }
                        }
                    }
                }
                ArrayList<getMax> arrayList = this.mListeners;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.mListeners.clone();
                    int size3 = arrayList2.size();
                    for (int i4 = 0; i4 < size3; i4++) {
                        ((getMax) arrayList2.get(i4)).onTransitionResume(this);
                    }
                }
            }
            this.mPaused = false;
        }
    }

    public void playTransition(ViewGroup viewGroup) {
        getMin getmin;
        this.mStartValuesList = new ArrayList<>();
        this.mEndValuesList = new ArrayList<>();
        matchStartAndEnd(this.mStartValues, this.mEndValues);
        PlaybackStateCompat<Animator, getMin> runningAnimators = getRunningAnimators();
        int size = runningAnimators.size();
        setOverflowIcon min = dismissPopups.setMin(viewGroup);
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = (Animator) runningAnimators.isInside[i << 1];
            if (!(animator == null || (getmin = runningAnimators.get(animator)) == null || getmin.getMin == null || !min.equals(getmin.setMax))) {
                hasIcon hasicon = getmin.getMax;
                View view = getmin.getMin;
                hasIcon transitionValues = getTransitionValues(view, true);
                hasIcon matchedTransitionValues = getMatchedTransitionValues(view, true);
                if (transitionValues == null && matchedTransitionValues == null) {
                    matchedTransitionValues = this.mEndValues.getMin.get(view);
                }
                if (!(transitionValues == null && matchedTransitionValues == null) && getmin.length.isTransitionRequired(hasicon, matchedTransitionValues)) {
                    if (animator.isRunning() || animator.isStarted()) {
                        animator.cancel();
                    } else {
                        runningAnimators.remove(animator);
                    }
                }
            }
        }
        createAnimators(viewGroup, this.mStartValues, this.mEndValues, this.mStartValuesList, this.mEndValuesList);
        runAnimators();
    }

    public boolean isTransitionRequired(@Nullable hasIcon hasicon, @Nullable hasIcon hasicon2) {
        if (hasicon == null || hasicon2 == null) {
            return false;
        }
        String[] transitionProperties = getTransitionProperties();
        if (transitionProperties != null) {
            int length2 = transitionProperties.length;
            int i = 0;
            while (i < length2) {
                if (!isValueChanged(hasicon, hasicon2, transitionProperties[i])) {
                    i++;
                }
            }
            return false;
        }
        for (String isValueChanged : hasicon.setMax.keySet()) {
            if (isValueChanged(hasicon, hasicon2, isValueChanged)) {
            }
        }
        return false;
        return true;
    }

    private static boolean isValueChanged(hasIcon hasicon, hasIcon hasicon2, String str) {
        Object obj = hasicon.setMax.get(str);
        Object obj2 = hasicon2.setMax.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null || !obj.equals(obj2)) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void animate(Animator animator) {
        if (animator == null) {
            end();
            return;
        }
        if (getDuration() >= 0) {
            animator.setDuration(getDuration());
        }
        if (getStartDelay() >= 0) {
            animator.setStartDelay(getStartDelay() + animator.getStartDelay());
        }
        if (getInterpolator() != null) {
            animator.setInterpolator(getInterpolator());
        }
        animator.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                Transition.this.end();
                animator.removeListener(this);
            }
        });
        animator.start();
    }

    /* access modifiers changed from: protected */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void start() {
        if (this.mNumInstances == 0) {
            ArrayList<getMax> arrayList = this.mListeners;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.mListeners.clone();
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    ((getMax) arrayList2.get(i)).onTransitionStart(this);
                }
            }
            this.mEnded = false;
        }
        this.mNumInstances++;
    }

    /* access modifiers changed from: protected */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void end() {
        int i = this.mNumInstances - 1;
        this.mNumInstances = i;
        if (i == 0) {
            ArrayList<getMax> arrayList = this.mListeners;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.mListeners.clone();
                int size = arrayList2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((getMax) arrayList2.get(i2)).onTransitionEnd(this);
                }
            }
            int i3 = 0;
            while (true) {
                PlaybackStateCompat.ShuffleMode<View> shuffleMode = this.mStartValues.getMax;
                if (shuffleMode.getMin) {
                    shuffleMode.getMin();
                }
                if (i3 >= shuffleMode.length) {
                    break;
                }
                PlaybackStateCompat.ShuffleMode<View> shuffleMode2 = this.mStartValues.getMax;
                if (shuffleMode2.getMin) {
                    shuffleMode2.getMin();
                }
                View view = (View) shuffleMode2.setMin[i3];
                if (view != null) {
                    ViewCompat.getMax(view, false);
                }
                i3++;
            }
            int i4 = 0;
            while (true) {
                PlaybackStateCompat.ShuffleMode<View> shuffleMode3 = this.mEndValues.getMax;
                if (shuffleMode3.getMin) {
                    shuffleMode3.getMin();
                }
                if (i4 < shuffleMode3.length) {
                    PlaybackStateCompat.ShuffleMode<View> shuffleMode4 = this.mEndValues.getMax;
                    if (shuffleMode4.getMin) {
                        shuffleMode4.getMin();
                    }
                    View view2 = (View) shuffleMode4.setMin[i4];
                    if (view2 != null) {
                        ViewCompat.getMax(view2, false);
                    }
                    i4++;
                } else {
                    this.mEnded = true;
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void forceToEnd(ViewGroup viewGroup) {
        PlaybackStateCompat<Animator, getMin> runningAnimators = getRunningAnimators();
        int size = runningAnimators.size();
        if (viewGroup != null && size != 0) {
            setOverflowIcon min = dismissPopups.setMin(viewGroup);
            PlaybackStateCompat playbackStateCompat = new PlaybackStateCompat((PlaybackStateCompat.RepeatMode) runningAnimators);
            runningAnimators.clear();
            for (int i = size - 1; i >= 0; i--) {
                int i2 = i << 1;
                getMin getmin = (getMin) playbackStateCompat.isInside[i2 + 1];
                if (getmin.getMin != null && min.equals(getmin.setMax)) {
                    ((Animator) playbackStateCompat.isInside[i2]).end();
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void cancel() {
        for (int size = this.mCurrentAnimators.size() - 1; size >= 0; size--) {
            this.mCurrentAnimators.get(size).cancel();
        }
        ArrayList<getMax> arrayList = this.mListeners;
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList arrayList2 = (ArrayList) this.mListeners.clone();
            int size2 = arrayList2.size();
            for (int i = 0; i < size2; i++) {
                ((getMax) arrayList2.get(i)).onTransitionCancel(this);
            }
        }
    }

    @NonNull
    public Transition addListener(@NonNull getMax getmax) {
        if (this.mListeners == null) {
            this.mListeners = new ArrayList<>();
        }
        this.mListeners.add(getmax);
        return this;
    }

    @NonNull
    public Transition removeListener(@NonNull getMax getmax) {
        ArrayList<getMax> arrayList = this.mListeners;
        if (arrayList == null) {
            return this;
        }
        arrayList.remove(getmax);
        if (this.mListeners.size() == 0) {
            this.mListeners = null;
        }
        return this;
    }

    public void setPathMotion(@Nullable PathMotion pathMotion) {
        if (pathMotion == null) {
            this.mPathMotion = STRAIGHT_PATH_MOTION;
        } else {
            this.mPathMotion = pathMotion;
        }
    }

    @NonNull
    public PathMotion getPathMotion() {
        return this.mPathMotion;
    }

    public void setEpicenterCallback(@Nullable length length2) {
        this.mEpicenterCallback = length2;
    }

    @Nullable
    public length getEpicenterCallback() {
        return this.mEpicenterCallback;
    }

    @Nullable
    public Rect getEpicenter() {
        length length2 = this.mEpicenterCallback;
        if (length2 == null) {
            return null;
        }
        return length2.getMax();
    }

    public void setPropagation(@Nullable haltActionBarHideOffsetAnimations haltactionbarhideoffsetanimations) {
        this.mPropagation = haltactionbarhideoffsetanimations;
    }

    @Nullable
    public haltActionBarHideOffsetAnimations getPropagation() {
        return this.mPropagation;
    }

    /* access modifiers changed from: package-private */
    public void capturePropagationValues(hasIcon hasicon) {
        String[] min;
        if (this.mPropagation != null && !hasicon.setMax.isEmpty() && (min = this.mPropagation.setMin()) != null) {
            boolean z = false;
            int i = 0;
            while (true) {
                if (i >= min.length) {
                    z = true;
                    break;
                } else if (!hasicon.setMax.containsKey(min[i])) {
                    break;
                } else {
                    i++;
                }
            }
            if (!z) {
                this.mPropagation.getMin(hasicon);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public Transition setSceneRoot(ViewGroup viewGroup) {
        this.mSceneRoot = viewGroup;
        return this;
    }

    /* access modifiers changed from: package-private */
    public void setCanRemoveViews(boolean z) {
        this.mCanRemoveViews = z;
    }

    public String toString() {
        return toString("");
    }

    public Transition clone() {
        try {
            Transition transition = (Transition) super.clone();
            transition.mAnimators = new ArrayList<>();
            transition.mStartValues = new initFeature();
            transition.mEndValues = new initFeature();
            transition.mStartValuesList = null;
            transition.mEndValuesList = null;
            return transition;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    @NonNull
    public String getName() {
        return this.mName;
    }

    /* access modifiers changed from: package-private */
    public String toString(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(getClass().getSimpleName());
        sb.append(AUScreenAdaptTool.PREFIX_ID);
        sb.append(Integer.toHexString(hashCode()));
        sb.append(": ");
        String obj = sb.toString();
        if (this.mDuration != -1) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(obj);
            sb2.append("dur(");
            sb2.append(this.mDuration);
            sb2.append(") ");
            obj = sb2.toString();
        }
        if (this.mStartDelay != -1) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(obj);
            sb3.append("dly(");
            sb3.append(this.mStartDelay);
            sb3.append(") ");
            obj = sb3.toString();
        }
        if (this.mInterpolator != null) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(obj);
            sb4.append("interp(");
            sb4.append(this.mInterpolator);
            sb4.append(") ");
            obj = sb4.toString();
        }
        if (this.mTargetIds.size() <= 0 && this.mTargets.size() <= 0) {
            return obj;
        }
        StringBuilder sb5 = new StringBuilder();
        sb5.append(obj);
        sb5.append("tgts(");
        String obj2 = sb5.toString();
        if (this.mTargetIds.size() > 0) {
            for (int i = 0; i < this.mTargetIds.size(); i++) {
                if (i > 0) {
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append(obj2);
                    sb6.append(", ");
                    obj2 = sb6.toString();
                }
                StringBuilder sb7 = new StringBuilder();
                sb7.append(obj2);
                sb7.append(this.mTargetIds.get(i));
                obj2 = sb7.toString();
            }
        }
        if (this.mTargets.size() > 0) {
            for (int i2 = 0; i2 < this.mTargets.size(); i2++) {
                if (i2 > 0) {
                    StringBuilder sb8 = new StringBuilder();
                    sb8.append(obj2);
                    sb8.append(", ");
                    obj2 = sb8.toString();
                }
                StringBuilder sb9 = new StringBuilder();
                sb9.append(obj2);
                sb9.append(this.mTargets.get(i2));
                obj2 = sb9.toString();
            }
        }
        StringBuilder sb10 = new StringBuilder();
        sb10.append(obj2);
        sb10.append(")");
        return sb10.toString();
    }

    static class getMin {
        hasIcon getMax;
        View getMin;
        Transition length;
        setOverflowIcon setMax;
        String setMin;

        getMin(View view, String str, Transition transition, setOverflowIcon setoverflowicon, hasIcon hasicon) {
            this.getMin = view;
            this.setMin = str;
            this.getMax = hasicon;
            this.setMax = setoverflowicon;
            this.length = transition;
        }
    }

    private void matchItemIds(PlaybackStateCompat<View, hasIcon> playbackStateCompat, PlaybackStateCompat<View, hasIcon> playbackStateCompat2, PlaybackStateCompat.ShuffleMode<View> shuffleMode, PlaybackStateCompat.ShuffleMode<View> shuffleMode2) {
        if (shuffleMode.getMin) {
            shuffleMode.getMin();
        }
        int i = shuffleMode.length;
        for (int i2 = 0; i2 < i; i2++) {
            if (shuffleMode.getMin) {
                shuffleMode.getMin();
            }
            View view = (View) shuffleMode.setMin[i2];
            if (view != null && isValidTarget(view)) {
                if (shuffleMode.getMin) {
                    shuffleMode.getMin();
                }
                View max = shuffleMode2.getMax(shuffleMode.setMax[i2], null);
                if (max != null && isValidTarget(max)) {
                    hasIcon hasicon = playbackStateCompat.get(view);
                    hasIcon hasicon2 = playbackStateCompat2.get(max);
                    if (!(hasicon == null || hasicon2 == null)) {
                        this.mStartValuesList.add(hasicon);
                        this.mEndValuesList.add(hasicon2);
                        playbackStateCompat.remove(view);
                        playbackStateCompat2.remove(max);
                    }
                }
            }
        }
    }

    private static <T> ArrayList<T> excludeObject(ArrayList<T> arrayList, T t, boolean z) {
        if (t == null) {
            return arrayList;
        }
        if (z) {
            if (arrayList == null) {
                arrayList = new ArrayList<>();
            }
            if (arrayList.contains(t)) {
                return arrayList;
            }
            arrayList.add(t);
            return arrayList;
        } else if (arrayList == null) {
            return arrayList;
        } else {
            arrayList.remove(t);
            if (arrayList.isEmpty()) {
                return null;
            }
            return arrayList;
        }
    }

    private ArrayList<View> excludeView(ArrayList<View> arrayList, View view, boolean z) {
        if (view == null) {
            return arrayList;
        }
        if (z) {
            if (arrayList == null) {
                arrayList = new ArrayList<>();
            }
            if (arrayList.contains(view)) {
                return arrayList;
            }
            arrayList.add(view);
            return arrayList;
        } else if (arrayList == null) {
            return arrayList;
        } else {
            arrayList.remove(view);
            if (arrayList.isEmpty()) {
                return null;
            }
            return arrayList;
        }
    }

    private ArrayList<Class<?>> excludeType(ArrayList<Class<?>> arrayList, Class<?> cls, boolean z) {
        if (cls == null) {
            return arrayList;
        }
        if (z) {
            if (arrayList == null) {
                arrayList = new ArrayList<>();
            }
            if (arrayList.contains(cls)) {
                return arrayList;
            }
            arrayList.add(cls);
            return arrayList;
        } else if (arrayList == null) {
            return arrayList;
        } else {
            arrayList.remove(cls);
            if (arrayList.isEmpty()) {
                return null;
            }
            return arrayList;
        }
    }
}
