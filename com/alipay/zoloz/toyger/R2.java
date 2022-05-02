package com.alipay.zoloz.toyger;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import com.alipay.mobile.security.bio.service.BioServiceManager;
import com.alipay.zoloz.config.ConfigCenter;
import com.ap.zoloz.hot.reload.ViewLoadService;
import id.dana.tracker.TrackerKey;

public class R2 {

    public static class integer {
    }

    public static class string {
        public static String zface_title() {
            ViewLoadService viewLoadService = R2.getViewLoadService();
            if (viewLoadService == null) {
                return "Scan Face";
            }
            return viewLoadService.getString("zface_title", R.string.zface_title);
        }

        public static String zface_no_face() {
            ViewLoadService viewLoadService = R2.getViewLoadService();
            if (viewLoadService == null) {
                return "No face detected";
            }
            return viewLoadService.getString("zface_no_face", R.string.zface_no_face);
        }

        public static String zface_distance_too_far() {
            ViewLoadService viewLoadService = R2.getViewLoadService();
            if (viewLoadService == null) {
                return "Please move closer to the camera";
            }
            return viewLoadService.getString("zface_distance_too_far", R.string.zface_distance_too_far);
        }

        public static String zface_distance_too_close() {
            ViewLoadService viewLoadService = R2.getViewLoadService();
            if (viewLoadService == null) {
                return "Please move further from the camera";
            }
            return viewLoadService.getString("zface_distance_too_close", R.string.zface_distance_too_close);
        }

        public static String zface_not_in_center() {
            ViewLoadService viewLoadService = R2.getViewLoadService();
            if (viewLoadService == null) {
                return "No face detected";
            }
            return viewLoadService.getString("zface_not_in_center", R.string.zface_not_in_center);
        }

        public static String zface_bad_pitch() {
            ViewLoadService viewLoadService = R2.getViewLoadService();
            if (viewLoadService == null) {
                return "No face detected";
            }
            return viewLoadService.getString("zface_bad_pitch", R.string.zface_bad_pitch);
        }

        public static String zface_bad_yaw() {
            ViewLoadService viewLoadService = R2.getViewLoadService();
            if (viewLoadService == null) {
                return "No face detected";
            }
            return viewLoadService.getString("zface_bad_yaw", R.string.zface_bad_yaw);
        }

        public static String zface_is_moving() {
            ViewLoadService viewLoadService = R2.getViewLoadService();
            if (viewLoadService == null) {
                return "Photo is unclear";
            }
            return viewLoadService.getString("zface_is_moving", R.string.zface_is_moving);
        }

        public static String zface_bad_brightness() {
            ViewLoadService viewLoadService = R2.getViewLoadService();
            if (viewLoadService == null) {
                return "Place is too dark";
            }
            return viewLoadService.getString("zface_bad_brightness", R.string.zface_bad_brightness);
        }

        public static String zface_bad_quality() {
            ViewLoadService viewLoadService = R2.getViewLoadService();
            if (viewLoadService == null) {
                return "No face detected";
            }
            return viewLoadService.getString("zface_bad_quality", R.string.zface_bad_quality);
        }

        public static String zface_bad_eye_openness() {
            ViewLoadService viewLoadService = R2.getViewLoadService();
            if (viewLoadService == null) {
                return "Open your eyes";
            }
            return viewLoadService.getString("zface_bad_eye_openness", R.string.zface_bad_eye_openness);
        }

        public static String zface_blink_openness() {
            ViewLoadService viewLoadService = R2.getViewLoadService();
            if (viewLoadService == null) {
                return "Please blink your eyes to prove you?re not a robot";
            }
            return viewLoadService.getString("zface_blink_openness", R.string.zface_blink_openness);
        }

        public static String zface_stack_time() {
            ViewLoadService viewLoadService = R2.getViewLoadService();
            if (viewLoadService == null) {
                return "Stay still";
            }
            return viewLoadService.getString("zface_stack_time", R.string.zface_stack_time);
        }

        public static String zface_processing() {
            ViewLoadService viewLoadService = R2.getViewLoadService();
            if (viewLoadService == null) {
                return "Processing...";
            }
            return viewLoadService.getString("zface_processing", R.string.zface_processing);
        }

        public static String zface_retry_max_title() {
            ViewLoadService viewLoadService = R2.getViewLoadService();
            if (viewLoadService == null) {
                return "Exceeded Limit";
            }
            return viewLoadService.getString("zface_retry_max_title", R.string.zface_retry_max_title);
        }

        public static String zface_retry_max_msg() {
            ViewLoadService viewLoadService = R2.getViewLoadService();
            if (viewLoadService == null) {
                return "You\\'ve exceeded the maximum number of attempts. Please try again later!";
            }
            return viewLoadService.getString("zface_retry_max_msg", R.string.zface_retry_max_msg);
        }

        public static String zface_retry_max_got_it() {
            ViewLoadService viewLoadService = R2.getViewLoadService();
            if (viewLoadService == null) {
                return "Got it!";
            }
            return viewLoadService.getString("zface_retry_max_got_it", R.string.zface_retry_max_got_it);
        }

        public static String zface_user_cancel_stay() {
            ViewLoadService viewLoadService = R2.getViewLoadService();
            if (viewLoadService == null) {
                return "Stay";
            }
            return viewLoadService.getString("zface_user_cancel_stay", R.string.zface_user_cancel_stay);
        }

        public static String zface_user_cancel_quit() {
            ViewLoadService viewLoadService = R2.getViewLoadService();
            if (viewLoadService == null) {
                return "Quit";
            }
            return viewLoadService.getString("zface_user_cancel_quit", R.string.zface_user_cancel_quit);
        }

        public static String zface_user_cancel_title() {
            ViewLoadService viewLoadService = R2.getViewLoadService();
            if (viewLoadService == null) {
                return "Are you sure want to quit?";
            }
            return viewLoadService.getString("zface_user_cancel_title", R.string.zface_user_cancel_title);
        }

        public static String zface_user_cancel_msg() {
            ViewLoadService viewLoadService = R2.getViewLoadService();
            if (viewLoadService == null) {
                return "You are almost done, stay to complete?";
            }
            return viewLoadService.getString("zface_user_cancel_msg", R.string.zface_user_cancel_msg);
        }

        public static String zface_camera_without_permission_title() {
            ViewLoadService viewLoadService = R2.getViewLoadService();
            if (viewLoadService == null) {
                return "\"TNG eWallet\" Would Like To Access Your Camera";
            }
            return viewLoadService.getString("zface_camera_without_permission_title", R.string.zface_camera_without_permission_title);
        }

        public static String zface_camera_without_permission_msg() {
            ViewLoadService viewLoadService = R2.getViewLoadService();
            if (viewLoadService == null) {
                return "This allows you to take photos in the app.";
            }
            return viewLoadService.getString("zface_camera_without_permission_msg", R.string.zface_camera_without_permission_msg);
        }

        public static String zface_camera_without_permission_go_settings() {
            ViewLoadService viewLoadService = R2.getViewLoadService();
            if (viewLoadService == null) {
                return "OK";
            }
            return viewLoadService.getString("zface_camera_without_permission_go_settings", R.string.zface_camera_without_permission_go_settings);
        }

        public static String zface_camera_without_permission_quit() {
            ViewLoadService viewLoadService = R2.getViewLoadService();
            if (viewLoadService == null) {
                return "Don\\'t allow";
            }
            return viewLoadService.getString("zface_camera_without_permission_quit", R.string.zface_camera_without_permission_quit);
        }

        public static String zface_time_out_title() {
            ViewLoadService viewLoadService = R2.getViewLoadService();
            if (viewLoadService == null) {
                return "Hey there, good lookin\\'!";
            }
            return viewLoadService.getString("zface_time_out_title", R.string.zface_time_out_title);
        }

        public static String zface_time_out_msg() {
            ViewLoadService viewLoadService = R2.getViewLoadService();
            if (viewLoadService == null) {
                return "Please position your face within the frame and ensure the place is well-lit.";
            }
            return viewLoadService.getString("zface_time_out_msg", R.string.zface_time_out_msg);
        }

        public static String zface_time_out_retry() {
            ViewLoadService viewLoadService = R2.getViewLoadService();
            if (viewLoadService == null) {
                return "Retry";
            }
            return viewLoadService.getString("zface_time_out_retry", R.string.zface_time_out_retry);
        }

        public static String zface_time_out_quit() {
            ViewLoadService viewLoadService = R2.getViewLoadService();
            if (viewLoadService == null) {
                return "Close";
            }
            return viewLoadService.getString("zface_time_out_quit", R.string.zface_time_out_quit);
        }

        public static String zface_scan_fail_title() {
            ViewLoadService viewLoadService = R2.getViewLoadService();
            if (viewLoadService == null) {
                return "Face Not Detected";
            }
            return viewLoadService.getString("zface_scan_fail_title", R.string.zface_scan_fail_title);
        }

        public static String zface_scan_fail_msg() {
            ViewLoadService viewLoadService = R2.getViewLoadService();
            if (viewLoadService == null) {
                return "Please position your face within the frame and ensure the place is well-lit.";
            }
            return viewLoadService.getString("zface_scan_fail_msg", R.string.zface_scan_fail_msg);
        }

        public static String zface_scan_fail_retry() {
            ViewLoadService viewLoadService = R2.getViewLoadService();
            if (viewLoadService == null) {
                return "Retry";
            }
            return viewLoadService.getString("zface_scan_fail_retry", R.string.zface_scan_fail_retry);
        }

        public static String zface_scan_fail_quit() {
            ViewLoadService viewLoadService = R2.getViewLoadService();
            if (viewLoadService == null) {
                return "Close";
            }
            return viewLoadService.getString("zface_scan_fail_quit", R.string.zface_scan_fail_quit);
        }

        public static String zface_interrupt_title() {
            ViewLoadService viewLoadService = R2.getViewLoadService();
            if (viewLoadService == null) {
                return "Action Interrupted";
            }
            return viewLoadService.getString("zface_interrupt_title", R.string.zface_interrupt_title);
        }

        public static String zface_interrupt_msg() {
            ViewLoadService viewLoadService = R2.getViewLoadService();
            if (viewLoadService == null) {
                return "Whoops, your action was interrupted. Please try again!";
            }
            return viewLoadService.getString("zface_interrupt_msg", R.string.zface_interrupt_msg);
        }

        public static String zface_interrupt_retry() {
            ViewLoadService viewLoadService = R2.getViewLoadService();
            if (viewLoadService == null) {
                return "Retry";
            }
            return viewLoadService.getString("zface_interrupt_retry", R.string.zface_interrupt_retry);
        }

        public static String zface_interrupt_close() {
            ViewLoadService viewLoadService = R2.getViewLoadService();
            if (viewLoadService == null) {
                return "Close";
            }
            return viewLoadService.getString("zface_interrupt_close", R.string.zface_interrupt_close);
        }

        public static String zface_camera_init_error_msg() {
            ViewLoadService viewLoadService = R2.getViewLoadService();
            if (viewLoadService == null) {
                return "This mobile phone may be broken, not supported for face authentication";
            }
            return viewLoadService.getString("zface_camera_init_error_msg", R.string.zface_camera_init_error_msg);
        }

        public static String zface_camera_init_error_got_it() {
            ViewLoadService viewLoadService = R2.getViewLoadService();
            if (viewLoadService == null) {
                return "Got it";
            }
            return viewLoadService.getString("zface_camera_init_error_got_it", R.string.zface_camera_init_error_got_it);
        }

        public static String zface_device_unsupport_msg() {
            ViewLoadService viewLoadService = R2.getViewLoadService();
            if (viewLoadService == null) {
                return "This mobile phone may be broken, not supported for face authentication";
            }
            return viewLoadService.getString("zface_device_unsupport_msg", R.string.zface_device_unsupport_msg);
        }

        public static String zface_device_unsupport_got_it() {
            ViewLoadService viewLoadService = R2.getViewLoadService();
            if (viewLoadService == null) {
                return "Got it";
            }
            return viewLoadService.getString("zface_device_unsupport_got_it", R.string.zface_device_unsupport_got_it);
        }

        public static String zface_zoloz_brand() {
            ViewLoadService viewLoadService = R2.getViewLoadService();
            if (viewLoadService == null) {
                return "Powered by ZOLOZ";
            }
            return viewLoadService.getString("zface_zoloz_brand", R.string.zface_zoloz_brand);
        }

        public static String zface_detect_dialog_first_login() {
            ViewLoadService viewLoadService = R2.getViewLoadService();
            if (viewLoadService == null) {
                return "For the first time use, please enable Face Scan";
            }
            return viewLoadService.getString("zface_detect_dialog_first_login", R.string.zface_detect_dialog_first_login);
        }

        public static String zface_detect_dialog_first_login_confirm() {
            ViewLoadService viewLoadService = R2.getViewLoadService();
            if (viewLoadService == null) {
                return "Enable";
            }
            return viewLoadService.getString("zface_detect_dialog_first_login_confirm", R.string.zface_detect_dialog_first_login_confirm);
        }

        public static String zface_detect_dialog_first_login_cancel() {
            ViewLoadService viewLoadService = R2.getViewLoadService();
            if (viewLoadService == null) {
                return TrackerKey.AppUpdateAction.APP_UPDATE_LATER;
            }
            return viewLoadService.getString("zface_detect_dialog_first_login_cancel", R.string.zface_detect_dialog_first_login_cancel);
        }

        public static String zface_head_up() {
            ViewLoadService viewLoadService = R2.getViewLoadService();
            if (viewLoadService == null) {
                return "Slowly raise your head";
            }
            return viewLoadService.getString("zface_head_up", R.string.zface_head_up);
        }

        public static String zface_head_up_right() {
            ViewLoadService viewLoadService = R2.getViewLoadService();
            if (viewLoadService == null) {
                return "Slowly turn to the top right";
            }
            return viewLoadService.getString("zface_head_up_right", R.string.zface_head_up_right);
        }

        public static String zface_head_right() {
            ViewLoadService viewLoadService = R2.getViewLoadService();
            if (viewLoadService == null) {
                return "Slowly turn right";
            }
            return viewLoadService.getString("zface_head_right", R.string.zface_head_right);
        }

        public static String zface_head_right_down() {
            ViewLoadService viewLoadService = R2.getViewLoadService();
            if (viewLoadService == null) {
                return "\"Slowly turn to the bottom right";
            }
            return viewLoadService.getString("zface_head_right_down", R.string.zface_head_right_down);
        }

        public static String zface_head_down() {
            ViewLoadService viewLoadService = R2.getViewLoadService();
            if (viewLoadService == null) {
                return "Slowly nod your head";
            }
            return viewLoadService.getString("zface_head_down", R.string.zface_head_down);
        }

        public static String zface_head_down_left() {
            ViewLoadService viewLoadService = R2.getViewLoadService();
            if (viewLoadService == null) {
                return "Slowly turn to the bottom left";
            }
            return viewLoadService.getString("zface_head_down_left", R.string.zface_head_down_left);
        }

        public static String zface_head_left() {
            ViewLoadService viewLoadService = R2.getViewLoadService();
            if (viewLoadService == null) {
                return "Slowly turn left";
            }
            return viewLoadService.getString("zface_head_left", R.string.zface_head_left);
        }

        public static String zface_head_left_up() {
            ViewLoadService viewLoadService = R2.getViewLoadService();
            if (viewLoadService == null) {
                return "Slowly turn to the top left";
            }
            return viewLoadService.getString("zface_head_left_up", R.string.zface_head_left_up);
        }

        public static String zface_mouth_open() {
            ViewLoadService viewLoadService = R2.getViewLoadService();
            if (viewLoadService == null) {
                return "Open your mouth";
            }
            return viewLoadService.getString("zface_mouth_open", R.string.zface_mouth_open);
        }
    }

    public static class color {
        public static int zface_title_text_color() {
            ViewLoadService viewLoadService = R2.getViewLoadService();
            if (viewLoadService == null) {
                return -1;
            }
            return viewLoadService.getColor("zface_title_text_color", R.color.zface_title_text_color);
        }

        public static int zface_top_tip_color() {
            ViewLoadService viewLoadService = R2.getViewLoadService();
            if (viewLoadService == null) {
                return -12153115;
            }
            return viewLoadService.getColor("zface_top_tip_color", R.color.zface_top_tip_color);
        }

        public static int zface_progress_start_color() {
            ViewLoadService viewLoadService = R2.getViewLoadService();
            if (viewLoadService == null) {
                return -3873284;
            }
            return viewLoadService.getColor("zface_progress_start_color", R.color.zface_progress_start_color);
        }

        public static int zface_progress_end_color() {
            ViewLoadService viewLoadService = R2.getViewLoadService();
            if (viewLoadService == null) {
                return -15692055;
            }
            return viewLoadService.getColor("zface_progress_end_color", R.color.zface_progress_end_color);
        }

        public static int zface_progress_bg_color() {
            ViewLoadService viewLoadService = R2.getViewLoadService();
            if (viewLoadService == null) {
                return -2103573;
            }
            return viewLoadService.getColor("zface_progress_bg_color", R.color.zface_progress_bg_color);
        }
    }

    public static class bool {
        public static boolean zface_page_can_click_back() {
            ViewLoadService viewLoadService = R2.getViewLoadService();
            if (viewLoadService == null) {
                return true;
            }
            return viewLoadService.getBool("zface_page_can_click_back", R.bool.zface_page_can_click_back);
        }
    }

    public static class drawable {
        public static GradientDrawable zface_titlebar_bg_without_line() {
            Context applicationContext = ConfigCenter.getInstance().getApplicationContext();
            GradientDrawable gradientDrawable = new GradientDrawable();
            if (applicationContext == null) {
            }
            return gradientDrawable;
        }
    }

    public static ViewLoadService getViewLoadService() {
        if (BioServiceManager.getCurrentInstance() != null) {
            return (ViewLoadService) BioServiceManager.getCurrentInstance().getBioService(ViewLoadService.class);
        }
        if (ConfigCenter.getInstance().getApplicationContext() == null) {
            return null;
        }
        return (ViewLoadService) BioServiceManager.getLocalService(ConfigCenter.getInstance().getApplicationContext(), ViewLoadService.class);
    }
}
