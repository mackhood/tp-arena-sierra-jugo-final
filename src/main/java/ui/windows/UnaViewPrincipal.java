package ui.windows;

import dominio.Asignaciones.Asignacion;
import org.uqbar.arena.layout.VerticalLayout;
import org.uqbar.arena.widgets.*;
import org.uqbar.arena.windows.MainWindow;
import dominio.Usuario;
import org.uqbar.arena.windows.SimpleWindow;
import ui.vm.UnViewModel;
import org.uqbar.arena.layout.ColumnLayout;


public class UnaViewPrincipal extends MainWindow<UnViewModel> {

    public UnaViewPrincipal(UnViewModel model) {
        super(model);

    }


    @Override
    public void createContents(Panel mainPanel) {
        setTitle("Datos de un Usuario");
        Panel form = new Panel(mainPanel);
        form.setLayout(new VerticalLayout());
        new Label(form).setText("Datos de Tareas");

        form.setLayout(new ColumnLayout(2));

        form.getContainerModelObject().getClass();
        Selector<Usuario> computerSelector = new Selector<Usuario>(form).allowNull(true);

        computerSelector.bindItemsToProperty("usuarios").adaptWith(Usuario.class,"nombre");
        computerSelector.bindValueToProperty("usuarioSeleccionado");


        new Label(form).setText("Asignaciones");
        Selector<Asignacion> otroSelector = new Selector<Asignacion>(form).allowNull(true);
        otroSelector.bindItemsToProperty("usuarioSeleccionado.asignaciones").adaptWith(Asignacion.class,"descripcion");

        new Button(form).setCaption("Modificar Datos Estudiante").onClick( this::modificarDatos);
        new Button(form).setCaption("Ver Descripciones Asignacion").onClick(this::asignaciones);

    }
    public static void main(String[] args) {

         new UnaViewPrincipal(new UnViewModel()).startApplication();
    }


    public void modificarDatos(){
        if (this.getModelObject().getUsuarioSeleccionado()!= null){
            SimpleWindow<?> modificarDatos= new DatosUsuarioView(this, this.getModelObject().getUsuarioSeleccionado());
            modificarDatos.open();
        }
        else{
            System.out.println("Seleccione un Usuario");
        }

    }
    public void asignaciones(){
        if (this.getModelObject().getUsuarioSeleccionado()!= null){
            SimpleWindow<?> asignaciones= new AsignacionesUsuarioView(this, this.getModelObject().getUsuarioSeleccionado());
            asignaciones.open();
        }
        else{
            System.out.println("Seleccione un Usuario");
        }
    }

}