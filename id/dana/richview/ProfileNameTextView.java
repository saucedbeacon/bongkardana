package id.dana.richview;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import o.resetInternal;

public class ProfileNameTextView extends AppCompatTextView {
    private Level setMax = Level.Normal;

    public ProfileNameTextView(Context context) {
        super(context);
        getMin((AttributeSet) null);
    }

    public ProfileNameTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        getMin(attributeSet);
    }

    public ProfileNameTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        getMin(attributeSet);
    }

    private void getMin(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, resetInternal.getMin.IResultReceiver$Default);
            try {
                this.setMax = Level.getByValue(obtainStyledAttributes.getInt(0, 0));
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        setLevel(this.setMax);
    }

    public void setLevel(Level level) {
        this.setMax = level;
    }

    public enum Level {
        Normal(0),
        ManualReview(1),
        InProgress(2),
        Failed(3),
        Success(4),
        Verified(5),
        Premium(6);
        
        private int value;

        private Level(int i) {
            this.value = i;
        }

        public static Level getByValue(int i) {
            for (Level level : values()) {
                if (level.getValue() == i) {
                    return level;
                }
            }
            return null;
        }

        public final int getValue() {
            return this.value;
        }
    }
}
