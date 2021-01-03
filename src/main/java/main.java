public class main {
    public static void main(String[] args) {
        System.out.println(validatePin("1333a55"));
    }

    public static boolean validatePin(String pin) {
        return pin.matches("[0-9]+") && (pin.length() == 6 || pin.length() == 4);
    }

}
