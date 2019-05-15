//package edu.dmacc.codedsm.finalproject;
//
//
//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.io.IOException;
//import java.util.HashMap;
//
//public class ReaderFile {
//    public static void main(String[] args) throws IOException {
//
//
//        String filePath = "initial_load.txt";
//            HashMap<String, Employee> map = new HashMap<>();
//
//        String line;
//        BufferedReader reader = new BufferedReader(new FileReader(filePath));
//
//
//        while ((line = reader.readLine()) != null) {
//            String[] parts = line.split(",");
//            Employee ee = new Employee();
//            String key = parts[0];
//            ee.setId(Integer.parseInt(key));
//            ee.setName(parts[1]);
//            String rate = parts[2];
//            ee.setRate(Double.parseDouble(rate));
//            map.put(key, ee);
//        }
//
//        for (String key : map.keySet()) {
//            System.out.println(key + ":" + map.get(key));
//        }
//        reader.close();
//    }
//}
//
