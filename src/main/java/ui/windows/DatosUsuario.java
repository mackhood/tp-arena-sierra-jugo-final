package ui.windows;

import org.uqbar.arena.layout.ColumnLayout;
import org.uqbar.arena.widgets.*;
import org.uqbar.arena.windows.Dialog;
import org.uqbar.arena.windows.SimpleWindow;
import org.uqbar.arena.windows.WindowOwner;

import dominio.Usuario;
import ui.vm.EditarDatos;

public class DatosUsuario extends SimpleWindow<EditarDatos> {

    public Usuario usuario;
    public DatosUsuario(WindowOwner owner, Usuario usuarioSeleccionado) {
          super(owner, new EditarDatos(usuarioSeleccionado));
          this.usuario=usuarioSeleccionado;
    }

    @Override
    protected void createFormPanel(Panel mainPanel) {
        setTitle("Datos Personales Usuario");
        Panel form = new Panel(mainPanel);

        form.setLayout(new ColumnLayout(2));

        new Label(form).setText("Nombre");
        new TextBox(form).bindValueToProperty("nombre");

        new Label(form).setText("Github");
        new TextBox(form).bindValueToProperty("github");



     }

    @Override
    protected void addActions(Panel actions) {
        //new Button(actions).setCaption("Aceptar").onClick(this::accept).setAsDefault();
        //new Button(actions).setCaption("Cancelar").onClick(this::cancel);
    }


}