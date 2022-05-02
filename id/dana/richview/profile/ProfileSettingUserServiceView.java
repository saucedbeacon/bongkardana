package id.dana.richview.profile;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.TextViewCompat;
import butterknife.BindView;
import id.dana.R;
import id.dana.base.BaseRichView;
import id.dana.myprofile.SubtitleType;
import o.IntRange;
import o.getInsetDodgeRect;
import o.onDetachedFromLayoutParams;

public class ProfileSettingUserServiceView extends BaseRichView {
    ConstraintLayout clMainParent;
    @BindView(2131363350)
    ImageView ivArrow;
    @BindView(2131363585)
    ImageView ivProfileUserService;
    @BindView(2131363668)
    ImageView ivViewProfileUserServiceRedDot;
    private onDetachedFromLayoutParams length;
    private onDetachedFromLayoutParams setMin;
    @BindView(2131365200)
    TextView tvDetailProfileUserService;
    @BindView(2131365201)
    TextView tvDetailProfileUserServiceNonDynamic;
    @BindView(2131365459)
    TextView tvProfileUserService;

    public int getLayout() {
        return R.layout.view_profile_setting_user_service;
    }

    public void setup() {
    }

    public ProfileSettingUserServiceView(@NonNull Context context) {
        super(context);
    }

    public ProfileSettingUserServiceView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ProfileSettingUserServiceView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public ProfileSettingUserServiceView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public void init(Context context, AttributeSet attributeSet) {
        super.init(context, attributeSet);
        this.clMainParent = (ConstraintLayout) findViewById(R.id.f39732131362453);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setView(java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.Boolean r9, java.lang.String r10) {
        /*
            r4 = this;
            int r0 = r7.hashCode()
            r1 = 8
            r2 = 0
            switch(r0) {
                case -2006050296: goto L_0x0073;
                case -1751430567: goto L_0x0069;
                case -1169499887: goto L_0x005f;
                case -1043979156: goto L_0x0055;
                case -121893092: goto L_0x004a;
                case -121883067: goto L_0x0040;
                case -89626590: goto L_0x0035;
                case 858510317: goto L_0x002b;
                case 1215209638: goto L_0x0021;
                case 2009494083: goto L_0x0017;
                case 2046277804: goto L_0x000c;
                default: goto L_0x000a;
            }
        L_0x000a:
            goto L_0x007e
        L_0x000c:
            java.lang.String r0 = "setting_referral"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x007e
            r7 = 0
            goto L_0x007f
        L_0x0017:
            java.lang.String r0 = "setting_promo_quest"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x007e
            r7 = 1
            goto L_0x007f
        L_0x0021:
            java.lang.String r0 = "setting_my_payment_cards"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x007e
            r7 = 3
            goto L_0x007f
        L_0x002b:
            java.lang.String r0 = "setting_balance"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x007e
            r7 = 5
            goto L_0x007f
        L_0x0035:
            java.lang.String r0 = "setting_investment"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x007e
            r7 = 10
            goto L_0x007f
        L_0x0040:
            java.lang.String r0 = "setting_kyb"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x007e
            r7 = 4
            goto L_0x007f
        L_0x004a:
            java.lang.String r0 = "setting_aku"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x007e
            r7 = 9
            goto L_0x007f
        L_0x0055:
            java.lang.String r0 = "setting_promo_code"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x007e
            r7 = 2
            goto L_0x007f
        L_0x005f:
            java.lang.String r0 = "setting_goals"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x007e
            r7 = 6
            goto L_0x007f
        L_0x0069:
            java.lang.String r0 = "setting_logout"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x007e
            r7 = 7
            goto L_0x007f
        L_0x0073:
            java.lang.String r0 = "setting_my_bills"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x007e
            r7 = 8
            goto L_0x007f
        L_0x007e:
            r7 = -1
        L_0x007f:
            switch(r7) {
                case 0: goto L_0x00d0;
                case 1: goto L_0x00cc;
                case 2: goto L_0x00c8;
                case 3: goto L_0x00a4;
                case 4: goto L_0x00a0;
                case 5: goto L_0x009c;
                case 6: goto L_0x0098;
                case 7: goto L_0x008f;
                case 8: goto L_0x008b;
                case 9: goto L_0x0087;
                case 10: goto L_0x0083;
                default: goto L_0x0082;
            }
        L_0x0082:
            goto L_0x0096
        L_0x0083:
            r7 = 2131231950(0x7f0804ce, float:1.8079995E38)
            goto L_0x00d3
        L_0x0087:
            r7 = 2131231846(0x7f080466, float:1.8079785E38)
            goto L_0x00d3
        L_0x008b:
            r7 = 2131232113(0x7f080571, float:1.8080326E38)
            goto L_0x00d3
        L_0x008f:
            android.widget.ImageView r7 = r4.ivArrow
            if (r7 == 0) goto L_0x0096
            r7.setVisibility(r1)
        L_0x0096:
            r7 = 0
            goto L_0x00d3
        L_0x0098:
            r7 = 2131232263(0x7f080607, float:1.808063E38)
            goto L_0x00d3
        L_0x009c:
            r7 = 2131231845(0x7f080465, float:1.8079783E38)
            goto L_0x00d3
        L_0x00a0:
            r7 = 2131231994(0x7f0804fa, float:1.8080085E38)
            goto L_0x00d3
        L_0x00a4:
            r7 = 2131232189(0x7f0805bd, float:1.808048E38)
            androidx.constraintlayout.widget.ConstraintLayout r0 = r4.clMainParent
            android.content.Context r1 = r4.getContext()
            r3 = 2131886482(0x7f120192, float:1.9407544E38)
            java.lang.String r1 = r1.getString(r3)
            r0.setContentDescription(r1)
            android.widget.TextView r0 = r4.tvDetailProfileUserService
            android.content.Context r1 = r4.getContext()
            r3 = 2131887746(0x7f120682, float:1.9410108E38)
            java.lang.String r1 = r1.getString(r3)
            r0.setContentDescription(r1)
            goto L_0x00d3
        L_0x00c8:
            r7 = 2131232206(0x7f0805ce, float:1.8080515E38)
            goto L_0x00d3
        L_0x00cc:
            r7 = 2131232221(0x7f0805dd, float:1.8080545E38)
            goto L_0x00d3
        L_0x00d0:
            r7 = 2131232241(0x7f0805f1, float:1.8080586E38)
        L_0x00d3:
            boolean r0 = length(r6)
            if (r0 == 0) goto L_0x00dd
            r4.showTextViewSkeleton()
            goto L_0x00f0
        L_0x00dd:
            android.widget.TextView r0 = r4.tvDetailProfileUserService
            java.lang.CharSequence r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            boolean r0 = setMin(r0)
            if (r0 != 0) goto L_0x00f0
            r4.hideTextViewSkeleton()
        L_0x00f0:
            r4.setTitle(r5)
            r4.setSubTitle(r6, r9, r10)
            boolean r5 = r4.isShowRedDot(r5, r6)
            r4.setRedDotVisibility(r5)
            boolean r5 = android.text.TextUtils.isEmpty(r8)
            if (r5 != 0) goto L_0x0133
            r4.showIconSkeleton()
            android.widget.ImageView r5 = r4.ivProfileUserService
            if (r5 == 0) goto L_0x0132
            o.setHorizontalGap r5 = com.bumptech.glide.Glide.setMin((android.view.View) r4)
            o.updateCornerMarking r5 = (o.updateCornerMarking) r5
            o.updateMessageMenuItem r5 = r5.setMax((java.lang.String) r8)
            o.evaluate r6 = o.evaluate.setMin
            o.updateMessageMenuItem r5 = r5.setMax((o.evaluate) r6)
            r6 = 2131231373(0x7f08028d, float:1.8078825E38)
            o.updateMessageMenuItem r5 = r5.setMax((int) r6)
            o.updateMessageMenuItem r5 = r5.setMin((int) r6)
            android.widget.ImageView r6 = r4.ivProfileUserService
            r5.length((android.widget.ImageView) r6)
            r4.hideIconSkeleton()
            android.widget.ImageView r5 = r4.ivProfileUserService
            r5.setVisibility(r2)
        L_0x0132:
            return
        L_0x0133:
            android.widget.ImageView r5 = r4.ivProfileUserService
            if (r5 == 0) goto L_0x015f
            if (r7 == 0) goto L_0x015f
            o.setHorizontalGap r5 = com.bumptech.glide.Glide.setMin((android.view.View) r4)
            o.updateCornerMarking r5 = (o.updateCornerMarking) r5
            java.lang.Integer r6 = java.lang.Integer.valueOf(r7)
            o.updateMessageMenuItem r5 = r5.length((java.lang.Integer) r6)
            o.evaluate r6 = o.evaluate.setMin
            o.updateMessageMenuItem r5 = r5.setMax((o.evaluate) r6)
            o.updateMessageMenuItem r5 = r5.setMax((int) r7)
            o.updateMessageMenuItem r5 = r5.setMin((int) r7)
            android.widget.ImageView r6 = r4.ivProfileUserService
            r5.length((android.widget.ImageView) r6)
            android.widget.ImageView r5 = r4.ivProfileUserService
            r5.setVisibility(r2)
        L_0x015f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: id.dana.richview.profile.ProfileSettingUserServiceView.setView(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String):void");
    }

    private static boolean length(String str) {
        return ("BALANCE".equalsIgnoreCase(str) || SubtitleType.PAYMENT_CARDS.equalsIgnoreCase(str) || SubtitleType.ACCOUNT_TYPE.equalsIgnoreCase(str) || SubtitleType.MOBILE_NUMBER.equalsIgnoreCase(str) || SubtitleType.REAL_NAME.equalsIgnoreCase(str) || SubtitleType.EMAIL.equalsIgnoreCase(str) || SubtitleType.SECURITY_QUESTIONS.equalsIgnoreCase(str) || SubtitleType.SAVING.equalsIgnoreCase(str)) && !TextUtils.isEmpty(str);
    }

    public void setTitle(String str) {
        TextView textView = this.tvProfileUserService;
        if (textView != null && str != null) {
            textView.setText(str);
        }
    }

    public void setSubTitle(String str, Boolean bool, String str2) {
        if (bool == null || bool.equals(Boolean.FALSE)) {
            this.tvDetailProfileUserService.setVisibility(8);
            this.tvDetailProfileUserServiceNonDynamic.setVisibility(0);
            this.tvDetailProfileUserServiceNonDynamic.setText(str);
            getMax(str2);
        } else if (str == null || str.equals("")) {
            this.tvDetailProfileUserService.setVisibility(8);
            this.tvDetailProfileUserServiceNonDynamic.setVisibility(0);
            this.tvDetailProfileUserServiceNonDynamic.setText(str);
            getMax(str2);
        } else {
            this.tvDetailProfileUserService.setVisibility(0);
            this.tvDetailProfileUserServiceNonDynamic.setVisibility(8);
            this.tvDetailProfileUserService.setText(str);
            getMax(str2);
        }
    }

    private void getMax(String str) {
        if (str == null || str.equals("")) {
            TextViewCompat.setMax(this.tvDetailProfileUserService, (int) R.style.f78382131951905);
            TextViewCompat.setMax(this.tvDetailProfileUserServiceNonDynamic, (int) R.style.f78382131951905);
            return;
        }
        this.tvDetailProfileUserService.setTextColor(Color.parseColor(str));
        this.tvDetailProfileUserServiceNonDynamic.setTextColor(Color.parseColor(str));
    }

    public void setRedDotVisibility(boolean z) {
        ImageView imageView = this.ivViewProfileUserServiceRedDot;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    public void setParentViewVisibility(int i) {
        this.clMainParent.setVisibility(i);
    }

    public void hideTextViewSkeleton() {
        onDetachedFromLayoutParams ondetachedfromlayoutparams = this.length;
        if (ondetachedfromlayoutparams != null) {
            ondetachedfromlayoutparams.length();
            this.length = null;
        }
    }

    public void hideIconSkeleton() {
        onDetachedFromLayoutParams ondetachedfromlayoutparams = this.setMin;
        if (ondetachedfromlayoutparams != null) {
            ondetachedfromlayoutparams.length();
            this.setMin = null;
        }
    }

    private static boolean setMin(String str) {
        return "-".equalsIgnoreCase(str);
    }

    public void showIconSkeleton() {
        this.ivProfileUserService.setVisibility(0);
        getInsetDodgeRect.setMax setmax = new getInsetDodgeRect.setMax(this.ivProfileUserService);
        setmax.getMax = R.layout.view_icon_me_page_skeleton;
        setmax.isInside = 20;
        setmax.setMax = 1500;
        setmax.length = true;
        setmax.setMin = IntRange.setMax(setmax.getMin.getContext(), R.color.f24782131100433);
        getInsetDodgeRect getinsetdodgerect = new getInsetDodgeRect(setmax, (byte) 0);
        getinsetdodgerect.getMin();
        this.setMin = getinsetdodgerect;
    }

    public void showTextViewSkeleton() {
        getInsetDodgeRect.setMax setmax = new getInsetDodgeRect.setMax(this.tvDetailProfileUserService);
        setmax.getMax = R.layout.view_subtitle_me_page_skeleton;
        setmax.isInside = 20;
        setmax.setMax = 1500;
        setmax.length = true;
        setmax.setMin = IntRange.setMax(setmax.getMin.getContext(), R.color.f24782131100433);
        getInsetDodgeRect getinsetdodgerect = new getInsetDodgeRect(setmax, (byte) 0);
        getinsetdodgerect.getMin();
        this.length = getinsetdodgerect;
    }

    public boolean isShowRedDot(String str, String str2) {
        if (getResources().getString(R.string.security_setting_question_state_off).equals(str2) || getResources().getString(R.string.security_setting_email_unset).equals(str2)) {
            return true;
        }
        return getResources().getString(R.string.change_name_non_kyc).equals(str) && str2.matches("\\d+");
    }
}
