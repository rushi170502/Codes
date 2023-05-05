
// nested switch..

class switchDemo{
    public static void main(String[] args) {
        String str1 = "Non-veg";

        switch (str1) {
            case "veg": {
                String str2 = "Starter";
                switch (str2) {

                    case "Starter":
                        System.out.println("Masala papad...");
                        break;
                    case "Main-Course":
                        System.out.println("Paneer Masala");
                        break;
                }

            }
            break;

            case "Non-veg": {
                String str2 = "Starter";
                switch (str2) {

                    case "Starter":
                        System.out.println("Papad...");
                        break;
                    case "Main-Course":
                        System.out.println("Chiken Masala");
                        break;
                }

            }
            break;
        }
    }
}