package com.deviro.maven.config;

import com.deviro.maven.services.BluePrinter;
import com.deviro.maven.services.ColourPrinter;
import com.deviro.maven.services.GreenPrinter;
import com.deviro.maven.services.RedPrinter;
import com.deviro.maven.services.impl.ColourPrinterImpl;
import com.deviro.maven.services.impl.EnglishBluePrinter;
import com.deviro.maven.services.impl.EnglishGreenPrinter;
import com.deviro.maven.services.impl.EnglishRedPrinter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Printerconfig {

    @Bean
    public BluePrinter  bluePrinter() {
        return  new EnglishBluePrinter();

    }
    @Bean
    public  RedPrinter  redPrinter() {

        return  new EnglishRedPrinter();
    }

    @Bean
    public GreenPrinter  greenPrinter (){
        return   new EnglishGreenPrinter();
    }
    @Bean
    public   ColourPrinter colourPrinter (BluePrinter bluePrinter , RedPrinter redPrinter , GreenPrinter greenPrinter){
        return new ColourPrinterImpl(redPrinter() , bluePrinter() , greenPrinter());

    }
}

