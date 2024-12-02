package de.th_wildau.fse.chess_backend;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ChessBackendApplication {

	public static void main(String[] args) {
		String configPath = "." + File.separatorChar + "config" + File.separatorChar +"db.properties";
		Properties dbProp = new Properties();
		
		try (FileInputStream fis = new FileInputStream(configPath)){
            dbProp.load(fis);
			System.out.println(dbProp.toString());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

		SpringApplication.run(ChessBackendApplication.class, args);
	}

}
