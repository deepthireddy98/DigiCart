package com.controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.daoimpl.CategoryDaoImpl;
import com.daoimpl.SupplierDaoImpl;
import com.model.Category;
import com.model.Supplier;
@Controller
@Configuration
public class adminController {

	 //@Autowired
	CategoryDaoImpl categoryDaoImpl;

	// @Autowired
	SupplierDaoImpl supplierDaoImpl;
//
//	// @Autowired
//	ProductDaoImpl productDaoImpl;
	

	@RequestMapping(value = { "/admin" }, method = RequestMethod.GET)
	public String adminPage() {
		return "AdminAdd";
	}

	@RequestMapping(value = "/saveCat", method = RequestMethod.POST)
	public ModelAndView saveCategotyData(@RequestParam("cid")int cid, @RequestParam("cname") String cname) {
		ModelAndView mv = new ModelAndView();
		Category category = new Category();
		category.setCid(cid);
		category.setCname(cname);

		categoryDaoImpl.insertCategory(category);

		mv.setViewName("home");
		return mv;
	}

	// save supplier
	@RequestMapping(value = "/admin/saveSupplier", method = RequestMethod.POST)
	public ModelAndView saveSupplierData(@RequestParam("sid") int sid, @RequestParam("sname") String sname) {
		ModelAndView mv = new ModelAndView();

		Supplier supplier = new Supplier();
		supplier.setSid(sid);
		supplier.setSname(sname);
		supplierDaoImpl.insertSupp(supplier);
		mv.setViewName("AdminAdd");
		return mv;
	}

//	// save Product
//	@RequestMapping(value = "/saveProduct", method = RequestMethod.POST)
//	public String saveProduct(HttpServletRequest req, @RequestParam("file") MultipartFile file) {
//
//		Product product = new Product();
//		product.setProductName(req.getParameter("pname"));
//		product.setProductDescription(req.getParameter("pDesc"));
//		product.setProductPrice(Float.parseFloat(req.getParameter("pPrice")));
//		product.setStock(Integer.parseInt(req.getParameter("pStock")));
//
//		String filePath = req.getSession().getServletContext().getRealPath("/");
//		String fileName = file.getOriginalFilename();
//		productDaoImpl.insertProduct(product); // create ProductDao
//
//		try {
//			byte[] imageByte = file.getBytes();
//			BufferedOutputStream fos = new BufferedOutputStream(
//					new FileOutputStream(filePath + "/resources/" + fileName));
//			fos.write(imageByte);
//			fos.close();
//		} catch (Exception e) {
//		}
//
//		return "AdminAdd";
//	}
}
