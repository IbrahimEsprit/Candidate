package com.example.candidate.candidate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CondidatService {
    @Autowired
    private CondidatRepository CR;
    public Condidat AddCondidat(Condidat C){
        return CR.save(C);
    }

    public Condidat UpdateCondidat(int id,Condidat newC){
        if(CR.findById(id).isPresent()){
            Condidat existedC= CR.findById(id).get();
            existedC.setNom(newC.getNom());
            existedC.setPrenom(newC.getPrenom());
            existedC.setEmail(newC.getEmail());
            return CR.save(existedC);
        }
        else {
            return null;
        }
    }
    public String DeleteCondidat(int id){
        if(CR.findById(id).isPresent()){
            CR.deleteById(id);
            return "Condidat supprimé";
        }
        else {
            return "Condidat non supprimé";
        }
    }
}
