package guitarshop.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Entity
@Table(name = "guitars")
public class Guitar {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Column(nullable = false)
    private String brand;

    @NotBlank
    @Column(nullable = false)
    private String modelName;

    @NotBlank
    @Column(nullable = false)
    private String modelNumber;

    @NotBlank
    @Column(nullable = false)
    private String type;

    @NotBlank
    @Column(nullable = false)
    private String topWood;

    @NotBlank
    @Column(nullable = false)
    private String backWood;

    @NotBlank
    @Column(nullable = false)
    private String sidesWood;

    @NotNull
    @DecimalMin("0.01")
    @Column(nullable = false)
    private double price;

    @Column(length = 1000)
    private String description;

    @Min(0)
    @Column(nullable = false)
    private int inventory;

    public Guitar() {}

    public Guitar(String brand, String modelName, String modelNumber, String type,
                  String topWood, String backWood, String sidesWood,
                  double price, String description, int inventory) {
        this.brand = brand;
        this.modelName = modelName;
        this.modelNumber = modelNumber;
        this.type = type;
        this.topWood = topWood;
        this.backWood = backWood;
        this.sidesWood = sidesWood;
        this.price = price;
        this.description = description;
        this.inventory = inventory;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getBrand() { return brand; }
    public void setBrand(String brand) { this.brand = brand; }
    public String getModelName() { return modelName; }
    public void setModelName(String modelName) { this.modelName = modelName; }
    public String getModelNumber() { return modelNumber; }
    public void setModelNumber(String modelNumber) { this.modelNumber = modelNumber; }
    public String getType() { return type; }
    public void setType(String type) { this.type = type; }
    public String getTopWood() { return topWood; }
    public void setTopWood(String topWood) { this.topWood = topWood; }
    public String getBackWood() { return backWood; }
    public void setBackWood(String backWood) { this.backWood = backWood; }
    public String getSidesWood() { return sidesWood; }
    public void setSidesWood(String sidesWood) { this.sidesWood = sidesWood; }
    public double getPrice() { return price; }
    public void setPrice(Double price) { this.price = price; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public int getInventory() { return inventory; }
    public void setInventory(Integer inventory) { this.inventory = inventory; }
}
