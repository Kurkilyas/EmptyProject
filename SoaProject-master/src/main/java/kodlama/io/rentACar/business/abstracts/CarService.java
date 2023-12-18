package kodlama.io.rentACar.business.abstracts;

import java.util.List;

import kodlama.io.rentACar.business.requests.car.CreateCarRequest;
import kodlama.io.rentACar.business.requests.car.UpdateCarRequest;
import kodlama.io.rentACar.business.responses.car.GetAllCarResponse;

public interface CarService {
	List<GetAllCarResponse>  getAll();
	public void add(CreateCarRequest createCarRequest);
	public void update(UpdateCarRequest updateCarRequest);
	public void delete(int id);
	GetAllCarResponse getById(int id);

}
