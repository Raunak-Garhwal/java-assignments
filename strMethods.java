public class strMethods{
    public static void main(String[] args) {
        System.out.println("\n---String Methods Program---");
        String name = "Virat Kohli";
        System.out.println("name = "+name);
        System.out.println("name.length() = "+name.length());
        System.out.println("name.toLowerCase() = "+name.toLowerCase());
        System.out.println("name.toUpperCase() = "+name.toUpperCase());
        System.out.println("name.trim() = "+name.trim());
        System.out.println("name.substring(6) = "+name.substring(6));
        System.out.println("name.substring(0,5) = "+name.substring(0,5));
        System.out.println("name.replace('V','K') = "+name.replace('V', 'K'));
        System.out.println("name.startsWith(\"Virat\") = "+name.startsWith("Virat"));
        System.out.println("name.endsWith(\"Kohli\") = "+name.endsWith("Kohli"));
        System.out.println("name.charAt(0) = "+name.charAt(0));
        System.out.println("name.indexOf(\"i\") = "+name.indexOf("i"));
        System.out.println("name.indexOf(\"i\",6) = "+name.indexOf("i",6));
        System.out.println("name.lastIndexOf(\"i\") = "+name.lastIndexOf("i"));
        System.out.println("name.equals(\"Virat Kohli\") = "+name.equals("Virat Kohli"));
        System.out.println("name.equalsIgnoreCase(\"virat kohli\") = "+name.equalsIgnoreCase("virat kohli"));
    }
}