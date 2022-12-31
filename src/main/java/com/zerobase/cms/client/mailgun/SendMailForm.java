package com.zerobase.cms.client.mailgun;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.transaction.annotation.Transactional;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder
@Transactional
public class SendMailForm {

    private String from;
    private String to;
    private String subject;
    private String text;
}
