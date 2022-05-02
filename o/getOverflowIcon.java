package o;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;
import androidx.annotation.RequiresApi;

public interface getOverflowIcon extends Animatable {

    public static abstract class getMax {
        Animatable2.AnimationCallback mPlatformCallback;

        public void onAnimationEnd(Drawable drawable) {
        }

        public void onAnimationStart(Drawable drawable) {
        }

        /* access modifiers changed from: package-private */
        @RequiresApi(23)
        public Animatable2.AnimationCallback getPlatformCallback() {
            if (this.mPlatformCallback == null) {
                this.mPlatformCallback = new Animatable2.AnimationCallback() {
                    public void onAnimationStart(Drawable drawable) {
                        getMax.this.onAnimationStart(drawable);
                    }

                    public void onAnimationEnd(Drawable drawable) {
                        getMax.this.onAnimationEnd(drawable);
                    }
                };
            }
            return this.mPlatformCallback;
        }
    }
}
