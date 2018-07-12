package ui.windows;

import dominio.Asignaciones.Asignacion;
import dominio.Repositorios.RepositorioUsuarios;


import org.uqbar.arena.bindings.ObservableProperty;
import org.uqbar.arena.bindings.PropertyAdapter;
import org.uqbar.arena.layout.VerticalLayout;
import org.uqbar.arena.widgets.*;
import org.uqbar.arena.windows.MainWindow;

import dominio.Usuario;
import ui.vm.UnViewModel;

import org.uqbar.arena.layout.ColumnLayout;
import org.uqbar.arena.windows.Dialog;
import org.uqbar.arena.windows.WindowOwner;

//IMPORTANTE: correr con -Djava.system.class.loader=com.uqbar.apo.APOClassLoader
public class UnaView extends MainWindow<Usuario> {


    public UnaView(Usuario model) {
        super(model);
    }


    @Override
    public void createContents(Panel mainPanel) {
        setTitle("Datos de un Usuario");
        mainPanel.setLayout(new VerticalLayout());
        new Label(mainPanel).setText("Datos de Tareas");

        mainPanel.setLayout(new ColumnLayout(2));

        mainPanel.getContainerModelObject().getClass();
        //new Label(mainPanel).setText("form.getContainerModelObject().getClass()");
        new TextBox(mainPanel).bindValueToProperty("nombre");

       //Selector<Asignacion> computerSelector = new Selector<Asignacion>(mainPanel)
       //      .allowNull(true);

        //computerSelector.bindItemsToProperty("asignaciones");

        new Label(mainPanel).setText("Asignacion Seleccionada");
        new Label(mainPanel).setText("");

        new Label(mainPanel).setText("Asginacion");
//        new Label(form).bindValueToProperty("asignacion.descripcion");

       /* new Button(mainPanel) //
                .setCaption("Modificar Datos") //
                .onClick(() -> new DatosUsuario(this,new UnViewModel()).actualizarDatos());
        */
     }
    public static void main(String[] args) {
        new UnaView(new RepositorioUsuarios().obtenerUsuario()).startApplication();
        }
    }