package com.cp2.brinquedo.repository;

import com.cp2.brinquedo.entity.Brinquedo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BrinquedoRepository extends JpaRepository <Brinquedo,Long> {

}
