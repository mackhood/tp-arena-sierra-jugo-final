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
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.windows.Dialog;
import org.uqbar.arena.windows.WindowOwner;

//IMPORTANTE: correr con -Djava.system.class.loader=com.uqbar.apo.APOClassLoader
public class UnaView extends MainWindow<UnViewModel> {

    public UnaView() {
        super( new UnViewModel() );
    }


    @Override
    public void createContents(Panel mainPanel) {
        setTitle("Datos de un Usuario");
        mainPanel.setLayout(new VerticalLayout());
        new Label(mainPanel).setText("Datos de Tareas");
        Panel form = new Panel(mainPanel);
        form.setLayout(new ColumnLayout(2));

        form.getContainerModelObject().getClass();
        //new Label(mainPanel).setText("form.getContainerModelObject().getClass()");
        //new TextBox(form).bindValueToProperty("nombre");

      // Selector<Integer> computerSelector = new Selector<Integer>(form)
      //         .allowNull(true);

        //computerSelector.bindValueToProperty("usuario");

        new Label(form).setText("Asignacion Seleccionada");
        new Label(form).setText("");

        new Label(form).setText("Asginacion");
//        new Label(form).bindValueToProperty("asignacion.descripcion");

        new Button(mainPanel) //
                .setCaption("Modificar Datos") //
                .onClick(() -> new DatosUsuario(this,new UnViewModel()).actualizarDatos());

     }
    public static void main(String[] args) {
        new UnaView().startApplication();
    }
}