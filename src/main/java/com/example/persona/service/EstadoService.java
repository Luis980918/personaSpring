package com.example.persona.service;

import com.example.persona.model.Estado;
import com.example.persona.repository.EstadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EstadoService implements EstadoRepository{

    @Autowired
    private EstadoRepository estadoRepository;

    @Override
    public List<Estado> findAll() {
        return estadoRepository.findAll();
    }

    @Override
    public List<Estado> findAll(Sort sort) {
        return estadoRepository.findAll(sort);
    }

    @Override
    public Page<Estado> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Estado> findAllById(Iterable<Long> iterable) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }
    public List<Estado>findAllByCountry(long id){
        List<Estado> estadosRespuesta=new ArrayList<>();
        List<Estado> estados=estadoRepository.findAll();
        for(int i=0; i<estados.size(); i++){
            if(estados.get(i).getPais().getId()==id){
                estadosRespuesta.add(estados.get(i));
            }
        }
        return estadosRespuesta;
    }

    @Override
    public void delete(Estado estado) {

    }

    @Override
    public void deleteAll(Iterable<? extends Estado> iterable) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends Estado> S save(S s) {
        return null;
    }

    @Override
    public <S extends Estado> List<S> saveAll(Iterable<S> iterable) {
        return null;
    }

    @Override
    public Optional<Estado> findById(Long aLong) {
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
    public <S extends Estado> S saveAndFlush(S s) {
        return null;
    }

    @Override
    public void deleteInBatch(Iterable<Estado> iterable) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Estado getOne(Long aLong) {
        return null;
    }

    @Override
    public <S extends Estado> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Estado> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Estado> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Estado> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Estado> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Estado> boolean exists(Example<S> example) {
        return false;
    }
}
