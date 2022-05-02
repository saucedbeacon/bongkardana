package id.dana.richview;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import id.dana.R;
import id.dana.base.BaseRichView;

public class BubbleView extends BaseRichView {
    private TextView length;
    private ImageView setMax;
    private ImageView setMin;

    public int getLayout() {
        return R.layout.view_bubble_toast;
    }

    public BubbleView(@NonNull Context context) {
        super(context);
    }

    public BubbleView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public BubbleView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public BubbleView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public void setup() {
        this.length = (TextView) findViewById(R.id.f70082131365638);
        this.setMax = (ImageView) findViewById(R.id.f49942131363549);
        this.setMin = (ImageView) findViewById(R.id.f50172131363572);
    }

    public String getText() {
        TextView textView = this.length;
        return textView != null ? textView.getText().toString() : "";
    }

    public void setText(String str) {
        TextView textView = this.length;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public void setVisibilityPointer(boolean z) {
        ImageView imageView = this.setMin;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    public void setVisibilityBubbleText(boolean z) {
        TextView textView = this.length;
        if (textView != null) {
            textView.setVisibility(z ? 0 : 8);
        }
    }

    public void setVisibilityBubbleImage(boolean z) {
        ImageView imageView = this.setMax;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }
}
