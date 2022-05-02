package com.alibaba.griver.bluetooth.altbeacon.beacon.service;

import com.alibaba.griver.bluetooth.altbeacon.beacon.Beacon;
import com.alibaba.griver.bluetooth.altbeacon.beacon.logging.LogManager;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

public class Stats {

    /* renamed from: a  reason: collision with root package name */
    private static final Stats f10268a = new Stats();
    private static final SimpleDateFormat b = new SimpleDateFormat("HH:mm:ss.SSS");
    private ArrayList<Sample> c;
    private long d = 0;
    private boolean e;
    private boolean f;
    private boolean g;
    private Sample h;

    public static class Sample {
        public long detectionCount = 0;
        public Date firstDetectionTime;
        public Date lastDetectionTime;
        public long maxMillisBetweenDetections;
        public Date sampleStartTime;
        public Date sampleStopTime;
    }

    private Stats() {
        clearSamples();
    }

    public static Stats getInstance() {
        return f10268a;
    }

    public ArrayList<Sample> getSamples() {
        b();
        return this.c;
    }

    public boolean isEnabled() {
        return this.g;
    }

    public void setEnabled(boolean z) {
        this.g = z;
    }

    public void setLoggingEnabled(boolean z) {
        this.e = z;
    }

    public void setHistoricalLoggingEnabled(boolean z) {
        this.f = z;
    }

    public void setSampleIntervalMillis(long j) {
        this.d = j;
    }

    public void log(Beacon beacon) {
        b();
        this.h.detectionCount++;
        if (this.h.firstDetectionTime == null) {
            this.h.firstDetectionTime = new Date();
        }
        if (this.h.lastDetectionTime != null) {
            long time = new Date().getTime() - this.h.lastDetectionTime.getTime();
            if (time > this.h.maxMillisBetweenDetections) {
                this.h.maxMillisBetweenDetections = time;
            }
        }
        this.h.lastDetectionTime = new Date();
    }

    public void clearSample() {
        this.h = null;
    }

    public void newSampleInterval() {
        Date date = new Date();
        if (this.h != null) {
            date = new Date(this.h.sampleStartTime.getTime() + this.d);
            this.h.sampleStopTime = date;
            if (!this.f && this.e) {
                a(this.h, true);
            }
        }
        Sample sample = new Sample();
        this.h = sample;
        sample.sampleStartTime = date;
        this.c.add(this.h);
        if (this.f) {
            a();
        }
    }

    public void clearSamples() {
        this.c = new ArrayList<>();
        newSampleInterval();
    }

    private void a(Sample sample, boolean z) {
        if (z) {
            LogManager.d("Stats", "sample start time, sample stop time, first detection time, last detection time, max millis between detections, detection count", new Object[0]);
        }
        LogManager.d("Stats", "%s, %s, %s, %s, %s, %s", a(sample.sampleStartTime), a(sample.sampleStopTime), a(sample.firstDetectionTime), a(sample.lastDetectionTime), Long.valueOf(sample.maxMillisBetweenDetections), Long.valueOf(sample.detectionCount));
    }

    private String a(Date date) {
        String format;
        if (date == null) {
            return "";
        }
        synchronized (b) {
            format = b.format(date);
        }
        return format;
    }

    private void a() {
        boolean z = true;
        LogManager.d("Stats", "--- Stats for %s samples", Integer.valueOf(this.c.size()));
        Iterator<Sample> it = this.c.iterator();
        while (it.hasNext()) {
            a(it.next(), z);
            z = false;
        }
    }

    private void b() {
        if (this.h == null || (this.d > 0 && new Date().getTime() - this.h.sampleStartTime.getTime() >= this.d)) {
            newSampleInterval();
        }
    }
}
