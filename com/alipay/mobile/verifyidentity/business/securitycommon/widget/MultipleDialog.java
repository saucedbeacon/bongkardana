package com.alipay.mobile.verifyidentity.business.securitycommon.widget;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.alipay.mobile.verifyidentity.base.adapter.ListViewAdapter;
import com.alipay.mobile.verifyidentity.base.adapter.ViewHolder;
import com.alipay.mobile.verifyidentity.business.securitycommon.bean.QuestionItem;
import com.alipay.mobile.verifyidentity.business.securitywidget.R;
import java.util.ArrayList;
import java.util.List;

public class MultipleDialog extends ConfirmPopup<View> {
    private List<QuestionItem.QuestionsOptions> answerItems;
    private ListView listView;
    private ClickCallback mClickCallback;
    private MultipleVerifyQuestionAdapter multipleVerifyQuestionAdapter;
    private View root;

    public interface ClickCallback {
        void onConfim(List<QuestionItem.QuestionsOptions> list);
    }

    public MultipleDialog(Activity activity, List<QuestionItem.QuestionsOptions> list) {
        super(activity);
        ArrayList arrayList = new ArrayList();
        this.answerItems = arrayList;
        arrayList.clear();
        for (int i = 0; i < list.size(); i++) {
            QuestionItem.QuestionsOptions questionsOptions = new QuestionItem.QuestionsOptions(list.get(i).getText(), list.get(i).getValue());
            questionsOptions.setSelected(list.get(i).isSelected());
            this.answerItems.add(questionsOptions);
        }
    }

    /* access modifiers changed from: protected */
    @NonNull
    public View makeCenterView() {
        if (this.root == null) {
            View inflate = LayoutInflater.from(this.activity).inflate(R.layout.dialog_multiple, (ViewGroup) null);
            this.root = inflate;
            this.listView = (ListView) inflate.findViewById(R.id.listView);
        }
        MultipleVerifyQuestionAdapter multipleVerifyQuestionAdapter2 = new MultipleVerifyQuestionAdapter(this.activity, this.answerItems, R.layout.item_multiple_dialog);
        this.multipleVerifyQuestionAdapter = multipleVerifyQuestionAdapter2;
        this.listView.setAdapter(multipleVerifyQuestionAdapter2);
        return this.root;
    }

    class MultipleVerifyQuestionAdapter extends ListViewAdapter<QuestionItem.QuestionsOptions> {
        public MultipleVerifyQuestionAdapter(Context context, List<QuestionItem.QuestionsOptions> list, int i) {
            super(context, list, i);
        }

        public void convert(ViewHolder viewHolder, final QuestionItem.QuestionsOptions questionsOptions, int i) {
            ImageView imageView = (ImageView) viewHolder.getView(R.id.iv_select_icon);
            TextView textView = (TextView) viewHolder.getView(R.id.tv_answer);
            if (questionsOptions.isSelected()) {
                imageView.setBackgroundResource(R.drawable.checked);
            } else {
                imageView.setBackgroundResource(R.drawable.uncherked);
            }
            textView.setText(questionsOptions.getText());
            viewHolder.getView(R.id.item_root).setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    if (questionsOptions.isSelected()) {
                        questionsOptions.setSelected(false);
                    } else {
                        questionsOptions.setSelected(true);
                    }
                    MultipleVerifyQuestionAdapter.this.notifyDataSetChanged();
                }
            });
        }
    }

    /* access modifiers changed from: protected */
    public void onCancel() {
        super.onCancel();
    }

    /* access modifiers changed from: protected */
    public void onSubmit() {
        super.onSubmit();
        ClickCallback clickCallback = this.mClickCallback;
        if (clickCallback != null) {
            clickCallback.onConfim(this.answerItems);
        }
    }

    public void setmClickCallback(ClickCallback clickCallback) {
        this.mClickCallback = clickCallback;
    }
}
