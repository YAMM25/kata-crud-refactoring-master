package co.com.sofka.crud.repository;

import co.com.sofka.crud.entity.MayorList;
import co.com.sofka.crud.entity.Todo;
import org.springframework.data.repository.CrudRepository;

public interface ListRepository extends CrudRepository<MayorList, Long> {

}
