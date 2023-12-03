package com.example.listadetareas_edit.Controlador;


import com.example.listadetareas_edit.Modelo.Tarea;

import java.util.ArrayList;

public class ControladorTarea {

    private static final ArrayList<Tarea> lstTareas = new ArrayList<>();

    public ControladorTarea() {
    }

    public void addTarea(int position, Tarea tarea) {
        lstTareas.add(position, tarea);
    }
    public int getPosition(long id) {
        int position = -1;
        for (int i = 0; i < lstTareas.size(); i++) {
            if (lstTareas.get(i).getId() == id) {
                position = i;
                break;
            }
        }
        return position;
    }
    public void actualizarTarea(long id, Tarea tarea) {
        int position = getPosition(id);
        lstTareas.set(position, tarea);
    }

    public void eliminarTarea(long id) {
        int position = getPosition(id);
        lstTareas.remove(position);
    }

    public Tarea getTarea(long id) {
        int position = getPosition(id);
        return lstTareas.get(position);
    }

    public ArrayList<Tarea> getLista() {
        return lstTareas;
    }

    public void cargarTareas() {
        String descripcion = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer in pulvinar diam. Curabitur convallis egestas elit sed mattis. Fusce id ultricies felis. In ut elit sed lorem sagittis laoreet eget ut odio. Mauris condimentum mollis odio id vehicula. Nunc malesuada risus venenatis dapibus fermentum. Suspendisse mollis nisi id congue ultricies. Donec mattis in lorem vitae rutrum. Sed elementum sapien nisl, at venenatis justo fermentum eget. Nam vel ipsum fringilla, varius erat vel, dapibus tortor. Nunc faucibus ullamcorper quam, sit amet pellentesque metus mattis sit amet. Nunc in sapien odio. Donec mattis metus sapien, id condimentum velit facilisis in.";
        lstTareas.add(new Tarea(100, "Tarea 01", "TXT 01 " + descripcion, "2023/08/12", "12:20", 1));
        lstTareas.add(new Tarea(105, "Tarea 02", "TXT 02 " + descripcion, "2023/07/14", "13:35", 0));
        lstTareas.add(new Tarea(110, "Tarea 03", "TXT 03 " + descripcion, "2023/06/16", "15:10", 2));
        lstTareas.add(new Tarea(115, "Tarea 04", "TXT 04 " + descripcion, "2023/05/18", "17:20", 3));
        lstTareas.add(new Tarea(120, "Tarea 05", "TXT 05 " + descripcion, "2023/04/12", "19:15", 1));
        lstTareas.add(new Tarea(125, "Tarea 06", "TXT 06 " + descripcion, "2023/03/13", "11:10", 2));
        lstTareas.add(new Tarea(130, "Tarea 07", "TXT 07 " + descripcion, "2023/02/15", "13:25", 4));
        lstTareas.add(new Tarea(135, "Tarea 08", "TXT 08 " + descripcion, "2023/01/17", "14:30", 5));
        lstTareas.add(new Tarea(140, "Tarea 09", "TXT 09 " + descripcion, "2023/09/19", "16:30", 2));
        lstTareas.add(new Tarea(145, "Tarea 10", "TXT 10 " + descripcion, "2023/08/12", "17:25", 3));
        lstTareas.add(new Tarea(150, "Tarea 11", "TXT 11 " + descripcion, "2022/07/14", "10:35", 1));
        lstTareas.add(new Tarea(155, "Tarea 12", "TXT 12 " + descripcion, "2022/06/15", "19:25", 0));
        lstTareas.add(new Tarea(160, "Tarea 13", "TXT 13 " + descripcion, "2022/05/16", "19:10", 3));
        lstTareas.add(new Tarea(165, "Tarea 14", "TXT 14 " + descripcion, "2021/04/17", "18:20", 2));
    }

}
