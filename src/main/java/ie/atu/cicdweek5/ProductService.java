package ie.atu.cicdweek5;


import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    private List<product> myList = new ArrayList<>();
    public List<product> addProduct(product Product)
    {
        //do business stuff like retrieving details from DB, or generating files from pdfs
        myList.add(Product);
        return myList;
    }
}
