 package ui.windows;

import org.uqbar.arena.layout.ColumnLayout;
import org.uqbar.arena.widgets.*;
import org.uqbar.arena.windows.SimpleWindow;
import org.uqbar.arena.windows.WindowOwner;

import dominio.Usuario;
import ui.vm.EditarDatosModel;

public class DatosUsuarioView extends SimpleWindow<EditarDatosModel> {

    public Usuario usuario;
    public DatosUsuarioView(WindowOwner owner, Usuario usuarioSeleccionado) {
          super(owner, new EditarDatosModel(usuarioSeleccionado));
          this.usuario=usuarioSeleccionado;
    }

    @Override
    protected void createFormPanel(Panel mainPanel) {
        setTitle("Datos Personales Usuario");
        Panel form = new Panel(mainPanel);

        form.setLayout(new ColumnLayout(2));

        new Label(form).setText("Nombre");
        new TextBox(form).bindValueToProperty("usuario.nombre");

        new Label(form).setText("Github");
        new TextBox(form).bindValueToProperty("usuario.github");



     }

    @Override
    protected void addActions(Panel actions) {
        //new Button(actions).setCaption("Aceptar").onClick(this::accept).setAsDefault();
     //   new Button(actions).setCaption("Cancelar").onClick(this::cancel);
    }


}