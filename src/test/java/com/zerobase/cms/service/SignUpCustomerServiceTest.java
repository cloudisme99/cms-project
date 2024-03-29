package com.zerobase.cms.service;

import static org.junit.jupiter.api.Assertions.*;

import com.zerobase.cms.domain.SignUpForm;
import com.zerobase.cms.domain.model.Customer;
import java.time.LocalDate;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
class SignUpCustomerServiceTest {

    @Autowired
    private SignUpCustomerService service;

    @Test
    void signUp() {
        SignUpForm form = SignUpForm.builder()
            .name("name")
            .birth(LocalDate.now())
            .email("abc@gmail.com")
            .password("1")
            .phone("01000000000")
            .build();
        Customer c = service.signUp(form);
        //Assert.isTrue(c.getId()!=null);
        assertNotNull(c.getId());
        assertNotNull(c.getCreatedAt() );
    }
}