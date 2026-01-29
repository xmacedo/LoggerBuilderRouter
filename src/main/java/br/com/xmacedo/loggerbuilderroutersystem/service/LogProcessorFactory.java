package br.com.xmacedo.loggerbuilderroutersystem.service;

import org.springframework.stereotype.Component;
import java.util.HashMap;
import java.util.Map;

@Component
public class LogProcessorFactory {
    private Map<String, LogRouter> routers;

    public LogProcessorFactory() {
        this.routers = new HashMap<>();
    }

    public LogRouter getRouter(String name) {
        LogRouter router = getRouter(name);
        if (router == null) {
            throw new IllegalArgumentException("Router not found");
        }

        return router;
    }
}
