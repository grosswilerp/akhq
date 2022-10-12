package org.akhq.utils;

import io.micronaut.context.event.ApplicationEventListener;
import io.micronaut.security.event.LogoutEvent;
import jakarta.inject.Singleton;
import lombok.extern.slf4j.Slf4j;

@Singleton
@Slf4j
public class LogoutEventListener implements ApplicationEventListener<LogoutEvent> {
    @Override
    public void onApplicationEvent(LogoutEvent event) {
        Credentials.clear();
    }

    @Override
    public boolean supports(LogoutEvent event) {
        return true;
    }
}
