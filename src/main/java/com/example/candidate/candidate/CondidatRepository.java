package com.example.candidate.candidate;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;




public interface CondidatRepository extends JpaRepository<Condidat,Integer> {
    @Query("SELECT C FROM Condidat C WHERE C.nom LIKE:nom")
    public Page<Condidat> CondidatByNom(@Param("nom") String n, Pageable P);

}
