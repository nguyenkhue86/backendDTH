package com.vn.dth.reposetory;

import com.vn.dth.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductReponsitory extends JpaRepository< ProductEntity, Long> {
}
