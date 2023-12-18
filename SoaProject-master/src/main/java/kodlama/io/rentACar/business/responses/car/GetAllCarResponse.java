package kodlama.io.rentACar.business.responses.car;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllCarResponse {
	
	private int Id;
	
	private String plate;
	 
    private double dailyPrice;
	 
	private int modelYear;
  
	
	private String carState; // müsait , kiralık , bakımda 
	
	private String km;
	
	private String dateOfAnnouncement;
	
	private String carStatus;
	
	private String colorName;
	
	private String carFuel;
	
	private String carGear;
	  
	private String modelName;
}
