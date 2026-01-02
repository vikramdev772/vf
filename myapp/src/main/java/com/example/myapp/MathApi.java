package com.example.myapp;
import java.lang.annotation.Repeatable;
import java.util.*;
import com.example.myapp.math.Sum;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class MathApi {
    @GetMapping("/sum")
    HashMap<Object,Object> sumofN(@RequestParam int n){
        HashMap<Object,Object> res=new HashMap<>();
        res.put("msg","welcome to the sum api ");
        res.put("Parameter",n);
        res.put("sum of n",Sum.s(n));

        return res;
    }
    
}
