package hello.core.web;

import hello.core.common.MyLogger;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequiredArgsConstructor
public class LogDemoController {

    private final LogDemoSerivce logDemoSerivce;
    private final ObjectProvider<MyLogger> myLoggerProvider; // 해결방안

    @RequestMapping("log-demo")
    @ResponseBody
    public String logDemo(HttpServletRequest request) {
        MyLogger myLogger = myLoggerProvider.getObject();
        String requestURI = request.getRequestURI().toString();
        myLogger.setRequestURL(requestURI);

        myLogger.log("controller test");
        logDemoSerivce.logic("TestID");
        return "OK";
    }
}
