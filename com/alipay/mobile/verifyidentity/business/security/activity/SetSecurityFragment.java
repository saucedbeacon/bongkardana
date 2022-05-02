package com.alipay.mobile.verifyidentity.business.security.activity;

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
import com.alipay.mobile.verifyidentity.base.adapter.ListViewAdapter;
import com.alipay.mobile.verifyidentity.base.adapter.ViewHolder;
import com.alipay.mobile.verifyidentity.business.security.R;
import com.alipay.mobile.verifyidentity.business.securitycommon.bean.QuestionItem;
import com.alipay.mobile.verifyidentity.business.securitycommon.bean.SecurityConstants;
import com.alipay.mobile.verifyidentity.business.securitycommon.widget.SinglePicker;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.regex.Pattern;

public class SetSecurityFragment extends Fragment {
    private ArrayList<List<QuestionItem>> adapterList;
    /* access modifiers changed from: private */
    public String[] answerId;
    String bottomDialogItemContent;
    int bottomDialogItemPosition;
    private String from_title;
    InputFilter inputFilter = new InputFilter() {
        Pattern emoji = Pattern.compile("[🀀-🏿]|[🐀-🟿]|[☀-⟿]", 66);

        public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
            if (this.emoji.matcher(charSequence).find()) {
                return "";
            }
            return null;
        }
    };
    boolean isChooseBottomDialogItem = false;
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
    private View viewGroup;

    public interface CommitCallBack {
        void commit(String[] strArr, QuestionItem[] questionItemArr, int i, int i2);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup2, Bundle bundle) {
        if (this.viewGroup == null) {
            this.viewGroup = layoutInflater.inflate(R.layout.fragment_set_security, viewGroup2, false);
            init();
        }
        return this.viewGroup;
    }

    private void init() {
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
                if (SetSecurityFragment.this.isSeleteAll() && SetSecurityFragment.this.mCommitCallBack != null) {
                    SetSecurityFragment.this.mCommitCallBack.commit(SetSecurityFragment.this.answerId, SetSecurityFragment.this.questionItemArr, SetSecurityFragment.this.page_size, SetSecurityFragment.this.page_number);
                }
            }
        });
    }

    private void initData() {
        Bundle arguments = getArguments();
        this.page_size = arguments.getInt(SecurityConstants.KEY_PAGE_SIZE);
        this.page_number = arguments.getInt("pageNum");
        this.from_title = arguments.getString("form_title");
        ArrayList<List<QuestionItem>> arrayList = (ArrayList) arguments.getSerializable(SecurityConstants.KEY_SET_SECURITY_BUNDLE);
        this.adapterList = arrayList;
        this.questionItemArr = new QuestionItem[arrayList.size()];
        this.answerId = new String[this.adapterList.size()];
        SecuritySetQuestionAdapter securitySetQuestionAdapter2 = new SecuritySetQuestionAdapter(getActivity(), this.adapterList, R.layout.security_setquestion_item);
        this.securitySetQuestionAdapter = securitySetQuestionAdapter2;
        this.listView.setAdapter(securitySetQuestionAdapter2);
        if (this.page_size != this.page_number) {
            this.tv_confirm.setText(R.string.set_security_next);
        } else {
            this.tv_confirm.setText(R.string.set_security_confirm);
        }
        if (!TextUtils.isEmpty(this.from_title)) {
            this.tv_center.setText(this.from_title);
        }
    }

    class SecuritySetQuestionAdapter extends ListViewAdapter<List<QuestionItem>> {
        public SecuritySetQuestionAdapter(Context context, ArrayList<List<QuestionItem>> arrayList, int i) {
            super(context, arrayList, i);
        }

        public void convert(final ViewHolder viewHolder, final List<QuestionItem> list, final int i) {
            if (SetSecurityFragment.this.questionItemArr[i] == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(SetSecurityFragment.this.getResources().getString(R.string.security_choose_question));
                sb.append(" ");
                sb.append(i + 1);
                ((TextView) viewHolder.getView(R.id.tv_question)).setText(sb.toString());
            }
            viewHolder.getView(R.id.rl_title).setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    int unused = SetSecurityFragment.this.mCurrentPosition = i;
                    SetSecurityFragment.this.showQuestionDialog(list, viewHolder);
                }
            });
        }
    }

    /* access modifiers changed from: private */
    public void showQuestionDialog(final List<QuestionItem> list, final ViewHolder viewHolder) {
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
        singlePicker.setOnItemPickListener(new SinglePicker.OnItemPickListener<QuestionItem>() {
            public void onItemPicked(int i, QuestionItem questionItem) {
                SetSecurityFragment.this.bottomDialogItemContent = questionItem.getContent();
                SetSecurityFragment.this.bottomDialogItemPosition = i;
                SetSecurityFragment setSecurityFragment = SetSecurityFragment.this;
                setSecurityFragment.setListAdapterAfterClickBottomQuestion(setSecurityFragment.bottomDialogItemContent, SetSecurityFragment.this.bottomDialogItemPosition, viewHolder, list, SetSecurityFragment.this.mCurrentPosition);
            }
        });
        singlePicker.show();
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
                SetSecurityFragment.this.bottomDialogItemContent = questionsOptions.getValue();
                SetSecurityFragment.this.bottomDialogItemPosition = i;
                SetSecurityFragment setSecurityFragment = SetSecurityFragment.this;
                setSecurityFragment.setListAdapterAfterClickBottomAnswer(setSecurityFragment.bottomDialogItemContent, SetSecurityFragment.this.bottomDialogItemPosition, viewHolder, list);
            }
        });
        singlePicker.show();
    }

    /* access modifiers changed from: private */
    public void setListAdapterAfterClickBottomQuestion(String str, int i, ViewHolder viewHolder, List<QuestionItem> list, final int i2) {
        viewHolder.getView(R.id.rl_edit).setVisibility(0);
        final EditText editText = (EditText) viewHolder.getView(R.id.editText);
        editText.setFilters(new InputFilter[]{this.inputFilter, new InputFilter.LengthFilter(100)});
        ((TextView) viewHolder.getView(R.id.tv_question)).setText(str);
        viewHolder.getView(R.id.iv_red_point).setVisibility(4);
        QuestionItem[] questionItemArr2 = this.questionItemArr;
        int i3 = this.mCurrentPosition;
        if (questionItemArr2[i3] != null && !TextUtils.isEmpty(questionItemArr2[i3].getContent()) && !this.questionItemArr[this.mCurrentPosition].getContent().equals(str)) {
            editText.setText("");
            addAnswerId((String) null);
        }
        addQuestionId(list.get(i));
        String answerDisplayType = list.get(i).getAnswerDisplayType();
        if (answerDisplayType.equalsIgnoreCase(SecurityConstants.KEY_DISPLAY_TYPE_DATE)) {
            editText.setFocusable(false);
            editText.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    int unused = SetSecurityFragment.this.mCurrentPosition = i2;
                    Calendar instance = Calendar.getInstance();
                    DatePickerDialog datePickerDialog = new DatePickerDialog(SetSecurityFragment.this.getActivity(), 3, new DatePickerDialog.OnDateSetListener() {
                        public void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
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
                            SetSecurityFragment setSecurityFragment = SetSecurityFragment.this;
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append(obj);
                            sb4.append("/");
                            sb4.append(valueOf);
                            sb4.append("/");
                            sb4.append(i);
                            setSecurityFragment.addAnswerId(sb4.toString());
                        }
                    }, instance.get(1), instance.get(2), instance.get(5));
                    DatePicker datePicker = datePickerDialog.getDatePicker();
                    try {
                        Calendar instance2 = Calendar.getInstance();
                        instance2.set(1, SecExceptionCode.SEC_ERROR_AVMP);
                        instance2.set(2, 0);
                        instance2.set(5, 1);
                        datePicker.setMinDate(instance2.getTimeInMillis());
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
                    int unused = SetSecurityFragment.this.mCurrentPosition = i2;
                    SetSecurityFragment.this.addAnswerId(editable.toString().trim());
                }
            });
        } else if (answerDisplayType.equalsIgnoreCase(SecurityConstants.KEY_DISPLAY_TYPE_PULL_DOWN) || answerDisplayType.equalsIgnoreCase(SecurityConstants.KEY_DISPLAY_TYPE_PINGPU)) {
            editText.setFocusable(false);
            final int i4 = i2;
            final List<QuestionItem> list2 = list;
            final int i5 = i;
            final ViewHolder viewHolder2 = viewHolder;
            editText.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    int unused = SetSecurityFragment.this.mCurrentPosition = i4;
                    SetSecurityFragment.this.showAnswerDialog(((QuestionItem) list2.get(i5)).getQuestionsOptionsList(), viewHolder2);
                }
            });
        }
    }

    /* access modifiers changed from: private */
    public void setListAdapterAfterClickBottomAnswer(String str, int i, ViewHolder viewHolder, List<QuestionItem.QuestionsOptions> list) {
        addAnswerId(str);
        ((EditText) viewHolder.getView(R.id.editText)).setText(list.get(i).getText());
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
            this.tv_confirm.setBackgroundResource(R.drawable.confirm_selected);
        } else {
            this.tv_confirm.setBackgroundResource(R.drawable.confirm_unselected);
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
