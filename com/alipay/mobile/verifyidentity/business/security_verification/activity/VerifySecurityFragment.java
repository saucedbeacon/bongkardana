package com.alipay.mobile.verifyidentity.business.security_verification.activity;

import android.app.DatePickerDialog;
import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.DigitsKeyListener;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import com.alibaba.wireless.security.SecExceptionCode;
import com.alipay.mobile.security.bio.api.BioError;
import com.alipay.mobile.verifyidentity.base.adapter.ListViewAdapter;
import com.alipay.mobile.verifyidentity.base.adapter.ViewHolder;
import com.alipay.mobile.verifyidentity.base.message.RequestConstants;
import com.alipay.mobile.verifyidentity.business.security_verification.R;
import com.alipay.mobile.verifyidentity.business.securitycommon.bean.QuestionItem;
import com.alipay.mobile.verifyidentity.business.securitycommon.bean.SecurityConstants;
import com.alipay.mobile.verifyidentity.business.securitycommon.widget.MultipleDialog;
import com.alipay.mobile.verifyidentity.business.securitycommon.widget.SinglePicker;
import com.alipay.mobile.verifyidentity.framework.engine.VIAction;
import com.alipay.mobile.verifyidentity.framework.engine.VIEngine;
import com.alipay.mobile.verifyidentity.framework.engine.VIResult;
import com.alipay.mobile.verifyidentity.uitools.CustomUi;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public class VerifySecurityFragment extends Fragment {
    private ArrayList<List<QuestionItem>> adapterList;
    /* access modifiers changed from: private */
    public String[] answerId;
    private TextView change_method;
    /* access modifiers changed from: private */
    public int default_seleted_index;
    private String foot_tip;
    private String from_title;
    private boolean has_others;
    InputFilter inputFilter = new InputFilter() {
        Pattern emoji = Pattern.compile("[🀀-🏿]|[🐀-🟿]|[☀-⟿]", 66);

        public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
            if (this.emoji.matcher(charSequence).find()) {
                return "";
            }
            return null;
        }
    };
    private ListView listView;
    public CommitCallBack mCommitCallBack;
    /* access modifiers changed from: private */
    public int mCurrentPosition;
    /* access modifiers changed from: private */
    public int page_number;
    /* access modifiers changed from: private */
    public int page_size;
    /* access modifiers changed from: private */
    public QuestionItem[] questionItemArr;
    private SecuritySetQuestionAdapter securitySetQuestionAdapter;
    private TextView tv_center;
    private TextView tv_confirm;
    /* access modifiers changed from: private */
    public String verifyId;
    private View viewGroup;

    public interface CommitCallBack {
        void commit(String[] strArr, QuestionItem[] questionItemArr, int i, int i2);

        void onVerifyResult(VIResult vIResult);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup2, Bundle bundle) {
        if (this.viewGroup == null) {
            this.viewGroup = layoutInflater.inflate(R.layout.fragment_verify_security, viewGroup2, false);
            init();
        }
        return this.viewGroup;
    }

    private void init() {
        this.verifyId = getArguments().getString("verifyId");
        initView();
        initData();
    }

    private void initView() {
        this.listView = (ListView) this.viewGroup.findViewById(R.id.listView);
        this.tv_center = (TextView) this.viewGroup.findViewById(R.id.tv_center);
        TextView textView = (TextView) this.viewGroup.findViewById(R.id.tv_confirm);
        this.tv_confirm = textView;
        textView.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (VerifySecurityFragment.this.isSeleteAll() && VerifySecurityFragment.this.mCommitCallBack != null) {
                    VerifySecurityFragment.this.mCommitCallBack.commit(VerifySecurityFragment.this.answerId, VerifySecurityFragment.this.questionItemArr, VerifySecurityFragment.this.page_size, VerifySecurityFragment.this.page_number);
                }
            }
        });
        TextView textView2 = (TextView) this.viewGroup.findViewById(R.id.change_method);
        this.change_method = textView2;
        textView2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                HashMap hashMap = new HashMap();
                hashMap.put("verifyType", "1");
                hashMap.put("module", RequestConstants.MENU);
                hashMap.put("verifyId", VerifySecurityFragment.this.verifyId);
                VIEngine.verify(VerifySecurityFragment.this.getActivity(), RequestConstants.VerifyProductVerify, RequestConstants.VerifyCallAllInsert, hashMap, (Map<String, String>) null, new VIEngine.VIListener() {
                    public void onVerifyAction(VIAction vIAction) {
                    }

                    public void onVerifyResult(VIResult vIResult) {
                    }
                }, (VIEngine.OnQueryResult) null);
            }
        });
        setFontStyle();
    }

    private void setFontStyle() {
        if (CustomUi.getBodyTitleTypeface() != null) {
            this.tv_center.setTypeface(CustomUi.getBodyTitleTypeface());
        }
        if (CustomUi.getContentTypeface() != null) {
            this.tv_confirm.setTypeface(CustomUi.getContentTypeface());
            this.change_method.setTypeface(CustomUi.getContentTypeface());
        }
    }

    private void initData() {
        Bundle arguments = getArguments();
        this.page_size = arguments.getInt(SecurityConstants.KEY_PAGE_SIZE);
        this.page_number = arguments.getInt("pageNum");
        this.from_title = arguments.getString("form_title");
        this.foot_tip = arguments.getString("foot_tip");
        this.default_seleted_index = arguments.getInt(SecurityConstants.KEY_DEFAULT_SELETED_INDEX);
        this.has_others = arguments.getBoolean("HAS_OTHERS");
        ArrayList<List<QuestionItem>> arrayList = (ArrayList) arguments.getSerializable(SecurityConstants.KEY_SET_SECURITY_BUNDLE);
        this.adapterList = arrayList;
        this.questionItemArr = new QuestionItem[arrayList.size()];
        this.answerId = new String[this.adapterList.size()];
        SecuritySetQuestionAdapter securitySetQuestionAdapter2 = new SecuritySetQuestionAdapter(getActivity(), this.adapterList, R.layout.security_verifyquestion_item);
        this.securitySetQuestionAdapter = securitySetQuestionAdapter2;
        this.listView.setAdapter(securitySetQuestionAdapter2);
        if (this.page_size != this.page_number) {
            this.tv_confirm.setText(R.string.verify_security_next);
        } else {
            this.tv_confirm.setText(R.string.verify_security_submit);
        }
        if (!TextUtils.isEmpty(this.from_title)) {
            this.tv_center.setText(this.from_title);
        }
        if (!TextUtils.isEmpty(this.foot_tip) && this.has_others) {
            this.change_method.setText(this.foot_tip);
            this.change_method.setVisibility(0);
        }
    }

    class SecuritySetQuestionAdapter extends ListViewAdapter<List<QuestionItem>> {
        public SecuritySetQuestionAdapter(Context context, ArrayList<List<QuestionItem>> arrayList, int i) {
            super(context, arrayList, i);
        }

        public void convert(final ViewHolder viewHolder, final List<QuestionItem> list, final int i) {
            if (CustomUi.getContentTypeface() != null) {
                ((TextView) viewHolder.getView(R.id.tv_question)).setTypeface(CustomUi.getContentTypeface());
            }
            if (VerifySecurityFragment.this.questionItemArr[i] == null) {
                ((TextView) viewHolder.getView(R.id.tv_question)).setText(VerifySecurityFragment.this.getResources().getString(R.string.security_choose_question));
            }
            viewHolder.getView(R.id.rl_title).setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    int unused = VerifySecurityFragment.this.mCurrentPosition = i;
                    VerifySecurityFragment.this.showQuestionDialog(list, viewHolder);
                }
            });
            if (VerifySecurityFragment.this.default_seleted_index != -1 && VerifySecurityFragment.this.default_seleted_index < list.size() && VerifySecurityFragment.this.default_seleted_index >= 0) {
                int unused = VerifySecurityFragment.this.mCurrentPosition = i;
                VerifySecurityFragment verifySecurityFragment = VerifySecurityFragment.this;
                verifySecurityFragment.setListAdapterAfterClickBottomQuestion(list.get(verifySecurityFragment.default_seleted_index).getContent(), VerifySecurityFragment.this.default_seleted_index, viewHolder, list, VerifySecurityFragment.this.mCurrentPosition);
                if (VerifySecurityFragment.this.default_seleted_index == 0 && list.size() == 1) {
                    viewHolder.getView(R.id.iv_choose_icon).setVisibility(4);
                    viewHolder.getView(R.id.rl_title).setClickable(false);
                    return;
                }
                viewHolder.getView(R.id.iv_choose_icon).setVisibility(0);
                viewHolder.getView(R.id.rl_title).setClickable(true);
            }
        }
    }

    /* access modifiers changed from: private */
    public void showQuestionDialog(final List<QuestionItem> list, final ViewHolder viewHolder) {
        int i;
        SinglePicker singlePicker = new SinglePicker(getActivity(), list);
        singlePicker.setCanceledOnTouchOutside(false);
        int i2 = this.default_seleted_index;
        if (i2 == -1 || i2 >= list.size() || (i = this.default_seleted_index) < 0) {
            singlePicker.setSelectedIndex(0);
        } else {
            singlePicker.setSelectedIndex(i);
        }
        singlePicker.setCycleDisable(true);
        singlePicker.setDividerColor(getResources().getColor(R.color.pick_line));
        singlePicker.setDividerRatio(0.0f);
        singlePicker.setTextPadding(15);
        singlePicker.setLineSpaceMultiplier(3.0f);
        singlePicker.setTopLineColor(getResources().getColor(R.color.pick_line));
        singlePicker.setCancelTextColor(getResources().getColor(R.color.pick_cancle));
        singlePicker.setSubmitTextColor(getResources().getColor(R.color.theme_color));
        singlePicker.setTextColor(getResources().getColor(R.color.pick_black));
        singlePicker.setOnItemPickListener(new SinglePicker.OnItemPickListener<QuestionItem>() {
            public void onItemPicked(int i, QuestionItem questionItem) {
                VerifySecurityFragment.this.setListAdapterAfterClickBottomQuestion(questionItem.getContent(), i, viewHolder, list, VerifySecurityFragment.this.mCurrentPosition);
            }
        });
        singlePicker.show();
    }

    /* access modifiers changed from: private */
    public void setListAdapterAfterClickBottomQuestion(String str, int i, ViewHolder viewHolder, List<QuestionItem> list, int i2) {
        String str2 = str;
        int i3 = i;
        ViewHolder viewHolder2 = viewHolder;
        List<QuestionItem> list2 = list;
        final int i4 = i2;
        viewHolder2.getView(R.id.rl_edit).setVisibility(0);
        final EditText editText = (EditText) viewHolder2.getView(R.id.editText);
        editText.setFilters(new InputFilter[]{this.inputFilter, new InputFilter.LengthFilter(100)});
        ((TextView) viewHolder2.getView(R.id.tv_question)).setText(str2);
        viewHolder2.getView(R.id.iv_red_point).setVisibility(4);
        QuestionItem[] questionItemArr2 = this.questionItemArr;
        int i5 = this.mCurrentPosition;
        if (questionItemArr2[i5] != null && !TextUtils.isEmpty(questionItemArr2[i5].getContent()) && !this.questionItemArr[this.mCurrentPosition].getContent().equals(str2)) {
            editText.setText("");
            addAnswerId((String) null);
        }
        addQuestionId(list2.get(i3));
        String answerDisplayType = list2.get(i3).getAnswerDisplayType();
        if (!TextUtils.isEmpty(list2.get(i3).getPlaceHolder())) {
            editText.setHint(list2.get(i3).getPlaceHolder());
        }
        String questionType = list2.get(i3).getQuestionType();
        if (answerDisplayType.equalsIgnoreCase(SecurityConstants.KEY_DISPLAY_TYPE_DATE)) {
            editText.setFocusable(false);
            editText.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    int unused = VerifySecurityFragment.this.mCurrentPosition = i4;
                    Calendar.getInstance();
                    DatePickerDialog datePickerDialog = new DatePickerDialog(VerifySecurityFragment.this.getActivity(), 3, new DatePickerDialog.OnDateSetListener() {
                        public void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
                            int max = dispatchOnCancelled.setMax(i);
                            if (i != max) {
                                onCanceled oncanceled = new onCanceled(i, max, 1);
                                onCancelLoad.setMax(212215597, oncanceled);
                                onCancelLoad.getMin(212215597, oncanceled);
                            }
                            StringBuilder sb = new StringBuilder();
                            int i4 = i2 + 1;
                            sb.append(i4);
                            String obj = sb.toString();
                            String valueOf = String.valueOf(i3);
                            if (i4 < 10) {
                                StringBuilder sb2 = new StringBuilder("0");
                                sb2.append(i4);
                                obj = sb2.toString();
                            }
                            if (i3 < 10) {
                                valueOf = "0".concat(String.valueOf(i3));
                            }
                            EditText editText = editText;
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(obj);
                            sb3.append("/");
                            sb3.append(valueOf);
                            sb3.append("/");
                            sb3.append(i);
                            editText.setText(sb3.toString());
                            VerifySecurityFragment verifySecurityFragment = VerifySecurityFragment.this;
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append(obj);
                            sb4.append("/");
                            sb4.append(valueOf);
                            sb4.append("/");
                            sb4.append(i);
                            verifySecurityFragment.addAnswerId(sb4.toString());
                        }
                    }, BioError.RESULT_NOT_SAME_PERSON, 0, 1);
                    DatePicker datePicker = datePickerDialog.getDatePicker();
                    try {
                        Calendar instance = Calendar.getInstance();
                        instance.set(1, SecExceptionCode.SEC_ERROR_AVMP);
                        instance.set(2, 0);
                        instance.set(5, 1);
                        datePicker.setMinDate(instance.getTimeInMillis());
                        datePicker.setMaxDate(System.currentTimeMillis());
                    } catch (Exception unused2) {
                    }
                    datePickerDialog.show();
                }
            });
        } else if (answerDisplayType.equalsIgnoreCase(SecurityConstants.KEY_DISPLAY_TYPE_TEXT) || answerDisplayType.equalsIgnoreCase(SecurityConstants.KEY_DISPLAY_TYPE_NUMBER)) {
            editText.setOnClickListener((View.OnClickListener) null);
            editText.setFocusable(true);
            editText.setFocusableInTouchMode(true);
            editText.requestFocus();
            editText.findFocus();
            if (answerDisplayType.equalsIgnoreCase(SecurityConstants.KEY_DISPLAY_TYPE_TEXT)) {
                editText.setInputType(1);
            } else {
                editText.setInputType(2);
                if (answerDisplayType.equalsIgnoreCase(SecurityConstants.KEY_DISPLAY_TYPE_NUMBER)) {
                    editText.setKeyListener(DigitsKeyListener.getInstance("0123456789"));
                }
            }
            editText.addTextChangedListener(new TextWatcher() {
                public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                }

                public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                }

                public void afterTextChanged(Editable editable) {
                    if (editable.toString().startsWith(" ", 0)) {
                        editable.delete(0, 1);
                    }
                    int unused = VerifySecurityFragment.this.mCurrentPosition = i4;
                    if (editable.toString().trim().length() > 0) {
                        VerifySecurityFragment.this.addAnswerId(editable.toString().trim());
                    }
                }
            });
        } else if (answerDisplayType.equalsIgnoreCase(SecurityConstants.KEY_DISPLAY_TYPE_PULL_DOWN) || answerDisplayType.equalsIgnoreCase(SecurityConstants.KEY_DISPLAY_TYPE_PINGPU)) {
            editText.setFocusable(false);
            final int i6 = i2;
            final String str3 = questionType;
            final List<QuestionItem> list3 = list;
            final int i7 = i;
            final ViewHolder viewHolder3 = viewHolder;
            editText.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    int unused = VerifySecurityFragment.this.mCurrentPosition = i6;
                    if (str3.equalsIgnoreCase(SecurityConstants.KEY_QUESTION_TYPE_SINGLE_CHOOSE)) {
                        VerifySecurityFragment.this.showAnswerDialog(((QuestionItem) list3.get(i7)).getQuestionsOptionsList(), viewHolder3);
                    } else if (str3.equalsIgnoreCase(SecurityConstants.KEY_QUESTION_TYPE_MULTIPLE_CHOICE)) {
                        VerifySecurityFragment.this.showMultipleAnswerDialog(((QuestionItem) list3.get(i7)).getQuestionsOptionsList(), viewHolder3);
                    }
                }
            });
        }
    }

    /* access modifiers changed from: private */
    public void showMultipleAnswerDialog(final List<QuestionItem.QuestionsOptions> list, final ViewHolder viewHolder) {
        MultipleDialog multipleDialog = new MultipleDialog(getActivity(), list);
        multipleDialog.setCanceledOnTouchOutside(false);
        multipleDialog.setTopLineColor(getResources().getColor(R.color.pick_line));
        multipleDialog.setCancelTextColor(getResources().getColor(R.color.pick_cancle));
        multipleDialog.setSubmitTextColor(getResources().getColor(R.color.theme_color));
        multipleDialog.setHalfScreen(true);
        multipleDialog.setmClickCallback(new MultipleDialog.ClickCallback() {
            public void onConfim(List<QuestionItem.QuestionsOptions> list) {
                String str = "";
                String str2 = str;
                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i).isSelected()) {
                        if (TextUtils.isEmpty(str2)) {
                            str2 = list.get(i).getText();
                            str = list.get(i).getValue();
                        } else {
                            StringBuilder sb = new StringBuilder();
                            sb.append(str2);
                            sb.append(",");
                            sb.append(list.get(i).getText());
                            String obj = sb.toString();
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(str);
                            sb2.append(",");
                            sb2.append(list.get(i).getValue());
                            str = sb2.toString();
                            str2 = obj;
                        }
                    }
                    ((QuestionItem.QuestionsOptions) list.get(i)).setSelected(list.get(i).isSelected());
                }
                if (TextUtils.isEmpty(str)) {
                    VerifySecurityFragment.this.setListAdapterAfterClickBottomAnswer("", viewHolder, str2);
                    return;
                }
                VerifySecurityFragment verifySecurityFragment = VerifySecurityFragment.this;
                StringBuilder sb3 = new StringBuilder("[");
                sb3.append(str);
                sb3.append("]");
                verifySecurityFragment.setListAdapterAfterClickBottomAnswer(sb3.toString(), viewHolder, str2);
            }
        });
        multipleDialog.show();
    }

    /* access modifiers changed from: private */
    public void showAnswerDialog(final List<QuestionItem.QuestionsOptions> list, final ViewHolder viewHolder) {
        SinglePicker singlePicker = new SinglePicker(getActivity(), list);
        singlePicker.setCanceledOnTouchOutside(false);
        singlePicker.setSelectedIndex(0);
        singlePicker.setCycleDisable(true);
        singlePicker.setDividerColor(getResources().getColor(R.color.pick_line));
        singlePicker.setDividerRatio(0.0f);
        singlePicker.setTextPadding(15);
        singlePicker.setLineSpaceMultiplier(3.0f);
        singlePicker.setTopLineColor(getResources().getColor(R.color.pick_line));
        singlePicker.setCancelTextColor(getResources().getColor(R.color.pick_cancle));
        singlePicker.setSubmitTextColor(getResources().getColor(R.color.theme_color));
        singlePicker.setTextColor(getResources().getColor(R.color.pick_black));
        singlePicker.setOnItemPickListener(new SinglePicker.OnItemPickListener<QuestionItem.QuestionsOptions>() {
            public void onItemPicked(int i, QuestionItem.QuestionsOptions questionsOptions) {
                VerifySecurityFragment.this.setListAdapterAfterClickBottomAnswer(questionsOptions.getValue(), viewHolder, ((QuestionItem.QuestionsOptions) list.get(i)).getText());
            }
        });
        singlePicker.show();
    }

    /* access modifiers changed from: private */
    public void setListAdapterAfterClickBottomAnswer(String str, ViewHolder viewHolder, String str2) {
        addAnswerId(str);
        ((EditText) viewHolder.getView(R.id.editText)).setText(str2);
    }

    /* access modifiers changed from: private */
    public void addAnswerId(String str) {
        this.answerId[this.mCurrentPosition] = str;
        setTvConfirmState();
    }

    private void addQuestionId(QuestionItem questionItem) {
        this.questionItemArr[this.mCurrentPosition] = questionItem;
        setTvConfirmState();
    }

    private void setTvConfirmState() {
        if (isSeleteAll()) {
            this.tv_confirm.setBackgroundResource(R.drawable.verify_confirm_selected);
        } else {
            this.tv_confirm.setBackgroundResource(R.drawable.verify_confirm_unselected);
        }
    }

    /* access modifiers changed from: private */
    public boolean isSeleteAll() {
        int i = 0;
        while (true) {
            String[] strArr = this.answerId;
            if (i >= strArr.length) {
                int i2 = 0;
                while (true) {
                    QuestionItem[] questionItemArr2 = this.questionItemArr;
                    if (i2 >= questionItemArr2.length) {
                        return true;
                    }
                    if (questionItemArr2[i2] == null) {
                        return false;
                    }
                    i2++;
                }
            } else if (TextUtils.isEmpty(strArr[i])) {
                return false;
            } else {
                i++;
            }
        }
    }

    public void setCommitCallBack(CommitCallBack commitCallBack) {
        this.mCommitCallBack = commitCallBack;
    }
}
