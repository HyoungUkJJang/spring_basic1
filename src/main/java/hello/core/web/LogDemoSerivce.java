package hello.core.web;

import hello.core.common.MyLogger;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LogDemoSerivce {

    private final ObjectProvider<MyLogger> myLoggerProvier;

    public void logic(String testID) {
        MyLogger myLogger = myLoggerProvier.getObject();
        myLogger.log("service id = "+testID);
    }
}
