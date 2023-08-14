package com.service;

import com.configs.Standard;
import com.entities.OrderTable;
import com.repositories.OrderTableRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class OrderService {
    final OrderTableRepository orderRepository;

    public ResponseEntity save(OrderTable order){
        try{
            orderRepository.save(order);
            Standard standard = new Standard(true,order);
            ResponseEntity responseEntity = new ResponseEntity<>(standard, HttpStatus.OK);
            return responseEntity;
        }catch (Exception ex){
            Standard standard = new Standard(false,ex.getMessage());
            ResponseEntity responseEntity = new ResponseEntity<>(standard,HttpStatus.BAD_REQUEST);
            return responseEntity;
        }
    }

    public ResponseEntity delete(Long oid){
        Optional<OrderTable> order = orderRepository.findById(oid);
        try {
            if(order.isPresent()){
                orderRepository.deleteById(oid);
                Standard standard = new Standard(true,order.get());
                ResponseEntity responseEntity = new ResponseEntity<>(standard,HttpStatus.OK);
                return responseEntity;
            }
        }catch (Exception ex){
            Standard standard = new Standard(false,ex.getMessage());
            ResponseEntity responseEntity = new ResponseEntity<>(standard,HttpStatus.BAD_REQUEST);
            return responseEntity;
        }
        return null;
    }


    public ResponseEntity orderList(int page) {
        Sort sort = Sort.by("oid");
        Pageable pageable = PageRequest.of(page, 20, sort);
        List<OrderTable> orders = (List<OrderTable>) orderRepository.findAll(pageable);
        try {
            Standard standard = new Standard(true, orders);
            ResponseEntity responseEntity = new ResponseEntity<>(standard, HttpStatus.OK);
            return responseEntity;
        } catch (Exception ex) {
            Standard standard = new Standard(false, ex.getMessage());
            ResponseEntity responseEntity = new ResponseEntity<>(standard, HttpStatus.BAD_REQUEST);
            return responseEntity;
        }
    }
}
