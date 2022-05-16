package com.takemelea.contactus.controller;

import com.takemelea.contactus.beans.ContactUs;
import com.takemelea.contactus.service.MessageService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor
//enable CrossOrigion, allow to get request from web browser on another port (security issue)
@CrossOrigin(origins = "http://localhost:3000", allowedHeaders = "*")
public class ContactController {
    private final MessageService messageService;

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    @CrossOrigin
    public void saveMessage(@RequestBody ContactUs contactUs){
        messageService.saveMessage(contactUs);
    }
}
