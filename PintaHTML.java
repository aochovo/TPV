/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tpv;

import java.util.ArrayList;

/**
 *
 * @author alex
 */
public class PintaHTML {
    public static String crearTabla(ArrayList<Producto> lista, int precio_total)
    {
        String html="<html><head></head><body><ul>";
        for (Producto x: lista)
        {
            html=html+"<li>"+x.getNombre()+"-----"+x.getPrecio()+"$</li>";
        }
        html=html+"<p>PRECIO TOTAL-----"+precio_total+"$</p>";
        html=html+"</ul></body></html>";
        return html;
    }
}
