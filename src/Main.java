
import java.io.IOException;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class Main {

    private static final String EXTENSION = ".cruz";

    public static void main(String[] args) {
        try {
            String[] fileNames = { "tests/test0" + EXTENSION, "tests/test1" + EXTENSION,
                    "tests/test2" + EXTENSION, "tests/test3" + EXTENSION, "tests/test4" + EXTENSION, };
            for (String fileName : fileNames) {
                CharStream cs = CharStreams.fromFileName(fileName);
                System.out.println("Interpreting file " + fileName);
                System.out.println("Interpreting file " + cs);
                HallelujahLangLexer lexer = new HallelujahLangLexer(cs);
                CommonTokenStream tokens = new CommonTokenStream(lexer);
                HallelujahLangParser parser = new HallelujahLangParser(tokens);

                HallelujahLangParser.ProgramContext tree = parser.program();

                HallelujahLangCustomVisitor visitor = new HallelujahLangCustomVisitor();
                visitor.visit(tree);

                System.out.println("Interpretation finished");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}