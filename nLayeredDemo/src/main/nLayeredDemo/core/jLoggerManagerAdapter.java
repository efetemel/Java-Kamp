package core;

import jLogger.jLoggerManager;

public class jLoggerManagerAdapter implements LoggerService{
    @Override
    public void logToSystem(String message) {
        jLoggerManager manager = new jLoggerManager();
        manager.log(message);
    }
}
