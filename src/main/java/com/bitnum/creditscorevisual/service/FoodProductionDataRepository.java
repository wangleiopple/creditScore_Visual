package com.bitnum.creditscorevisual.service;

import com.bitnum.creditscorevisual.entity.FoodProductionData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import java.util.List;

public interface FoodProductionDataRepository extends JpaRepository<FoodProductionData,Long> {

    @Query(value = "SELECT area ,COUNT (1) AS  counts FROM food_production_data GROUP  BY area",nativeQuery = true)
    Object getEnterpriseDistributionData();

}
