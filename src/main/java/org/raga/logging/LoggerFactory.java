package org.raga.logging;

public class LoggerFactory {
    public static Logger getLogger(Class<?> clazz) {
        return new StatsLogger(org.slf4j.LoggerFactory.getLogger(clazz));
    }
}
