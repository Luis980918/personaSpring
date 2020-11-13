package com.example.persona.service;

import com.example.persona.model.Pais;
import com.example.persona.repository.PaisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PaisService implements PaisRepository{

    @Autowired
    private PaisRepository paisRepository;

    @Override
    public List<Pais> findAll() {
        return paisRepository.findAll();
    }

    @Override
    public List<Pais> findAll(Sort sort) {
        return paisRepository.findAll(sort);
    }

    @Override
    public Page<Pais> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Pais> findAllById(Iterable<Long> iterable) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(Pais pais) {

    }

    @Override
    public void deleteAll(Iterable<? extends Pais> iterable) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends Pais> S save(S s) {
        return null;
    }

    @Override
    public <S extends Pais> List<S> saveAll(Iterable<S> iterable) {
        return null;
    }

    @Override
    public Optional<Pais> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends Pais> S saveAndFlush(S s) {
        return null;
    }

    @Override
    public void deleteInBatch(Iterable<Pais> iterable) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Pais getOne(Long aLong) {
        return null;
    }

    @Override
    public <S extends Pais> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Pais> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Pais> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Pais> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Pais> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Pais> boolean exists(Example<S> example) {
        return false;
    }
}
