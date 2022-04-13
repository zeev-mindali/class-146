package com.tal.jwt.repositories;

import com.tal.jwt.beans.Credentials;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepo extends JpaRepository<Credentials,Integer> {
    Optional<Credentials> findByUserName(String userName);
}
