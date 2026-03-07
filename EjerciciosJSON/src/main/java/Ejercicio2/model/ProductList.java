package Ejercicio2.model;

import lombok.Data;

import java.util.List;

@Data
public class ProductList {

        private List<Ejercicio2.model.Product> products;
        private long total;
        private long skip;
        private long limit;

}
