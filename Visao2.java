package apresentacao;

import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Visao2 extends JFrame{
	//Propriedades da classe
	private static final long serialVersionUID = 1L;
	private JPanel objPainel = new JPanel();
	
	private JMenuBar barraDeMenu = new JMenuBar();
	private	JMenu mnuArquivo = new JMenu("Arquivo");
	private JMenuItem mniNovo = new JMenuItem("Novo");
	private JMenuItem mniColar = new JMenuItem("Colar");
	private JMenuItem mniCopiar = new JMenuItem("Copiar");
	private JMenuItem mniAbrir = new JMenuItem("Abrir");
	private JMenuItem mniSair = new JMenuItem("Sair");
	private JMenu mnuEditar = new JMenu("Editar");
	
	private JButton buttonOk = new JButton("OK");
	private JLabel lblTitulo = new JLabel("Titulo");
	private JTextField txtTitulo = new JTextField();
	
	private JLabel lblComentario = new JLabel("Comentario");
	private JTextArea txtComentario = new JTextArea();
	private JScrollPane jspComentario = new JScrollPane(txtComentario);
	
	private JLabel lblPais = new JLabel("Pa�s");
	private JComboBox<String> cboPais = new JComboBox<String>();
	
	private JCheckBox chkConcordo = new JCheckBox("Concordo");
	
	private JLabel lblSexo = new JLabel("Sexo");
	private JRadioButton optMasculino = new JRadioButton("Marculino");
	private JRadioButton optFeminino = new JRadioButton("Feminino");
	private ButtonGroup btgSexo = new ButtonGroup();
	
	private JLabel lblCompra = new JLabel("Lista de Compra");
	private JList<String> lstCompra = new JList<String>();
	private DefaultListModel<String> dlmCompra = new DefaultListModel<String>();
	private JScrollPane jspCompra = new JScrollPane(lstCompra);
	
	//Metodo principal de execu��o da class
	public static void main(String[] args) {
		 new Visao2().setVisible(true);
	}
	
	//Metodo construtor da classe
	public Visao2() {
		//Configura��o da janela
		setTitle("EssaPorraAi");
		setSize(800,600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        //Configura��o do painel
        objPainel.setLayout(null);
        setContentPane(objPainel);
        
        //Configura��o do menu
        setJMenuBar(barraDeMenu);
        barraDeMenu.add(mnuArquivo);
        mnuArquivo.add(mniNovo);
        mnuArquivo.add(mniAbrir);
        mnuArquivo.addSeparator();
        mnuArquivo.add(mniSair);
        barraDeMenu.add(mnuEditar);
        mnuEditar.add(mniCopiar);
        mnuEditar.add(mniColar);
        
        mniNovo.addActionListener(new ControladorNovo());
        mniSair.addActionListener(new ControladorSair());
        
        
        //Configura��es do bot�o
        buttonOk.setBounds(650,480,100,30);
        objPainel.add(buttonOk);
        buttonOk.addActionListener(new ControladorSair());
      
        
        //Configura��o do titulo
        lblTitulo.setBounds(20, 20, 200, 20);
        objPainel.add(lblTitulo);
        txtTitulo.setBounds(20,40,400,20);
        objPainel.add(txtTitulo);
        
        //Configura��o caixa de comentarios
        lblComentario.setBounds(20,80,200,20);
        objPainel.add(lblComentario);
        jspComentario.setBounds(20,100,700,100);
        objPainel.add(jspComentario);
        txtComentario.setLineWrap(true);
        
        //Configura��o da lista e paises (ComboBox)
        lblPais.setBounds(20,220,200,20);
        objPainel.add(lblPais);
        cboPais.setBounds(20,240,200,20);
        objPainel.add(cboPais);
        cboPais.addItem("");
        cboPais.addItem("Brasil");
        cboPais.addItem("Brasil");
        cboPais.addItem("Brasil");
        cboPais.addItem("Brasil");
        cboPais.addItem("Brasil");
        
        //Configura��o da Concordo (CheckBox)
        chkConcordo.setBounds(15,280,200,20);
        objPainel.add(chkConcordo);
        
        //Cnfigura��o do ButtonGroup(option)
        lblSexo.setBounds(20, 310, 200, 20);
        objPainel.add(lblSexo);
        optMasculino.setBounds(20,340,100,20);
        objPainel.add(optMasculino);
        optFeminino.setBounds(120, 340, 100, 20);
        objPainel.add(optFeminino);
        btgSexo.add(optMasculino);
        btgSexo.add(optFeminino);
        optMasculino.setSelected(true);
        
        //configura��o lista de compras
        lblCompra.setBounds(20,380,200,20);
        objPainel.add(lblCompra);
        jspCompra.setBounds(20,400,500,100);
        objPainel.add(jspCompra);
        lstCompra.setModel(dlmCompra);
        dlmCompra.addElement("feijão");
        dlmCompra.addElement("feijão");
        dlmCompra.addElement("feijão");
        dlmCompra.addElement("feijão");
        dlmCompra.addElement("feijão");
        dlmCompra.addElement("feij�o");
	}
}

