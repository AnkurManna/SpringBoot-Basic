package test.springboot.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import test.springboot.repository.*;
import test.springboot.models.*;
@Service
public class ItemsService {
	
	@Autowired
	ItemsRepository itemRepo;
	
	public List<ItemModel>getAllItems()
	{
		List<ItemModel> items = new ArrayList<ItemModel>();  
		itemRepo.findAll().forEach(item -> items.add(item));  
		return items;  
	}
	
	public void saveOrUpdate(ItemModel item)   
	{  
		itemRepo.save(item);  
	}  
}
