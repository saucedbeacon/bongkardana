package com.andrognito.flashbar.anim;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import com.andrognito.flashbar.Flashbar;
import com.ap.zoloz.hummer.biz.HummerConstants;
import java.util.LinkedHashSet;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.setCollapseContentDescription;
import o.setCollapseIcon;
import o.setNavigationOnClickListener;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0002)*B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u000b\u001a\u00020\u0000H\u0016J\b\u0010\f\u001a\u00020\u0000H\u0016J\b\u0010\r\u001a\u00020\u0000H\u0016J\u0006\u0010\u000e\u001a\u00020\u0000J\r\u0010\u000f\u001a\u00020\u0010H\u0000¢\u0006\u0002\b\u0011J\b\u0010\u0012\u001a\u00020\u0000H\u0016J\u0010\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\r\u0010\u0016\u001a\u00020\u0000H\u0000¢\u0006\u0002\b\u0017J\r\u0010\u0018\u001a\u00020\u0000H\u0000¢\u0006\u0002\b\u0019J\r\u0010\u001a\u001a\u00020\u0000H\u0000¢\u0006\u0002\b\u001bJ\r\u0010\u001c\u001a\u00020\u0000H\u0000¢\u0006\u0002\b\u001dJ\u0010\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0012\u0010\u001e\u001a\u00020\u00002\b\b\u0001\u0010 \u001a\u00020!H\u0016J\u0006\u0010\"\u001a\u00020\u0000J\u0006\u0010#\u001a\u00020\u0000J\u0006\u0010$\u001a\u00020\u0000J\u0015\u0010%\u001a\u00020\u00002\u0006\u0010&\u001a\u00020'H\u0010¢\u0006\u0002\b(R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Lcom/andrognito/flashbar/anim/FlashAnimBarBuilder;", "Lcom/andrognito/flashbar/anim/BaseFlashAnimBuilder;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "direction", "Lcom/andrognito/flashbar/anim/FlashAnimBarBuilder$Direction;", "gravity", "Lcom/andrognito/flashbar/Flashbar$Gravity;", "type", "Lcom/andrognito/flashbar/anim/FlashAnimBarBuilder$Type;", "accelerate", "accelerateDecelerate", "alpha", "anticipateOvershoot", "build", "Lcom/andrognito/flashbar/anim/FlashAnim;", "build$flashbar_release", "decelerate", "duration", "millis", "", "enter", "enter$flashbar_release", "exit", "exit$flashbar_release", "fromBottom", "fromBottom$flashbar_release", "fromTop", "fromTop$flashbar_release", "interpolator", "Landroid/view/animation/Interpolator;", "id", "", "overshoot", "slideFromLeft", "slideFromRight", "withView", "view", "Landroid/view/View;", "withView$flashbar_release", "Direction", "Type", "flashbar_release"}, k = 1, mv = {1, 1, 10})
public final class FlashAnimBarBuilder extends setNavigationOnClickListener {
    public Flashbar.Gravity getMin;
    private Direction length;
    public Type setMin;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/andrognito/flashbar/anim/FlashAnimBarBuilder$Direction;", "", "(Ljava/lang/String;I)V", "LEFT", "RIGHT", "flashbar_release"}, k = 1, mv = {1, 1, 10})
    public enum Direction {
        LEFT,
        RIGHT
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/andrognito/flashbar/anim/FlashAnimBarBuilder$Type;", "", "(Ljava/lang/String;I)V", "ENTER", "EXIT", "flashbar_release"}, k = 1, mv = {1, 1, 10})
    public enum Type {
        ENTER,
        EXIT
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlashAnimBarBuilder(@NotNull Context context) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, HummerConstants.CONTEXT);
    }

    public final /* synthetic */ setNavigationOnClickListener getMin(View view) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.getMin(view);
        return this;
    }

    @NotNull
    public final FlashAnimBarBuilder getMax(long j) {
        super.getMin(j);
        return this;
    }

    @NotNull
    public final FlashAnimBarBuilder isInside() {
        super.toFloatRange();
        return this;
    }

    @NotNull
    public final FlashAnimBarBuilder equals() {
        super.IsOverlapping();
        return this;
    }

    @NotNull
    public final FlashAnimBarBuilder values() {
        FlashAnimBarBuilder flashAnimBarBuilder = this;
        flashAnimBarBuilder.setMax(new OvershootInterpolator());
        return flashAnimBarBuilder;
    }

    @NotNull
    public final FlashAnimBarBuilder setMin(@NotNull View view) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.getMin(view);
        return this;
    }

    @NotNull
    public final setCollapseContentDescription toDoubleRange() {
        if (setMax() != null) {
            AnimatorSet animatorSet = new AnimatorSet();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            ObjectAnimator objectAnimator = new ObjectAnimator();
            if (this.length == null) {
                objectAnimator.setPropertyName("translationY");
                Type type = this.setMin;
                if (type == null) {
                    Intrinsics.throwNpe();
                }
                int i = setCollapseIcon.getMin[type.ordinal()];
                if (i == 1) {
                    Flashbar.Gravity gravity = this.getMin;
                    if (gravity == null) {
                        Intrinsics.throwNpe();
                    }
                    int i2 = setCollapseIcon.setMax[gravity.ordinal()];
                    if (i2 == 1) {
                        float[] fArr = new float[2];
                        View max = setMax();
                        if (max == null) {
                            Intrinsics.throwNpe();
                        }
                        fArr[0] = -((float) max.getHeight());
                        fArr[1] = 0.0f;
                        objectAnimator.setFloatValues(fArr);
                    } else if (i2 == 2) {
                        float[] fArr2 = new float[2];
                        View max2 = setMax();
                        if (max2 == null) {
                            Intrinsics.throwNpe();
                        }
                        fArr2[0] = (float) max2.getHeight();
                        fArr2[1] = 0.0f;
                        objectAnimator.setFloatValues(fArr2);
                    }
                } else if (i == 2) {
                    Flashbar.Gravity gravity2 = this.getMin;
                    if (gravity2 == null) {
                        Intrinsics.throwNpe();
                    }
                    int i3 = setCollapseIcon.setMin[gravity2.ordinal()];
                    if (i3 == 1) {
                        float[] fArr3 = new float[2];
                        fArr3[0] = 0.0f;
                        View max3 = setMax();
                        if (max3 == null) {
                            Intrinsics.throwNpe();
                        }
                        fArr3[1] = -((float) max3.getHeight());
                        objectAnimator.setFloatValues(fArr3);
                    } else if (i3 == 2) {
                        float[] fArr4 = new float[2];
                        fArr4[0] = 0.0f;
                        View max4 = setMax();
                        if (max4 == null) {
                            Intrinsics.throwNpe();
                        }
                        fArr4[1] = (float) max4.getHeight();
                        objectAnimator.setFloatValues(fArr4);
                    }
                }
            } else {
                objectAnimator.setPropertyName("translationX");
                Type type2 = this.setMin;
                if (type2 == null) {
                    Intrinsics.throwNpe();
                }
                int i4 = setCollapseIcon.equals[type2.ordinal()];
                if (i4 == 1) {
                    Direction direction = this.length;
                    if (direction == null) {
                        Intrinsics.throwNpe();
                    }
                    int i5 = setCollapseIcon.getMax[direction.ordinal()];
                    if (i5 == 1) {
                        float[] fArr5 = new float[2];
                        View max5 = setMax();
                        if (max5 == null) {
                            Intrinsics.throwNpe();
                        }
                        fArr5[0] = -((float) max5.getWidth());
                        fArr5[1] = 0.0f;
                        objectAnimator.setFloatValues(fArr5);
                    } else if (i5 == 2) {
                        float[] fArr6 = new float[2];
                        View max6 = setMax();
                        if (max6 == null) {
                            Intrinsics.throwNpe();
                        }
                        fArr6[0] = (float) max6.getWidth();
                        fArr6[1] = 0.0f;
                        objectAnimator.setFloatValues(fArr6);
                    }
                } else if (i4 == 2) {
                    Direction direction2 = this.length;
                    if (direction2 == null) {
                        Intrinsics.throwNpe();
                    }
                    int i6 = setCollapseIcon.length[direction2.ordinal()];
                    if (i6 == 1) {
                        float[] fArr7 = new float[2];
                        fArr7[0] = 0.0f;
                        View max7 = setMax();
                        if (max7 == null) {
                            Intrinsics.throwNpe();
                        }
                        fArr7[1] = -((float) max7.getWidth());
                        objectAnimator.setFloatValues(fArr7);
                    } else if (i6 == 2) {
                        float[] fArr8 = new float[2];
                        fArr8[0] = 0.0f;
                        View max8 = setMax();
                        if (max8 == null) {
                            Intrinsics.throwNpe();
                        }
                        fArr8[1] = (float) max8.getWidth();
                        objectAnimator.setFloatValues(fArr8);
                    }
                }
            }
            objectAnimator.setTarget(setMax());
            linkedHashSet.add(objectAnimator);
            if (toIntRange()) {
                ObjectAnimator objectAnimator2 = new ObjectAnimator();
                objectAnimator2.setPropertyName("alpha");
                objectAnimator2.setTarget(setMax());
                Type type3 = this.setMin;
                if (type3 == null) {
                    Intrinsics.throwNpe();
                }
                int i7 = setCollapseIcon.isInside[type3.ordinal()];
                if (i7 == 1) {
                    objectAnimator2.setFloatValues(new float[]{getMin(), setMin()});
                } else if (i7 == 2) {
                    objectAnimator2.setFloatValues(new float[]{setMin(), getMin()});
                }
                linkedHashSet.add(objectAnimator2);
            }
            animatorSet.playTogether(linkedHashSet);
            animatorSet.setDuration(getMax());
            animatorSet.setInterpolator(length());
            return new setCollapseContentDescription(animatorSet);
        }
        throw new IllegalArgumentException("Target view can not be null".toString());
    }

    public final /* bridge */ /* synthetic */ setNavigationOnClickListener getMin(long j) {
        super.getMin(j);
        return this;
    }

    public final /* bridge */ /* synthetic */ setNavigationOnClickListener toFloatRange() {
        super.toFloatRange();
        return this;
    }

    public final /* bridge */ /* synthetic */ setNavigationOnClickListener IsOverlapping() {
        super.IsOverlapping();
        return this;
    }
}
