package arquitectura.software.mscustomer.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@Component
@RefreshScope
public class CustomerConfig {
    @Value("${server.port}")
    private String serverPort;
    @Value("${arquitectura.software}")
    private String arquitecturaSoftware;

    public String showConfiguration(){
        return String.format("los datos son : "+arquitecturaSoftware);
    }
}
