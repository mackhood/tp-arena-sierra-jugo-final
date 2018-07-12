package ui.windows;

import dominio.Asignaciones.Asignacion;
import dominio.Repositorios.RepositorioUsuarios;


import org.uqbar.arena.bindings.ObservableProperty;
import org.uqbar.arena.bindings.PropertyAdapter;
import org.uqbar.arena.layout.VerticalLayout;
import org.uqbar.arena.widgets.*;
import org.uqbar.arena.windows.MainWindow;

import dominio.Usuario;
import org.uqbar.arena.windows.SimpleWindow;
import ui.vm.UnViewModel;

import org.uqbar.arena.layout.ColumnLayout;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.windows.Dialog;
import org.uqbar.arena.windows.WindowOwner;

//IMPORTANTE: correr con -Djava.system.class.loader=com.uqbar.apo.APOClassLoader
public class DatosUsuario extends SimpleWindow<UnViewModel> {


    public DatosUsuario(WindowOwner parent, UnViewModel model) {
        super(parent, model);
    }

    @Override
    protected void addActions(Panel panel) {
        new Button(panel)
                .setCaption("ActualizarDatos")
                .onClick(this::actualizarDatos);
    }

    @Override
    protected void createFormPanel(Panel panel) {

    }
    public void actualizarDatos() {
        MainWindow<?> dialog = new UnaView();
        dialog.open();
    }
}
