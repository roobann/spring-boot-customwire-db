package net.rooban;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class CustomWireDb implements CommandLineRunner
{
    @Autowired
    private AppService appService;
    public static void main( String[] args )
    {
        SpringApplication.run(CustomWireDb.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        AppEntity appEntity = new AppEntity();
        appEntity.setName("test");
        appService.saveEntry(appEntity);

        List<AppEntity> appEntityList = appService.listEntity();
        appEntityList.stream().forEach(value -> System.out.println(value.getId() + " >> " + value.getName()));
    }
}
