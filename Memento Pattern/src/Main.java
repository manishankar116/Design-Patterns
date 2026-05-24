//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        History history = new History();

        editor.write("Hello");
        history.save(editor.save());

        editor.write("Hello World");
        history.save(editor.save());

        editor.write("Hello World Java");

        System.out.println("Current: " + editor.getContent());

        //Undo
        editor.restore(history.undo());

        System.out.println("After Undo: " + editor.getContent());

        //Undo Again
        editor.restore((history.undo()));

        System.out.println("Second Undo: " + editor.getContent());
    }
}