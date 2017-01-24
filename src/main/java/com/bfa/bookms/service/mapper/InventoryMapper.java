package com.bfa.bookms.service.mapper;

import com.bfa.bookms.domain.*;
import com.bfa.bookms.service.dto.InventoryDTO;

import org.mapstruct.*;
import java.util.List;

/**
 * Mapper for the entity Inventory and its DTO InventoryDTO.
 */
@Mapper(componentModel = "spring", uses = {})
public interface InventoryMapper {

    InventoryDTO inventoryToInventoryDTO(Inventory inventory);

    List<InventoryDTO> inventoriesToInventoryDTOs(List<Inventory> inventories);

    Inventory inventoryDTOToInventory(InventoryDTO inventoryDTO);

    List<Inventory> inventoryDTOsToInventories(List<InventoryDTO> inventoryDTOs);
}
