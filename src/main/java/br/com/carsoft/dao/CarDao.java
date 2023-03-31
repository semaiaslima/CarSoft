package br.com.carsoft.dao;

import br.com.carsoft.model.Car;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class CarDao {

    public void createCar(Car car){
        String SQL = "INSERT INTO CAR (NAME) VALUES (?)";

        try{
            Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa", "sa");

            System.out.println("sucess in connection");

            PreparedStatement prepareStatement = connection.prepareStatement(SQL);

            prepareStatement.setString(1,car.getName());
            prepareStatement.execute();
            connection.close();

        }catch(Exception e){

            System.out.println("fail in connection");

        }
    }
}
