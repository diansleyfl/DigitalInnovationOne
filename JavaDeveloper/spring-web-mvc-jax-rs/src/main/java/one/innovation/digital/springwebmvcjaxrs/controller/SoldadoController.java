package one.innovation.digital.springwebmvcjaxrs.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import one.innovation.digital.springwebmvcjaxrs.controller.request.SoldadoEditRequest;
import one.innovation.digital.springwebmvcjaxrs.controller.response.SoldadoListResponse;
import one.innovation.digital.springwebmvcjaxrs.controller.response.SoldadoResponse;
import one.innovation.digital.springwebmvcjaxrs.dto.Soldado;
import one.innovation.digital.springwebmvcjaxrs.service.SoldadoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

import javax.annotation.Resources;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/v1/soldado")
public class SoldadoController {

    private SoldadoService soldadoService;
    private ObjectMapper objectMapper;

    public SoldadoController(SoldadoService soldadoService, ObjectMapper objectMapper) {
        this.soldadoService = soldadoService;
        this.objectMapper = objectMapper;
    }

    @GetMapping
    public ResponseEntity<Resources>SoldadoListResponse>> buscarSoldados(){
        Resources<SoldadoListResponse> soldadoListResponses = soldadoService.buscarSoldados();
        return ResponseEntity.status(HttpStatus.OK).body(soldadoListResponses);
    }

    @GetMapping("/{id}")
    public ResponseEntity<SoldadoResponse> buscarSoldado(@PathVariable() Long id){
        SoldadoResponse soldadoResponse = soldadoService.buscarSoldado(id);
        return ResponseEntity.status(HttpStatus.OK).body(soldadoResponse);
    }

    @PostMapping
    public ResponseEntity criarSoldado(@RequestBody Soldado soldado){
        soldadoService.criarSoldado(soldado);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @PutMapping("/{id}")
    public ResponseEntity editarSoldado(@PathVariable() Long id,
                                        @RequestBody SoldadoEditRequest soldadoEditRequest){
        soldadoService.alterarSoldado(id, soldadoEditRequest);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deletarSoldado(@PathVariable Long id){
        soldadoService.deletarSoldado(id);
        return ResponseEntity.ok().build();
    }

}
