package id.dana.richview;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import butterknife.BindView;
import de.hdodenhof.circleimageview.CircleImageView;
import id.dana.R;
import id.dana.base.BaseRichView;
import id.dana.richview.ProfileNameTextView;
import o.GriverPhotoPreviewActivity;
import o.IntRange;
import o.WheelView;
import o.dispatchOnCancelled;
import o.getInsetDodgeRect;
import o.onCancelLoad;
import o.onCanceled;
import o.onDetachedFromLayoutParams;

public class SimpleProfileWithQrView extends BaseRichView {
    private onDetachedFromLayoutParams getMax;
    @BindView(2131363405)
    ImageView ivDanaPremium;
    @BindView(2131363645)
    View ivStaticQrSkeleton;
    private onDetachedFromLayoutParams length;
    @BindView(2131365442)
    TextView phoneNumber;
    @BindView(2131364275)
    CircleImageView profileImageView;
    @BindView(2131363186)
    ImageView qrImageView;
    private Animation setMax;
    @BindView(2131364804)
    ProfileNameTextView userName;

    public interface setMin {
        void length();
    }

    public int getLayout() {
        return R.layout.view_simple_profile_with_qr;
    }

    public SimpleProfileWithQrView(@NonNull Context context) {
        super(context);
    }

    public SimpleProfileWithQrView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SimpleProfileWithQrView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public SimpleProfileWithQrView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public void setup() {
        Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), R.anim.f732130772045);
        this.setMax = loadAnimation;
        loadAnimation.setInterpolator(new LinearInterpolator());
    }

    public void hideSkeleton() {
        onDetachedFromLayoutParams ondetachedfromlayoutparams = this.length;
        if (ondetachedfromlayoutparams != null) {
            ondetachedfromlayoutparams.length();
            this.length = null;
            this.ivStaticQrSkeleton.setVisibility(8);
        }
    }

    public void onPremiumUser(boolean z) {
        this.ivDanaPremium.setVisibility(z ? 0 : 4);
    }

    public void hideNameAndPhoneSkeleton() {
        onDetachedFromLayoutParams ondetachedfromlayoutparams = this.getMax;
        if (ondetachedfromlayoutparams != null) {
            ondetachedfromlayoutparams.length();
            this.getMax = null;
        }
    }

    public void showSkeleton() {
        getInsetDodgeRect.setMax setmax = new getInsetDodgeRect.setMax(this.ivStaticQrSkeleton);
        setmax.getMax = R.layout.view_profile_qr;
        setmax.isInside = 20;
        setmax.setMax = 1500;
        setmax.length = true;
        setmax.setMin = IntRange.setMax(setmax.getMin.getContext(), R.color.f24782131100433);
        getInsetDodgeRect getinsetdodgerect = new getInsetDodgeRect(setmax, (byte) 0);
        getinsetdodgerect.getMin();
        this.length = getinsetdodgerect;
    }

    public void showNameAndPhoneSkeleton() {
        getInsetDodgeRect.setMax setmax = new getInsetDodgeRect.setMax(this.userName);
        setmax.getMax = R.layout.view_skeleton_name_and_phone;
        setmax.isInside = 20;
        setmax.setMax = 1500;
        setmax.length = true;
        setmax.setMin = IntRange.setMax(setmax.getMin.getContext(), R.color.f24782131100433);
        getInsetDodgeRect getinsetdodgerect = new getInsetDodgeRect(setmax, (byte) 0);
        getinsetdodgerect.getMin();
        this.getMax = getinsetdodgerect;
    }

    public void startRefreshAnimation() {
        this.profileImageView.setBackground(getResources().getDrawable(R.drawable.white_circle_small));
        this.profileImageView.setImageDrawable(getResources().getDrawable(R.drawable.refresh));
        this.profileImageView.startAnimation(this.setMax);
    }

    public void stopRefreshAnimation() {
        if (!this.setMax.hasEnded()) {
            this.setMax.cancel();
        }
    }

    public ImageView getUserProfileImageView() {
        return this.profileImageView;
    }

    public void setUserName(String str) {
        int length2 = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length2);
        if (length2 != max) {
            onCanceled oncanceled = new onCanceled(length2, max, 1);
            onCancelLoad.setMax(285909356, oncanceled);
            onCancelLoad.getMin(285909356, oncanceled);
        }
        if (!TextUtils.isEmpty(str)) {
            this.userName.setText(str);
        }
    }

    public void setUserLevel(ProfileNameTextView.Level level) {
        this.userName.setLevel(level);
    }

    public void setPhoneNumber(String str) {
        if (this.phoneNumber.getText().toString().isEmpty() && str != null) {
            this.phoneNumber.setText(WheelView.ScrollerTask.AnonymousClass2.getMin(str, false));
        }
    }

    public ImageView getQrImageView() {
        return this.qrImageView;
    }

    public void setQrImageListener(setMin setmin) {
        this.qrImageView.setOnClickListener(new GriverPhotoPreviewActivity(setmin));
    }

    public static /* synthetic */ void setMin(setMin setmin) {
        if (setmin != null) {
            setmin.length();
        }
    }
}
