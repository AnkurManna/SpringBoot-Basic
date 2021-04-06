package test.springboot.repository;
import org.springframework.data.repository.CrudRepository;  
import test.springboot.models.*;  
public interface ItemsRepository extends CrudRepository<ItemModel,Integer>{

};
