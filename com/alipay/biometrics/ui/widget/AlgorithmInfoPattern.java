package com.alipay.biometrics.ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.alipay.android.phone.mobilecommon.biometric.bio.R;
import com.alipay.mobile.security.bio.utils.DeviceUtil;

public class AlgorithmInfoPattern extends RelativeLayout {
    private TextView mTxtCode = null;
    private TextView mTxtDistance = null;
    private TextView mTxtFaceID = null;
    private TextView mTxtFaceLight = null;
    private TextView mTxtFacePitch = null;
    private TextView mTxtFaceQuality = null;
    private TextView mTxtFaceYaw = null;
    private TextView mTxtGaussian = null;
    private TextView mTxtHasFace = null;
    private TextView mTxtIntegrity = null;
    private TextView mTxtLeftEyeOcclusion = null;
    private TextView mTxtLiveScore = null;
    private TextView mTxtMotion = null;
    private TextView mTxtRectWidth = null;
    private TextView mTxtRightEyeOcclusion = null;
    private TextView mTxtVersionName = null;

    public AlgorithmInfoPattern(Context context) {
        super(context);
        initViews();
    }

    public AlgorithmInfoPattern(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        initViews();
    }

    public AlgorithmInfoPattern(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        initViews();
    }

    private void initViews() {
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.bio_algorithm_info, this, true);
        this.mTxtHasFace = (TextView) inflate.findViewById(R.id.face_circle_has_face);
        this.mTxtFaceID = (TextView) inflate.findViewById(R.id.face_circle_face_id);
        this.mTxtFaceQuality = (TextView) inflate.findViewById(R.id.face_circle_face_quality);
        this.mTxtLiveScore = (TextView) inflate.findViewById(R.id.face_circle_face_live_score);
        this.mTxtFaceLight = (TextView) inflate.findViewById(R.id.face_circle_face_light);
        this.mTxtFacePitch = (TextView) inflate.findViewById(R.id.face_circle_face_pitch);
        this.mTxtFaceYaw = (TextView) inflate.findViewById(R.id.face_circle_face_yaw);
        this.mTxtGaussian = (TextView) findViewById(R.id.face_circle_face_gaussian);
        this.mTxtMotion = (TextView) findViewById(R.id.face_circle_face_motion);
        this.mTxtIntegrity = (TextView) findViewById(R.id.face_circle_face_integrity);
        this.mTxtLeftEyeOcclusion = (TextView) findViewById(R.id.face_circle_face_left_eye_occlusion);
        this.mTxtRightEyeOcclusion = (TextView) findViewById(R.id.face_circle_face_right_eye_occlusion);
        this.mTxtDistance = (TextView) findViewById(R.id.face_circle_face_distance);
        this.mTxtRectWidth = (TextView) findViewById(R.id.face_circle_face_rectWidth);
        this.mTxtVersionName = (TextView) findViewById(R.id.smile_version_name);
        this.mTxtCode = (TextView) findViewById(R.id.smile_machine_code);
        this.mTxtVersionName.setText(DeviceUtil.getVersionName(getContext()));
        this.mTxtCode.setText(DeviceUtil.getUtdid(getContext()));
    }

    public void showInfo(AlgorithmInfo algorithmInfo) {
        if (algorithmInfo == null || !algorithmInfo.isHasFace()) {
            this.mTxtHasFace.setText("false");
            this.mTxtFaceID.setText("-1");
            this.mTxtFaceQuality.setText("0");
            this.mTxtLiveScore.setText("0");
            this.mTxtFaceLight.setText("0");
            this.mTxtFacePitch.setText("0");
            this.mTxtFaceYaw.setText("0");
            this.mTxtGaussian.setText("0");
            this.mTxtMotion.setText("0");
            this.mTxtIntegrity.setText("0");
            this.mTxtLeftEyeOcclusion.setText("0");
            this.mTxtRightEyeOcclusion.setText("0");
            this.mTxtDistance.setText("0");
            this.mTxtRectWidth.setText("0");
            return;
        }
        TextView textView = this.mTxtHasFace;
        StringBuilder sb = new StringBuilder("");
        sb.append(algorithmInfo.isHasFace());
        textView.setText(sb.toString());
        TextView textView2 = this.mTxtFaceID;
        StringBuilder sb2 = new StringBuilder("");
        sb2.append(algorithmInfo.getFaceId());
        textView2.setText(sb2.toString());
        TextView textView3 = this.mTxtFaceQuality;
        StringBuilder sb3 = new StringBuilder("");
        sb3.append(algorithmInfo.getQuality());
        textView3.setText(sb3.toString());
        TextView textView4 = this.mTxtFaceLight;
        StringBuilder sb4 = new StringBuilder("");
        sb4.append(algorithmInfo.getBrightness());
        textView4.setText(sb4.toString());
        TextView textView5 = this.mTxtFacePitch;
        StringBuilder sb5 = new StringBuilder("");
        sb5.append(algorithmInfo.getPitch());
        textView5.setText(sb5.toString());
        TextView textView6 = this.mTxtFaceYaw;
        StringBuilder sb6 = new StringBuilder("");
        sb6.append(algorithmInfo.getYaw());
        textView6.setText(sb6.toString());
        TextView textView7 = this.mTxtGaussian;
        StringBuilder sb7 = new StringBuilder("");
        sb7.append(algorithmInfo.getGaussian());
        textView7.setText(sb7.toString());
        TextView textView8 = this.mTxtMotion;
        StringBuilder sb8 = new StringBuilder("");
        sb8.append(algorithmInfo.getMotion());
        textView8.setText(sb8.toString());
        TextView textView9 = this.mTxtIntegrity;
        StringBuilder sb9 = new StringBuilder("");
        sb9.append(algorithmInfo.getIntegrity());
        textView9.setText(sb9.toString());
        TextView textView10 = this.mTxtLeftEyeOcclusion;
        StringBuilder sb10 = new StringBuilder("");
        sb10.append(algorithmInfo.getLeftEyeBlinkRatio());
        textView10.setText(sb10.toString());
        TextView textView11 = this.mTxtRightEyeOcclusion;
        StringBuilder sb11 = new StringBuilder("");
        sb11.append(algorithmInfo.getRightEyeBlinkRatio());
        textView11.setText(sb11.toString());
        TextView textView12 = this.mTxtDistance;
        StringBuilder sb12 = new StringBuilder("");
        sb12.append(algorithmInfo.getDistance());
        textView12.setText(sb12.toString());
        TextView textView13 = this.mTxtLiveScore;
        StringBuilder sb13 = new StringBuilder("");
        sb13.append(algorithmInfo.getDeepLiveness());
        textView13.setText(sb13.toString());
    }
}
