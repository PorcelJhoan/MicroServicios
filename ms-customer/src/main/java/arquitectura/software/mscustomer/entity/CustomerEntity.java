package arquitectura.software.mscustomer.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CustomerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer custemerId;
    private String name;
    private String lasName;
    private String email;

    public CustomerEntity(Integer custemerId, String name, String lasName, String email) {
        this.custemerId = custemerId;
        this.name = name;
        this.lasName = lasName;
        this.email = email;
    }

    public CustomerEntity() {
    }

    public Integer getCustemerId() {
        return custemerId;
    }

    public void setCustemerId(Integer custemerId) {
        this.custemerId = custemerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLasName() {
        return lasName;
    }

    public void setLasName(String lasName) {
        this.lasName = lasName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
