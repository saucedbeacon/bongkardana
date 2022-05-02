package com.andrognito.flashbar;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Spanned;
import android.widget.ImageView;
import androidx.annotation.ColorRes;
import com.andrognito.flashbar.anim.FlashAnimBarBuilder;
import com.ap.zoloz.hummer.biz.HummerConstants;
import id.dana.danah5.akulaku.AkuEventParamsKey;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import o.IntRange;
import o.ensureMenu;
import o.ensureMenuView;
import o.getCollapseContentDescription;
import o.setCollapseContentDescription;
import o.setTitleTextAppearance;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\r\u0018\u0000 \u00132\u00020\u0001:\n\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001bB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\t\u001a\u00020\nH\u0002J\u0006\u0010\u000b\u001a\u00020\nJ\b\u0010\f\u001a\u00020\nH\u0002J\b\u0010\r\u001a\u00020\nH\u0002J\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010\u0010\u001a\u00020\u000fJ\u0006\u0010\u0011\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX.¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/andrognito/flashbar/Flashbar;", "", "builder", "Lcom/andrognito/flashbar/Flashbar$Builder;", "(Lcom/andrognito/flashbar/Flashbar$Builder;)V", "flashbarContainerView", "Lcom/andrognito/flashbar/FlashbarContainerView;", "flashbarView", "Lcom/andrognito/flashbar/FlashbarView;", "construct", "", "dismiss", "initializeBarDecor", "initializeContainerDecor", "isShowing", "", "isShown", "show", "Builder", "Companion", "DismissEvent", "Gravity", "OnActionTapListener", "OnBarDismissListener", "OnBarShowListener", "OnTapListener", "ProgressPosition", "Vibration", "flashbar_release"}, k = 1, mv = {1, 1, 10})
public final class Flashbar {
    public static final length getMax = new length((byte) 0);
    public FlashbarContainerView getMin;
    private FlashbarView length;
    public setMin setMax;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/andrognito/flashbar/Flashbar$DismissEvent;", "", "(Ljava/lang/String;I)V", "TIMEOUT", "MANUAL", "TAP_OUTSIDE", "SWIPE", "flashbar_release"}, k = 1, mv = {1, 1, 10})
    public enum DismissEvent {
        TIMEOUT,
        MANUAL,
        TAP_OUTSIDE,
        SWIPE
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/andrognito/flashbar/Flashbar$Gravity;", "", "(Ljava/lang/String;I)V", "TOP", "BOTTOM", "flashbar_release"}, k = 1, mv = {1, 1, 10})
    public enum Gravity {
        TOP,
        BOTTOM
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/andrognito/flashbar/Flashbar$ProgressPosition;", "", "(Ljava/lang/String;I)V", "LEFT", "RIGHT", "flashbar_release"}, k = 1, mv = {1, 1, 10})
    public enum ProgressPosition {
        LEFT,
        RIGHT
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/andrognito/flashbar/Flashbar$Vibration;", "", "(Ljava/lang/String;I)V", "SHOW", "DISMISS", "flashbar_release"}, k = 1, mv = {1, 1, 10})
    public enum Vibration {
        SHOW,
        DISMISS
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/andrognito/flashbar/Flashbar$OnTapListener;", "", "onTap", "", "flashbar", "Lcom/andrognito/flashbar/Flashbar;", "flashbar_release"}, k = 1, mv = {1, 1, 10})
    public interface equals {
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH&J\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\rH&¨\u0006\u000e"}, d2 = {"Lcom/andrognito/flashbar/Flashbar$OnBarDismissListener;", "", "onDismissProgress", "", "bar", "Lcom/andrognito/flashbar/Flashbar;", "progress", "", "onDismissed", "event", "Lcom/andrognito/flashbar/Flashbar$DismissEvent;", "onDismissing", "isSwiped", "", "flashbar_release"}, k = 1, mv = {1, 1, 10})
    public interface getMax {
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/andrognito/flashbar/Flashbar$OnActionTapListener;", "", "onActionTapped", "", "bar", "Lcom/andrognito/flashbar/Flashbar;", "flashbar_release"}, k = 1, mv = {1, 1, 10})
    public interface getMin {
        void setMax();
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\n"}, d2 = {"Lcom/andrognito/flashbar/Flashbar$OnBarShowListener;", "", "onShowProgress", "", "bar", "Lcom/andrognito/flashbar/Flashbar;", "progress", "", "onShowing", "onShown", "flashbar_release"}, k = 1, mv = {1, 1, 10})
    public interface setMax {
    }

    private Flashbar(setMin setmin) {
        this.setMax = setmin;
    }

    public /* synthetic */ Flashbar(@NotNull setMin setmin, byte b) {
        this(setmin);
    }

    public final boolean setMax() {
        FlashbarContainerView flashbarContainerView = this.getMin;
        if (flashbarContainerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("flashbarContainerView");
        }
        return flashbarContainerView.isBarShown$flashbar_release();
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000Î\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\bC\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b(\n\u0002\u0010\u0011\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0011\u0010\b\u001a\u00020\u00002\t\b\u0001\u0010\u0002\u001a\u00020\tJ\u0012\u0010\u0002\u001a\u00020\u00002\t\b\u0001\u0010\u0002\u001a\u00020\tJ\u000f\u0010\u000f\u001a\u00020\u00002\u0007\u0010\u0002\u001a\u00020\u0010J\u0011\u0010\u000f\u001a\u00020\u00002\t\b\u0001\u0010\u0002\u001a\u00020\tJ\u0011\u0010\u0002\u001a\u00020\u00002\b\u0010\u0002\u001a\u00030\u0001J\u0011\u0010\u0002\u001a\u00020\u00002\b\u0010\u0002\u001a\u00030\u0001J\b\u0010\u0002\u001a\u00030\u0002J\u001e\u0010\u001b\u001a\u00020\u00002\t\b\u0002\u0010\u0002\u001a\u00020\u00162\t\b\u0002\u0010\u0002\u001a\u00020\tH\u0007J\n\u0010\u0002\u001a\u00030\u0002H\u0002J\u0007\u0010\u0002\u001a\u00020\u0000J\u000f\u0010\u001e\u001a\u00020\u00002\u0007\u0010 \u0002\u001a\u00020\u001fJ\u0006\u0010$\u001a\u00020\u0000J\u0010\u0010¡\u0002\u001a\u00020\u00002\u0007\u0010¢\u0002\u001a\u00020(J\u0010\u0010£\u0002\u001a\u00020\u00002\u0007\u0010¢\u0002\u001a\u00020(J\u000e\u00100\u001a\u00020\u00002\u0006\u00100\u001a\u000201J\u0010\u0010¤\u0002\u001a\u00020\u00002\u0007\u0010¥\u0002\u001a\u00020=J\u0010\u0010¤\u0002\u001a\u00020\u00002\u0007\u0010¤\u0002\u001a\u00020\u0010J\u0012\u0010¤\u0002\u001a\u00020\u00002\t\b\u0001\u0010¦\u0002\u001a\u00020\tJ\u0010\u0010§\u0002\u001a\u00020\u00002\u0007\u0010¢\u0002\u001a\u000207J \u0010B\u001a\u00020\u00002\t\b\u0001\u0010\u0002\u001a\u00020\t2\u000b\b\u0002\u0010¨\u0002\u001a\u0004\u0018\u00010FH\u0007J!\u0010©\u0002\u001a\u00020\u00002\t\b\u0001\u0010\u0002\u001a\u00020\t2\u000b\b\u0002\u0010¨\u0002\u001a\u0004\u0018\u00010FH\u0007J\u0011\u0010ª\u0002\u001a\u00020\u00002\b\u0010\u0002\u001a\u00030\u0001J\u0011\u0010«\u0002\u001a\u00020\u00002\b\u0010\u0002\u001a\u00030\u0001J\u000e\u0010Z\u001a\u00020\u00002\u0006\u0010Z\u001a\u00020pJ\u0011\u0010Z\u001a\u00020\u00002\t\b\u0001\u0010¬\u0002\u001a\u00020\tJ\u000e\u0010Z\u001a\u00020\u00002\u0006\u0010Z\u001a\u00020[J\u0011\u0010`\u001a\u00020\u00002\t\b\u0001\u0010­\u0002\u001a\u00020\tJ\u0011\u0010c\u001a\u00020\u00002\t\b\u0001\u0010\u0002\u001a\u00020\tJ\u0012\u0010®\u0002\u001a\u00020\u00002\t\b\u0001\u0010\u0002\u001a\u00020\tJ\u000f\u0010f\u001a\u00020\u00002\u0007\u0010¯\u0002\u001a\u00020OJ\u000f\u0010l\u001a\u00020\u00002\u0007\u0010¯\u0002\u001a\u00020OJ\u000f\u0010u\u001a\u00020\u00002\u0007\u0010°\u0002\u001a\u00020vJ\u0011\u0010±\u0002\u001a\u00020\u00002\b\u0010²\u0002\u001a\u00030£\u0001J\u000f\u0010{\u001a\u00020\u00002\u0007\u0010³\u0002\u001a\u00020pJ\u0011\u0010{\u001a\u00020\u00002\t\b\u0001\u0010´\u0002\u001a\u00020\tJ\u000f\u0010{\u001a\u00020\u00002\u0007\u0010µ\u0002\u001a\u00020[J\u0011\u0010~\u001a\u00020\u00002\t\b\u0001\u0010­\u0002\u001a\u00020\tJ\u0012\u0010\u0001\u001a\u00020\u00002\t\b\u0001\u0010\u0002\u001a\u00020\tJ\u0012\u0010¶\u0002\u001a\u00020\u00002\t\b\u0001\u0010\u0002\u001a\u00020\tJ\u0010\u0010\u0001\u001a\u00020\u00002\u0007\u0010¯\u0002\u001a\u00020OJ\u0010\u0010\u0001\u001a\u00020\u00002\u0007\u0010¯\u0002\u001a\u00020OJ\u0010\u0010\u0001\u001a\u00020\u00002\u0007\u0010°\u0002\u001a\u00020vJ\u0007\u0010´\u0001\u001a\u00020\u0000J\u0012\u0010·\u0001\u001a\u00020\u00002\t\b\u0001\u0010\u0002\u001a\u00020\tJ\u0012\u0010·\u0002\u001a\u00020\u00002\t\b\u0001\u0010\u0002\u001a\u00020\tJ\u0011\u0010¸\u0002\u001a\u00020\u00002\b\u0010²\u0002\u001a\u00030£\u0001J\u0010\u0010¼\u0001\u001a\u00020\u00002\u0007\u0010³\u0002\u001a\u00020pJ\u0012\u0010¼\u0001\u001a\u00020\u00002\t\b\u0001\u0010´\u0002\u001a\u00020\tJ\u0010\u0010¼\u0001\u001a\u00020\u00002\u0007\u0010µ\u0002\u001a\u00020[J\u0012\u0010¿\u0001\u001a\u00020\u00002\t\b\u0001\u0010­\u0002\u001a\u00020\tJ\u0012\u0010Â\u0001\u001a\u00020\u00002\t\b\u0001\u0010\u0002\u001a\u00020\tJ\u0012\u0010¹\u0002\u001a\u00020\u00002\t\b\u0001\u0010\u0002\u001a\u00020\tJ\u0010\u0010Å\u0001\u001a\u00020\u00002\u0007\u0010¯\u0002\u001a\u00020OJ\u0010\u0010È\u0001\u001a\u00020\u00002\u0007\u0010¯\u0002\u001a\u00020OJ\u0010\u0010Î\u0001\u001a\u00020\u00002\u0007\u0010°\u0002\u001a\u00020vJ\u0011\u0010º\u0002\u001a\u00020\u00002\b\u0010²\u0002\u001a\u00030£\u0001J\u0010\u0010Ñ\u0001\u001a\u00020\u00002\u0007\u0010³\u0002\u001a\u00020pJ\u0012\u0010Ñ\u0001\u001a\u00020\u00002\t\b\u0001\u0010´\u0002\u001a\u00020\tJ\u0010\u0010Ñ\u0001\u001a\u00020\u00002\u0007\u0010µ\u0002\u001a\u00020[J\u0012\u0010Ô\u0001\u001a\u00020\u00002\t\b\u0001\u0010­\u0002\u001a\u00020\tJ\u0012\u0010×\u0001\u001a\u00020\u00002\t\b\u0001\u0010\u0002\u001a\u00020\tJ\u0012\u0010»\u0002\u001a\u00020\u00002\t\b\u0001\u0010\u0002\u001a\u00020\tJ\u0010\u0010Ú\u0001\u001a\u00020\u00002\u0007\u0010¯\u0002\u001a\u00020OJ\u0010\u0010Ý\u0001\u001a\u00020\u00002\u0007\u0010¯\u0002\u001a\u00020OJ\u0010\u0010ã\u0001\u001a\u00020\u00002\u0007\u0010°\u0002\u001a\u00020vJ\u0012\u0010ì\u0001\u001a\u00020\u00002\t\b\u0001\u0010\u0002\u001a\u00020\tJ\u0012\u0010¼\u0002\u001a\u00020\u00002\t\b\u0001\u0010\u0002\u001a\u00020\tJ\b\u0010½\u0002\u001a\u00030\u0002J\u001f\u0010ò\u0001\u001a\u00020\u00002\t\b\u0002\u0010¾\u0002\u001a\u00020O2\t\b\u0002\u0010¿\u0002\u001a\u00020UH\u0007J\u0007\u0010À\u0002\u001a\u00020\u0000J\u0011\u0010Á\u0002\u001a\u00020\u00002\b\u0010Â\u0002\u001a\u00030ç\u0001J\u0010\u0010õ\u0001\u001a\u00020\u00002\u0007\u0010õ\u0001\u001a\u00020pJ\u0012\u0010õ\u0001\u001a\u00020\u00002\t\b\u0001\u0010Ã\u0002\u001a\u00020\tJ\u0010\u0010õ\u0001\u001a\u00020\u00002\u0007\u0010õ\u0001\u001a\u00020[J\u0012\u0010ø\u0001\u001a\u00020\u00002\t\b\u0001\u0010­\u0002\u001a\u00020\tJ\u0012\u0010û\u0001\u001a\u00020\u00002\t\b\u0001\u0010\u0002\u001a\u00020\tJ\u0012\u0010Ä\u0002\u001a\u00020\u00002\t\b\u0001\u0010\u0002\u001a\u00020\tJ\u0010\u0010þ\u0001\u001a\u00020\u00002\u0007\u0010¯\u0002\u001a\u00020OJ\u0010\u0010\u0002\u001a\u00020\u00002\u0007\u0010¯\u0002\u001a\u00020OJ\u0010\u0010\u0002\u001a\u00020\u00002\u0007\u0010°\u0002\u001a\u00020vJ%\u0010Å\u0002\u001a\u00020\u00002\u0016\u0010Æ\u0002\u001a\f\u0012\u0007\b\u0001\u0012\u00030\u00020Ç\u0002\"\u00030\u0002¢\u0006\u0003\u0010È\u0002R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004R\u001e\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u0016X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0018\"\u0004\b\u001d\u0010\u001aR\u001a\u0010\u001e\u001a\u00020\u001fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010$\u001a\u00020\u0016X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0018\"\u0004\b&\u0010\u001aR\u001c\u0010'\u001a\u0004\u0018\u00010(X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001c\u0010-\u001a\u0004\u0018\u00010(X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010*\"\u0004\b/\u0010,R\u001a\u00100\u001a\u000201X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u001c\u00106\u001a\u0004\u0018\u000107X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u001c\u0010<\u001a\u0004\u0018\u00010=X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u001e\u0010B\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\bC\u0010\u000b\"\u0004\bD\u0010\rR\u001c\u0010E\u001a\u0004\u0018\u00010FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\u001c\u0010K\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u0010\u0012\"\u0004\bM\u0010\u0014R\u001a\u0010N\u001a\u00020OX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR\u001a\u0010T\u001a\u00020UX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR\u001c\u0010Z\u001a\u0004\u0018\u00010[X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R\u001e\u0010`\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\ba\u0010\u000b\"\u0004\bb\u0010\rR\u001e\u0010c\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\bd\u0010\u000b\"\u0004\be\u0010\rR\u001e\u0010f\u001a\u0004\u0018\u00010OX\u000e¢\u0006\u0010\n\u0002\u0010k\u001a\u0004\bg\u0010h\"\u0004\bi\u0010jR\u001e\u0010l\u001a\u0004\u0018\u00010OX\u000e¢\u0006\u0010\n\u0002\u0010k\u001a\u0004\bm\u0010h\"\u0004\bn\u0010jR\u001c\u0010o\u001a\u0004\u0018\u00010pX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bq\u0010r\"\u0004\bs\u0010tR\u001c\u0010u\u001a\u0004\u0018\u00010vX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bw\u0010x\"\u0004\by\u0010zR\u001c\u0010{\u001a\u0004\u0018\u00010[X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b|\u0010]\"\u0004\b}\u0010_R\u001f\u0010~\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0011\n\u0002\u0010\u000e\u001a\u0004\b\u0010\u000b\"\u0005\b\u0001\u0010\rR!\u0010\u0001\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0012\n\u0002\u0010\u000e\u001a\u0005\b\u0001\u0010\u000b\"\u0005\b\u0001\u0010\rR!\u0010\u0001\u001a\u0004\u0018\u00010OX\u000e¢\u0006\u0012\n\u0002\u0010k\u001a\u0005\b\u0001\u0010h\"\u0005\b\u0001\u0010jR!\u0010\u0001\u001a\u0004\u0018\u00010OX\u000e¢\u0006\u0012\n\u0002\u0010k\u001a\u0005\b\u0001\u0010h\"\u0005\b\u0001\u0010jR\u001f\u0010\u0001\u001a\u0004\u0018\u00010pX\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0001\u0010r\"\u0005\b\u0001\u0010tR\u001f\u0010\u0001\u001a\u0004\u0018\u00010vX\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0001\u0010x\"\u0005\b\u0001\u0010zR\"\u0010\u0001\u001a\u0005\u0018\u00010\u0001X\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R\"\u0010\u0001\u001a\u0005\u0018\u00010\u0001X\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R\"\u0010\u0001\u001a\u0005\u0018\u00010\u0001X\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b \u0001\u0010¡\u0001R\"\u0010¢\u0001\u001a\u0005\u0018\u00010£\u0001X\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b¤\u0001\u0010¥\u0001\"\u0006\b¦\u0001\u0010§\u0001R\"\u0010¨\u0001\u001a\u0005\u0018\u00010£\u0001X\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b©\u0001\u0010¥\u0001\"\u0006\bª\u0001\u0010§\u0001R\"\u0010«\u0001\u001a\u0005\u0018\u00010£\u0001X\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b¬\u0001\u0010¥\u0001\"\u0006\b­\u0001\u0010§\u0001R\"\u0010®\u0001\u001a\u0005\u0018\u00010\u0001X\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b¯\u0001\u0010\u0001\"\u0006\b°\u0001\u0010¡\u0001R\u001d\u0010±\u0001\u001a\u00020\u0016X\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b²\u0001\u0010\u0018\"\u0005\b³\u0001\u0010\u001aR\u001d\u0010´\u0001\u001a\u00020\u0016X\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bµ\u0001\u0010\u0018\"\u0005\b¶\u0001\u0010\u001aR\u001f\u0010·\u0001\u001a\u00020\tX\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b¸\u0001\u0010¹\u0001\"\u0006\bº\u0001\u0010»\u0001R\u001f\u0010¼\u0001\u001a\u0004\u0018\u00010[X\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b½\u0001\u0010]\"\u0005\b¾\u0001\u0010_R!\u0010¿\u0001\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0012\n\u0002\u0010\u000e\u001a\u0005\bÀ\u0001\u0010\u000b\"\u0005\bÁ\u0001\u0010\rR!\u0010Â\u0001\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0012\n\u0002\u0010\u000e\u001a\u0005\bÃ\u0001\u0010\u000b\"\u0005\bÄ\u0001\u0010\rR!\u0010Å\u0001\u001a\u0004\u0018\u00010OX\u000e¢\u0006\u0012\n\u0002\u0010k\u001a\u0005\bÆ\u0001\u0010h\"\u0005\bÇ\u0001\u0010jR!\u0010È\u0001\u001a\u0004\u0018\u00010OX\u000e¢\u0006\u0012\n\u0002\u0010k\u001a\u0005\bÉ\u0001\u0010h\"\u0005\bÊ\u0001\u0010jR\u001f\u0010Ë\u0001\u001a\u0004\u0018\u00010pX\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÌ\u0001\u0010r\"\u0005\bÍ\u0001\u0010tR\u001f\u0010Î\u0001\u001a\u0004\u0018\u00010vX\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÏ\u0001\u0010x\"\u0005\bÐ\u0001\u0010zR\u001f\u0010Ñ\u0001\u001a\u0004\u0018\u00010[X\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÒ\u0001\u0010]\"\u0005\bÓ\u0001\u0010_R!\u0010Ô\u0001\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0012\n\u0002\u0010\u000e\u001a\u0005\bÕ\u0001\u0010\u000b\"\u0005\bÖ\u0001\u0010\rR!\u0010×\u0001\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0012\n\u0002\u0010\u000e\u001a\u0005\bØ\u0001\u0010\u000b\"\u0005\bÙ\u0001\u0010\rR!\u0010Ú\u0001\u001a\u0004\u0018\u00010OX\u000e¢\u0006\u0012\n\u0002\u0010k\u001a\u0005\bÛ\u0001\u0010h\"\u0005\bÜ\u0001\u0010jR!\u0010Ý\u0001\u001a\u0004\u0018\u00010OX\u000e¢\u0006\u0012\n\u0002\u0010k\u001a\u0005\bÞ\u0001\u0010h\"\u0005\bß\u0001\u0010jR\u001f\u0010à\u0001\u001a\u0004\u0018\u00010pX\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bá\u0001\u0010r\"\u0005\bâ\u0001\u0010tR\u001f\u0010ã\u0001\u001a\u0004\u0018\u00010vX\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bä\u0001\u0010x\"\u0005\bå\u0001\u0010zR\"\u0010æ\u0001\u001a\u0005\u0018\u00010ç\u0001X\u000e¢\u0006\u0012\n\u0000\u001a\u0006\bè\u0001\u0010é\u0001\"\u0006\bê\u0001\u0010ë\u0001R!\u0010ì\u0001\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0012\n\u0002\u0010\u000e\u001a\u0005\bí\u0001\u0010\u000b\"\u0005\bî\u0001\u0010\rR\u001f\u0010ï\u0001\u001a\u00020\tX\u000e¢\u0006\u0012\n\u0000\u001a\u0006\bð\u0001\u0010¹\u0001\"\u0006\bñ\u0001\u0010»\u0001R\u001d\u0010ò\u0001\u001a\u00020\u0016X\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bó\u0001\u0010\u0018\"\u0005\bô\u0001\u0010\u001aR\u001f\u0010õ\u0001\u001a\u0004\u0018\u00010[X\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bö\u0001\u0010]\"\u0005\b÷\u0001\u0010_R!\u0010ø\u0001\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0012\n\u0002\u0010\u000e\u001a\u0005\bù\u0001\u0010\u000b\"\u0005\bú\u0001\u0010\rR!\u0010û\u0001\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0012\n\u0002\u0010\u000e\u001a\u0005\bü\u0001\u0010\u000b\"\u0005\bý\u0001\u0010\rR!\u0010þ\u0001\u001a\u0004\u0018\u00010OX\u000e¢\u0006\u0012\n\u0002\u0010k\u001a\u0005\bÿ\u0001\u0010h\"\u0005\b\u0002\u0010jR!\u0010\u0002\u001a\u0004\u0018\u00010OX\u000e¢\u0006\u0012\n\u0002\u0010k\u001a\u0005\b\u0002\u0010h\"\u0005\b\u0002\u0010jR\u001f\u0010\u0002\u001a\u0004\u0018\u00010pX\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0002\u0010r\"\u0005\b\u0002\u0010tR\u001f\u0010\u0002\u001a\u0004\u0018\u00010vX\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0002\u0010x\"\u0005\b\u0002\u0010zR'\u0010\u0002\u001a\n\u0012\u0005\u0012\u00030\u00020\u0002X\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0002\u0010\u0002\"\u0006\b\u0002\u0010\u0002¨\u0006É\u0002"}, d2 = {"Lcom/andrognito/flashbar/Flashbar$Builder;", "", "activity", "Landroid/app/Activity;", "(Landroid/app/Activity;)V", "getActivity$flashbar_release", "()Landroid/app/Activity;", "setActivity$flashbar_release", "backgroundColor", "", "getBackgroundColor$flashbar_release", "()Ljava/lang/Integer;", "setBackgroundColor$flashbar_release", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "backgroundDrawable", "Landroid/graphics/drawable/Drawable;", "getBackgroundDrawable$flashbar_release", "()Landroid/graphics/drawable/Drawable;", "setBackgroundDrawable$flashbar_release", "(Landroid/graphics/drawable/Drawable;)V", "barDismissOnTapOutside", "", "getBarDismissOnTapOutside$flashbar_release", "()Z", "setBarDismissOnTapOutside$flashbar_release", "(Z)V", "castShadow", "getCastShadow$flashbar_release", "setCastShadow$flashbar_release", "duration", "", "getDuration$flashbar_release", "()J", "setDuration$flashbar_release", "(J)V", "enableSwipeToDismiss", "getEnableSwipeToDismiss$flashbar_release", "setEnableSwipeToDismiss$flashbar_release", "enterAnimBuilder", "Lcom/andrognito/flashbar/anim/FlashAnimBarBuilder;", "getEnterAnimBuilder$flashbar_release", "()Lcom/andrognito/flashbar/anim/FlashAnimBarBuilder;", "setEnterAnimBuilder$flashbar_release", "(Lcom/andrognito/flashbar/anim/FlashAnimBarBuilder;)V", "exitAnimBuilder", "getExitAnimBuilder$flashbar_release", "setExitAnimBuilder$flashbar_release", "gravity", "Lcom/andrognito/flashbar/Flashbar$Gravity;", "getGravity$flashbar_release", "()Lcom/andrognito/flashbar/Flashbar$Gravity;", "setGravity$flashbar_release", "(Lcom/andrognito/flashbar/Flashbar$Gravity;)V", "iconAnimBuilder", "Lcom/andrognito/flashbar/anim/FlashAnimIconBuilder;", "getIconAnimBuilder$flashbar_release", "()Lcom/andrognito/flashbar/anim/FlashAnimIconBuilder;", "setIconAnimBuilder$flashbar_release", "(Lcom/andrognito/flashbar/anim/FlashAnimIconBuilder;)V", "iconBitmap", "Landroid/graphics/Bitmap;", "getIconBitmap$flashbar_release", "()Landroid/graphics/Bitmap;", "setIconBitmap$flashbar_release", "(Landroid/graphics/Bitmap;)V", "iconColorFilter", "getIconColorFilter$flashbar_release", "setIconColorFilter$flashbar_release", "iconColorFilterMode", "Landroid/graphics/PorterDuff$Mode;", "getIconColorFilterMode$flashbar_release", "()Landroid/graphics/PorterDuff$Mode;", "setIconColorFilterMode$flashbar_release", "(Landroid/graphics/PorterDuff$Mode;)V", "iconDrawable", "getIconDrawable$flashbar_release", "setIconDrawable$flashbar_release", "iconScale", "", "getIconScale$flashbar_release", "()F", "setIconScale$flashbar_release", "(F)V", "iconScaleType", "Landroid/widget/ImageView$ScaleType;", "getIconScaleType$flashbar_release", "()Landroid/widget/ImageView$ScaleType;", "setIconScaleType$flashbar_release", "(Landroid/widget/ImageView$ScaleType;)V", "message", "", "getMessage$flashbar_release", "()Ljava/lang/String;", "setMessage$flashbar_release", "(Ljava/lang/String;)V", "messageAppearance", "getMessageAppearance$flashbar_release", "setMessageAppearance$flashbar_release", "messageColor", "getMessageColor$flashbar_release", "setMessageColor$flashbar_release", "messageSizeInPx", "getMessageSizeInPx$flashbar_release", "()Ljava/lang/Float;", "setMessageSizeInPx$flashbar_release", "(Ljava/lang/Float;)V", "Ljava/lang/Float;", "messageSizeInSp", "getMessageSizeInSp$flashbar_release", "setMessageSizeInSp$flashbar_release", "messageSpanned", "Landroid/text/Spanned;", "getMessageSpanned$flashbar_release", "()Landroid/text/Spanned;", "setMessageSpanned$flashbar_release", "(Landroid/text/Spanned;)V", "messageTypeface", "Landroid/graphics/Typeface;", "getMessageTypeface$flashbar_release", "()Landroid/graphics/Typeface;", "setMessageTypeface$flashbar_release", "(Landroid/graphics/Typeface;)V", "negativeActionText", "getNegativeActionText$flashbar_release", "setNegativeActionText$flashbar_release", "negativeActionTextAppearance", "getNegativeActionTextAppearance$flashbar_release", "setNegativeActionTextAppearance$flashbar_release", "negativeActionTextColor", "getNegativeActionTextColor$flashbar_release", "setNegativeActionTextColor$flashbar_release", "negativeActionTextSizeInPx", "getNegativeActionTextSizeInPx$flashbar_release", "setNegativeActionTextSizeInPx$flashbar_release", "negativeActionTextSizeInSp", "getNegativeActionTextSizeInSp$flashbar_release", "setNegativeActionTextSizeInSp$flashbar_release", "negativeActionTextSpanned", "getNegativeActionTextSpanned$flashbar_release", "setNegativeActionTextSpanned$flashbar_release", "negativeActionTextTypeface", "getNegativeActionTextTypeface$flashbar_release", "setNegativeActionTextTypeface$flashbar_release", "onBarDismissListener", "Lcom/andrognito/flashbar/Flashbar$OnBarDismissListener;", "getOnBarDismissListener$flashbar_release", "()Lcom/andrognito/flashbar/Flashbar$OnBarDismissListener;", "setOnBarDismissListener$flashbar_release", "(Lcom/andrognito/flashbar/Flashbar$OnBarDismissListener;)V", "onBarShowListener", "Lcom/andrognito/flashbar/Flashbar$OnBarShowListener;", "getOnBarShowListener$flashbar_release", "()Lcom/andrognito/flashbar/Flashbar$OnBarShowListener;", "setOnBarShowListener$flashbar_release", "(Lcom/andrognito/flashbar/Flashbar$OnBarShowListener;)V", "onBarTapListener", "Lcom/andrognito/flashbar/Flashbar$OnTapListener;", "getOnBarTapListener$flashbar_release", "()Lcom/andrognito/flashbar/Flashbar$OnTapListener;", "setOnBarTapListener$flashbar_release", "(Lcom/andrognito/flashbar/Flashbar$OnTapListener;)V", "onNegativeActionTapListener", "Lcom/andrognito/flashbar/Flashbar$OnActionTapListener;", "getOnNegativeActionTapListener$flashbar_release", "()Lcom/andrognito/flashbar/Flashbar$OnActionTapListener;", "setOnNegativeActionTapListener$flashbar_release", "(Lcom/andrognito/flashbar/Flashbar$OnActionTapListener;)V", "onPositiveActionTapListener", "getOnPositiveActionTapListener$flashbar_release", "setOnPositiveActionTapListener$flashbar_release", "onPrimaryActionTapListener", "getOnPrimaryActionTapListener$flashbar_release", "setOnPrimaryActionTapListener$flashbar_release", "onTapOutsideListener", "getOnTapOutsideListener$flashbar_release", "setOnTapOutsideListener$flashbar_release", "overlay", "getOverlay$flashbar_release", "setOverlay$flashbar_release", "overlayBlockable", "getOverlayBlockable$flashbar_release", "setOverlayBlockable$flashbar_release", "overlayColor", "getOverlayColor$flashbar_release", "()I", "setOverlayColor$flashbar_release", "(I)V", "positiveActionText", "getPositiveActionText$flashbar_release", "setPositiveActionText$flashbar_release", "positiveActionTextAppearance", "getPositiveActionTextAppearance$flashbar_release", "setPositiveActionTextAppearance$flashbar_release", "positiveActionTextColor", "getPositiveActionTextColor$flashbar_release", "setPositiveActionTextColor$flashbar_release", "positiveActionTextSizeInPx", "getPositiveActionTextSizeInPx$flashbar_release", "setPositiveActionTextSizeInPx$flashbar_release", "positiveActionTextSizeInSp", "getPositiveActionTextSizeInSp$flashbar_release", "setPositiveActionTextSizeInSp$flashbar_release", "positiveActionTextSpanned", "getPositiveActionTextSpanned$flashbar_release", "setPositiveActionTextSpanned$flashbar_release", "positiveActionTextTypeface", "getPositiveActionTextTypeface$flashbar_release", "setPositiveActionTextTypeface$flashbar_release", "primaryActionText", "getPrimaryActionText$flashbar_release", "setPrimaryActionText$flashbar_release", "primaryActionTextAppearance", "getPrimaryActionTextAppearance$flashbar_release", "setPrimaryActionTextAppearance$flashbar_release", "primaryActionTextColor", "getPrimaryActionTextColor$flashbar_release", "setPrimaryActionTextColor$flashbar_release", "primaryActionTextSizeInPx", "getPrimaryActionTextSizeInPx$flashbar_release", "setPrimaryActionTextSizeInPx$flashbar_release", "primaryActionTextSizeInSp", "getPrimaryActionTextSizeInSp$flashbar_release", "setPrimaryActionTextSizeInSp$flashbar_release", "primaryActionTextSpanned", "getPrimaryActionTextSpanned$flashbar_release", "setPrimaryActionTextSpanned$flashbar_release", "primaryActionTextTypeface", "getPrimaryActionTextTypeface$flashbar_release", "setPrimaryActionTextTypeface$flashbar_release", "progressPosition", "Lcom/andrognito/flashbar/Flashbar$ProgressPosition;", "getProgressPosition$flashbar_release", "()Lcom/andrognito/flashbar/Flashbar$ProgressPosition;", "setProgressPosition$flashbar_release", "(Lcom/andrognito/flashbar/Flashbar$ProgressPosition;)V", "progressTint", "getProgressTint$flashbar_release", "setProgressTint$flashbar_release", "shadowStrength", "getShadowStrength$flashbar_release", "setShadowStrength$flashbar_release", "showIcon", "getShowIcon$flashbar_release", "setShowIcon$flashbar_release", "title", "getTitle$flashbar_release", "setTitle$flashbar_release", "titleAppearance", "getTitleAppearance$flashbar_release", "setTitleAppearance$flashbar_release", "titleColor", "getTitleColor$flashbar_release", "setTitleColor$flashbar_release", "titleSizeInPx", "getTitleSizeInPx$flashbar_release", "setTitleSizeInPx$flashbar_release", "titleSizeInSp", "getTitleSizeInSp$flashbar_release", "setTitleSizeInSp$flashbar_release", "titleSpanned", "getTitleSpanned$flashbar_release", "setTitleSpanned$flashbar_release", "titleTypeface", "getTitleTypeface$flashbar_release", "setTitleTypeface$flashbar_release", "vibrationTargets", "", "Lcom/andrognito/flashbar/Flashbar$Vibration;", "getVibrationTargets$flashbar_release", "()Ljava/util/List;", "setVibrationTargets$flashbar_release", "(Ljava/util/List;)V", "color", "backgroundColorRes", "colorId", "drawable", "drawableId", "barDismissListener", "listener", "barShowListener", "build", "Lcom/andrognito/flashbar/Flashbar;", "shadow", "strength", "configureAnimation", "", "dismissOnTapOutside", "milliseconds", "enterAnimation", "builder", "exitAnimation", "icon", "bitmap", "iconId", "iconAnimation", "mode", "iconColorFilterRes", "listenBarTaps", "listenOutsideTaps", "messageId", "appearance", "messageColorRes", "size", "typeface", "negativeActionTapListener", "onActionTapListener", "actionText", "actionTextId", "text", "negativeActionTextColorRes", "overlayColorRes", "positiveActionTapListener", "positiveActionTextColorRes", "primaryActionTapListener", "primaryActionTextColorRes", "progressTintRes", "show", "scale", "scaleType", "showOverlay", "showProgress", "position", "titleId", "titleColorRes", "vibrateOn", "vibrate", "", "([Lcom/andrognito/flashbar/Flashbar$Vibration;)Lcom/andrognito/flashbar/Flashbar$Builder;", "flashbar_release"}, k = 1, mv = {1, 1, 10})
    public static final class setMin {
        @NotNull
        public List<? extends Vibration> FastBitmap$CoordinateSystem = CollectionsKt.emptyList();
        @Nullable
        public Integer Grayscale$Algorithm;
        @Nullable
        public String ICustomTabsCallback;
        @Nullable
        Float ICustomTabsCallback$Default;
        @Nullable
        Float ICustomTabsCallback$Stub;
        @Nullable
        Float ICustomTabsCallback$Stub$Proxy;
        @Nullable
        Float ICustomTabsService;
        @Nullable
        Bitmap ICustomTabsService$Default;
        @Nullable
        public Drawable ICustomTabsService$Stub;
        @NotNull
        ImageView.ScaleType ICustomTabsService$Stub$Proxy = ImageView.ScaleType.CENTER_CROP;
        @Nullable
        getMin IPostMessageService;
        @Nullable
        Integer IPostMessageService$Default;
        @Nullable
        PorterDuff.Mode IPostMessageService$Stub;
        @Nullable
        Integer IPostMessageService$Stub$Proxy;
        @Nullable
        public ProgressPosition ITrustedWebActivityCallback;
        @NotNull
        public Activity ITrustedWebActivityCallback$Default;
        private boolean ITrustedWebActivityCallback$Stub;
        private boolean ITrustedWebActivityCallback$Stub$Proxy;
        @Nullable
        public FlashAnimBarBuilder ITrustedWebActivityService;
        @Nullable
        equals IsOverlapping;
        @Nullable
        Typeface Mean$Arithmetic;
        @Nullable
        public FlashAnimBarBuilder areNotificationsEnabled;
        @Nullable
        public Integer asBinder;
        @Nullable
        Integer asInterface;
        @Nullable
        Float b;
        private boolean cancelNotification = true;
        @Nullable
        Spanned create;
        @Nullable
        getMax equals;
        @Nullable
        Spanned extraCallback;
        @Nullable
        Integer extraCallbackWithResult;
        @Nullable
        String extraCommand;
        @Nullable
        Typeface getCause;
        @Nullable
        String getDefaultImpl;
        @Nullable
        Typeface getInterfaceDescriptor;
        @Nullable
        equals getMax;
        long getMin = -1;
        private boolean getSmallIconBitmap;
        int hashCode = 4;
        @Nullable
        Float invoke;
        @Nullable
        Integer invokeSuspend;
        int isInside = IntRange.setMax(this.ITrustedWebActivityCallback$Default, getCollapseContentDescription.getMin.getMin);
        @Nullable
        Drawable length;
        @Nullable
        getMin mayLaunchUrl;
        @Nullable
        Integer newSession;
        @Nullable
        Integer newSessionWithExtras;
        @Nullable
        ensureMenu onExtraCallback;
        @Nullable
        Typeface onMessageChannelReady;
        @Nullable
        Float onNavigationEvent;
        @Nullable
        public String onPostMessage;
        @Nullable
        public Integer onRelationshipValidationResult;
        @Nullable
        public getMin onTransact;
        @Nullable
        Typeface postMessage;
        float receiveFile = 1.0f;
        @Nullable
        Integer requestPostMessageChannel;
        @Nullable
        Float requestPostMessageChannelWithExtras;
        @Nullable
        Spanned setDefaultImpl;
        @Nullable
        public Integer setMax;
        @NotNull
        public Gravity setMin = Gravity.BOTTOM;
        @Nullable
        Spanned toDoubleRange;
        public boolean toFloatRange;
        @Nullable
        setMax toIntRange;
        @Nullable
        public String toString;
        @Nullable
        Integer updateVisuals;
        @Nullable
        Float validateRelationship;
        @Nullable
        Float valueOf;
        public boolean values;
        @Nullable
        Spanned warmup;

        public setMin(@NotNull Activity activity) {
            Intrinsics.checkParameterIsNotNull(activity, AkuEventParamsKey.KEY_ACTIVITY);
            this.ITrustedWebActivityCallback$Default = activity;
        }

        public final boolean getMin() {
            return this.toFloatRange;
        }

        public final boolean length() {
            return this.ITrustedWebActivityCallback$Stub$Proxy;
        }

        public final boolean setMin() {
            return this.ITrustedWebActivityCallback$Stub;
        }

        public final boolean setMax() {
            return this.cancelNotification;
        }

        public final boolean getMax() {
            return this.values;
        }

        public final boolean IsOverlapping() {
            return this.getSmallIconBitmap;
        }

        @NotNull
        public final setMin getMax(long j) {
            setMin setmin = this;
            if (j > 0) {
                setmin.getMin = j;
                return setmin;
            }
            throw new IllegalArgumentException("Duration can not be negative or zero".toString());
        }

        @NotNull
        @JvmOverloads
        public final setMin toFloatRange() {
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_CROP;
            Intrinsics.checkParameterIsNotNull(scaleType, "scaleType");
            setMin setmin = this;
            if (setmin.ITrustedWebActivityCallback != ProgressPosition.LEFT) {
                setmin.getSmallIconBitmap = true;
                setmin.receiveFile = 1.0f;
                setmin.ICustomTabsService$Stub$Proxy = scaleType;
                return setmin;
            }
            throw new IllegalArgumentException("Cannot show icon if left progress is set".toString());
        }

        @NotNull
        @JvmOverloads
        public final setMin setMax(@ColorRes int i) {
            setMin setmin = this;
            setmin.IPostMessageService$Stub$Proxy = Integer.valueOf(IntRange.setMax(setmin.ITrustedWebActivityCallback$Default, i));
            setmin.IPostMessageService$Stub = null;
            return setmin;
        }

        @NotNull
        public final Flashbar equals() {
            FlashAnimBarBuilder flashAnimBarBuilder;
            FlashAnimBarBuilder flashAnimBarBuilder2;
            if (this.ITrustedWebActivityService == null) {
                int i = setTitleTextAppearance.length[this.setMin.ordinal()];
                if (i == 1) {
                    setCollapseContentDescription.getMin getmin = setCollapseContentDescription.setMin;
                    Context context = this.ITrustedWebActivityCallback$Default;
                    Intrinsics.checkParameterIsNotNull(context, HummerConstants.CONTEXT);
                    FlashAnimBarBuilder flashAnimBarBuilder3 = new FlashAnimBarBuilder(new ensureMenuView(context).setMin);
                    flashAnimBarBuilder3.setMin = FlashAnimBarBuilder.Type.ENTER;
                    flashAnimBarBuilder = flashAnimBarBuilder3;
                    flashAnimBarBuilder.getMin = Gravity.TOP;
                } else if (i == 2) {
                    setCollapseContentDescription.getMin getmin2 = setCollapseContentDescription.setMin;
                    Context context2 = this.ITrustedWebActivityCallback$Default;
                    Intrinsics.checkParameterIsNotNull(context2, HummerConstants.CONTEXT);
                    FlashAnimBarBuilder flashAnimBarBuilder4 = new FlashAnimBarBuilder(new ensureMenuView(context2).setMin);
                    flashAnimBarBuilder4.setMin = FlashAnimBarBuilder.Type.ENTER;
                    flashAnimBarBuilder = flashAnimBarBuilder4;
                    flashAnimBarBuilder.getMin = Gravity.BOTTOM;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                int i2 = setTitleTextAppearance.getMax[this.setMin.ordinal()];
                if (i2 == 1) {
                    FlashAnimBarBuilder flashAnimBarBuilder5 = this.ITrustedWebActivityService;
                    if (flashAnimBarBuilder5 == null) {
                        Intrinsics.throwNpe();
                    }
                    FlashAnimBarBuilder flashAnimBarBuilder6 = flashAnimBarBuilder5;
                    flashAnimBarBuilder6.setMin = FlashAnimBarBuilder.Type.ENTER;
                    flashAnimBarBuilder = flashAnimBarBuilder6;
                    flashAnimBarBuilder.getMin = Gravity.TOP;
                } else if (i2 == 2) {
                    FlashAnimBarBuilder flashAnimBarBuilder7 = this.ITrustedWebActivityService;
                    if (flashAnimBarBuilder7 == null) {
                        Intrinsics.throwNpe();
                    }
                    FlashAnimBarBuilder flashAnimBarBuilder8 = flashAnimBarBuilder7;
                    flashAnimBarBuilder8.setMin = FlashAnimBarBuilder.Type.ENTER;
                    flashAnimBarBuilder = flashAnimBarBuilder8;
                    flashAnimBarBuilder.getMin = Gravity.BOTTOM;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
            this.ITrustedWebActivityService = flashAnimBarBuilder;
            if (this.areNotificationsEnabled == null) {
                int i3 = setTitleTextAppearance.getMin[this.setMin.ordinal()];
                if (i3 == 1) {
                    setCollapseContentDescription.getMin getmin3 = setCollapseContentDescription.setMin;
                    Context context3 = this.ITrustedWebActivityCallback$Default;
                    Intrinsics.checkParameterIsNotNull(context3, HummerConstants.CONTEXT);
                    FlashAnimBarBuilder flashAnimBarBuilder9 = new FlashAnimBarBuilder(new ensureMenuView(context3).setMin);
                    flashAnimBarBuilder9.setMin = FlashAnimBarBuilder.Type.EXIT;
                    flashAnimBarBuilder2 = flashAnimBarBuilder9;
                    flashAnimBarBuilder2.getMin = Gravity.TOP;
                } else if (i3 == 2) {
                    setCollapseContentDescription.getMin getmin4 = setCollapseContentDescription.setMin;
                    Context context4 = this.ITrustedWebActivityCallback$Default;
                    Intrinsics.checkParameterIsNotNull(context4, HummerConstants.CONTEXT);
                    FlashAnimBarBuilder flashAnimBarBuilder10 = new FlashAnimBarBuilder(new ensureMenuView(context4).setMin);
                    flashAnimBarBuilder10.setMin = FlashAnimBarBuilder.Type.EXIT;
                    flashAnimBarBuilder2 = flashAnimBarBuilder10;
                    flashAnimBarBuilder2.getMin = Gravity.BOTTOM;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                int i4 = setTitleTextAppearance.setMin[this.setMin.ordinal()];
                if (i4 == 1) {
                    FlashAnimBarBuilder flashAnimBarBuilder11 = this.areNotificationsEnabled;
                    if (flashAnimBarBuilder11 == null) {
                        Intrinsics.throwNpe();
                    }
                    FlashAnimBarBuilder flashAnimBarBuilder12 = flashAnimBarBuilder11;
                    flashAnimBarBuilder12.setMin = FlashAnimBarBuilder.Type.EXIT;
                    flashAnimBarBuilder2 = flashAnimBarBuilder12;
                    flashAnimBarBuilder2.getMin = Gravity.TOP;
                } else if (i4 == 2) {
                    FlashAnimBarBuilder flashAnimBarBuilder13 = this.areNotificationsEnabled;
                    if (flashAnimBarBuilder13 == null) {
                        Intrinsics.throwNpe();
                    }
                    FlashAnimBarBuilder flashAnimBarBuilder14 = flashAnimBarBuilder13;
                    flashAnimBarBuilder14.setMin = FlashAnimBarBuilder.Type.EXIT;
                    flashAnimBarBuilder2 = flashAnimBarBuilder14;
                    flashAnimBarBuilder2.getMin = Gravity.BOTTOM;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
            this.areNotificationsEnabled = flashAnimBarBuilder2;
            Flashbar flashbar = new Flashbar(this, (byte) 0);
            Flashbar.setMax(flashbar);
            return flashbar;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/andrognito/flashbar/Flashbar$Companion;", "", "()V", "DURATION_INDEFINITE", "", "DURATION_LONG", "DURATION_SHORT", "flashbar_release"}, k = 1, mv = {1, 1, 10})
    public static final class length {
        private length() {
        }

        public /* synthetic */ length(byte b) {
            this();
        }
    }

    public static final /* synthetic */ void setMax(Flashbar flashbar) {
        FlashbarContainerView flashbarContainerView = new FlashbarContainerView(flashbar.setMax.ITrustedWebActivityCallback$Default);
        flashbar.getMin = flashbarContainerView;
        if (flashbarContainerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("flashbarContainerView");
        }
        flashbarContainerView.adjustOrientation$flashbar_release(flashbar.setMax.ITrustedWebActivityCallback$Default);
        FlashbarContainerView flashbarContainerView2 = flashbar.getMin;
        if (flashbarContainerView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("flashbarContainerView");
        }
        flashbarContainerView2.addParent$flashbar_release(flashbar);
        FlashbarView flashbarView = new FlashbarView(flashbar.setMax.ITrustedWebActivityCallback$Default);
        flashbar.length = flashbarView;
        if (flashbarView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("flashbarView");
        }
        flashbarView.init$flashbar_release(flashbar.setMax.setMin, flashbar.setMax.setMax(), flashbar.setMax.hashCode);
        FlashbarView flashbarView2 = flashbar.length;
        if (flashbarView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("flashbarView");
        }
        flashbarView2.adjustWitPositionAndOrientation$flashbar_release(flashbar.setMax.ITrustedWebActivityCallback$Default, flashbar.setMax.setMin);
        FlashbarView flashbarView3 = flashbar.length;
        if (flashbarView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("flashbarView");
        }
        FlashbarContainerView flashbarContainerView3 = flashbar.getMin;
        if (flashbarContainerView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("flashbarContainerView");
        }
        flashbarView3.addParent$flashbar_release(flashbarContainerView3);
        FlashbarContainerView flashbarContainerView4 = flashbar.getMin;
        if (flashbarContainerView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("flashbarContainerView");
        }
        FlashbarView flashbarView4 = flashbar.length;
        if (flashbarView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("flashbarView");
        }
        flashbarContainerView4.attach$flashbar_release(flashbarView4);
        FlashbarContainerView flashbarContainerView5 = flashbar.getMin;
        if (flashbarContainerView5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("flashbarContainerView");
        }
        flashbarContainerView5.setDuration$flashbar_release(flashbar.setMax.getMin);
        flashbarContainerView5.setBarShowListener$flashbar_release(flashbar.setMax.toIntRange);
        flashbarContainerView5.setBarDismissListener$flashbar_release(flashbar.setMax.equals);
        flashbarContainerView5.setBarDismissOnTapOutside$flashbar_release(flashbar.setMax.getMin());
        flashbarContainerView5.setOnTapOutsideListener$flashbar_release(flashbar.setMax.IsOverlapping);
        flashbarContainerView5.setOverlay$flashbar_release(flashbar.setMax.length());
        flashbarContainerView5.setOverlayColor$flashbar_release(flashbar.setMax.isInside);
        flashbarContainerView5.setOverlayBlockable$flashbar_release(flashbar.setMax.setMin());
        flashbarContainerView5.setVibrationTargets$flashbar_release(flashbar.setMax.FastBitmap$CoordinateSystem);
        flashbarContainerView5.setIconAnim$flashbar_release(flashbar.setMax.onExtraCallback);
        FlashAnimBarBuilder flashAnimBarBuilder = flashbar.setMax.ITrustedWebActivityService;
        if (flashAnimBarBuilder == null) {
            Intrinsics.throwNpe();
        }
        flashbarContainerView5.setEnterAnim$flashbar_release(flashAnimBarBuilder);
        FlashAnimBarBuilder flashAnimBarBuilder2 = flashbar.setMax.areNotificationsEnabled;
        if (flashAnimBarBuilder2 == null) {
            Intrinsics.throwNpe();
        }
        flashbarContainerView5.setExitAnim$flashbar_release(flashAnimBarBuilder2);
        flashbarContainerView5.enableSwipeToDismiss$flashbar_release(flashbar.setMax.getMax());
        FlashbarView flashbarView5 = flashbar.length;
        if (flashbarView5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("flashbarView");
        }
        flashbarView5.setBarBackgroundColor$flashbar_release(flashbar.setMax.setMax);
        flashbarView5.setBarBackgroundDrawable$flashbar_release(flashbar.setMax.length);
        flashbarView5.setBarTapListener$flashbar_release(flashbar.setMax.getMax);
        flashbarView5.setTitle$flashbar_release(flashbar.setMax.toString);
        flashbarView5.setTitleSpanned$flashbar_release(flashbar.setMax.toDoubleRange);
        flashbarView5.setTitleTypeface$flashbar_release(flashbar.setMax.Mean$Arithmetic);
        flashbarView5.setTitleSizeInPx$flashbar_release(flashbar.setMax.invoke);
        flashbarView5.setTitleSizeInSp$flashbar_release(flashbar.setMax.valueOf);
        flashbarView5.setTitleColor$flashbar_release(flashbar.setMax.Grayscale$Algorithm);
        flashbarView5.setTitleAppearance$flashbar_release(flashbar.setMax.invokeSuspend);
        flashbarView5.setMessage$flashbar_release(flashbar.setMax.ICustomTabsCallback);
        flashbarView5.setMessageSpanned$flashbar_release(flashbar.setMax.create);
        flashbarView5.setMessageTypeface$flashbar_release(flashbar.setMax.getCause);
        flashbarView5.setMessageSizeInPx$flashbar_release(flashbar.setMax.onNavigationEvent);
        flashbarView5.setMessageSizeInSp$flashbar_release(flashbar.setMax.b);
        flashbarView5.setMessageColor$flashbar_release(flashbar.setMax.onRelationshipValidationResult);
        flashbarView5.setMessageAppearance$flashbar_release(flashbar.setMax.extraCallbackWithResult);
        flashbarView5.setPrimaryActionText$flashbar_release(flashbar.setMax.onPostMessage);
        flashbarView5.setPrimaryActionTextSpanned$flashbar_release(flashbar.setMax.extraCallback);
        flashbarView5.setPrimaryActionTextTypeface$flashbar_release(flashbar.setMax.onMessageChannelReady);
        flashbarView5.setPrimaryActionTextSizeInPx$flashbar_release(flashbar.setMax.ICustomTabsCallback$Default);
        flashbarView5.setPrimaryActionTextSizeInSp$flashbar_release(flashbar.setMax.ICustomTabsCallback$Stub);
        flashbarView5.setPrimaryActionTextColor$flashbar_release(flashbar.setMax.asBinder);
        flashbarView5.setPrimaryActionTextAppearance$flashbar_release(flashbar.setMax.asInterface);
        flashbarView5.setPrimaryActionTapListener$flashbar_release(flashbar.setMax.onTransact);
        flashbarView5.setPositiveActionText$flashbar_release(flashbar.setMax.getDefaultImpl);
        flashbarView5.setPositiveActionTextSpanned$flashbar_release(flashbar.setMax.setDefaultImpl);
        flashbarView5.setPositiveActionTextTypeface$flashbar_release(flashbar.setMax.getInterfaceDescriptor);
        flashbarView5.setPositiveActionTextSizeInPx$flashbar_release(flashbar.setMax.ICustomTabsCallback$Stub$Proxy);
        flashbarView5.setPositiveActionTextSizeInSp$flashbar_release(flashbar.setMax.ICustomTabsService);
        flashbarView5.setPositiveActionTextColor$flashbar_release(flashbar.setMax.newSession);
        flashbarView5.setPositiveActionTextAppearance$flashbar_release(flashbar.setMax.newSessionWithExtras);
        flashbarView5.setPositiveActionTapListener$flashbar_release(flashbar.setMax.mayLaunchUrl);
        flashbarView5.setNegativeActionText$flashbar_release(flashbar.setMax.extraCommand);
        flashbarView5.setNegativeActionTextSpanned$flashbar_release(flashbar.setMax.warmup);
        flashbarView5.setNegativeActionTextTypeface$flashbar_release(flashbar.setMax.postMessage);
        flashbarView5.setNegativeActionTextSizeInPx$flashbar_release(flashbar.setMax.requestPostMessageChannelWithExtras);
        flashbarView5.setNegativeActionTextSizeInSp$flashbar_release(flashbar.setMax.validateRelationship);
        flashbarView5.setNegativeActionTextColor$flashbar_release(flashbar.setMax.requestPostMessageChannel);
        flashbarView5.setNegativeActionTextAppearance$flashbar_release(flashbar.setMax.updateVisuals);
        flashbarView5.setNegativeActionTapListener$flashbar_release(flashbar.setMax.IPostMessageService);
        flashbarView5.showIcon$flashbar_release(flashbar.setMax.IsOverlapping());
        flashbarView5.showIconScale$flashbar_release(flashbar.setMax.receiveFile, flashbar.setMax.ICustomTabsService$Stub$Proxy);
        flashbarView5.setIconDrawable$flashbar_release(flashbar.setMax.ICustomTabsService$Stub);
        flashbarView5.setIconBitmap$flashbar_release(flashbar.setMax.ICustomTabsService$Default);
        flashbarView5.setIconColorFilter$flashbar_release(flashbar.setMax.IPostMessageService$Stub$Proxy, flashbar.setMax.IPostMessageService$Stub);
        flashbarView5.setProgressPosition$flashbar_release(flashbar.setMax.ITrustedWebActivityCallback);
        flashbarView5.setProgressTint$flashbar_release(flashbar.setMax.IPostMessageService$Default, flashbar.setMax.ITrustedWebActivityCallback);
        FlashbarContainerView flashbarContainerView6 = flashbar.getMin;
        if (flashbarContainerView6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("flashbarContainerView");
        }
        flashbarContainerView6.construct$flashbar_release();
    }
}
