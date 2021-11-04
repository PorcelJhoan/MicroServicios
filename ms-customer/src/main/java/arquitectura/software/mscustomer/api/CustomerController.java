package arquitectura.software.mscustomer.api;

import arquitectura.software.mscustomer.entity.CustomerEntity;
import arquitectura.software.mscustomer.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.nio.file.Path;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/v1/api/customer")

public class CustomerController {
    @Autowired
    private CustomerRepository customerRepository;

    @Value("${server.port}")
    private String serverPort;

    @RequestMapping(path = "/test",method = RequestMethod.GET)
    public String testCustomer(){
        return "Test Customer";
    }

    @RequestMapping(path = "/save",method = RequestMethod.POST)
    public CustomerEntity saveCustomer(@RequestBody CustomerEntity customer){
        System.out.println("Registrado : "+ serverPort);
        return customerRepository.save(customer);
    }

    @RequestMapping(path = "/all",method = RequestMethod.GET)
    public List<CustomerEntity> getAllCustomer( ){
        List<CustomerEntity> customers = customerRepository.findAll();
        return customers;
    }

    @RequestMapping(method = RequestMethod.GET)
    public CustomerEntity getCustomer(@RequestParam Integer idcustomer) throws Exception {
        Optional<CustomerEntity> customer = customerRepository.findById(idcustomer);
        if(customer.isPresent()){
            CustomerEntity custome=customer.get();
            return custome;
        }else{
            throw new Exception("No se encuentra a el usuario;");
        }

    }

}
