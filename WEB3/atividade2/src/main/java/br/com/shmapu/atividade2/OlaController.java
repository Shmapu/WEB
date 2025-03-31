package br.com.shmapu.atividade2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.GetMapping;




@Controller
@RequestMapping("")
public class OlaController {

   @GetMapping("/ola")
   @ResponseBody
   public String ola(){
      return "Ola Mundo!";
   }
   
}
