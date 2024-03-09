package com.UnicornioAzulSA.reto_2.service;

import com.UnicornioAzulSA.reto_2.entity.Temperatura;
import com.UnicornioAzulSA.reto_2.repository.TemperaturaRepository;
import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TemperaturaService {
    @Autowired
    TemperaturaRepository temperaturaRepository;
    public Optional<Temperatura> getTemperatura(Long id){
        return  temperaturaRepository.findAllById(id);
    }
    public void saveOrUpdate(Temperatura temperatura){
        temperaturaRepository.save(temperatura);

    }
    public void delete(long id){
        temperaturaRepository.deleteById(id);

    }
}
