package com.embraer.abb_fase_iv_api.domain.repository;

import com.embraer.abb_fase_iv_api.domain.model.TransdutorMQTT;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransdutorMQTTRepository extends JpaRepository<TransdutorMQTT, Long> {
}
