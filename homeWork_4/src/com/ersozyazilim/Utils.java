package com.ersozyazilim;

import com.ersozyazilim.logSystem.Logger;

public class Utils {
    public static void setLog(Logger[] loggers, String message){
        for(Logger loger : loggers){
            loger.log(message);
        }
    }
}
