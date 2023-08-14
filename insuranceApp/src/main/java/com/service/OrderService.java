package com.service;


import com.configs.Standard;
import com.entities.OrderTable;
import com.repositories.OrderTableRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

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

}
