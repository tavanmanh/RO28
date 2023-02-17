package com.tn;


import com.tn.entity.Department;

import com.tn.entity.Director;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import sun.misc.IOUtils;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Main {
    public static void main(String[] args) throws IOException {
//        Session session = null;
//        try {
//            session = buildSessionFactory().openSession();
//            Director director = new Director();
//            director.setDirectorName("Manh");
//            session.save(director);
//
//            Department department = new Department();
//            department.setDepartmenName("KOl");
//            Director director1= session.get(Director.class,2);
//            department.setDirector(director1);
//            session.save(department);
//        } finally {
//            if (session != null) {
//                    session.close();
//                }
//            }
//    }
//    private static SessionFactory buildSessionFactory() {
//        // load configuration
//        Configuration configuration = new Configuration();
//        configuration.configure("hibernate.cfg.xml");
//        configuration.addAnnotatedClass(Department.class);
//        configuration.addAnnotatedClass(Director.class);
//
//
//        ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
//                .applySettings(configuration.getProperties()).build();
//
//        return configuration.buildSessionFactory(serviceRegistry);
        StringBuilder content = new StringBuilder();
        URL url = new URL("https://api.telegram.org/bot5658784275:AAFsWArm5S1OgZ2bjuwVGfut-vUEF_1B-ds/getFile?file_id=AgACAgUAAxkBAANmY6UVpwEvPzYmASO4Enznu_vJE7kAAgi4MRtVgClVRpN9J-wEQLMBAAMCAAN4AAMsBA");
        URLConnection urlConnection = url.openConnection();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
        String line;
        while ((line = bufferedReader.readLine()) != null)
        {
            content.append(line + "\n");
        }
        bufferedReader.close();
        String text=content.toString().replaceAll("[{} \"]","");
        String[] parts = text.split(":");
        System.out.println(parts[parts.length-1]);

        URL url1 = new URL("https://api.telegram.org/file/bot5658784275:AAFsWArm5S1OgZ2bjuwVGfut-vUEF_1B-ds/photos/file_6.jpg");
        InputStream inputStream = new BufferedInputStream(url1.openStream());
        byte[] sourceBytes = IOUtils.toByteArray(inputStream);
        String encodedString = Base64.getEncoder().encodeToString(sourceBytes);
        System.out.println(encodedString);
    }
}
