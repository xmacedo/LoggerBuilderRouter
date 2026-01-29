package br.com.xmacedo.loggerbuilderroutersystem.service;

import org.springframework.stereotype.Service;

@Service
public class RouterService {

    private LogProcessorFactory logProcessorFactory;

    public RouterService(LogProcessorFactory logProcessorFactory) {
        this.logProcessorFactory = logProcessorFactory;
    }

    public void processLog(String routerType, String log) {
        logProcessorFactory.getRouter(routerType).processLog(log);
    }
}
