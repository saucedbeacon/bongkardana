package com.alipay.mobile.verifyidentity.business.securitycommon.bean;

import java.io.Serializable;
import java.util.ArrayList;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public class QuestionItem implements Serializable {
    private int Id;
    private String answerDisplayType;
    private ArrayList<String> answers;
    private String content;
    private String displayType;
    private int maxlength;
    private String memoryId;
    private int minlength;
    private String placeHolder;
    private String questionId;
    private String questionType;
    private ArrayList<QuestionsOptions> questionsOptionsList;

    public String getPlaceHolder() {
        return this.placeHolder;
    }

    public void setPlaceHolder(String str) {
        this.placeHolder = str;
    }

    public ArrayList<String> getAnswers() {
        return this.answers;
    }

    public void setAnswers(ArrayList<String> arrayList) {
        this.answers = arrayList;
    }

    public int getMinlength() {
        return this.minlength;
    }

    public void setMinlength(int i) {
        this.minlength = i;
    }

    public int getMaxlength() {
        return this.maxlength;
    }

    public void setMaxlength(int i) {
        this.maxlength = i;
    }

    public String getDisplayType() {
        return this.displayType;
    }

    public void setDisplayType(String str) {
        this.displayType = str;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public String getAnswerDisplayType() {
        return this.answerDisplayType;
    }

    public void setAnswerDisplayType(String str) {
        this.answerDisplayType = str;
    }

    public String getQuestionType() {
        return this.questionType;
    }

    public void setQuestionType(String str) {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(945585579, oncanceled);
            onCancelLoad.getMin(945585579, oncanceled);
        }
        this.questionType = str;
    }

    public String getMemoryId() {
        return this.memoryId;
    }

    public void setMemoryId(String str) {
        this.memoryId = str;
    }

    public String getQuestionId() {
        return this.questionId;
    }

    public void setQuestionId(String str) {
        this.questionId = str;
    }

    public int getId() {
        return this.Id;
    }

    public void setId(int i) {
        this.Id = i;
    }

    public ArrayList<QuestionsOptions> getQuestionsOptionsList() {
        return this.questionsOptionsList;
    }

    public void setQuestionsOptionsList(ArrayList<QuestionsOptions> arrayList) {
        this.questionsOptionsList = arrayList;
    }

    public String toString() {
        return this.content;
    }

    public static class QuestionsOptions implements Serializable {
        boolean isSelected;
        String text;
        String value;

        public QuestionsOptions(String str, String str2) {
            this.text = str;
            this.value = str2;
        }

        public String getText() {
            return this.text;
        }

        public void setText(String str) {
            this.text = str;
        }

        public String getValue() {
            return this.value;
        }

        public void setValue(String str) {
            this.value = str;
        }

        public boolean isSelected() {
            return this.isSelected;
        }

        public void setSelected(boolean z) {
            this.isSelected = z;
        }

        public String toString() {
            return this.text;
        }
    }
}
