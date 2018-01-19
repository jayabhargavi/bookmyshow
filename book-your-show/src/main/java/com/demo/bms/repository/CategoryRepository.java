package com.demo.bms.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.bms.entity.CategoryInfo;

@Repository
public interface CategoryRepository extends JpaRepository<CategoryInfo, Serializable>{
	
	CategoryInfo findByCategoryName(String categoryName);

	CategoryInfo findByCategoryId(Integer categoryId);

}
