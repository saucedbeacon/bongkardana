package o;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Base64OutputStream;
import android.util.DisplayMetrics;
import android.util.JsonWriter;
import android.util.LruCache;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.alipay.zoloz.toyger.blob.BlobStatic;
import id.dana.lib.gcontainer.app.bridge.subapp.CloseSubAppEvent;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONObject;

@TargetApi(16)
public final class getHorizontalSnapPreference {
    private final setMin getMax = new setMin();
    private final List<onSeekTargetStep> getMin;
    private final shouldMeasureTwice length;
    private final getMax setMax = new getMax();
    private final Handler setMin = new Handler(Looper.getMainLooper());
    private final findFirstVisibleChildClosestToEnd toIntRange;

    public getHorizontalSnapPreference(Context context, List<onSeekTargetStep> list, findFirstVisibleChildClosestToEnd findfirstvisiblechildclosesttoend) {
        this.length = shouldMeasureTwice.getMax(context);
        this.getMin = list;
        this.toIntRange = findfirstvisiblechildclosesttoend;
    }

    public final void setMax(getSpeedPerPixel<Activity> getspeedperpixel, OutputStream outputStream) throws IOException {
        this.getMax.length = getspeedperpixel;
        FutureTask futureTask = new FutureTask(this.getMax);
        this.setMin.post(futureTask);
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);
        List emptyList = Collections.emptyList();
        outputStreamWriter.write("[");
        try {
            emptyList = (List) futureTask.get(1, TimeUnit.SECONDS);
        } catch (InterruptedException unused) {
            findOnePartiallyOrCompletelyInvisibleChild.getMin();
        } catch (TimeoutException unused2) {
            findOnePartiallyOrCompletelyInvisibleChild.equals();
        } catch (ExecutionException unused3) {
            findOnePartiallyOrCompletelyInvisibleChild.values();
        }
        int size = emptyList.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                outputStreamWriter.write(",");
            }
            length length2 = (length) emptyList.get(i);
            outputStreamWriter.write("{");
            outputStreamWriter.write("\"activity\":");
            outputStreamWriter.write(JSONObject.quote(length2.setMax));
            outputStreamWriter.write(",");
            outputStreamWriter.write("\"scale\":");
            outputStreamWriter.write(String.format("%s", new Object[]{Float.valueOf(length2.setMin)}));
            outputStreamWriter.write(",");
            outputStreamWriter.write("\"serialized_objects\":");
            JsonWriter jsonWriter = new JsonWriter(outputStreamWriter);
            jsonWriter.beginObject();
            jsonWriter.name("rootObject").value((long) length2.getMax.hashCode());
            jsonWriter.name("objects");
            View view = length2.getMax;
            jsonWriter.beginArray();
            length(jsonWriter, view);
            jsonWriter.endArray();
            jsonWriter.endObject();
            jsonWriter.flush();
            outputStreamWriter.write(",");
            outputStreamWriter.write("\"screenshot\":");
            outputStreamWriter.flush();
            length2.getMin.getMax(outputStream);
            outputStreamWriter.write("}");
        }
        outputStreamWriter.write("]");
        outputStreamWriter.flush();
    }

    private void length(JsonWriter jsonWriter, View view) throws IOException {
        String str;
        float f;
        if (view.getVisibility() != 4 || !this.length.IsOverlapping()) {
            int id2 = view.getId();
            if (-1 == id2) {
                str = null;
            } else {
                str = this.toIntRange.setMax(id2);
            }
            jsonWriter.beginObject();
            jsonWriter.name("hashCode").value((long) view.hashCode());
            jsonWriter.name("id").value((long) id2);
            jsonWriter.name("mp_id_name").value(str);
            CharSequence contentDescription = view.getContentDescription();
            if (contentDescription == null) {
                jsonWriter.name("contentDescription").nullValue();
            } else {
                jsonWriter.name("contentDescription").value(contentDescription.toString());
            }
            Object tag = view.getTag();
            if (tag == null) {
                jsonWriter.name("tag").nullValue();
            } else if (tag instanceof CharSequence) {
                jsonWriter.name("tag").value(tag.toString());
            }
            jsonWriter.name(CloseSubAppEvent.TOP).value((long) view.getTop());
            jsonWriter.name(TtmlNode.LEFT).value((long) view.getLeft());
            jsonWriter.name("width").value((long) view.getWidth());
            jsonWriter.name("height").value((long) view.getHeight());
            jsonWriter.name("scrollX").value((long) view.getScrollX());
            jsonWriter.name("scrollY").value((long) view.getScrollY());
            jsonWriter.name("visibility").value((long) view.getVisibility());
            float f2 = 0.0f;
            if (Build.VERSION.SDK_INT >= 11) {
                f2 = view.getTranslationX();
                f = view.getTranslationY();
            } else {
                f = 0.0f;
            }
            jsonWriter.name("translationX").value((double) f2);
            jsonWriter.name("translationY").value((double) f);
            jsonWriter.name("classes");
            jsonWriter.beginArray();
            Class cls = view.getClass();
            do {
                jsonWriter.value((String) this.setMax.get(cls));
                cls = cls.getSuperclass();
                if (cls == Object.class) {
                    break;
                }
            } while (cls != null);
            jsonWriter.endArray();
            Class<?> cls2 = view.getClass();
            for (onSeekTargetStep next : this.getMin) {
                if (next.setMin.isAssignableFrom(cls2) && next.getMin != null) {
                    validateChildOrder validatechildorder = next.getMin;
                    Object max = validatechildorder.getMax(view, validatechildorder.setMin);
                    if (max != null) {
                        if (max instanceof Number) {
                            jsonWriter.name(next.length).value((Number) max);
                        } else if (max instanceof Boolean) {
                            jsonWriter.name(next.length).value(((Boolean) max).booleanValue());
                        } else if (max instanceof ColorStateList) {
                            jsonWriter.name(next.length).value(Integer.valueOf(((ColorStateList) max).getDefaultColor()));
                        } else if (max instanceof Drawable) {
                            Drawable drawable = (Drawable) max;
                            Rect bounds = drawable.getBounds();
                            jsonWriter.name(next.length);
                            jsonWriter.beginObject();
                            jsonWriter.name("classes");
                            jsonWriter.beginArray();
                            for (Class cls3 = drawable.getClass(); cls3 != Object.class; cls3 = cls3.getSuperclass()) {
                                jsonWriter.value(cls3.getCanonicalName());
                            }
                            jsonWriter.endArray();
                            jsonWriter.name("dimensions");
                            jsonWriter.beginObject();
                            jsonWriter.name(TtmlNode.LEFT).value((long) bounds.left);
                            jsonWriter.name(TtmlNode.RIGHT).value((long) bounds.right);
                            jsonWriter.name(CloseSubAppEvent.TOP).value((long) bounds.top);
                            jsonWriter.name("bottom").value((long) bounds.bottom);
                            jsonWriter.endObject();
                            if (drawable instanceof ColorDrawable) {
                                jsonWriter.name("color").value((long) ((ColorDrawable) drawable).getColor());
                            }
                            jsonWriter.endObject();
                        } else {
                            jsonWriter.name(next.length).value(max.toString());
                        }
                    }
                }
            }
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof RelativeLayout.LayoutParams) {
                int[] rules = ((RelativeLayout.LayoutParams) layoutParams).getRules();
                jsonWriter.name("layoutRules");
                jsonWriter.beginArray();
                for (int i : rules) {
                    jsonWriter.value((long) i);
                }
                jsonWriter.endArray();
            }
            jsonWriter.name("subviews");
            jsonWriter.beginArray();
            boolean z = view instanceof ViewGroup;
            if (z) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = viewGroup.getChildAt(i2);
                    if (childAt != null) {
                        jsonWriter.value((long) childAt.hashCode());
                    }
                }
            }
            jsonWriter.endArray();
            jsonWriter.endObject();
            if (z) {
                ViewGroup viewGroup2 = (ViewGroup) view;
                int childCount2 = viewGroup2.getChildCount();
                for (int i3 = 0; i3 < childCount2; i3++) {
                    View childAt2 = viewGroup2.getChildAt(i3);
                    if (childAt2 != null) {
                        length(jsonWriter, childAt2);
                    }
                }
            }
        }
    }

    static class getMax extends LruCache<Class<?>, String> {
        /* access modifiers changed from: protected */
        public final /* synthetic */ Object create(Object obj) {
            return ((Class) obj).getCanonicalName();
        }

        public getMax() {
            super(255);
        }
    }

    static class setMin implements Callable<List<length>> {
        private final setMax getMax = new setMax();
        private final DisplayMetrics getMin = new DisplayMetrics();
        getSpeedPerPixel<Activity> length;
        private final List<length> setMax = new ArrayList();
        private final int setMin = BlobStatic.MONITOR_IMAGE_WIDTH;

        /* access modifiers changed from: private */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x00b8 A[SYNTHETIC, Splitter:B:23:0x00b8] */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x00d3  */
        /* JADX WARNING: Removed duplicated region for block: B:39:0x0110  */
        /* JADX WARNING: Removed duplicated region for block: B:43:0x0119  */
        /* JADX WARNING: Removed duplicated region for block: B:44:0x011e  */
        /* renamed from: setMax */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.util.List<o.getHorizontalSnapPreference.length> call() throws java.lang.Exception {
            /*
                r16 = this;
                r0 = r16
                java.util.List<o.getHorizontalSnapPreference$length> r1 = r0.setMax
                r1.clear()
                o.getSpeedPerPixel<android.app.Activity> r1 = r0.length
                java.lang.Thread r2 = java.lang.Thread.currentThread()
                android.os.Looper r3 = android.os.Looper.getMainLooper()
                java.lang.Thread r3 = r3.getThread()
                if (r2 != r3) goto L_0x012c
                java.util.Set<T> r1 = r1.setMax
                java.util.Set r1 = java.util.Collections.unmodifiableSet(r1)
                java.util.Iterator r1 = r1.iterator()
            L_0x0021:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L_0x0059
                java.lang.Object r2 = r1.next()
                android.app.Activity r2 = (android.app.Activity) r2
                java.lang.Class r3 = r2.getClass()
                java.lang.String r3 = r3.getCanonicalName()
                android.view.Window r4 = r2.getWindow()
                android.view.View r4 = r4.getDecorView()
                android.view.View r4 = r4.getRootView()
                android.view.WindowManager r2 = r2.getWindowManager()
                android.view.Display r2 = r2.getDefaultDisplay()
                android.util.DisplayMetrics r5 = r0.getMin
                r2.getMetrics(r5)
                o.getHorizontalSnapPreference$length r2 = new o.getHorizontalSnapPreference$length
                r2.<init>(r3, r4)
                java.util.List<o.getHorizontalSnapPreference$length> r3 = r0.setMax
                r3.add(r2)
                goto L_0x0021
            L_0x0059:
                java.util.List<o.getHorizontalSnapPreference$length> r1 = r0.setMax
                int r1 = r1.size()
                r2 = 0
                r3 = 0
            L_0x0061:
                if (r3 >= r1) goto L_0x0129
                java.util.List<o.getHorizontalSnapPreference$length> r4 = r0.setMax
                java.lang.Object r4 = r4.get(r3)
                o.getHorizontalSnapPreference$length r4 = (o.getHorizontalSnapPreference.length) r4
                android.view.View r5 = r4.getMax
                r6 = 0
                r7 = 1
                java.lang.Class<android.view.View> r8 = android.view.View.class
                java.lang.String r9 = "createSnapshot"
                r10 = 3
                java.lang.Class[] r11 = new java.lang.Class[r10]     // Catch:{ NoSuchMethodException -> 0x00b2, IllegalArgumentException -> 0x00ae, InvocationTargetException -> 0x00aa, IllegalAccessException -> 0x00a6, ClassCastException -> 0x00a2 }
                java.lang.Class<android.graphics.Bitmap$Config> r12 = android.graphics.Bitmap.Config.class
                r11[r2] = r12     // Catch:{ NoSuchMethodException -> 0x00b2, IllegalArgumentException -> 0x00ae, InvocationTargetException -> 0x00aa, IllegalAccessException -> 0x00a6, ClassCastException -> 0x00a2 }
                java.lang.Class r12 = java.lang.Integer.TYPE     // Catch:{ NoSuchMethodException -> 0x00b2, IllegalArgumentException -> 0x00ae, InvocationTargetException -> 0x00aa, IllegalAccessException -> 0x00a6, ClassCastException -> 0x00a2 }
                r11[r7] = r12     // Catch:{ NoSuchMethodException -> 0x00b2, IllegalArgumentException -> 0x00ae, InvocationTargetException -> 0x00aa, IllegalAccessException -> 0x00a6, ClassCastException -> 0x00a2 }
                java.lang.Class r12 = java.lang.Boolean.TYPE     // Catch:{ NoSuchMethodException -> 0x00b2, IllegalArgumentException -> 0x00ae, InvocationTargetException -> 0x00aa, IllegalAccessException -> 0x00a6, ClassCastException -> 0x00a2 }
                r13 = 2
                r11[r13] = r12     // Catch:{ NoSuchMethodException -> 0x00b2, IllegalArgumentException -> 0x00ae, InvocationTargetException -> 0x00aa, IllegalAccessException -> 0x00a6, ClassCastException -> 0x00a2 }
                java.lang.reflect.Method r8 = r8.getDeclaredMethod(r9, r11)     // Catch:{ NoSuchMethodException -> 0x00b2, IllegalArgumentException -> 0x00ae, InvocationTargetException -> 0x00aa, IllegalAccessException -> 0x00a6, ClassCastException -> 0x00a2 }
                r8.setAccessible(r7)     // Catch:{ NoSuchMethodException -> 0x00b2, IllegalArgumentException -> 0x00ae, InvocationTargetException -> 0x00aa, IllegalAccessException -> 0x00a6, ClassCastException -> 0x00a2 }
                java.lang.Object[] r9 = new java.lang.Object[r10]     // Catch:{ NoSuchMethodException -> 0x00b2, IllegalArgumentException -> 0x00ae, InvocationTargetException -> 0x00aa, IllegalAccessException -> 0x00a6, ClassCastException -> 0x00a2 }
                android.graphics.Bitmap$Config r10 = android.graphics.Bitmap.Config.RGB_565     // Catch:{ NoSuchMethodException -> 0x00b2, IllegalArgumentException -> 0x00ae, InvocationTargetException -> 0x00aa, IllegalAccessException -> 0x00a6, ClassCastException -> 0x00a2 }
                r9[r2] = r10     // Catch:{ NoSuchMethodException -> 0x00b2, IllegalArgumentException -> 0x00ae, InvocationTargetException -> 0x00aa, IllegalAccessException -> 0x00a6, ClassCastException -> 0x00a2 }
                r10 = -1
                java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ NoSuchMethodException -> 0x00b2, IllegalArgumentException -> 0x00ae, InvocationTargetException -> 0x00aa, IllegalAccessException -> 0x00a6, ClassCastException -> 0x00a2 }
                r9[r7] = r10     // Catch:{ NoSuchMethodException -> 0x00b2, IllegalArgumentException -> 0x00ae, InvocationTargetException -> 0x00aa, IllegalAccessException -> 0x00a6, ClassCastException -> 0x00a2 }
                java.lang.Boolean r10 = java.lang.Boolean.FALSE     // Catch:{ NoSuchMethodException -> 0x00b2, IllegalArgumentException -> 0x00ae, InvocationTargetException -> 0x00aa, IllegalAccessException -> 0x00a6, ClassCastException -> 0x00a2 }
                r9[r13] = r10     // Catch:{ NoSuchMethodException -> 0x00b2, IllegalArgumentException -> 0x00ae, InvocationTargetException -> 0x00aa, IllegalAccessException -> 0x00a6, ClassCastException -> 0x00a2 }
                java.lang.Object r8 = r8.invoke(r5, r9)     // Catch:{ NoSuchMethodException -> 0x00b2, IllegalArgumentException -> 0x00ae, InvocationTargetException -> 0x00aa, IllegalAccessException -> 0x00a6, ClassCastException -> 0x00a2 }
                android.graphics.Bitmap r8 = (android.graphics.Bitmap) r8     // Catch:{ NoSuchMethodException -> 0x00b2, IllegalArgumentException -> 0x00ae, InvocationTargetException -> 0x00aa, IllegalAccessException -> 0x00a6, ClassCastException -> 0x00a2 }
                goto L_0x00b6
            L_0x00a2:
                o.findOnePartiallyOrCompletelyInvisibleChild.values()
                goto L_0x00b5
            L_0x00a6:
                o.findOnePartiallyOrCompletelyInvisibleChild.values()
                goto L_0x00b5
            L_0x00aa:
                o.findOnePartiallyOrCompletelyInvisibleChild.values()
                goto L_0x00b5
            L_0x00ae:
                o.findOnePartiallyOrCompletelyInvisibleChild.getMin()
                goto L_0x00b5
            L_0x00b2:
                o.findOnePartiallyOrCompletelyInvisibleChild.setMax()
            L_0x00b5:
                r8 = r6
            L_0x00b6:
                if (r8 != 0) goto L_0x00cf
                boolean r9 = r5.isDrawingCacheEnabled()     // Catch:{ RuntimeException -> 0x00cc }
                java.lang.Boolean r6 = java.lang.Boolean.valueOf(r9)     // Catch:{ RuntimeException -> 0x00cc }
                r5.setDrawingCacheEnabled(r7)     // Catch:{ RuntimeException -> 0x00cc }
                r5.buildDrawingCache(r7)     // Catch:{ RuntimeException -> 0x00cc }
                android.graphics.Bitmap r7 = r5.getDrawingCache()     // Catch:{ RuntimeException -> 0x00cc }
                r8 = r7
                goto L_0x00cf
            L_0x00cc:
                o.findOnePartiallyOrCompletelyInvisibleChild.setMax()
            L_0x00cf:
                r7 = 1065353216(0x3f800000, float:1.0)
                if (r8 == 0) goto L_0x0110
                int r9 = r8.getDensity()
                if (r9 == 0) goto L_0x00dd
                r7 = 1126170624(0x43200000, float:160.0)
                float r9 = (float) r9
                float r7 = r7 / r9
            L_0x00dd:
                int r9 = r8.getWidth()
                int r10 = r8.getHeight()
                int r11 = r8.getWidth()
                float r11 = (float) r11
                float r11 = r11 * r7
                double r11 = (double) r11
                r13 = 4602678819172646912(0x3fe0000000000000, double:0.5)
                java.lang.Double.isNaN(r11)
                double r11 = r11 + r13
                int r11 = (int) r11
                int r12 = r8.getHeight()
                float r12 = (float) r12
                float r12 = r12 * r7
                r15 = r3
                double r2 = (double) r12
                java.lang.Double.isNaN(r2)
                double r2 = r2 + r13
                int r2 = (int) r2
                if (r9 <= 0) goto L_0x0111
                if (r10 <= 0) goto L_0x0111
                if (r11 <= 0) goto L_0x0111
                if (r2 <= 0) goto L_0x0111
                o.getHorizontalSnapPreference$setMax r3 = r0.getMax
                r3.setMax(r11, r2, r8)
                goto L_0x0111
            L_0x0110:
                r15 = r3
            L_0x0111:
                if (r6 == 0) goto L_0x011e
                boolean r2 = r6.booleanValue()
                if (r2 != 0) goto L_0x011e
                r2 = 0
                r5.setDrawingCacheEnabled(r2)
                goto L_0x011f
            L_0x011e:
                r2 = 0
            L_0x011f:
                r4.setMin = r7
                o.getHorizontalSnapPreference$setMax r3 = r0.getMax
                r4.getMin = r3
                int r3 = r15 + 1
                goto L_0x0061
            L_0x0129:
                java.util.List<o.getHorizontalSnapPreference$length> r1 = r0.setMax
                return r1
            L_0x012c:
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                java.lang.String r2 = "Can't remove an activity when not on the UI thread"
                r1.<init>(r2)
                goto L_0x0135
            L_0x0134:
                throw r1
            L_0x0135:
                goto L_0x0134
            */
            throw new UnsupportedOperationException("Method not decompiled: o.getHorizontalSnapPreference.setMin.call():java.util.List");
        }
    }

    static class setMax {
        private Bitmap getMin = null;
        private final Paint length = new Paint(2);

        public final synchronized void setMax(int i, int i2, Bitmap bitmap) {
            if (!(this.getMin != null && this.getMin.getWidth() == i && this.getMin.getHeight() == i2)) {
                try {
                    this.getMin = Bitmap.createBitmap(i, i2, Bitmap.Config.RGB_565);
                } catch (OutOfMemoryError unused) {
                    this.getMin = null;
                }
                if (this.getMin != null) {
                    this.getMin.setDensity(BlobStatic.MONITOR_IMAGE_WIDTH);
                }
            }
            if (this.getMin != null) {
                new Canvas(this.getMin).drawBitmap(bitmap, 0.0f, 0.0f, this.length);
            }
        }

        public final synchronized void getMax(OutputStream outputStream) throws IOException {
            if (!(this.getMin == null || this.getMin.getWidth() == 0)) {
                if (this.getMin.getHeight() != 0) {
                    outputStream.write(34);
                    Base64OutputStream base64OutputStream = new Base64OutputStream(outputStream, 2);
                    this.getMin.compress(Bitmap.CompressFormat.PNG, 100, base64OutputStream);
                    base64OutputStream.flush();
                    outputStream.write(34);
                    return;
                }
            }
            outputStream.write("null".getBytes());
        }
    }

    static class length {
        public final View getMax;
        public setMax getMin = null;
        public final String setMax;
        public float setMin = 1.0f;

        public length(String str, View view) {
            this.setMax = str;
            this.getMax = view;
        }
    }
}
