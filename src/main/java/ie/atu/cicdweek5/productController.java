package ie.atu.cicdweek5;


import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
@RestController
@RequestMapping("/products")
public class productController {
    private ProductService myService;


    public productController(ProductService myService) {
        this.myService = myService;
        list.add(new product(1,"phone",600.0));
        list.add(new product(2,"tablet",400.0));
    }

    private List<product> list = new ArrayList<>();
    // creating a class which is interested in requests and responses. Separation of concern

    @GetMapping
    public List<product> getAllProducts(){
        return list;
    }
    @PostMapping
    public List<product> newProduct (@RequestBody product Product)
    {
        list =  myService.addProduct(Product);
        //send it to do business logic
        return list;
    }

    @PutMapping("/{id}")
    public product updateProduct(@PathVariable("id") int id, @RequestBody product updatedProduct) {
        for (product prod : list) {
            if (prod.getId() == (id)) {
                prod.setName(updatedProduct.getName());
                prod.setPrice(updatedProduct.getPrice());
                return prod;
            }
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public String deleteProduct(@PathVariable("id") int id) {
        for (product p : list) {
            if (p.getId() == (id)) {
                list.remove(p);
                return "Product with ID " + id + " has been deleted.";
            }
        }
        return id + " not found.";
    }


}
