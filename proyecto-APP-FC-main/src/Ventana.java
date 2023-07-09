import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.util.LinkedList;


public class Ventana {
    Lista listaClientes=new Lista();
    Lista listaAdministradores=new Lista();
    ListaTarjetas pepe = new ListaTarjetas();
    DefaultListModel<Usuario> modeloLista1 = new DefaultListModel<>();
    DefaultListModel<Usuario> modeloLista2 = new DefaultListModel<>();
    ListaTransferidos coco = new ListaTransferidos();
    ListaDeunaTransferidos rila = new ListaDeunaTransferidos();
    OrdenesLavado ordenes = new OrdenesLavado();
    OrdenesLavSeco ordenSeco = new OrdenesLavSeco();
    OrdenesTinturados ordenerTNT = new OrdenesTinturados();
    OrdenesArreglos ordenesArgg = new OrdenesArreglos();

    private int numOrden;
    private JPanel principal;
    private JTabbedPane tbtActualizar;
    private JCheckBox chkAdmin;
    private JTextField txtApellido;
    private JTextField txtID;
    private JTextField txtPassword;
    private JTextField txtNombre;
    private JButton crearUsuarioButton;
    private JTextField txtLogin;
    private JTextField txtPassLogin;
    private JCheckBox chkLogin;
    private JButton iniciarSesiónButton;
    private JTextField txtBuscar;
    private JButton buscarButton;
    private JTextField txtNB;
    private JTextField txtAB;
    private JCheckBox chkBuscar;
    private JButton listarClientesButton;
    private JButton listarAdministradoresButton;
    private JTextArea txtListar;
    private JPanel JpCrearUsu;
    private JPanel JpIniciarUsu;
    private JPanel JpBuscarUsuAd;
    private JPanel JpListar;
    private JButton INICIARSESIONButton;
    private JButton REGISTRARSEButton;
    private JButton btnTarjeta;
    private JTextField txtNumTarj;
    private JSpinner spnDiaTarj;
    private JSpinner spnMesTarj;
    private JSpinner spnAnioTarj;
    private JTextField txtCVV;
    private JButton btnAgregarTarj;
    private JPanel JpTarjeta;
    private JPanel JpMetodosPago;
    private JTextField txtDia;
    private JTextField txtMes;
    private JTextField txtAnio;
    private JButton verTarjetasGuardadasButton;
    private JTextArea txtMostrarTarj;
    private JTextField txtNombreProp;
    private JPanel JpGestionar;
    private JTextArea BANCOPICHINCHANOMBREPROPIETARIOTextArea;
    private JButton btnYaTansferi;
    private JPanel JpTransferencia;
    private JPanel JpAppMovil;
    private JLabel lblFotin;
    private JTextField txtCBuscada;
    private JButton btnCedBuscar;
    private JList jlistClientes;
    private JTextField txtNewName;
    private JTextField txtNewNumero;
    private JTextField txtNewCorreo;
    private JTextField txtCorreo;
    private JTextField txtCelular;
    private JButton btnActualizar;
    private JPanel jpActualizar;
    private JTextField txtNombreCuenta;
    private JTextField txtNumCuenta;
    private JTextField txtFechaTransfer;
    private JTextField txtBanco;
    private JTextField txtMonto;
    private JTextField txtComporobante;
    private JList jlistClienTransf;
    private JPanel jpVerificarTrans;
    private JButton btnSoliServi;
    private JButton btnMetodosPago;
    private JButton btnModiServi;
    private JButton btnHelp;
    private JButton btnCalificarServi;
    private JPanel jpMenuPrincipa;
    private JButton btnVolver;
    private JButton btnPerfil;
    private JButton btnCerrarSesion;
    private JPanel jpMiPerfil;
    private JButton btnStatus;
    private JButton btnseleccionarServ;
    private JButton lavadoYSecadoButton;
    private JButton tinturadoButton;
    private JButton arregloDePrendasButton;
    private JPanel jpSoliServ;
    private JPanel jpServicios;
    private JButton regresarButton;
    private JButton btnregresar;
    private JTextField txtName;
    private JTextField txtLastname;
    private JTextField txtId;
    private JTextField txtpsw;
    private JTextField txtMail;
    private JTextField txtPhone;
    private JCheckBox checkAdmin;
    private JButton registrarButton;
    private JPanel jpRegisUsu;
    private JPanel jpDeleteCL;
    private JTextField txtCed4Delete;
    private JButton btnBuscCliente;
    private JList listPEliminar;
    private JButton btnEliminarCL;
    private JButton regresarButton1;
    private JButton btnWPP;
    private JButton btnCall;
    private JPanel jpSoporteApp;
    private JList jlistClienDUNA;
    private JPanel jpWPP;
    private JButton btnRegre;
    private JPanel jpWashNDry;
    private JComboBox cboAguaSeco;
    private JTabbedPane tbtAgSec;
    private JPanel jAgua;
    private JPanel jSeco;
    private JButton btnIr;
    private JComboBox cboAGUA;
    private JSpinner spCantidad;
    private JPanel jinfoPedido;
    private JButton btnAgregarLAVADO;
    private JLabel lblPrecio;
    private JLabel lblPrecioYCantidad;
    private JTextField txtPrecio;
    private JTextField txtPrecYcanti;
    private JTextArea txtProduAGG;
    private JButton PAGARButton;
    private JLabel lblSUBTOTAL;
    private JLabel lblValEncio;
    private JLabel lblTOTAL;
    private JPanel jpPedidosLSD;
    private JTextArea txtMostrarLyS;
    private JTextField txtCedulaProdu;
    private JTextField txtVeriPedidos;
    private JButton btnBuscPedido;
    private JTextArea txtPedidosLyS;
    private JButton REGRESARButton;
    private JComboBox cboVeriPedi;
    private JTextField txtCVeriSeco;
    private JComboBox cboSECO;
    private JSpinner spCantSeco;
    private JLabel lblPuniSeco;
    private JLabel lblPrecioSeco;
    private JButton btnAgSeco;
    private JTextArea txtproduSeco;
    private JButton bntPagarSeco;
    private JLabel lblSUBTSECO;
    private JLabel lblEnviSECO;
    private JLabel lblTOTALSECO;
    private JSpinner spNumOrden;
    private JComboBox cboOrden;
    private JTabbedPane tabbedPane1;
    private JTextField txtNombrePrenda;
    private JTextField txtColor;
    private JButton btnPagarTint;
    private JTextField txtCedTint;
    private JComboBox cboCedTNT;
    private JComboBox cboOrdTNT;
    private JButton BUSCARButton;
    private JTextArea txtMostTint;
    private JPanel jpTinturados;
    private JPanel jpArreglos;
    private JButton btnBuscarArrg;
    private JComboBox cboCedArreglo;
    private JComboBox cboOrdenArregl;
    private JTextField txtCedArregl;
    private JTextField txtNomPrenda;
    private JTextField txtDescrip;
    private JButton REGISTRARYPAGARButton;
    private JTextArea txtMostArre;
    private JTextField txtCedMiPerfil;
    private JTextField txtNuevoNAME;
    private JTextField txtCeluNuevo;
    private JTextField txtCorreoNuevo;
    private JButton actualizarDatosButton;
    private JTextField txtNewApellido;
    private JTextArea txtMiPerfilD;
    private JLabel lblCedulaMiperfil;
    private JButton regresarButton2;
    private JPanel jpMisPedidos;
    private JPanel jTinturados;
    private JPanel jArreglos;
    private JPanel jVerPedidos;
    private JComboBox cboOrdenHisto;
    private JButton VERButton;
    private JLabel lblCedHisto;
    private JLabel lblCedulaAgua;
    private JLabel lblCedulaSeco;
    private JLabel lblCedulaArreglo;
    private JLabel lblCedulaTinturado;
    private JButton REGRESARButton1;
    private JButton REGRESARButton2;
    private JButton REGRESARButton3;
    private JPanel jpMenuAdmin;
    private JButton REGISTRARNUEVOSCLIENTESButton;
    private JButton ELIMINARCLIENTESButton;
    private JButton VERPEDIDOSButton;
    private JButton BUSCARCLIENTESButton;
    private JButton LISTARCLIENTESButton;
    private JButton ACTUALIZARDATOSCLIENTESButton;
    private JButton VERIFICARTRANSFERENCIASButton;
    private JButton MIPERFILButton;
    private JButton SOPORTEAPPButton;
    private JButton regresarButton4;
    private JButton regresarButton3;
    private JButton regresarButton5;
    private JButton regresarButton6;
    private JButton regresarButton7;
    private JButton regresarButton8;
    private JButton REGRESARButton4;
    private JPanel jPerfilAdmn;
    private JTextArea txtMiperfilAdmn;
    private JTextField txtNewAdminNombre;
    private JTextField txtNewApellidoAdmin;
    private JTextField txtNewAdminCelu;
    private JTextField txtNewAdminCorreo;
    private JButton actualizarButton;
    private JButton regresarButton9;
    private JButton cerrarSesionButton;
    private JLabel lblCedAdmin;
    private JButton regresarButton10;
    private JTextField txtapellidoActualiz;
    private JButton LLAMARAFASTCLEANINGButton;
    private JButton ESCRIBIRAWHATSAPPButton;
    private JButton REGRESARButton5;
    private JPanel jpContactarAyuda;
    private JPanel jpWPClien;
    private JButton regresarButton12;
    private JButton REGRESARButton6;
    private JButton REGRESARButton7;
    private JTextField txtfechaDeUna;
    private JTextField txtMontoDeUNa;
    private JTextField txtNameDeUna;
    private JButton PAGARButton1;
    private JPanel jpPagarFrame;
    private JComboBox cboMetodoPAGO;
    private JButton btnIR;
    private JPanel jpTarjetaCredi;
    private JTextArea txtTarjetaFAv;
    private JButton PAGARButton2;
    private JButton AGREGARNUEVATARJETAButton;
    private JComboBox cboPservicio;
    private JComboBox cboServArr;
    private JButton SALIRButton;
    private JComboBox cboCEDSECO;
    private JComboBox cboORDSECO;
    private JTextArea txtPedidosSECO;
    private JButton BUSCARButton1;
    private JButton CAMBIARMETODODEPAGOButton;
    private JButton CAMBIARMETODOPAGOButton;
    private JButton CAMBIARMETODOPAGOButton1;
    private JComboBox cboServDeUna;
    private JTextArea txtTransDeUna;
    private JTextArea txtTransfer;
    private JTextField txtNamePropCC;
    private JTextField txtCC;
    private JTextField txtDay;
    private JTextField txtMonth;
    private JTextField txtYear;
    private JTextField txtCvv;
    private JButton REGISTRARButton;
    private JPanel jpNuevaTarj;
    private JButton buscarOrdenesButton;
    private JTextArea txtStatus;
    private JButton siguienteOrdenButton;
    private JComboBox cboStatusUD;
    private JButton UDStatus;
    private JTextField txtNewEntrega;
    private JTextField txtNewRecepcion;
    private JTextField txtEntrega;
    private JTextField txtRecepcion;
    private JTextField txtNuevaEntrega;
    private JTextField txtNuevaRecepcion;
    private JButton btnSTATUS;
    private JPanel jpVerStatus;
    private JLabel lblStatuCI;
    private JTextField txtDireccionE;
    private JTextField txtDireccionR;
    private JTextField txtDireccionES;
    private JTextField txtDireccionRS;
    private JTextField txtDireccionET;
    private JTextField txtDireccionRT;
    private JTextField txtDireccionEA;
    private JTextField txtDireccionRA;
    private JCheckBox ckMISMO;
    private JLabel lblFoto;
    private JList lstListar;

    public Ventana() {
        SpinnerNumberModel model = new SpinnerNumberModel(1, 1, 50, 1);
        spCantidad.setModel(model);
        spCantSeco.setModel(model);
        tbtActualizar.remove(JpBuscarUsuAd);
        tbtActualizar.remove(JpIniciarUsu);
        tbtActualizar.remove(JpListar);
        tbtActualizar.remove(JpCrearUsu);
        tbtActualizar.remove(JpTarjeta);
        tbtActualizar.remove(JpMetodosPago);
        tbtActualizar.remove(JpTransferencia);
        tbtActualizar.remove(JpAppMovil);
        tbtActualizar.remove(jpActualizar);
        tbtActualizar.remove(jpVerificarTrans);
        tbtActualizar.remove(jpMenuPrincipa);
        tbtActualizar.remove(jpMiPerfil);
        tbtActualizar.remove(jpSoliServ);
        tbtActualizar.remove(jpServicios);
        tbtActualizar.remove(jpRegisUsu);
        tbtActualizar.remove(jpDeleteCL);
        tbtActualizar.remove(jpSoporteApp);
        tbtActualizar.remove(jpWPP);
        tbtActualizar.remove(jpWashNDry);
        tbtActualizar.remove(jArreglos);
        tbtActualizar.remove(jTinturados);
        tbtActualizar.remove(jpMisPedidos);
        tbtActualizar.remove(jPerfilAdmn);
        tbtActualizar.remove(jpMenuAdmin);
        tbtActualizar.remove(jVerPedidos);
        tbtActualizar.remove(jpContactarAyuda);
        tbtActualizar.remove(jpWPClien);
        tbtActualizar.remove(jpPagarFrame);
        tbtActualizar.remove(jpTarjetaCredi);
        tbtActualizar.remove(jpNuevaTarj);
        tbtActualizar.remove(jpVerStatus);
        tbtAgSec.remove(jAgua);
        tbtAgSec.remove(jSeco);





    crearUsuarioButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

            String nombre = txtNombre.getText();
            String apellido = txtApellido.getText();
            String cedula = txtID.getText();
            String password = txtPassword.getText();
            String celular = txtCelular.getText();
            String correo = txtCorreo.getText();
            String entrega = txtEntrega.getText();
            String recepcion = txtRecepcion.getText();
            boolean admin = chkAdmin.isSelected();
            //VALIDA SI TODOS LOS CAMPOS SON LLENADOS
            if (nombre.isEmpty() || apellido.isEmpty() || cedula.isEmpty() || password.isEmpty() || celular.isEmpty() ||correo.isEmpty()){
                JOptionPane.showMessageDialog(null,"Llene todos los campos");
            }else {
                if (admin){
                    Usuario usuario = new Usuario(nombre, apellido, cedula, password, correo, celular, null, null);
                    if(listaAdministradores.verificarCedulaUnica(cedula)&& listaAdministradores.validarCedulaEcuatoriana(cedula)){
                        listaAdministradores.agregar(usuario);
                        JOptionPane.showMessageDialog(null, "El nuevo administrador ha sido agregado");
                        tbtActualizar.remove(JpCrearUsu);

                    }else{
                        JOptionPane.showMessageDialog(null, "Verifique la cedula,ya fue agregada o esta mal escrita");
                    }
                }else{
                    Usuario usuario = new Usuario(nombre, apellido, cedula, password, correo, celular, entrega, recepcion);
                    if(listaClientes.verificarCedulaUnica(cedula) && listaAdministradores.validarCedulaEcuatoriana(cedula)){
                        listaClientes.agregar(usuario);
                        JOptionPane.showMessageDialog(null, "El nuevo cliente ha sido agregado");
                        tbtActualizar.remove(JpCrearUsu);

                    }else{
                        JOptionPane.showMessageDialog(null, "Verifique la cedula, ya fue agregada o esta mal escrita");
                    }
                }
                txtNombre.setText(null);
                txtApellido.setText(null);
                txtID.setText(null);
                txtPassword.setText(null);
                txtCelular.setText(null);
                txtCorreo.setText(null);
                chkAdmin.setText(null);
                txtEntrega.setText(null);
                txtRecepcion.setText(null);

            }
            }


    });

        iniciarSesiónButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String cedula = txtLogin.getText();
                String password = txtPassLogin.getText();
                if (chkLogin.isSelected() && listaAdministradores.verificarCredenciales(cedula,password) ){
                    JOptionPane.showMessageDialog(null,"Bienvenido Administrador");
                    tbtActualizar.add("MENU ADMINISTRADOR", jpMenuAdmin);
                    tbtActualizar.remove(JpIniciarUsu);
                    tbtActualizar.remove(JpGestionar);
                    Usuario usuario = listaAdministradores.buscarPorCedula(cedula);
                    lblCedAdmin.setText(usuario.getCedula());
                    txtMiperfilAdmn.setText(usuario.toString());

                } else if (listaClientes.verificarCredenciales(cedula,password)) {
                    JOptionPane.showMessageDialog(null,"Bienvenido Usuario");
                    boolean noVisibleTarj = tbtActualizar.indexOfComponent(JpMetodosPago) != 1;
                    if(noVisibleTarj){
                        tbtActualizar.add("MENU PRINCIPAL", jpMenuPrincipa);
                    }
                    Usuario cliente = listaClientes.buscarPorCedula(cedula);
                    txtMiPerfilD.setText(cliente.toString());
                    lblCedulaMiperfil.setText(cliente.getCedula());
                    lblCedulaTinturado.setText(cliente.getCedula());
                    lblCedulaArreglo.setText(cliente.getCedula());
                    lblCedulaSeco.setText(cliente.getCedula());
                    lblCedulaAgua.setText(cliente.getCedula());
                    lblStatuCI.setText(cliente.getCedula());

                    tbtActualizar.remove(JpIniciarUsu);
                    tbtActualizar.remove(JpGestionar);



                }else {
                    JOptionPane.showMessageDialog(null,"Revise sus credenciales");
                }
                {

                }
                txtLogin.setText(null);
                txtPassLogin.setText(null);

            }
        });
        buscarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String cedula = txtBuscar.getText();
                if(chkBuscar.isSelected()){
                    Usuario usuario = listaAdministradores.buscarPorCedula(cedula);
                    txtNB.setText(usuario.getNombre());
                    txtAB.setText(usuario.getApellido());
                }else{
                    Usuario usuario = listaClientes.buscarPorCedula(cedula);
                    txtNB.setText(usuario.getNombre());
                    txtAB.setText(usuario.getApellido());
                }
                txtBuscar.setText("");
            }
        });
        listarClientesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                listaClientes.ordenarPorApellido();
                txtListar.setText(listaClientes.toString());
            }
        });
        listarAdministradoresButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                listaAdministradores.ordenarPorApellido();
                txtListar.setText(listaAdministradores.toString());
            }
        });
        REGISTRARSEButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean noVisibleReg = tbtActualizar.indexOfComponent(JpCrearUsu) != 1;
                if(noVisibleReg){
                    tbtActualizar.add("REGISTRARSE",JpCrearUsu);
                }

            }
        });
        INICIARSESIONButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean noVisibleLog = tbtActualizar.indexOfComponent(JpIniciarUsu) != 1;
                if(noVisibleLog){
                    tbtActualizar.add("INICIAR SESION",JpIniciarUsu);
                }

            }
        });
        btnTarjeta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean noVisibleTarj = tbtActualizar.indexOfComponent(JpTarjeta) != 1;
                if(noVisibleTarj){
                    tbtActualizar.add("TARJETA",JpTarjeta);
                }

            }
        });
        JpTarjeta.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                super.componentResized(e);
                JpTarjeta.setSize(300,300);

            }
        });
        btnAgregarTarj.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombreprop = txtNombreProp.getText();
                String numTarjeta = txtNumTarj.getText();
                String diaTarjeta = txtDia.getText();
                String mesTarjeta = txtMes.getText();
                String anioTarjeta = txtAnio.getText();
                String fechaTarjeta = diaTarjeta+"/"+mesTarjeta+"/"+anioTarjeta.toString();
                String cvv = txtCVV.getText();
                Tarjeta tarjetin = new Tarjeta(numTarjeta,fechaTarjeta,cvv);
                boolean isValid = pepe.validateCreditCard(numTarjeta);
                boolean validarFecha = pepe.validarFecha(fechaTarjeta);
                if (isValid) {
                    if (validarFecha) {
                        JOptionPane.showMessageDialog(null, "El número de tarjeta es válido.");
                        pepe.agregar(tarjetin);
                        txtTarjetaFAv.setText(String.valueOf(pepe.listita.getLast()));
                        txtNombreProp.setText("");
                        txtNumTarj.setText("");
                        txtDia.setText("");
                        txtMes.setText("");
                        txtAnio.setText("");
                        txtCVV.setText("");
                    }else{
                        JOptionPane.showMessageDialog(null,"La fecha ingresada no es valida");
                    }

                } else {
                    JOptionPane.showMessageDialog(null,"El número de tarjeta no es válido.");
                }

            }

        });
        verTarjetasGuardadasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtMostrarTarj.setText(pepe.toString());

            }
        });

        btnYaTansferi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String servico = cboServArr.getSelectedItem().toString();
                String nombreprop = txtNombreCuenta.getText();
                String cuenta = txtNumCuenta.getText();
                String comprobante = txtComporobante.getText();
                String banco = txtBanco.getText();
                String fecha = txtFechaTransfer.getText();
                if (nombreprop.isEmpty() || comprobante.isEmpty()||banco.isEmpty()||fecha.isEmpty() || cuenta.isEmpty()){
                    JOptionPane.showMessageDialog(null,"LLENE LA INFORMACION PARA VERIFICAR SU TRANSFERENCIA");
                } else {
                    if (servico.equalsIgnoreCase("TINTURADOS")){
                        esTinturado();
                        transferir();
                    } else if (servico.equalsIgnoreCase("LAVADO EN AGUA")){
                        esAgua();
                        transferir();
                    } else if (servico.equalsIgnoreCase("LAVADO EN SECO")) {
                        esSeco();
                        transferir();
                    } else if (servico.equalsIgnoreCase("ARREGLOS")){
                        esArreglo();
                        transferir();
                    } else {
                        JOptionPane.showMessageDialog(null,"SELECCIONE UN SERVICIO");
                    }
                    txtNombreCuenta.setText(null);
                    txtNumCuenta.setText(null);
                    txtComporobante.setText(null);
                    txtBanco.setText(null);
                    txtFechaTransfer.setText(null);
                    txtMonto.setText(null);

                }

            }
        });

        btnCedBuscar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultListModel<Usuario> dlm = new DefaultListModel();
                String cedula = txtCBuscada.getText();
                Usuario usuario = listaClientes.buscarPorCedula(cedula);
                dlm.addElement(usuario);
                jlistClientes.setModel(dlm);

            }
        });
        btnActualizar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Lista listita = new Lista();
                String cedula = txtCBuscada.getText();
                String newNombre = txtNewName.getText();
                String newCelular = txtNewNumero.getText();
                String newCorreo = txtNewCorreo.getText();
                String newApellido = txtapellidoActualiz.getText();

                Usuario usuario = listaClientes.buscarPorCedula(cedula);
                if (newNombre.isEmpty() && newCelular.isEmpty() && newCorreo.isEmpty() && newApellido.isEmpty()){
                    JOptionPane.showMessageDialog(null,"ERROR\nIngrese los datos a actualizar");
                } else {
                    if (newNombre.isEmpty()) {
                        usuario.setNombre(usuario.getNombre());
                    } else {
                        usuario.setNombre(newNombre);
                    }
                    if (newApellido.isEmpty()){
                        usuario.setApellido(usuario.getApellido());
                    }else {
                        usuario.setApellido(newApellido);
                    }
                    if (newCelular.isEmpty()){
                        usuario.setCelular(usuario.getCelular());
                    } else {
                        usuario.setCelular(newCelular);
                    }
                    if (newCorreo.isEmpty()) {
                        usuario.setCorreo(usuario.getCorreo());
                    } else {
                        usuario.setCorreo(newCorreo);
                    }
                    JOptionPane.showMessageDialog(null,"Los datos se han actualizado");
                    JOptionPane.showMessageDialog(null, usuario.toString());

                    txtCBuscada.setText("");
                    txtNewName.setText("");
                    txtNewNumero.setText("");
                    txtNewCorreo.setText("");
                    txtapellidoActualiz.setText("");
                }
            }
        });
        btnMetodosPago.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tbtActualizar.add("METODOS DE PAGO",JpMetodosPago);
                tbtActualizar.remove(jpMenuPrincipa);
            }
        });
        btnVolver.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tbtActualizar.remove(JpMetodosPago);
                tbtActualizar.add("MENU PRINCIPAL", jpMenuPrincipa);
            }
        });
        //revisar boton
        btnCerrarSesion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tbtActualizar.remove(jpMiPerfil);
                tbtActualizar.remove(jpDeleteCL);
                tbtActualizar.remove(jpVerificarTrans);
                tbtActualizar.remove(JpListar);
                tbtActualizar.remove(JpBuscarUsuAd);
                tbtActualizar.remove(jpActualizar);
                tbtActualizar.remove(jpRegisUsu);

                tbtActualizar.remove(JpIniciarUsu);
                tbtActualizar.remove(JpCrearUsu);
                tbtActualizar.remove(JpTarjeta);
                tbtActualizar.remove(JpMetodosPago);
                tbtActualizar.remove(JpTransferencia);
                tbtActualizar.remove(JpAppMovil);
                tbtActualizar.remove(jpMenuPrincipa);
                tbtActualizar.remove(jpSoliServ);
                tbtActualizar.remove(jpServicios);
                tbtActualizar.remove(jpSoporteApp);
                tbtActualizar.remove(jpWPP);
                tbtActualizar.add("FAST CLEANING LAUNDRY ", JpGestionar);



            }
        });
        btnPerfil.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tbtActualizar.remove(jpMenuPrincipa);
                tbtActualizar.add("Mi Perfil", jpMiPerfil);
            }
        });
        btnSoliServi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tbtActualizar.remove(jpMenuPrincipa);
                tbtActualizar.add("Solicitar Servicio", jpSoliServ);
            }
        });
        regresarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tbtActualizar.remove(jpServicios);
                tbtActualizar.add("Solicitar Servicio", jpSoliServ);
            }
        });
        btnregresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tbtActualizar.remove(jpSoliServ);
                tbtActualizar.add("MENU PRINCIPAL", jpMenuPrincipa);
            }
        });
        btnseleccionarServ.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tbtActualizar.remove(jpSoliServ);
                tbtActualizar.add("SERVICIOS", jpServicios);
            }
        });
        registrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre = txtName.getText();
                String apellido = txtLastname.getText();
                String cedula = txtId.getText();
                String password = txtpsw.getText();
                String celular = txtPhone.getText();
                String correo = txtMail.getText();
                boolean admin = checkAdmin.isSelected();
                String entrega = txtNewEntrega.getText();
                String recepcion = txtNewRecepcion.getText();


                if (admin){
                    Usuario usuario = new Usuario(nombre, apellido, cedula, password,correo,celular,null,null);
                    if(listaAdministradores.verificarCedulaUnica(cedula)&& listaAdministradores.validarCedulaEcuatoriana(cedula)){
                        listaAdministradores.agregar(usuario);
                        JOptionPane.showMessageDialog(null, "El nuevo administrador ha sido agregado");


                    }else{
                        JOptionPane.showMessageDialog(null, "Verifique la cedula,ya fue agregada o esta mal escrita");
                    }
                }else{
                    Usuario usuario = new Usuario(nombre, apellido, cedula, password,correo,celular,entrega,recepcion);
                    if(listaClientes.verificarCedulaUnica(cedula) && listaAdministradores.validarCedulaEcuatoriana(cedula)){
                        listaClientes.agregar(usuario);
                        JOptionPane.showMessageDialog(null, "El nuevo cliente ha sido agregado");

                    }else{
                        JOptionPane.showMessageDialog(null, "Verifique la cedula, ya fue agregada o esta mal escrita");
                    }
                }
                txtName.setText("");
                txtLastname.setText("");
                txtId.setText("");
                txtpsw.setText("");
                txtPhone.setText("");
                txtMail.setText("");
                checkAdmin.setText("");
                txtNewEntrega.setText("");
                txtNewRecepcion.setText("");
            }
        });
        btnBuscCliente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultListModel<Usuario> dlm3 = new DefaultListModel<>();
                String ced = txtCed4Delete.getText();
                Usuario usuario = listaClientes.buscarPorCedula(ced);
                dlm3.addElement(usuario);
                listPEliminar.setModel(dlm3);

            }
        });
        btnEliminarCL.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String ced = txtCed4Delete.getText();
                Usuario usuario = listaClientes.buscarPorCedula(ced);
                listaClientes.eliminar(usuario);
                JOptionPane.showMessageDialog(null,"Cliente eliminado correctamente");
                txtCed4Delete.setText("");
                listPEliminar.setModel(null);
            }
        });
        regresarButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tbtActualizar.remove(JpTransferencia);
                tbtActualizar.add("MENU PRINCIPAL",jpMenuPrincipa);
            }
        });
        btnWPP.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tbtActualizar.remove(jpSoporteApp);
                tbtActualizar.remove(JpBuscarUsuAd);
                tbtActualizar.remove(JpListar);
                tbtActualizar.remove( jpActualizar);
                tbtActualizar.remove( jpVerificarTrans);
                tbtActualizar.remove( jpRegisUsu);
                tbtActualizar.remove( jpDeleteCL);
                tbtActualizar.remove(jpMiPerfil);
                tbtActualizar.remove(jpSoporteApp);

                tbtActualizar.add("ENLACE WHATSAPP", jpWPP);
            }
        });
        btnRegre.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tbtActualizar.remove(jpWPP);
                tbtActualizar.add("MENU ADMINISTRADOR",jpMenuAdmin);
            }
        });

        btnIr.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String metodo = cboAguaSeco.getSelectedItem().toString();
                if (metodo.equalsIgnoreCase("LAVADO EN AGUA")){
                    tbtAgSec.add("AGUA", jAgua);
                    tbtAgSec.remove(jSeco);
                }
                if (metodo.equalsIgnoreCase("LAVADO EN SECO")){
                    tbtAgSec.add("SECO", jSeco);
                    tbtAgSec.remove(jAgua);
                }

            }
        });
        String productos [] = {"SELECCIONE EL PRODUCTO","Al peso","Manteles","Camisa", "Pantalon", "Edredon 1PLZ", "Edredon 2PLZ", "Edredon 3PLZ"};
        double precios []= {0.0,0.59,1.1,2.30,2.60, 5.99, 8.99, 9.99};
        DefaultComboBoxModel combobx = new DefaultComboBoxModel<>(productos);
        cboAGUA.setModel(combobx);

        cboAGUA.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               String productos = (String) cboAGUA.getSelectedItem();
                double precio = precios[cboAGUA.getSelectedIndex()];
                if (productos.equalsIgnoreCase("Al peso")) {
                    JOptionPane.showMessageDialog(null,"Seleccione la cantidad POR LIBRAS");
                }
                lblPrecio.setText(String.valueOf(precio));
                double cantidad = Integer.parseInt(spCantidad.getValue().toString());
                double sub = precio*cantidad;
                lblPrecioYCantidad.setText(String.valueOf(sub));
            }
        });


        spCantidad.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                double precio = precios[cboAGUA.getSelectedIndex()];
                lblPrecio.setText(String.valueOf(precio));
                double cantidad = Integer.parseInt(spCantidad.getValue().toString());
                double sub = precio*cantidad;
                lblPrecioYCantidad.setText(String.valueOf(sub));

            }
        });


        ListaProductosAgg productosAg = new ListaProductosAgg();
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//VERIFICAR solo se guarda el primer pagar los demas no se guardan
        btnAgregarLAVADO.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ListaProductosAgg aux = productosAg;
                String producto = cboAGUA.getSelectedItem().toString();
                int cantidad = (int) spCantidad.getValue();
                double pUnitario = Double.parseDouble(lblPrecio.getText());
                double pTotal = Double.parseDouble(lblPrecioYCantidad.getText());

                if (producto.equalsIgnoreCase("SELECCIONE EL PRODUCTO")){
                    JOptionPane.showMessageDialog(null, "Seleccion no valida");
                } else {
                    Producto produ = new Producto(producto,cantidad,pUnitario,pTotal);

                    //validacion si hay producto
                    boolean existe = productosAg.existeProdu(produ);
                    if (existe) {
                        productosAg.add(produ); //borra el anterior y pone el nuevo en txtarea
                    }else {
                        productosAg.add(produ); //solo añade el nuevo
                    }

                    txtProduAGG.setText(productosAg.toString());
                    //calculo valores Subtotal y Total
                    double SUBTOTAL;
                    double envio=1.5;
                    double TOTAL;
                    SUBTOTAL= productosAg.subtotalRecursi();
                    TOTAL=SUBTOTAL+envio;
                    lblSUBTOTAL.setText(String.valueOf(SUBTOTAL));
                    lblValEncio.setText(String.valueOf(envio));
                    lblTOTAL.setText(String.valueOf(TOTAL));
                    lblValEncio.setText(String.valueOf(envio));

                }
                }



        });
        PAGARButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String lista = txtProduAGG.getText();
                if (lista.isEmpty()){
                    JOptionPane.showMessageDialog(null,"Agregue al menos un producto");
                } else {

                    tbtActualizar.remove(jpWashNDry);
                    tbtActualizar.add("PAGAR", jpPagarFrame);

                }

                cboAGUA.setSelectedIndex(0);
                spCantidad.setModel(model);
                lblPrecio.setText("");
                lblPrecioYCantidad.setText("");
                lblSUBTOTAL.setText("");
                lblValEncio.setText("");
                lblTOTAL.setText("");
                // Limpiar la lista auxliar de productos agregados
                productosAg.lista.clear();
                }
        });


        btnBuscPedido.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String ced = (String) cboVeriPedi.getSelectedItem();
                String numOrden = cboOrden.getSelectedItem().toString();
                int aux = Integer.parseInt(numOrden);
                Usuario usuario = listaClientes.buscarPorCedula(ced);
                Orden o = ordenes.buscarOrden(ced, aux); //busca la orden por cedula
                txtPedidosLyS.setText(o.toString());
                txtDireccionE.setText(usuario.getEntrega());
                txtDireccionR.setText(usuario.getRecepcion());
            }
        });


        //cbo seco
        String productoSeco [] = {"SELECCIONE EL PRODUCTO", "Abrigo","Alfombra Liviana", "Blusa",
        "Camisa","Camiseta Polo", "Chaqueta H o M", "Chompa Liviana", "Edredon", "Pantalon", "Terno", "Vestido", "Zapatos"};
        double precioSeco []= {0.0,6.65,2.99,3.00,2.50, 2.20, 3.99, 4.59, 14.99, 4.20, 6.99, 5.50,5.50};
        DefaultComboBoxModel cbSeco = new DefaultComboBoxModel<>(productoSeco);
        cboSECO.setModel(cbSeco);

        cboSECO.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String productos = (String) cboSECO.getSelectedItem();
                double precio = precioSeco[cboSECO.getSelectedIndex()];
                lblPuniSeco.setText(String.valueOf(precio));
                double cantidad = Integer.parseInt(spCantSeco.getValue().toString());
                double sub = precio*cantidad;
                lblPrecioSeco.setText(String.valueOf(sub));
            }
        });


        spCantSeco.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                String productos = (String) cboSECO.getSelectedItem();
                double precio = precioSeco[cboSECO.getSelectedIndex()];
                lblPuniSeco.setText(String.valueOf(precio));
                double cantidad = Integer.parseInt(spCantSeco.getValue().toString());
                double sub = precio*cantidad;
                lblPrecioSeco.setText(String.valueOf(sub));

            }
        });

        //REVISAR MISMO PROBLEMA QUE AGG EN AGUA

        ListaProductosAgg listaProd = new ListaProductosAgg();
        btnAgSeco.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String producto = cboSECO.getSelectedItem().toString();
                int cantidad = (int) spCantSeco.getValue();
                double pUnitario = Double.parseDouble(lblPuniSeco.getText());
                double pTotal = Double.parseDouble(lblPrecioSeco.getText());

                if (producto.equalsIgnoreCase("SELECCIONE EL PRODUCTO")){
                    JOptionPane.showMessageDialog(null, "Seleccion no valida");
                } else {
                    Producto produ = new Producto(producto,cantidad,pUnitario,pTotal);
                    //validacion si hay producto
                    boolean existe = listaProd.existeProdu(produ);
                    if (existe) {
                        listaProd.add(produ); //borra el anterior y pone el nuevo en txtarea
                    }else {
                        listaProd.add(produ); //solo añade el nuevo
                    }

                    txtproduSeco.setText(listaProd.toString());
                    //calculo valores Subtotal y Total
                    double SUBTOTAL;
                    double envio=1.5;
                    double TOTAL;
                    SUBTOTAL= listaProd.subtotalRecursi();
                    TOTAL=SUBTOTAL+envio;
                    lblSUBTSECO.setText(String.valueOf(SUBTOTAL));
                    lblEnviSECO.setText(String.valueOf(envio));
                    lblTOTALSECO.setText(String.valueOf(TOTAL));


                }
            }

        });
        bntPagarSeco.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String lista = txtproduSeco.getText();
                if (lista.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Agregue al menos un producto");
                } else {
                    tbtActualizar.remove(jpWashNDry);
                    tbtActualizar.add("PAGAR", jpPagarFrame);
                }
                cboSECO.setSelectedIndex(0); //
                spCantSeco.setModel(model);
                lblPuniSeco.setText("");
                lblPrecioSeco.setText("");
                lblSUBTSECO.setText("");
                lblEnviSECO.setText("");
                lblTOTALSECO.setText("");
                listaProd.lista.clear();
            }
        });
        btnPagarTint.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String prenda = txtNombrePrenda.getText();
                String color = txtColor.getText();
                if (prenda.isEmpty() || color.isEmpty()){
                    JOptionPane.showMessageDialog(null, "Complete todos los campos");
                } else {
                    tbtActualizar.remove(jTinturados);
                    tbtActualizar.add("PAGAR", jpPagarFrame);
                }


            }
        });
        BUSCARButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String ced = cboCedTNT.getSelectedItem().toString();
                String numOrden = cboOrdTNT.getSelectedItem().toString();
                int aux = Integer.parseInt(numOrden);
                OrdenTint y = ordenerTNT.buscarOrden(ced, aux);
                txtMostTint.setText(y.toString());
                txtDireccionET.setText(listaClientes.buscarPorCedula(ced).getEntrega());
                txtDireccionRT.setText(listaClientes.buscarPorCedula(ced).getEntrega());
            }
        });

        REGISTRARYPAGARButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String prenda = txtNomPrenda.getText();
                String descrip = txtDescrip.getText();
                if ( prenda.isEmpty() || descrip.isEmpty()){
                    JOptionPane.showMessageDialog(null, "Complete todos los campos");
                } else {
                    tbtActualizar.remove(jArreglos);
                    tbtActualizar.add("PAGAR",jpPagarFrame);
                }
                txtCedArregl.setText("");
                txtNomPrenda.setText("");
                txtDescrip.setText("");
            }

        });
        btnBuscarArrg.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String ced = (String) cboCedArreglo.getSelectedItem();
                String numOrden = cboOrdenArregl.getSelectedItem().toString();
                int aux = Integer.parseInt(numOrden);
                OrdenArreglo y = ordenesArgg.buscarOrden(ced, aux);
                txtMostArre.setText(y.toString());
                txtDireccionEA.setText(listaClientes.buscarPorCedula(ced).getEntrega());
                txtDireccionRA.setText(listaClientes.buscarPorCedula(ced).getRecepcion());
            }
        });

        actualizarDatosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String cedula = lblCedulaMiperfil.getText();
                String newNombre = txtNuevoNAME.getText();
                String newApellido = txtNewApellido.getText();
                String newCelular = txtCeluNuevo.getText();
                String newCorreo = txtCorreoNuevo.getText();
                String newEntrega = txtNuevaEntrega.getText();
                String newRecepcion = txtNuevaRecepcion.getText();

                Usuario usuario = listaClientes.buscarPorCedula(cedula);
                if (newEntrega.isEmpty()&& newRecepcion.isEmpty()&& newNombre.isEmpty() && newApellido.isEmpty() && newCelular.isEmpty()&&newCorreo.isEmpty()){
                    JOptionPane.showMessageDialog(null,"ERROR\nIngrese los datos a actualizar");
                }else {

                    if (newNombre.isEmpty()) {
                        usuario.setNombre(usuario.getNombre());
                    } else {
                        usuario.setNombre(newNombre);
                    }
                    if (newApellido.isEmpty()) {
                        usuario.setApellido(usuario.getApellido());
                    } else {
                        usuario.setApellido(newApellido);
                    }
                    if (newCelular.isEmpty()) {
                        usuario.setCelular(usuario.getCelular());
                    } else {
                        usuario.setCelular(newCelular);
                    }
                    if (newCorreo.isEmpty()) {
                        usuario.setCorreo(usuario.getCorreo());
                    } else {
                        usuario.setCorreo(newCorreo);
                    }
                    if (newEntrega.isEmpty()){
                        usuario.setEntrega(usuario.getEntrega());
                    } else {
                        usuario.setEntrega(newEntrega);
                    }
                    if (newRecepcion.isEmpty()){
                        usuario.setRecepcion(usuario.getRecepcion());
                    } else {
                        usuario.setRecepcion(newRecepcion);
                    }

                    JOptionPane.showMessageDialog(null, "Los datos se han actualizado");
                    JOptionPane.showMessageDialog(null, usuario.toString());
                    txtMiPerfilD.setText(usuario.toString());
                    txtNuevoNAME.setText("");
                    txtNewApellido.setText("");
                    txtCeluNuevo.setText("");
                    txtCorreoNuevo.setText("");
                    txtNuevaRecepcion.setText("");
                    txtNuevaEntrega.setText("");
                }

            }
        });
        regresarButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //volver a menu princ
                tbtActualizar.remove(jpMiPerfil);
                tbtActualizar.add("MENU PRINCIPAL", jpMenuPrincipa);
            }
        });

        lavadoYSecadoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tbtActualizar.add("LAVADO Y SECADO", jpWashNDry);
                tbtActualizar.remove(jpServicios);
            }
        });
        REGRESARButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tbtActualizar.remove( jpWashNDry);
                tbtActualizar.add("SERVICIOS",jpServicios);
            }
        });
        tinturadoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tbtActualizar.remove(jpServicios);
                tbtActualizar.add("TINTURADOS", jTinturados);
            }
        });

        REGRESARButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tbtActualizar.remove(jTinturados);
                tbtActualizar.add("SERVICIOS",jpServicios);

            }
        });
        arregloDePrendasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tbtActualizar.remove(jpServicios);
                tbtActualizar.add("ARREGLOS",jArreglos);
            }
        });
        REGRESARButton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tbtActualizar.add("SERVICIOS", jpServicios);
                tbtActualizar.remove(jArreglos);
            }
        });
        REGISTRARNUEVOSCLIENTESButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tbtActualizar.add("REGISTRAR NUEVOS CLIENTES", jpRegisUsu);
                tbtActualizar.remove(jpMenuAdmin);
            }
        });

        regresarButton4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tbtActualizar.remove(jpRegisUsu);
                tbtActualizar.add("MENU ADMINISTRADOR",jpMenuAdmin);
            }
        });


        ELIMINARCLIENTESButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tbtActualizar.add("ELIMINAR CLIENTES", jpDeleteCL);
                tbtActualizar.remove(jpMenuAdmin);
            }
        });

        regresarButton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tbtActualizar.remove( jpDeleteCL);
                tbtActualizar.add("MENU ADMINISTRADOR", jpMenuAdmin);
            }
        });

        ACTUALIZARDATOSCLIENTESButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tbtActualizar.add("ACTUALIZAR", jpActualizar);
                tbtActualizar.remove(jpMenuAdmin);
            }
        });

        regresarButton5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tbtActualizar.remove(jpActualizar);
                tbtActualizar.add("MENU ADMINISTRADOR", jpMenuAdmin);
            }
        });

        VERPEDIDOSButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tbtActualizar.add("VER PEDIDOS", jVerPedidos);
                tbtActualizar.remove(jpMenuAdmin);
            }
        });

        regresarButton6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tbtActualizar.add("MENU ADMINISTRADOR", jpMenuAdmin);
                tbtActualizar.remove(jVerPedidos);
            }
        });

        BUSCARCLIENTESButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tbtActualizar.add("BUSCAR",JpBuscarUsuAd);
                tbtActualizar.remove(jpMenuAdmin);
            }
        });

        regresarButton7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tbtActualizar.remove(JpBuscarUsuAd);
                tbtActualizar.add("MENU ADMINISTRADOR", jpMenuAdmin);

            }
        });

        LISTARCLIENTESButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tbtActualizar.add("LISTAR",JpListar);
                tbtActualizar.remove(jpMenuAdmin);
            }
        });

        regresarButton8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tbtActualizar.add("MENU ADMINISTRADOR", jpMenuAdmin);
                tbtActualizar.remove(JpListar);
            }
        });
        VERIFICARTRANSFERENCIASButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tbtActualizar.add("VERIFICAR TRANSFERENCIA", jpVerificarTrans);
                tbtActualizar.remove(jpMenuAdmin);
            }
        });


        REGRESARButton4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tbtActualizar.add("MENU ADMINISTRADOR", jpMenuAdmin);
                tbtActualizar.remove( jpVerificarTrans);

            }
        });

        MIPERFILButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tbtActualizar.add("MI PERFIL", jPerfilAdmn);
                tbtActualizar.remove(jpMenuAdmin);

            }
        });

        actualizarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String cedula = lblCedAdmin.getText();
                String newNombre = txtNewAdminNombre.getText();
                String newApellido = txtNewApellidoAdmin.getText();
                String newCelular = txtNewAdminCelu.getText();
                String newCorreo = txtNewAdminCorreo.getText();

                Usuario administrado = listaAdministradores.buscarPorCedula(cedula);

                if (newNombre.isEmpty() && newApellido.isEmpty() && newCelular.isEmpty() && newCorreo.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "\t\t\tERROR\nIngrese los datos a actualizar");
                } else {
                    if (newNombre.isEmpty()) {
                        administrado.setNombre(administrado.getNombre());
                    } else {
                        administrado.setNombre(newNombre);
                    }
                    if (newApellido.isEmpty()) {
                        administrado.setApellido(administrado.getApellido());
                    } else {
                        administrado.setApellido(newApellido);
                    }
                    if (newCelular.isEmpty()) {
                        administrado.setCelular(administrado.getCelular());
                    } else {
                        administrado.setCelular(newCelular);
                    }
                    if (newCorreo.isEmpty()) {
                        administrado.setCorreo(administrado.getCorreo());
                    } else {
                        administrado.setCorreo(newCorreo);
                    }
                    JOptionPane.showMessageDialog(null, "Los datos se han actualizado");
                    JOptionPane.showMessageDialog(null, administrado.toString());
                    txtMiperfilAdmn.setText(administrado.toString());
                    txtNewAdminNombre.setText("");
                    txtNewApellidoAdmin.setText("");
                    txtNewAdminCelu.setText("");
                    txtNewAdminCorreo.setText("");
                    txtNewEntrega.setText("");
                    txtNewRecepcion.setText("");
                }
            }
        });
        cerrarSesionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tbtActualizar.remove(jpMiPerfil);
                tbtActualizar.remove(jPerfilAdmn);
                tbtActualizar.remove(jpDeleteCL);
                tbtActualizar.remove(jpVerificarTrans);
                tbtActualizar.remove(JpListar);
                tbtActualizar.remove(JpBuscarUsuAd);
                tbtActualizar.remove(jpActualizar);
                tbtActualizar.remove(jpRegisUsu);
                tbtActualizar.remove(JpIniciarUsu);
                tbtActualizar.remove(JpCrearUsu);
                tbtActualizar.remove(JpTarjeta);
                tbtActualizar.remove(JpMetodosPago);
                tbtActualizar.remove(JpTransferencia);
                tbtActualizar.remove(JpAppMovil);
                tbtActualizar.remove(jpMenuPrincipa);
                tbtActualizar.remove(jpSoliServ);
                tbtActualizar.remove(jpServicios);
                tbtActualizar.remove(jpSoporteApp);
                tbtActualizar.remove(jpWPP);
                tbtActualizar.add("FAST CLEANING LAUNDRY ", JpGestionar);
            }
        });
        regresarButton9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tbtActualizar.remove( jPerfilAdmn);
                tbtActualizar.add("MENU ADMINISTRADOR", jpMenuAdmin);
            }
        });

        SOPORTEAPPButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tbtActualizar.add("SOPORTE APP", jpSoporteApp);
                tbtActualizar.remove( jpMenuAdmin);

            }
        });

        regresarButton10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tbtActualizar.remove(jpSoporteApp);
                tbtActualizar.add("MENU ADMINISTRADOR", jpMenuAdmin);
            }
        });
        btnHelp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tbtActualizar.remove(jpMenuPrincipa);
                tbtActualizar.add("CONTACTAR AYUDA", jpContactarAyuda);


            }
        });
        ESCRIBIRAWHATSAPPButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tbtActualizar.add("ENLACE A WHATSAPP", jpWPClien );
                tbtActualizar.remove(jpContactarAyuda);

            }
        });
        REGRESARButton5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tbtActualizar.add("MENU PRINCIPAL", jpMenuPrincipa);
                tbtActualizar.remove(jpContactarAyuda);
            }
        });
        regresarButton12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tbtActualizar.remove(jpWPClien);
                tbtActualizar.add("CONTACTAR AYUDA", jpContactarAyuda);
            }
        });
        REGRESARButton6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tbtActualizar.remove(JpTarjeta);
                tbtActualizar.add("METEDOS DE PAGO", JpMetodosPago);
            }
        });

        btnIR.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String metodoP = cboMetodoPAGO.getSelectedItem().toString();
                if (metodoP.equalsIgnoreCase("TRANSFERENCIA")){
                    tbtActualizar.remove(jpPagarFrame);
                    tbtActualizar.add("TRANSFERENCIA", JpTransferencia );
                } else if (metodoP.equalsIgnoreCase("APP MOBIL")) {
                    tbtActualizar.remove(jpPagarFrame);
                    tbtActualizar.add("APP MOBIL", JpAppMovil);
                } else if (metodoP.equalsIgnoreCase("TARJETA DE CREDITO")) {
                    tbtActualizar.remove(jpPagarFrame);
                    tbtActualizar.add("TARJETA DE CREDITO", jpTarjetaCredi);
                }
            }
        });
        PAGARButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String servico = cboPservicio.getSelectedItem().toString();
                String tarjetafav = txtTarjetaFAv.getText();
                if (tarjetafav.isEmpty()){
                    JOptionPane.showMessageDialog(null,"No se ha detectado ninguna tarjeta, agregue una priimero");
                } else {
                    if (servico.equalsIgnoreCase("LAVADO EN AGUA")){
                        esAgua();
                    } else if (servico.equalsIgnoreCase("LAVADO EN SECO")) {
                        esSeco();
                    } else if (servico.equalsIgnoreCase("TINTURADOS")) {
                        esTinturado();
                    } else if (servico.equalsIgnoreCase("ARREGLOS")){
                        esArreglo();
                    } else if (servico.equalsIgnoreCase("SELECCIONA EL SERVICIO")){
                        JOptionPane.showMessageDialog(null,"SELECCIONE UN SERVICIO");
                    }

                }
            }
        });
        SALIRButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tbtActualizar.remove(JpAppMovil);
                tbtActualizar.add("MENU PRINCIPAL",jpMenuPrincipa);
            }
        });
        PAGARButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre = txtNameDeUna.getText();
                String monto = txtMontoDeUNa.getText();
                String fecha = txtfechaDeUna.getText();
                String serv =cboServDeUna.getSelectedItem().toString();
                if (nombre.isEmpty() || monto.isEmpty()||fecha.isEmpty()){
                    JOptionPane.showMessageDialog(null,"Rellene todos los campos");
                }else {
                    if (serv.equalsIgnoreCase("TINTURADOS")){
                        esTinturado();
                        esDeuna();
                    } else if (serv.equalsIgnoreCase("LAVADO EN AGUA")){
                        esAgua();
                        esDeuna();
                    } else if (serv.equalsIgnoreCase("LAVADO EN SECO")) {
                        esSeco();
                        esDeuna();
                    } else if (serv.equalsIgnoreCase("ARREGLOS")) {
                        esArreglo();
                        esDeuna();
                    } else if (serv.equalsIgnoreCase("SELECCIONA EL SERVICIO")) {
                        JOptionPane.showMessageDialog(null,"Selecciona un servicio a cancelar");
                    }

                }



            }
        });
        BUSCARButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String ced = (String) cboCEDSECO.getSelectedItem();
                String numOrden = cboORDSECO.getSelectedItem().toString();
                int aux = Integer.parseInt(numOrden);
                Orden o = ordenSeco.buscarOrdenSECO(ced, aux); //busca la orden por cedula
                txtPedidosSECO.setText(o.toString());
                txtDireccionES.setText(listaClientes.buscarPorCedula(ced).getEntrega());
                txtDireccionRS.setText(listaClientes.buscarPorCedula(ced).getRecepcion());
            }
        });
        CAMBIARMETODODEPAGOButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tbtActualizar.remove(jpTarjetaCredi);
                tbtActualizar.add("PAGAR", jpPagarFrame);
            }
        });

        CAMBIARMETODOPAGOButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tbtActualizar.remove(JpAppMovil);
                tbtActualizar.add("PAGAR", jpPagarFrame);
            }
        });

        CAMBIARMETODOPAGOButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tbtActualizar.remove(JpTransferencia);
                tbtActualizar.add("PAGAR", jpPagarFrame);
            }
        });
        AGREGARNUEVATARJETAButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tbtActualizar.remove(jpTarjetaCredi);
                tbtActualizar.add("AGREGAR TARJETA", jpNuevaTarj);
            }
        });
        REGISTRARButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombreprop = txtNamePropCC.getText();
                String numTarj = txtCC.getText();
                String diaTarjeta = txtDay.getText();
                String mesTarjeta = txtMonth.getText();
                String anioTarjeta = txtYear.getText();
                String fechaTarj = diaTarjeta+"/"+mesTarjeta+"/"+anioTarjeta.toString();
                String cvv = txtCVV.getText();
                Tarjeta tarjetin = new Tarjeta(numTarj,fechaTarj,cvv);
                boolean isValid = pepe.validateCreditCard(numTarj);
                boolean validarFecha = pepe.validarFecha(fechaTarj);
                if (isValid) {
                    if (validarFecha) {
                        JOptionPane.showMessageDialog(null, "El número de tarjeta es válido.");
                        pepe.agregar(tarjetin);
                        txtTarjetaFAv.setText(String.valueOf(pepe.listita.getLast()));
                        txtNombreProp.setText("");
                        txtNumTarj.setText("");
                        txtDia.setText("");
                        txtMes.setText("");
                        txtAnio.setText("");
                        txtCVV.setText("");
                        tbtActualizar.remove(jpNuevaTarj);
                        tbtActualizar.add(jpTarjetaCredi);
                    }else{
                        JOptionPane.showMessageDialog(null,"La fecha ingresada no es valida");
                    }

                } else {
                    JOptionPane.showMessageDialog(null,"El número de tarjeta no es válido.");
                }


            }
        });

        buscarOrdenesButton.addActionListener(new
                                                      ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(ordenes.tamano()>0){
                    String cedula = lblStatuCI.getText();
                    numOrden = 1;
                    Orden status = ordenes.buscarOrden(cedula, numOrden);
                    String ver = status.toStringStatus();
                    txtStatus.setText(ver);
                }else if(ordenSeco.tamano()>0){
                    String cedula = lblStatuCI.getText();
                    numOrden = 1;
                    Orden status = ordenSeco.buscarOrdenSECO(cedula, numOrden);
                    String ver = status.toStringStatus();
                    txtStatus.setText(ver);
                }else if (ordenerTNT.tamano()>0){
                    String cedula = lblStatuCI.getText();
                    numOrden = 1;
                    OrdenTint status = ordenerTNT.buscarOrden(cedula, numOrden);
                    String ver = status.toStringStatus();
                    txtStatus.setText(ver);
                }else if(ordenesArgg.tamano()>0){
                    String cedula = lblStatuCI.getText();
                    numOrden = 1;
                    OrdenArreglo status = ordenesArgg.buscarOrden(cedula, numOrden);
                    String ver = status.toStringStatus();
                    txtStatus.setText(ver);
                }else JOptionPane.showMessageDialog(null,"No ha solicitado ningun servicio");
            }
        });
        siguienteOrdenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (numOrden<=ordenes.tamano()+1){
                    String cedula = lblStatuCI.getText();
                    numOrden=numOrden+1;
                    txtStatus.setText(ordenes.buscarOrden(cedula, numOrden).toStringStatus());
                }else if(numOrden<=ordenSeco.tamano()+1){
                    String cedula = lblStatuCI.getText();
                    numOrden=1;
                    txtStatus.setText(ordenSeco.buscarOrdenSECO(cedula, numOrden).toStringStatus());
                    numOrden=numOrden+1;
                }else if(numOrden<=ordenerTNT.tamano()+1){
                    String cedula = lblStatuCI.getText();
                    numOrden=1;
                    txtStatus.setText(ordenerTNT.buscarOrden(cedula, numOrden).toStringStatus());
                    numOrden=numOrden+1;
                }else if(numOrden<=ordenesArgg.tamano()+1){
                    String cedula = lblStatuCI.getText();
                    numOrden=1;
                    txtStatus.setText(ordenesArgg.buscarOrden(cedula, numOrden).toString());
                    numOrden=numOrden+1;
                }else JOptionPane.showMessageDialog(null, "No existen más ordenes");
            }
        });
        UDStatus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String status = cboStatusUD.getSelectedItem().toString();
                String cedula = cboVeriPedi.getSelectedItem().toString();
                int orden = Integer.parseInt(cboOrden.getSelectedItem().toString());
                ordenes.buscarOrden(cedula, orden).setStatus(status);
            }
        });
        btnSTATUS.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tbtActualizar.remove(jpSoliServ);
                tbtActualizar.add("STATUS DE LAS ORDENES", jpVerStatus);
            }
        });
        REGRESARButton7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tbtActualizar.remove(jpVerStatus);
                tbtActualizar.add("SOLICITAR SERVICIO", jpSoliServ);
            }
        });
    }
    
    public void esAgua (){
            String cedu = lblCedulaAgua.getText();
            String lista = txtProduAGG.getText();
            int aux = ordenes.tamano()+1;
            String status = "Pendiente";
            boolean veri = listaClientes.verificarCedulaUnica(cedu); //verifica si la cedula ingresada es de un usuario existente

            if (veri) {
                JOptionPane.showMessageDialog(null, "Ese usuario no esta registrado, verifique la cedula");
            } else {
                Orden o = new Orden(cedu, lista, aux, status); //crea objeto orden con un numero de orden
                ordenes.add(o); //enlistar ordenes

                LinkedList cedulasPedidos = ordenes.cedulasPedidos();
                DefaultComboBoxModel dcbo = new DefaultComboBoxModel();
                for (Object elemento : cedulasPedidos) {
                    dcbo.addElement(elemento); //para que se añada solo una vez la cedula del usuario
                    // pero si se añade el numero de ordenes que tiene
                }
                cboVeriPedi.setModel(dcbo);

                LinkedList numOrden = ordenes.ordenespedidos();
                DefaultComboBoxModel dcbo1 = new DefaultComboBoxModel<>();
                for (Object elem : numOrden) {
                    dcbo1.addElement(elem);
                }
                cboOrden.setModel(dcbo1);

                JOptionPane.showMessageDialog(null, "Su pedido ha sido registrado, gracias por su confianza");
                tbtActualizar.remove(jpTarjetaCredi);
                tbtActualizar.remove(JpTransferencia);
                tbtActualizar.remove(JpAppMovil);
                tbtActualizar.add("MENU PRINCIPAL", jpMenuPrincipa);
                txtProduAGG.setText("");
            }
    }

    public void esSeco(){
        String cedula = lblCedulaSeco.getText();
        String listaSec = txtproduSeco.getText();
        int auxSec = ordenSeco.tamano()+1;
        String status = "Pendiente";

            boolean veri = listaClientes.verificarCedulaUnica(cedula); //verifica si la cedula ingresada es de un usuario existente
            if (veri){
                JOptionPane.showMessageDialog(null,"Ese usuario no esta registrado, verifique la cedula");
            }else {
                Orden ordenSec = new Orden(cedula, listaSec, auxSec, status); //crea objeto orden con un numero de orden
                ordenSeco.add(ordenSec); //enlistar ordenes
                LinkedList cedulasPedidos = ordenSeco.cedulasSECO();
                DefaultComboBoxModel dcbo10 = new DefaultComboBoxModel();
                for (Object ordeSec:cedulasPedidos){
                    dcbo10.addElement(ordeSec);
                }
                cboCEDSECO.setModel(dcbo10);
                LinkedList numOrdenSec = ordenSeco.ordeneSECO();
                DefaultComboBoxModel dcbo9 = new DefaultComboBoxModel<>();
                for (Object elem:numOrdenSec){
                    dcbo9.addElement(elem);
                }
                cboORDSECO.setModel(dcbo9);
                JOptionPane.showMessageDialog(null,"Su pedido ha sido registrado, gracias por su confianza");
                tbtActualizar.remove(jpTarjetaCredi);
                tbtActualizar.remove(JpAppMovil);
                tbtActualizar.remove(JpTransferencia);
                tbtActualizar.add("MENU PRINCIPAL", jpMenuPrincipa);
                txtproduSeco.setText("");
            }

    }
    public void esTinturado(){
        String ced= lblCedulaTinturado.getText();
        String prenda = txtNombrePrenda.getText();
        String color = txtColor.getText();
        int ordenes = ordenerTNT.tamano()+1;
        String status = "Pendiente";
        boolean veri = listaClientes.verificarCedulaUnica(ced); //verifica si la cedula ingresada es de un usuario existente
        if (veri){
            JOptionPane.showMessageDialog(null,"Ese usuario no esta registrado, verifique la cedula");
        }else {
            OrdenTint b = new OrdenTint(ced,prenda,color,ordenes,status); //crea objeto orden con un numero de orden
            ordenerTNT.add(b); //enlistar ordenes

            LinkedList cedulasPedTint = ordenerTNT.cedulasPedidos();
            DefaultComboBoxModel dcb3 = new DefaultComboBoxModel();
            for (Object elemento:cedulasPedTint){
                dcb3.addElement(elemento);
            }
            cboCedTNT.setModel(dcb3);

            LinkedList numOrden = ordenerTNT.ordenesPedidos();
            DefaultComboBoxModel dcb4 = new DefaultComboBoxModel<>();
            for (Object elem:numOrden){
                dcb4.addElement(elem);
            }
            cboOrdTNT.setModel(dcb4);
            JOptionPane.showMessageDialog(null,"Su pedido ha sido registrado, gracias por su confianza");
            tbtActualizar.remove(jpTarjetaCredi);
            tbtActualizar.remove(JpAppMovil);
            tbtActualizar.remove(JpTransferencia);
            tbtActualizar.add("MENU PRINCIPAL", jpMenuPrincipa);
            txtNombrePrenda.setText("");
            txtColor.setText("");
        }

    }
    public void esArreglo(){
        String ced= lblCedulaArreglo.getText();
        String prenda = txtNomPrenda.getText();
        String descrip = txtDescrip.getText();
        int ordenes = ordenesArgg.tamano()+1;
        String status = "Pendiente";

            boolean veri = listaClientes.verificarCedulaUnica(ced); //verifica si la cedula ingresada es de un usuario existente
            if (veri){
                JOptionPane.showMessageDialog(null,"Ese usuario no esta registrado, verifique la cedula");
            }else {
                OrdenArreglo b = new OrdenArreglo(ced, prenda, descrip, ordenes, status); //crea objeto orden con un numero de orden
                ordenesArgg.add(b); //enlistar ordenes

                LinkedList cedulasPedArregg = ordenesArgg.cedulasPedidos();
                DefaultComboBoxModel cedulasPA = new DefaultComboBoxModel();
                for (Object elemento : cedulasPedArregg) {
                    cedulasPA.addElement(elemento);
                }
                cboCedArreglo.setModel(cedulasPA);

                LinkedList numOrdenArg = ordenesArgg.ordenesPedidos();
                DefaultComboBoxModel Norden = new DefaultComboBoxModel<>();
                for (Object elem : numOrdenArg) {
                    Norden.addElement(elem);
                }
                cboOrdenArregl.setModel(Norden);
                JOptionPane.showMessageDialog(null,"Su pedido ha sido registrado, gracias por su confianza");
                tbtActualizar.remove(jpTarjetaCredi);
                tbtActualizar.remove(JpTransferencia);
                tbtActualizar.remove(JpAppMovil);
                tbtActualizar.add("MENU PRINCIPAL", jpMenuPrincipa);

            }

        }
        public void transferir (){
            String nombreprop = txtNombreCuenta.getText();
            String cuenta = txtNumCuenta.getText();
            int nCuenta = Integer.parseInt(cuenta);
            String comprobante = txtComporobante.getText();
            String banco = txtBanco.getText();
            String fecha = txtFechaTransfer.getText();
            Float monto = Float.parseFloat(txtMonto.getText());
            Comprobantes neni = new Comprobantes(nombreprop,nCuenta,comprobante,fecha, banco, monto);
            coco.agregar(neni);
            txtTransfer.setText(coco.toString());
            JOptionPane.showMessageDialog(null,"Estamos validando tu transferencia," +
                    " se te enviará la confirmación al correo");

        }
        public void esDeuna (){

            String nombre = txtNameDeUna.getText();
            String monto = txtMontoDeUNa.getText();
            String fecha = txtfechaDeUna.getText();
            ComprobanteDeUna deUna = new ComprobanteDeUna(nombre,monto,fecha);
            rila.agregar(deUna);
            txtTransDeUna.setText(rila.toString());
            JOptionPane.showMessageDialog(null,"Estamos validando tu transferencia," +
                    " se te enviará la confirmación al correo");
            txtNameDeUna.setText("");
            txtMontoDeUNa.setText("");
            txtfechaDeUna.setText("");
        }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Ventana");
        frame.setContentPane(new Ventana().principal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // frame.pack();
        frame.setSize(600,800);

        frame.setVisible(true);
    }
}
