package ie.atu.cicdweek5;


import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class product {
    @Min(value = 1, message ="ID must be greater than 0" )
    private int id;
    @NotBlank(message = "name cannot be blank")
    private String name ;
    @Min(value = 0, message ="price must be positive" )
    private double price;


}
