package kodlama.io.rentACar.webApi.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import kodlama.io.rentACar.business.abstracts.CarService;
import kodlama.io.rentACar.business.requests.car.CreateCarRequest;
import kodlama.io.rentACar.business.requests.car.UpdateCarRequest;
import kodlama.io.rentACar.business.responses.car.GetAllCarResponse;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/cars")
@AllArgsConstructor
public class CarsController {
	private CarService carService;
	@GetMapping()
	public List<GetAllCarResponse> getAll()
	{
		return this.carService.getAll();
	}
	@GetMapping("/{id}")
	public GetAllCarResponse getById(@PathVariable int id)
	{
		return this.carService.getById(id);
	}
	@PostMapping()
	@ResponseStatus(code=HttpStatus.CREATED)
	public void add(@RequestBody() @Valid() CreateCarRequest createCarRequest)
	{
		this.carService.add(createCarRequest);
	}
	@PutMapping
	public void update(@RequestBody UpdateCarRequest uptadeCarRequest)
	{
		this.carService.update(uptadeCarRequest);
	}
	@DeleteMapping("/{id}")
	public void delete(@PathVariable int id)
	{
		this.carService.delete(id);
	}
	
}
