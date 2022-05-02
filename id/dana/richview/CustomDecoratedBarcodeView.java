package id.dana.richview;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import butterknife.BindView;
import com.journeyapps.barcodescanner.BarcodeView;
import com.journeyapps.barcodescanner.CameraPreview;
import com.journeyapps.barcodescanner.DecoratedBarcodeView;
import id.dana.R;
import id.dana.base.BaseRichView;

public class CustomDecoratedBarcodeView extends BaseRichView {
    private static final int getMin = ((int) (Resources.getSystem().getDisplayMetrics().density * 4.0f));
    private static final int setMin = ((int) (Resources.getSystem().getDisplayMetrics().density * 20.0f));
    @BindView(2131362189)
    BubbleView bvBubbleStatus;
    @BindView(2131362678)
    DecoratedBarcodeView decoratedBarcodeView;
    @BindView(2131363595)
    ImageView ivQrisSupported;
    /* access modifiers changed from: private */
    public boolean length;
    /* access modifiers changed from: private */
    public Rect setMax;

    public int getLayout() {
        return R.layout.view_custom_decorated_barcode;
    }

    public CustomDecoratedBarcodeView(@NonNull Context context) {
        super(context);
    }

    public CustomDecoratedBarcodeView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CustomDecoratedBarcodeView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public CustomDecoratedBarcodeView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public void setup() {
        if (getBarcodeView() != null) {
            this.decoratedBarcodeView.getStatusView().setVisibility(8);
            getBarcodeView().addStateListener(new CameraPreview.setMax() {
                public final void getMax() {
                }

                public final void getMax(Exception exc) {
                }

                public final void getMin() {
                }

                public final void length() {
                    if (CustomDecoratedBarcodeView.access$000(CustomDecoratedBarcodeView.this) != null) {
                        CustomDecoratedBarcodeView customDecoratedBarcodeView = CustomDecoratedBarcodeView.this;
                        Rect unused = customDecoratedBarcodeView.setMax = CustomDecoratedBarcodeView.access$000(customDecoratedBarcodeView);
                        CustomDecoratedBarcodeView.access$200(CustomDecoratedBarcodeView.this);
                        CustomDecoratedBarcodeView.access$300(CustomDecoratedBarcodeView.this);
                        CustomDecoratedBarcodeView.this.setVisibilityToastText(true);
                    }
                }

                public final void setMin() {
                    if (CustomDecoratedBarcodeView.this.bvBubbleStatus != null && !TextUtils.isEmpty(CustomDecoratedBarcodeView.this.bvBubbleStatus.getText())) {
                        CustomDecoratedBarcodeView.this.showBubbleText();
                        CustomDecoratedBarcodeView.this.setVisibilityQrisStampWithPlaceholder(false);
                        CustomDecoratedBarcodeView.this.setVisibilityQrisSupportedStamp(false);
                        CustomDecoratedBarcodeView.this.setVisibilityBubblePointer(true);
                    } else if (CustomDecoratedBarcodeView.this.length) {
                        CustomDecoratedBarcodeView.this.setVisibilityQrisStampWithPlaceholder(true);
                    }
                }
            });
            setVisibilityToastText(false);
            setVisibilityQrisSupportedStamp(false);
            setVisibilityBubblePointer(false);
        }
    }

    public BarcodeView getBarcodeView() {
        DecoratedBarcodeView decoratedBarcodeView2 = this.decoratedBarcodeView;
        if (decoratedBarcodeView2 != null) {
            return decoratedBarcodeView2.getBarcodeView();
        }
        return null;
    }

    public DecoratedBarcodeView getDecoratedBarcodeView() {
        return this.decoratedBarcodeView;
    }

    public void pause() {
        DecoratedBarcodeView decoratedBarcodeView2 = this.decoratedBarcodeView;
        if (decoratedBarcodeView2 != null) {
            decoratedBarcodeView2.pause();
        }
    }

    public void resume() {
        DecoratedBarcodeView decoratedBarcodeView2 = this.decoratedBarcodeView;
        if (decoratedBarcodeView2 != null) {
            decoratedBarcodeView2.resume();
        }
    }

    public void setStatusText(String str) {
        BubbleView bubbleView = this.bvBubbleStatus;
        if (bubbleView != null) {
            bubbleView.setText(str);
        }
    }

    public void showBubbleText() {
        BubbleView bubbleView = this.bvBubbleStatus;
        if (bubbleView != null) {
            bubbleView.setVisibilityPointer(true);
            this.bvBubbleStatus.setVisibilityBubbleText(true);
        }
    }

    public void clearBubbleView() {
        BubbleView bubbleView = this.bvBubbleStatus;
        if (bubbleView != null) {
            bubbleView.setVisibilityPointer(false);
            this.bvBubbleStatus.setVisibilityBubbleText(false);
            this.bvBubbleStatus.setVisibilityBubbleImage(false);
        }
    }

    public void setVisibilityQrisPlaceholder(boolean z) {
        BubbleView bubbleView = this.bvBubbleStatus;
        if (bubbleView == null) {
            return;
        }
        if (z) {
            bubbleView.setVisibilityPointer(true);
            this.bvBubbleStatus.setVisibilityBubbleText(false);
            this.bvBubbleStatus.setVisibilityBubbleImage(true);
            return;
        }
        bubbleView.setVisibilityPointer(false);
        this.bvBubbleStatus.setVisibilityBubbleImage(false);
    }

    public boolean isBubbleQrisSupportedVisible() {
        ImageView imageView = this.ivQrisSupported;
        return imageView != null && imageView.getVisibility() == 0;
    }

    public void setVisibilityQrisStampWithPlaceholder(boolean z) {
        if (z) {
            setVisibilityQrisPlaceholder(true);
            setVisibilityQrisSupportedStamp(true);
            return;
        }
        setVisibilityQrisPlaceholder(false);
        setVisibilityBubblePointer(false);
    }

    public void setVisibilityToastText(boolean z) {
        BubbleView bubbleView = this.bvBubbleStatus;
        if (bubbleView != null) {
            bubbleView.setVisibility(z ? 0 : 8);
        }
    }

    public void setVisibilityBubblePointer(boolean z) {
        BubbleView bubbleView = this.bvBubbleStatus;
        if (bubbleView != null) {
            bubbleView.setVisibilityPointer(z);
        }
    }

    public void setVisibilityQrisSupportedStamp(boolean z) {
        ImageView imageView = this.ivQrisSupported;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    public void setTorchOff() {
        DecoratedBarcodeView decoratedBarcodeView2 = this.decoratedBarcodeView;
        if (decoratedBarcodeView2 != null) {
            decoratedBarcodeView2.setTorchOff();
        }
    }

    public void setTorchOn() {
        DecoratedBarcodeView decoratedBarcodeView2 = this.decoratedBarcodeView;
        if (decoratedBarcodeView2 != null) {
            decoratedBarcodeView2.setTorchOn();
        }
    }

    public void setPlaceholderShow(boolean z) {
        this.length = z;
    }

    static /* synthetic */ Rect access$000(CustomDecoratedBarcodeView customDecoratedBarcodeView) {
        if (customDecoratedBarcodeView.getBarcodeView() == null || customDecoratedBarcodeView.getBarcodeView().getFramingRect() == null) {
            return null;
        }
        return customDecoratedBarcodeView.getBarcodeView().getFramingRect();
    }

    static /* synthetic */ void access$200(CustomDecoratedBarcodeView customDecoratedBarcodeView) {
        BubbleView bubbleView = customDecoratedBarcodeView.bvBubbleStatus;
        if (bubbleView != null) {
            Rect rect = customDecoratedBarcodeView.setMax;
            bubbleView.setY(rect != null ? (float) (rect.bottom + getMin) : -1.0f);
        }
    }

    static /* synthetic */ void access$300(CustomDecoratedBarcodeView customDecoratedBarcodeView) {
        ImageView imageView = customDecoratedBarcodeView.ivQrisSupported;
        if (imageView != null) {
            Rect rect = customDecoratedBarcodeView.setMax;
            imageView.setY((rect != null ? (float) (rect.bottom + getMin) : -1.0f) + ((float) setMin));
        }
    }
}
