//package br.com.tt.petshop.configuration;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.jdbc.datasource.DriverManagerDataSource;
//
//import javax.sql.DataSource;
//
////@Configuration
//public class DataSourceConfig {
//
////    @Bean
//    public DataSource mysqlDataSource() {
//        String driver = "mysql";
//        String ip = "10.0.1.128";
//        int port = 3306;
//        String banco = "petshop";
//
//        //"jdbc:mysql://10.0.1.128:3306/petshop?serverTimezone=America/Sao_Paulo"
//        StringBuilder url = new StringBuilder();
//        url.append("jdbc:")
//            .append(driver)
//            .append(":")
//            .append(ip)
//            .append(":")
//            .append(port)
//            .append("/")
//            .append(banco)
//            .append("?serverTimezone=America/Sao_Paulo");
//
//        DriverManagerDataSource dataSource = new DriverManagerDataSource();
//        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
//        dataSource.setUrl(url.toString());
//        dataSource.setUsername("petshop");
//        dataSource.setPassword("petshop");
//        return dataSource;
//    }
//}