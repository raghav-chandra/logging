package org.raga.logging;

import org.raga.logging.stage.*;

public interface Logger extends org.slf4j.Logger {
    void log(InitStats initialStats);

    void log(AdtlStats additionalStats);

    void log(CompletedStats completedStats);

    void log(FailedStats failedStats);

    void log(FinalStats finalStats);

}
