package o;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.TypedValue;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.TextView;
import com.mixpanel.android.mpmetrics.MiniInAppNotification;
import com.mixpanel.android.mpmetrics.UpdateDisplayState;
import java.util.concurrent.atomic.AtomicBoolean;
import o.updateAnchorFromPendingData;
import org.json.JSONException;
import org.json.JSONObject;

@SuppressLint({"ClickableViewAccessibility"})
@TargetApi(16)
public final class layoutChunk extends Fragment {
    private Runnable IsOverlapping;
    private Handler equals;
    Activity getMax;
    int getMin;
    private AtomicBoolean isInside = new AtomicBoolean();
    convertFocusDirectionToLayoutDirection length;
    GestureDetector setMax;
    UpdateDisplayState.DisplayState.InAppNotificationState setMin;
    View toFloatRange;
    private Runnable toIntRange;

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        this.getMax = activity;
        if (this.setMin == null) {
            getMin();
            return;
        }
        this.equals = new Handler();
        this.toIntRange = new Runnable() {
            public final void run() {
                layoutChunk.getMin(layoutChunk.this);
            }
        };
        this.IsOverlapping = new Runnable() {
            public final void run() {
                layoutChunk.this.toFloatRange.setVisibility(0);
                layoutChunk.this.toFloatRange.setOnTouchListener(new View.OnTouchListener() {
                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                        return layoutChunk.this.setMax.onTouchEvent(motionEvent);
                    }
                });
                float applyDimension = TypedValue.applyDimension(1, 65.0f, layoutChunk.this.getMax.getResources().getDisplayMetrics());
                TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, applyDimension, 0.0f);
                translateAnimation.setInterpolator(new DecelerateInterpolator());
                translateAnimation.setDuration(200);
                layoutChunk.this.toFloatRange.startAnimation(translateAnimation);
                float f = applyDimension / 2.0f;
                ScaleAnimation scaleAnimation = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, f, f);
                scaleAnimation.setInterpolator(new setMax());
                scaleAnimation.setDuration(400);
                scaleAnimation.setStartOffset(200);
                ((ImageView) layoutChunk.this.toFloatRange.findViewById(updateAnchorFromPendingData.setMax.setMax)).startAnimation(scaleAnimation);
            }
        };
        this.setMax = new GestureDetector(activity, new GestureDetector.OnGestureListener() {
            public final boolean onDown(MotionEvent motionEvent) {
                return true;
            }

            public final void onLongPress(MotionEvent motionEvent) {
            }

            public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                return false;
            }

            public final void onShowPress(MotionEvent motionEvent) {
            }

            public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                if (f2 <= 0.0f) {
                    return true;
                }
                layoutChunk.getMin(layoutChunk.this);
                return true;
            }

            public final boolean onSingleTapUp(MotionEvent motionEvent) {
                MiniInAppNotification miniInAppNotification = (MiniInAppNotification) layoutChunk.this.setMin.setMax;
                String str = miniInAppNotification.equals;
                JSONObject jSONObject = null;
                if (str != null && str.length() > 0) {
                    try {
                        try {
                            layoutChunk.this.getMax.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                        } catch (ActivityNotFoundException unused) {
                            findOnePartiallyOrCompletelyInvisibleChild.IsOverlapping();
                        }
                        try {
                            JSONObject jSONObject2 = new JSONObject();
                            try {
                                jSONObject2.put("url", str);
                                jSONObject = jSONObject2;
                            } catch (JSONException unused2) {
                                jSONObject = jSONObject2;
                                findOnePartiallyOrCompletelyInvisibleChild.toFloatRange();
                                layoutChunk.this.length.setMax.length("$campaign_open", miniInAppNotification, jSONObject);
                                layoutChunk.getMin(layoutChunk.this);
                                return true;
                            }
                        } catch (JSONException unused3) {
                            findOnePartiallyOrCompletelyInvisibleChild.toFloatRange();
                            layoutChunk.this.length.setMax.length("$campaign_open", miniInAppNotification, jSONObject);
                            layoutChunk.getMin(layoutChunk.this);
                            return true;
                        }
                    } catch (IllegalArgumentException unused4) {
                        findOnePartiallyOrCompletelyInvisibleChild.equals();
                        return true;
                    }
                }
                layoutChunk.this.length.setMax.length("$campaign_open", miniInAppNotification, jSONObject);
                layoutChunk.getMin(layoutChunk.this);
                return true;
            }
        });
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.isInside.set(false);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
        if (this.setMin == null) {
            getMin();
        } else {
            View inflate = layoutInflater.inflate(updateAnchorFromPendingData.length.com_mixpanel_android_activity_notification_mini, viewGroup, false);
            this.toFloatRange = inflate;
            TextView textView = (TextView) inflate.findViewById(updateAnchorFromPendingData.setMax.isInside);
            ImageView imageView = (ImageView) this.toFloatRange.findViewById(updateAnchorFromPendingData.setMax.setMax);
            MiniInAppNotification miniInAppNotification = (MiniInAppNotification) this.setMin.setMax;
            textView.setText(miniInAppNotification.toFloatRange);
            textView.setTextColor(miniInAppNotification.IsOverlapping);
            imageView.setImageBitmap(miniInAppNotification.isInside);
            this.equals.postDelayed(this.toIntRange, 10000);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(miniInAppNotification.setMin);
            gradientDrawable.setCornerRadius((((float) getActivity().getResources().getDisplayMetrics().densityDpi) / 160.0f) * 7.0f);
            gradientDrawable.setStroke((int) ((((float) getActivity().getResources().getDisplayMetrics().densityDpi) / 160.0f) * 2.0f), miniInAppNotification.toDoubleRange);
            if (Build.VERSION.SDK_INT < 16) {
                this.toFloatRange.setBackgroundDrawable(gradientDrawable);
            } else {
                this.toFloatRange.setBackground(gradientDrawable);
            }
            BitmapDrawable bitmapDrawable = new BitmapDrawable(getResources(), this.setMin.setMax.isInside);
            bitmapDrawable.setColorFilter(miniInAppNotification.toString, PorterDuff.Mode.SRC_ATOP);
            imageView.setImageDrawable(bitmapDrawable);
        }
        return this.toFloatRange;
    }

    public final void onStart() {
        super.onStart();
        if (this.isInside.get()) {
            this.getMax.getFragmentManager().beginTransaction().remove(this).commit();
        }
    }

    public final void onResume() {
        super.onResume();
        this.equals.postDelayed(this.IsOverlapping, 500);
    }

    public final void onPause() {
        super.onPause();
        getMin();
    }

    private void getMin() {
        if (!this.isInside.get()) {
            Handler handler = this.equals;
            if (handler != null) {
                handler.removeCallbacks(this.toIntRange);
                this.equals.removeCallbacks(this.IsOverlapping);
            }
            UpdateDisplayState.setMax(this.getMin);
            FragmentManager fragmentManager = this.getMax.getFragmentManager();
            try {
                fragmentManager.beginTransaction().remove(this).commit();
            } catch (IllegalStateException unused) {
                fragmentManager.beginTransaction().remove(this).commitAllowingStateLoss();
            }
        }
        this.isInside.set(true);
    }

    class setMax implements Interpolator {
        public setMax() {
        }

        public final float getInterpolation(float f) {
            return ((float) (-(Math.pow(2.718281828459045d, (double) (-8.0f * f)) * Math.cos((double) (f * 12.0f))))) + 1.0f;
        }
    }

    static /* synthetic */ void getMin(layoutChunk layoutchunk) {
        boolean isDestroyed = Build.VERSION.SDK_INT >= 17 ? layoutchunk.getMax.isDestroyed() : false;
        Activity activity = layoutchunk.getMax;
        if (activity != null && !activity.isFinishing() && !isDestroyed && !layoutchunk.isInside.get()) {
            layoutchunk.equals.removeCallbacks(layoutchunk.toIntRange);
            layoutchunk.equals.removeCallbacks(layoutchunk.IsOverlapping);
            FragmentManager fragmentManager = layoutchunk.getMax.getFragmentManager();
            try {
                fragmentManager.beginTransaction().setCustomAnimations(0, updateAnchorFromPendingData.getMin.getMin).remove(layoutchunk).commit();
            } catch (IllegalStateException unused) {
                fragmentManager.beginTransaction().setCustomAnimations(0, updateAnchorFromPendingData.getMin.getMin).remove(layoutchunk).commitAllowingStateLoss();
            }
            UpdateDisplayState.setMax(layoutchunk.getMin);
            layoutchunk.isInside.set(true);
        }
    }
}
