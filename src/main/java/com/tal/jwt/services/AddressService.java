package com.tal.jwt.services;

import com.tal.jwt.beans.Address;
import com.tal.jwt.repositories.AddressRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AddressService {
    private final AddressRepo addressRepo;
    //crud

    public void addAdress(Address address){
        addressRepo.save(address);
    }

    public List<Address> getAllAddress(){
        return addressRepo.findAll();
    }

    public Address getAddress(int id){
        Optional<Address> address = addressRepo.findById(id);
        return address.orElse(null);
    }

    public void updateAddress(Address address){
        if (addressRepo.existsById(address.getId())){
            addressRepo.save(address);
        } else {
            System.out.println("Address not in the system dude");
        }
    }

    public void deleteAddress(int id){
        addressRepo.deleteById(id);
    }
}
