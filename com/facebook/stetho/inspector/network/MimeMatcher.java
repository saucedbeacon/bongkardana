package com.facebook.stetho.inspector.network;

import android.annotation.SuppressLint;
import java.util.ArrayList;
import javax.annotation.Nullable;

public class MimeMatcher<T> {
    private final ArrayList<MimeMatcher<T>.MimeMatcherRule> mRuleMap = new ArrayList<>();

    public void addRule(String str, T t) {
        this.mRuleMap.add(new MimeMatcherRule(str, t));
    }

    public void clear() {
        this.mRuleMap.clear();
    }

    @Nullable
    public T match(String str) {
        int size = this.mRuleMap.size();
        for (int i = 0; i < size; i++) {
            MimeMatcherRule mimeMatcherRule = this.mRuleMap.get(i);
            if (mimeMatcherRule.match(str)) {
                return mimeMatcherRule.getResultIfMatched();
            }
        }
        return null;
    }

    @SuppressLint({"BadMethodUse-java.lang.String.length"})
    class MimeMatcherRule {
        private final boolean mHasWildcard;
        private final String mMatchPrefix;
        private final T mResultIfMatched;

        public MimeMatcherRule(String str, T t) {
            if (str.endsWith("*")) {
                this.mHasWildcard = true;
                this.mMatchPrefix = str.substring(0, str.length() - 1);
            } else {
                this.mHasWildcard = false;
                this.mMatchPrefix = str;
            }
            if (!this.mMatchPrefix.contains("*")) {
                this.mResultIfMatched = t;
                return;
            }
            throw new IllegalArgumentException("Multiple wildcards present in rule expression ".concat(String.valueOf(str)));
        }

        public boolean match(String str) {
            if (!str.startsWith(this.mMatchPrefix)) {
                return false;
            }
            if (this.mHasWildcard || str.length() == this.mMatchPrefix.length()) {
                return true;
            }
            return false;
        }

        public T getResultIfMatched() {
            return this.mResultIfMatched;
        }
    }
}
