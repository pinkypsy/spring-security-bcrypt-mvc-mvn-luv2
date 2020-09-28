package ua.alvin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.sql.DataSource;
import java.io.IOException;
import java.sql.*;

@Controller
public class DemoController {



    @Autowired
    private DataSource securityDataSource;

    @GetMapping("/")
    public String landingPage(Model model) {

        String sql = "select * from users";

        try (Connection connection = securityDataSource.getConnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(sql)
        ) {
            resultSet.next();
            model.addAttribute("str", resultSet.getString(1));
        } catch (SQLException e) {
            /*NOP*/
        }

        return "landing";
    }

    @GetMapping("/employees")
    public String homePage() {
        return "home";
    }

    @GetMapping("/leaders")
    public String leadersPage() {
        return "leaders";
    }

    @GetMapping("/systems")
    public String adminsPage() {
        return "admins";
    }

}
