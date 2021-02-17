package one.innovation.digital.springwebmvcjaxrs.repository;

import one.innovation.digital.springwebmvcjaxrs.entity.SoldadoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SoldadoRepository extends JpaRepository<SoldadoEntity, Long> {
}
