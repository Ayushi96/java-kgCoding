public class Format {

    public static String stringBuilder(){
        StringBuilder sb = new StringBuilder("First ");
        sb.append("UP");
        sb.append(32);
        sb.append(" Lucknow ");
        return sb.toString();
    }
    public static void main(String[] args) {
        int marks = 45;
        String name = "Sandeep";
        System.out.println("Hello " + name+",  your marks are "+ marks);
        System.out.printf("Hello %s, your marks are: %d ", name, marks);
        String text = stringBuilder();
        System.out.println(" text from string builder is "+ text);
    }

}
