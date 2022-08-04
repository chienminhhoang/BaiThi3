package com.example.demo4.service;

import java.util.ArrayList;

public interface ICRUD <E>{
    E findById(int id);

    ArrayList<E> findAll();

    void create(E e);

    void update(E e);

    void deleteById(int id);
}
