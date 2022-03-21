package com.jb.advanced_spring.repository;

import com.jb.advanced_spring.beans.UserDetails;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ClientRepo extends JpaRepository<UserDetails,Integer> {
    Optional<UserDetails> findByEmail(String email);
}
