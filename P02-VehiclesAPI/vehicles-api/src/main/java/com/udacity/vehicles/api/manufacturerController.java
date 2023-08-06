package com.udacity.vehicles.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.udacity.vehicles.domain.manufacturer.ManufacturerRepository;

@RestController
@RequestMapping("/manufacturers")
class manufacturerController {

	@Autowired
	private ManufacturerRepository manufacturerRepository;

	@GetMapping
	public ResponseEntity<?> list() {
		return new ResponseEntity<List<?>>(manufacturerRepository.findAll(), HttpStatus.OK);
	}

}
