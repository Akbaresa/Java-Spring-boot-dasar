package learnJava.spring.core.service;

import learnJava.spring.core.repository.ProductRepository;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
// jika ingin menambahkan annotation dari bean tinggal tambahi

//@Scope("prototype")
//@Lazy
@Component
public class ProductService {

    @Getter
    private ProductRepository productRepository;

    //jika overloading maka yang autowired yang akan dipanggil
    @Autowired
    public ProductService(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    public ProductService(ProductRepository productRepository , String name){
        this.productRepository = productRepository;
    }
}
