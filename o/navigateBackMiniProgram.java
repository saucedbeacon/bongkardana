package o;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Rect;
import androidx.annotation.Nullable;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import id.dana.lib.drawbitmap.invoice.BaseInvoiceView;
import id.dana.lib.drawbitmap.style.typeface.TypeFaceVariant;
import id.dana.tracker.TrackerKey;
import o.ActionSheetRecyclerAdapter;
import o.TitleBarRightButtonView;

public class navigateBackMiniProgram implements BaseInvoiceView {
    private int bgY;
    private applyUpdate brush;
    /* access modifiers changed from: private */
    public Canvas canvas;
    private Context context;
    /* access modifiers changed from: private */
    public int descX = 84;
    private TitleBarRightButtonView.AnonymousClass2<Integer> emitter;
    private int firstY;
    /* access modifiers changed from: private */
    public int iconY;
    private int lastY;
    /* access modifiers changed from: private */
    public Paint paint;
    private updateClientApp paymentMethodEntity;

    public navigateBackMiniProgram(Context context2, updateClientApp updateclientapp) {
        this.context = context2;
        this.paint = new Paint();
        this.paymentMethodEntity = updateclientapp;
    }

    public void setEmitter(TitleBarRightButtonView.AnonymousClass2<Integer> r1) {
        this.emitter = r1;
    }

    public void constructPaymentMethod() {
        drawTitle();
        drawWrapperBg();
        drawProtectionIcon();
        if (this.paymentMethodEntity.getPaymentIconUrl() == null || !TrackerKey.DanaBalanceRecipientTypeProperty.DANA.equals(this.paymentMethodEntity.getPaymentIconUrl())) {
            drawPayMethodIcon();
        } else {
            drawPayMethodDANA();
        }
    }

    private void drawTitle() {
        this.brush.text(this.paymentMethodEntity.getTitle(), 64.0f, (float) this.firstY, TypeFaceVariant.TITLE_12_NORMAL);
    }

    private void drawWrapperBg() {
        int i = this.firstY + 26;
        this.bgY = i;
        float f = ((float) i) + 96.0f;
        this.brush.fill(this.paint, "#e9f5fe", new CornerPathEffect(8.0f));
        this.canvas.drawRect(64.0f, (float) this.bgY, 686.0f, f, this.paint);
    }

    private void drawProtectionIcon() {
        Bitmap decodeResource = BitmapFactory.decodeResource(this.context.getResources(), ActionSheetRecyclerAdapter.ActionSheetViewHolder.AnonymousClass1.length.dana_protection);
        int i = this.bgY + 26;
        this.canvas.drawBitmap(decodeResource, (Rect) null, new Rect(624, i, 664, i + 40), this.paint);
    }

    /* access modifiers changed from: private */
    public void drawPayMethodDANA() {
        int i = this.bgY + 22;
        this.iconY = i;
        this.canvas.drawBitmap(BitmapFactory.decodeResource(this.context.getResources(), ActionSheetRecyclerAdapter.ActionSheetViewHolder.AnonymousClass1.length.dana_coin), (Rect) null, new Rect(84, this.iconY, 132, i + 48), this.paint);
        this.descX = 150;
        drawDescription();
    }

    /* access modifiers changed from: private */
    public void drawDescription() {
        this.brush.text(this.paymentMethodEntity.getDesc(), (float) this.descX, (float) (this.iconY + 36), TypeFaceVariant.BODY_14_NORMAL);
        this.emitter.onNext(Integer.valueOf(this.lastY));
    }

    private void drawPayMethodIcon() {
        try {
            int i = this.bgY + 22;
            this.iconY = i;
            final int i2 = i + 54;
            setFirstVerticalBias<Bitmap> length = Glide.getMax(this.context).length();
            StringBuilder sb = new StringBuilder();
            sb.append(this.paymentMethodEntity.getPaymentIconUrl());
            sb.append("?test=");
            sb.append(System.currentTimeMillis());
            length.getMax(sb.toString()).getMin((getTopSortedChildren<?>) ((dispatchApplyWindowInsetsToBehaviors) ((dispatchApplyWindowInsetsToBehaviors) ((dispatchApplyWindowInsetsToBehaviors) ((dispatchApplyWindowInsetsToBehaviors) ((dispatchApplyWindowInsetsToBehaviors) new dispatchApplyWindowInsetsToBehaviors().length(ActionSheetRecyclerAdapter.ActionSheetViewHolder.AnonymousClass1.length.dana_coin)).getMin(ActionSheetRecyclerAdapter.ActionSheetViewHolder.AnonymousClass1.length.dana_coin)).getMin(evaluate.length)).length(true)).FastBitmap$CoordinateSystem()).length((setPivotY) new layoutChild(Long.valueOf(System.currentTimeMillis())))).setMin(new parseBehavior<Bitmap>() {
                public final boolean onLoadFailed(@Nullable GlideException glideException, Object obj, layoutChildWithAnchor<Bitmap> layoutchildwithanchor, boolean z) {
                    navigateBackMiniProgram.this.drawPayMethodDANA();
                    return false;
                }

                public final boolean onResourceReady(Bitmap bitmap, Object obj, layoutChildWithAnchor<Bitmap> layoutchildwithanchor, DataSource dataSource, boolean z) {
                    navigateBackMiniProgram.this.canvas.drawBitmap(bitmap, (Rect) null, new Rect(84, navigateBackMiniProgram.this.iconY, 158, i2), navigateBackMiniProgram.this.paint);
                    int unused = navigateBackMiniProgram.this.descX = 176;
                    navigateBackMiniProgram.this.drawDescription();
                    return false;
                }
            }).setMax();
        } catch (Exception unused) {
        }
    }

    public int getLastY() {
        return this.lastY;
    }

    public void setFirstY(int i) {
        int i2 = i + 56;
        this.firstY = i2;
        calculateHeight(i2);
    }

    public void calculateHeight(int i) {
        this.lastY = i + 26 + 22 + 36;
    }

    public void setCanvas(Canvas canvas2) {
        this.canvas = canvas2;
        this.brush = new applyUpdate(this.context, canvas2);
    }
}
