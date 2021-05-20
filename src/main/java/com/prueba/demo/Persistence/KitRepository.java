
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

    /*
    1  VER VIDEO 23
    public List<Kit> getTodos(){
        return (List<Kit>) kitCrudRepository.findAll();
    }

    2
    public List<Kit> Mostrartitulos(String titulo){
        return kitCrudRepository.findByIdTitulo(titulo);
    }

    3
    public Optional<Kit> getRegistro(int id){
        return kitCrudRepository.findById(id);
    }
    */

    @Override
    public List<Khit> getAll() {
        List<Kit> Kits = (List<Kit>) kitCrudRepository.findAll();
        return khitMapper.toKhits(Kits);
    }

    /*
    @Override
    public List<Khit> ShowTitle(String title) {
        List<Kit> khits= kitCrudRepository.findByIdTitulo(title);
        return khitMapper.toKhits(khits);
    }

     */

    @Override
    public Optional<Khit> getRegister(int KhitId) {
        return kitCrudRepository.findById(KhitId).map(kit -> khitMapper.toKhit(kit));
    }
}


