package com.takemelea.contactus.service;

import com.takemelea.contactus.beans.ContactUs;
import com.takemelea.contactus.repositories.ContactRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MessageService {
    private final ContactRepo contactRepo;

    public void saveMessage(ContactUs contactUs){
        contactRepo.save(contactUs);
    }
}
