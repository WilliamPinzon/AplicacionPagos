package co.vinni.soapproyectobase;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import co.vinni.soapproyectobase.entidades.Contribuyente;
import co.vinni.soapproyectobase.repositorios.RepositorioContribuyente;
import lombok.extern.log4j.Log4j2;

/**
 * author Vinni 2023
 */
@SpringBootApplication
@Log4j2
public class SoapProyectobaseApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SoapProyectobaseApplication.class, args);
        System.out.println("proyecto base");

    }
    @Autowired
    RepositorioContribuyente repoEquipo;
    @Override
    public void run(String... args) throws Exception {

       List<Contribuyente> listEquip = repoEquipo.findAll();
       for (Contribuyente contribuyente : listEquip){
           System.out.println("contri"  +  contribuyente);

       }

    }
}
