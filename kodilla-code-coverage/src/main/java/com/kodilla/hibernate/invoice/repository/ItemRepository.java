package com.kodilla.hibernate.invoice.repository;

import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public interface ItemRepository extends CrudRepository <Item, Integer> {
    List<Item> findById(int id);
}