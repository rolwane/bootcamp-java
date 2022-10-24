package com.bootcamp.storage02.repository;

import com.bootcamp.storage02.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAddressRepo extends JpaRepository<Address, Long> {

}
