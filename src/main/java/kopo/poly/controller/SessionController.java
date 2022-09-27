package kopo.poly.controller;

import kopo.poly.util.CmmUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@Slf4j
@RestController
public class SessionController {
    @GetMapping("/session/test")
    public String sessionTest(HttpSession session){
        String sessionId = session.getId();

        String test = CmmUtil.nvl((String) session.getAttribute("test"));

        log.info("test: " + test);

        return sessionId;
    }
}
