package banhang.controller;

import java.util.List;

import javax.persistence.Entity;
import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import banhang.entity.ProductEntity;
@Transactional
@Controller
public class ProductController {

	@Autowired
	SessionFactory factory;

	@RequestMapping("shop")
	public String shop(ModelMap model) {
		List<ProductEntity> product = this.getProduct();
		model.addAttribute("product", product);
		
		//System.out.println(product.get(0).getTenHang());
		
		return "shop";
	}

//Hàm get dữ liệu dưới DB lêns public List<ProductEntity>
	
	public List<ProductEntity> getProduct() {
		Session session = factory.getCurrentSession();
		String hql = "FROM ProductEntity";
		Query query = session.createQuery(hql);
		List<ProductEntity> list = query.list();
		
		
		return list;
	}
}
