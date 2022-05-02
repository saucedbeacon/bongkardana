package zoloz.ap.com.toolkit;

import android.graphics.drawable.Drawable;
import com.alipay.mobile.security.bio.service.BioServiceManager;
import com.alipay.zoloz.config.ConfigCenter;
import com.ap.zoloz.hot.reload.ViewLoadService;

public class R2 {

    public static class string {
        public static String title_back() {
            ViewLoadService viewLoadService = R2.getViewLoadService();
            if (viewLoadService == null) {
                return "";
            }
            return viewLoadService.getString("title_back", R.string.title_back);
        }

        public static String btn_exit() {
            ViewLoadService viewLoadService = R2.getViewLoadService();
            if (viewLoadService == null) {
                return "Close";
            }
            return viewLoadService.getString("btn_exit", R.string.btn_exit);
        }

        public static String btn_retry() {
            ViewLoadService viewLoadService = R2.getViewLoadService();
            if (viewLoadService == null) {
                return "Retry";
            }
            return viewLoadService.getString("btn_retry", R.string.btn_retry);
        }

        public static String alert_timeout_error_title() {
            ViewLoadService viewLoadService = R2.getViewLoadService();
            if (viewLoadService == null) {
                return "Hey there, good lookin\\'!";
            }
            return viewLoadService.getString("alert_timeout_error_title", R.string.alert_timeout_error_title);
        }

        public static String system_error_title() {
            ViewLoadService viewLoadService = R2.getViewLoadService();
            if (viewLoadService == null) {
                return "Yikes, something\\'s wrong!";
            }
            return viewLoadService.getString("system_error_title", R.string.system_error_title);
        }

        public static String system_error_msg() {
            ViewLoadService viewLoadService = R2.getViewLoadService();
            if (viewLoadService == null) {
                return "Hang on, we are working on this. Please try again later!";
            }
            return viewLoadService.getString("system_error_msg", R.string.system_error_msg);
        }

        public static String system_error_got_it() {
            ViewLoadService viewLoadService = R2.getViewLoadService();
            if (viewLoadService == null) {
                return "OK";
            }
            return viewLoadService.getString("system_error_got_it", R.string.system_error_got_it);
        }

        public static String network_error_title() {
            ViewLoadService viewLoadService = R2.getViewLoadService();
            if (viewLoadService == null) {
                return "Connection Lost";
            }
            return viewLoadService.getString("network_error_title", R.string.network_error_title);
        }

        public static String network_error_msg() {
            ViewLoadService viewLoadService = R2.getViewLoadService();
            if (viewLoadService == null) {
                return "Whoopsies, please check your Internet connection and try again.";
            }
            return viewLoadService.getString("network_error_msg", R.string.network_error_msg);
        }

        public static String network_error_retry() {
            ViewLoadService viewLoadService = R2.getViewLoadService();
            if (viewLoadService == null) {
                return "Retry";
            }
            return viewLoadService.getString("network_error_retry", R.string.network_error_retry);
        }

        public static String network_error_exit() {
            ViewLoadService viewLoadService = R2.getViewLoadService();
            if (viewLoadService == null) {
                return "Close";
            }
            return viewLoadService.getString("network_error_exit", R.string.network_error_exit);
        }
    }

    public static class color {
        public static int titlebar_color() {
            ViewLoadService viewLoadService = R2.getViewLoadService();
            if (viewLoadService == null) {
                return -15658428;
            }
            return viewLoadService.getColor("titlebar_color", R.color.titlebar_color);
        }

        public static int z_white() {
            ViewLoadService viewLoadService = R2.getViewLoadService();
            if (viewLoadService == null) {
                return -1;
            }
            return viewLoadService.getColor("z_white", R.color.z_white);
        }

        public static int z_grey_3() {
            ViewLoadService viewLoadService = R2.getViewLoadService();
            if (viewLoadService == null) {
                return -10987432;
            }
            return viewLoadService.getColor("z_grey_3", R.color.z_grey_3);
        }

        public static int brand_text_color() {
            ViewLoadService viewLoadService = R2.getViewLoadService();
            if (viewLoadService == null) {
                return -5592406;
            }
            return viewLoadService.getColor("brand_text_color", R.color.brand_text_color);
        }

        public static int title_color() {
            ViewLoadService viewLoadService = R2.getViewLoadService();
            if (viewLoadService == null) {
                return -1;
            }
            return viewLoadService.getColor("title_color", R.color.title_color);
        }

        public static int title_back_color() {
            ViewLoadService viewLoadService = R2.getViewLoadService();
            if (viewLoadService == null) {
                return -1;
            }
            return viewLoadService.getColor("title_back_color", R.color.title_back_color);
        }

        public static int dialog_title() {
            ViewLoadService viewLoadService = R2.getViewLoadService();
            if (viewLoadService == null) {
                return -16777216;
            }
            return viewLoadService.getColor("dialog_title", R.color.dialog_title);
        }

        public static int dialog_message() {
            ViewLoadService viewLoadService = R2.getViewLoadService();
            if (viewLoadService == null) {
                return -7829368;
            }
            return viewLoadService.getColor("dialog_message", R.color.dialog_message);
        }

        public static int dialog_cancel() {
            ViewLoadService viewLoadService = R2.getViewLoadService();
            if (viewLoadService == null) {
                return -7829368;
            }
            return viewLoadService.getColor("dialog_cancel", R.color.dialog_cancel);
        }

        public static int dialog_ok() {
            ViewLoadService viewLoadService = R2.getViewLoadService();
            if (viewLoadService == null) {
                return -7829368;
            }
            return viewLoadService.getColor("dialog_ok", R.color.dialog_ok);
        }

        public static int titlebar_start_color() {
            ViewLoadService viewLoadService = R2.getViewLoadService();
            if (viewLoadService == null) {
                return titlebar_color();
            }
            return viewLoadService.getColor("titlebar_start_color", R.color.titlebar_start_color);
        }

        public static int titlebar_end_color() {
            ViewLoadService viewLoadService = R2.getViewLoadService();
            if (viewLoadService == null) {
                return titlebar_color();
            }
            return viewLoadService.getColor("titlebar_end_color", R.color.titlebar_end_color);
        }

        public static int titlebar_split_line_color() {
            ViewLoadService viewLoadService = R2.getViewLoadService();
            if (viewLoadService == null) {
                return -1842205;
            }
            return viewLoadService.getColor("titlebar_split_line_color", R.color.titlebar_split_line_color);
        }
    }

    public static class bool {
        public static boolean title_bar_title_center_horizontal() {
            ViewLoadService viewLoadService = R2.getViewLoadService();
            if (viewLoadService == null) {
                return false;
            }
            return viewLoadService.getBool("title_bar_title_center_horizontal", R.bool.title_bar_title_center_horizontal);
        }

        public static boolean title_bar_left() {
            ViewLoadService viewLoadService = R2.getViewLoadService();
            if (viewLoadService == null) {
                return true;
            }
            return viewLoadService.getBool("title_bar_left", R.bool.title_bar_left);
        }

        public static boolean title_bar_with_line() {
            ViewLoadService viewLoadService = R2.getViewLoadService();
            if (viewLoadService == null) {
                return true;
            }
            return viewLoadService.getBool("title_bar_with_line", R.bool.title_bar_with_line);
        }

        public static boolean show_exit_dialog() {
            ViewLoadService viewLoadService = R2.getViewLoadService();
            if (viewLoadService == null) {
                return true;
            }
            return viewLoadService.getBool("show_exit_dialog", R.bool.show_exit_dialog);
        }
    }

    public static class integer {
        public static int titlebar_bg_angle() {
            ViewLoadService viewLoadService = R2.getViewLoadService();
            if (viewLoadService == null) {
                return 0;
            }
            return viewLoadService.getInteger("titlebar_bg_angle", R.integer.titlebar_bg_angle);
        }
    }

    public static class drawable {
        public static Drawable separate() {
            ViewLoadService viewLoadService = R2.getViewLoadService();
            if (viewLoadService == null) {
                return null;
            }
            return viewLoadService.getDrawable("separate", R.drawable.separate);
        }

        public static Drawable bar_line() {
            ViewLoadService viewLoadService = R2.getViewLoadService();
            if (viewLoadService == null) {
                return null;
            }
            return viewLoadService.getDrawable("bar_line", R.drawable.bar_line);
        }

        public static Drawable icon_success() {
            ViewLoadService viewLoadService = R2.getViewLoadService();
            if (viewLoadService == null) {
                return null;
            }
            return viewLoadService.getDrawable("icon_success", R.drawable.icon_success);
        }

        public static Drawable title_bar_back() {
            ViewLoadService viewLoadService = R2.getViewLoadService();
            if (viewLoadService == null) {
                return null;
            }
            return viewLoadService.getDrawable("title_bar_back", R.drawable.title_bar_back);
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
