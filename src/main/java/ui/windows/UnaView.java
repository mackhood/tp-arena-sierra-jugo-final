package ui.windows;

import dominio.Repositorios.RepositorioUsuarios;



import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.windows.MainWindow;

import dominio.Usuario;
import ui.vm.UnViewModel;

//IMPORTANTE: correr con -Djava.system.class.loader=com.uqbar.apo.APOClassLoader
public class UnaView extends MainWindow<UnViewModel> {

    public UnaView() {
        super(new RepositorioUsuarios().obtenerUsuario());
    }

    @Override
    public void createContents(Panel mainPanel) {
    }

    public static void main(String[] args) {
        new UnaView().startApplication();
    }
}