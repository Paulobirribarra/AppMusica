package com.example.appmusica;

import java.util.ArrayList;
import java.util.List;

public class dataGenerator {
    public static List<ListElement> generateElements(){
        List<ListElement> elements = new ArrayList<>();

        elements = new ArrayList<>();
        elements.add(new ListElement("#FF0000","Satiago","Puerto Montt","Desconectado"));
        elements.add(new ListElement("#FF0000","Roberto","Temuco","Activo"));
        elements.add(new ListElement("#FF0000","Rigoberto","Copiapó","Ausente"));
        elements.add(new ListElement("#FF0000","Guadalajara","Talca","Visible"));
        elements.add(new ListElement("#FF0000","Federico","Renca","Invisible"));
        elements.add(new ListElement("#FF0000","Jacinta","Santiago","Jugando"));
        elements.add(new ListElement("#FF0000","Lorenzo","Valdivia","Rateando"));
        elements.add(new ListElement("#FF0000","Rudencinda","Rancagua","Chateando"));
        elements.add(new ListElement("#FF0000","Leopolda","La serena","Con Crisis"));
        elements.add(new ListElement("#FF0000","Helga","Valparaiso","Con Ansiedad"));
        return elements;
    }

}
