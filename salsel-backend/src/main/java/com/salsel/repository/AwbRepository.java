package com.salsel.repository;

import com.salsel.model.Awb;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AwbRepository extends JpaRepository<Awb, Long> {
    @Modifying
    @Query("UPDATE Awb a SET a.status = false WHERE a.id = :id")
    void setStatusInactive(@Param("id") Long id);

    @Query("SELECT a FROM Awb a WHERE a.status = true ORDER BY a.id DESC")
    List<Awb> findAllInDesOrderByIdAndStatus();

    @Query("SELECT a FROM Awb a WHERE a.id = :awbId AND a.status = true")
    Awb findByIdWhereStatusIsTrue(@Param("awbId") Long awbId);

}
