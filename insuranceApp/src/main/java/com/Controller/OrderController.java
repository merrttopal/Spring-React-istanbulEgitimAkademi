package com.Controller;

import com.entities.OrderTable;
import com.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/order")
public class OrderController {


    final OrderService orderService;

    @PostMapping("/save")
    public ResponseEntity save(@RequestBody OrderTable order){
        return orderService.save(order);
    }

    @GetMapping("/list")
    public ResponseEntity listPage(){
        return orderService.orderList(3);
    }


    @GetMapping("/delete/{oid}")
    public ResponseEntity delete(@PathVariable Long oid){
        return orderService.delete(oid);
    }
}
