package com.prueba.demo.Domain.Repository;

import com.prueba.demo.Domain.Khit;
import java.util.List;
import java.util.Optional;

public interface KhitRepository {

    /*Aca solo vamos a indicar los nombres de los metodos que cualquier repositorio que vaya a trabajar
    * con kits tenga que implementar */

    List<Khit> getAll();
    /*
    List<Khit> ShowTitle(String title);

     */
    Optional<Khit> getRegister(int KhitId);
}

