package com.ersozyazilim.logSystem;

public class DatabaseLogger implements Logger {
    @Override
    public void log(String message) {
        System.out.println("[LOGGER] Database'e loglandı > "+message);
    }
}
