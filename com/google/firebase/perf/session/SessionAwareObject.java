package com.google.firebase.perf.session;

public interface SessionAwareObject {
    void updateSession(PerfSession perfSession);
}
