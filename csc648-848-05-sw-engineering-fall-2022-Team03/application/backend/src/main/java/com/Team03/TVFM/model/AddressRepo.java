package com.Team03.TVFM.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface AddressRepo extends JpaRepository<Address, Long> {

    //query to find customer address with an id
    @Query(value = "SELECT * FROM address WHERE customer_id = ?1 LIMIT 1", nativeQuery = true)
    Address findCustomerAddress(Long id);

}
