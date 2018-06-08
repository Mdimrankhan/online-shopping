package net.imr.shoppingbackend.dao;

import java.util.List;

import net.imr.shoppingbackend.dto.Category;

public interface CategoryDAO {

	
	List<Category> list();
	Category get(int id);
	
	
}
