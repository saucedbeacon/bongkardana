package id.dana.richview;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.DrawableRes;
import butterknife.BindView;
import com.bumptech.glide.Glide;
import de.hdodenhof.circleimageview.CircleImageView;
import id.dana.R;
import id.dana.base.BaseRichView;
import o.IntRange;
import o.evaluate;
import o.getInsetDodgeRect;
import o.onDetachedFromLayoutParams;
import o.updateCornerMarking;

public class QRView extends BaseRichView {
    private onDetachedFromLayoutParams getMin;
    @BindView(2131363188)
    CircleImageView imageViewUserProfile;
    @BindView(2131365887)
    ImageView ivKyc;
    @BindView(2131363592)
    ImageView ivQr;
    @BindView(2131363611)
    ImageView ivRefresh;
    @BindView(2131365929)
    View viewQrSkeleton;

    public int getLayout() {
        return R.layout.view_qr;
    }

    public void setup() {
    }

    public QRView(Context context) {
        super(context);
    }

    public QRView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public QRView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public QRView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public void setKycView(String str) {
        if (!TextUtils.isEmpty(str)) {
            if ("KYC0".equals(str)) {
                this.ivKyc.setVisibility(4);
            } else {
                this.ivKyc.setVisibility(0);
            }
        }
    }

    public void displayUserAvatar(String str) {
        ((updateCornerMarking) Glide.getMax(getContext())).setMax(str).setMax(evaluate.setMin).setMax((int) R.drawable.avatar_placeholder).setMin((int) R.drawable.avatar_placeholder).length((ImageView) this.imageViewUserProfile);
    }

    public void displayUserAvatar(@DrawableRes int i) {
        ((updateCornerMarking) Glide.getMax(getContext())).length(Integer.valueOf(i)).setMax(evaluate.setMin).setMax((int) R.drawable.avatar_placeholder).setMin((int) R.drawable.avatar_placeholder).length((ImageView) this.imageViewUserProfile);
    }

    public void showEmptyQr() {
        this.ivKyc.setVisibility(4);
        displayUserAvatar((int) R.drawable.refresh);
        this.ivQr.setImageResource(R.drawable.square_rounded_skeleton);
    }

    public void showSkeleton() {
        View view = this.viewQrSkeleton;
        if (view != null) {
            getInsetDodgeRect.setMax setmax = new getInsetDodgeRect.setMax(view);
            setmax.getMax = R.layout.view_bar180x180_skeleton;
            setmax.isInside = 0;
            setmax.setMax = 1500;
            setmax.setMin = IntRange.setMax(setmax.getMin.getContext(), R.color.f24782131100433);
            getInsetDodgeRect getinsetdodgerect = new getInsetDodgeRect(setmax, (byte) 0);
            getinsetdodgerect.getMin();
            this.getMin = getinsetdodgerect;
            length(false);
        }
    }

    public void hideSkeleton() {
        onDetachedFromLayoutParams ondetachedfromlayoutparams = this.getMin;
        if (ondetachedfromlayoutparams != null) {
            ondetachedfromlayoutparams.length();
            this.getMin = null;
            this.viewQrSkeleton.setVisibility(8);
        }
        length(true);
    }

    public ImageView getQrImageView() {
        return this.ivQr;
    }

    private void length(boolean z) {
        int i = 0;
        this.ivQr.setVisibility(z ? 0 : 8);
        CircleImageView circleImageView = this.imageViewUserProfile;
        if (!z) {
            i = 8;
        }
        circleImageView.setVisibility(i);
    }
}
