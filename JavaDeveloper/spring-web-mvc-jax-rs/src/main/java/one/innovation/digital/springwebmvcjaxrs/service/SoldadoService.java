package one.innovation.digital.springwebmvcjaxrs.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import one.innovation.digital.springwebmvcjaxrs.controller.request.SoldadoEditRequest;
import one.innovation.digital.springwebmvcjaxrs.controller.response.SoldadoListResponse;
import one.innovation.digital.springwebmvcjaxrs.controller.response.SoldadoResponse;
import one.innovation.digital.springwebmvcjaxrs.dto.Soldado;
import one.innovation.digital.springwebmvcjaxrs.entity.SoldadoEntity;
import one.innovation.digital.springwebmvcjaxrs.repository.SoldadoRepository;
import one.innovation.digital.springwebmvcjaxrs.resource.ResourceSoldado;
import org.springframework.stereotype.Service;

import javax.annotation.Resources;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class SoldadoService {

    private SoldadoRepository soldadoRepository;
    private ObjectMapper objectMapper;
    private ResourceSoldado resourceSoldado;

    public SoldadoService(SoldadoRepository soldadoRepository, ObjectMapper objectMapper, ResourceSoldado resourceSoldado){
        this.soldadoRepository = soldadoRepository;
        this.objectMapper = objectMapper;
        this.resourceSoldado = resourceSoldado;
    }

    public SoldadoResponse buscarSoldado(Long id){
        SoldadoEntity soldado = soldadoRepository.findById(id).orElseThrow();
        SoldadoResponse soldadoResponse = objectMapper.convertValue(soldado, SoldadoResponse.class);
        return soldadoResponse;
    }

    public void criarSoldado(Soldado soldado){
        SoldadoEntity soldadoEntity = objectMapper.convertValue(soldado, SoldadoEntity.class);
        soldadoRepository.save(soldadoEntity);
    }

    public void alterarSoldado(Long id, SoldadoEditRequest soldadoEditRequest) {
        SoldadoEntity soldadoEntity = objectMapper.convertValue(soldadoEditRequest, SoldadoEntity.class);
        soldadoEntity.setId(id);
        soldadoRepository.save(soldadoEntity);
    }

    public void deletarSoldado(Long id) {
        SoldadoEntity soldado = soldadoRepository.findById(id).orElseThrow();
        soldadoRepository.delete(soldado);
    }

    public Resources<SoldadoListResponse> buscarSoldados(){
        List<SoldadoEntity> all = soldadoRepository.findAll();
        List<SoldadoListResponse> soldadoStream = all.stream()
                .map(it -> resourceSoldado.criarLink(it))
                .collect(Collectors.toList());
        return new Resources<>(soldadoStream);
    }

}
