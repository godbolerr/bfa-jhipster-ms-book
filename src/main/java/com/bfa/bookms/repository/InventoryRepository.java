package com.bfa.bookms.repository;

import com.bfa.bookms.domain.Inventory;

import org.springframework.data.jpa.repository.*;

import java.util.List;

/**
 * Spring Data JPA repository for the Inventory entity.
 */
@SuppressWarnings("unused")
public interface InventoryRepository extends JpaRepository<Inventory,Long> {

}
