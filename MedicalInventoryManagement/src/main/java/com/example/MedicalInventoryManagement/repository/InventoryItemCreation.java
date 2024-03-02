package com.example.MedicalInventoryManagement.repository;

import com.example.MedicalInventoryManagement.models.MedicalItems;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryItemCreation extends JpaRepository<MedicalItems,Integer> {

}
