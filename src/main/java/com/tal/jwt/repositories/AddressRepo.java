package com.tal.jwt.repositories;

import com.tal.jwt.beans.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepo extends JpaRepository<Address, Integer> {
}
