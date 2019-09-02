package simedia;

public class TestAuthor {

    public static void main(String[] args) {

        Author blaga = new Author("Lucian Blaga", "lucianblaga@poezii.ro", 'm');
        System.out.println(blaga);
        blaga.setEmail("lucianblaga@filozofi.ro");
        System.out.println(blaga);
        System.out.println(blaga.getName());
        System.out.println(blaga.getGender());
        System.out.println(blaga.getEmail());

    }

}
