/*package com.Team03.TVFM.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CartRepo extends JpaRepository<Cart, Long>
{
    @Query(value = "SELECT * FROM Cart WHERE Customer_id = ?1")
    Cart findCartByCustomerID(long id);

    @Query(value = "SELECT * FROM Cart WHERE Vendor_id = ?1")
    Cart findCartByVendorID(long id);

    default Cart findCartByAccountID(long id, boolean isVendor) {
        if (isVendor) {
            return findCartByVendorID(id);
        } else {
            return findCartByCustomerID(id);
        }
    }
}*/
