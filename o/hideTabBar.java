package o;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.annotation.Nullable;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import id.dana.lib.drawbitmap.invoice.BaseInvoiceView;
import id.dana.lib.drawbitmap.style.font.FontTypeVariant;
import id.dana.lib.drawbitmap.style.typeface.TypeFaceVariant;
import o.ActionSheetRecyclerAdapter;
import o.TitleBarRightButtonView;

public class hideTabBar implements BaseInvoiceView {
    private int biztextY;
    private int biztypeY;
    private applyUpdate brush;
    /* access modifiers changed from: private */
    public Canvas canvas;
    /* access modifiers changed from: private */
    public Context context;
    private int countY;
    private int dashedLineY;
    /* access modifiers changed from: private */
    public TitleBarRightButtonView.AnonymousClass2<Integer> emitter;
    /* access modifiers changed from: private */
    public int firstY;
    /* access modifiers changed from: private */
    public int lastY;
    /* access modifiers changed from: private */
    public Paint paint = new Paint();
    private float strokeBottom;
    private float strokeRight;
    private float strokeTop;
    private MiniProgramBridgeExtension summaryEntity;
    private int titleLastY;
    private int titleY;

    public hideTabBar(Context context2, MiniProgramBridgeExtension miniProgramBridgeExtension) {
        this.context = context2;
        this.summaryEntity = miniProgramBridgeExtension;
    }

    public void setEmitter(TitleBarRightButtonView.AnonymousClass2<Integer> r1) {
        this.emitter = r1;
    }

    public void constructSummary() {
        drawBizIconWrapper();
        drawTitle();
        drawBizIcon();
        if (this.summaryEntity.getBizType() != null) {
            drawBizTypeBg();
            drawBizTypeText();
        }
        if (this.summaryEntity.getOrderStatus() != null) {
            drawOrderStatusBg();
            drawOrderStatusText();
        }
        drawDashedBorder();
        if (this.summaryEntity.getExtInfo() != null) {
            drawExtInfo();
        }
        drawSideCircle();
    }

    private void drawBizIconWrapper() {
        float f = (float) (this.firstY + 104);
        this.brush.stroke(this.paint, "#e3e3e3", 2.0f, new CornerPathEffect(8.0f));
        this.canvas.drawRect(64.0f, (float) this.firstY, 168.0f, f, this.paint);
    }

    private void drawTitle() {
        this.titleY = this.firstY + 30;
        this.titleLastY = this.brush.multilineText(this.summaryEntity.getTitle(), 200, this.titleY, 32, TypeFaceVariant.TITLE_14_NORMAL, Paint.Align.LEFT);
    }

    private void drawBizIcon() {
        try {
            final int i = this.firstY + 104;
            setFirstVerticalBias<Bitmap> length = Glide.getMax(this.context).length();
            StringBuilder sb = new StringBuilder();
            sb.append(this.summaryEntity.getIconUrl());
            sb.append("?test=");
            sb.append(System.currentTimeMillis());
            length.getMax(sb.toString()).getMin((getTopSortedChildren<?>) ((dispatchApplyWindowInsetsToBehaviors) ((dispatchApplyWindowInsetsToBehaviors) ((dispatchApplyWindowInsetsToBehaviors) ((dispatchApplyWindowInsetsToBehaviors) ((dispatchApplyWindowInsetsToBehaviors) new dispatchApplyWindowInsetsToBehaviors().length(ActionSheetRecyclerAdapter.ActionSheetViewHolder.AnonymousClass1.length.dana_coin)).getMin(ActionSheetRecyclerAdapter.ActionSheetViewHolder.AnonymousClass1.length.dana_coin)).getMin(evaluate.length)).length(true)).FastBitmap$CoordinateSystem()).length((setPivotY) new layoutChild(Long.valueOf(System.currentTimeMillis())))).setMin(new parseBehavior<Bitmap>() {
                public final boolean onLoadFailed(@Nullable GlideException glideException, Object obj, layoutChildWithAnchor<Bitmap> layoutchildwithanchor, boolean z) {
                    Rect rect = new Rect(88, hideTabBar.this.firstY + 24, 144, i - 24);
                    hideTabBar.this.canvas.drawBitmap(BitmapFactory.decodeResource(hideTabBar.this.context.getResources(), ActionSheetRecyclerAdapter.ActionSheetViewHolder.AnonymousClass1.length.dana_coin), (Rect) null, rect, hideTabBar.this.paint);
                    hideTabBar.this.emitter.onNext(Integer.valueOf(hideTabBar.this.lastY));
                    return false;
                }

                public final boolean onResourceReady(Bitmap bitmap, Object obj, layoutChildWithAnchor<Bitmap> layoutchildwithanchor, DataSource dataSource, boolean z) {
                    hideTabBar.this.canvas.drawBitmap(bitmap, (Rect) null, new Rect(88, hideTabBar.this.firstY + 24, 144, i - 24), hideTabBar.this.paint);
                    hideTabBar.this.emitter.onNext(Integer.valueOf(hideTabBar.this.lastY));
                    return false;
                }
            }).setMax();
        } catch (Exception unused) {
        }
    }

    private void drawBizTypeBg() {
        this.biztypeY = this.titleLastY + 20;
        this.strokeRight = this.brush.textLenght(this.summaryEntity.getBizType(), TypeFaceVariant.CAPTION_12_SECONDARY) + 200.0f + 48.0f;
        this.brush.fill(this.paint, "#f5f5f5", new CornerPathEffect(4.0f));
        this.canvas.drawRect(200.0f, (float) this.biztypeY, this.strokeRight, (float) (this.biztypeY + 48), this.paint);
        int i = ((this.titleLastY + 48) + 20) - this.firstY;
        this.countY = i;
        if (104 > i) {
            i = 104;
        }
        this.dashedLineY = i;
    }

    private void drawBizTypeText() {
        this.biztextY = this.biztypeY + 32;
        this.brush.text(this.summaryEntity.getBizType(), 224.0f, (float) this.biztextY, TypeFaceVariant.CAPTION_12_SECONDARY);
    }

    private void drawOrderStatusBg() {
        float textLenght = this.brush.textLenght(this.summaryEntity.getOrderStatus().getTitle(), TypeFaceVariant.CAPTION_12_SECONDARY);
        float f = this.strokeRight;
        float f2 = f + 8.0f;
        float f3 = f + textLenght + 48.0f;
        this.brush.fill(this.paint, "#def9eb", new CornerPathEffect(4.0f));
        this.canvas.drawRect(f2, (float) this.biztypeY, f3, (float) (this.biztypeY + 48), this.paint);
    }

    private void drawOrderStatusText() {
        this.brush.text(this.summaryEntity.getOrderStatus().getTitle(), this.strokeRight + 8.0f + 24.0f, (float) this.biztextY, 12, "#00ce64", FontTypeVariant.OPEN_SANS_SEMIBOLD);
    }

    private void drawDashedBorder() {
        int i = this.firstY;
        this.strokeBottom = (float) (this.dashedLineY + i + 36);
        this.strokeTop = (float) (i - 36);
        this.brush.strokeDash(this.paint, "#e3e3e3", 2.0f);
        Path path = new Path();
        path.moveTo(32.0f, this.strokeTop);
        path.lineTo(718.0f, this.strokeTop);
        this.canvas.drawPath(path, this.paint);
        Path path2 = new Path();
        path2.moveTo(32.0f, this.strokeBottom);
        path2.lineTo(718.0f, this.strokeBottom);
        this.canvas.drawPath(path2, this.paint);
    }

    private void drawExtInfo() {
        float f = this.strokeBottom + 50.0f;
        float f2 = f + 28.0f;
        this.brush.text(this.summaryEntity.getExtInfo().getTitle(), 64.0f, f, TypeFaceVariant.TITLE_12_NORMAL);
        this.brush.fill(this.paint, "#fef0de", new CornerPathEffect(8.0f));
        this.canvas.drawRect(64.0f, f2, 686.0f, f2 + 96.0f, this.paint);
        this.brush.text(this.summaryEntity.getExtInfo().getValue(), 88.0f, 60.0f + f2, TypeFaceVariant.TITLE_16_HIGHLIGHT);
    }

    private void drawSideCircle() {
        int i = this.firstY;
        RectF rectF = new RectF();
        float f = (float) ((i - 36) - 15);
        float f2 = (float) ((i - 36) + 15);
        rectF.set(17.0f, f, 45.0f, f2);
        RectF rectF2 = new RectF();
        rectF2.set(705.0f, f, 733.0f, f2);
        this.brush.fill(this.paint, "#108ee9", (CornerPathEffect) null);
        this.canvas.drawArc(rectF, 270.0f, 180.0f, false, this.paint);
        this.canvas.drawArc(rectF2, 270.0f, -180.0f, false, this.paint);
        this.brush.stroke(this.paint, "#e3e3e3", 2.0f, (CornerPathEffect) null);
        this.canvas.drawArc(rectF, 270.0f, 180.0f, false, this.paint);
        this.canvas.drawArc(rectF2, 270.0f, -180.0f, false, this.paint);
    }

    public int getLastY() {
        return this.lastY;
    }

    public void setFirstY(int i) {
        int i2 = i + 36;
        this.firstY = i2;
        calculateHeight(i2);
    }

    public void calculateHeight(int i) {
        int calculateMultiline = ClientAppBridgeExtension.calculateMultiline(this.summaryEntity.getTitle(), 200, this.titleY, 32);
        this.titleLastY = calculateMultiline;
        int i2 = ((calculateMultiline + 48) + 20) - this.firstY;
        this.countY = i2;
        if (104 > i2) {
            i2 = 104;
        }
        this.dashedLineY = i2;
        int i3 = this.firstY + i2 + 40;
        this.lastY = i3;
        if (this.summaryEntity.getExtInfo() != null) {
            this.lastY = ((int) (((float) (i3 + 50)) + 28.0f + 96.0f)) + 40;
        }
    }

    public void setCanvas(Canvas canvas2) {
        this.canvas = canvas2;
        this.brush = new applyUpdate(this.context, canvas2);
    }
}
