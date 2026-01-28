package br.com.xmacedo.loggerbuilderroutersystem.service;

import org.springframework.stereotype.Component;
import java.util.HashMap;
import java.util.Map;

@Component
public class LogProcessor {
    private Map<String, LogRouter> routers;
    public LogProcessor() {
        this.routers = new HashMap<>();
    }

    public void registerRouter(String name, LogRouter router) {

    }
}
