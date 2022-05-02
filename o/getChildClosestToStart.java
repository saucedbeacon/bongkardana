package o;

import android.os.Process;
import java.lang.Thread;
import o.convertFocusDirectionToLayoutDirection;
import org.json.JSONException;
import org.json.JSONObject;

public class getChildClosestToStart implements Thread.UncaughtExceptionHandler {
    private static getChildClosestToStart setMin;
    private final Thread.UncaughtExceptionHandler getMax = Thread.getDefaultUncaughtExceptionHandler();

    public getChildClosestToStart() {
        Thread.setDefaultUncaughtExceptionHandler(this);
    }

    public static void setMax() {
        if (setMin == null) {
            synchronized (getChildClosestToStart.class) {
                if (setMin == null) {
                    setMin = new getChildClosestToStart();
                }
            }
        }
    }

    public void uncaughtException(Thread thread, final Throwable th) {
        convertFocusDirectionToLayoutDirection.getMax((convertFocusDirectionToLayoutDirection.length) new convertFocusDirectionToLayoutDirection.length() {
            public final void getMin(convertFocusDirectionToLayoutDirection convertfocusdirectiontolayoutdirection) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("$ae_crashed_reason", th.toString());
                    convertfocusdirectiontolayoutdirection.getMax("$ae_crashed", jSONObject, true);
                } catch (JSONException unused) {
                }
            }
        });
        convertFocusDirectionToLayoutDirection.getMax((convertFocusDirectionToLayoutDirection.length) new convertFocusDirectionToLayoutDirection.length() {
            public final void getMin(convertFocusDirectionToLayoutDirection convertfocusdirectiontolayoutdirection) {
                convertfocusdirectiontolayoutdirection.equals();
            }
        });
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.getMax;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
            return;
        }
        try {
            Thread.sleep(400);
        } catch (InterruptedException unused) {
        }
        Process.killProcess(Process.myPid());
        System.exit(10);
    }
}
