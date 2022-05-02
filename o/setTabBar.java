package o;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.alipay.zoloz.toyger.blob.BlobStatic;
import id.dana.lib.drawbitmap.invoice.BaseInvoiceView;
import id.dana.lib.drawbitmap.style.font.FontTypeVariant;
import id.dana.lib.drawbitmap.style.typeface.TypeFaceVariant;
import o.ActionSheetRecyclerAdapter;

public class setTabBar implements BaseInvoiceView {
    private static final int START_HEADER_Y = 132;
    private applyUpdate brush;
    private Canvas canvas;
    private Context context;
    private int fillBottom;
    private int firstY;
    private int fixedHeight;
    private int lastY;
    private String pageTitle;
    private Paint paintFill = new Paint();
    private Paint paintStroke = new Paint();

    public int getLastY() {
        return START_HEADER_Y;
    }

    public setTabBar(Context context2, String str) {
        this.context = context2;
        this.pageTitle = str;
    }

    public void constructWrapper() {
        drawWrapperBackground();
        drawActiveBackground();
        drawTopHalfCircle();
        drawBottomHalfCircle();
        drawFooter();
    }

    private void drawWrapperBackground() {
        this.paintFill.setColor(Color.parseColor("#108ee9"));
        Canvas canvas2 = this.canvas;
        int i = this.firstY;
        canvas2.drawRect((float) i, (float) i, 750.0f, (float) (this.fixedHeight + BlobStatic.MONITOR_IMAGE_WIDTH), this.paintFill);
        this.brush.text(this.pageTitle, 375.0f, 87.0f, 17, "#ffffff", FontTypeVariant.SF_PRO_REGULAR, Paint.Align.CENTER);
    }

    private void drawActiveBackground() {
        int i = this.fixedHeight;
        this.fillBottom = i - 174;
        float f = (float) (i - 174);
        CornerPathEffect cornerPathEffect = new CornerPathEffect(10.0f);
        this.brush.fill(this.paintFill, "#ffffff", cornerPathEffect);
        this.brush.stroke(this.paintStroke, "#e3e3e3", 2.0f, cornerPathEffect);
        this.canvas.drawRoundRect(new RectF(32.0f, 174.0f, 718.0f, (float) this.fillBottom), 8.0f, 8.0f, this.paintFill);
        this.canvas.drawRect(32.0f, 174.0f, 718.0f, f, this.paintStroke);
    }

    private void drawTopHalfCircle() {
        RectF rectF = new RectF();
        rectF.set(325.0f, 126.0f, 425.0f, 226.0f);
        RectF rectF2 = new RectF();
        rectF2.set(325.0f, 126.0f, 425.0f, 226.0f);
        this.brush.fill(this.paintFill, "#ffffff");
        this.canvas.drawArc(rectF2, 180.0f, 180.0f, false, this.paintFill);
        this.canvas.drawArc(rectF, 180.0f, 180.0f, false, this.paintStroke);
    }

    private void drawBottomHalfCircle() {
        int i = this.fixedHeight;
        float f = ((float) (i - 174)) - 15.0f;
        float f2 = ((float) (i - 174)) + 15.0f + 2.0f;
        RectF rectF = new RectF();
        float f3 = 60.0f;
        float f4 = 92.0f;
        for (double d = 750.0d; d > 0.0d; d = (d - 60.0d) - 8.2d) {
            rectF.set(f3, f, f4, f2);
            this.brush.fill(this.paintFill, "#108ee9", (CornerPathEffect) null);
            this.brush.stroke(this.paintStroke, "#e3e3e3", 2.0f, (CornerPathEffect) null);
            RectF rectF2 = rectF;
            this.canvas.drawArc(rectF2, 180.0f, 180.0f, false, this.paintFill);
            this.canvas.drawArc(rectF2, 180.0f, 180.0f, false, this.paintStroke);
            f3 = (f3 + 75.0f) - 15.0f;
            f4 = (f4 + 75.0f) - 15.0f;
        }
    }

    private void drawFooter() {
        int i = this.fillBottom + 60;
        int i2 = i - 22;
        this.brush.text("Powered by ", 315.0f, (float) i, TypeFaceVariant.CAPTION_12_INVERTED, Paint.Align.CENTER);
        this.canvas.drawBitmap(BitmapFactory.decodeResource(this.context.getResources(), ActionSheetRecyclerAdapter.ActionSheetViewHolder.AnonymousClass1.length.white_dana), (Rect) null, new Rect(389, i2, 495, i2 + 32), this.paintFill);
    }

    public void setWrapperHeight(int i) {
        this.fixedHeight = i + BlobStatic.MONITOR_IMAGE_WIDTH;
    }

    public void setCanvas(Canvas canvas2) {
        this.canvas = canvas2;
        this.brush = new applyUpdate(this.context, canvas2);
    }

    public void setFirstY(int i) {
        this.firstY = i;
    }

    public void calculateHeight(int i) {
        this.lastY = getLastY();
    }
}
