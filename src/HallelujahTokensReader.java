
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;

public class HallelujahTokensReader {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Visualizador de Tokens");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);

        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("Arquivo");
        JMenuItem openMenuItem = new JMenuItem("Abrir Arquivo");
        fileMenu.add(openMenuItem);
        menuBar.add(fileMenu);
        frame.setJMenuBar(menuBar);

        JTextArea textArea = new JTextArea();
        textArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textArea);
        frame.add(scrollPane);

        openMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser(System.getProperty("user.dir"));

                FileNameExtensionFilter filter = new FileNameExtensionFilter("Arquivos de código", "cruz", "txt",
                        "java");
                fileChooser.setFileFilter(filter);

                int result = fileChooser.showOpenDialog(frame);

                if (result == JFileChooser.APPROVE_OPTION) {
                    try {
                        textArea.setText("");
                        InputStream is = new FileInputStream(fileChooser.getSelectedFile());
                        CharStream input = CharStreams.fromStream(is);
                        HallelujahLangLexer lexer = new HallelujahLangLexer(input);
                        Token t;

                        while ((t = lexer.nextToken()).getType() != Token.EOF) {
                            String tokenName = HallelujahLangLexer.VOCABULARY.getDisplayName(t.getType());
                            textArea.append("<" + tokenName + "," + t.getText() + ">\n");
                        }
                    } catch (IOException ex) {
                        JOptionPane.showMessageDialog(frame,
                                "Ocorreu um erro ao processar o arquivo: " + ex.getMessage(), "Erro",
                                JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        });

        frame.setVisible(true);
    }
}
