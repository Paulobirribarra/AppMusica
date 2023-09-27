package com.example.appmusica;

import java.util.ArrayList;
import java.util.List;

public class dataGenerator {
    public static List<ListElement> generateElements(){
        List<ListElement> elements = new ArrayList<>();

        elements = new ArrayList<>();
        elements.add(new ListElement("#FF0000","Satiago","Puerto Montt","Desconectado"));
        elements.add(new ListElement("#00FF00","Roberto","Temuco","Activo"));
        elements.add(new ListElement("#0000FF","Rigoberto","Copiapó","Ausente"));
        elements.add(new ListElement("#FFFF00","Guadalajara","Talca","Visible"));
        elements.add(new ListElement("#FF00FF","Federico","Renca","Invisible"));
        elements.add(new ListElement("#00FFFF","Jacinta","Santiago","Jugando"));
        elements.add(new ListElement("#FFA500","Lorenzo","Valdivia","Rateando"));
        elements.add(new ListElement("#800080","Rudencinda","Rancagua","Chateando"));
        elements.add(new ListElement("#008000","Leopolda","La serena","Con Crisis"));
        elements.add(new ListElement("#FF0000","Helga","Valparaiso","Con Ansiedad"));
        return elements;
    }

}
