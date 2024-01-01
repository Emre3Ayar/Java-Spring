package com.thinkcontructive.restde.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thinkcontructive.restde.model.CloudVendor;

@RestController
@RequestMapping("/cloudvendor")
public class CloudAPIService {
	@GetMapping("{vendorId}")
	public CloudVendor getCloudVendorDetails(String vendorId)
	{
		return new CloudVendor("C1", "Emre", "Koolmijnlaan", "045432135");
	}
}
