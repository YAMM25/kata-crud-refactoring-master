/*package co.com.sofka.crud.controllers;

import co.com.sofka.crud.entity.ListTodo;
import co.com.sofka.crud.services.ListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public interface ListController {
    @Autowired
    private ListService serviceList;

    @GetMapping(value = "api/serviceList")
    public Iterable<ListTodo> list(){
        return ListService.list();
    }

    @PostMapping(value = "api/serviceList")
    public MayorList save(@RequestBody MayorList mayorList){
        return serviceMayorList.save(mayorList);
    }

    @PutMapping(value = "api/mayorlist")
    public ListTodo update(@RequestBody ListTodo mayorList){
        if(mayorList.getId() != null){
            return serviceMayorList.save(mayorList);
        }
        throw new RuntimeException("No existe el id para actualziar");
    }

    @DeleteMapping(value = "api/{id}/mayorlist")
    public void delete(@PathVariable("id")Long id){
        serviceMayorList.delete(id);
    }

    @GetMapping(value = "api/{id}/mayorlist")
    public MayorList get(@PathVariable("id") Long id){
        return serviceMayorList.get(id);
    }
}*/
