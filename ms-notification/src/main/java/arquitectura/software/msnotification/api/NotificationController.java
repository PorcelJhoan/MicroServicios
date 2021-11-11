package arquitectura.software.msnotification.api;


import arquitectura.software.msnotification.entity.NotificationCorreoEntity;
import arquitectura.software.msnotification.entity.NotificationSmsEntity;
import arquitectura.software.msnotification.repository.NotificationCorreoRepository;
import arquitectura.software.msnotification.repository.NotificationSmsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/api/notification")

public class NotificationController {

    @Autowired
    private NotificationSmsRepository notificationSmsRepository;
    @Autowired
    private NotificationCorreoRepository notificationCorreoRepository;


  //  @Value("${server.port}")
//    private String serverPort;

    @RequestMapping(path = "/test",method = RequestMethod.GET)
    public String testCustomer(){
        return "Test Customer";
    }

    @RequestMapping(path = "/correo",method = RequestMethod.POST)
    public NotificationCorreoEntity saveCustomer(@RequestBody NotificationCorreoEntity customer){
  //      System.out.println("Registrado : "+ serverPort);
        return notificationCorreoRepository.save(customer);
    }
    @RequestMapping(path = "/sms",method = RequestMethod.POST)
    public NotificationSmsEntity saveCustomer(@RequestBody NotificationSmsEntity customer){
        //      System.out.println("Registrado : "+ serverPort);
        return notificationSmsRepository.save(customer);
    }


}
