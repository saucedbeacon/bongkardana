package com.alipay.iap.android.aplog.core.filter;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class LogStrategyInfo {
    public static int SIMPLING_STATE_HIT = 1;
    public static int SIMPLING_STATE_INIT = -1;
    public static int SIMPLING_STATE_UNHIT;
    boolean hasSendCondition = false;
    boolean isEncrypt;
    boolean isWrite;
    int level = -1;
    Map<String, Integer> levelHits = new ConcurrentHashMap();
    int levelRate1 = -1;
    int levelRate2 = -1;
    int levelRate3 = -1;
    boolean realtime;
    List<String> sendCondition = new ArrayList();
    int threshold;
    List<String> uploadEvents = new ArrayList();
    int uploadInterval = -1;
    int uploadRate = -1;

    public boolean isWrite() {
        return this.isWrite;
    }

    public void setWrite(boolean z) {
        this.isWrite = z;
    }

    public boolean isEncrypt() {
        return this.isEncrypt;
    }

    public void setEncrypt(boolean z) {
        this.isEncrypt = z;
    }

    public int getThreshold() {
        return this.threshold;
    }

    public void setThreshold(int i) {
        this.threshold = i;
    }

    public int getLevel() {
        return this.level;
    }

    public void setLevel(int i) {
        this.level = i;
    }

    public List<String> getSendCondition() {
        return this.sendCondition;
    }

    public void setSendCondition(List<String> list) {
        this.sendCondition = list;
    }

    public List<String> getUploadEvents() {
        return this.uploadEvents;
    }

    public void setUploadEvents(List<String> list) {
        this.uploadEvents = list;
    }

    public boolean isRealtime() {
        return this.realtime;
    }

    public void setRealtime(boolean z) {
        this.realtime = z;
    }

    public int getUploadRate() {
        return this.uploadRate;
    }

    public void setUploadRate(int i) {
        this.uploadRate = i;
    }

    public int getUploadInterval() {
        return this.uploadInterval;
    }

    public void setUploadInterval(int i) {
        this.uploadInterval = i;
    }

    public int getLevelRate1() {
        return this.levelRate1;
    }

    public void setLevelRate1(int i) {
        this.levelRate1 = i;
    }

    public int getLevelRate2() {
        return this.levelRate2;
    }

    public void setLevelRate2(int i) {
        this.levelRate2 = i;
    }

    public int getLevelRate3() {
        return this.levelRate3;
    }

    public void setLevelRate3(int i) {
        this.levelRate3 = i;
    }

    public boolean isHasSendCondition() {
        return this.hasSendCondition;
    }

    public void setHasSendCondition(boolean z) {
        this.hasSendCondition = z;
    }
}
