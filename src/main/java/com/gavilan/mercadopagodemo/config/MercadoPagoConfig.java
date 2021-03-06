package com.gavilan.mercadopagodemo.config;

import com.mercadopago.MercadoPago;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "mercadopago")
public class MercadoPagoConfig {

    private String publicKey;
    private String accesToken;


    public String getPublicKey() {
        return publicKey;
    }

    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
    }

    public String getAccesToken() {
        return accesToken;
    }

    public void setAccesToken(String accesToken) {
        this.accesToken = accesToken;
    }

    @Bean
    void setMercadoPagoAccessToken() throws Exception {
        MercadoPago.SDK.setAccessToken(this.accesToken);
    }
    /*
    @Override
    public void run(String... args) throws Exception {
        MercadoPago.SDK.setAccessToken(this.accesToken);
    }

     */
}
