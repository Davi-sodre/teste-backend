package com.example.lab_prog;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class h {

   @GetMapping("/oi")
   public String M(@RequestParam("n1") String n) {
       return  "resultado = " +n;
   }
   
 

}
