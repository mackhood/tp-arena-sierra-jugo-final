package ui.windows;

import dominio.Asignaciones.Asignacion;
import dominio.Usuario;
import org.uqbar.arena.layout.ColumnLayout;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.widgets.Selector;
import org.uqbar.arena.windows.SimpleWindow;
import org.uqbar.arena.windows.WindowOwner;
import ui.vm.EditarDatosModel;

public class AsignacionesUsuarioView extends SimpleWindow<EditarDatosModel> {

    public Usuario usuario;
    public AsignacionesUsuarioView(WindowOwner owner, Usuario usuarioSeleccionado) {
        super(owner, new EditarDatosModel(usuarioSeleccionado));
        this.usuario=usuarioSeleccionado;
    }

    @Override
    protected void createFormPanel(Panel mainPanel) {
        setTitle("Asignaciones de un Usuario");
        Panel form = new Panel(mainPanel);

        form.setLayout(new ColumnLayout(2));

        new Label(form).setText("Asignaciones");

        Selector<Asignacion> otroSelector = new Selector<Asignacion>(form)
                .allowNull(true);

        otroSelector.bindItemsToProperty("usuario.asignaciones").adaptWith(Asignacion.class,"descripcion");
        otroSelector.bindValueToProperty("asignacionSeleccionadaDeUnUsuario");

        new Label(form).setText("Ultima Nota");
        new Label(form).bindValueToProperty("asignacionSeleccionadaDeUnUsuario.ultimaNota");
        new Label (form).setText("Estado");
        new Label(form).bindValueToProperty("asignacionSeleccionadaDeUnUsuario.estado");



    }

    @Override
    protected void addActions(Panel actions) {
        //new Button(actions).setCaption("Aceptar").onClick(this::accept).setAsDefault();
        //new Button(actions).setCaption("Cancelar").onClick(this::cancel);
    }
}
