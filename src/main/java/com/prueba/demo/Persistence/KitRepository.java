
package com.prueba.demo.Persistence;

import com.prueba.demo.Domain.Khit;
import com.prueba.demo.Domain.Repository.KhitRepository;
import com.prueba.demo.Persistence.CRUD.KitCrudRepository;
import com.prueba.demo.Persistence.Entity.Kit;
import com.prueba.demo.Persistence.Mapper.KhitMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class KitRepository implements KhitRepository {

    @Autowired
    private KitCrudRepository kitCrudRepository;

    @Autowired
    private KhitMapper khitMapper;


    @Override
    public List<Khit> getAll() {
        List<Kit> Kits = (List<Kit>) kitCrudRepository.findAll();
        return khitMapper.toKhits(Kits);
    }

    @Override
    public Optional<Khit> getRegister(int id) {
        return kitCrudRepository.findById(id).map(kit -> khitMapper.toKhit(kit));
    }

    @Override
    public String getOnlyOney(int id) {
        return "mensaje de prueba de metodo kit=  "+ id;
    }
}


