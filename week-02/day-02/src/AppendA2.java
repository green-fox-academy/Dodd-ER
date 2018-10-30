public class AppendA2 {
    // - Create an array variable named `animals`
    //   with the following content: `["koal", "pand", "zebr"]`
    // - Add all elements an `"a"` at the end

    public static void main(String[] args){

        String[] animals = {"koal", "pand", "zebr"};

        for (String elements : animals) {
            System.out.println(elements + "a");
        }
    }

}
