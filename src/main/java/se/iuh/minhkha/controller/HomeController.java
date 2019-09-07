package se.iuh.minhkha.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import se.iuh.minhkha.dao.NhanVienDao;
import se.iuh.minhkha.entity.NhanVien;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	@Autowired
	NhanVienDao nvdao;
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {
		List<NhanVien> dsnv = nvdao.dsNhanVien();
		model.addAttribute("dsnv", dsnv);
		return "home";
	}
	
	@RequestMapping(value = "/xoa/{maNV}")
	public String xoa(@PathVariable int maNV) {
		nvdao.xoaNV(maNV);
		return "redirect:/";
	}
	@RequestMapping("/them")
	public String themNV(Model model) {
		NhanVien nv = new NhanVien();
		model.addAttribute("nv", nv);
		List<NhanVien> ds = nvdao.dsNhanVien();
		model.addAttribute("ds", ds);
		return "redirect:/";
	}
}
