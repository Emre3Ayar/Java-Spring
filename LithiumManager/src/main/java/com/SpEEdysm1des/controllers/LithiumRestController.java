package com.SpEEdysm1des.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SpEEdysm1des.models.BatteryModel;
import com.SpEEdysm1des.services.BatteriesBusinessServiceInterface;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/batteries")
public class LithiumRestController {
	BatteriesBusinessServiceInterface service;
	@Autowired
	public LithiumRestController(BatteriesBusinessServiceInterface service) {
		super();
		this.service = service;
	}

	@GetMapping("/JSON")
	public List<BatteryModel> showAllOrders(Model model)
	{	
		List<BatteryModel> batteries = service.CarouselConsoles();
		model.addAttribute("consoles", batteries);
		return batteries;
	}
	@GetMapping("/consolesJSON")
	public List<BatteryModel> showAllConsoles(Model model)
	{	
		List<BatteryModel> batteries = service.getBatteries();
		model.addAttribute("consoles", batteries);
		return batteries;
	}
	@GetMapping("/search/{searchTerm}")
	public List<BatteryModel> searchOrders(@PathVariable(name="searchTerm") String searchTerm)
	{	
		List<BatteryModel> batteries = service.searchBatteries(searchTerm);
		return batteries;
	}
	@GetMapping("/get/{id}")
	public BatteryModel searchOrders(@PathVariable(name="id") long id)
	{	
		BatteryModel batteries = service.getById(id);
		return batteries;
	}
}
