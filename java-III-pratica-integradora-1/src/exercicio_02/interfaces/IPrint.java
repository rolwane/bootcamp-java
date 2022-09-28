package exercicio_02.interfaces;

import exercicio_02.classes.Document;

public interface IPrint {
    public static void print(Document document) {
        System.out.println("Printing the document: " + document.documentType);
        System.out.println("--------------------------");
        System.out.println(document);
    }
}
