package br.com.shmapu.atividade2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import jakarta.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/requisicao")
public class ReqController {

   @GetMapping("")
   @ResponseBody
   public String hello(HttpServletRequest request) {

      String metodo = request.getMethod();
      String uri = request.getRequestURI();
      String protocolo = request.getProtocol();
   
      String resposta = "Metodo: " + metodo +  " URI: " + uri + " Protocolo: " + protocolo;

      return resposta;
   }
}