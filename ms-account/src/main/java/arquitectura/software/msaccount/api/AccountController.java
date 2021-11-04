package arquitectura.software.msaccount.api;

import arquitectura.software.msaccount.entity.AccountEntity;
import arquitectura.software.msaccount.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/v1/api/account")

public class AccountController {
    @Autowired
    private AccountRepository accountRepository;


    @RequestMapping(path = "/test",method = RequestMethod.GET)
    public String testCustomer(){
        return "Test Customer";
    }

    @RequestMapping(path = "/save",method = RequestMethod.POST)
    public AccountEntity saveCustomer(@RequestBody AccountEntity customer){
        return accountRepository.save(customer);
    }

    @RequestMapping(path = "/all",method = RequestMethod.GET)
    public List<AccountEntity> getAllCustomer( ){
        List<AccountEntity> customers = accountRepository.findAll();
        return customers;
    }

    @RequestMapping(method = RequestMethod.GET)
    public AccountEntity getCustomer(@RequestParam Integer idcustomer) throws Exception {
        Optional<AccountEntity> customer = accountRepository.findById(idcustomer);
        if(customer.isPresent()){
            AccountEntity custome=customer.get();
            return custome;
        }else{
            throw new Exception("No se encuentra a el usuario;");
        }

    }

}
