package com.Team03.TVFM.model;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ItemsRepo extends JpaRepository<Items, Long>
{
    //query to find item info with a name //for search
    @Query(value = "SELECT * FROM Items WHERE name LIKE %?1% OR description LIKE %?1% OR nutrition LIKE %?1%", nativeQuery = true)
    List<Items> findItem(String name);

    //query to find the item info with an id
    @Query(value = "SELECT * FROM Items WHERE id = ?1", nativeQuery = true)
    Items findItemInfo(Long id);

    @Query(value = "SELECT * FROM Items WHERE id = ?1", nativeQuery = true)
    Items findItembyID(long id);

    //query to find vendor info from items table with id
    @Query(value = "SELECT vendor FROM Items WHERE id = ?1", nativeQuery = true)
    String findVendor(long id);

    //returns max value from id column
    @Query(value = "SELECT MAX(id) FROM Items")
    int maxID();
}
