package com.google.android.youtube.player;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.internal.aa;
import com.google.android.youtube.player.internal.ab;
import com.google.android.youtube.player.internal.n;
import com.google.android.youtube.player.internal.s;
import com.google.android.youtube.player.internal.t;
import com.google.android.youtube.player.internal.w;
import com.google.android.youtube.player.internal.y;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public final class YouTubePlayerView extends ViewGroup implements YouTubePlayer.Provider {

    /* renamed from: a  reason: collision with root package name */
    private final a f9642a;
    /* access modifiers changed from: private */
    public final Set<View> b;
    private final b c;
    /* access modifiers changed from: private */
    public com.google.android.youtube.player.internal.b d;
    /* access modifiers changed from: private */
    public s e;
    /* access modifiers changed from: private */
    public View f;
    /* access modifiers changed from: private */
    public n g;
    private YouTubePlayer.Provider h;
    private Bundle i;
    private YouTubePlayer.OnInitializedListener j;
    private boolean k;
    /* access modifiers changed from: private */
    public boolean l;

    final class a implements ViewTreeObserver.OnGlobalFocusChangeListener {
        private a() {
        }

        /* synthetic */ a(YouTubePlayerView youTubePlayerView, byte b) {
            this();
        }

        public final void onGlobalFocusChanged(View view, View view2) {
            if (YouTubePlayerView.this.e != null && YouTubePlayerView.this.b.contains(view2) && !YouTubePlayerView.this.b.contains(view)) {
                YouTubePlayerView.this.e.g();
            }
        }
    }

    interface b {
        void a(YouTubePlayerView youTubePlayerView);

        void a(YouTubePlayerView youTubePlayerView, String str, YouTubePlayer.OnInitializedListener onInitializedListener);
    }

    public YouTubePlayerView(Context context) {
        this(context, (AttributeSet) null);
    }

    public YouTubePlayerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public YouTubePlayerView(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, ((YouTubeBaseActivity) context).a());
        if (context instanceof YouTubeBaseActivity) {
            return;
        }
        throw new IllegalStateException("A YouTubePlayerView can only be created with an Activity  which extends YouTubeBaseActivity as its context.");
    }

    YouTubePlayerView(Context context, AttributeSet attributeSet, int i2, b bVar) {
        super((Context) ab.a(context, (Object) "context cannot be null"), attributeSet, i2);
        this.c = (b) ab.a(bVar, (Object) "listener cannot be null");
        if (getBackground() == null) {
            setBackgroundColor(-16777216);
        }
        setClipToPadding(false);
        n nVar = new n(context);
        this.g = nVar;
        requestTransparentRegion(nVar);
        addView(this.g);
        this.b = new HashSet();
        this.f9642a = new a(this, (byte) 0);
    }

    private void a(View view) {
        if (!(view == this.g || (this.e != null && view == this.f))) {
            throw new UnsupportedOperationException("No views can be added on top of the player");
        }
    }

    /* access modifiers changed from: private */
    public void a(YouTubeInitializationResult youTubeInitializationResult) {
        this.e = null;
        this.g.c();
        YouTubePlayer.OnInitializedListener onInitializedListener = this.j;
        if (onInitializedListener != null) {
            onInitializedListener.onInitializationFailure(this.h, youTubeInitializationResult);
            this.j = null;
        }
    }

    static /* synthetic */ void a(YouTubePlayerView youTubePlayerView, Activity activity) {
        try {
            s sVar = new s(youTubePlayerView.d, aa.a().a(activity, youTubePlayerView.d, youTubePlayerView.k));
            youTubePlayerView.e = sVar;
            View a2 = sVar.a();
            youTubePlayerView.f = a2;
            youTubePlayerView.addView(a2);
            youTubePlayerView.removeView(youTubePlayerView.g);
            youTubePlayerView.c.a(youTubePlayerView);
            if (youTubePlayerView.j != null) {
                boolean z = false;
                Bundle bundle = youTubePlayerView.i;
                if (bundle != null) {
                    z = youTubePlayerView.e.a(bundle);
                    youTubePlayerView.i = null;
                }
                youTubePlayerView.j.onInitializationSuccess(youTubePlayerView.h, youTubePlayerView.e, z);
                youTubePlayerView.j = null;
            }
        } catch (w.a e2) {
            y.a("Error creating YouTubePlayerView", (Throwable) e2);
            youTubePlayerView.a(YouTubeInitializationResult.INTERNAL_ERROR);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        s sVar = this.e;
        if (sVar != null) {
            sVar.b();
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(final Activity activity, YouTubePlayer.Provider provider, String str, YouTubePlayer.OnInitializedListener onInitializedListener, Bundle bundle) {
        if (this.e == null && this.j == null) {
            ab.a(activity, (Object) "activity cannot be null");
            this.h = (YouTubePlayer.Provider) ab.a(provider, (Object) "provider cannot be null");
            this.j = (YouTubePlayer.OnInitializedListener) ab.a(onInitializedListener, (Object) "listener cannot be null");
            this.i = bundle;
            this.g.b();
            com.google.android.youtube.player.internal.b a2 = aa.a().a(getContext(), str, new t.a() {
                public final void a() {
                    if (YouTubePlayerView.this.d != null) {
                        YouTubePlayerView.a(YouTubePlayerView.this, activity);
                    }
                    com.google.android.youtube.player.internal.b unused = YouTubePlayerView.this.d = null;
                }

                public final void b() {
                    if (!YouTubePlayerView.this.l && YouTubePlayerView.this.e != null) {
                        YouTubePlayerView.this.e.f();
                    }
                    YouTubePlayerView.this.g.a();
                    YouTubePlayerView youTubePlayerView = YouTubePlayerView.this;
                    if (youTubePlayerView.indexOfChild(youTubePlayerView.g) < 0) {
                        YouTubePlayerView youTubePlayerView2 = YouTubePlayerView.this;
                        youTubePlayerView2.addView(youTubePlayerView2.g);
                        YouTubePlayerView youTubePlayerView3 = YouTubePlayerView.this;
                        youTubePlayerView3.removeView(youTubePlayerView3.f);
                    }
                    View unused = YouTubePlayerView.this.f = null;
                    s unused2 = YouTubePlayerView.this.e = null;
                    com.google.android.youtube.player.internal.b unused3 = YouTubePlayerView.this.d = null;
                }
            }, new t.b() {
                public final void a(YouTubeInitializationResult youTubeInitializationResult) {
                    YouTubePlayerView.this.a(youTubeInitializationResult);
                    com.google.android.youtube.player.internal.b unused = YouTubePlayerView.this.d = null;
                }
            });
            this.d = a2;
            a2.e();
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(boolean z) {
        if (!z || Build.VERSION.SDK_INT >= 14) {
            this.k = z;
            return;
        }
        y.a("Could not enable TextureView because API level is lower than 14", new Object[0]);
        this.k = false;
    }

    public final void addFocusables(ArrayList<View> arrayList, int i2) {
        ArrayList arrayList2 = new ArrayList();
        super.addFocusables(arrayList2, i2);
        arrayList.addAll(arrayList2);
        this.b.clear();
        this.b.addAll(arrayList2);
    }

    public final void addFocusables(ArrayList<View> arrayList, int i2, int i3) {
        ArrayList arrayList2 = new ArrayList();
        super.addFocusables(arrayList2, i2, i3);
        arrayList.addAll(arrayList2);
        this.b.clear();
        this.b.addAll(arrayList2);
    }

    public final void addView(View view) {
        a(view);
        super.addView(view);
    }

    public final void addView(View view, int i2) {
        a(view);
        super.addView(view, i2);
    }

    public final void addView(View view, int i2, int i3) {
        a(view);
        super.addView(view, i2, i3);
    }

    public final void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        a(view);
        super.addView(view, i2, layoutParams);
    }

    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        a(view);
        super.addView(view, layoutParams);
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        s sVar = this.e;
        if (sVar != null) {
            sVar.c();
        }
    }

    /* access modifiers changed from: package-private */
    public final void b(boolean z) {
        s sVar = this.e;
        if (sVar != null) {
            sVar.b(z);
            c(z);
        }
    }

    /* access modifiers changed from: package-private */
    public final void c() {
        s sVar = this.e;
        if (sVar != null) {
            sVar.d();
        }
    }

    /* access modifiers changed from: package-private */
    public final void c(boolean z) {
        this.l = true;
        s sVar = this.e;
        if (sVar != null) {
            sVar.a(z);
        }
    }

    public final void clearChildFocus(View view) {
        if (hasFocusable()) {
            requestFocus();
        } else {
            super.clearChildFocus(view);
        }
    }

    /* access modifiers changed from: package-private */
    public final void d() {
        s sVar = this.e;
        if (sVar != null) {
            sVar.e();
        }
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (this.e != null) {
            if (keyEvent.getAction() == 0) {
                return this.e.a(keyEvent.getKeyCode(), keyEvent) || super.dispatchKeyEvent(keyEvent);
            }
            if (keyEvent.getAction() == 1) {
                return this.e.b(keyEvent.getKeyCode(), keyEvent) || super.dispatchKeyEvent(keyEvent);
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    /* access modifiers changed from: package-private */
    public final Bundle e() {
        s sVar = this.e;
        return sVar == null ? this.i : sVar.h();
    }

    public final void focusableViewAvailable(View view) {
        super.focusableViewAvailable(view);
        this.b.add(view);
    }

    public final void initialize(String str, YouTubePlayer.OnInitializedListener onInitializedListener) {
        ab.a(str, (Object) "Developer key cannot be null or empty");
        this.c.a(this, str, onInitializedListener);
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnGlobalFocusChangeListener(this.f9642a);
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        s sVar = this.e;
        if (sVar != null) {
            sVar.a(configuration);
        }
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnGlobalFocusChangeListener(this.f9642a);
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        if (getChildCount() > 0) {
            getChildAt(0).layout(0, 0, i4 - i2, i5 - i3);
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i2, int i3) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            childAt.measure(i2, i3);
            setMeasuredDimension(childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
            return;
        }
        setMeasuredDimension(0, 0);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public final void requestChildFocus(View view, View view2) {
        super.requestChildFocus(view, view2);
        this.b.add(view2);
    }

    public final void setClipToPadding(boolean z) {
    }

    public final void setPadding(int i2, int i3, int i4, int i5) {
    }
}
