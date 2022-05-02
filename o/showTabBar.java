package o;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import id.dana.lib.drawbitmap.invoice.BaseInvoiceView;
import id.dana.lib.drawbitmap.style.typeface.TypeFaceVariant;
import java.util.List;

public class showTabBar implements BaseInvoiceView {
    private applyUpdate brush;
    private Canvas canvas;
    private Context context;
    private int firstY;
    private int lastY;
    private Paint paint = new Paint();
    private List<navigateToMiniProgram> transactionDetailEntity;
    private int yLastPosition;
    private int yStroke;
    private int yValuePosition;

    public showTabBar(Context context2, List<navigateToMiniProgram> list) {
        this.context = context2;
        this.transactionDetailEntity = list;
    }

    public void constructTransactionDetail() {
        drawData();
        drawWrapperDashedBorder();
    }

    private void drawData() {
        for (navigateToMiniProgram next : this.transactionDetailEntity) {
            this.yValuePosition = this.firstY + 48;
            this.brush.text(next.getTitle(), 64.0f, (float) this.firstY, TypeFaceVariant.CAPTION_12_SECONDARY, Paint.Align.LEFT);
            int multilineText = this.brush.multilineText(next.getValue(), 64, this.yValuePosition, 64, TypeFaceVariant.BODY_14_NORMAL, Paint.Align.LEFT);
            this.yLastPosition = multilineText;
            this.firstY = multilineText + 50;
        }
    }

    private void drawWrapperDashedBorder() {
        this.yStroke = this.yLastPosition + 40;
        this.brush.strokeDash(this.paint, "#e3e3e3", 2.0f);
        Path path = new Path();
        path.moveTo(32.0f, (float) this.yStroke);
        path.lineTo(718.0f, (float) this.yStroke);
        this.canvas.drawPath(path, this.paint);
    }

    public int getLastY() {
        return this.lastY;
    }

    public void setFirstY(int i) {
        int i2 = i + 60;
        this.firstY = i2;
        calculateHeight(i2);
    }

    public void calculateHeight(int i) {
        int i2 = this.firstY;
        for (navigateToMiniProgram value : this.transactionDetailEntity) {
            this.yValuePosition = i2 + 48;
            int calculateMultiline = ClientAppBridgeExtension.calculateMultiline(value.getValue(), 64, this.yValuePosition, 64);
            this.yLastPosition = calculateMultiline;
            i2 = calculateMultiline + 50;
        }
        this.lastY = this.yLastPosition + 80;
    }

    public void setCanvas(Canvas canvas2) {
        this.canvas = canvas2;
        this.brush = new applyUpdate(this.context, canvas2);
    }
}
