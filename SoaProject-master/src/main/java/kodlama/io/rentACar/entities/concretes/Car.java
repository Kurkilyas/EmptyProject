package kodlama.io.rentACar.entities.concretes;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name="cars") //veri tabanında tablo oluşturur.
@Getter //değişkenlerin getter fonksiyonlarını oluşturur.
@Setter //değişkenlerin setter fonkisyonlarını oluşturur.
@AllArgsConstructor //değişkenlerin parametreli cunstructor oluşturur
@NoArgsConstructor //değişkenlerin parametresiz cunstructor oluşturur
@Entity //varlık olduğunu belirtir.

public class Car {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	@Column(name="id") //veri tabanındaki kolon ismi
	private int id;
	
	@Column(name="plate")
	private String plate;
	
	@Column(name="dailyPrice")
	private double dailyPrice;
	
	@Column(name ="modelYear")
	private int modelYear;
	
	/*
	 * @Column(name ="state") private String state; // müsait , kiralık , bakımda
	 * //ayrı tablo
	 * 
	 * @Column(name="carStatus") private String carStatus; //ayrı tablo
	 * 
	 * @Column(name="color") private String color; //ayrı tablo
	 * 
	 * @Column(name="fuel") private String fuel; //ayrı tablo
	 * 
	 * @Column(name="gear") private String gear;
	 */
	
	@Column(name="km")
	private String km;
	
	@Column(name="dateOfAnnouncement")
	private String dateOfAnnouncement; 
	
	  //ayrı tablo
	
	
	@ManyToOne
	@JoinColumn(name="model_id")
	private Model model;
	@ManyToOne
	@JoinColumn(name = "colorId")
	private Color color;
	@ManyToOne
	@JoinColumn(name="stateId")
	private State state;
	@ManyToOne 
	@JoinColumn(name = "fuelId")
	private Fuel fuel;
	@ManyToOne 
	@JoinColumn(name = "gearId")
	private Gear gear;
	@ManyToOne 
	@JoinColumn(name = "statusId")
	private Status status;
}