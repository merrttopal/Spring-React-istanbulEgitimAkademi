package com.works.restControllers;

import com.works.Models.XmlCurrency;
import com.works.service.XmlRead;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/xml")
public class XmlRestController {
    final XmlRead xmlRead;

    @GetMapping("/read")
    public List<XmlCurrency>  read(){
       List<XmlCurrency> ls = xmlRead.result();
        return  ls;
    }


}
