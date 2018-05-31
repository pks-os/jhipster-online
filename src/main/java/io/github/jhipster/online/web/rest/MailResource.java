package io.github.jhipster.online.web.rest;

import com.codahale.metrics.annotation.Timed;
import io.github.jhipster.online.service.MailService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/mail")
public class MailResource {
    private final MailService mailService;

    public MailResource(MailService mailService) {
        this.mailService = mailService;
    }

    @GetMapping("/enabled")
    @Timed
    public boolean areMailsEnabled() {
        return mailService.isServiceEnabled();
    }
}
