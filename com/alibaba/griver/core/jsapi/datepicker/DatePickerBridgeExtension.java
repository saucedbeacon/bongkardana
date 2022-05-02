package com.alibaba.griver.core.jsapi.datepicker;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.text.TextUtils;
import android.widget.DatePicker;
import android.widget.TimePicker;
import androidx.annotation.Keep;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingApiContext;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingCallback;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingParam;
import com.alibaba.ariver.engine.api.bridge.model.ApiContext;
import com.alibaba.ariver.kernel.api.annotation.ActionFilter;
import com.alibaba.ariver.kernel.api.annotation.ThreadType;
import com.alibaba.ariver.kernel.api.extension.bridge.BridgeExtension;
import com.alibaba.ariver.kernel.api.security.Permission;
import com.alibaba.ariver.kernel.common.service.executor.ExecutorType;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.griver.core.R;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import o.AppNode;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

@Keep
public class DatePickerBridgeExtension implements BridgeExtension {
    private static final int HOUR_MINUTE = 0;
    private static final String TAG = "AriverAPI:DatePickerBridgeExtension";
    private static final int YEAR = 4;
    private static final int YEAR_MONTH = 3;
    private static final int YEAR_MONTH_DAY = 1;
    private static final int YEAR_MONTH_DAY_HOUR_MINUTE = 2;

    public void onFinalized() {
    }

    public void onInitialized() {
    }

    public Permission permit() {
        return null;
    }

    @ThreadType(ExecutorType.UI)
    @ActionFilter
    public void datePicker(@BindingApiContext(required = true) ApiContext apiContext, @BindingParam({"mode"}) int i, @BindingParam({"minDate"}) String str, @BindingParam({"maxDate"}) String str2, @BindingParam({"beginDate"}) String str3, @BindingParam({"isIDCard"}) boolean z, @BindingCallback BridgeCallback bridgeCallback) {
        int i2 = i;
        String str4 = i2 == 0 ? "HH:mm:ss" : i2 == 1 ? "yyyy-MM-dd" : i2 == 2 ? "yyyy-MM-dd HH:mm:ss" : i2 == 3 ? "yyyy-MM" : i2 == 4 ? "yyyy" : null;
        String str5 = str;
        Calendar parseDate = parseDate(str, str4);
        Calendar parseDate2 = parseDate(str2, str4);
        if (parseDate == null || parseDate2 == null || parseDate.getTimeInMillis() <= parseDate2.getTimeInMillis()) {
            BridgeCallback bridgeCallback2 = bridgeCallback;
            Calendar parseDate3 = parseDate(str3, str4);
            if (parseDate3 == null) {
                parseDate3 = Calendar.getInstance();
            }
            JSONObject jSONObject = new JSONObject();
            if (i2 == 0) {
                showTimeDialog(apiContext, parseDate3, parseDate, parseDate2, bridgeCallback, z, jSONObject);
            } else {
                showDateDialog(apiContext, parseDate3, parseDate, parseDate2, z, i2 == 2, bridgeCallback, jSONObject, i);
            }
        } else {
            RVLogger.e(TAG, "min date should less than max date!");
            bridgeCallback.sendBridgeResponse(new BridgeResponse.Error(2, "min date should less than max date!"));
        }
    }

    private void showDateDialog(ApiContext apiContext, Calendar calendar, Calendar calendar2, Calendar calendar3, boolean z, boolean z2, BridgeCallback bridgeCallback, JSONObject jSONObject, int i) {
        DatePickerDialog datePickerDialog;
        Calendar calendar4 = calendar;
        final BridgeCallback bridgeCallback2 = bridgeCallback;
        int i2 = i;
        Activity activity = apiContext.getActivity();
        if (activity != null && !activity.isFinishing()) {
            final Calendar calendar5 = calendar2;
            final Calendar calendar6 = calendar3;
            final boolean z3 = z2;
            final JSONObject jSONObject2 = jSONObject;
            final ApiContext apiContext2 = apiContext;
            final Calendar calendar7 = calendar;
            final BridgeCallback bridgeCallback3 = bridgeCallback;
            final boolean z4 = z;
            final int i3 = i;
            AnonymousClass1 r1 = new DatePickerDialog.OnDateSetListener() {
                public void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
                    StringBuilder sb;
                    Calendar calendar;
                    int max = dispatchOnCancelled.setMax(i);
                    if (i != max) {
                        onCanceled oncanceled = new onCanceled(i, max, 1);
                        onCancelLoad.setMax(992946593, oncanceled);
                        onCancelLoad.getMin(992946593, oncanceled);
                    }
                    if (!(calendar5 == null || (calendar = calendar6) == null)) {
                        if (calendar.get(1) <= i) {
                            i = calendar6.get(1);
                        } else if (calendar5.get(1) >= i) {
                            i = calendar5.get(1);
                        }
                    }
                    int i4 = i2 + 1;
                    if (i4 >= 10) {
                        sb = new StringBuilder("");
                    }
                    sb.append(i4);
                    String obj = sb.toString();
                    String concat = i3 < 10 ? "0".concat(String.valueOf(i3)) : "".concat(String.valueOf(i3));
                    if (z3) {
                        JSONObject jSONObject = jSONObject2;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(i);
                        sb2.append("/");
                        sb2.append(obj);
                        sb2.append("/");
                        sb2.append(concat);
                        sb2.append(" ");
                        jSONObject.put(AppNode.AnonymousClass2.KEY_DATE, (Object) sb2.toString());
                        DatePickerBridgeExtension.this.showTimeDialog(apiContext2, calendar7, calendar5, calendar6, bridgeCallback3, z4, jSONObject2);
                        return;
                    }
                    int i5 = i3;
                    if (i5 == 4) {
                        jSONObject2.put(AppNode.AnonymousClass2.KEY_DATE, (Object) String.valueOf(i));
                    } else if (i5 == 3) {
                        JSONObject jSONObject2 = jSONObject2;
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(i);
                        sb3.append("/");
                        sb3.append(obj);
                        jSONObject2.put(AppNode.AnonymousClass2.KEY_DATE, (Object) sb3.toString());
                    } else {
                        JSONObject jSONObject3 = jSONObject2;
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(i);
                        sb4.append("/");
                        sb4.append(obj);
                        sb4.append("/");
                        sb4.append(concat);
                        jSONObject3.put(AppNode.AnonymousClass2.KEY_DATE, (Object) sb4.toString());
                    }
                    bridgeCallback3.sendJSONResponse(jSONObject2);
                }
            };
            new DatePickerDialog(activity, r1, calendar4.get(1), calendar4.get(2), calendar4.get(5)) {
                /* access modifiers changed from: protected */
                public void onStop() {
                }
            };
            DatePickerDialog datePickerDialog2 = datePickerDialog;
            datePickerDialog2.setTitle(apiContext.getActivity().getResources().getString(R.string.griver_core_jsapi_choosedate));
            datePickerDialog2.setCancelable(false);
            datePickerDialog2.setButton(-2, apiContext.getActivity().getResources().getString(R.string.griver_base_cancel), new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                    bridgeCallback2.sendBridgeResponse(BridgeResponse.newError(11, "User canceled"));
                    dialogInterface.dismiss();
                }
            });
            if (z) {
                final ApiContext apiContext3 = apiContext;
                final JSONObject jSONObject3 = jSONObject;
                datePickerDialog2.setButton(-3, apiContext.getActivity().getResources().getString(R.string.griver_core_jsapi_datevalid), new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialogInterface, int i) {
                        jSONObject3.put(AppNode.AnonymousClass2.KEY_DATE, (Object) apiContext3.getActivity().getResources().getString(R.string.griver_core_jsapi_date_longterm));
                        bridgeCallback2.sendJSONResponse(jSONObject3);
                        dialogInterface.dismiss();
                    }
                });
            }
            try {
                DatePicker datePicker = datePickerDialog2.getDatePicker();
                if (calendar2 != null) {
                    datePicker.setMinDate(calendar2.getTimeInMillis());
                }
                if (calendar3 != null) {
                    datePicker.setMaxDate(calendar3.getTimeInMillis());
                }
            } catch (Throwable th) {
                RVLogger.e(TAG, "set min or max date exception.", th);
            }
            try {
                DatePicker datePicker2 = datePickerDialog2.getDatePicker();
                if (i2 == 3) {
                    datePicker2.findViewById(Resources.getSystem().getIdentifier("day", "id", "android")).setVisibility(8);
                } else if (i2 == 4) {
                    datePicker2.findViewById(Resources.getSystem().getIdentifier("day", "id", "android")).setVisibility(8);
                    datePicker2.findViewById(Resources.getSystem().getIdentifier("month", "id", "android")).setVisibility(8);
                }
            } catch (Exception e) {
                RVLogger.e(TAG, "set date mode exception", e);
            }
            try {
                datePickerDialog2.show();
            } catch (Exception e2) {
                RVLogger.e(TAG, "show date dialog exception.", e2);
            }
        }
    }

    /* access modifiers changed from: private */
    public void showTimeDialog(ApiContext apiContext, Calendar calendar, Calendar calendar2, Calendar calendar3, BridgeCallback bridgeCallback, boolean z, JSONObject jSONObject) {
        Calendar calendar4 = calendar;
        final BridgeCallback bridgeCallback2 = bridgeCallback;
        Activity activity = apiContext.getActivity();
        if (activity != null && !activity.isFinishing()) {
            final Resources resources = activity.getResources();
            final JSONObject jSONObject2 = jSONObject;
            final BridgeCallback bridgeCallback3 = bridgeCallback;
            final Calendar calendar5 = calendar2;
            final Calendar calendar6 = calendar3;
            AnonymousClass5 r1 = new TimePickerDialog.OnTimeSetListener() {
                public void onTimeSet(TimePicker timePicker, int i, int i2) {
                    StringBuilder sb;
                    BridgeCallback bridgeCallback;
                    BridgeCallback bridgeCallback2;
                    String string = jSONObject2.getString(AppNode.AnonymousClass2.KEY_DATE);
                    if (TextUtils.isEmpty(string)) {
                        string = "";
                    }
                    StringBuilder sb2 = new StringBuilder(string);
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(i);
                    sb3.append(":");
                    sb3.append(i2);
                    sb3.append(":00");
                    sb2.append(sb3.toString());
                    Calendar access$100 = DatePickerBridgeExtension.this.parseDate(sb2.toString(), TextUtils.isEmpty(string) ? "HH:mm:ss" : "yyyy/MM/dd HH:mm:ss");
                    if (access$100 != null || (bridgeCallback2 = bridgeCallback3) == null) {
                        Calendar calendar = calendar5;
                        if (calendar != null && calendar.getTimeInMillis() > access$100.getTimeInMillis()) {
                            RVLogger.d(DatePickerBridgeExtension.TAG, "set selected date as min date");
                            access$100 = calendar5;
                        }
                        Calendar calendar2 = calendar6;
                        if (calendar2 != null && calendar2.getTimeInMillis() < access$100.getTimeInMillis()) {
                            RVLogger.d(DatePickerBridgeExtension.TAG, "set selected date as max date");
                            access$100 = calendar6;
                        }
                        if (access$100 != null || (bridgeCallback = bridgeCallback3) == null) {
                            StringBuilder sb4 = new StringBuilder();
                            if (!TextUtils.isEmpty(string)) {
                                int i3 = access$100.get(1);
                                int i4 = access$100.get(2);
                                int i5 = access$100.get(5);
                                int i6 = i4 + 1;
                                if (i6 >= 10) {
                                    sb = new StringBuilder("");
                                }
                                sb.append(i6);
                                String obj = sb.toString();
                                String valueOf = String.valueOf(i5);
                                String concat = i5 < 10 ? "0".concat(valueOf) : "".concat(valueOf);
                                StringBuilder sb5 = new StringBuilder();
                                sb5.append(i3);
                                sb5.append("/");
                                sb5.append(obj);
                                sb5.append("/");
                                sb5.append(concat);
                                sb5.append(" ");
                                sb4.append(sb5.toString());
                            }
                            int i7 = access$100.get(11);
                            int i8 = access$100.get(12);
                            String concat2 = i7 < 10 ? "0".concat(String.valueOf(i7)) : "".concat(String.valueOf(i7));
                            String concat3 = i8 < 10 ? "0".concat(String.valueOf(i8)) : "".concat(String.valueOf(i8));
                            StringBuilder sb6 = new StringBuilder();
                            sb6.append(concat2);
                            sb6.append(":");
                            sb6.append(concat3);
                            sb6.append(":00");
                            sb4.append(sb6.toString());
                            jSONObject2.put(AppNode.AnonymousClass2.KEY_DATE, (Object) sb4.toString());
                            RVLogger.e(DatePickerBridgeExtension.TAG, sb2.toString());
                            bridgeCallback3.sendJSONResponse(jSONObject2);
                            return;
                        }
                        bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
                        return;
                    }
                    bridgeCallback2.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
                }
            };
            AnonymousClass6 r12 = new TimePickerDialog(activity, r1, calendar.get(11), calendar.get(12), true) {
                /* access modifiers changed from: protected */
                public void onStop() {
                }
            };
            r12.setTitle(resources.getString(R.string.griver_core_jsapi_choosetime));
            r12.setCancelable(false);
            r12.setButton(-2, resources.getString(R.string.griver_base_cancel), new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                    bridgeCallback2.sendBridgeResponse(BridgeResponse.newError(11, "Cancel"));
                    dialogInterface.dismiss();
                }
            });
            if (z) {
                final JSONObject jSONObject3 = jSONObject;
                r12.setButton(-3, resources.getString(R.string.griver_core_jsapi_datevalid), new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialogInterface, int i) {
                        jSONObject3.put(AppNode.AnonymousClass2.KEY_DATE, (Object) resources.getString(R.string.griver_core_jsapi_date_longterm));
                        bridgeCallback2.sendJSONResponse(jSONObject3);
                        dialogInterface.dismiss();
                    }
                });
            }
            try {
                r12.show();
            } catch (Exception e) {
                RVLogger.e(TAG, "show time dialog exception.", e);
            }
        }
    }

    /* access modifiers changed from: private */
    public Calendar parseDate(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str2);
            Calendar instance = Calendar.getInstance();
            try {
                instance.setTime(simpleDateFormat.parse(str));
                return instance;
            } catch (ParseException e) {
                RVLogger.e(TAG, "exception detail", e);
            }
        }
        return null;
    }
}
