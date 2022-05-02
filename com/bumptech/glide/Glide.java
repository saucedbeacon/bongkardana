package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.bumptech.glide.Registry;
import com.bumptech.glide.gifdecoder.GifDecoder;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser;
import java.io.File;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o.Barrier;
import o.ConstraintHelper;
import o.DependencyNode$Type;
import o.Guideline;
import o.ImageFilterButton;
import o.ImageFilterView;
import o.MockView;
import o.VirtualLayout;
import o.WidgetRun$RunType;
import o.access$000;
import o.access$1000;
import o.access$1100;
import o.access$1200;
import o.access$1300;
import o.access$1400;
import o.access$1700;
import o.access$200;
import o.access$400;
import o.access$500;
import o.access$700;
import o.access$900;
import o.applyConstraintsFromLayoutParams;
import o.applyLayoutFeatures;
import o.dispatchApplyWindowInsetsToBehaviors;
import o.fillMetrics;
import o.getChildRect;
import o.getContent;
import o.getContrast;
import o.getCrossfade;
import o.getDefinedTransitions;
import o.getDependents;
import o.getDesignInformation;
import o.getMinWidth;
import o.getOptimizationLevel;
import o.getRound;
import o.getSaturation;
import o.getStartState;
import o.getViewById;
import o.getViewWidget;
import o.getViews;
import o.getWarmth;
import o.isInteractionEnabled;
import o.isRtl;
import o.layoutChildWithAnchor;
import o.obtainVelocityTracker;
import o.onTransitionCompleted;
import o.parseBehavior;
import o.rebuildMotion;
import o.rebuildScene;
import o.setAllowsGoneWidget;
import o.setChildrenConstraints;
import o.setContrast;
import o.setCrossfade;
import o.setDebugMode;
import o.setDesignInformation;
import o.setElevation;
import o.setFirstHorizontalBias;
import o.setFirstHorizontalStyle;
import o.setGuidelineBegin;
import o.setHorizontalBias;
import o.setHorizontalGap;
import o.setMaxHeight;
import o.setMinHeight;
import o.setOnHide;
import o.setOnHierarchyChangeListener;
import o.setOptimizationLevel;
import o.setReferencedIds;
import o.setRound;
import o.setRoundPercent;
import o.setSelfDimensionBehaviour;
import o.setText;
import o.setWarmth;
import o.updatePostMeasure;
import o.updatePreLayout;

public class Glide implements ComponentCallbacks2 {
    private static volatile Glide isInside;
    private static volatile boolean toFloatRange;
    private final isInteractionEnabled FastBitmap$CoordinateSystem;
    public final List<setHorizontalGap> IsOverlapping = new ArrayList();
    public final Guideline equals;
    public final Registry getMax;
    public final rebuildScene getMin;
    public final getContent length;
    public final setFirstHorizontalStyle setMax;
    public final setOnHide setMin;
    private final setDebugMode toIntRange;
    private MemoryCategory toString = MemoryCategory.NORMAL;
    private final length values;

    public interface length {
        @NonNull
        dispatchApplyWindowInsetsToBehaviors setMax();
    }

    public void onConfigurationChanged(Configuration configuration) {
    }

    @NonNull
    public static Glide setMax(@NonNull Context context) {
        if (isInside == null) {
            GeneratedAppGlideModule min = getMin(context.getApplicationContext());
            synchronized (Glide.class) {
                if (isInside == null) {
                    if (!toFloatRange) {
                        toFloatRange = true;
                        setMin(context, new setHorizontalBias(), min);
                        toFloatRange = false;
                    } else {
                        throw new IllegalStateException("You cannot call Glide.get() in registerComponents(), use the provided Glide instance instead");
                    }
                }
            }
        }
        return isInside;
    }

    @GuardedBy("Glide.class")
    private static void setMin(@NonNull Context context, @NonNull setHorizontalBias sethorizontalbias, @Nullable GeneratedAppGlideModule generatedAppGlideModule) {
        getContent.getMax getmax;
        setHorizontalBias sethorizontalbias2 = sethorizontalbias;
        GeneratedAppGlideModule generatedAppGlideModule2 = generatedAppGlideModule;
        Context applicationContext = context.getApplicationContext();
        List<VirtualLayout> emptyList = Collections.emptyList();
        if (generatedAppGlideModule2 == null || generatedAppGlideModule.getMax()) {
            emptyList = new setOnHierarchyChangeListener(applicationContext).getMax();
        }
        List<VirtualLayout> list = emptyList;
        if (generatedAppGlideModule2 != null && !generatedAppGlideModule.setMin().isEmpty()) {
            Set<Class<?>> min = generatedAppGlideModule.setMin();
            Iterator<VirtualLayout> it = list.iterator();
            while (it.hasNext()) {
                if (min.contains(it.next().getClass())) {
                    it.remove();
                }
            }
        }
        if (Log.isLoggable("Glide", 3)) {
            Iterator<VirtualLayout> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
        if (generatedAppGlideModule2 != null) {
            getmax = generatedAppGlideModule.setMax();
        } else {
            getmax = null;
        }
        sethorizontalbias2.toDoubleRange = getmax;
        Iterator<VirtualLayout> it3 = list.iterator();
        while (it3.hasNext()) {
            it3.next();
        }
        if (sethorizontalbias2.IsOverlapping == null) {
            sethorizontalbias2.IsOverlapping = access$500.setMin();
        }
        if (sethorizontalbias2.toIntRange == null) {
            sethorizontalbias2.toIntRange = access$500.getMax();
        }
        if (sethorizontalbias2.values == null) {
            sethorizontalbias2.values = access$500.getMin();
        }
        if (sethorizontalbias2.equals == null) {
            sethorizontalbias2.equals = new access$400(new access$400.getMin(applicationContext));
        }
        if (sethorizontalbias2.isInside == null) {
            sethorizontalbias2.isInside = new setGuidelineBegin();
        }
        if (sethorizontalbias2.getMax == null) {
            int i = sethorizontalbias2.equals.setMin;
            if (i > 0) {
                sethorizontalbias2.getMax = new getStartState((long) i);
            } else {
                sethorizontalbias2.getMax = new rebuildMotion();
            }
        }
        if (sethorizontalbias2.setMax == null) {
            sethorizontalbias2.setMax = new getDefinedTransitions(sethorizontalbias2.equals.setMax);
        }
        if (sethorizontalbias2.length == null) {
            sethorizontalbias2.length = new access$000((long) sethorizontalbias2.equals.length);
        }
        if (sethorizontalbias2.toFloatRange == null) {
            sethorizontalbias2.toFloatRange = new access$200(applicationContext);
        }
        if (sethorizontalbias2.setMin == null) {
            sethorizontalbias2.setMin = new setDebugMode(sethorizontalbias2.length, sethorizontalbias2.toFloatRange, sethorizontalbias2.toIntRange, sethorizontalbias2.IsOverlapping, access$500.setMax(), sethorizontalbias2.values, sethorizontalbias2.hashCode);
        }
        if (sethorizontalbias2.invokeSuspend == null) {
            sethorizontalbias2.invokeSuspend = Collections.emptyList();
        } else {
            sethorizontalbias2.invokeSuspend = Collections.unmodifiableList(sethorizontalbias2.invokeSuspend);
        }
        getContent getcontent = new getContent(sethorizontalbias2.toDoubleRange);
        Glide glide = r2;
        Context context2 = applicationContext;
        Glide glide2 = new Glide(applicationContext, sethorizontalbias2.setMin, sethorizontalbias2.length, sethorizontalbias2.getMax, sethorizontalbias2.setMax, getcontent, sethorizontalbias2.isInside, sethorizontalbias2.toString, sethorizontalbias2.FastBitmap$CoordinateSystem, sethorizontalbias2.getMin, sethorizontalbias2.invokeSuspend, sethorizontalbias2.invoke, sethorizontalbias2.valueOf);
        for (VirtualLayout next : list) {
            try {
                next.getMin(glide.getMax);
            } catch (AbstractMethodError e) {
                StringBuilder sb = new StringBuilder("Attempting to register a Glide v3 module. If you see this, you or one of your dependencies may be including Glide v3 even though you're using Glide v4. You'll need to find and remove (or update) the offending dependency. The v3 module name is: ");
                sb.append(next.getClass().getName());
                throw new IllegalStateException(sb.toString(), e);
            }
        }
        GeneratedAppGlideModule generatedAppGlideModule3 = generatedAppGlideModule;
        if (generatedAppGlideModule3 != null) {
            generatedAppGlideModule3.getMin(glide.getMax);
        }
        context2.registerComponentCallbacks(glide);
        isInside = glide;
    }

    @Nullable
    private static GeneratedAppGlideModule getMin(Context context) {
        try {
            return (GeneratedAppGlideModule) Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(new Class[]{Context.class}).newInstance(new Object[]{context.getApplicationContext()});
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (InstantiationException e) {
            throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e);
        } catch (IllegalAccessException e2) {
            throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e2);
        } catch (NoSuchMethodException e3) {
            throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e3);
        } catch (InvocationTargetException e4) {
            throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e4);
        }
    }

    private Glide(@NonNull Context context, @NonNull setDebugMode setdebugmode, @NonNull isInteractionEnabled isinteractionenabled, @NonNull rebuildScene rebuildscene, @NonNull setOnHide setonhide, @NonNull getContent getcontent, @NonNull Guideline guideline, int i, @NonNull length length2, @NonNull Map<Class<?>, setFirstHorizontalBias<?, ?>> map, @NonNull List<parseBehavior<Object>> list, boolean z, boolean z2) {
        setElevation setelevation;
        setElevation setelevation2;
        Context context2 = context;
        rebuildScene rebuildscene2 = rebuildscene;
        setOnHide setonhide2 = setonhide;
        Class<byte[]> cls = byte[].class;
        this.toIntRange = setdebugmode;
        this.getMin = rebuildscene2;
        this.setMin = setonhide2;
        this.FastBitmap$CoordinateSystem = isinteractionenabled;
        this.length = getcontent;
        this.equals = guideline;
        this.values = length2;
        Resources resources = context.getResources();
        Registry registry = new Registry();
        this.getMax = registry;
        registry.isInside.getMax(new DefaultImageHeaderParser());
        if (Build.VERSION.SDK_INT >= 27) {
            Registry registry2 = this.getMax;
            registry2.isInside.getMax(new ConstraintHelper());
        }
        List<ImageHeaderParser> max = this.getMax.isInside.setMax();
        if (!max.isEmpty()) {
            setChildrenConstraints setchildrenconstraints = new setChildrenConstraints(context2, max, rebuildscene2, setonhide2);
            setElevation<ParcelFileDescriptor, Bitmap> min = setDesignInformation.getMin(rebuildscene);
            List<ImageHeaderParser> max2 = this.getMax.isInside.setMax();
            if (!max2.isEmpty()) {
                setAllowsGoneWidget setallowsgonewidget = new setAllowsGoneWidget(max2, resources.getDisplayMetrics(), rebuildscene2, setonhide2);
                if (!z2 || Build.VERSION.SDK_INT < 28) {
                    setelevation = new Barrier(setallowsgonewidget);
                    setelevation2 = new updatePreLayout(setallowsgonewidget, setonhide2);
                } else {
                    setelevation2 = new setReferencedIds();
                    setelevation = new setText();
                }
                setMinHeight setminheight = new setMinHeight(context2);
                WidgetRun$RunType.getMax getmax = new WidgetRun$RunType.getMax(resources);
                WidgetRun$RunType.setMin setmin = new WidgetRun$RunType.setMin(resources);
                WidgetRun$RunType.getMin getmin = new WidgetRun$RunType.getMin(resources);
                Class<byte[]> cls2 = cls;
                WidgetRun$RunType.setMax setmax = new WidgetRun$RunType.setMax(resources);
                MockView mockView = new MockView(setonhide2);
                WidgetRun$RunType.setMax setmax2 = setmax;
                setSelfDimensionBehaviour setselfdimensionbehaviour = new setSelfDimensionBehaviour();
                getOptimizationLevel getoptimizationlevel = new getOptimizationLevel();
                ContentResolver contentResolver = context.getContentResolver();
                Registry registry3 = this.getMax;
                WidgetRun$RunType.setMin setmin2 = setmin;
                WidgetRun$RunType.getMin getmin2 = getmin;
                access$1100 access_1100 = new access$1100();
                WidgetRun$RunType.getMax getmax2 = getmax;
                registry3.length.getMin(ByteBuffer.class, access_1100);
                DependencyNode$Type dependencyNode$Type = new DependencyNode$Type(setonhide2);
                registry3.length.getMin(InputStream.class, dependencyNode$Type);
                setMinHeight setminheight2 = setminheight;
                registry3.getMin.getMax("Bitmap", setelevation, ByteBuffer.class, Bitmap.class);
                registry3.getMin.getMax("Bitmap", setelevation2, InputStream.class, Bitmap.class);
                if (obtainVelocityTracker.length()) {
                    Registry registry4 = this.getMax;
                    applyLayoutFeatures applylayoutfeatures = new applyLayoutFeatures(setallowsgonewidget);
                    registry4.getMin.getMax("Bitmap", applylayoutfeatures, ParcelFileDescriptor.class, Bitmap.class);
                }
                Registry registry5 = this.getMax;
                registry5.getMin.getMax("Bitmap", min, ParcelFileDescriptor.class, Bitmap.class);
                setElevation<AssetFileDescriptor, Bitmap> max3 = setDesignInformation.getMax(rebuildscene);
                registry5.getMin.getMax("Bitmap", max3, AssetFileDescriptor.class, Bitmap.class);
                getSaturation.length length3 = getSaturation.length.length();
                registry5.getMax.getMax(Bitmap.class, Bitmap.class, length3);
                getViews getviews = new getViews();
                registry5.getMin.getMax("Bitmap", getviews, Bitmap.class, Bitmap.class);
                registry5.setMin.getMin(Bitmap.class, mockView);
                getRound getround = new getRound(resources, setelevation);
                registry5.getMin.getMax("BitmapDrawable", getround, ByteBuffer.class, BitmapDrawable.class);
                getRound getround2 = new getRound(resources, setelevation2);
                registry5.getMin.getMax("BitmapDrawable", getround2, InputStream.class, BitmapDrawable.class);
                getRound getround3 = new getRound(resources, min);
                registry5.getMin.getMax("BitmapDrawable", getround3, ParcelFileDescriptor.class, BitmapDrawable.class);
                ImageFilterView imageFilterView = new ImageFilterView(rebuildscene2, mockView);
                registry5.setMin.getMin(BitmapDrawable.class, imageFilterView);
                fillMetrics fillmetrics = new fillMetrics(max, setchildrenconstraints, setonhide2);
                registry5.getMin.getMax("Gif", fillmetrics, InputStream.class, getViewWidget.class);
                registry5.getMin.getMax("Gif", setchildrenconstraints, ByteBuffer.class, getViewWidget.class);
                applyConstraintsFromLayoutParams applyconstraintsfromlayoutparams = new applyConstraintsFromLayoutParams();
                registry5.setMin.getMin(getViewWidget.class, applyconstraintsfromlayoutparams);
                getSaturation.length length4 = getSaturation.length.length();
                registry5.getMax.getMax(GifDecoder.class, GifDecoder.class, length4);
                isRtl isrtl = new isRtl(rebuildscene2);
                registry5.getMin.getMax("Bitmap", isrtl, GifDecoder.class, Bitmap.class);
                setMinHeight setminheight3 = setminheight2;
                registry5.getMin.getMax("legacy_append", setminheight3, Uri.class, Drawable.class);
                updatePostMeasure updatepostmeasure = new updatePostMeasure(setminheight3, rebuildscene2);
                registry5.getMin.getMax("legacy_append", updatepostmeasure, Uri.class, Bitmap.class);
                registry5.setMax.getMin(new getDesignInformation.getMax());
                access$1000.getMax getmax3 = new access$1000.getMax();
                registry5.getMax.getMax(File.class, ByteBuffer.class, getmax3);
                access$900.getMin getmin3 = new access$900.getMin();
                registry5.getMax.getMax(File.class, InputStream.class, getmin3);
                setMaxHeight setmaxheight = new setMaxHeight();
                registry5.getMin.getMax("legacy_append", setmaxheight, File.class, File.class);
                access$900.setMax setmax3 = new access$900.setMax();
                registry5.getMax.getMax(File.class, ParcelFileDescriptor.class, setmax3);
                getSaturation.length length5 = getSaturation.length.length();
                registry5.getMax.getMax(File.class, File.class, length5);
                registry5.setMax.getMin(new onTransitionCompleted.getMax(setonhide2));
                if (obtainVelocityTracker.length()) {
                    Registry registry6 = this.getMax;
                    registry6.setMax.getMin(new obtainVelocityTracker.getMin());
                }
                Registry registry7 = this.getMax;
                WidgetRun$RunType.getMax getmax4 = getmax2;
                registry7.getMax.getMax(Integer.TYPE, InputStream.class, getmax4);
                WidgetRun$RunType.getMin getmin4 = getmin2;
                registry7.getMax.getMax(Integer.TYPE, ParcelFileDescriptor.class, getmin4);
                registry7.getMax.getMax(Integer.class, InputStream.class, getmax4);
                registry7.getMax.getMax(Integer.class, ParcelFileDescriptor.class, getmin4);
                WidgetRun$RunType.setMin setmin3 = setmin2;
                registry7.getMax.getMax(Integer.class, Uri.class, setmin3);
                WidgetRun$RunType.setMax setmax4 = setmax2;
                registry7.getMax.getMax(Integer.TYPE, AssetFileDescriptor.class, setmax4);
                registry7.getMax.getMax(Integer.class, AssetFileDescriptor.class, setmax4);
                registry7.getMax.getMax(Integer.TYPE, Uri.class, setmin3);
                access$1300.setMax setmax5 = new access$1300.setMax();
                registry7.getMax.getMax(String.class, InputStream.class, setmax5);
                access$1300.setMax setmax6 = new access$1300.setMax();
                registry7.getMax.getMax(Uri.class, InputStream.class, setmax6);
                ImageFilterButton.setMin setmin4 = new ImageFilterButton.setMin();
                registry7.getMax.getMax(String.class, InputStream.class, setmin4);
                ImageFilterButton.length length6 = new ImageFilterButton.length();
                registry7.getMax.getMax(String.class, ParcelFileDescriptor.class, length6);
                ImageFilterButton.getMin getmin5 = new ImageFilterButton.getMin();
                registry7.getMax.getMax(String.class, AssetFileDescriptor.class, getmin5);
                setWarmth.setMax setmax7 = new setWarmth.setMax();
                registry7.getMax.getMax(Uri.class, InputStream.class, setmax7);
                access$700.setMin setmin5 = new access$700.setMin(context.getAssets());
                registry7.getMax.getMax(Uri.class, InputStream.class, setmin5);
                access$700.getMax getmax5 = new access$700.getMax(context.getAssets());
                registry7.getMax.getMax(Uri.class, ParcelFileDescriptor.class, getmax5);
                Context context3 = context;
                setCrossfade.getMin getmin6 = new setCrossfade.getMin(context3);
                registry7.getMax.getMax(Uri.class, InputStream.class, getmin6);
                setRoundPercent.getMax getmax6 = new setRoundPercent.getMax(context3);
                registry7.getMax.getMax(Uri.class, InputStream.class, getmax6);
                if (Build.VERSION.SDK_INT >= 29) {
                    Registry registry8 = this.getMax;
                    getCrossfade.getMin getmin7 = new getCrossfade.getMin(context3);
                    registry8.getMax.getMax(Uri.class, InputStream.class, getmin7);
                    Registry registry9 = this.getMax;
                    getCrossfade.getMax getmax7 = new getCrossfade.getMax(context3);
                    registry9.getMax.getMax(Uri.class, ParcelFileDescriptor.class, getmax7);
                }
                Registry registry10 = this.getMax;
                ContentResolver contentResolver2 = contentResolver;
                getContrast.length length7 = new getContrast.length(contentResolver2);
                registry10.getMax.getMax(Uri.class, InputStream.class, length7);
                getContrast.getMin getmin8 = new getContrast.getMin(contentResolver2);
                registry10.getMax.getMax(Uri.class, ParcelFileDescriptor.class, getmin8);
                getContrast.setMin setmin6 = new getContrast.setMin(contentResolver2);
                registry10.getMax.getMax(Uri.class, AssetFileDescriptor.class, setmin6);
                getWarmth.setMax setmax8 = new getWarmth.setMax();
                registry10.getMax.getMax(Uri.class, InputStream.class, setmax8);
                setRound.getMax getmax8 = new setRound.getMax();
                registry10.getMax.getMax(URL.class, InputStream.class, getmax8);
                access$1700.length length8 = new access$1700.length(context3);
                registry10.getMax.getMax(Uri.class, File.class, length8);
                setContrast.setMin setmin7 = new setContrast.setMin();
                registry10.getMax.getMax(access$1400.class, InputStream.class, setmin7);
                access$1200.length length9 = new access$1200.length();
                Class<byte[]> cls3 = cls2;
                registry10.getMax.getMax(cls3, ByteBuffer.class, length9);
                access$1200.getMax getmax9 = new access$1200.getMax();
                registry10.getMax.getMax(cls3, InputStream.class, getmax9);
                getSaturation.length length10 = getSaturation.length.length();
                registry10.getMax.getMax(Uri.class, Uri.class, length10);
                getSaturation.length length11 = getSaturation.length.length();
                registry10.getMax.getMax(Drawable.class, Drawable.class, length11);
                getMinWidth getminwidth = new getMinWidth();
                registry10.getMin.getMax("legacy_append", getminwidth, Drawable.class, Drawable.class);
                getViewById getviewbyid = new getViewById(resources);
                registry10.IsOverlapping.setMin(Bitmap.class, BitmapDrawable.class, getviewbyid);
                setSelfDimensionBehaviour setselfdimensionbehaviour2 = setselfdimensionbehaviour;
                registry10.IsOverlapping.setMin(Bitmap.class, cls3, setselfdimensionbehaviour2);
                getOptimizationLevel getoptimizationlevel2 = getoptimizationlevel;
                setOptimizationLevel setoptimizationlevel = new setOptimizationLevel(rebuildscene2, setselfdimensionbehaviour2, getoptimizationlevel2);
                registry10.IsOverlapping.setMin(Drawable.class, cls3, setoptimizationlevel);
                registry10.IsOverlapping.setMin(getViewWidget.class, cls3, getoptimizationlevel2);
                if (Build.VERSION.SDK_INT >= 23) {
                    setElevation<ByteBuffer, Bitmap> min2 = setDesignInformation.setMin(rebuildscene);
                    this.getMax.getMin.getMax("legacy_append", min2, ByteBuffer.class, Bitmap.class);
                    Registry registry11 = this.getMax;
                    getRound getround4 = new getRound(resources, min2);
                    registry11.getMin.getMax("legacy_append", getround4, ByteBuffer.class, BitmapDrawable.class);
                }
                Context context4 = context;
                setOnHide setonhide3 = setonhide;
                this.setMax = new setFirstHorizontalStyle(context4, setonhide3, this.getMax, new getChildRect(), length2, map, list, setdebugmode, z, i);
                return;
            }
            throw new Registry.NoImageHeaderParserException();
        }
        throw new Registry.NoImageHeaderParserException();
    }

    @NonNull
    public static setHorizontalGap getMax(@NonNull Fragment fragment) {
        Context context = fragment.getContext();
        if (context != null) {
            return setMax(context).length.setMin(fragment);
        }
        throw new NullPointerException("You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
    }

    /* JADX WARNING: type inference failed for: r4v6, types: [androidx.fragment.app.Fragment] */
    /* JADX WARNING: type inference failed for: r4v8, types: [androidx.fragment.app.Fragment] */
    /* JADX WARNING: type inference failed for: r4v13 */
    /* JADX WARNING: type inference failed for: r4v14 */
    /* JADX WARNING: type inference failed for: r4v15 */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0080, code lost:
        r4 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0080, code lost:
        r4 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00c3, code lost:
        r4 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00c3, code lost:
        r4 = r4;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    @androidx.annotation.NonNull
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static o.setHorizontalGap setMin(@androidx.annotation.NonNull android.view.View r6) {
        /*
            android.content.Context r0 = r6.getContext()
            if (r0 == 0) goto L_0x0118
            com.bumptech.glide.Glide r0 = setMax(r0)
            o.getContent r0 = r0.length
            boolean r1 = o.getDependents.setMin()
            if (r1 == 0) goto L_0x001f
            android.content.Context r6 = r6.getContext()
            android.content.Context r6 = r6.getApplicationContext()
            o.setHorizontalGap r6 = r0.length(r6)
            return r6
        L_0x001f:
            if (r6 == 0) goto L_0x0110
            android.content.Context r1 = r6.getContext()
            if (r1 == 0) goto L_0x0108
            android.content.Context r1 = r6.getContext()
            android.app.Activity r1 = o.getContent.setMax((android.content.Context) r1)
            if (r1 != 0) goto L_0x003e
            android.content.Context r6 = r6.getContext()
            android.content.Context r6 = r6.getApplicationContext()
            o.setHorizontalGap r6 = r0.length(r6)
            return r6
        L_0x003e:
            boolean r2 = r1 instanceof androidx.fragment.app.FragmentActivity
            r3 = 16908290(0x1020002, float:2.3877235E-38)
            r4 = 0
            if (r2 == 0) goto L_0x0091
            androidx.fragment.app.FragmentActivity r1 = (androidx.fragment.app.FragmentActivity) r1
            o.PlaybackStateCompat<android.view.View, androidx.fragment.app.Fragment> r2 = r0.length
            r2.clear()
            androidx.fragment.app.FragmentManager r2 = r1.getSupportFragmentManager()
            o.scheduleDrawable r2 = r2.getMin
            java.util.List r2 = r2.getMin()
            o.PlaybackStateCompat<android.view.View, androidx.fragment.app.Fragment> r5 = r0.length
            o.getContent.length((java.util.Collection<androidx.fragment.app.Fragment>) r2, (java.util.Map<android.view.View, androidx.fragment.app.Fragment>) r5)
            android.view.View r2 = r1.findViewById(r3)
        L_0x0060:
            boolean r3 = r6.equals(r2)
            if (r3 != 0) goto L_0x0080
            o.PlaybackStateCompat<android.view.View, androidx.fragment.app.Fragment> r3 = r0.length
            java.lang.Object r3 = r3.get(r6)
            r4 = r3
            androidx.fragment.app.Fragment r4 = (androidx.fragment.app.Fragment) r4
            if (r4 != 0) goto L_0x0080
            android.view.ViewParent r3 = r6.getParent()
            boolean r3 = r3 instanceof android.view.View
            if (r3 == 0) goto L_0x0080
            android.view.ViewParent r6 = r6.getParent()
            android.view.View r6 = (android.view.View) r6
            goto L_0x0060
        L_0x0080:
            o.PlaybackStateCompat<android.view.View, androidx.fragment.app.Fragment> r6 = r0.length
            r6.clear()
            if (r4 == 0) goto L_0x008c
            o.setHorizontalGap r6 = r0.setMin((androidx.fragment.app.Fragment) r4)
            return r6
        L_0x008c:
            o.setHorizontalGap r6 = r0.setMax((androidx.fragment.app.FragmentActivity) r1)
            return r6
        L_0x0091:
            o.PlaybackStateCompat<android.view.View, android.app.Fragment> r2 = r0.getMin
            r2.clear()
            android.app.FragmentManager r2 = r1.getFragmentManager()
            o.PlaybackStateCompat<android.view.View, android.app.Fragment> r5 = r0.getMin
            r0.length((android.app.FragmentManager) r2, (o.PlaybackStateCompat<android.view.View, android.app.Fragment>) r5)
            android.view.View r2 = r1.findViewById(r3)
        L_0x00a3:
            boolean r3 = r6.equals(r2)
            if (r3 != 0) goto L_0x00c3
            o.PlaybackStateCompat<android.view.View, android.app.Fragment> r3 = r0.getMin
            java.lang.Object r3 = r3.get(r6)
            r4 = r3
            android.app.Fragment r4 = (android.app.Fragment) r4
            if (r4 != 0) goto L_0x00c3
            android.view.ViewParent r3 = r6.getParent()
            boolean r3 = r3 instanceof android.view.View
            if (r3 == 0) goto L_0x00c3
            android.view.ViewParent r6 = r6.getParent()
            android.view.View r6 = (android.view.View) r6
            goto L_0x00a3
        L_0x00c3:
            o.PlaybackStateCompat<android.view.View, android.app.Fragment> r6 = r0.getMin
            r6.clear()
            if (r4 != 0) goto L_0x00cf
            o.setHorizontalGap r6 = r0.setMax((android.app.Activity) r1)
            return r6
        L_0x00cf:
            android.app.Activity r6 = r4.getActivity()
            if (r6 == 0) goto L_0x0100
            boolean r6 = o.getDependents.setMin()
            if (r6 != 0) goto L_0x00f3
            int r6 = android.os.Build.VERSION.SDK_INT
            r1 = 17
            if (r6 >= r1) goto L_0x00e2
            goto L_0x00f3
        L_0x00e2:
            android.app.FragmentManager r6 = r4.getChildFragmentManager()
            android.app.Activity r1 = r4.getActivity()
            boolean r2 = r4.isVisible()
            o.setHorizontalGap r6 = r0.setMin(r1, r6, r4, r2)
            return r6
        L_0x00f3:
            android.app.Activity r6 = r4.getActivity()
            android.content.Context r6 = r6.getApplicationContext()
            o.setHorizontalGap r6 = r0.length(r6)
            return r6
        L_0x0100:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "You cannot start a load on a fragment before it is attached"
            r6.<init>(r0)
            throw r6
        L_0x0108:
            java.lang.NullPointerException r6 = new java.lang.NullPointerException
            java.lang.String r0 = "Unable to obtain a request manager for a view without a Context"
            r6.<init>(r0)
            throw r6
        L_0x0110:
            java.lang.NullPointerException r6 = new java.lang.NullPointerException
            java.lang.String r0 = "Argument must not be null"
            r6.<init>(r0)
            throw r6
        L_0x0118:
            java.lang.NullPointerException r6 = new java.lang.NullPointerException
            java.lang.String r0 = "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed)."
            r6.<init>(r0)
            goto L_0x0121
        L_0x0120:
            throw r6
        L_0x0121:
            goto L_0x0120
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.Glide.setMin(android.view.View):o.setHorizontalGap");
    }

    public final boolean length(@NonNull layoutChildWithAnchor<?> layoutchildwithanchor) {
        synchronized (this.IsOverlapping) {
            for (setHorizontalGap max : this.IsOverlapping) {
                if (max.setMax(layoutchildwithanchor)) {
                    return true;
                }
            }
            return false;
        }
    }

    @NonNull
    public static setHorizontalGap getMax(@NonNull Context context) {
        if (context != null) {
            return setMax(context).length.length(context);
        }
        throw new NullPointerException("You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
    }

    @NonNull
    public static setHorizontalGap setMin(@NonNull FragmentActivity fragmentActivity) {
        if (fragmentActivity != null) {
            return setMax(fragmentActivity).length.setMax(fragmentActivity);
        }
        throw new NullPointerException("You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
    }

    public void onTrimMemory(int i) {
        getDependents.length();
        for (setHorizontalGap onTrimMemory : this.IsOverlapping) {
            onTrimMemory.onTrimMemory(i);
        }
        this.FastBitmap$CoordinateSystem.getMax(i);
        this.getMin.setMin(i);
        this.setMin.setMin(i);
    }

    public void onLowMemory() {
        getDependents.length();
        this.FastBitmap$CoordinateSystem.getMax();
        this.getMin.getMax();
        this.setMin.setMax();
    }
}
