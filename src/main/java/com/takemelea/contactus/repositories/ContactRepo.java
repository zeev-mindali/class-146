package com.takemelea.contactus.repositories;

import com.takemelea.contactus.beans.ContactUs;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepo extends JpaRepository<ContactUs,Integer> {
}
