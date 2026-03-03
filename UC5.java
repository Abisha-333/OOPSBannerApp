/**
 * OOPSBannerApp
 * UC5: Banner using Combined Array Declaration and Initialization
 * 
 * @author Abisha
 * @version 5.0
 */
public class OOPSBannerApp {

    public static void main(String[] args) {

        // Combined declaration + initialization
        String[] banner = {

                String.join("   ",
                        " ***** ",
                        " ***** ",
                        " ***** ",
                        " ***** "),

                String.join("   ",
                        "*     *",
                        "*     *",
                        "*     *",
                        "*     *"),

                String.join("   ",
                        "*     *",
                        "*     *",
                        "*     *",
                        "*     *"),

                String.join("   ",
                        "*     *",
                        " ***** ",
                        " ***** ",
                        " ***** "),

                String.join("   ",
                        "*     *",
                        "*",
                        "*",
                        "*"),

                String.join("   ",
                        "*     *",
                        "*",
                        "*",
                        "*"),

                String.join("   ",
                        " ***** ",
                        "*",
                        " ***** ",
                        "*")
        };

        // Enhanced for-loop to print banner
        for (String line : banner) {
            System.out.println(line);
        }
    }
}
