package com.prueba.demo.Domain.Service;

import com.prueba.demo.Domain.Khit;
import com.prueba.demo.Domain.Repository.KhitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class KhitService {

    @Autowired
    private KhitRepository khitRepository;

    public List<Khit> getAll(){ return khitRepository.getAll(); }
    public Optional<Khit> getRegister(int id){ return khitRepository.getRegister(id); }
    public String getOnlyOney(int id){ return khitRepository.getOnlyOney(id);}
}

