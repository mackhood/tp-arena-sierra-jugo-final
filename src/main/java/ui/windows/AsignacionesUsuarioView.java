package ui.windows;

import dominio.Asignaciones.Asignacion;
import dominio.Usuario;
import org.uqbar.arena.layout.ColumnLayout;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.widgets.Selector;
import org.uqbar.arena.widgets.TextBox;
import org.uqbar.arena.windows.SimpleWindow;
import org.uqbar.arena.windows.WindowOwner;
import ui.vm.EditarDatos;

public class AsignacionesUsuarioView extends SimpleWindow<EditarDatos> {

    public Usuario usuario;
    public AsignacionesUsuarioView(WindowOwner owner, Usuario usuarioSeleccionado) {
        super(owner, new EditarDatos(usuarioSeleccionado));
        this.usuario=usuarioSeleccionado;
    }

    @Override
    protected void createFormPanel(Panel mainPanel) {
        Panel form = new Panel(mainPanel);

        form.setLayout(new ColumnLayout(2));

        new Label(form).setText("Asignaciones");

        Selector<Asignacion> otroSelector = new Selector<Asignacion>(form)
                .allowNull(true);

        otroSelector.bindItemsToProperty("usuario.asignaciones").adaptWith(Asignacion.class,"descripcion");
        otroSelector.bindValueToProperty("asignacionSeleccionada");
        new Label(form).setText("Ultima Nota");
        new TextBox(form).bindValueToProperty("asignacionSeleccionada.ultimaNota");


    }

    @Override
    protected void addActions(Panel actions) {
        //new Button(actions).setCaption("Aceptar").onClick(this::accept).setAsDefault();
        //new Button(actions).setCaption("Cancelar").onClick(this::cancel);
    }
}
