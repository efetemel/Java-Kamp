package com.ersozyazilim.logSystem;

public class SmsLogger implements Logger {
    @Override
    public void log(String message) {
        System.out.println("[LOGGER] Sms'e gönderildi > "+message);
    }
}
