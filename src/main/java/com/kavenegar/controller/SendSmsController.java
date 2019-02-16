package com.kavenegar.controller;

import com.kavenegar.dto.SendSmsRequest;
import com.kavenegar.dto.SendSmsResponse;
import com.kavenegar.service.SendSmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service")
public class SendSmsController {

    @Autowired
    private SendSmsService service;

    @PostMapping("/send")
    public SendSmsResponse sendSms(SendSmsRequest request) {
        return service.sendSms(request);
    }
}
