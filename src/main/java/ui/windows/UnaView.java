package ui.windows;

import dominio.Asignaciones.Asignacion;
import dominio.Repositorios.RepositorioUsuarios;
import dominio.Asignaciones.AsignacionesConceptuales;
import dominio.Criterios.CriterioConceptuales;
import org.uqbar.arena.bindings.ObservableProperty;
import org.uqbar.arena.bindings.PropertyAdapter;
import org.uqbar.arena.layout.VerticalLayout;
import org.uqbar.arena.widgets.*;
import org.uqbar.arena.windows.MainWindow;
import dominio.Asignaciones.AsignacionesNumericas;
import dominio.Usuario;
import org.uqbar.arena.windows.SimpleWindow;
import org.uqbar.lacar.ui.model.ListBuilder;
import org.uqbar.lacar.ui.model.bindings.Binding;
import ui.vm.UnViewModel;
import dominio.Criterios.CriterioNumericas;
import org.uqbar.arena.layout.ColumnLayout;
import org.uqbar.arena.windows.Dialog;
import org.uqbar.arena.windows.WindowOwner;

//IMPORTANTE: correr con -Djava.system.class.loader=com.uqbar.apo.APOClassLoader
public class UnaView extends MainWindow<UnViewModel> {
    public UnViewModel model;

    public UnaView(UnViewModel model) {
        super(model);
        this.model = model;
    }


    @Override
    public void createContents(Panel mainPanel) {
        setTitle("Datos de un Usuario");
        mainPanel.setLayout(new VerticalLayout());
        new Label(mainPanel).setText("Datos de Tareas");

        mainPanel.setLayout(new ColumnLayout(2));

        mainPanel.getContainerModelObject().getClass();
        //new Label(mainPanel).setText("form.getContainerModelObject().getClass()");
        //new TextBox(mainPanel).bindValueToProperty("usuario.nombre");

        Selector<Usuario> computerSelector = new Selector<Usuario>(mainPanel)
             .allowNull(true);

        computerSelector.bindItemsToProperty("usuarios").adaptWith(Usuario.class,"nombre");
        computerSelector.bindValueToProperty("usuarioSeleccionado");



        new Label(mainPanel).setText("Asignaciones");
        Selector<Asignacion> otroSelector = new Selector<Asignacion>(mainPanel)
                .allowNull(true);

        otroSelector.bindItemsToProperty("usuarioSeleccionado.asignaciones").adaptWith(Asignacion.class,"descripcion");



        new Button(mainPanel).setCaption("Modificar Datos Estudiante").onClick( this::modificarDatos);
        new Button(mainPanel).setCaption("Ver Asignacion").onClick(this::asignaciones);
    }




    public static void main(String[] args) {

         new UnaView(new UnViewModel()).startApplication();
    }

    public void model(UnViewModel unViewModel) {
        model = unViewModel;
    }
    public void modificarDatos(){

        SimpleWindow<?> modificarDatos= new DatosUsuario(this, this.getModelObject().getUsuarioSeleccionado());
        modificarDatos.open();
        //new Button(mainPanel).setCaption("Modificar Datos Estudiante").onClick(() -> new DatosUsuario(this, this.getModelObject().getUsuarioSeleccionado()).open());
    }
    public void asignaciones(){
        SimpleWindow<?> asignaciones= new AsignacionesUsuarioView(this, this.getModelObject().getUsuarioSeleccionado());
        asignaciones.open();
    }

}