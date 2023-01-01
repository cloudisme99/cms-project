package com.zerobase.cms.client.service;

import com.zerobase.cms.client.MailgunClient;
import com.zerobase.cms.client.mailgun.SendMailForm;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmailSendServiceTest {

    @Autowired
    private MailgunClient mailgunClient;

    @Test
    public void EmailTest() {

        mailgunClient.sendEmail(SendMailForm.builder()
                .from("cloudisme99@gmail.com")
                .to("cloudisme99@gmail.com")
                .subject("메일테스트입니다")
                .text("감사합니다")
            .build());
    }
}