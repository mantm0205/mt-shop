package com.mtshop.setting.repository;

import com.mtshop.common.entity.Country;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CountryRepository extends CrudRepository<Country, Integer> {
    List<Country> findAllByOrderByNameAsc();

    Country findByCode(String code);
}
