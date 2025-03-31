package br.com.shmapu.atividade2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/cabecalhos")
public class CabecalhoController {

   @GetMapping("")
   @ResponseBody
   public String cabecalhos(HttpServletRequest request) {
     
     String host = request.getHeader("Host");
     String userAgent = request.getHeader("User-Agent");
     String accept = request.getHeader("Accept-encoding");
     String language = request.getHeader("Accept-language");

     String resposta =  "Host: " + host + " User-Agent: " + userAgent + " Accept-encoding: " + accept + " Accept-language: " + language;

     return resposta;   
   }
   
}