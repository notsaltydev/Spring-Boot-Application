package com.boot.repository;

import com.boot.model.Shipwreck;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Adam on 06.05.2016.
 */
public interface ShipwreckRepository extends JpaRepository<Shipwreck, Long> {

}
