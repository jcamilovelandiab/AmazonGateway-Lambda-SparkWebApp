/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arem.services;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 *
 * @author Juan Camilo Velandia Botello
 */
public class MathServices {

    public static Integer square(Integer i) {
        URL url;
        try {
            url = new URL("https://h6g62t7sy6.execute-api.us-east-1.amazonaws.com/Beta?value=" + String.valueOf(i));
            URLConnection conexion = url.openConnection();
            conexion.connect();
            // Lectura
            InputStream is = conexion.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            char[] buffer = new char[1000];
            int leido;
            Integer result = null;
            while ((leido = br.read(buffer)) > 0) {
                result =  Integer.parseInt( new String(buffer, 0, leido));
            }
            return result;
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
        return null;
    }
}