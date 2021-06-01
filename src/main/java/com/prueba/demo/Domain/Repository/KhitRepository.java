package com.prueba.demo.Domain.Repository;

import com.prueba.demo.Domain.Khit;
import java.util.List;
import java.util.Optional;

public interface KhitRepository {

    List<Khit> getAll();
    Optional<Khit> getRegister(int id);
    String getOnlyOney(int id);
}

