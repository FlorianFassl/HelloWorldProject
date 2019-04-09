package mygui2;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.events.MouseMoveListener;
import org.eclipse.swt.events.MouseEvent;

public class window {

	protected Shell shell;
	private Text VornameTF;
	private Label NachnameL;
	private Text NachnameTF;
	private Label StrasseL;
	private Label HausnummerL;
	private Label PLZL;
	private Label OrtL;
	private Text StrasseTF;
	private Text HausnummerTF;
	private Text PLZTF;
	private Text OrtTF;
	private Label LNL;
	private Text LNTF;
	private Button btnCancel;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			window window = new window();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setAlpha(213);
		shell.setBackground(SWTResourceManager.getColor(SWT.COLOR_TITLE_INACTIVE_BACKGROUND));
		shell.setSize(444, 554);
		shell.setText("SWT Application");
		
		Button btnMiknoppekommisarkoppe = new Button(shell, SWT.NONE);
		btnMiknoppekommisarkoppe.setBackground(SWTResourceManager.getColor(SWT.COLOR_GREEN));
		btnMiknoppekommisarkoppe.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				System.out.println(" Serienkiller wird für 70000$ für die Tötung der Zielperson angeheuert. Daten der Zielperson:");
				System.out.println(VornameTF.getText());
				System.out.println(NachnameTF.getText());
				System.out.println(StrasseTF.getText());
				System.out.println(HausnummerTF.getText());
				System.out.println(PLZTF.getText());
				System.out.println(OrtTF.getText());
				System.out.println(LNTF.getText());
			}
		});
		btnMiknoppekommisarkoppe.setBounds(10, 10, 75, 25);
		btnMiknoppekommisarkoppe.setText("Hire");
		
		Label VornameL = new Label(shell, SWT.NONE);
		VornameL.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		VornameL.setBounds(116, 15, 55, 15);
		VornameL.setText("Vorname");
		
		VornameTF = new Text(shell, SWT.BORDER);
		VornameTF.setBounds(212, 12, 130, 25);
		
		NachnameL = new Label(shell, SWT.NONE);
		NachnameL.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		NachnameL.setBounds(116, 47, 65, 15);
		NachnameL.setText("Nachname");
		
		NachnameTF = new Text(shell, SWT.BORDER);
		NachnameTF.setBounds(213, 43, 129, 25);
		
		StrasseL = new Label(shell, SWT.NONE);
		StrasseL.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		StrasseL.setBounds(116, 77, 55, 15);
		StrasseL.setText("Stra\u00DFe");
		
		HausnummerL = new Label(shell, SWT.NONE);
		HausnummerL.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		HausnummerL.setBounds(116, 108, 87, 15);
		HausnummerL.setText("Hausnummer");
		
		PLZL = new Label(shell, SWT.NONE);
		PLZL.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		PLZL.setBounds(116, 143, 55, 15);
		PLZL.setText("PLZ");
		
		OrtL = new Label(shell, SWT.NONE);
		OrtL.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		OrtL.setBounds(116, 174, 55, 15);
		OrtL.setText("Ort");
		
		StrasseTF = new Text(shell, SWT.BORDER);
		StrasseTF.setBounds(213, 74, 130, 25);
		
		HausnummerTF = new Text(shell, SWT.BORDER);
		HausnummerTF.setBounds(213, 105, 130, 25);
		
		PLZTF = new Text(shell, SWT.BORDER);
		PLZTF.setBounds(212, 140, 130, 25);
		
		OrtTF = new Text(shell, SWT.BORDER);
		OrtTF.setBounds(212, 171, 130, 25);
		
		LNL = new Label(shell, SWT.NONE);
		LNL.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		LNL.setBounds(116, 216, 102, 15);
		LNL.setText("Letze Nachricht:");
		
		LNTF = new Text(shell, SWT.BORDER);
		LNTF.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		LNTF.setBounds(238, 202, 172, 49);
		
		btnCancel = new Button(shell, SWT.NONE);
		btnCancel.setBackground(SWTResourceManager.getColor(SWT.COLOR_RED));
		btnCancel.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				System.exit(0);
			}
		});
		btnCancel.setBounds(10, 41, 75, 25);
		btnCancel.setText("Cancel");
		
		Composite composite = new Composite(shell, SWT.NONE);
		composite.addMouseMoveListener(new MouseMoveListener() {
			public void mouseMove(MouseEvent arg0) {
				System.out.println(arg0.x + " / " + arg0.y);
	
			}
		});
		composite.setBounds(134, 287, 250, 145);
		
	}
}
