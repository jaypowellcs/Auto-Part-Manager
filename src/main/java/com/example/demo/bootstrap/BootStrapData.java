package com.example.demo.bootstrap;

import com.example.demo.domain.InhousePart;
import com.example.demo.domain.OutsourcedPart;
import com.example.demo.domain.Part;
import com.example.demo.domain.Product;
import com.example.demo.repositories.OutsourcedPartRepository;
import com.example.demo.repositories.PartRepository;
import com.example.demo.repositories.ProductRepository;
import com.example.demo.service.OutsourcedPartService;
import com.example.demo.service.OutsourcedPartServiceImpl;
import com.example.demo.service.ProductService;
import com.example.demo.service.ProductServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

/**
 *
 *
 *
 *
 */
@Component
public class BootStrapData implements CommandLineRunner {

    private final PartRepository partRepository;
    private final ProductRepository productRepository;
    private final OutsourcedPartRepository outsourcedPartRepository;

    public BootStrapData(PartRepository partRepository, ProductRepository productRepository, OutsourcedPartRepository outsourcedPartRepository) {
        this.partRepository = partRepository;
        this.productRepository = productRepository;
        this.outsourcedPartRepository=outsourcedPartRepository;
    }

    @Override
    public void run(String... args) throws Exception {


        if(partRepository.count() == 0 && productRepository.count() == 0  && outsourcedPartRepository.count() ==0) {

            InhousePart brakePads  =  new InhousePart();
            brakePads.setName("Brake Pads");
            brakePads.setPrice(29.99);
            brakePads.setInv(50);
            brakePads.setMaxInv(500);
            brakePads.setMinInv(0);

            InhousePart battery =  new InhousePart();
            battery.setName("Battery");
            battery.setPrice(69.99);
            battery.setInv(20);
            battery.setMaxInv(500);
            battery.setMinInv(0);

            InhousePart sparkPlugs =  new InhousePart();
            sparkPlugs.setName("Spark Plugs");
            sparkPlugs.setPrice(129.99);
            sparkPlugs.setInv(35);
            sparkPlugs.setMaxInv(500);
            sparkPlugs.setMinInv(0);

            InhousePart headLights =  new InhousePart();
            headLights.setName("Head Lights");
            headLights.setPrice(19.99);
            headLights.setInv(67);
            headLights.setMaxInv(500);
            headLights.setMinInv(0);

            InhousePart engines =  new InhousePart();
            engines.setName("Engines");
            engines.setPrice(429.99);
            engines.setInv(24);
            engines.setMaxInv(500);
            engines.setMinInv(0);

            partRepository.save(brakePads);
            partRepository.save(battery);
            partRepository.save(sparkPlugs);
            partRepository.save(headLights);
            partRepository.save(engines);

            Product minivan = new Product(1, "Minivan", 12000.00, 15 );
            Product truck = new Product(2, "Truck", 50000.00, 45);
            Product suv = new Product(3, "SUV", 70000.00, 35);
            Product coupe = new Product(4, "Coupe", 80000.00, 25);
            Product sportsCar = new Product(5, "Sports Car", 90000.00, 5);

            productRepository.save(minivan);
            productRepository.save(truck);
            productRepository.save(suv);
            productRepository.save(coupe);
            productRepository.save(sportsCar);

            OutsourcedPart o= new OutsourcedPart();
            o.setCompanyName("Rusty Bumpers");
            o.setName("Bumper");
            o.setInv(20);
            o.setPrice(20.0);
            o.setId(100L);
            o.setMinInv(0);
            o.setMaxInv(500);
            outsourcedPartRepository.save(o);
//            OutsourcedPart thePart=null;
//            List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
//            for(OutsourcedPart part:outsourcedParts){
//                if(part.getName().equals("out test"))thePart=part;
//            }
//
//
//            System.out.println(thePart.getCompanyName());
//
//            outsourcedParts = (List<OutsourcedPart>) outsourcedPartRepository.findAll();
//            for(OutsourcedPart part:outsourcedParts){
//                System.out.println(part.getName()+" "+part.getCompanyName());
//            }
        }




        System.out.println("Started in Bootstrap");
        System.out.println("Number of Products"+productRepository.count());
        System.out.println(productRepository.findAll());
        System.out.println("Number of Parts"+partRepository.count());
        System.out.println(partRepository.findAll());

    }
}
